grammar HaveFun;

prog : (fun)? glob* com EOF;

fun : FUN ID LPAR (ID(',' ID)*)? RPAR LBRACE (com ';')? RETURN exp RBRACE  fun  # funDecl
    |                                                                           # empty
    ;

glob: GLOBAL ID ASSIGN exp SEMICOLON;

com : IF LPAR exp RPAR THEN LBRACE com RBRACE ELSE LBRACE com RBRACE    # if
    | (GLOBAL)? ID ASSIGN exp                                           # assign
    | (GLOBAL)? ID '.g' ASSIGN exp                                      # globAssign
    | GLOBAL ID ASSIGN exp                                              # globalVar
    | SKIPP                                                             # skip
    | com SEMICOLON com                                                 # seq
    | LBRACE com RBRACE ND LBRACE com RBRACE                            # nonDet
    | WHILE LPAR exp RPAR LBRACE com RBRACE                             # while
    | OUT LPAR exp RPAR                                                 # out
    | DOLLAR LBRACE MAINSTART arnCom MAINEND RBRACE DOLLAR              # arnold
    ;

exp : NAT                                 # nat
    | BOOL                                # bool
    | ID LPAR (exp(',' exp)*)? RPAR       # funAccess
    | LPAR exp RPAR                       # parExp
    | <assoc=right> exp POW exp           # pow
    | NOT exp                             # not
    | exp op=(DIV | MUL | MOD) exp        # divMulMod
    | exp op=(PLUS | MINUS) exp           # plusMinus
    | exp op=(LT | LEQ | GEQ | GT) exp    # cmpExp
    | exp op=(EQQ | NEQ) exp              # eqExp
    | exp op=(AND | OR) exp               # logicExp
    | ID                                  # id
    | ID '.g'                             # globalAccess
    ;

arnCom : ARNIF arnExp arnCom ARNELSE arnCom ARNIFEND                               # arnIf
       | 'HEY CHRISTMAS TREE' ID 'YOU SET US UP' arnExp                            # arnVarDecl
       | 'GET TO THE CHOPPER' ID 'HERE IS MY INVITATION' arnExp 'ENOUGH TALK'      # arnVarAssign
       | arnCom arnCom                                                             # arnComSeq
       | ARNWHILE arnExp arnCom ARNWHILEND                                         # arnWhile
       | ARNOUT arnExp                                                             # arnOut
       ;

arnExp :  ID                                                                                         # arnId
        | BOOLC                                                                                      # arnBool
        | DOUBLE                                                                                     # arnDuble
        | STRING                                                                                     # arnString
        | arnExp op=(ARNMUL | ARNDIV | ARNPLUS | ARNMINUS) arnExp                                    # arnOp
        | arnExp op=(ARNAND | ARNOR) arnExp                                                          # arnOrAnd
        | arnExp op=(ARNGT | ARNEQQ) arnExp                                                          # arnComp
        ;

FUN : 'fun' ;
RETURN : 'return' ;
ND : 'nd';

NAT : '0' | [1-9][0-9]* ;
BOOL : 'true' | 'false' ;

STRING : '"' STRCHR* '"' ;
fragment STRCHR : ~["\\] | ESC ;
fragment ESC : '\\' [btnfr"'\\] ;

PLUS  : '+' ;
MINUS : '-';
MUL   : '*' ;
DIV   : '/' ;
MOD   : 'mod' ;
POW   : '^' ;

AND : '&' ;
OR  : '|' ;

EQQ : '==' ;
NEQ : '!=' ;
LEQ : '<=' ;
GEQ : '>=' ;
LT  : '<' ;
GT  : '>' ;
NOT : '!' ;

IF     : 'if' ;
THEN   : 'then' ;
ELSE   : 'else' ;
WHILE  : 'while' ;
SKIPP  : 'skip' ;
ASSIGN : '=' ;
OUT    : 'out' ;

LPAR      : '(' ;
RPAR      : ')';
LBRACE    : '{' ;
RBRACE    : '}' ;
SEMICOLON : ';' ;

GLOBAL : 'global';

MAINSTART : 'IT\'S SHOWTIME';
MAINEND : 'YOU HAVE BEEN TERMINATED';
ARNOUT : 'TALK TO THE HAND';
DOLLAR : '$';
DOUBLE : NAT '.' NAT;
ARNIF : 'BECAUSE I\'M GOING TO SAY PLEASE';
ARNELSE : 'BULLSHIT';
ARNIFEND : 'YOU HAVE NO RESPECT FOR LOGIC';
ARNWHILE : 'STICK AROUND';
ARNWHILEND : 'CHILL';
BOOLC : '@I LIED' | '@NO PROBLEMO';
ARNGT : 'LET OFF SOME STEAM BENNET';
ARNEQQ : 'YOU ARE NOT YOU YOU ARE ME';
ARNOR : 'CONSIDER THAT A DIVORCE';
ARNAND : 'KNOCK KNOCK';
ARNMUL : 'YOU\'RE FIRED';
ARNDIV : 'HE HAD TO SPLIT';
ARNPLUS : 'GET UP';
ARNMINUS : 'GET DOWN';

ID : [a-zA-Z]+ NAT*;
WS : [ \t\r\n]+ -> skip ;
