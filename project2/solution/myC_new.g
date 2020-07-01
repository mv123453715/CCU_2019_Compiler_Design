grammar myC_new;

options {
   language = Java;
}

@header {
    // import packages here.
}

@members {
    boolean TRACEON = true;
}


program:(INCLUDE_TYPE)* (main_start|fun)  {if (TRACEON) System.out.println("program:(INCLUDE_TYPE )* main_start");};

fun: type Identifier '('  (type Identifier ','?)* ')' '{' declarations statements return_end '}' (fun|main_start) {if (TRACEON) System.out.println("fun: type Identifier ( (type Identifier ',')* ) { declarations statements return_end } (fun|main_start)");}
    ;

main_start:VOID MAIN '(' ')' '{' declarations statements return_end? '}'
        {if (TRACEON) System.out.println("VOID MAIN () {declarations statements return_end?}");}
        ;

declarations:type Identifier ';' declarations{ if (TRACEON) System.out.println("declarations: type Identifier : declarations"); }
           |type Identifier '=' (Integer_constant|Floating_point_constant|STRING_TYPE) ';' declarations{ if (TRACEON) System.out.println("type Identifier '=' (Integer_constant|Floating_point_constant|STRING_TYPE) ';' declarations"); }
           | { if (TRACEON) System.out.println("declarations: ");} 
           ;

type:INT { if (TRACEON) System.out.println("type: INT"); }
   | FLOAT {if (TRACEON) System.out.println("type: FLOAT"); }
   | DOUBLE {if (TRACEON) System.out.println("type: DOUBLE"); }
   | CHAR {if (TRACEON) System.out.println("type: CHAR"); }
   | INT'*' { if (TRACEON) System.out.println("type: INT*"); }
   | FLOAT'*' {if (TRACEON) System.out.println("type: FLOAT*"); }
   | DOUBLE'*' {if (TRACEON) System.out.println("type: DOUBLE*"); }
   | CHAR'*' {if (TRACEON) System.out.println("type: CHAR*"); }
   
   ;

return_end:RETURN_TYPE (Integer_constant ';'{ if (TRACEON) System.out.println("return_end:RETURN_TYPE Integer_constant ;"); }
          |Floating_point_constant ';'{ if (TRACEON) System.out.println("return_end:RETURN_TYPE Floating_point_constant ;"); }
          |Identifier ';'{ if (TRACEON) System.out.println("return_end:RETURN_TYPE Identifier ;"); })
          ;

   
statements:statement statements
        |;


comparison_expression: Identifier '>=' Integer_constant {if (TRACEON) System.out.println("comparison_expression: Identifier >= Integer_constant"); }
                      |Identifier '==' Integer_constant {if (TRACEON) System.out.println("comparison_expression: Identifier == Integer_constant"); }
                      |Identifier '<=' Integer_constant {if (TRACEON) System.out.println("comparison_expression: Identifier <= Integer_constant"); }
                      |Identifier '!=' Integer_constant {if (TRACEON) System.out.println("comparison_expression: Identifier != Integer_constant"); }
                      |Identifier '>' Integer_constant {if (TRACEON) System.out.println("comparison_expression: Identifier > Integer_constant"); }
                      |Identifier '<' Integer_constant {if (TRACEON) System.out.println("comparison_expression: Identifier < Integer_constant"); }
                      |Integer_constant '>=' Identifier {if (TRACEON) System.out.println("comparison_expression: Integer_constant >= Identifier"); }
                      |Integer_constant '==' Identifier {if (TRACEON) System.out.println("comparison_expression: Integer_constant == Identifier"); }
                      |Integer_constant '<=' Identifier {if (TRACEON) System.out.println("comparison_expression: Integer_constant <= Identifier"); }
                      |Integer_constant '!=' Identifier {if (TRACEON) System.out.println("comparison_expression: Integer_constant != Identifier"); }
                      |Integer_constant '>' Identifier {if (TRACEON) System.out.println("comparison_expression: Integer_constant > Identifier"); }
                      |Integer_constant '<' Identifier {if (TRACEON) System.out.println("comparison_expression: Integer_constant < Identifier"); }
                      |Identifier '>=' Identifier {if (TRACEON) System.out.println("comparison_expression: Identifier >= Identifier"); }
                      |Identifier '==' Identifier {if (TRACEON) System.out.println("comparison_expression: Identifier == Identifier"); }
                      |Identifier '<=' Identifier {if (TRACEON) System.out.println("comparison_expression: Identifier <= Identifier"); }
                      |Identifier '!=' Identifier {if (TRACEON) System.out.println("comparison_expression: Identifier != Identifier"); }
                      |Identifier '>' Identifier {if (TRACEON) System.out.println("comparison_expression: Identifier > Identifier"); }
                      |Identifier '<' Identifier {if (TRACEON) System.out.println("comparison_expression: Identifier < Identifier"); }

                      ;

incre_decre_expression:Identifier '++'  {if (TRACEON) System.out.println("incre_decre_expression:Identifier ++"); }
                      |Identifier '--'  {if (TRACEON) System.out.println("incre_decre_expression:Identifier --"); }
                      |'++' Identifier   {if (TRACEON) System.out.println("incre_decre_expression:++ Identifier "); }
                      |'--' Identifier   {if (TRACEON) System.out.println("incre_decre_expression:Identifier "); }
                      ;


arith_expression: multExpr
                  ( '+' multExpr {if (TRACEON) System.out.println("arith_expression: multExpr +"); }
				  | '-' multExpr {if (TRACEON) System.out.println("arith_expression: multExpr -"); }
          )*
                  ;

multExpr: signExpr
          ( '*' signExpr {if (TRACEON) System.out.println("multExpr: signExpr * "); }
          | '/' signExpr {if (TRACEON) System.out.println("multExpr: signExpr / "); }
          | '%' signExpr {if (TRACEON) System.out.println("multExpr: signExpr \% "); }
		  )*
		  ;

signExpr: primaryExpr {if (TRACEON) System.out.println("signExpr: primaryExpr"); }
        | '-' primaryExpr {if (TRACEON) System.out.println("signExpr: primaryExpr -"); }
		;
		  
primaryExpr: Integer_constant {if (TRACEON) System.out.println("primaryExpr: Integer_constant"); }
           | Floating_point_constant {if (TRACEON) System.out.println("primaryExpr: Floating_point_constant"); }
           | Identifier {if (TRACEON) System.out.println("primaryExpr: Identifier"); }
 		   | '(' arith_expression ')' {if (TRACEON) System.out.println("\'(\' arith_expression \')\'"); }
           ;

overloaded_op: Identifier ('+=' (Identifier))+ {if (TRACEON) System.out.println("Identifier (\'+=\' (Identifier))+"); }
              |Identifier ('-=' (Identifier))+ {if (TRACEON) System.out.println("Identifier (\'-=\' (Identifier))+"); }
              |Identifier ('/=' (Identifier))+ {if (TRACEON) System.out.println("Identifier (\'/=\' (Identifier))+"); }
              |Identifier ('*=' (Identifier))+ {if (TRACEON) System.out.println("Identifier (\'*=\' (Identifier))+"); }
              |Identifier ('%=' (Identifier))+ {if (TRACEON) System.out.println("Identifier (\'\%=\' (Identifier))+"); }
              ;






statement: Identifier '=' arith_expression ';'  {if (TRACEON) System.out.println("statement: Identifier \'=\' arith_expression \';\'"); }
         | overloaded_op ';' {if (TRACEON) System.out.println("statement: overloaded_op ;"); }
         | Identifier '=' '&' Identifier ';'  {if (TRACEON) System.out.println("statement: Identifier \'=\' \'&\' Identifier ;"); }
         | IF '(' (arith_expression|comparison_expression|incre_decre_expression) ')' if_then_statements  {if (TRACEON) System.out.println("statement: IF \'(\' (arith_expression|comparison_expression|incre_decre_expression) \')\' if_then_statements"); }
         | ELSE  else_statements  {if (TRACEON) System.out.println("statement: (ELSE  else_statements)?"); }
         | WHILE '(' (arith_expression|comparison_expression|incre_decre_expression) ')' while_statements  {if (TRACEON) System.out.println("statement: WHILE \'(\' (arith_expression|comparison_expression|incre_decre_expression) \')\' while_statements"); }
         | FOR '(' declarations (arith_expression|comparison_expression) ';' (Identifier '=' arith_expression|incre_decre_expression) ')' for_statements  {if (TRACEON) System.out.println("FOR ( declarations (arith_expression|comparison_expression) ; (Identifier '=' arith_expression|incre_decre_expression) ) for_statements"); }
         | PRINTF  printf_statement  {if (TRACEON) System.out.println("statement: PRINTF  printf_statement"); }
         | SCANF  scanf_statement  {if (TRACEON) System.out.println("statement: SCANF  scanf_statement"); }
         | BREAK ';' {if (TRACEON) System.out.println("statement: BREAK ;"); }
         | CONTINUE ';' {if (TRACEON) System.out.println("statement: CONTINUE ;"); }
         | SWITCH '(' (arith_expression|comparison_expression) ')' swtich_statments {if (TRACEON) System.out.println("statement: SWITCH ( (arith_expression|comparison_expression) ) swtich_statments"); }
         | CASE (Integer_constant|Floating_point_constant) ':' statement {if (TRACEON) System.out.println("statement : CASE (Integer_constant|Floating_point_constant) : statement"); }
         | DEFAULT ':' statement {if (TRACEON) System.out.println("statement : DEFAULT : statement"); }
         | incre_decre_expression ';' {if (TRACEON) System.out.println("statement : incre_decre_expression"); }
         | fun_call_statement ';' {if (TRACEON) System.out.println("statement : fun_call_statement ; "); }
		 ;

fun_call_statement : Identifier '('(Identifier ','? )*')' {if (TRACEON) System.out.println("fun_call_statement : Identifier (Identifier ,)*"); }
          ;

if_then_statements: statement {if (TRACEON) System.out.println("if_then_statements: statement"); }
                  | '{' statements '}' {if (TRACEON) System.out.println("if_then_statements: \'{\' statements \'}\'"); }
				  ;


while_statements: statement {if (TRACEON) System.out.println("while_statements: statement"); }
                  | '{' statements '}' {if (TRACEON) System.out.println("while_statements: \'{\' statements \'}\'"); }
				  ;
             
for_statements: statement {if (TRACEON) System.out.println("for_statements: statement"); }
              | '{' statements '}' {if (TRACEON) System.out.println("for_statements: \'{\' statements \'}\'"); }
				  ;      

else_statements : statement {if (TRACEON) System.out.println("else_statements :statement"); }
                  | '{' statements '}' {if (TRACEON) System.out.println("else_statements: \'{\' statements \'}\'"); }
				  ;     
                  
else_if_statements:statement {if (TRACEON) System.out.println("else_if_statements :statement"); }
                  | '{' statements '}' {if (TRACEON) System.out.println("else_if_statements: \'{\' statements \'}\'"); }
				  ;     
    
swtich_statments :  '{' statements '}' {if (TRACEON) System.out.println("swtich_statments :  { statements }"); }
          ;

          
printf_statement : '('  STRING_TYPE (',' Identifier)* ')' ';' {if (TRACEON) System.out.println("printf_statement : \'(\' statement STRING_TYPE (\',\' Identifier)* \')\'"); }
				  ;   
scanf_statement : '('  STRING_TYPE (',' Identifier)* ')' ';' {if (TRACEON) System.out.println("scanf_statement : \'(\' statement STRING_TYPE (\',\' Identifier)* \')\'"); }
				  ;           
		   
/*Reserved Keywords */
STRING_TYPE :  '"' ~('\r' | '\n' | '"')* '"' ;
CHAR : 'char';
PRINTF:'printf';
SCANF :'scanf';
RETURN_TYPE:'return';
DOUBLE:'double';
FLOAT:'float';
INT:'int';
MAIN: 'main';
VOID: 'void';
IF: 'if';
ELSE: 'else';
WHILE: 'while';
FOR: 'for';
SWITCH: 'switch';
CASE: 'case';
DEFAULT: 'default';
BREAK: 'break';
CONTINUE : 'continue';






WS:( ' ' | '\t' | '\r' | '\n' ) {$channel=HIDDEN;};
Identifier:('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;
Integer_constant:'0'..'9'+;
Floating_point_constant:'0'..'9'+ '.' '0'..'9'+;


COMMENT:'/*' .* '*/' {$channel=HIDDEN;};





INCLUDE_TYPE: '#include <'('a'..'z' | 'A'..'Z' | '_'|'0'..'9')*'.h>';




