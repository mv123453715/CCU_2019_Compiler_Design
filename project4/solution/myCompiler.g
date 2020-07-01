grammar myCompiler;

options {
   language = Java;
}

@header {
    // import packages here.
    import java.util.HashMap;
    import java.util.ArrayList;
    import java.util.AbstractMap;
}

@members {
    boolean TRACEON = false;
    String printf_tmp;
    // ============================================
    // Create a symbol table.
	// ArrayList is easy to extend to add more info. into symbol table.
	//
	// The structure of symbol table:
	// <variable ID, type, memory location>
	//    - type: the variable type   (please check "enum Type")
	//    - memory location: the location (locals in VM) the variable will be stored at.
	//
	// We use "AbstractMap.SimpleEntry"
	// type and memory location are stored as a AbstractMap.SimpleEntry<Type, Integer>.
	//
    // ============================================
    HashMap<String, AbstractMap.SimpleEntry> symtab = new HashMap<String, AbstractMap.SimpleEntry>();

    int labelCount = 0;
	
	
	// storageIndex is used to represent/index the location (locals) in VM.
	// The first index is 0.
	int storageIndex = 0;

    // Record all assembly instructions.
    List<String> TextCode = new ArrayList<String>();

    // Type information.
    public enum Type{
       INT, FLOAT, CHAR;
    }
    
    public enum PRINTF_Type{
       PRINTF_INT,PRINTF_FLOAT;
    }


    public enum Compare
    	{
    		L,G,LE,GE,E,NE;
    	}
    /*
     * Output prologue.
     */
    void prologue()
    {
       TextCode.add(";.source");
       TextCode.add(".class public static myResult");
       TextCode.add(".super java/lang/Object");
       TextCode.add(".method public static main([Ljava/lang/String;)V");

       /* The size of stack and locals should be properly set. */
       TextCode.add(".limit stack 1000");
       TextCode.add(".limit locals 1000");
    }
    
	
    /*
     * Output epilogue.
     */
    void epilogue()
    {
       /* handle epilogue */
       TextCode.add("return");
       TextCode.add(".end method");
    }
    
    /* Generate a new label */
    String newLabel()
    {
       labelCount ++;
       return (new String("L")) + Integer.toString(labelCount);
    } 
    
    
    public List<String> getTextCode()
    {
       return TextCode;
    }
}

program: VOID MAIN '(' ')'
        {
           /* Output function prologue */
           prologue();
        }

        '{' 
           declarations
           statements
        '}'
        {
		   if (TRACEON)
		      System.out.println("VOID MAIN () {declarations statements}");

           /* output function epilogue */	  
           epilogue();
        }
        ;


declarations: type Identifier ';' declarations
              {
			     if (TRACEON)
	                System.out.println("declarations: type Identifier : declarations");

                 if (symtab.containsKey($Identifier.text)) {
				    // variable re-declared.
                    System.out.println("Type Error: " + 
                                       $Identifier.getLine() + 
                                       ": Redeclared identifier.");
                    System.exit(0);
                 }
                 
				 /* Add ID and its attr_type into the symbol table. */
				 AbstractMap.SimpleEntry<Type,Integer> the_entry = new AbstractMap.SimpleEntry<Type, Integer>($type.attr_type, Integer.valueOf(storageIndex));
				 storageIndex = storageIndex + 1;
                 symtab.put($Identifier.text, the_entry);
              }
            | 
		      {
			     if (TRACEON)
                    System.out.println("declarations: ");
			  }
            ;


type
returns [Type attr_type]
    : INT { if (TRACEON) System.out.println("type: INT"); attr_type=Type.INT; }
    | CHAR { if (TRACEON) System.out.println("type: CHAR"); attr_type=Type.CHAR; }
    | FLOAT {if (TRACEON) System.out.println("type: FLOAT"); attr_type=Type.FLOAT; }
	;

statements:statement statements
          |
          ;

statement: assign_stmt ';'
         | if_stmt
         | func_no_return_stmt ';'
         | for_stmt
         | printf_smt ';'
         ;


printf_smt 
    : PRINTF {printf_tmp=null;
              TextCode.add("; print the value.");
              TextCode.add("getstatic java/lang/System/out Ljava/io/PrintStream;");} '('  arg ( ',' arg )*  ')' 
              {
              TextCode.add("invokevirtual java/io/PrintStream/println(" + printf_tmp + ")V"); 
                             
              };



for_stmt: FOR '(' assign_stmt ';'
                  cond_expression ';'
				  assign_stmt
			   ')'
			      block_stmt
        ;
		 
		 
if_stmt
            : if_then_stmt if_else_stmt
            ;

	   
if_then_stmt
            : IF '(' comparison ')' block_stmt {TextCode.add("goto " + newLabel());  TextCode.add("L" + (labelCount-1) + ":");}
            ;

if_else_stmt:   ELSE block_stmt {TextCode.add("L" + labelCount + ':');}
                |
                ;


				  
block_stmt: '{' statements '}'
	  ;


assign_stmt: Identifier '=' arith_expression
             {
			   Type the_type;
			   int the_mem;
			   
			   // get the ID's location and type from symtab.			   
			   the_type = (Type) symtab.get($Identifier.text).getKey();
			   the_mem = ((Integer) ((AbstractMap.SimpleEntry) symtab.get($Identifier.text)).getValue()).intValue();
			   
			   if (the_type != $arith_expression.attr_type) {
			      System.out.println("Type error!\n");
				  System.exit(0);
			   }
			   
			   // issue store insruction:
               // => store the top element of the operand stack into the locals.
			   switch (the_type) {
			   case INT:
			              TextCode.add("istore_" + the_mem);
			              break;
			   case FLOAT:
                    TextCode.add("fstore_" + the_mem);
			              break;
			   }
             }
           ;


comparison : a=arith_expression op b=arith_expression
{
	if($a.attr_type!=$b.attr_type)
	{
		System.out.println("Type Error: " + $comparison.start.getLine() + ": Type mismatch for two expression to compare.");
		System.exit(127);
	}
	if($a.attr_type==Type.INT)
	{
		switch($op.attr_compare)
		{
			case L:
				TextCode.add("if_icmpge " + newLabel());
				break;
			case G:
				TextCode.add("if_icmple " + newLabel());
				break;
			case LE:
				TextCode.add("if_icmpgt  " + newLabel());
				break;
			case GE:
				TextCode.add("if_icmplt " + newLabel());
				break;
			case E:
				TextCode.add("if_icmpne " + newLabel());
				break;
			case NE:
				TextCode.add("if_icmpeq " + newLabel());
				break;
		}
	}
	else
	{
		switch($op.attr_compare)
		{
			case L:
				TextCode.add("fcmpl");
				TextCode.add("ifge " + newLabel());
				break;
			case G:
				TextCode.add("fcmpl");
				TextCode.add("ifle " + newLabel());
				break;
			case LE:
				TextCode.add("fcmpl");
				TextCode.add("ifgt " + newLabel());
				break;
			case GE:
				TextCode.add("fcmpl");
				TextCode.add("iflt " + newLabel());
				break;
			case E:
				TextCode.add("fcmpl");
				TextCode.add("ifne " + newLabel());
				break;
			case NE:
				TextCode.add("fcmpl");
				TextCode.add("ifeq " + newLabel());
				break;
		}
	}
};



func_no_return_stmt: Identifier '(' argument ')'
                   ;


argument: arg (',' arg)*
        ;

arg : arith_expression
{
	if($arith_expression.attr_type==Type.INT){
			printf_tmp="I";
  }//if
	else if($arith_expression.attr_type==Type.FLOAT){
	    printf_tmp="F";
	}//else if
}
|PRINTF_NUM
|STRING_LITERAL
{

  TextCode.add("ldc " + $STRING_LITERAL.text);
	if(printf_tmp==null)
		printf_tmp="Ljava/lang/String;";
}



;
		   
cond_expression
returns [boolean truth]
               : a=arith_expression
			     {
				    if ($a.attr_type.ordinal() != 0)
					   truth = true;
					else
					   truth = false;
				 }
                 (op arith_expression)*
               ;

			   
arith_expression
returns [Type attr_type]
                : a=multExpr { $attr_type = $a.attr_type; }
                 ( '+' b=multExpr
                       {
					      if($a.attr_type!=$b.attr_type) {
                    System.out.println("Type Error: " + $a.start.getLine() +": Type mismatch for the operator + in an expression.");
                		System.exit(127);                                    
                 }//if
						  
						  // code generation.
						  switch($attr_type)
            	{
            		case INT:
            			TextCode.add("iadd");
            			break;
            		case FLOAT:
            			TextCode.add("fadd");
            			break;
            	}//switch
                       }
                 | '-' b=multExpr
                       {
					      if($a.attr_type!=$b.attr_type) {
                    System.out.println("Type Error: " + $a.start.getLine() +": Type mismatch for the operator - in an expression.");
                		System.exit(127);                                    
                 }//if
						  
						  // code generation.
						  switch($attr_type)
            	{
            		case INT:
            			TextCode.add("isub");
            			break;
            		case FLOAT:
            			TextCode.add("fsub");
            			break;
            	}//switch
              }
                 )*
                 ;

multExpr
returns [Type attr_type]
          : a=signExpr { $attr_type=$a.attr_type; }
          ( '*' b=signExpr
          {
          if($a.attr_type!=$b.attr_type) {
                    System.out.println("Type Error: " + $a.start.getLine() +": Type mismatch for the operator * in an expression.");
                		System.exit(127);                                    
                 }//if
						  
						  // code generation.
						  switch($attr_type)
            	{
            		case INT:
            			TextCode.add("imul");
            			break;
            		case FLOAT:
            			TextCode.add("fmul");
            			break;
            	}//switch
             }
          | '/' b=signExpr
          {
          if($a.attr_type!=$b.attr_type) {
                    System.out.println("Type Error: " + $a.start.getLine() +": Type mismatch for the operator / in an expression.");
                		System.exit(127);                                    
                 }//if
						  
						  // code generation.
						  switch($attr_type)
            	{
            		case INT:
            			TextCode.add("idiv");
            			break;
            		case FLOAT:
            			TextCode.add("fdiv");
            			break;
            	}//switch
             }
	  )*
	  ;

signExpr
returns [Type attr_type]
        : a=primaryExpr { $attr_type=$a.attr_type; } 
        | '-' primaryExpr
	;
		  
primaryExpr
returns [Type attr_type] 
           : Integer_constant
		     {
			    $attr_type = Type.INT;
				
				// code generation.
				// push the integer into the operand stack.
				TextCode.add("ldc " + $Integer_constant.text);
			 }
           | Floating_point_constant 
           {$attr_type=Type.FLOAT; TextCode.add("ldc " + $Floating_point_constant.text);}
           | Identifier
		     {
			    // get type information from symtab.
			    $attr_type = (Type) ((AbstractMap.SimpleEntry) symtab.get($Identifier.text)).getKey();
				
				switch ($attr_type) {
				case INT: 
				          // load the variable into the operand stack.
				          TextCode.add("iload_" + ((Integer) ((AbstractMap.SimpleEntry) symtab.get($Identifier.text)).getValue()).intValue());
				          break;
				case FLOAT:
                  TextCode.add("fload_" + ((Integer) ((AbstractMap.SimpleEntry) symtab.get($Identifier.text)).getValue()).intValue());
				          break;
				case CHAR:
				          break;
				
				}
			 }
	   | '(' c=arith_expression ')' {$attr_type=$c.attr_type;}
           ;





op 
returns [Compare attr_compare]
    : '<' {$attr_compare=Compare.L;}
    | '>' {$attr_compare=Compare.G;}
    | '<=' {$attr_compare=Compare.LE;}
    | '>=' {$attr_compare=Compare.GE;}
    | '==' {$attr_compare=Compare.E;}
    | '!=' {$attr_compare=Compare.NE;};
  
/* description of the tokens */
FLOAT:'float';
INT:'int';
CHAR: 'char';
PRINTF: 'printf';
PRINTF_INT: '%d';
PRINTF_FLOAT: '%f';

MAIN: 'main';
VOID: 'void';
IF: 'if';
ELSE: 'else';
FOR: 'for';

//RelationOP: '>' |'>=' | '<' | '<=' | '==' | '!=';

Identifier:('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;
Integer_constant:'0'..'9'+;
Floating_point_constant:'0'..'9'+ '.' '0'..'9'+;

STRING_LITERAL
    :  '"' ( EscapeSequence | ~('\\'|'"') )* '"'
    ;
    
    
PRINTF_NUM
    :  ("%d"|"%f")
    ;
    

WS:( ' ' | '\t' | '\r' | '\n' ) {$channel=HIDDEN;};
COMMENT:'/*' .* '*/' {$channel=HIDDEN;};


fragment
EscapeSequence
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    ;
