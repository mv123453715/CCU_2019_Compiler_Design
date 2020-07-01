// $ANTLR 3.5.2 myChecker.g 2020-05-30 14:54:35

    // import packages here.
    import java.util.HashMap;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class myCheckerParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "BOOL", "BREAK", "CASE", "CHAR", 
		"COMMENT", "CONTINUE", "DEFAULT", "DOUBLE", "ELSE", "FLOAT", "FOR", "Floating_point_constant", 
		"IF", "INCLUDE_TYPE", "INT", "Identifier", "Integer_constant", "MAIN", 
		"PRINTF", "RETURN_TYPE", "SCANF", "STRING_TYPE", "SWITCH", "VOID", "WHILE", 
		"WS", "'!='", "'%='", "'('", "')'", "'*'", "'*='", "'+'", "'++'", "'+='", 
		"','", "'-'", "'--'", "'-='", "'/'", "'/='", "':'", "';'", "'<'", "'<='", 
		"'='", "'=='", "'>'", "'>='", "'{'", "'}'"
	};
	public static final int EOF=-1;
	public static final int T__30=30;
	public static final int T__31=31;
	public static final int T__32=32;
	public static final int T__33=33;
	public static final int T__34=34;
	public static final int T__35=35;
	public static final int T__36=36;
	public static final int T__37=37;
	public static final int T__38=38;
	public static final int T__39=39;
	public static final int T__40=40;
	public static final int T__41=41;
	public static final int T__42=42;
	public static final int T__43=43;
	public static final int T__44=44;
	public static final int T__45=45;
	public static final int T__46=46;
	public static final int T__47=47;
	public static final int T__48=48;
	public static final int T__49=49;
	public static final int T__50=50;
	public static final int T__51=51;
	public static final int T__52=52;
	public static final int T__53=53;
	public static final int T__54=54;
	public static final int BOOL=4;
	public static final int BREAK=5;
	public static final int CASE=6;
	public static final int CHAR=7;
	public static final int COMMENT=8;
	public static final int CONTINUE=9;
	public static final int DEFAULT=10;
	public static final int DOUBLE=11;
	public static final int ELSE=12;
	public static final int FLOAT=13;
	public static final int FOR=14;
	public static final int Floating_point_constant=15;
	public static final int IF=16;
	public static final int INCLUDE_TYPE=17;
	public static final int INT=18;
	public static final int Identifier=19;
	public static final int Integer_constant=20;
	public static final int MAIN=21;
	public static final int PRINTF=22;
	public static final int RETURN_TYPE=23;
	public static final int SCANF=24;
	public static final int STRING_TYPE=25;
	public static final int SWITCH=26;
	public static final int VOID=27;
	public static final int WHILE=28;
	public static final int WS=29;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public myCheckerParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public myCheckerParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return myCheckerParser.tokenNames; }
	@Override public String getGrammarFileName() { return "myChecker.g"; }


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



	// $ANTLR start "program"
	// myChecker.g:38:1: program : ( INCLUDE_TYPE )* ( main_start | fun ) ;
	public final void program() throws RecognitionException {
		try {
			// myChecker.g:38:8: ( ( INCLUDE_TYPE )* ( main_start | fun ) )
			// myChecker.g:38:9: ( INCLUDE_TYPE )* ( main_start | fun )
			{
			// myChecker.g:38:9: ( INCLUDE_TYPE )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==INCLUDE_TYPE) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// myChecker.g:38:10: INCLUDE_TYPE
					{
					match(input,INCLUDE_TYPE,FOLLOW_INCLUDE_TYPE_in_program21); 
					}
					break;

				default :
					break loop1;
				}
			}

			// myChecker.g:38:25: ( main_start | fun )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==VOID) ) {
				alt2=1;
			}
			else if ( (LA2_0==BOOL||LA2_0==CHAR||LA2_0==DOUBLE||LA2_0==FLOAT||LA2_0==INT) ) {
				alt2=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// myChecker.g:38:26: main_start
					{
					pushFollow(FOLLOW_main_start_in_program26);
					main_start();
					state._fsp--;

					}
					break;
				case 2 :
					// myChecker.g:38:37: fun
					{
					pushFollow(FOLLOW_fun_in_program28);
					fun();
					state._fsp--;

					}
					break;

			}

			if (TRACEON) System.out.println("program:(INCLUDE_TYPE )* main_start");
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



	// $ANTLR start "fun"
	// myChecker.g:40:1: fun : type Identifier '(' ( type Identifier ( ',' )? )* ')' '{' declarations statements return_end '}' ( fun | main_start ) ;
	public final void fun() throws RecognitionException {
		try {
			// myChecker.g:40:4: ( type Identifier '(' ( type Identifier ( ',' )? )* ')' '{' declarations statements return_end '}' ( fun | main_start ) )
			// myChecker.g:40:6: type Identifier '(' ( type Identifier ( ',' )? )* ')' '{' declarations statements return_end '}' ( fun | main_start )
			{
			pushFollow(FOLLOW_type_in_fun39);
			type();
			state._fsp--;

			match(input,Identifier,FOLLOW_Identifier_in_fun41); 
			match(input,32,FOLLOW_32_in_fun43); 
			// myChecker.g:40:27: ( type Identifier ( ',' )? )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==BOOL||LA4_0==CHAR||LA4_0==DOUBLE||LA4_0==FLOAT||LA4_0==INT) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// myChecker.g:40:28: type Identifier ( ',' )?
					{
					pushFollow(FOLLOW_type_in_fun47);
					type();
					state._fsp--;

					match(input,Identifier,FOLLOW_Identifier_in_fun49); 
					// myChecker.g:40:44: ( ',' )?
					int alt3=2;
					int LA3_0 = input.LA(1);
					if ( (LA3_0==39) ) {
						alt3=1;
					}
					switch (alt3) {
						case 1 :
							// myChecker.g:40:44: ','
							{
							match(input,39,FOLLOW_39_in_fun51); 
							}
							break;

					}

					}
					break;

				default :
					break loop4;
				}
			}

			match(input,33,FOLLOW_33_in_fun56); 
			match(input,53,FOLLOW_53_in_fun58); 
			pushFollow(FOLLOW_declarations_in_fun60);
			declarations();
			state._fsp--;

			pushFollow(FOLLOW_statements_in_fun62);
			statements();
			state._fsp--;

			pushFollow(FOLLOW_return_end_in_fun64);
			return_end();
			state._fsp--;

			match(input,54,FOLLOW_54_in_fun66); 
			// myChecker.g:40:98: ( fun | main_start )
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==BOOL||LA5_0==CHAR||LA5_0==DOUBLE||LA5_0==FLOAT||LA5_0==INT) ) {
				alt5=1;
			}
			else if ( (LA5_0==VOID) ) {
				alt5=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :
					// myChecker.g:40:99: fun
					{
					pushFollow(FOLLOW_fun_in_fun69);
					fun();
					state._fsp--;

					}
					break;
				case 2 :
					// myChecker.g:40:103: main_start
					{
					pushFollow(FOLLOW_main_start_in_fun71);
					main_start();
					state._fsp--;

					}
					break;

			}

			if (TRACEON) System.out.println("fun: type Identifier ( (type Identifier ',')* ) { declarations statements return_end } (fun|main_start)");
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
	// $ANTLR end "fun"



	// $ANTLR start "main_start"
	// myChecker.g:43:1: main_start : VOID MAIN '(' ')' '{' declarations statements ( return_end )? '}' ;
	public final void main_start() throws RecognitionException {
		try {
			// myChecker.g:43:11: ( VOID MAIN '(' ')' '{' declarations statements ( return_end )? '}' )
			// myChecker.g:43:12: VOID MAIN '(' ')' '{' declarations statements ( return_end )? '}'
			{
			match(input,VOID,FOLLOW_VOID_in_main_start85); 
			match(input,MAIN,FOLLOW_MAIN_in_main_start87); 
			match(input,32,FOLLOW_32_in_main_start89); 
			match(input,33,FOLLOW_33_in_main_start91); 
			match(input,53,FOLLOW_53_in_main_start93); 
			pushFollow(FOLLOW_declarations_in_main_start95);
			declarations();
			state._fsp--;

			pushFollow(FOLLOW_statements_in_main_start97);
			statements();
			state._fsp--;

			// myChecker.g:43:58: ( return_end )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==RETURN_TYPE) ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// myChecker.g:43:58: return_end
					{
					pushFollow(FOLLOW_return_end_in_main_start99);
					return_end();
					state._fsp--;

					}
					break;

			}

			match(input,54,FOLLOW_54_in_main_start102); 
			if (TRACEON) System.out.println("VOID MAIN () {declarations statements return_end?}");
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
	// $ANTLR end "main_start"



	// $ANTLR start "return_end"
	// myChecker.g:46:1: return_end : RETURN_TYPE ( Integer_constant ';' | Floating_point_constant ';' | Identifier ';' ) ;
	public final void return_end() throws RecognitionException {
		try {
			// myChecker.g:46:11: ( RETURN_TYPE ( Integer_constant ';' | Floating_point_constant ';' | Identifier ';' ) )
			// myChecker.g:46:12: RETURN_TYPE ( Integer_constant ';' | Floating_point_constant ';' | Identifier ';' )
			{
			match(input,RETURN_TYPE,FOLLOW_RETURN_TYPE_in_return_end126); 
			// myChecker.g:46:24: ( Integer_constant ';' | Floating_point_constant ';' | Identifier ';' )
			int alt7=3;
			switch ( input.LA(1) ) {
			case Integer_constant:
				{
				alt7=1;
				}
				break;
			case Floating_point_constant:
				{
				alt7=2;
				}
				break;
			case Identifier:
				{
				alt7=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}
			switch (alt7) {
				case 1 :
					// myChecker.g:46:25: Integer_constant ';'
					{
					match(input,Integer_constant,FOLLOW_Integer_constant_in_return_end129); 
					match(input,46,FOLLOW_46_in_return_end131); 
					 if (TRACEON) System.out.println("return_end:RETURN_TYPE Integer_constant ;"); 
					}
					break;
				case 2 :
					// myChecker.g:47:12: Floating_point_constant ';'
					{
					match(input,Floating_point_constant,FOLLOW_Floating_point_constant_in_return_end145); 
					match(input,46,FOLLOW_46_in_return_end147); 
					 if (TRACEON) System.out.println("return_end:RETURN_TYPE Floating_point_constant ;"); 
					}
					break;
				case 3 :
					// myChecker.g:48:12: Identifier ';'
					{
					match(input,Identifier,FOLLOW_Identifier_in_return_end161); 
					match(input,46,FOLLOW_46_in_return_end163); 
					 if (TRACEON) System.out.println("return_end:RETURN_TYPE Identifier ;"); 
					}
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
	// $ANTLR end "return_end"



	// $ANTLR start "declarations"
	// myChecker.g:51:1: declarations : ( type Identifier ';' declarations | type Identifier '=' ( Integer_constant | Floating_point_constant | STRING_TYPE ) ';' declarations |);
	public final void declarations() throws RecognitionException {
		Token Identifier1=null;
		Token Identifier3=null;
		int type2 =0;
		int type4 =0;

		try {
			// myChecker.g:52:2: ( type Identifier ';' declarations | type Identifier '=' ( Integer_constant | Floating_point_constant | STRING_TYPE ) ';' declarations |)
			int alt8=3;
			switch ( input.LA(1) ) {
			case INT:
				{
				int LA8_1 = input.LA(2);
				if ( (LA8_1==34) ) {
					int LA8_7 = input.LA(3);
					if ( (LA8_7==Identifier) ) {
						int LA8_8 = input.LA(4);
						if ( (LA8_8==46) ) {
							alt8=1;
						}
						else if ( (LA8_8==49) ) {
							alt8=2;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 8, 8, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 8, 7, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( (LA8_1==Identifier) ) {
					int LA8_8 = input.LA(3);
					if ( (LA8_8==46) ) {
						alt8=1;
					}
					else if ( (LA8_8==49) ) {
						alt8=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 8, 8, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 8, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case FLOAT:
				{
				int LA8_2 = input.LA(2);
				if ( (LA8_2==34) ) {
					int LA8_9 = input.LA(3);
					if ( (LA8_9==Identifier) ) {
						int LA8_8 = input.LA(4);
						if ( (LA8_8==46) ) {
							alt8=1;
						}
						else if ( (LA8_8==49) ) {
							alt8=2;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 8, 8, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 8, 9, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( (LA8_2==Identifier) ) {
					int LA8_8 = input.LA(3);
					if ( (LA8_8==46) ) {
						alt8=1;
					}
					else if ( (LA8_8==49) ) {
						alt8=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 8, 8, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 8, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case DOUBLE:
				{
				int LA8_3 = input.LA(2);
				if ( (LA8_3==34) ) {
					int LA8_10 = input.LA(3);
					if ( (LA8_10==Identifier) ) {
						int LA8_8 = input.LA(4);
						if ( (LA8_8==46) ) {
							alt8=1;
						}
						else if ( (LA8_8==49) ) {
							alt8=2;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 8, 8, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 8, 10, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( (LA8_3==Identifier) ) {
					int LA8_8 = input.LA(3);
					if ( (LA8_8==46) ) {
						alt8=1;
					}
					else if ( (LA8_8==49) ) {
						alt8=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 8, 8, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 8, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case CHAR:
				{
				int LA8_4 = input.LA(2);
				if ( (LA8_4==34) ) {
					int LA8_11 = input.LA(3);
					if ( (LA8_11==Identifier) ) {
						int LA8_8 = input.LA(4);
						if ( (LA8_8==46) ) {
							alt8=1;
						}
						else if ( (LA8_8==49) ) {
							alt8=2;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 8, 8, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 8, 11, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( (LA8_4==Identifier) ) {
					int LA8_8 = input.LA(3);
					if ( (LA8_8==46) ) {
						alt8=1;
					}
					else if ( (LA8_8==49) ) {
						alt8=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 8, 8, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 8, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case BOOL:
				{
				int LA8_5 = input.LA(2);
				if ( (LA8_5==Identifier) ) {
					int LA8_8 = input.LA(3);
					if ( (LA8_8==46) ) {
						alt8=1;
					}
					else if ( (LA8_8==49) ) {
						alt8=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 8, 8, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 8, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case BREAK:
			case CASE:
			case CONTINUE:
			case DEFAULT:
			case ELSE:
			case FOR:
			case IF:
			case Identifier:
			case Integer_constant:
			case PRINTF:
			case RETURN_TYPE:
			case SCANF:
			case SWITCH:
			case WHILE:
			case 37:
			case 41:
			case 54:
				{
				alt8=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}
			switch (alt8) {
				case 1 :
					// myChecker.g:52:4: type Identifier ';' declarations
					{
					pushFollow(FOLLOW_type_in_declarations185);
					type2=type();
					state._fsp--;

					Identifier1=(Token)match(input,Identifier,FOLLOW_Identifier_in_declarations187); 
					match(input,46,FOLLOW_46_in_declarations189); 
					pushFollow(FOLLOW_declarations_in_declarations191);
					declarations();
					state._fsp--;


						   if (TRACEON) System.out.println("declarations: type Identifier : declarations");
						 
					  	   if (symtab.containsKey((Identifier1!=null?Identifier1.getText():null))) {
							   System.out.println("Type Error: " + 
									              Identifier1.getLine() + 
												  ": Redeclared identifier.");
						   } else {
							   /* Add ID and its attr_type into the symbol table. */
							   symtab.put((Identifier1!=null?Identifier1.getText():null), type2);	   
						   }
						 
					}
					break;
				case 2 :
					// myChecker.g:65:4: type Identifier '=' ( Integer_constant | Floating_point_constant | STRING_TYPE ) ';' declarations
					{
					pushFollow(FOLLOW_type_in_declarations203);
					type4=type();
					state._fsp--;

					Identifier3=(Token)match(input,Identifier,FOLLOW_Identifier_in_declarations205); 
					match(input,49,FOLLOW_49_in_declarations207); 
					if ( input.LA(1)==Floating_point_constant||input.LA(1)==Integer_constant||input.LA(1)==STRING_TYPE ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					match(input,46,FOLLOW_46_in_declarations217); 
					pushFollow(FOLLOW_declarations_in_declarations219);
					declarations();
					state._fsp--;

					 if (TRACEON) System.out.println("type Identifier '=' (Integer_constant|Floating_point_constant|STRING_TYPE) ';' declarations");
					  if (symtab.containsKey((Identifier3!=null?Identifier3.getText():null))) {
							   System.out.println("Type Error: " + 
									              Identifier3.getLine() + 
												  ": Redeclared identifier.");
						   } else {
							   /* Add ID and its attr_type into the symbol table. */
							   symtab.put((Identifier3!=null?Identifier3.getText():null), type4);	   
						   }
					  
					}
					break;
				case 3 :
					// myChecker.g:76:4: 
					{
					 if (TRACEON) System.out.println("declarations: "); 
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
	// myChecker.g:79:1: type returns [int attr_type] : ( INT | FLOAT | DOUBLE | CHAR | BOOL | INT '*' | FLOAT '*' | DOUBLE '*' | CHAR '*' );
	public final int type() throws RecognitionException {
		int attr_type = 0;


		try {
			// myChecker.g:80:2: ( INT | FLOAT | DOUBLE | CHAR | BOOL | INT '*' | FLOAT '*' | DOUBLE '*' | CHAR '*' )
			int alt9=9;
			switch ( input.LA(1) ) {
			case INT:
				{
				int LA9_1 = input.LA(2);
				if ( (LA9_1==34) ) {
					alt9=6;
				}
				else if ( (LA9_1==Identifier) ) {
					alt9=1;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 9, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case FLOAT:
				{
				int LA9_2 = input.LA(2);
				if ( (LA9_2==34) ) {
					alt9=7;
				}
				else if ( (LA9_2==Identifier) ) {
					alt9=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 9, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case DOUBLE:
				{
				int LA9_3 = input.LA(2);
				if ( (LA9_3==34) ) {
					alt9=8;
				}
				else if ( (LA9_3==Identifier) ) {
					alt9=3;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 9, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case CHAR:
				{
				int LA9_4 = input.LA(2);
				if ( (LA9_4==34) ) {
					alt9=9;
				}
				else if ( (LA9_4==Identifier) ) {
					alt9=4;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 9, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case BOOL:
				{
				alt9=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}
			switch (alt9) {
				case 1 :
					// myChecker.g:80:3: INT
					{
					match(input,INT,FOLLOW_INT_in_type242); 
					 if (TRACEON) System.out.println("type: INT");  attr_type = 1;  
					}
					break;
				case 2 :
					// myChecker.g:81:4: FLOAT
					{
					match(input,FLOAT,FOLLOW_FLOAT_in_type252); 
					 if (TRACEON) System.out.println("type: FLOAT");  attr_type = 2;   
					}
					break;
				case 3 :
					// myChecker.g:82:5: DOUBLE
					{
					match(input,DOUBLE,FOLLOW_DOUBLE_in_type260); 
					if (TRACEON) System.out.println("type: DOUBLE"); attr_type = 3; 
					}
					break;
				case 4 :
					// myChecker.g:83:5: CHAR
					{
					match(input,CHAR,FOLLOW_CHAR_in_type268); 
					if (TRACEON) System.out.println("type: CHAR");attr_type = 4;  
					}
					break;
				case 5 :
					// myChecker.g:84:5: BOOL
					{
					match(input,BOOL,FOLLOW_BOOL_in_type276); 
					if (TRACEON) System.out.println("type: CHAR");attr_type = 5;  
					}
					break;
				case 6 :
					// myChecker.g:85:5: INT '*'
					{
					match(input,INT,FOLLOW_INT_in_type284); 
					match(input,34,FOLLOW_34_in_type285); 
					 if (TRACEON) System.out.println("type: INT*");attr_type = 6; 
					}
					break;
				case 7 :
					// myChecker.g:86:5: FLOAT '*'
					{
					match(input,FLOAT,FOLLOW_FLOAT_in_type293); 
					match(input,34,FOLLOW_34_in_type294); 
					if (TRACEON) System.out.println("type: FLOAT*");attr_type = 7; 
					}
					break;
				case 8 :
					// myChecker.g:87:5: DOUBLE '*'
					{
					match(input,DOUBLE,FOLLOW_DOUBLE_in_type302); 
					match(input,34,FOLLOW_34_in_type303); 
					if (TRACEON) System.out.println("type: DOUBLE*");attr_type = 8; 
					}
					break;
				case 9 :
					// myChecker.g:88:5: CHAR '*'
					{
					match(input,CHAR,FOLLOW_CHAR_in_type311); 
					match(input,34,FOLLOW_34_in_type312); 
					if (TRACEON) System.out.println("type: CHAR*");attr_type = 9; 
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
	// myChecker.g:91:1: statements : ( statement statements |);
	public final void statements() throws RecognitionException {
		try {
			// myChecker.g:92:2: ( statement statements |)
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( ((LA10_0 >= BREAK && LA10_0 <= CASE)||(LA10_0 >= CONTINUE && LA10_0 <= DEFAULT)||LA10_0==ELSE||LA10_0==FOR||LA10_0==IF||LA10_0==Identifier||LA10_0==PRINTF||LA10_0==SCANF||LA10_0==SWITCH||LA10_0==WHILE||LA10_0==37||LA10_0==41) ) {
				alt10=1;
			}
			else if ( (LA10_0==RETURN_TYPE||LA10_0==54) ) {
				alt10=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}

			switch (alt10) {
				case 1 :
					// myChecker.g:92:3: statement statements
					{
					pushFollow(FOLLOW_statement_in_statements324);
					statement();
					state._fsp--;

					pushFollow(FOLLOW_statements_in_statements326);
					statements();
					state._fsp--;

					}
					break;
				case 2 :
					// myChecker.g:93:3: 
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


	public static class arith_expression_return extends ParserRuleReturnScope {
		public int attr_type;
	};


	// $ANTLR start "arith_expression"
	// myChecker.g:95:1: arith_expression returns [int attr_type] : a= multExpr ( '+' b= multExpr | '-' c= multExpr )* ;
	public final myCheckerParser.arith_expression_return arith_expression() throws RecognitionException {
		myCheckerParser.arith_expression_return retval = new myCheckerParser.arith_expression_return();
		retval.start = input.LT(1);

		ParserRuleReturnScope a =null;
		ParserRuleReturnScope b =null;
		ParserRuleReturnScope c =null;

		try {
			// myChecker.g:96:2: (a= multExpr ( '+' b= multExpr | '-' c= multExpr )* )
			// myChecker.g:96:4: a= multExpr ( '+' b= multExpr | '-' c= multExpr )*
			{
			pushFollow(FOLLOW_multExpr_in_arith_expression346);
			a=multExpr();
			state._fsp--;

			 retval.attr_type = (a!=null?((myCheckerParser.multExpr_return)a).attr_type:0); 
			// myChecker.g:97:7: ( '+' b= multExpr | '-' c= multExpr )*
			loop11:
			while (true) {
				int alt11=3;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==36) ) {
					alt11=1;
				}
				else if ( (LA11_0==40) ) {
					alt11=2;
				}

				switch (alt11) {
				case 1 :
					// myChecker.g:97:9: '+' b= multExpr
					{
					match(input,36,FOLLOW_36_in_arith_expression358); 
					pushFollow(FOLLOW_multExpr_in_arith_expression364);
					b=multExpr();
					state._fsp--;

					 if ((a!=null?((myCheckerParser.multExpr_return)a).attr_type:0) != (b!=null?((myCheckerParser.multExpr_return)b).attr_type:0)) {
								  System.out.println("Type Error: " + 
									                 (a!=null?(a.start):null).getLine() + 
											         ": Type mismatch a is " + (a!=null?((myCheckerParser.multExpr_return)a).attr_type:0) + ",b is " +(b!=null?((myCheckerParser.multExpr_return)b).attr_type:0) + "for the operator + in an expression.");
							      retval.attr_type = -2;
							  }//if
					      else {
					          //System.out.println( "(a!=null?((myCheckerParser.multExpr_return)a).attr_type:0) == (b!=null?((myCheckerParser.multExpr_return)b).attr_type:0) , " + "retval.attr_type : " + retval.attr_type + ",(a!=null?((myCheckerParser.multExpr_return)a).attr_type:0) : " + (a!=null?((myCheckerParser.multExpr_return)a).attr_type:0)  );
					          retval.attr_type =(a!=null?((myCheckerParser.multExpr_return)a).attr_type:0);
					          //return (a!=null?((myCheckerParser.multExpr_return)a).attr_type:0);
					      }//else
					        
					}
					break;
				case 2 :
					// myChecker.g:110:6: '-' c= multExpr
					{
					match(input,40,FOLLOW_40_in_arith_expression378); 
					pushFollow(FOLLOW_multExpr_in_arith_expression384);
					c=multExpr();
					state._fsp--;

					 if ((a!=null?((myCheckerParser.multExpr_return)a).attr_type:0) != (c!=null?((myCheckerParser.multExpr_return)c).attr_type:0)) {
								  System.out.println("Type Error: " + 
									                 (a!=null?(a.start):null).getLine() +
											         ": Type mismatch a is " + (a!=null?((myCheckerParser.multExpr_return)a).attr_type:0) + ",b is " +(b!=null?((myCheckerParser.multExpr_return)b).attr_type:0) + "for the operator - in an expression.");
							      retval.attr_type = -2;
							  }//if
					      else {
					          retval.attr_type =(a!=null?((myCheckerParser.multExpr_return)a).attr_type:0);
					          //if ( true ) return retval.attr_type;
					      }//else
					        
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
	// $ANTLR end "arith_expression"


	public static class multExpr_return extends ParserRuleReturnScope {
		public int attr_type;
	};


	// $ANTLR start "multExpr"
	// myChecker.g:125:1: multExpr returns [int attr_type] : a= signExpr ( '*' b= signExpr | '/' c= signExpr )* ;
	public final myCheckerParser.multExpr_return multExpr() throws RecognitionException {
		myCheckerParser.multExpr_return retval = new myCheckerParser.multExpr_return();
		retval.start = input.LT(1);

		ParserRuleReturnScope a =null;
		ParserRuleReturnScope b =null;
		ParserRuleReturnScope c =null;

		try {
			// myChecker.g:126:2: (a= signExpr ( '*' b= signExpr | '/' c= signExpr )* )
			// myChecker.g:126:4: a= signExpr ( '*' b= signExpr | '/' c= signExpr )*
			{
			pushFollow(FOLLOW_signExpr_in_multExpr417);
			a=signExpr();
			state._fsp--;

			 retval.attr_type = (a!=null?((myCheckerParser.signExpr_return)a).attr_type:0); 
			// myChecker.g:127:7: ( '*' b= signExpr | '/' c= signExpr )*
			loop12:
			while (true) {
				int alt12=3;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==34) ) {
					alt12=1;
				}
				else if ( (LA12_0==43) ) {
					alt12=2;
				}

				switch (alt12) {
				case 1 :
					// myChecker.g:127:9: '*' b= signExpr
					{
					match(input,34,FOLLOW_34_in_multExpr429); 
					pushFollow(FOLLOW_signExpr_in_multExpr435);
					b=signExpr();
					state._fsp--;

					 if ((a!=null?((myCheckerParser.signExpr_return)a).attr_type:0) != (b!=null?((myCheckerParser.signExpr_return)b).attr_type:0)) {
								  System.out.println("Type Error: " + 
									                 (a!=null?(a.start):null).getLine() +
											         ": Type mismatch a is " + (a!=null?((myCheckerParser.signExpr_return)a).attr_type:0) + ",b is " +(b!=null?((myCheckerParser.signExpr_return)b).attr_type:0) + "for the operator * in an expression.");
							      retval.attr_type = -2;
							  }
					        
					}
					break;
				case 2 :
					// myChecker.g:135:9: '/' c= signExpr
					{
					match(input,43,FOLLOW_43_in_multExpr453); 
					pushFollow(FOLLOW_signExpr_in_multExpr459);
					c=signExpr();
					state._fsp--;

					 if ((a!=null?((myCheckerParser.signExpr_return)a).attr_type:0) != (c!=null?((myCheckerParser.signExpr_return)c).attr_type:0)) {
								  System.out.println("Type Error: " + 
									                 (a!=null?(a.start):null).getLine() +
											         ": Type mismatch a is " + (a!=null?((myCheckerParser.signExpr_return)a).attr_type:0) + ",b is " +(b!=null?((myCheckerParser.signExpr_return)b).attr_type:0) + "for the operator / in an expression.");
							      retval.attr_type = -2;
							  }
					        
					}
					break;

				default :
					break loop12;
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
		public int attr_type;
	};


	// $ANTLR start "signExpr"
	// myChecker.g:150:1: signExpr returns [int attr_type] : ( primaryExpr | '-' primaryExpr );
	public final myCheckerParser.signExpr_return signExpr() throws RecognitionException {
		myCheckerParser.signExpr_return retval = new myCheckerParser.signExpr_return();
		retval.start = input.LT(1);

		int primaryExpr5 =0;

		try {
			// myChecker.g:151:2: ( primaryExpr | '-' primaryExpr )
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==Floating_point_constant||(LA13_0 >= Identifier && LA13_0 <= Integer_constant)||LA13_0==32) ) {
				alt13=1;
			}
			else if ( (LA13_0==40) ) {
				alt13=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}

			switch (alt13) {
				case 1 :
					// myChecker.g:151:4: primaryExpr
					{
					pushFollow(FOLLOW_primaryExpr_in_signExpr492);
					primaryExpr5=primaryExpr();
					state._fsp--;

					 retval.attr_type = primaryExpr5; 
					}
					break;
				case 2 :
					// myChecker.g:152:4: '-' primaryExpr
					{
					match(input,40,FOLLOW_40_in_signExpr499); 
					pushFollow(FOLLOW_primaryExpr_in_signExpr501);
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
	// myChecker.g:155:1: primaryExpr returns [int attr_type] : ( Integer_constant | Floating_point_constant | Identifier | '(' arith_expression ')' );
	public final int primaryExpr() throws RecognitionException {
		int attr_type = 0;


		Token Identifier6=null;
		ParserRuleReturnScope arith_expression7 =null;

		try {
			// myChecker.g:156:2: ( Integer_constant | Floating_point_constant | Identifier | '(' arith_expression ')' )
			int alt14=4;
			switch ( input.LA(1) ) {
			case Integer_constant:
				{
				alt14=1;
				}
				break;
			case Floating_point_constant:
				{
				alt14=2;
				}
				break;
			case Identifier:
				{
				alt14=3;
				}
				break;
			case 32:
				{
				alt14=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}
			switch (alt14) {
				case 1 :
					// myChecker.g:156:4: Integer_constant
					{
					match(input,Integer_constant,FOLLOW_Integer_constant_in_primaryExpr521); 
					 attr_type = 1; 
					}
					break;
				case 2 :
					// myChecker.g:157:4: Floating_point_constant
					{
					match(input,Floating_point_constant,FOLLOW_Floating_point_constant_in_primaryExpr535); 
					 attr_type = 2; 
					}
					break;
				case 3 :
					// myChecker.g:158:4: Identifier
					{
					Identifier6=(Token)match(input,Identifier,FOLLOW_Identifier_in_primaryExpr542); 
					  attr_type = symtab.get((Identifier6!=null?Identifier6.getText():null)); 
					}
					break;
				case 4 :
					// myChecker.g:159:4: '(' arith_expression ')'
					{
					match(input,32,FOLLOW_32_in_primaryExpr549); 
					pushFollow(FOLLOW_arith_expression_in_primaryExpr551);
					arith_expression7=arith_expression();
					state._fsp--;

					match(input,33,FOLLOW_33_in_primaryExpr553); 
					 attr_type = (arith_expression7!=null?((myCheckerParser.arith_expression_return)arith_expression7).attr_type:0); 
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



	// $ANTLR start "overloaded_op"
	// myChecker.g:162:1: overloaded_op returns [int attr_type] : ( Identifier '+=' arith_expression | Identifier '-=' arith_expression | Identifier '/=' arith_expression | Identifier '*=' arith_expression | Identifier '%=' arith_expression );
	public final int overloaded_op() throws RecognitionException {
		int attr_type = 0;


		Token Identifier8=null;
		Token Identifier10=null;
		Token Identifier12=null;
		Token Identifier14=null;
		Token Identifier16=null;
		ParserRuleReturnScope arith_expression9 =null;
		ParserRuleReturnScope arith_expression11 =null;
		ParserRuleReturnScope arith_expression13 =null;
		ParserRuleReturnScope arith_expression15 =null;
		ParserRuleReturnScope arith_expression17 =null;

		try {
			// myChecker.g:163:3: ( Identifier '+=' arith_expression | Identifier '-=' arith_expression | Identifier '/=' arith_expression | Identifier '*=' arith_expression | Identifier '%=' arith_expression )
			int alt15=5;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==Identifier) ) {
				switch ( input.LA(2) ) {
				case 38:
					{
					alt15=1;
					}
					break;
				case 42:
					{
					alt15=2;
					}
					break;
				case 44:
					{
					alt15=3;
					}
					break;
				case 35:
					{
					alt15=4;
					}
					break;
				case 31:
					{
					alt15=5;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 15, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}

			switch (alt15) {
				case 1 :
					// myChecker.g:163:5: Identifier '+=' arith_expression
					{
					Identifier8=(Token)match(input,Identifier,FOLLOW_Identifier_in_overloaded_op576); 
					match(input,38,FOLLOW_38_in_overloaded_op578); 
					pushFollow(FOLLOW_arith_expression_in_overloaded_op580);
					arith_expression9=arith_expression();
					state._fsp--;

					if (TRACEON) System.out.println("Identifier (\'+=\' arith_expression"); 
					  if (symtab.containsKey((Identifier8!=null?Identifier8.getText():null))) {
						       attr_type = symtab.get((Identifier8!=null?Identifier8.getText():null));
						   } else {
					          System.out.println("Type Error: " + (arith_expression9!=null?(arith_expression9.start):null).getLine() +": Type mismatch for the two silde operands in an assignment statement.");
						       attr_type = -2;
							   return attr_type;
						   }
							
						   if (attr_type != (arith_expression9!=null?((myCheckerParser.arith_expression_return)arith_expression9).attr_type:0)) {
					            //System.out.println( "attr_type: " + attr_type+ ", (arith_expression9!=null?((myCheckerParser.arith_expression_return)arith_expression9).attr_type:0) : " + (arith_expression9!=null?((myCheckerParser.arith_expression_return)arith_expression9).attr_type:0));
					            System.out.println("Type Error: " + 
									              (arith_expression9!=null?(arith_expression9.start):null).getLine() +
											      ": Type mismatch for the two silde operands in an assignment statement.");
							   attr_type = -2;
					     return attr_type;
					    }
					}
					break;
				case 2 :
					// myChecker.g:180:4: Identifier '-=' arith_expression
					{
					Identifier10=(Token)match(input,Identifier,FOLLOW_Identifier_in_overloaded_op587); 
					match(input,42,FOLLOW_42_in_overloaded_op589); 
					pushFollow(FOLLOW_arith_expression_in_overloaded_op591);
					arith_expression11=arith_expression();
					state._fsp--;

					if (TRACEON) System.out.println("Identifier (\'-=\' arith_expression"); 
					  if (symtab.containsKey((Identifier10!=null?Identifier10.getText():null))) {
						       attr_type = symtab.get((Identifier10!=null?Identifier10.getText():null));
						   } else {
					          System.out.println("Type Error: " + (arith_expression11!=null?(arith_expression11.start):null).getLine() +": Type mismatch for the two silde operands in an assignment statement.");
						       attr_type = -2;
							   return attr_type;
						   }
							
						   if (attr_type != (arith_expression11!=null?((myCheckerParser.arith_expression_return)arith_expression11).attr_type:0)) {
					            //System.out.println( "attr_type: " + attr_type+ ", (arith_expression11!=null?((myCheckerParser.arith_expression_return)arith_expression11).attr_type:0) : " + (arith_expression11!=null?((myCheckerParser.arith_expression_return)arith_expression11).attr_type:0));
					            System.out.println("Type Error: " + 
									              (arith_expression11!=null?(arith_expression11.start):null).getLine() +
											      ": Type mismatch for the two silde operands in an assignment statement.");
							   attr_type = -2;
					     return attr_type;
					    }
					}
					break;
				case 3 :
					// myChecker.g:197:4: Identifier '/=' arith_expression
					{
					Identifier12=(Token)match(input,Identifier,FOLLOW_Identifier_in_overloaded_op598); 
					match(input,44,FOLLOW_44_in_overloaded_op600); 
					pushFollow(FOLLOW_arith_expression_in_overloaded_op602);
					arith_expression13=arith_expression();
					state._fsp--;

					if (TRACEON) System.out.println("Identifier (\'/=\' arith_expression"); 
					  if (symtab.containsKey((Identifier12!=null?Identifier12.getText():null))) {
						       attr_type = symtab.get((Identifier12!=null?Identifier12.getText():null));
						   } else {
					          System.out.println("Type Error: " + (arith_expression13!=null?(arith_expression13.start):null).getLine() +": Type mismatch for the two silde operands in an assignment statement.");
						       attr_type = -2;
							   return attr_type;
						   }
							
						   if (attr_type != (arith_expression13!=null?((myCheckerParser.arith_expression_return)arith_expression13).attr_type:0)) {
					            //System.out.println( "attr_type: " + attr_type+ ", (arith_expression13!=null?((myCheckerParser.arith_expression_return)arith_expression13).attr_type:0) : " + (arith_expression13!=null?((myCheckerParser.arith_expression_return)arith_expression13).attr_type:0));
					            System.out.println("Type Error: " + 
									              (arith_expression13!=null?(arith_expression13.start):null).getLine() +
											      ": Type mismatch for the two silde operands in an assignment statement.");
							   attr_type = -2;
					     return attr_type;
					    }
					}
					break;
				case 4 :
					// myChecker.g:214:4: Identifier '*=' arith_expression
					{
					Identifier14=(Token)match(input,Identifier,FOLLOW_Identifier_in_overloaded_op609); 
					match(input,35,FOLLOW_35_in_overloaded_op611); 
					pushFollow(FOLLOW_arith_expression_in_overloaded_op613);
					arith_expression15=arith_expression();
					state._fsp--;

					if (TRACEON) System.out.println("Identifier (\'*=\' arith_expression");
					  if (symtab.containsKey((Identifier14!=null?Identifier14.getText():null))) {
						       attr_type = symtab.get((Identifier14!=null?Identifier14.getText():null));
						   } else {
					          System.out.println("Type Error: " + (arith_expression15!=null?(arith_expression15.start):null).getLine() +": Type mismatch for the two silde operands in an assignment statement.");
						       attr_type = -2;
							   return attr_type;
						   }
							
						   if (attr_type != (arith_expression15!=null?((myCheckerParser.arith_expression_return)arith_expression15).attr_type:0)) {
					            //System.out.println( "attr_type: " + attr_type+ ", (arith_expression15!=null?((myCheckerParser.arith_expression_return)arith_expression15).attr_type:0) : " + (arith_expression15!=null?((myCheckerParser.arith_expression_return)arith_expression15).attr_type:0));
					            System.out.println("Type Error: " + 
									              (arith_expression15!=null?(arith_expression15.start):null).getLine() +
											      ": Type mismatch for the two silde operands in an assignment statement.");
							   attr_type = -2;
					     return attr_type;
					    }
					}
					break;
				case 5 :
					// myChecker.g:231:4: Identifier '%=' arith_expression
					{
					Identifier16=(Token)match(input,Identifier,FOLLOW_Identifier_in_overloaded_op620); 
					match(input,31,FOLLOW_31_in_overloaded_op622); 
					pushFollow(FOLLOW_arith_expression_in_overloaded_op624);
					arith_expression17=arith_expression();
					state._fsp--;

					if (TRACEON) System.out.println("Identifier (\'%=\' arith_expression"); 
					  if (symtab.containsKey((Identifier16!=null?Identifier16.getText():null))) {
						       attr_type = symtab.get((Identifier16!=null?Identifier16.getText():null));
						   } else {
					          System.out.println("Type Error: " + (arith_expression17!=null?(arith_expression17.start):null).getLine() +": Type mismatch for the two silde operands in an assignment statement.");
						       attr_type = -2;
							   return attr_type;
						   }
							
						   if (attr_type != (arith_expression17!=null?((myCheckerParser.arith_expression_return)arith_expression17).attr_type:0)) {
					            //System.out.println( "attr_type: " + attr_type+ ", (arith_expression17!=null?((myCheckerParser.arith_expression_return)arith_expression17).attr_type:0) : " + (arith_expression17!=null?((myCheckerParser.arith_expression_return)arith_expression17).attr_type:0));
					            System.out.println("Type Error: " + 
									              (arith_expression17!=null?(arith_expression17.start):null).getLine() +
											      ": Type mismatch for the two silde operands in an assignment statement.");
							   attr_type = -2;
					     return attr_type;
					    }
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
	// $ANTLR end "overloaded_op"



	// $ANTLR start "comparison_expression"
	// myChecker.g:251:1: comparison_expression returns [int attr_type] : ( Identifier '>=' Integer_constant | Identifier '==' Integer_constant | Identifier '<=' Integer_constant | Identifier '!=' Integer_constant | Identifier '>' Integer_constant | Identifier '<' Integer_constant | Integer_constant '>=' Identifier | Integer_constant '==' Identifier | Integer_constant '<=' Identifier | Integer_constant '!=' Identifier | Integer_constant '>' Identifier | Integer_constant '<' Identifier | Identifier '>=' Identifier | Identifier '==' Identifier | Identifier '<=' Identifier | Identifier '!=' Identifier | Identifier '>' Identifier | Identifier '<' Identifier );
	public final int comparison_expression() throws RecognitionException {
		int attr_type = 0;


		try {
			// myChecker.g:252:3: ( Identifier '>=' Integer_constant | Identifier '==' Integer_constant | Identifier '<=' Integer_constant | Identifier '!=' Integer_constant | Identifier '>' Integer_constant | Identifier '<' Integer_constant | Integer_constant '>=' Identifier | Integer_constant '==' Identifier | Integer_constant '<=' Identifier | Integer_constant '!=' Identifier | Integer_constant '>' Identifier | Integer_constant '<' Identifier | Identifier '>=' Identifier | Identifier '==' Identifier | Identifier '<=' Identifier | Identifier '!=' Identifier | Identifier '>' Identifier | Identifier '<' Identifier )
			int alt16=18;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==Identifier) ) {
				switch ( input.LA(2) ) {
				case 52:
					{
					int LA16_3 = input.LA(3);
					if ( (LA16_3==Integer_constant) ) {
						alt16=1;
					}
					else if ( (LA16_3==Identifier) ) {
						alt16=13;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 16, 3, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case 50:
					{
					int LA16_4 = input.LA(3);
					if ( (LA16_4==Integer_constant) ) {
						alt16=2;
					}
					else if ( (LA16_4==Identifier) ) {
						alt16=14;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 16, 4, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case 48:
					{
					int LA16_5 = input.LA(3);
					if ( (LA16_5==Integer_constant) ) {
						alt16=3;
					}
					else if ( (LA16_5==Identifier) ) {
						alt16=15;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 16, 5, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case 30:
					{
					int LA16_6 = input.LA(3);
					if ( (LA16_6==Integer_constant) ) {
						alt16=4;
					}
					else if ( (LA16_6==Identifier) ) {
						alt16=16;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 16, 6, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case 51:
					{
					int LA16_7 = input.LA(3);
					if ( (LA16_7==Integer_constant) ) {
						alt16=5;
					}
					else if ( (LA16_7==Identifier) ) {
						alt16=17;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 16, 7, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case 47:
					{
					int LA16_8 = input.LA(3);
					if ( (LA16_8==Integer_constant) ) {
						alt16=6;
					}
					else if ( (LA16_8==Identifier) ) {
						alt16=18;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 16, 8, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 16, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}
			else if ( (LA16_0==Integer_constant) ) {
				switch ( input.LA(2) ) {
				case 52:
					{
					alt16=7;
					}
					break;
				case 50:
					{
					alt16=8;
					}
					break;
				case 48:
					{
					alt16=9;
					}
					break;
				case 30:
					{
					alt16=10;
					}
					break;
				case 51:
					{
					alt16=11;
					}
					break;
				case 47:
					{
					alt16=12;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 16, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}

			switch (alt16) {
				case 1 :
					// myChecker.g:252:5: Identifier '>=' Integer_constant
					{
					match(input,Identifier,FOLLOW_Identifier_in_comparison_expression645); 
					match(input,52,FOLLOW_52_in_comparison_expression647); 
					match(input,Integer_constant,FOLLOW_Integer_constant_in_comparison_expression649); 
					if (TRACEON) System.out.println("comparison_expression: Identifier >= Integer_constant type:bool ");attr_type = 5; 
					}
					break;
				case 2 :
					// myChecker.g:253:4: Identifier '==' Integer_constant
					{
					match(input,Identifier,FOLLOW_Identifier_in_comparison_expression656); 
					match(input,50,FOLLOW_50_in_comparison_expression658); 
					match(input,Integer_constant,FOLLOW_Integer_constant_in_comparison_expression660); 
					if (TRACEON) System.out.println("comparison_expression: Identifier == Integer_constant type:bool");attr_type = 5; 
					}
					break;
				case 3 :
					// myChecker.g:254:4: Identifier '<=' Integer_constant
					{
					match(input,Identifier,FOLLOW_Identifier_in_comparison_expression667); 
					match(input,48,FOLLOW_48_in_comparison_expression669); 
					match(input,Integer_constant,FOLLOW_Integer_constant_in_comparison_expression671); 
					if (TRACEON) System.out.println("comparison_expression: Identifier <= Integer_constant type:bool"); attr_type = 5;
					}
					break;
				case 4 :
					// myChecker.g:255:4: Identifier '!=' Integer_constant
					{
					match(input,Identifier,FOLLOW_Identifier_in_comparison_expression678); 
					match(input,30,FOLLOW_30_in_comparison_expression680); 
					match(input,Integer_constant,FOLLOW_Integer_constant_in_comparison_expression682); 
					if (TRACEON) System.out.println("comparison_expression: Identifier != Integer_constant type:bool");attr_type = 5; 
					}
					break;
				case 5 :
					// myChecker.g:256:4: Identifier '>' Integer_constant
					{
					match(input,Identifier,FOLLOW_Identifier_in_comparison_expression689); 
					match(input,51,FOLLOW_51_in_comparison_expression691); 
					match(input,Integer_constant,FOLLOW_Integer_constant_in_comparison_expression693); 
					if (TRACEON) System.out.println("comparison_expression: Identifier > Integer_constant type:bool");attr_type = 5; 
					}
					break;
				case 6 :
					// myChecker.g:257:4: Identifier '<' Integer_constant
					{
					match(input,Identifier,FOLLOW_Identifier_in_comparison_expression700); 
					match(input,47,FOLLOW_47_in_comparison_expression702); 
					match(input,Integer_constant,FOLLOW_Integer_constant_in_comparison_expression704); 
					if (TRACEON) System.out.println("comparison_expression: Identifier < Integer_constant type:bool");attr_type = 5; 
					}
					break;
				case 7 :
					// myChecker.g:258:4: Integer_constant '>=' Identifier
					{
					match(input,Integer_constant,FOLLOW_Integer_constant_in_comparison_expression711); 
					match(input,52,FOLLOW_52_in_comparison_expression713); 
					match(input,Identifier,FOLLOW_Identifier_in_comparison_expression715); 
					if (TRACEON) System.out.println("comparison_expression: Integer_constant >= Identifier type:bool");attr_type = 5; 
					}
					break;
				case 8 :
					// myChecker.g:259:4: Integer_constant '==' Identifier
					{
					match(input,Integer_constant,FOLLOW_Integer_constant_in_comparison_expression722); 
					match(input,50,FOLLOW_50_in_comparison_expression724); 
					match(input,Identifier,FOLLOW_Identifier_in_comparison_expression726); 
					if (TRACEON) System.out.println("comparison_expression: Integer_constant == Identifier type:bool");attr_type = 5; 
					}
					break;
				case 9 :
					// myChecker.g:260:4: Integer_constant '<=' Identifier
					{
					match(input,Integer_constant,FOLLOW_Integer_constant_in_comparison_expression733); 
					match(input,48,FOLLOW_48_in_comparison_expression735); 
					match(input,Identifier,FOLLOW_Identifier_in_comparison_expression737); 
					if (TRACEON) System.out.println("comparison_expression: Integer_constant <= Identifier type:bool");attr_type = 5; 
					}
					break;
				case 10 :
					// myChecker.g:261:4: Integer_constant '!=' Identifier
					{
					match(input,Integer_constant,FOLLOW_Integer_constant_in_comparison_expression744); 
					match(input,30,FOLLOW_30_in_comparison_expression746); 
					match(input,Identifier,FOLLOW_Identifier_in_comparison_expression748); 
					if (TRACEON) System.out.println("comparison_expression: Integer_constant != Identifier type:bool");attr_type = 5; 
					}
					break;
				case 11 :
					// myChecker.g:262:4: Integer_constant '>' Identifier
					{
					match(input,Integer_constant,FOLLOW_Integer_constant_in_comparison_expression755); 
					match(input,51,FOLLOW_51_in_comparison_expression757); 
					match(input,Identifier,FOLLOW_Identifier_in_comparison_expression759); 
					if (TRACEON) System.out.println("comparison_expression: Integer_constant > Identifier type:bool");attr_type = 5; 
					}
					break;
				case 12 :
					// myChecker.g:263:4: Integer_constant '<' Identifier
					{
					match(input,Integer_constant,FOLLOW_Integer_constant_in_comparison_expression766); 
					match(input,47,FOLLOW_47_in_comparison_expression768); 
					match(input,Identifier,FOLLOW_Identifier_in_comparison_expression770); 
					if (TRACEON) System.out.println("comparison_expression: Integer_constant < Identifier type:bool");attr_type = 5; 
					}
					break;
				case 13 :
					// myChecker.g:264:4: Identifier '>=' Identifier
					{
					match(input,Identifier,FOLLOW_Identifier_in_comparison_expression777); 
					match(input,52,FOLLOW_52_in_comparison_expression779); 
					match(input,Identifier,FOLLOW_Identifier_in_comparison_expression781); 
					if (TRACEON) System.out.println("comparison_expression: Identifier >= Identifier type:bool");attr_type = 5; 
					}
					break;
				case 14 :
					// myChecker.g:265:4: Identifier '==' Identifier
					{
					match(input,Identifier,FOLLOW_Identifier_in_comparison_expression788); 
					match(input,50,FOLLOW_50_in_comparison_expression790); 
					match(input,Identifier,FOLLOW_Identifier_in_comparison_expression792); 
					if (TRACEON) System.out.println("comparison_expression: Identifier == Identifier type:bool");attr_type = 5; 
					}
					break;
				case 15 :
					// myChecker.g:266:4: Identifier '<=' Identifier
					{
					match(input,Identifier,FOLLOW_Identifier_in_comparison_expression799); 
					match(input,48,FOLLOW_48_in_comparison_expression801); 
					match(input,Identifier,FOLLOW_Identifier_in_comparison_expression803); 
					if (TRACEON) System.out.println("comparison_expression: Identifier <= Identifier type:bool");attr_type = 5; 
					}
					break;
				case 16 :
					// myChecker.g:267:4: Identifier '!=' Identifier
					{
					match(input,Identifier,FOLLOW_Identifier_in_comparison_expression810); 
					match(input,30,FOLLOW_30_in_comparison_expression812); 
					match(input,Identifier,FOLLOW_Identifier_in_comparison_expression814); 
					if (TRACEON) System.out.println("comparison_expression: Identifier != Identifier type:bool");attr_type = 5; 
					}
					break;
				case 17 :
					// myChecker.g:268:4: Identifier '>' Identifier
					{
					match(input,Identifier,FOLLOW_Identifier_in_comparison_expression821); 
					match(input,51,FOLLOW_51_in_comparison_expression823); 
					match(input,Identifier,FOLLOW_Identifier_in_comparison_expression825); 
					if (TRACEON) System.out.println("comparison_expression: Identifier > Identifier type:bool");attr_type = 5; 
					}
					break;
				case 18 :
					// myChecker.g:269:4: Identifier '<' Identifier
					{
					match(input,Identifier,FOLLOW_Identifier_in_comparison_expression832); 
					match(input,47,FOLLOW_47_in_comparison_expression834); 
					match(input,Identifier,FOLLOW_Identifier_in_comparison_expression836); 
					if (TRACEON) System.out.println("comparison_expression: Identifier < Identifier type:bool");attr_type = 5; 
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
	// $ANTLR end "comparison_expression"



	// $ANTLR start "incre_decre_expression"
	// myChecker.g:272:1: incre_decre_expression returns [int attr_type] : ( Identifier '++' | Identifier '--' | '++' Identifier | '--' Identifier );
	public final int incre_decre_expression() throws RecognitionException {
		int attr_type = 0;


		Token Identifier18=null;
		Token Identifier19=null;
		Token Identifier20=null;
		Token Identifier21=null;

		try {
			// myChecker.g:273:3: ( Identifier '++' | Identifier '--' | '++' Identifier | '--' Identifier )
			int alt17=4;
			switch ( input.LA(1) ) {
			case Identifier:
				{
				int LA17_1 = input.LA(2);
				if ( (LA17_1==37) ) {
					alt17=1;
				}
				else if ( (LA17_1==41) ) {
					alt17=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 17, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 37:
				{
				alt17=3;
				}
				break;
			case 41:
				{
				alt17=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 17, 0, input);
				throw nvae;
			}
			switch (alt17) {
				case 1 :
					// myChecker.g:273:4: Identifier '++'
					{
					Identifier18=(Token)match(input,Identifier,FOLLOW_Identifier_in_incre_decre_expression852); 
					match(input,37,FOLLOW_37_in_incre_decre_expression854); 
					if (TRACEON) System.out.println("incre_decre_expression:Identifier ++");symtab.get((Identifier18!=null?Identifier18.getText():null)); 
					}
					break;
				case 2 :
					// myChecker.g:274:4: Identifier '--'
					{
					Identifier19=(Token)match(input,Identifier,FOLLOW_Identifier_in_incre_decre_expression862); 
					match(input,41,FOLLOW_41_in_incre_decre_expression864); 
					if (TRACEON) System.out.println("incre_decre_expression:Identifier --");symtab.get((Identifier19!=null?Identifier19.getText():null)); 
					}
					break;
				case 3 :
					// myChecker.g:275:4: '++' Identifier
					{
					match(input,37,FOLLOW_37_in_incre_decre_expression872); 
					Identifier20=(Token)match(input,Identifier,FOLLOW_Identifier_in_incre_decre_expression874); 
					if (TRACEON) System.out.println("incre_decre_expression:++ Identifier ");symtab.get((Identifier20!=null?Identifier20.getText():null)); 
					}
					break;
				case 4 :
					// myChecker.g:276:4: '--' Identifier
					{
					match(input,41,FOLLOW_41_in_incre_decre_expression883); 
					Identifier21=(Token)match(input,Identifier,FOLLOW_Identifier_in_incre_decre_expression885); 
					if (TRACEON) System.out.println("incre_decre_expression:Identifier ");symtab.get((Identifier21!=null?Identifier21.getText():null)); 
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
	// $ANTLR end "incre_decre_expression"



	// $ANTLR start "statement"
	// myChecker.g:282:1: statement returns [int attr_type] : ( Identifier '=' arith_expression ';' | overloaded_op ';' | IF '(' ( comparison_expression ) ')' if_then_statements | IF '(' ( Identifier '=' arith_expression ) ')' if_then_statements | ELSE else_statements | WHILE '(' ( comparison_expression ) ')' while_statements | WHILE '(' ( Identifier '=' arith_expression ) ')' if_then_statements | FOR '(' declarations ( comparison_expression | Identifier '=' arith_expression ) ';' ( incre_decre_expression ) ')' for_statements | PRINTF printf_statement | SCANF scanf_statement | BREAK ';' | CONTINUE ';' | SWITCH '(' ( arith_expression | comparison_expression ) ')' swtich_statments | CASE ( Integer_constant | Floating_point_constant ) ':' statement | DEFAULT ':' statement | incre_decre_expression ';' | fun_call_statement ';' );
	public final int statement() throws RecognitionException {
		int attr_type = 0;


		Token Identifier22=null;
		ParserRuleReturnScope arith_expression23 =null;
		ParserRuleReturnScope arith_expression24 =null;
		ParserRuleReturnScope arith_expression25 =null;
		ParserRuleReturnScope arith_expression26 =null;

		try {
			// myChecker.g:283:2: ( Identifier '=' arith_expression ';' | overloaded_op ';' | IF '(' ( comparison_expression ) ')' if_then_statements | IF '(' ( Identifier '=' arith_expression ) ')' if_then_statements | ELSE else_statements | WHILE '(' ( comparison_expression ) ')' while_statements | WHILE '(' ( Identifier '=' arith_expression ) ')' if_then_statements | FOR '(' declarations ( comparison_expression | Identifier '=' arith_expression ) ';' ( incre_decre_expression ) ')' for_statements | PRINTF printf_statement | SCANF scanf_statement | BREAK ';' | CONTINUE ';' | SWITCH '(' ( arith_expression | comparison_expression ) ')' swtich_statments | CASE ( Integer_constant | Floating_point_constant ) ':' statement | DEFAULT ':' statement | incre_decre_expression ';' | fun_call_statement ';' )
			int alt20=17;
			switch ( input.LA(1) ) {
			case Identifier:
				{
				switch ( input.LA(2) ) {
				case 49:
					{
					alt20=1;
					}
					break;
				case 31:
				case 35:
				case 38:
				case 42:
				case 44:
					{
					alt20=2;
					}
					break;
				case 37:
				case 41:
					{
					alt20=16;
					}
					break;
				case 32:
					{
					alt20=17;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 20, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case IF:
				{
				int LA20_2 = input.LA(2);
				if ( (LA20_2==32) ) {
					int LA20_17 = input.LA(3);
					if ( (LA20_17==Identifier) ) {
						int LA20_19 = input.LA(4);
						if ( (LA20_19==30||(LA20_19 >= 47 && LA20_19 <= 48)||(LA20_19 >= 50 && LA20_19 <= 52)) ) {
							alt20=3;
						}
						else if ( (LA20_19==49) ) {
							alt20=4;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 20, 19, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}
					else if ( (LA20_17==Integer_constant) ) {
						alt20=3;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 20, 17, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 20, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case ELSE:
				{
				alt20=5;
				}
				break;
			case WHILE:
				{
				int LA20_4 = input.LA(2);
				if ( (LA20_4==32) ) {
					int LA20_18 = input.LA(3);
					if ( (LA20_18==Identifier) ) {
						int LA20_21 = input.LA(4);
						if ( (LA20_21==30||(LA20_21 >= 47 && LA20_21 <= 48)||(LA20_21 >= 50 && LA20_21 <= 52)) ) {
							alt20=6;
						}
						else if ( (LA20_21==49) ) {
							alt20=7;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 20, 21, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}
					else if ( (LA20_18==Integer_constant) ) {
						alt20=6;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 20, 18, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 20, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case FOR:
				{
				alt20=8;
				}
				break;
			case PRINTF:
				{
				alt20=9;
				}
				break;
			case SCANF:
				{
				alt20=10;
				}
				break;
			case BREAK:
				{
				alt20=11;
				}
				break;
			case CONTINUE:
				{
				alt20=12;
				}
				break;
			case SWITCH:
				{
				alt20=13;
				}
				break;
			case CASE:
				{
				alt20=14;
				}
				break;
			case DEFAULT:
				{
				alt20=15;
				}
				break;
			case 37:
			case 41:
				{
				alt20=16;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 20, 0, input);
				throw nvae;
			}
			switch (alt20) {
				case 1 :
					// myChecker.g:283:4: Identifier '=' arith_expression ';'
					{
					Identifier22=(Token)match(input,Identifier,FOLLOW_Identifier_in_statement908); 
					match(input,49,FOLLOW_49_in_statement910); 
					pushFollow(FOLLOW_arith_expression_in_statement912);
					arith_expression23=arith_expression();
					state._fsp--;

					match(input,46,FOLLOW_46_in_statement914); 

						   if (symtab.containsKey((Identifier22!=null?Identifier22.getText():null))) {
						       attr_type = symtab.get((Identifier22!=null?Identifier22.getText():null));
						   } else {
					           /* Add codes to report and handle this error */
					          //System.out.println( symtab.containsKey((Identifier22!=null?Identifier22.getText():null)) );
					          System.out.println("Type Error: " + 
									              (arith_expression23!=null?(arith_expression23.start):null).getLine() +
											      ": Type mismatch for the two silde operands in an assignment statement.");
						       attr_type = -2;
							   return attr_type;
						   }
							
						   if (attr_type != (arith_expression23!=null?((myCheckerParser.arith_expression_return)arith_expression23).attr_type:0)) {
					            //System.out.println( "attr_type: " + attr_type+ ", (arith_expression23!=null?((myCheckerParser.arith_expression_return)arith_expression23).attr_type:0) : " + (arith_expression23!=null?((myCheckerParser.arith_expression_return)arith_expression23).attr_type:0));
					            System.out.println("Type Error: " + 
									              (arith_expression23!=null?(arith_expression23.start):null).getLine() +
											      ": Type mismatch for the two silde operands in an assignment statement.");
							   attr_type = -2;
					     return attr_type;
					       }
						 
					}
					break;
				case 2 :
					// myChecker.g:306:5: overloaded_op ';'
					{
					pushFollow(FOLLOW_overloaded_op_in_statement924);
					overloaded_op();
					state._fsp--;

					match(input,46,FOLLOW_46_in_statement926); 
					if (TRACEON) System.out.println("statement: overloaded_op ;"); 
					}
					break;
				case 3 :
					// myChecker.g:307:4: IF '(' ( comparison_expression ) ')' if_then_statements
					{
					match(input,IF,FOLLOW_IF_in_statement933); 
					match(input,32,FOLLOW_32_in_statement935); 
					// myChecker.g:307:11: ( comparison_expression )
					// myChecker.g:307:12: comparison_expression
					{
					pushFollow(FOLLOW_comparison_expression_in_statement938);
					comparison_expression();
					state._fsp--;

					}

					match(input,33,FOLLOW_33_in_statement941); 
					pushFollow(FOLLOW_if_then_statements_in_statement943);
					if_then_statements();
					state._fsp--;

					if (TRACEON) System.out.println("statement: IF \'(\' (comparison_expression) \')\' if_then_statements");
					}
					break;
				case 4 :
					// myChecker.g:309:4: IF '(' ( Identifier '=' arith_expression ) ')' if_then_statements
					{
					match(input,IF,FOLLOW_IF_in_statement954); 
					match(input,32,FOLLOW_32_in_statement956); 
					// myChecker.g:309:11: ( Identifier '=' arith_expression )
					// myChecker.g:309:12: Identifier '=' arith_expression
					{
					match(input,Identifier,FOLLOW_Identifier_in_statement959); 
					match(input,49,FOLLOW_49_in_statement961); 
					pushFollow(FOLLOW_arith_expression_in_statement963);
					arith_expression24=arith_expression();
					state._fsp--;

					}

					match(input,33,FOLLOW_33_in_statement966); 
					pushFollow(FOLLOW_if_then_statements_in_statement968);
					if_then_statements();
					state._fsp--;

					if ((arith_expression24!=null?((myCheckerParser.arith_expression_return)arith_expression24).attr_type:0) != 5 ) {
					            //System.out.println( "attr_type: " + attr_type+ ", (arith_expression24!=null?((myCheckerParser.arith_expression_return)arith_expression24).attr_type:0) : " + (arith_expression24!=null?((myCheckerParser.arith_expression_return)arith_expression24).attr_type:0));
					            System.out.println("Type Error: " + 
									              (arith_expression24!=null?(arith_expression24.start):null).getLine() +
											      ": if condition is not bool ,please put bool in if condition.");
							   attr_type = -2;
					     return attr_type;}
					}
					break;
				case 5 :
					// myChecker.g:317:5: ELSE else_statements
					{
					match(input,ELSE,FOLLOW_ELSE_in_statement980); 
					pushFollow(FOLLOW_else_statements_in_statement983);
					else_statements();
					state._fsp--;

					if (TRACEON) System.out.println("statement: (ELSE  else_statements)?"); 
					}
					break;
				case 6 :
					// myChecker.g:318:5: WHILE '(' ( comparison_expression ) ')' while_statements
					{
					match(input,WHILE,FOLLOW_WHILE_in_statement992); 
					match(input,32,FOLLOW_32_in_statement994); 
					// myChecker.g:318:15: ( comparison_expression )
					// myChecker.g:318:16: comparison_expression
					{
					pushFollow(FOLLOW_comparison_expression_in_statement997);
					comparison_expression();
					state._fsp--;

					}

					match(input,33,FOLLOW_33_in_statement1000); 
					pushFollow(FOLLOW_while_statements_in_statement1002);
					while_statements();
					state._fsp--;

					if (TRACEON) System.out.println("statement: WHILE \'(\' (comparison_expression) \')\' while_statements"); 
					}
					break;
				case 7 :
					// myChecker.g:319:5: WHILE '(' ( Identifier '=' arith_expression ) ')' if_then_statements
					{
					match(input,WHILE,FOLLOW_WHILE_in_statement1011); 
					match(input,32,FOLLOW_32_in_statement1013); 
					// myChecker.g:319:15: ( Identifier '=' arith_expression )
					// myChecker.g:319:16: Identifier '=' arith_expression
					{
					match(input,Identifier,FOLLOW_Identifier_in_statement1016); 
					match(input,49,FOLLOW_49_in_statement1018); 
					pushFollow(FOLLOW_arith_expression_in_statement1020);
					arith_expression25=arith_expression();
					state._fsp--;

					}

					match(input,33,FOLLOW_33_in_statement1023); 
					pushFollow(FOLLOW_if_then_statements_in_statement1025);
					if_then_statements();
					state._fsp--;

					if ((arith_expression25!=null?((myCheckerParser.arith_expression_return)arith_expression25).attr_type:0) != 5 ) {
					            //System.out.println( "attr_type: " + attr_type+ ", (arith_expression25!=null?((myCheckerParser.arith_expression_return)arith_expression25).attr_type:0) : " + (arith_expression25!=null?((myCheckerParser.arith_expression_return)arith_expression25).attr_type:0));
					            System.out.println("Type Error: " + 
									              (arith_expression25!=null?(arith_expression25.start):null).getLine() +
											      ": WHILE condition is not bool ,please put bool in WHILE condition.");
							   attr_type = -2;
					     return attr_type;}
					}
					break;
				case 8 :
					// myChecker.g:327:5: FOR '(' declarations ( comparison_expression | Identifier '=' arith_expression ) ';' ( incre_decre_expression ) ')' for_statements
					{
					match(input,FOR,FOLLOW_FOR_in_statement1037); 
					match(input,32,FOLLOW_32_in_statement1039); 
					pushFollow(FOLLOW_declarations_in_statement1041);
					declarations();
					state._fsp--;

					// myChecker.g:327:26: ( comparison_expression | Identifier '=' arith_expression )
					int alt18=2;
					int LA18_0 = input.LA(1);
					if ( (LA18_0==Identifier) ) {
						int LA18_1 = input.LA(2);
						if ( (LA18_1==30||(LA18_1 >= 47 && LA18_1 <= 48)||(LA18_1 >= 50 && LA18_1 <= 52)) ) {
							alt18=1;
						}
						else if ( (LA18_1==49) ) {
							alt18=2;
						}

						else {
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 18, 1, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}
					else if ( (LA18_0==Integer_constant) ) {
						alt18=1;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 18, 0, input);
						throw nvae;
					}

					switch (alt18) {
						case 1 :
							// myChecker.g:327:27: comparison_expression
							{
							pushFollow(FOLLOW_comparison_expression_in_statement1044);
							comparison_expression();
							state._fsp--;

							}
							break;
						case 2 :
							// myChecker.g:327:49: Identifier '=' arith_expression
							{
							match(input,Identifier,FOLLOW_Identifier_in_statement1046); 
							match(input,49,FOLLOW_49_in_statement1048); 
							pushFollow(FOLLOW_arith_expression_in_statement1050);
							arith_expression26=arith_expression();
							state._fsp--;

							}
							break;

					}

					match(input,46,FOLLOW_46_in_statement1053); 
					// myChecker.g:327:86: ( incre_decre_expression )
					// myChecker.g:327:87: incre_decre_expression
					{
					pushFollow(FOLLOW_incre_decre_expression_in_statement1056);
					incre_decre_expression();
					state._fsp--;

					}

					match(input,33,FOLLOW_33_in_statement1059); 
					pushFollow(FOLLOW_for_statements_in_statement1061);
					for_statements();
					state._fsp--;

					if (TRACEON) System.out.println("FOR ( declarations ';'(comparison_expression) ; (Identifier '=' arith_expression|incre_decre_expression) ) for_statements"); 
					  if ((arith_expression26!=null?((myCheckerParser.arith_expression_return)arith_expression26).attr_type:0) != 5 ) {
					            //System.out.println( "attr_type: " + attr_type+ ", (arith_expression26!=null?((myCheckerParser.arith_expression_return)arith_expression26).attr_type:0) : " + (arith_expression26!=null?((myCheckerParser.arith_expression_return)arith_expression26).attr_type:0));
					            System.out.println("Type Error: " + 
									              (arith_expression26!=null?(arith_expression26.start):null).getLine() +
											      ": FOR condition is not bool ,please put bool in FOR condition.");
							   attr_type = -2;
					     return attr_type;}
					}
					break;
				case 9 :
					// myChecker.g:336:5: PRINTF printf_statement
					{
					match(input,PRINTF,FOLLOW_PRINTF_in_statement1073); 
					pushFollow(FOLLOW_printf_statement_in_statement1076);
					printf_statement();
					state._fsp--;

					if (TRACEON) System.out.println("statement: PRINTF  printf_statement"); 
					}
					break;
				case 10 :
					// myChecker.g:337:5: SCANF scanf_statement
					{
					match(input,SCANF,FOLLOW_SCANF_in_statement1085); 
					pushFollow(FOLLOW_scanf_statement_in_statement1088);
					scanf_statement();
					state._fsp--;

					if (TRACEON) System.out.println("statement: SCANF  scanf_statement"); 
					}
					break;
				case 11 :
					// myChecker.g:338:5: BREAK ';'
					{
					match(input,BREAK,FOLLOW_BREAK_in_statement1097); 
					match(input,46,FOLLOW_46_in_statement1099); 
					if (TRACEON) System.out.println("statement: BREAK ;"); 
					}
					break;
				case 12 :
					// myChecker.g:339:5: CONTINUE ';'
					{
					match(input,CONTINUE,FOLLOW_CONTINUE_in_statement1107); 
					match(input,46,FOLLOW_46_in_statement1109); 
					if (TRACEON) System.out.println("statement: CONTINUE ;"); 
					}
					break;
				case 13 :
					// myChecker.g:340:5: SWITCH '(' ( arith_expression | comparison_expression ) ')' swtich_statments
					{
					match(input,SWITCH,FOLLOW_SWITCH_in_statement1117); 
					match(input,32,FOLLOW_32_in_statement1119); 
					// myChecker.g:340:16: ( arith_expression | comparison_expression )
					int alt19=2;
					switch ( input.LA(1) ) {
					case Integer_constant:
						{
						int LA19_1 = input.LA(2);
						if ( (LA19_1==30||(LA19_1 >= 47 && LA19_1 <= 48)||(LA19_1 >= 50 && LA19_1 <= 52)) ) {
							alt19=2;
						}
						else if ( ((LA19_1 >= 33 && LA19_1 <= 34)||LA19_1==36||LA19_1==40||LA19_1==43) ) {
							alt19=1;
						}

						else {
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 19, 1, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case Floating_point_constant:
					case 32:
					case 40:
						{
						alt19=1;
						}
						break;
					case Identifier:
						{
						int LA19_3 = input.LA(2);
						if ( (LA19_3==30||(LA19_3 >= 47 && LA19_3 <= 48)||(LA19_3 >= 50 && LA19_3 <= 52)) ) {
							alt19=2;
						}
						else if ( ((LA19_3 >= 33 && LA19_3 <= 34)||LA19_3==36||LA19_3==40||LA19_3==43) ) {
							alt19=1;
						}

						else {
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 19, 3, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 19, 0, input);
						throw nvae;
					}
					switch (alt19) {
						case 1 :
							// myChecker.g:340:17: arith_expression
							{
							pushFollow(FOLLOW_arith_expression_in_statement1122);
							arith_expression();
							state._fsp--;

							}
							break;
						case 2 :
							// myChecker.g:340:34: comparison_expression
							{
							pushFollow(FOLLOW_comparison_expression_in_statement1124);
							comparison_expression();
							state._fsp--;

							}
							break;

					}

					match(input,33,FOLLOW_33_in_statement1127); 
					pushFollow(FOLLOW_swtich_statments_in_statement1129);
					swtich_statments();
					state._fsp--;

					if (TRACEON) System.out.println("statement: SWITCH ( (arith_expression|comparison_expression) ) swtich_statments"); 
					}
					break;
				case 14 :
					// myChecker.g:341:5: CASE ( Integer_constant | Floating_point_constant ) ':' statement
					{
					match(input,CASE,FOLLOW_CASE_in_statement1137); 
					if ( input.LA(1)==Floating_point_constant||input.LA(1)==Integer_constant ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					match(input,45,FOLLOW_45_in_statement1145); 
					pushFollow(FOLLOW_statement_in_statement1147);
					statement();
					state._fsp--;

					if (TRACEON) System.out.println("statement : CASE (Integer_constant|Floating_point_constant) : statement"); 
					}
					break;
				case 15 :
					// myChecker.g:342:5: DEFAULT ':' statement
					{
					match(input,DEFAULT,FOLLOW_DEFAULT_in_statement1155); 
					match(input,45,FOLLOW_45_in_statement1157); 
					pushFollow(FOLLOW_statement_in_statement1159);
					statement();
					state._fsp--;

					if (TRACEON) System.out.println("statement : DEFAULT : statement"); 
					}
					break;
				case 16 :
					// myChecker.g:343:5: incre_decre_expression ';'
					{
					pushFollow(FOLLOW_incre_decre_expression_in_statement1167);
					incre_decre_expression();
					state._fsp--;

					match(input,46,FOLLOW_46_in_statement1169); 
					if (TRACEON) System.out.println("statement : incre_decre_expression"); 
					}
					break;
				case 17 :
					// myChecker.g:344:5: fun_call_statement ';'
					{
					pushFollow(FOLLOW_fun_call_statement_in_statement1177);
					fun_call_statement();
					state._fsp--;

					match(input,46,FOLLOW_46_in_statement1179); 
					if (TRACEON) System.out.println("statement : fun_call_statement ; "); 
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
	// $ANTLR end "statement"



	// $ANTLR start "fun_call_statement"
	// myChecker.g:348:1: fun_call_statement : Identifier '(' ( Identifier ( ',' )? )* ')' ;
	public final void fun_call_statement() throws RecognitionException {
		try {
			// myChecker.g:348:20: ( Identifier '(' ( Identifier ( ',' )? )* ')' )
			// myChecker.g:348:22: Identifier '(' ( Identifier ( ',' )? )* ')'
			{
			match(input,Identifier,FOLLOW_Identifier_in_fun_call_statement1192); 
			match(input,32,FOLLOW_32_in_fun_call_statement1194); 
			// myChecker.g:348:36: ( Identifier ( ',' )? )*
			loop22:
			while (true) {
				int alt22=2;
				int LA22_0 = input.LA(1);
				if ( (LA22_0==Identifier) ) {
					alt22=1;
				}

				switch (alt22) {
				case 1 :
					// myChecker.g:348:37: Identifier ( ',' )?
					{
					match(input,Identifier,FOLLOW_Identifier_in_fun_call_statement1196); 
					// myChecker.g:348:48: ( ',' )?
					int alt21=2;
					int LA21_0 = input.LA(1);
					if ( (LA21_0==39) ) {
						alt21=1;
					}
					switch (alt21) {
						case 1 :
							// myChecker.g:348:48: ','
							{
							match(input,39,FOLLOW_39_in_fun_call_statement1198); 
							}
							break;

					}

					}
					break;

				default :
					break loop22;
				}
			}

			match(input,33,FOLLOW_33_in_fun_call_statement1203); 
			if (TRACEON) System.out.println("fun_call_statement : Identifier (Identifier ,)*"); 
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
	// $ANTLR end "fun_call_statement"



	// $ANTLR start "if_then_statements"
	// myChecker.g:351:1: if_then_statements : ( statement | '{' statements '}' );
	public final void if_then_statements() throws RecognitionException {
		try {
			// myChecker.g:351:19: ( statement | '{' statements '}' )
			int alt23=2;
			int LA23_0 = input.LA(1);
			if ( ((LA23_0 >= BREAK && LA23_0 <= CASE)||(LA23_0 >= CONTINUE && LA23_0 <= DEFAULT)||LA23_0==ELSE||LA23_0==FOR||LA23_0==IF||LA23_0==Identifier||LA23_0==PRINTF||LA23_0==SCANF||LA23_0==SWITCH||LA23_0==WHILE||LA23_0==37||LA23_0==41) ) {
				alt23=1;
			}
			else if ( (LA23_0==53) ) {
				alt23=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 23, 0, input);
				throw nvae;
			}

			switch (alt23) {
				case 1 :
					// myChecker.g:351:21: statement
					{
					pushFollow(FOLLOW_statement_in_if_then_statements1223);
					statement();
					state._fsp--;

					if (TRACEON) System.out.println("if_then_statements: statement"); 
					}
					break;
				case 2 :
					// myChecker.g:352:21: '{' statements '}'
					{
					match(input,53,FOLLOW_53_in_if_then_statements1247); 
					pushFollow(FOLLOW_statements_in_if_then_statements1249);
					statements();
					state._fsp--;

					match(input,54,FOLLOW_54_in_if_then_statements1251); 
					if (TRACEON) System.out.println("if_then_statements: \'{\' statements \'}\'"); 
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
	// $ANTLR end "if_then_statements"



	// $ANTLR start "while_statements"
	// myChecker.g:356:1: while_statements : ( statement | '{' statements '}' );
	public final void while_statements() throws RecognitionException {
		try {
			// myChecker.g:356:17: ( statement | '{' statements '}' )
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( ((LA24_0 >= BREAK && LA24_0 <= CASE)||(LA24_0 >= CONTINUE && LA24_0 <= DEFAULT)||LA24_0==ELSE||LA24_0==FOR||LA24_0==IF||LA24_0==Identifier||LA24_0==PRINTF||LA24_0==SCANF||LA24_0==SWITCH||LA24_0==WHILE||LA24_0==37||LA24_0==41) ) {
				alt24=1;
			}
			else if ( (LA24_0==53) ) {
				alt24=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 24, 0, input);
				throw nvae;
			}

			switch (alt24) {
				case 1 :
					// myChecker.g:356:19: statement
					{
					pushFollow(FOLLOW_statement_in_while_statements1268);
					statement();
					state._fsp--;

					if (TRACEON) System.out.println("while_statements: statement"); 
					}
					break;
				case 2 :
					// myChecker.g:357:21: '{' statements '}'
					{
					match(input,53,FOLLOW_53_in_while_statements1292); 
					pushFollow(FOLLOW_statements_in_while_statements1294);
					statements();
					state._fsp--;

					match(input,54,FOLLOW_54_in_while_statements1296); 
					if (TRACEON) System.out.println("while_statements: \'{\' statements \'}\'"); 
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
	// $ANTLR end "while_statements"



	// $ANTLR start "for_statements"
	// myChecker.g:360:1: for_statements : ( statement | '{' statements '}' );
	public final void for_statements() throws RecognitionException {
		try {
			// myChecker.g:360:15: ( statement | '{' statements '}' )
			int alt25=2;
			int LA25_0 = input.LA(1);
			if ( ((LA25_0 >= BREAK && LA25_0 <= CASE)||(LA25_0 >= CONTINUE && LA25_0 <= DEFAULT)||LA25_0==ELSE||LA25_0==FOR||LA25_0==IF||LA25_0==Identifier||LA25_0==PRINTF||LA25_0==SCANF||LA25_0==SWITCH||LA25_0==WHILE||LA25_0==37||LA25_0==41) ) {
				alt25=1;
			}
			else if ( (LA25_0==53) ) {
				alt25=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 25, 0, input);
				throw nvae;
			}

			switch (alt25) {
				case 1 :
					// myChecker.g:360:17: statement
					{
					pushFollow(FOLLOW_statement_in_for_statements1325);
					statement();
					state._fsp--;

					if (TRACEON) System.out.println("for_statements: statement"); 
					}
					break;
				case 2 :
					// myChecker.g:361:17: '{' statements '}'
					{
					match(input,53,FOLLOW_53_in_for_statements1345); 
					pushFollow(FOLLOW_statements_in_for_statements1347);
					statements();
					state._fsp--;

					match(input,54,FOLLOW_54_in_for_statements1349); 
					if (TRACEON) System.out.println("for_statements: \'{\' statements \'}\'"); 
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
	// $ANTLR end "for_statements"



	// $ANTLR start "else_statements"
	// myChecker.g:364:1: else_statements : ( statement | '{' statements '}' );
	public final void else_statements() throws RecognitionException {
		try {
			// myChecker.g:364:17: ( statement | '{' statements '}' )
			int alt26=2;
			int LA26_0 = input.LA(1);
			if ( ((LA26_0 >= BREAK && LA26_0 <= CASE)||(LA26_0 >= CONTINUE && LA26_0 <= DEFAULT)||LA26_0==ELSE||LA26_0==FOR||LA26_0==IF||LA26_0==Identifier||LA26_0==PRINTF||LA26_0==SCANF||LA26_0==SWITCH||LA26_0==WHILE||LA26_0==37||LA26_0==41) ) {
				alt26=1;
			}
			else if ( (LA26_0==53) ) {
				alt26=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 26, 0, input);
				throw nvae;
			}

			switch (alt26) {
				case 1 :
					// myChecker.g:364:19: statement
					{
					pushFollow(FOLLOW_statement_in_else_statements1372);
					statement();
					state._fsp--;

					if (TRACEON) System.out.println("else_statements :statement"); 
					}
					break;
				case 2 :
					// myChecker.g:365:21: '{' statements '}'
					{
					match(input,53,FOLLOW_53_in_else_statements1396); 
					pushFollow(FOLLOW_statements_in_else_statements1398);
					statements();
					state._fsp--;

					match(input,54,FOLLOW_54_in_else_statements1400); 
					if (TRACEON) System.out.println("else_statements: \'{\' statements \'}\'"); 
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
	// $ANTLR end "else_statements"



	// $ANTLR start "else_if_statements"
	// myChecker.g:368:1: else_if_statements : ( statement | '{' statements '}' );
	public final void else_if_statements() throws RecognitionException {
		try {
			// myChecker.g:368:19: ( statement | '{' statements '}' )
			int alt27=2;
			int LA27_0 = input.LA(1);
			if ( ((LA27_0 >= BREAK && LA27_0 <= CASE)||(LA27_0 >= CONTINUE && LA27_0 <= DEFAULT)||LA27_0==ELSE||LA27_0==FOR||LA27_0==IF||LA27_0==Identifier||LA27_0==PRINTF||LA27_0==SCANF||LA27_0==SWITCH||LA27_0==WHILE||LA27_0==37||LA27_0==41) ) {
				alt27=1;
			}
			else if ( (LA27_0==53) ) {
				alt27=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 27, 0, input);
				throw nvae;
			}

			switch (alt27) {
				case 1 :
					// myChecker.g:368:20: statement
					{
					pushFollow(FOLLOW_statement_in_else_if_statements1438);
					statement();
					state._fsp--;

					if (TRACEON) System.out.println("else_if_statements :statement"); 
					}
					break;
				case 2 :
					// myChecker.g:369:21: '{' statements '}'
					{
					match(input,53,FOLLOW_53_in_else_if_statements1462); 
					pushFollow(FOLLOW_statements_in_else_if_statements1464);
					statements();
					state._fsp--;

					match(input,54,FOLLOW_54_in_else_if_statements1466); 
					if (TRACEON) System.out.println("else_if_statements: \'{\' statements \'}\'"); 
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
	// $ANTLR end "else_if_statements"



	// $ANTLR start "swtich_statments"
	// myChecker.g:372:1: swtich_statments : '{' statements '}' ;
	public final void swtich_statments() throws RecognitionException {
		try {
			// myChecker.g:372:18: ( '{' statements '}' )
			// myChecker.g:372:21: '{' statements '}'
			{
			match(input,53,FOLLOW_53_in_swtich_statments1493); 
			pushFollow(FOLLOW_statements_in_swtich_statments1495);
			statements();
			state._fsp--;

			match(input,54,FOLLOW_54_in_swtich_statments1497); 
			if (TRACEON) System.out.println("swtich_statments :  { statements }"); 
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
	// $ANTLR end "swtich_statments"



	// $ANTLR start "printf_statement"
	// myChecker.g:376:1: printf_statement : '(' STRING_TYPE ( ',' Identifier )* ')' ';' ;
	public final void printf_statement() throws RecognitionException {
		try {
			// myChecker.g:376:18: ( '(' STRING_TYPE ( ',' Identifier )* ')' ';' )
			// myChecker.g:376:20: '(' STRING_TYPE ( ',' Identifier )* ')' ';'
			{
			match(input,32,FOLLOW_32_in_printf_statement1529); 
			match(input,STRING_TYPE,FOLLOW_STRING_TYPE_in_printf_statement1532); 
			// myChecker.g:376:37: ( ',' Identifier )*
			loop28:
			while (true) {
				int alt28=2;
				int LA28_0 = input.LA(1);
				if ( (LA28_0==39) ) {
					alt28=1;
				}

				switch (alt28) {
				case 1 :
					// myChecker.g:376:38: ',' Identifier
					{
					match(input,39,FOLLOW_39_in_printf_statement1535); 
					match(input,Identifier,FOLLOW_Identifier_in_printf_statement1537); 
					}
					break;

				default :
					break loop28;
				}
			}

			match(input,33,FOLLOW_33_in_printf_statement1541); 
			match(input,46,FOLLOW_46_in_printf_statement1543); 
			if (TRACEON) System.out.println("printf_statement : \'(\' statement STRING_TYPE (\',\' Identifier)* \')\'"); 
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
	// $ANTLR end "printf_statement"



	// $ANTLR start "scanf_statement"
	// myChecker.g:378:1: scanf_statement : '(' STRING_TYPE ( ',' Identifier )* ')' ';' ;
	public final void scanf_statement() throws RecognitionException {
		try {
			// myChecker.g:378:17: ( '(' STRING_TYPE ( ',' Identifier )* ')' ';' )
			// myChecker.g:378:19: '(' STRING_TYPE ( ',' Identifier )* ')' ';'
			{
			match(input,32,FOLLOW_32_in_scanf_statement1562); 
			match(input,STRING_TYPE,FOLLOW_STRING_TYPE_in_scanf_statement1565); 
			// myChecker.g:378:36: ( ',' Identifier )*
			loop29:
			while (true) {
				int alt29=2;
				int LA29_0 = input.LA(1);
				if ( (LA29_0==39) ) {
					alt29=1;
				}

				switch (alt29) {
				case 1 :
					// myChecker.g:378:37: ',' Identifier
					{
					match(input,39,FOLLOW_39_in_scanf_statement1568); 
					match(input,Identifier,FOLLOW_Identifier_in_scanf_statement1570); 
					}
					break;

				default :
					break loop29;
				}
			}

			match(input,33,FOLLOW_33_in_scanf_statement1574); 
			match(input,46,FOLLOW_46_in_scanf_statement1576); 
			if (TRACEON) System.out.println("scanf_statement : \'(\' statement STRING_TYPE (\',\' Identifier)* \')\'"); 
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
	// $ANTLR end "scanf_statement"

	// Delegated rules



	public static final BitSet FOLLOW_INCLUDE_TYPE_in_program21 = new BitSet(new long[]{0x0000000008062890L});
	public static final BitSet FOLLOW_main_start_in_program26 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fun_in_program28 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_fun39 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_Identifier_in_fun41 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_32_in_fun43 = new BitSet(new long[]{0x0000000200042890L});
	public static final BitSet FOLLOW_type_in_fun47 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_Identifier_in_fun49 = new BitSet(new long[]{0x0000008200042890L});
	public static final BitSet FOLLOW_39_in_fun51 = new BitSet(new long[]{0x0000000200042890L});
	public static final BitSet FOLLOW_33_in_fun56 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_53_in_fun58 = new BitSet(new long[]{0x0000022015CD7EF0L});
	public static final BitSet FOLLOW_declarations_in_fun60 = new BitSet(new long[]{0x0000022015C95660L});
	public static final BitSet FOLLOW_statements_in_fun62 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_return_end_in_fun64 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_fun66 = new BitSet(new long[]{0x0000000008042890L});
	public static final BitSet FOLLOW_fun_in_fun69 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_main_start_in_fun71 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VOID_in_main_start85 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_MAIN_in_main_start87 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_32_in_main_start89 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_main_start91 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_53_in_main_start93 = new BitSet(new long[]{0x0040022015CD7EF0L});
	public static final BitSet FOLLOW_declarations_in_main_start95 = new BitSet(new long[]{0x0040022015C95660L});
	public static final BitSet FOLLOW_statements_in_main_start97 = new BitSet(new long[]{0x0040000000800000L});
	public static final BitSet FOLLOW_return_end_in_main_start99 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_main_start102 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RETURN_TYPE_in_return_end126 = new BitSet(new long[]{0x0000000000188000L});
	public static final BitSet FOLLOW_Integer_constant_in_return_end129 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_46_in_return_end131 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Floating_point_constant_in_return_end145 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_46_in_return_end147 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_return_end161 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_46_in_return_end163 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_declarations185 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_Identifier_in_declarations187 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_46_in_declarations189 = new BitSet(new long[]{0x0000000000042890L});
	public static final BitSet FOLLOW_declarations_in_declarations191 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_declarations203 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_Identifier_in_declarations205 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_declarations207 = new BitSet(new long[]{0x0000000002108000L});
	public static final BitSet FOLLOW_set_in_declarations209 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_46_in_declarations217 = new BitSet(new long[]{0x0000000000042890L});
	public static final BitSet FOLLOW_declarations_in_declarations219 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_type242 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_type252 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOUBLE_in_type260 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_in_type268 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOL_in_type276 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_type284 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_34_in_type285 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_type293 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_34_in_type294 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOUBLE_in_type302 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_34_in_type303 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_in_type311 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_34_in_type312 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_statements324 = new BitSet(new long[]{0x0000022015495660L});
	public static final BitSet FOLLOW_statements_in_statements326 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_multExpr_in_arith_expression346 = new BitSet(new long[]{0x0000011000000002L});
	public static final BitSet FOLLOW_36_in_arith_expression358 = new BitSet(new long[]{0x0000010100188000L});
	public static final BitSet FOLLOW_multExpr_in_arith_expression364 = new BitSet(new long[]{0x0000011000000002L});
	public static final BitSet FOLLOW_40_in_arith_expression378 = new BitSet(new long[]{0x0000010100188000L});
	public static final BitSet FOLLOW_multExpr_in_arith_expression384 = new BitSet(new long[]{0x0000011000000002L});
	public static final BitSet FOLLOW_signExpr_in_multExpr417 = new BitSet(new long[]{0x0000080400000002L});
	public static final BitSet FOLLOW_34_in_multExpr429 = new BitSet(new long[]{0x0000010100188000L});
	public static final BitSet FOLLOW_signExpr_in_multExpr435 = new BitSet(new long[]{0x0000080400000002L});
	public static final BitSet FOLLOW_43_in_multExpr453 = new BitSet(new long[]{0x0000010100188000L});
	public static final BitSet FOLLOW_signExpr_in_multExpr459 = new BitSet(new long[]{0x0000080400000002L});
	public static final BitSet FOLLOW_primaryExpr_in_signExpr492 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_40_in_signExpr499 = new BitSet(new long[]{0x0000000100188000L});
	public static final BitSet FOLLOW_primaryExpr_in_signExpr501 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Integer_constant_in_primaryExpr521 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Floating_point_constant_in_primaryExpr535 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_primaryExpr542 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_32_in_primaryExpr549 = new BitSet(new long[]{0x0000010100188000L});
	public static final BitSet FOLLOW_arith_expression_in_primaryExpr551 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_primaryExpr553 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_overloaded_op576 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_38_in_overloaded_op578 = new BitSet(new long[]{0x0000010100188000L});
	public static final BitSet FOLLOW_arith_expression_in_overloaded_op580 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_overloaded_op587 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_42_in_overloaded_op589 = new BitSet(new long[]{0x0000010100188000L});
	public static final BitSet FOLLOW_arith_expression_in_overloaded_op591 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_overloaded_op598 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_44_in_overloaded_op600 = new BitSet(new long[]{0x0000010100188000L});
	public static final BitSet FOLLOW_arith_expression_in_overloaded_op602 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_overloaded_op609 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_overloaded_op611 = new BitSet(new long[]{0x0000010100188000L});
	public static final BitSet FOLLOW_arith_expression_in_overloaded_op613 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_overloaded_op620 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_31_in_overloaded_op622 = new BitSet(new long[]{0x0000010100188000L});
	public static final BitSet FOLLOW_arith_expression_in_overloaded_op624 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_comparison_expression645 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_52_in_comparison_expression647 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_Integer_constant_in_comparison_expression649 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_comparison_expression656 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_comparison_expression658 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_Integer_constant_in_comparison_expression660 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_comparison_expression667 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_comparison_expression669 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_Integer_constant_in_comparison_expression671 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_comparison_expression678 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_comparison_expression680 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_Integer_constant_in_comparison_expression682 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_comparison_expression689 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_51_in_comparison_expression691 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_Integer_constant_in_comparison_expression693 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_comparison_expression700 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_comparison_expression702 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_Integer_constant_in_comparison_expression704 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Integer_constant_in_comparison_expression711 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_52_in_comparison_expression713 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_Identifier_in_comparison_expression715 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Integer_constant_in_comparison_expression722 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_comparison_expression724 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_Identifier_in_comparison_expression726 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Integer_constant_in_comparison_expression733 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_comparison_expression735 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_Identifier_in_comparison_expression737 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Integer_constant_in_comparison_expression744 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_comparison_expression746 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_Identifier_in_comparison_expression748 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Integer_constant_in_comparison_expression755 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_51_in_comparison_expression757 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_Identifier_in_comparison_expression759 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Integer_constant_in_comparison_expression766 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_comparison_expression768 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_Identifier_in_comparison_expression770 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_comparison_expression777 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_52_in_comparison_expression779 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_Identifier_in_comparison_expression781 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_comparison_expression788 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_comparison_expression790 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_Identifier_in_comparison_expression792 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_comparison_expression799 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_comparison_expression801 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_Identifier_in_comparison_expression803 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_comparison_expression810 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_comparison_expression812 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_Identifier_in_comparison_expression814 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_comparison_expression821 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_51_in_comparison_expression823 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_Identifier_in_comparison_expression825 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_comparison_expression832 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_comparison_expression834 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_Identifier_in_comparison_expression836 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_incre_decre_expression852 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_37_in_incre_decre_expression854 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_incre_decre_expression862 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_incre_decre_expression864 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_37_in_incre_decre_expression872 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_Identifier_in_incre_decre_expression874 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_41_in_incre_decre_expression883 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_Identifier_in_incre_decre_expression885 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_statement908 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_statement910 = new BitSet(new long[]{0x0000010100188000L});
	public static final BitSet FOLLOW_arith_expression_in_statement912 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_46_in_statement914 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_overloaded_op_in_statement924 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_46_in_statement926 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_statement933 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_32_in_statement935 = new BitSet(new long[]{0x0000000000180000L});
	public static final BitSet FOLLOW_comparison_expression_in_statement938 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_statement941 = new BitSet(new long[]{0x0020022015495660L});
	public static final BitSet FOLLOW_if_then_statements_in_statement943 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_statement954 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_32_in_statement956 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_Identifier_in_statement959 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_statement961 = new BitSet(new long[]{0x0000010100188000L});
	public static final BitSet FOLLOW_arith_expression_in_statement963 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_statement966 = new BitSet(new long[]{0x0020022015495660L});
	public static final BitSet FOLLOW_if_then_statements_in_statement968 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ELSE_in_statement980 = new BitSet(new long[]{0x0020022015495660L});
	public static final BitSet FOLLOW_else_statements_in_statement983 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE_in_statement992 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_32_in_statement994 = new BitSet(new long[]{0x0000000000180000L});
	public static final BitSet FOLLOW_comparison_expression_in_statement997 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_statement1000 = new BitSet(new long[]{0x0020022015495660L});
	public static final BitSet FOLLOW_while_statements_in_statement1002 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE_in_statement1011 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_32_in_statement1013 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_Identifier_in_statement1016 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_statement1018 = new BitSet(new long[]{0x0000010100188000L});
	public static final BitSet FOLLOW_arith_expression_in_statement1020 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_statement1023 = new BitSet(new long[]{0x0020022015495660L});
	public static final BitSet FOLLOW_if_then_statements_in_statement1025 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FOR_in_statement1037 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_32_in_statement1039 = new BitSet(new long[]{0x00000000001C2890L});
	public static final BitSet FOLLOW_declarations_in_statement1041 = new BitSet(new long[]{0x0000000000180000L});
	public static final BitSet FOLLOW_comparison_expression_in_statement1044 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_Identifier_in_statement1046 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_statement1048 = new BitSet(new long[]{0x0000010100188000L});
	public static final BitSet FOLLOW_arith_expression_in_statement1050 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_46_in_statement1053 = new BitSet(new long[]{0x0000022000080000L});
	public static final BitSet FOLLOW_incre_decre_expression_in_statement1056 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_statement1059 = new BitSet(new long[]{0x0020022015495660L});
	public static final BitSet FOLLOW_for_statements_in_statement1061 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRINTF_in_statement1073 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_printf_statement_in_statement1076 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SCANF_in_statement1085 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_scanf_statement_in_statement1088 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BREAK_in_statement1097 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_46_in_statement1099 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONTINUE_in_statement1107 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_46_in_statement1109 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SWITCH_in_statement1117 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_32_in_statement1119 = new BitSet(new long[]{0x0000010100188000L});
	public static final BitSet FOLLOW_arith_expression_in_statement1122 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_comparison_expression_in_statement1124 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_statement1127 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_swtich_statments_in_statement1129 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CASE_in_statement1137 = new BitSet(new long[]{0x0000000000108000L});
	public static final BitSet FOLLOW_set_in_statement1139 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_45_in_statement1145 = new BitSet(new long[]{0x0000022015495660L});
	public static final BitSet FOLLOW_statement_in_statement1147 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DEFAULT_in_statement1155 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_45_in_statement1157 = new BitSet(new long[]{0x0000022015495660L});
	public static final BitSet FOLLOW_statement_in_statement1159 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_incre_decre_expression_in_statement1167 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_46_in_statement1169 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fun_call_statement_in_statement1177 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_46_in_statement1179 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_fun_call_statement1192 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_32_in_fun_call_statement1194 = new BitSet(new long[]{0x0000000200080000L});
	public static final BitSet FOLLOW_Identifier_in_fun_call_statement1196 = new BitSet(new long[]{0x0000008200080000L});
	public static final BitSet FOLLOW_39_in_fun_call_statement1198 = new BitSet(new long[]{0x0000000200080000L});
	public static final BitSet FOLLOW_33_in_fun_call_statement1203 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_if_then_statements1223 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_if_then_statements1247 = new BitSet(new long[]{0x0040022015495660L});
	public static final BitSet FOLLOW_statements_in_if_then_statements1249 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_if_then_statements1251 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_while_statements1268 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_while_statements1292 = new BitSet(new long[]{0x0040022015495660L});
	public static final BitSet FOLLOW_statements_in_while_statements1294 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_while_statements1296 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_for_statements1325 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_for_statements1345 = new BitSet(new long[]{0x0040022015495660L});
	public static final BitSet FOLLOW_statements_in_for_statements1347 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_for_statements1349 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_else_statements1372 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_else_statements1396 = new BitSet(new long[]{0x0040022015495660L});
	public static final BitSet FOLLOW_statements_in_else_statements1398 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_else_statements1400 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_else_if_statements1438 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_else_if_statements1462 = new BitSet(new long[]{0x0040022015495660L});
	public static final BitSet FOLLOW_statements_in_else_if_statements1464 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_else_if_statements1466 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_swtich_statments1493 = new BitSet(new long[]{0x0040022015495660L});
	public static final BitSet FOLLOW_statements_in_swtich_statments1495 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_swtich_statments1497 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_32_in_printf_statement1529 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_STRING_TYPE_in_printf_statement1532 = new BitSet(new long[]{0x0000008200000000L});
	public static final BitSet FOLLOW_39_in_printf_statement1535 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_Identifier_in_printf_statement1537 = new BitSet(new long[]{0x0000008200000000L});
	public static final BitSet FOLLOW_33_in_printf_statement1541 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_46_in_printf_statement1543 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_32_in_scanf_statement1562 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_STRING_TYPE_in_scanf_statement1565 = new BitSet(new long[]{0x0000008200000000L});
	public static final BitSet FOLLOW_39_in_scanf_statement1568 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_Identifier_in_scanf_statement1570 = new BitSet(new long[]{0x0000008200000000L});
	public static final BitSet FOLLOW_33_in_scanf_statement1574 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_46_in_scanf_statement1576 = new BitSet(new long[]{0x0000000000000002L});
}
