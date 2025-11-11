grammar arnoldc;

prog : (method)* main EOF ;

method: DECLAREMETHOD ID (METHODARGUMENTS ID)* (com)* ENDMETHODDECLARATION                               # voidMethodDeclaration
      | DECLAREMETHOD ID (METHODARGUMENTS ID)* NONVOIDMETHOD (com)* RETURN exp ENDMETHODDECLARATION      # nonVoidMethodDeclaration
      ;

main : BEGINMAIN (com)* ENDMAIN ;

com : IF exp (com)* ELSE (com)* ENDIF                           # if
    | WHILE exp (com)* ENDWHILE                                 # while
    | CALLMETHOD ID (exp)*                                      # voidMethodCall
    | ASSIGNVARIABLEFROMMETHODCALL ID CALLMETHOD ID (exp)*      # nonVoidMethodCall
    | DECLAREINT ID SETINITIALVALUE exp                         # declareInt
    | ASSIGNVARIABLE ID SETVALUE exp ENDASSIGNVARIABLE          # assign
    | PRINT exp                                                 # print
    ;

exp : NAT                                                    # nat
    | BOOL                                                   # bool
    | ID                                                     # id
    | STRING                                                 # string
    | exp op = ( DIVISIONOPERATOR
               | MULTIPLICATIONOPERATOR
               | MODULOOPERATOR
               | PLUSOPERATOR
               | MINUSOPERATOR
               ) exp                                         # arithmOp
    | exp op = (AND | OR) exp                                # logicOp
    | exp op = (EQUALTO | GREATERTHAN) exp                   # matchOp
    ;


FALSE : 'I LIED';
TRUE : 'NO PROBLEMO';

IF : 'BECAUSE I\'M GOING TO SAY PLEASE';
ELSE : 'BULLSHIT';
ENDIF : 'YOU HAVE NO RESPECT FOR LOGIC';

WHILE : 'STICK AROUND';
ENDWHILE : 'CHILL';

PLUSOPERATOR : 'GET UP';
MINUSOPERATOR : 'GET DOWN';
MULTIPLICATIONOPERATOR : 'YOU\'RE FIRED';
DIVISIONOPERATOR : 'HE HAD TO SPLIT';
MODULOOPERATOR : 'I LET HIM GO';

EQUALTO : 'YOU ARE NOT YOU YOU ARE ME';
GREATERTHAN : 'LET OFF SOME STEAM BENNET';

OR : 'CONSIDER THAT A DIVORCE';
AND : 'KNOCK KNOCK';

DECLAREMETHOD : 'LISTEN TO ME VERY CAREFULLY';
NONVOIDMETHOD : 'GIVE THESE PEOPLE AIR';
METHODARGUMENTS : 'I NEED YOUR CLOTHES YOUR BOOTS AND YOUR MOTORCYCLE';
RETURN : 'I\'LL BE BACK';
ENDMETHODDECLARATION : 'HASTA LA VISTA, BABY';
CALLMETHOD : 'DO IT NOW';

ASSIGNVARIABLEFROMMETHODCALL : 'GET YOUR ASS TO MARS';
DECLAREINT : 'HEY CHRISTMAS TREE';
SETINITIALVALUE : 'YOU SET US UP';

BEGINMAIN : 'IT\'S SHOWTIME';
ENDMAIN : 'YOU HAVE BEEN TERMINATED';

PRINT : 'TALK TO THE HAND';

ASSIGNVARIABLE : 'GET TO THE CHOPPER';
SETVALUE : 'HERE IS MY INVITATION';
ENDASSIGNVARIABLE : 'ENOUGH TALK';


NAT : '0' | [1-9][0-9]* ;
BOOL : '@'(TRUE | FALSE);
ID : [a-zA-Z0-9]+ ;
STRING : '"' STRCHR* '"' ;
fragment STRCHR : ~ ["\\] | ESC ;
fragment ESC : '\\' [btnfr"'\\] ;

WS : [ \t\r\n]+ -> skip ;