lexer grammar test1;

options {
  language = Java;
}

/*----------------------*/
/*   Reserved Keywords  */
/*----------------------*/
INT_TYPE  : 'int';
CHAR_TYPE : 'char';
VOID_TYPE : 'void';
FLOAT_TYPE: 'float';
INCLUDE_TYPE: '#include <'(LETTER|DIGIT)*'.h>';
PRINTF_TYPE:'printf';
SCANF_TYPE :'scanf';
MAIN_TYPE : 'mian';
RETURN_TYPE:'return';

/*----------------------*/
/* program control flow */
/*----------------------*/

WHILE_TYPE : 'while';
FOR_TYPE  : 'for';
IF_TYPE   : 'if';
ELSE_TYPE : 'else';
BREAK_TYPE : 'break';
CON_TYPE : 'continue';
SWTICH_TYPE : 'swtich';
CASE_TYPE : 'case '(ID |DIGIT) ':';
DEFAULT_TYPE : 'default:';

/*----------------------*/
/*   Data type  */
/*----------------------*/

STRING_TYPE :  '"' ~('\r' | '\n' | '"')* '"' ;
DEC_NUM : ('0' | ('1'..'9')(DIGIT)*);


ID : (LETTER)(LETTER | DIGIT)*;

FLOAT_NUM: FLOAT_NUM1 | FLOAT_NUM2 | FLOAT_NUM3;
fragment FLOAT_NUM1: (DIGIT)+'.'(DIGIT)*;
fragment FLOAT_NUM2: '.'(DIGIT)+;
fragment FLOAT_NUM3: (DIGIT)+;
fragment LETTER : 'a'..'z' | 'A'..'Z' | '_';
fragment DIGIT : '0'..'9';


/*----------------------*/
/* Comments */
/*----------------------*/
COMMENT1 : '//'(.)*'\n';
COMMENT2 : '/*' (options{greedy=false;}: .)* '*/';







/*----------------------*/
/*  Compound Operators  */
/*----------------------*/

EQ_OP : '==';
LE_OP : '<=';
GE_OP : '>=';
NE_OP : '!=';
PP_OP : '++';
MM_OP : '--'; 
Less_than_OP : '<';
More_than_OP: '>';

RSHIFT_OP : '<<';
LSHIFT_OP : '>>';
ADDRESS_OP : '&';
POINTER_OP : '*(ID)';

T_Left_parenthesis : '(';
T_Right_parenthesis : ')';
T_Left_brace : '{';
T_Righ_brace : '}';

T_ASSIGNMENT :	'=';
T_ADD :	'+';
T_SUB :	'-';
T_MUL :	'*';
T_DIV :	'/';

/*----------------------*/
/*  COMMA  */
/*----------------------*/

T_COMMA :	',';
T_SEMICOLON :	';';

NEW_LINE: '\n';
WS  : (' '|'\r'|'\t'|'\n'|'\r\n');
