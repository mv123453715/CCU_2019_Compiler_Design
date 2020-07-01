grammar myChecker;

@header {
    // import packages here.
    import java.util.HashMap;
}

@members {
    boolean TRACEON = true;
    HashMap<String,Integer> symtab = new HashMap<String,Integer>();

	/*
    public enum TypeInfo {
        Integer,
		Float,
		Unknown,
		No_Exist,
		Error
    }
    */

    /* attr_type:
       1 => integer,
       2 => float,
       3=>double,
       4=>char,
       5=>bool,
       6=> int pointer,
       7=> float pointer,
       8=> double pointer,
       9=> char pointer,
       
       -1 => do not exist,
       -2 => error
     */	   
}

program:(INCLUDE_TYPE)* (main_start|fun)  {if (TRACEON) System.out.println("program:(INCLUDE_TYPE )* main_start");};

fun: type Identifier '('  (type Identifier ','?)* ')' '{' declarations statements return_end '}' (fun|main_start) {if (TRACEON) System.out.println("fun: type Identifier ( (type Identifier ',')* ) { declarations statements return_end } (fun|main_start)");}
    ;

main_start:VOID MAIN '(' ')' '{' declarations statements return_end? '}'
        {if (TRACEON) System.out.println("VOID MAIN () {declarations statements return_end?}");}
        ;
return_end:RETURN_TYPE (Integer_constant ';'{ if (TRACEON) System.out.println("return_end:RETURN_TYPE Integer_constant ;"); }
          |Floating_point_constant ';'{ if (TRACEON) System.out.println("return_end:RETURN_TYPE Floating_point_constant ;"); }
          |Identifier ';'{ if (TRACEON) System.out.println("return_end:RETURN_TYPE Identifier ;"); })
          ;

declarations
	: type Identifier ';' declarations
     {
	   if (TRACEON) System.out.println("declarations: type Identifier : declarations");
	 
  	   if (symtab.containsKey($Identifier.text)) {
		   System.out.println("Type Error: " + 
				              $Identifier.getLine() + 
							  ": Redeclared identifier.");
	   } else {
		   /* Add ID and its attr_type into the symbol table. */
		   symtab.put($Identifier.text, $type.attr_type);	   
	   }
	 }
  |type Identifier '=' (Integer_constant|Floating_point_constant|STRING_TYPE) ';' declarations
  { if (TRACEON) System.out.println("type Identifier '=' (Integer_constant|Floating_point_constant|STRING_TYPE) ';' declarations");
  if (symtab.containsKey($Identifier.text)) {
		   System.out.println("Type Error: " + 
				              $Identifier.getLine() + 
							  ": Redeclared identifier.");
	   } else {
		   /* Add ID and its attr_type into the symbol table. */
		   symtab.put($Identifier.text, $type.attr_type);	   
	   }
  }
	| { if (TRACEON) System.out.println("declarations: "); }
	;

type returns [int attr_type]
	:INT    { if (TRACEON) System.out.println("type: INT");  $attr_type = 1;  }//if
	| FLOAT { if (TRACEON) System.out.println("type: FLOAT");  $attr_type = 2;   }
  | DOUBLE {if (TRACEON) System.out.println("type: DOUBLE"); $attr_type = 3; }
  | CHAR {if (TRACEON) System.out.println("type: CHAR");$attr_type = 4;  }
  | BOOL {if (TRACEON) System.out.println("type: CHAR");$attr_type = 5;  }
  | INT'*' { if (TRACEON) System.out.println("type: INT*");$attr_type = 6; }
  | FLOAT'*' {if (TRACEON) System.out.println("type: FLOAT*");$attr_type = 7; }
  | DOUBLE'*' {if (TRACEON) System.out.println("type: DOUBLE*");$attr_type = 8; }
  | CHAR'*' {if (TRACEON) System.out.println("type: CHAR*");$attr_type = 9; }
	;

statements
	:statement statements
	|;

arith_expression returns [int attr_type]
	: a = multExpr { $attr_type = $a.attr_type; }
      ( '+' b = multExpr
	    { if ($a.attr_type != $b.attr_type) {
			  System.out.println("Type Error: " + 
				                 $a.start.getLine() + 
						         ": Type mismatch a is " + $a.attr_type + ",b is " +$b.attr_type + "for the operator + in an expression.");
		      $attr_type = -2;
		  }//if
      else {
          //System.out.println( "$a.attr_type == $b.attr_type , " + "$attr_type : " + $attr_type + ",$a.attr_type : " + $a.attr_type  );
          $attr_type =$a.attr_type;
          //return $a.attr_type;
      }//else
        }
	  | '-' c = multExpr 
     { if ($a.attr_type != $c.attr_type) {
			  System.out.println("Type Error: " + 
				                 $a.start.getLine() +
						         ": Type mismatch a is " + $a.attr_type + ",b is " +$b.attr_type + "for the operator - in an expression.");
		      $attr_type = -2;
		  }//if
      else {
          $attr_type =$a.attr_type;
          //if ( true ) return $attr_type;
      }//else
        }
	  )*
	;

multExpr returns [int attr_type]
	: a = signExpr { $attr_type = $a.attr_type; }
      ( '*' b = signExpr
      { if ($a.attr_type != $b.attr_type) {
			  System.out.println("Type Error: " + 
				                 $a.start.getLine() +
						         ": Type mismatch a is " + $a.attr_type + ",b is " +$b.attr_type + "for the operator * in an expression.");
		      $attr_type = -2;
		  }
        }
      | '/' c = signExpr
      { if ($a.attr_type != $c.attr_type) {
			  System.out.println("Type Error: " + 
				                 $a.start.getLine() +
						         ": Type mismatch a is " + $a.attr_type + ",b is " +$b.attr_type + "for the operator / in an expression.");
		      $attr_type = -2;
		  }
        }
	  )*
	;





signExpr returns [int attr_type]
	: primaryExpr { $attr_type = $primaryExpr.attr_type; }
	| '-' primaryExpr
	;
		  
primaryExpr returns [int attr_type] 
	: Integer_constant        { $attr_type = 1; }
	| Floating_point_constant { $attr_type = 2; }
	| Identifier {  $attr_type = symtab.get($Identifier.text); }
	| '(' arith_expression ')' { $attr_type = $arith_expression.attr_type; }
    ;

overloaded_op returns [int attr_type]  
  : Identifier '+=' arith_expression {if (TRACEON) System.out.println("Identifier (\'+=\' arith_expression"); 
  if (symtab.containsKey($Identifier.text)) {
	       $attr_type = symtab.get($Identifier.text);
	   } else {
          System.out.println("Type Error: " + $arith_expression.start.getLine() +": Type mismatch for the two silde operands in an assignment statement.");
	       $attr_type = -2;
		   return $attr_type;
	   }
		
	   if ($attr_type != $arith_expression.attr_type) {
            //System.out.println( "$attr_type: " + $attr_type+ ", $arith_expression.attr_type : " + $arith_expression.attr_type);
            System.out.println("Type Error: " + 
				              $arith_expression.start.getLine() +
						      ": Type mismatch for the two silde operands in an assignment statement.");
		   $attr_type = -2;
     return $attr_type;
    }}
  |Identifier '-=' arith_expression {if (TRACEON) System.out.println("Identifier (\'-=\' arith_expression"); 
  if (symtab.containsKey($Identifier.text)) {
	       $attr_type = symtab.get($Identifier.text);
	   } else {
          System.out.println("Type Error: " + $arith_expression.start.getLine() +": Type mismatch for the two silde operands in an assignment statement.");
	       $attr_type = -2;
		   return $attr_type;
	   }
		
	   if ($attr_type != $arith_expression.attr_type) {
            //System.out.println( "$attr_type: " + $attr_type+ ", $arith_expression.attr_type : " + $arith_expression.attr_type);
            System.out.println("Type Error: " + 
				              $arith_expression.start.getLine() +
						      ": Type mismatch for the two silde operands in an assignment statement.");
		   $attr_type = -2;
     return $attr_type;
    }}
  |Identifier '/=' arith_expression {if (TRACEON) System.out.println("Identifier (\'/=\' arith_expression"); 
  if (symtab.containsKey($Identifier.text)) {
	       $attr_type = symtab.get($Identifier.text);
	   } else {
          System.out.println("Type Error: " + $arith_expression.start.getLine() +": Type mismatch for the two silde operands in an assignment statement.");
	       $attr_type = -2;
		   return $attr_type;
	   }
		
	   if ($attr_type != $arith_expression.attr_type) {
            //System.out.println( "$attr_type: " + $attr_type+ ", $arith_expression.attr_type : " + $arith_expression.attr_type);
            System.out.println("Type Error: " + 
				              $arith_expression.start.getLine() +
						      ": Type mismatch for the two silde operands in an assignment statement.");
		   $attr_type = -2;
     return $attr_type;
    }}
  |Identifier '*=' arith_expression {if (TRACEON) System.out.println("Identifier (\'*=\' arith_expression");
  if (symtab.containsKey($Identifier.text)) {
	       $attr_type = symtab.get($Identifier.text);
	   } else {
          System.out.println("Type Error: " + $arith_expression.start.getLine() +": Type mismatch for the two silde operands in an assignment statement.");
	       $attr_type = -2;
		   return $attr_type;
	   }
		
	   if ($attr_type != $arith_expression.attr_type) {
            //System.out.println( "$attr_type: " + $attr_type+ ", $arith_expression.attr_type : " + $arith_expression.attr_type);
            System.out.println("Type Error: " + 
				              $arith_expression.start.getLine() +
						      ": Type mismatch for the two silde operands in an assignment statement.");
		   $attr_type = -2;
     return $attr_type;
    }}
  |Identifier '%=' arith_expression {if (TRACEON) System.out.println("Identifier (\'\%=\' arith_expression"); 
  if (symtab.containsKey($Identifier.text)) {
	       $attr_type = symtab.get($Identifier.text);
	   } else {
          System.out.println("Type Error: " + $arith_expression.start.getLine() +": Type mismatch for the two silde operands in an assignment statement.");
	       $attr_type = -2;
		   return $attr_type;
	   }
		
	   if ($attr_type != $arith_expression.attr_type) {
            //System.out.println( "$attr_type: " + $attr_type+ ", $arith_expression.attr_type : " + $arith_expression.attr_type);
            System.out.println("Type Error: " + 
				              $arith_expression.start.getLine() +
						      ": Type mismatch for the two silde operands in an assignment statement.");
		   $attr_type = -2;
     return $attr_type;
    }}
  ;


comparison_expression returns [int attr_type] 
  : Identifier '>=' Integer_constant {if (TRACEON) System.out.println("comparison_expression: Identifier >= Integer_constant type:bool ");$attr_type = 5; }
  |Identifier '==' Integer_constant {if (TRACEON) System.out.println("comparison_expression: Identifier == Integer_constant type:bool");$attr_type = 5; }
  |Identifier '<=' Integer_constant {if (TRACEON) System.out.println("comparison_expression: Identifier <= Integer_constant type:bool"); $attr_type = 5;}
  |Identifier '!=' Integer_constant {if (TRACEON) System.out.println("comparison_expression: Identifier != Integer_constant type:bool");$attr_type = 5; }
  |Identifier '>' Integer_constant {if (TRACEON) System.out.println("comparison_expression: Identifier > Integer_constant type:bool");$attr_type = 5; }
  |Identifier '<' Integer_constant {if (TRACEON) System.out.println("comparison_expression: Identifier < Integer_constant type:bool");$attr_type = 5; }
  |Integer_constant '>=' Identifier {if (TRACEON) System.out.println("comparison_expression: Integer_constant >= Identifier type:bool");$attr_type = 5; }
  |Integer_constant '==' Identifier {if (TRACEON) System.out.println("comparison_expression: Integer_constant == Identifier type:bool");$attr_type = 5; }
  |Integer_constant '<=' Identifier {if (TRACEON) System.out.println("comparison_expression: Integer_constant <= Identifier type:bool");$attr_type = 5; }
  |Integer_constant '!=' Identifier {if (TRACEON) System.out.println("comparison_expression: Integer_constant != Identifier type:bool");$attr_type = 5; }
  |Integer_constant '>' Identifier {if (TRACEON) System.out.println("comparison_expression: Integer_constant > Identifier type:bool");$attr_type = 5; }
  |Integer_constant '<' Identifier {if (TRACEON) System.out.println("comparison_expression: Integer_constant < Identifier type:bool");$attr_type = 5; }
  |Identifier '>=' Identifier {if (TRACEON) System.out.println("comparison_expression: Identifier >= Identifier type:bool");$attr_type = 5; }
  |Identifier '==' Identifier {if (TRACEON) System.out.println("comparison_expression: Identifier == Identifier type:bool");$attr_type = 5; }
  |Identifier '<=' Identifier {if (TRACEON) System.out.println("comparison_expression: Identifier <= Identifier type:bool");$attr_type = 5; }
  |Identifier '!=' Identifier {if (TRACEON) System.out.println("comparison_expression: Identifier != Identifier type:bool");$attr_type = 5; }
  |Identifier '>' Identifier {if (TRACEON) System.out.println("comparison_expression: Identifier > Identifier type:bool");$attr_type = 5; }
  |Identifier '<' Identifier {if (TRACEON) System.out.println("comparison_expression: Identifier < Identifier type:bool");$attr_type = 5; }
;

incre_decre_expression returns [int attr_type]
  :Identifier '++'  {if (TRACEON) System.out.println("incre_decre_expression:Identifier ++");symtab.get($Identifier.text); }
  |Identifier '--'  {if (TRACEON) System.out.println("incre_decre_expression:Identifier --");symtab.get($Identifier.text); }
  |'++' Identifier   {if (TRACEON) System.out.println("incre_decre_expression:++ Identifier ");symtab.get($Identifier.text); }
  |'--' Identifier   {if (TRACEON) System.out.println("incre_decre_expression:Identifier ");symtab.get($Identifier.text); }
  ;




statement returns [int attr_type]
	: Identifier '=' arith_expression ';'
	 {
	   if (symtab.containsKey($Identifier.text)) {
	       $attr_type = symtab.get($Identifier.text);
	   } else {
           /* Add codes to report and handle this error */
          //System.out.println( symtab.containsKey($Identifier.text) );
          System.out.println("Type Error: " + 
				              $arith_expression.start.getLine() +
						      ": Type mismatch for the two silde operands in an assignment statement.");
	       $attr_type = -2;
		   return $attr_type;
	   }
		
	   if ($attr_type != $arith_expression.attr_type) {
            //System.out.println( "$attr_type: " + $attr_type+ ", $arith_expression.attr_type : " + $arith_expression.attr_type);
            System.out.println("Type Error: " + 
				              $arith_expression.start.getLine() +
						      ": Type mismatch for the two silde operands in an assignment statement.");
		   $attr_type = -2;
     return $attr_type;
       }
	 }
  | overloaded_op ';' {if (TRACEON) System.out.println("statement: overloaded_op ;"); }
	| IF '(' (comparison_expression) ')' if_then_statements  
  {if (TRACEON) System.out.println("statement: IF \'(\' (comparison_expression) \')\' if_then_statements");}
  |IF '(' (Identifier '=' arith_expression) ')' if_then_statements  
  {if ($arith_expression.attr_type != 5 ) {
            //System.out.println( "$attr_type: " + $attr_type+ ", $arith_expression.attr_type : " + $arith_expression.attr_type);
            System.out.println("Type Error: " + 
				              $arith_expression.start.getLine() +
						      ": if condition is not bool ,please put bool in if condition.");
		   $attr_type = -2;
     return $attr_type;}}
  | ELSE  else_statements  {if (TRACEON) System.out.println("statement: (ELSE  else_statements)?"); }
  | WHILE '(' (comparison_expression) ')' while_statements  {if (TRACEON) System.out.println("statement: WHILE \'(\' (comparison_expression) \')\' while_statements"); }
  | WHILE '(' (Identifier '=' arith_expression) ')' if_then_statements  
  {if ($arith_expression.attr_type != 5 ) {
            //System.out.println( "$attr_type: " + $attr_type+ ", $arith_expression.attr_type : " + $arith_expression.attr_type);
            System.out.println("Type Error: " + 
				              $arith_expression.start.getLine() +
						      ": WHILE condition is not bool ,please put bool in WHILE condition.");
		   $attr_type = -2;
     return $attr_type;}}
  | FOR '(' declarations (comparison_expression|Identifier '=' arith_expression) ';' (incre_decre_expression) ')' for_statements  
  {if (TRACEON) System.out.println("FOR ( declarations ';'(comparison_expression) ; (Identifier '=' arith_expression|incre_decre_expression) ) for_statements"); 
  if ($arith_expression.attr_type != 5 ) {
            //System.out.println( "$attr_type: " + $attr_type+ ", $arith_expression.attr_type : " + $arith_expression.attr_type);
            System.out.println("Type Error: " + 
				              $arith_expression.start.getLine() +
						      ": FOR condition is not bool ,please put bool in FOR condition.");
		   $attr_type = -2;
     return $attr_type;}}
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

		   
/* ====== description of the tokens ====== */
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
BOOL :'bool';





WS:( ' ' | '\t' | '\r' | '\n' ) {$channel=HIDDEN;};
Identifier:('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;
Integer_constant:'0'..'9'+;
Floating_point_constant:'0'..'9'+ '.' '0'..'9'+;


COMMENT:'/*' .* '*/' {$channel=HIDDEN;};





INCLUDE_TYPE: '#include <'('a'..'z' | 'A'..'Z' | '_'|'0'..'9')*'.h>';