// Generated from D:/scuola/uni/ANNO III/Linguaggi/arnoldc2/arnoldc/src/arnoldc.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link arnoldcParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface arnoldcVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link arnoldcParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(arnoldcParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code voidMethodDeclaration}
	 * labeled alternative in {@link arnoldcParser#method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoidMethodDeclaration(arnoldcParser.VoidMethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nonVoidMethodDeclaration}
	 * labeled alternative in {@link arnoldcParser#method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonVoidMethodDeclaration(arnoldcParser.NonVoidMethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link arnoldcParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(arnoldcParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by the {@code if}
	 * labeled alternative in {@link arnoldcParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(arnoldcParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code while}
	 * labeled alternative in {@link arnoldcParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(arnoldcParser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code voidMethodCall}
	 * labeled alternative in {@link arnoldcParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoidMethodCall(arnoldcParser.VoidMethodCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nonVoidMethodCall}
	 * labeled alternative in {@link arnoldcParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonVoidMethodCall(arnoldcParser.NonVoidMethodCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declareInt}
	 * labeled alternative in {@link arnoldcParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclareInt(arnoldcParser.DeclareIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link arnoldcParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(arnoldcParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code print}
	 * labeled alternative in {@link arnoldcParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(arnoldcParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nat}
	 * labeled alternative in {@link arnoldcParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNat(arnoldcParser.NatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bool}
	 * labeled alternative in {@link arnoldcParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(arnoldcParser.BoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code string}
	 * labeled alternative in {@link arnoldcParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(arnoldcParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicOp}
	 * labeled alternative in {@link arnoldcParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicOp(arnoldcParser.LogicOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code matchOp}
	 * labeled alternative in {@link arnoldcParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatchOp(arnoldcParser.MatchOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arithmOp}
	 * labeled alternative in {@link arnoldcParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmOp(arnoldcParser.ArithmOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id}
	 * labeled alternative in {@link arnoldcParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(arnoldcParser.IdContext ctx);
}