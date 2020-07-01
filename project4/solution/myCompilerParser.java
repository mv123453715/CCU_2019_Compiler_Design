// $ANTLR 3.5.2 myCompiler.g 2020-06-26 10:37:06

    // import packages here.
    import java.util.HashMap;
    import java.util.ArrayList;
    import java.util.AbstractMap;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class myCompilerParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "CHAR", "COMMENT", "ELSE", "EscapeSequence", 
		"FLOAT", "FOR", "Floating_point_constant", "IF", "INT", "Identifier", 
		"Integer_constant", "MAIN", "PRINTF", "PRINTF_FLOAT", "PRINTF_INT", "STRING_LITERAL", 
		"VOID", "WS", "'!='", "'('", "')'", "'*'", "'+'", "','", "'-'", "'/'", 
		"';'", "'<'", "'<='", "'='", "'=='", "'>'", "'>='", "'{'", "'}'"
	};
	public static final int EOF=-1;
	public static final int T__22=22;
	public static final int T__23=23;
	public static final int T__24=24;
	public static final int T__25=25;
	public static final int T__26=26;
	public static final int T__27=27;
	public static final int T__28=28;
	public static final int T__29=29;
	public static final int T__30=30;
	public static final int T__31=31;
	public static final int T__32=32;
	public static final int T__33=33;
	public static final int T__34=34;
	public static final int T__35=35;
	public static final int T__36=36;
	public static final int T__37=37;
	public static final int T__38=38;
	public static final int CHAR=4;
	public static final int COMMENT=5;
	public static final int ELSE=6;
	public static final int EscapeSequence=7;
	public static final int FLOAT=8;
	public static final int FOR=9;
	public static final int Floating_point_constant=10;
	public static final int IF=11;
	public static final int INT=12;
	public static final int Identifier=13;
	public static final int Integer_constant=14;
	public static final int MAIN=15;
	public static final int PRINTF=16;
	public static final int PRINTF_FLOAT=17;
	public static final int PRINTF_INT=18;
	public static final int STRING_LITERAL=19;
	public static final int VOID=20;
	public static final int WS=21;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public myCompilerParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public myCompilerParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return myCompilerParser.tokenNames; }
	@Override public String getGrammarFileName() { return "myCompiler.g"; }


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



	// $ANTLR start "program"
	// myCompiler.g:96:1: program : VOID MAIN '(' ')' '{' declarations statements '}' ;
	public final void program() throws RecognitionException {
		try {
			// myCompiler.g:96:8: ( VOID MAIN '(' ')' '{' declarations statements '}' )
			// myCompiler.g:96:10: VOID MAIN '(' ')' '{' declarations statements '}'
			{
			match(input,VOID,FOLLOW_VOID_in_program36); 
			match(input,MAIN,FOLLOW_MAIN_in_program38); 
			match(input,23,FOLLOW_23_in_program40); 
			match(input,24,FOLLOW_24_in_program42); 

			           /* Output function prologue */
			           prologue();
			        
			match(input,37,FOLLOW_37_in_program63); 
			pushFollow(FOLLOW_declarations_in_program77);
			declarations();
			state._fsp--;

			pushFollow(FOLLOW_statements_in_program90);
			statements();
			state._fsp--;

			match(input,38,FOLLOW_38_in_program100); 

					   if (TRACEON)
					      System.out.println("VOID MAIN () {declarations statements}");

			           /* output function epilogue */	  
			           epilogue();
			        
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "program"



	// $ANTLR start "declarations"
	// myCompiler.g:116:1: declarations : ( type Identifier ';' declarations |);
	public final void declarations() throws RecognitionException {
		Token Identifier1=null;
		Type type2 =null;

		try {
			// myCompiler.g:116:13: ( type Identifier ';' declarations |)
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==CHAR||LA1_0==FLOAT||LA1_0==INT) ) {
				alt1=1;
			}
			else if ( (LA1_0==FOR||LA1_0==IF||LA1_0==Identifier||LA1_0==PRINTF||LA1_0==38) ) {
				alt1=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}

			switch (alt1) {
				case 1 :
					// myCompiler.g:116:15: type Identifier ';' declarations
					{
					pushFollow(FOLLOW_type_in_declarations127);
					type2=type();
					state._fsp--;

					Identifier1=(Token)match(input,Identifier,FOLLOW_Identifier_in_declarations129); 
					match(input,30,FOLLOW_30_in_declarations131); 
					pushFollow(FOLLOW_declarations_in_declarations133);
					declarations();
					state._fsp--;


								     if (TRACEON)
						                System.out.println("declarations: type Identifier : declarations");

					                 if (symtab.containsKey((Identifier1!=null?Identifier1.getText():null))) {
									    // variable re-declared.
					                    System.out.println("Type Error: " + 
					                                       Identifier1.getLine() + 
					                                       ": Redeclared identifier.");
					                    System.exit(0);
					                 }
					                 
									 /* Add ID and its attr_type into the symbol table. */
									 AbstractMap.SimpleEntry<Type,Integer> the_entry = new AbstractMap.SimpleEntry<Type, Integer>(type2, Integer.valueOf(storageIndex));
									 storageIndex = storageIndex + 1;
					                 symtab.put((Identifier1!=null?Identifier1.getText():null), the_entry);
					              
					}
					break;
				case 2 :
					// myCompiler.g:135:9: 
					{

								     if (TRACEON)
					                    System.out.println("declarations: ");
								  
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "declarations"



	// $ANTLR start "type"
	// myCompiler.g:142:1: type returns [Type attr_type] : ( INT | CHAR | FLOAT );
	public final Type type() throws RecognitionException {
		Type attr_type = null;


		try {
			// myCompiler.g:144:5: ( INT | CHAR | FLOAT )
			int alt2=3;
			switch ( input.LA(1) ) {
			case INT:
				{
				alt2=1;
				}
				break;
			case CHAR:
				{
				alt2=2;
				}
				break;
			case FLOAT:
				{
				alt2=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}
			switch (alt2) {
				case 1 :
					// myCompiler.g:144:7: INT
					{
					match(input,INT,FOLLOW_INT_in_type204); 
					 if (TRACEON) System.out.println("type: INT"); attr_type=Type.INT; 
					}
					break;
				case 2 :
					// myCompiler.g:145:7: CHAR
					{
					match(input,CHAR,FOLLOW_CHAR_in_type214); 
					 if (TRACEON) System.out.println("type: CHAR"); attr_type=Type.CHAR; 
					}
					break;
				case 3 :
					// myCompiler.g:146:7: FLOAT
					{
					match(input,FLOAT,FOLLOW_FLOAT_in_type224); 
					if (TRACEON) System.out.println("type: FLOAT"); attr_type=Type.FLOAT; 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return attr_type;
	}
	// $ANTLR end "type"



	// $ANTLR start "statements"
	// myCompiler.g:149:1: statements : ( statement statements |);
	public final void statements() throws RecognitionException {
		try {
			// myCompiler.g:149:11: ( statement statements |)
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==FOR||LA3_0==IF||LA3_0==Identifier||LA3_0==PRINTF) ) {
				alt3=1;
			}
			else if ( (LA3_0==38) ) {
				alt3=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// myCompiler.g:149:12: statement statements
					{
					pushFollow(FOLLOW_statement_in_statements234);
					statement();
					state._fsp--;

					pushFollow(FOLLOW_statements_in_statements236);
					statements();
					state._fsp--;

					}
					break;
				case 2 :
					// myCompiler.g:151:11: 
					{
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "statements"



	// $ANTLR start "statement"
	// myCompiler.g:153:1: statement : ( assign_stmt ';' | if_stmt | func_no_return_stmt ';' | for_stmt | printf_smt ';' );
	public final void statement() throws RecognitionException {
		try {
			// myCompiler.g:153:10: ( assign_stmt ';' | if_stmt | func_no_return_stmt ';' | for_stmt | printf_smt ';' )
			int alt4=5;
			switch ( input.LA(1) ) {
			case Identifier:
				{
				int LA4_1 = input.LA(2);
				if ( (LA4_1==33) ) {
					alt4=1;
				}
				else if ( (LA4_1==23) ) {
					alt4=3;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 4, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case IF:
				{
				alt4=2;
				}
				break;
			case FOR:
				{
				alt4=4;
				}
				break;
			case PRINTF:
				{
				alt4=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}
			switch (alt4) {
				case 1 :
					// myCompiler.g:153:12: assign_stmt ';'
					{
					pushFollow(FOLLOW_assign_stmt_in_statement266);
					assign_stmt();
					state._fsp--;

					match(input,30,FOLLOW_30_in_statement268); 
					}
					break;
				case 2 :
					// myCompiler.g:154:12: if_stmt
					{
					pushFollow(FOLLOW_if_stmt_in_statement281);
					if_stmt();
					state._fsp--;

					}
					break;
				case 3 :
					// myCompiler.g:155:12: func_no_return_stmt ';'
					{
					pushFollow(FOLLOW_func_no_return_stmt_in_statement294);
					func_no_return_stmt();
					state._fsp--;

					match(input,30,FOLLOW_30_in_statement296); 
					}
					break;
				case 4 :
					// myCompiler.g:156:12: for_stmt
					{
					pushFollow(FOLLOW_for_stmt_in_statement309);
					for_stmt();
					state._fsp--;

					}
					break;
				case 5 :
					// myCompiler.g:157:12: printf_smt ';'
					{
					pushFollow(FOLLOW_printf_smt_in_statement322);
					printf_smt();
					state._fsp--;

					match(input,30,FOLLOW_30_in_statement324); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "statement"



	// $ANTLR start "printf_smt"
	// myCompiler.g:161:1: printf_smt : PRINTF '(' arg ( ',' arg )* ')' ;
	public final void printf_smt() throws RecognitionException {
		try {
			// myCompiler.g:162:5: ( PRINTF '(' arg ( ',' arg )* ')' )
			// myCompiler.g:162:7: PRINTF '(' arg ( ',' arg )* ')'
			{
			match(input,PRINTF,FOLLOW_PRINTF_in_printf_smt348); 
			printf_tmp=null;
			              TextCode.add("; print the value.");
			              TextCode.add("getstatic java/lang/System/out Ljava/io/PrintStream;");
			match(input,23,FOLLOW_23_in_printf_smt352); 
			pushFollow(FOLLOW_arg_in_printf_smt355);
			arg();
			state._fsp--;

			// myCompiler.g:164:95: ( ',' arg )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==27) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// myCompiler.g:164:97: ',' arg
					{
					match(input,27,FOLLOW_27_in_printf_smt359); 
					pushFollow(FOLLOW_arg_in_printf_smt361);
					arg();
					state._fsp--;

					}
					break;

				default :
					break loop5;
				}
			}

			match(input,24,FOLLOW_24_in_printf_smt367); 

			              TextCode.add("invokevirtual java/io/PrintStream/println(" + printf_tmp + ")V"); 
			                             
			              
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "printf_smt"



	// $ANTLR start "for_stmt"
	// myCompiler.g:172:1: for_stmt : FOR '(' assign_stmt ';' cond_expression ';' assign_stmt ')' block_stmt ;
	public final void for_stmt() throws RecognitionException {
		try {
			// myCompiler.g:172:9: ( FOR '(' assign_stmt ';' cond_expression ';' assign_stmt ')' block_stmt )
			// myCompiler.g:172:11: FOR '(' assign_stmt ';' cond_expression ';' assign_stmt ')' block_stmt
			{
			match(input,FOR,FOLLOW_FOR_in_for_stmt393); 
			match(input,23,FOLLOW_23_in_for_stmt395); 
			pushFollow(FOLLOW_assign_stmt_in_for_stmt397);
			assign_stmt();
			state._fsp--;

			match(input,30,FOLLOW_30_in_for_stmt399); 
			pushFollow(FOLLOW_cond_expression_in_for_stmt419);
			cond_expression();
			state._fsp--;

			match(input,30,FOLLOW_30_in_for_stmt421); 
			pushFollow(FOLLOW_assign_stmt_in_for_stmt429);
			assign_stmt();
			state._fsp--;

			match(input,24,FOLLOW_24_in_for_stmt437); 
			pushFollow(FOLLOW_block_stmt_in_for_stmt448);
			block_stmt();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "for_stmt"



	// $ANTLR start "if_stmt"
	// myCompiler.g:180:1: if_stmt : if_then_stmt if_else_stmt ;
	public final void if_stmt() throws RecognitionException {
		try {
			// myCompiler.g:181:13: ( if_then_stmt if_else_stmt )
			// myCompiler.g:181:15: if_then_stmt if_else_stmt
			{
			pushFollow(FOLLOW_if_then_stmt_in_if_stmt484);
			if_then_stmt();
			state._fsp--;

			pushFollow(FOLLOW_if_else_stmt_in_if_stmt486);
			if_else_stmt();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "if_stmt"



	// $ANTLR start "if_then_stmt"
	// myCompiler.g:185:1: if_then_stmt : IF '(' comparison ')' block_stmt ;
	public final void if_then_stmt() throws RecognitionException {
		try {
			// myCompiler.g:186:13: ( IF '(' comparison ')' block_stmt )
			// myCompiler.g:186:15: IF '(' comparison ')' block_stmt
			{
			match(input,IF,FOLLOW_IF_in_if_then_stmt524); 
			match(input,23,FOLLOW_23_in_if_then_stmt526); 
			pushFollow(FOLLOW_comparison_in_if_then_stmt528);
			comparison();
			state._fsp--;

			match(input,24,FOLLOW_24_in_if_then_stmt530); 
			pushFollow(FOLLOW_block_stmt_in_if_then_stmt532);
			block_stmt();
			state._fsp--;

			TextCode.add("goto " + newLabel());  TextCode.add("L" + (labelCount-1) + ":");
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "if_then_stmt"



	// $ANTLR start "if_else_stmt"
	// myCompiler.g:189:1: if_else_stmt : ( ELSE block_stmt |);
	public final void if_else_stmt() throws RecognitionException {
		try {
			// myCompiler.g:189:13: ( ELSE block_stmt |)
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==ELSE) ) {
				alt6=1;
			}
			else if ( (LA6_0==FOR||LA6_0==IF||LA6_0==Identifier||LA6_0==PRINTF||LA6_0==38) ) {
				alt6=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// myCompiler.g:189:17: ELSE block_stmt
					{
					match(input,ELSE,FOLLOW_ELSE_in_if_else_stmt556); 
					pushFollow(FOLLOW_block_stmt_in_if_else_stmt558);
					block_stmt();
					state._fsp--;

					TextCode.add("L" + labelCount + ':');
					}
					break;
				case 2 :
					// myCompiler.g:191:17: 
					{
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "if_else_stmt"



	// $ANTLR start "block_stmt"
	// myCompiler.g:195:1: block_stmt : '{' statements '}' ;
	public final void block_stmt() throws RecognitionException {
		try {
			// myCompiler.g:195:11: ( '{' statements '}' )
			// myCompiler.g:195:13: '{' statements '}'
			{
			match(input,37,FOLLOW_37_in_block_stmt610); 
			pushFollow(FOLLOW_statements_in_block_stmt612);
			statements();
			state._fsp--;

			match(input,38,FOLLOW_38_in_block_stmt614); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "block_stmt"



	// $ANTLR start "assign_stmt"
	// myCompiler.g:199:1: assign_stmt : Identifier '=' arith_expression ;
	public final void assign_stmt() throws RecognitionException {
		Token Identifier3=null;
		Type arith_expression4 =null;

		try {
			// myCompiler.g:199:12: ( Identifier '=' arith_expression )
			// myCompiler.g:199:14: Identifier '=' arith_expression
			{
			Identifier3=(Token)match(input,Identifier,FOLLOW_Identifier_in_assign_stmt626); 
			match(input,33,FOLLOW_33_in_assign_stmt628); 
			pushFollow(FOLLOW_arith_expression_in_assign_stmt630);
			arith_expression4=arith_expression();
			state._fsp--;


						   Type the_type;
						   int the_mem;
						   
						   // get the ID's location and type from symtab.			   
						   the_type = (Type) symtab.get((Identifier3!=null?Identifier3.getText():null)).getKey();
						   the_mem = ((Integer) ((AbstractMap.SimpleEntry) symtab.get((Identifier3!=null?Identifier3.getText():null))).getValue()).intValue();
						   
						   if (the_type != arith_expression4) {
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

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "assign_stmt"


	public static class comparison_return extends ParserRuleReturnScope {
	};


	// $ANTLR start "comparison"
	// myCompiler.g:227:1: comparison : a= arith_expression op b= arith_expression ;
	public final myCompilerParser.comparison_return comparison() throws RecognitionException {
		myCompilerParser.comparison_return retval = new myCompilerParser.comparison_return();
		retval.start = input.LT(1);

		Type a =null;
		Type b =null;
		Compare op5 =null;

		try {
			// myCompiler.g:227:12: (a= arith_expression op b= arith_expression )
			// myCompiler.g:227:14: a= arith_expression op b= arith_expression
			{
			pushFollow(FOLLOW_arith_expression_in_comparison668);
			a=arith_expression();
			state._fsp--;

			pushFollow(FOLLOW_op_in_comparison670);
			op5=op();
			state._fsp--;

			pushFollow(FOLLOW_arith_expression_in_comparison674);
			b=arith_expression();
			state._fsp--;


				if(a!=b)
				{
					System.out.println("Type Error: " + (retval.start).getLine() + ": Type mismatch for two expression to compare.");
					System.exit(127);
				}
				if(a==Type.INT)
				{
					switch(op5)
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
					switch(op5)
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

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "comparison"



	// $ANTLR start "func_no_return_stmt"
	// myCompiler.g:292:1: func_no_return_stmt : Identifier '(' argument ')' ;
	public final void func_no_return_stmt() throws RecognitionException {
		try {
			// myCompiler.g:292:20: ( Identifier '(' argument ')' )
			// myCompiler.g:292:22: Identifier '(' argument ')'
			{
			match(input,Identifier,FOLLOW_Identifier_in_func_no_return_stmt685); 
			match(input,23,FOLLOW_23_in_func_no_return_stmt687); 
			pushFollow(FOLLOW_argument_in_func_no_return_stmt689);
			argument();
			state._fsp--;

			match(input,24,FOLLOW_24_in_func_no_return_stmt691); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "func_no_return_stmt"



	// $ANTLR start "argument"
	// myCompiler.g:296:1: argument : arg ( ',' arg )* ;
	public final void argument() throws RecognitionException {
		try {
			// myCompiler.g:296:9: ( arg ( ',' arg )* )
			// myCompiler.g:296:11: arg ( ',' arg )*
			{
			pushFollow(FOLLOW_arg_in_argument719);
			arg();
			state._fsp--;

			// myCompiler.g:296:15: ( ',' arg )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==27) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// myCompiler.g:296:16: ',' arg
					{
					match(input,27,FOLLOW_27_in_argument722); 
					pushFollow(FOLLOW_arg_in_argument724);
					arg();
					state._fsp--;

					}
					break;

				default :
					break loop7;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "argument"



	// $ANTLR start "arg"
	// myCompiler.g:299:1: arg : ( arith_expression | STRING_LITERAL );
	public final void arg() throws RecognitionException {
		Token STRING_LITERAL7=null;
		Type arith_expression6 =null;

		try {
			// myCompiler.g:299:5: ( arith_expression | STRING_LITERAL )
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==Floating_point_constant||(LA8_0 >= Identifier && LA8_0 <= Integer_constant)||LA8_0==23||LA8_0==28) ) {
				alt8=1;
			}
			else if ( (LA8_0==STRING_LITERAL) ) {
				alt8=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}

			switch (alt8) {
				case 1 :
					// myCompiler.g:299:7: arith_expression
					{
					pushFollow(FOLLOW_arith_expression_in_arg743);
					arith_expression6=arith_expression();
					state._fsp--;


						if(arith_expression6==Type.INT){
								printf_tmp="I";
					  }//if
						else if(arith_expression6==Type.FLOAT){
						    printf_tmp="F";
						}//else if

					}
					break;
				case 2 :
					// myCompiler.g:309:1: STRING_LITERAL
					{
					STRING_LITERAL7=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_arg749); 

						TextCode.add("ldc " + (STRING_LITERAL7!=null?STRING_LITERAL7.getText():null));
						if(printf_tmp==null)
							printf_tmp="Ljava/lang/String;";

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "arg"



	// $ANTLR start "cond_expression"
	// myCompiler.g:317:1: cond_expression returns [boolean truth] : a= arith_expression ( op arith_expression )* ;
	public final boolean cond_expression() throws RecognitionException {
		boolean truth = false;


		Type a =null;

		try {
			// myCompiler.g:319:16: (a= arith_expression ( op arith_expression )* )
			// myCompiler.g:319:18: a= arith_expression ( op arith_expression )*
			{
			pushFollow(FOLLOW_arith_expression_in_cond_expression786);
			a=arith_expression();
			state._fsp--;


							    if (a.ordinal() != 0)
								   truth = true;
								else
								   truth = false;
							 
			// myCompiler.g:326:18: ( op arith_expression )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==22||(LA9_0 >= 31 && LA9_0 <= 32)||(LA9_0 >= 34 && LA9_0 <= 36)) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// myCompiler.g:326:19: op arith_expression
					{
					pushFollow(FOLLOW_op_in_cond_expression816);
					op();
					state._fsp--;

					pushFollow(FOLLOW_arith_expression_in_cond_expression818);
					arith_expression();
					state._fsp--;

					}
					break;

				default :
					break loop9;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return truth;
	}
	// $ANTLR end "cond_expression"



	// $ANTLR start "arith_expression"
	// myCompiler.g:330:1: arith_expression returns [Type attr_type] : a= multExpr ( '+' b= multExpr | '-' b= multExpr )* ;
	public final Type arith_expression() throws RecognitionException {
		Type attr_type = null;


		ParserRuleReturnScope a =null;
		ParserRuleReturnScope b =null;

		try {
			// myCompiler.g:332:17: (a= multExpr ( '+' b= multExpr | '-' b= multExpr )* )
			// myCompiler.g:332:19: a= multExpr ( '+' b= multExpr | '-' b= multExpr )*
			{
			pushFollow(FOLLOW_multExpr_in_arith_expression873);
			a=multExpr();
			state._fsp--;

			 attr_type = (a!=null?((myCompilerParser.multExpr_return)a).attr_type:null); 
			// myCompiler.g:333:18: ( '+' b= multExpr | '-' b= multExpr )*
			loop10:
			while (true) {
				int alt10=3;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==26) ) {
					alt10=1;
				}
				else if ( (LA10_0==28) ) {
					alt10=2;
				}

				switch (alt10) {
				case 1 :
					// myCompiler.g:333:20: '+' b= multExpr
					{
					match(input,26,FOLLOW_26_in_arith_expression896); 
					pushFollow(FOLLOW_multExpr_in_arith_expression900);
					b=multExpr();
					state._fsp--;


										      if((a!=null?((myCompilerParser.multExpr_return)a).attr_type:null)!=(b!=null?((myCompilerParser.multExpr_return)b).attr_type:null)) {
					                    System.out.println("Type Error: " + (a!=null?(a.start):null).getLine() +": Type mismatch for the operator + in an expression.");
					                		System.exit(127);                                    
					                 }//if
											  
											  // code generation.
											  switch(attr_type)
					            	{
					            		case INT:
					            			TextCode.add("iadd");
					            			break;
					            		case FLOAT:
					            			TextCode.add("fadd");
					            			break;
					            	}//switch
					                       
					}
					break;
				case 2 :
					// myCompiler.g:351:20: '-' b= multExpr
					{
					match(input,28,FOLLOW_28_in_arith_expression946); 
					pushFollow(FOLLOW_multExpr_in_arith_expression950);
					b=multExpr();
					state._fsp--;


										      if((a!=null?((myCompilerParser.multExpr_return)a).attr_type:null)!=(b!=null?((myCompilerParser.multExpr_return)b).attr_type:null)) {
					                    System.out.println("Type Error: " + (a!=null?(a.start):null).getLine() +": Type mismatch for the operator - in an expression.");
					                		System.exit(127);                                    
					                 }//if
											  
											  // code generation.
											  switch(attr_type)
					            	{
					            		case INT:
					            			TextCode.add("isub");
					            			break;
					            		case FLOAT:
					            			TextCode.add("fsub");
					            			break;
					            	}//switch
					              
					}
					break;

				default :
					break loop10;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return attr_type;
	}
	// $ANTLR end "arith_expression"


	public static class multExpr_return extends ParserRuleReturnScope {
		public Type attr_type;
	};


	// $ANTLR start "multExpr"
	// myCompiler.g:372:1: multExpr returns [Type attr_type] : a= signExpr ( '*' b= signExpr | '/' b= signExpr )* ;
	public final myCompilerParser.multExpr_return multExpr() throws RecognitionException {
		myCompilerParser.multExpr_return retval = new myCompilerParser.multExpr_return();
		retval.start = input.LT(1);

		ParserRuleReturnScope a =null;
		ParserRuleReturnScope b =null;

		try {
			// myCompiler.g:374:11: (a= signExpr ( '*' b= signExpr | '/' b= signExpr )* )
			// myCompiler.g:374:13: a= signExpr ( '*' b= signExpr | '/' b= signExpr )*
			{
			pushFollow(FOLLOW_signExpr_in_multExpr1037);
			a=signExpr();
			state._fsp--;

			 retval.attr_type =(a!=null?((myCompilerParser.signExpr_return)a).attr_type:null); 
			// myCompiler.g:375:11: ( '*' b= signExpr | '/' b= signExpr )*
			loop11:
			while (true) {
				int alt11=3;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==25) ) {
					alt11=1;
				}
				else if ( (LA11_0==29) ) {
					alt11=2;
				}

				switch (alt11) {
				case 1 :
					// myCompiler.g:375:13: '*' b= signExpr
					{
					match(input,25,FOLLOW_25_in_multExpr1053); 
					pushFollow(FOLLOW_signExpr_in_multExpr1057);
					b=signExpr();
					state._fsp--;


					          if((a!=null?((myCompilerParser.signExpr_return)a).attr_type:null)!=(b!=null?((myCompilerParser.signExpr_return)b).attr_type:null)) {
					                    System.out.println("Type Error: " + (a!=null?(a.start):null).getLine() +": Type mismatch for the operator * in an expression.");
					                		System.exit(127);                                    
					                 }//if
											  
											  // code generation.
											  switch(retval.attr_type)
					            	{
					            		case INT:
					            			TextCode.add("imul");
					            			break;
					            		case FLOAT:
					            			TextCode.add("fmul");
					            			break;
					            	}//switch
					             
					}
					break;
				case 2 :
					// myCompiler.g:393:13: '/' b= signExpr
					{
					match(input,29,FOLLOW_29_in_multExpr1083); 
					pushFollow(FOLLOW_signExpr_in_multExpr1087);
					b=signExpr();
					state._fsp--;


					          if((a!=null?((myCompilerParser.signExpr_return)a).attr_type:null)!=(b!=null?((myCompilerParser.signExpr_return)b).attr_type:null)) {
					                    System.out.println("Type Error: " + (a!=null?(a.start):null).getLine() +": Type mismatch for the operator / in an expression.");
					                		System.exit(127);                                    
					                 }//if
											  
											  // code generation.
											  switch(retval.attr_type)
					            	{
					            		case INT:
					            			TextCode.add("idiv");
					            			break;
					            		case FLOAT:
					            			TextCode.add("fdiv");
					            			break;
					            	}//switch
					             
					}
					break;

				default :
					break loop11;
				}
			}

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "multExpr"


	public static class signExpr_return extends ParserRuleReturnScope {
		public Type attr_type;
	};


	// $ANTLR start "signExpr"
	// myCompiler.g:414:1: signExpr returns [Type attr_type] : (a= primaryExpr | '-' primaryExpr );
	public final myCompilerParser.signExpr_return signExpr() throws RecognitionException {
		myCompilerParser.signExpr_return retval = new myCompilerParser.signExpr_return();
		retval.start = input.LT(1);

		Type a =null;

		try {
			// myCompiler.g:416:9: (a= primaryExpr | '-' primaryExpr )
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==Floating_point_constant||(LA12_0 >= Identifier && LA12_0 <= Integer_constant)||LA12_0==23) ) {
				alt12=1;
			}
			else if ( (LA12_0==28) ) {
				alt12=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}

			switch (alt12) {
				case 1 :
					// myCompiler.g:416:11: a= primaryExpr
					{
					pushFollow(FOLLOW_primaryExpr_in_signExpr1131);
					a=primaryExpr();
					state._fsp--;

					 retval.attr_type =a; 
					}
					break;
				case 2 :
					// myCompiler.g:417:11: '-' primaryExpr
					{
					match(input,28,FOLLOW_28_in_signExpr1146); 
					pushFollow(FOLLOW_primaryExpr_in_signExpr1148);
					primaryExpr();
					state._fsp--;

					}
					break;

			}
			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "signExpr"



	// $ANTLR start "primaryExpr"
	// myCompiler.g:420:1: primaryExpr returns [Type attr_type] : ( Integer_constant | Floating_point_constant | Identifier | '(' c= arith_expression ')' );
	public final Type primaryExpr() throws RecognitionException {
		Type attr_type = null;


		Token Integer_constant8=null;
		Token Floating_point_constant9=null;
		Token Identifier10=null;
		Type c =null;

		try {
			// myCompiler.g:422:12: ( Integer_constant | Floating_point_constant | Identifier | '(' c= arith_expression ')' )
			int alt13=4;
			switch ( input.LA(1) ) {
			case Integer_constant:
				{
				alt13=1;
				}
				break;
			case Floating_point_constant:
				{
				alt13=2;
				}
				break;
			case Identifier:
				{
				alt13=3;
				}
				break;
			case 23:
				{
				alt13=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}
			switch (alt13) {
				case 1 :
					// myCompiler.g:422:14: Integer_constant
					{
					Integer_constant8=(Token)match(input,Integer_constant,FOLLOW_Integer_constant_in_primaryExpr1178); 

								    attr_type = Type.INT;
									
									// code generation.
									// push the integer into the operand stack.
									TextCode.add("ldc " + (Integer_constant8!=null?Integer_constant8.getText():null));
								 
					}
					break;
				case 2 :
					// myCompiler.g:430:14: Floating_point_constant
					{
					Floating_point_constant9=(Token)match(input,Floating_point_constant,FOLLOW_Floating_point_constant_in_primaryExpr1202); 
					attr_type =Type.FLOAT; TextCode.add("ldc " + (Floating_point_constant9!=null?Floating_point_constant9.getText():null));
					}
					break;
				case 3 :
					// myCompiler.g:432:14: Identifier
					{
					Identifier10=(Token)match(input,Identifier,FOLLOW_Identifier_in_primaryExpr1231); 

								    // get type information from symtab.
								    attr_type = (Type) ((AbstractMap.SimpleEntry) symtab.get((Identifier10!=null?Identifier10.getText():null))).getKey();
									
									switch (attr_type) {
									case INT: 
									          // load the variable into the operand stack.
									          TextCode.add("iload_" + ((Integer) ((AbstractMap.SimpleEntry) symtab.get((Identifier10!=null?Identifier10.getText():null))).getValue()).intValue());
									          break;
									case FLOAT:
					                  TextCode.add("fload_" + ((Integer) ((AbstractMap.SimpleEntry) symtab.get((Identifier10!=null?Identifier10.getText():null))).getValue()).intValue());
									          break;
									case CHAR:
									          break;
									
									}
								 
					}
					break;
				case 4 :
					// myCompiler.g:450:7: '(' c= arith_expression ')'
					{
					match(input,23,FOLLOW_23_in_primaryExpr1248); 
					pushFollow(FOLLOW_arith_expression_in_primaryExpr1252);
					c=arith_expression();
					state._fsp--;

					match(input,24,FOLLOW_24_in_primaryExpr1254); 
					attr_type =c;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return attr_type;
	}
	// $ANTLR end "primaryExpr"



	// $ANTLR start "op"
	// myCompiler.g:457:1: op returns [Compare attr_compare] : ( '<' | '>' | '<=' | '>=' | '==' | '!=' );
	public final Compare op() throws RecognitionException {
		Compare attr_compare = null;


		try {
			// myCompiler.g:459:5: ( '<' | '>' | '<=' | '>=' | '==' | '!=' )
			int alt14=6;
			switch ( input.LA(1) ) {
			case 31:
				{
				alt14=1;
				}
				break;
			case 35:
				{
				alt14=2;
				}
				break;
			case 32:
				{
				alt14=3;
				}
				break;
			case 36:
				{
				alt14=4;
				}
				break;
			case 34:
				{
				alt14=5;
				}
				break;
			case 22:
				{
				alt14=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}
			switch (alt14) {
				case 1 :
					// myCompiler.g:459:7: '<'
					{
					match(input,31,FOLLOW_31_in_op1289); 
					attr_compare =Compare.L;
					}
					break;
				case 2 :
					// myCompiler.g:460:7: '>'
					{
					match(input,35,FOLLOW_35_in_op1299); 
					attr_compare =Compare.G;
					}
					break;
				case 3 :
					// myCompiler.g:461:7: '<='
					{
					match(input,32,FOLLOW_32_in_op1309); 
					attr_compare =Compare.LE;
					}
					break;
				case 4 :
					// myCompiler.g:462:7: '>='
					{
					match(input,36,FOLLOW_36_in_op1319); 
					attr_compare =Compare.GE;
					}
					break;
				case 5 :
					// myCompiler.g:463:7: '=='
					{
					match(input,34,FOLLOW_34_in_op1329); 
					attr_compare =Compare.E;
					}
					break;
				case 6 :
					// myCompiler.g:464:7: '!='
					{
					match(input,22,FOLLOW_22_in_op1339); 
					attr_compare =Compare.NE;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return attr_compare;
	}
	// $ANTLR end "op"

	// Delegated rules



	public static final BitSet FOLLOW_VOID_in_program36 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_MAIN_in_program38 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_23_in_program40 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_program42 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_37_in_program63 = new BitSet(new long[]{0x0000004000013B10L});
	public static final BitSet FOLLOW_declarations_in_program77 = new BitSet(new long[]{0x0000004000012A00L});
	public static final BitSet FOLLOW_statements_in_program90 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_38_in_program100 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_declarations127 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_Identifier_in_declarations129 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_declarations131 = new BitSet(new long[]{0x0000000000001110L});
	public static final BitSet FOLLOW_declarations_in_declarations133 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_type204 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_in_type214 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_type224 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_statements234 = new BitSet(new long[]{0x0000000000012A00L});
	public static final BitSet FOLLOW_statements_in_statements236 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assign_stmt_in_statement266 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_statement268 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_if_stmt_in_statement281 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_func_no_return_stmt_in_statement294 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_statement296 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_for_stmt_in_statement309 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_printf_smt_in_statement322 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_statement324 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRINTF_in_printf_smt348 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_23_in_printf_smt352 = new BitSet(new long[]{0x0000000010886400L});
	public static final BitSet FOLLOW_arg_in_printf_smt355 = new BitSet(new long[]{0x0000000009000000L});
	public static final BitSet FOLLOW_27_in_printf_smt359 = new BitSet(new long[]{0x0000000010886400L});
	public static final BitSet FOLLOW_arg_in_printf_smt361 = new BitSet(new long[]{0x0000000009000000L});
	public static final BitSet FOLLOW_24_in_printf_smt367 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FOR_in_for_stmt393 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_23_in_for_stmt395 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_assign_stmt_in_for_stmt397 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_for_stmt399 = new BitSet(new long[]{0x0000000010806400L});
	public static final BitSet FOLLOW_cond_expression_in_for_stmt419 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_for_stmt421 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_assign_stmt_in_for_stmt429 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_for_stmt437 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_block_stmt_in_for_stmt448 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_if_then_stmt_in_if_stmt484 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_if_else_stmt_in_if_stmt486 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_if_then_stmt524 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_23_in_if_then_stmt526 = new BitSet(new long[]{0x0000000010806400L});
	public static final BitSet FOLLOW_comparison_in_if_then_stmt528 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_if_then_stmt530 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_block_stmt_in_if_then_stmt532 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ELSE_in_if_else_stmt556 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_block_stmt_in_if_else_stmt558 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_37_in_block_stmt610 = new BitSet(new long[]{0x0000004000012A00L});
	public static final BitSet FOLLOW_statements_in_block_stmt612 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_38_in_block_stmt614 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_assign_stmt626 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_assign_stmt628 = new BitSet(new long[]{0x0000000010806400L});
	public static final BitSet FOLLOW_arith_expression_in_assign_stmt630 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arith_expression_in_comparison668 = new BitSet(new long[]{0x0000001D80400000L});
	public static final BitSet FOLLOW_op_in_comparison670 = new BitSet(new long[]{0x0000000010806400L});
	public static final BitSet FOLLOW_arith_expression_in_comparison674 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_func_no_return_stmt685 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_23_in_func_no_return_stmt687 = new BitSet(new long[]{0x0000000010886400L});
	public static final BitSet FOLLOW_argument_in_func_no_return_stmt689 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_func_no_return_stmt691 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arg_in_argument719 = new BitSet(new long[]{0x0000000008000002L});
	public static final BitSet FOLLOW_27_in_argument722 = new BitSet(new long[]{0x0000000010886400L});
	public static final BitSet FOLLOW_arg_in_argument724 = new BitSet(new long[]{0x0000000008000002L});
	public static final BitSet FOLLOW_arith_expression_in_arg743 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_arg749 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arith_expression_in_cond_expression786 = new BitSet(new long[]{0x0000001D80400002L});
	public static final BitSet FOLLOW_op_in_cond_expression816 = new BitSet(new long[]{0x0000000010806400L});
	public static final BitSet FOLLOW_arith_expression_in_cond_expression818 = new BitSet(new long[]{0x0000001D80400002L});
	public static final BitSet FOLLOW_multExpr_in_arith_expression873 = new BitSet(new long[]{0x0000000014000002L});
	public static final BitSet FOLLOW_26_in_arith_expression896 = new BitSet(new long[]{0x0000000010806400L});
	public static final BitSet FOLLOW_multExpr_in_arith_expression900 = new BitSet(new long[]{0x0000000014000002L});
	public static final BitSet FOLLOW_28_in_arith_expression946 = new BitSet(new long[]{0x0000000010806400L});
	public static final BitSet FOLLOW_multExpr_in_arith_expression950 = new BitSet(new long[]{0x0000000014000002L});
	public static final BitSet FOLLOW_signExpr_in_multExpr1037 = new BitSet(new long[]{0x0000000022000002L});
	public static final BitSet FOLLOW_25_in_multExpr1053 = new BitSet(new long[]{0x0000000010806400L});
	public static final BitSet FOLLOW_signExpr_in_multExpr1057 = new BitSet(new long[]{0x0000000022000002L});
	public static final BitSet FOLLOW_29_in_multExpr1083 = new BitSet(new long[]{0x0000000010806400L});
	public static final BitSet FOLLOW_signExpr_in_multExpr1087 = new BitSet(new long[]{0x0000000022000002L});
	public static final BitSet FOLLOW_primaryExpr_in_signExpr1131 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_28_in_signExpr1146 = new BitSet(new long[]{0x0000000000806400L});
	public static final BitSet FOLLOW_primaryExpr_in_signExpr1148 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Integer_constant_in_primaryExpr1178 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Floating_point_constant_in_primaryExpr1202 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_primaryExpr1231 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_23_in_primaryExpr1248 = new BitSet(new long[]{0x0000000010806400L});
	public static final BitSet FOLLOW_arith_expression_in_primaryExpr1252 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_primaryExpr1254 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_31_in_op1289 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_35_in_op1299 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_32_in_op1309 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_36_in_op1319 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_34_in_op1329 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_22_in_op1339 = new BitSet(new long[]{0x0000000000000002L});
}
