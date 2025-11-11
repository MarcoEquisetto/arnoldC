import value.*;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

public class arnoldc extends arnoldcBaseVisitor<Value> {

    private final Conf conf;

    private final HashMap<String, arnoldcParser.VoidMethodDeclarationContext> voidFunctions = new HashMap<>();
    private final HashMap<String, arnoldcParser.NonVoidMethodDeclarationContext> nonVoidFunctions = new HashMap<>();
    private final HashMap<String, List<String>> params = new HashMap<>();
    private final HashMap<String, arnoldcParser.ExpContext> result = new HashMap<>();

    public arnoldc(Conf conf) {
        this.conf = conf;
    }

    @Override
    public Value visitProg(arnoldcParser.ProgContext ctx) {
        for(arnoldcParser.MethodContext method: ctx.method()){
            visitMethod(method);
        }
        return visitMain(ctx.main());
    }

    private ComValue visitCom(arnoldcParser.ComContext ctx) {
        return (ComValue) visit(ctx);
    }

    private ExpValue<?> visitExp(arnoldcParser.ExpContext ctx) {
        return (ExpValue<?>) visit(ctx);
    }

    private int visitNatExp(arnoldcParser.ExpContext ctx) {
        try {
            return ((NatValue) visitExp(ctx)).toJavaValue();
        } catch (ClassCastException e) {
            System.err.println("Type mismatch exception!");
            System.err.print("@" + ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine() + " : ");
            System.err.print(ctx.getText());
            System.err.println(" : Natural expression expected.");
            System.exit(1);
        }

        return 0;
    }

    private boolean visitBoolExp(arnoldcParser.ExpContext ctx) {
        try {
            return ((BoolValue) visitExp(ctx)).toJavaValue();
        } catch (ClassCastException e) {
            System.err.println("Type mismatch exception!");
            System.err.print("@" + ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine() + " : ");
            System.err.print(ctx.getText());
            System.err.println(" : Boolean expression expected.");
            System.exit(1);
        }

        return false;
    }

    public ComValue visitMethod(arnoldcParser.MethodContext ctx) {
        return (ComValue) visit(ctx);
    }

    @Override
    public Value visitVoidMethodDeclaration(arnoldcParser.VoidMethodDeclarationContext ctx) {
        String id = ctx.ID(0).getText();
        voidFunctions.put(id, ctx);
        List<String> paramList = new ArrayList<>();

        for (int i = 1; i < ctx.ID().size(); i++) {
            String param = ctx.ID().get(i).getText();
            paramList.add(param);
        }

        params.put(id,paramList);

        return ComValue.INSTANCE;
    }

    @Override
    public Value visitNonVoidMethodDeclaration(arnoldcParser.NonVoidMethodDeclarationContext ctx) {
        String id = ctx.ID(0).getText();
        nonVoidFunctions.put(id, ctx);
        List<String> paramList = new ArrayList<>();

        for (int i = 1; i < ctx.ID().size(); i++) {
            String param = ctx.ID().get(i).getText();
            paramList.add(param);
        }

        params.put(id,paramList);
        result.put(id,ctx.exp());

        return ComValue.INSTANCE;
    }

    @Override
    public Value visitMain(arnoldcParser.MainContext ctx) {
        for (int i = 0; i < ctx.com().size(); i++) {
            visit(ctx.com(i));
        }

        return ComValue.INSTANCE;
    }

    @Override
    public Value visitVoidMethodCall(arnoldcParser.VoidMethodCallContext ctx) {
        int index = 0;
        String id = ctx.ID().getText();
        List<String> paramList = params.get(id);

        for (int i = 0; i < ctx.exp().size(); i++, index++) {
            conf.update(paramList.get(index), visitExp(ctx.exp(i)));
        }

        for (int i = 0; i < voidFunctions.get(id).com().size(); i++)
            visitCom(voidFunctions.get(id).com(i));

        for (String param : paramList) {
            conf.remove(param);
        }

        return ComValue.INSTANCE;
    }

    @Override
    public Value visitNonVoidMethodCall(arnoldcParser.NonVoidMethodCallContext ctx) {
        int index = 0;
        String function = ctx.ID(1).getText();
        String variable = ctx.ID(0).getText();
        List<String> paramList = params.get(function);

        for (int i = 0; i < ctx.exp().size(); i++, index++) {
            conf.update(paramList.get(index), visitExp(ctx.exp(i)));
        }

        for (int i = 0; i < nonVoidFunctions.get(function).com().size(); i++)
            visitCom(nonVoidFunctions.get(function).com(i));

        conf.update(variable, visitExp(result.get(function)));

        for (String param : paramList) {
            conf.remove(param);
        }

        return ComValue.INSTANCE;
    }

    @Override
    public ComValue visitIf(arnoldcParser.IfContext ctx) {
        if (visitBoolExp(ctx.exp())) {
            for(int i = 0; i < ctx.getChildCount(); i++){
                if(ctx.getChild(i).getText().equals("BULLSHIT"))
                    break;
                if(ctx.getChild(i) instanceof arnoldcParser.ComContext)
                    visitCom((arnoldcParser.ComContext) ctx.getChild(i));
            }
        } else {
            boolean flag = false;

            for(int i = 0; i < ctx.getChildCount(); i++){
                if(ctx.getChild(i).getText().equals("BULLSHIT")) {
                    flag = true;
                    i++;
                }
                if(flag && ctx.getChild(i) instanceof arnoldcParser.ComContext) {
                    visitCom((arnoldcParser.ComContext) ctx.getChild(i));
                }
            }
        }

        return ComValue.INSTANCE;
    }

    @Override
    public ComValue visitDeclareInt(arnoldcParser.DeclareIntContext ctx) {
        String id = ctx.ID().getText();
        ExpValue<?> v = visitExp(ctx.exp());

        conf.update(id, v);

        return ComValue.INSTANCE;
    }

    @Override
    public ComValue visitWhile(arnoldcParser.WhileContext ctx) {
        if (!visitBoolExp(ctx.exp()))
            return ComValue.INSTANCE;

        for (int i = 0; i < ctx.com().size(); i++)
            visitCom(ctx.com(i));

        return visitWhile(ctx);
    }

    @Override
    public ComValue visitAssign(arnoldcParser.AssignContext ctx) {
        String id = ctx.ID().getText();
        ExpValue<?> v = visitExp(ctx.exp());

        try {
            conf.get(id);
        } catch (Exception e) {
            System.out.println("Variable never declared");
            System.exit(1);
        }

        conf.update(id, v);

        return ComValue.INSTANCE;
    }

    @Override
    public ComValue visitPrint(arnoldcParser.PrintContext ctx) {
        System.out.println(visitExp(ctx.exp()));
        return ComValue.INSTANCE;
    }

    @Override
    public NatValue visitNat(arnoldcParser.NatContext ctx) {
        return new NatValue(Integer.parseInt(ctx.NAT().getText()));
    }

    @Override
    public BoolValue visitBool(arnoldcParser.BoolContext ctx) {
        return new BoolValue(ctx.BOOL().getText().equals("@NO PROBLEMO"));
    }

    @Override
    public ExpValue<?> visitId(arnoldcParser.IdContext ctx) {
        String id = ctx.ID().getText();

        if (!conf.contains(id)) {
            System.err.println("Variable " + id + " used but never instantiated");
            System.err.println("@" + ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine());

            System.exit(1);
        }

        return conf.get(id);
    }

    @Override
    public StringValue visitString(arnoldcParser.StringContext ctx) {
        String rawString = ctx.STRING().getText();
        String unescapedString = StringValue.unescapeString(rawString.substring(1, rawString.length() - 1));
        return new StringValue(unescapedString);
    }

    @Override
    public NatValue visitArithmOp(arnoldcParser.ArithmOpContext ctx) {
        int left = visitNatExp(ctx.exp(0));
        int right = visitNatExp(ctx.exp(1));

        return switch (ctx.op.getType()) {
            case arnoldcParser.DIVISIONOPERATOR -> new NatValue(left / right);
            case arnoldcParser.MULTIPLICATIONOPERATOR -> new NatValue(left * right);
            case arnoldcParser.MODULOOPERATOR -> new NatValue(left % right);
            case arnoldcParser.PLUSOPERATOR -> new NatValue(left + right);
            case arnoldcParser.MINUSOPERATOR -> new NatValue(left - right);
            default -> null;
        };
    }

    @Override
    public BoolValue visitLogicOp(arnoldcParser.LogicOpContext ctx) {
        boolean left = visitBoolExp(ctx.exp(0));
        boolean right = visitBoolExp(ctx.exp(1));

        return switch (ctx.op.getType()) {
            case arnoldcParser.AND -> new BoolValue(left && right);
            case arnoldcParser.OR -> new BoolValue(left || right);
            default -> null;
        };
    }

    @Override
    public BoolValue visitMatchOp(arnoldcParser.MatchOpContext ctx) {
        int left = visitNatExp(ctx.exp(0));
        int right = visitNatExp(ctx.exp(1));

        return switch (ctx.op.getType()) {
            case arnoldcParser.EQUALTO -> new BoolValue(left == right);
            case arnoldcParser.GREATERTHAN -> new BoolValue(left > right);
            default -> null;
        };
    }
}
