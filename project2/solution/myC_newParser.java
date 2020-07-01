// $ANTLR 3.5.2 myC_new.g 2020-05-14 12:16:54

    // import packages here.


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class myC_newParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "BREAK", "CASE", "CHAR", "COMMENT", 
		"CONTINUE", "DEFAULT", "DOUBLE", "ELSE", "FLOAT", "FOR", "Floating_point_constant", 
		"IF", "INCLUDE_TYPE", "INT", "Identifier", "Integer_constant", "MAIN", 
		"PRINTF", "RETURN_TYPE", "SCANF", "STRING_TYPE", "SWITCH", "VOID", "WHILE", 
		"WS", "'!='", "'%'", "'%='", "'&'", "'('", "')'", "'*'", "'*='", "'+'", 
		"'++'", "'+='", "','", "'-'", "'--'", "'-='", "'/'", "'/='", "':'", "';'", 
		"'<'", "'<='", "'='", "'=='", "'>'", "'>='", "'{'", "'}'"
	};
	public static final int EOF=-1;
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
	public static final int T__55=55;
	public static final int BREAK=4;
	public static final int CASE=5;
	public static final int CHAR=6;
	public static final int COMMENT=7;
	public static final int CONTINUE=8;
	public static final int DEFAULT=9;
	public static final int DOUBLE=10;
	public static final int ELSE=11;
	public static final int FLOAT=12;
	public static final int FOR=13;
	public static final int Floating_point_constant=14;
	public static final int IF=15;
	public static final int INCLUDE_TYPE=16;
	public static final int INT=17;
	public static final int Identifier=18;
	public static final int Integer_constant=19;
	public static final int MAIN=20;
	public static final int PRINTF=21;
	public static final int RETURN_TYPE=22;
	public static final int SCANF=23;
	public static final int STRING_TYPE=24;
	public static final int SWITCH=25;
	public static final int VOID=26;
	public static final int WHILE=27;
	public static final int WS=28;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public myC_newParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public myC_newParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return myC_newParser.tokenNames; }
	@Override public String getGrammarFileName() { return "myC_new.g"; }


	    boolean TRACEON = true;



	// $ANTLR start "program"
	// myC_new.g:16:1: program : ( INCLUDE_TYPE )* ( main_start | fun ) ;
	public final void program() throws RecognitionException {
		try {
			// myC_new.g:16:8: ( ( INCLUDE_TYPE )* ( main_start | fun ) )
			// myC_new.g:16:9: ( INCLUDE_TYPE )* ( main_start | fun )
			{
			// myC_new.g:16:9: ( INCLUDE_TYPE )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==INCLUDE_TYPE) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// myC_new.g:16:10: INCLUDE_TYPE
					{
					match(input,INCLUDE_TYPE,FOLLOW_INCLUDE_TYPE_in_program37); 
					}
					break;

				default :
					break loop1;
				}
			}

			// myC_new.g:16:25: ( main_start | fun )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==VOID) ) {
				alt2=1;
			}
			else if ( (LA2_0==CHAR||LA2_0==DOUBLE||LA2_0==FLOAT||LA2_0==INT) ) {
				alt2=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// myC_new.g:16:26: main_start
					{
					pushFollow(FOLLOW_main_start_in_program42);
					main_start();
					state._fsp--;

					}
					break;
				case 2 :
					// myC_new.g:16:37: fun
					{
					pushFollow(FOLLOW_fun_in_program44);
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
	// myC_new.g:18:1: fun : type Identifier '(' ( type Identifier ( ',' )? )* ')' '{' declarations statements return_end '}' ( fun | main_start ) ;
	public final void fun() throws RecognitionException {
		try {
			// myC_new.g:18:4: ( type Identifier '(' ( type Identifier ( ',' )? )* ')' '{' declarations statements return_end '}' ( fun | main_start ) )
			// myC_new.g:18:6: type Identifier '(' ( type Identifier ( ',' )? )* ')' '{' declarations statements return_end '}' ( fun | main_start )
			{
			pushFollow(FOLLOW_type_in_fun55);
			type();
			state._fsp--;

			match(input,Identifier,FOLLOW_Identifier_in_fun57); 
			match(input,33,FOLLOW_33_in_fun59); 
			// myC_new.g:18:27: ( type Identifier ( ',' )? )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==CHAR||LA4_0==DOUBLE||LA4_0==FLOAT||LA4_0==INT) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// myC_new.g:18:28: type Identifier ( ',' )?
					{
					pushFollow(FOLLOW_type_in_fun63);
					type();
					state._fsp--;

					match(input,Identifier,FOLLOW_Identifier_in_fun65); 
					// myC_new.g:18:44: ( ',' )?
					int alt3=2;
					int LA3_0 = input.LA(1);
					if ( (LA3_0==40) ) {
						alt3=1;
					}
					switch (alt3) {
						case 1 :
							// myC_new.g:18:44: ','
							{
							match(input,40,FOLLOW_40_in_fun67); 
							}
							break;

					}

					}
					break;

				default :
					break loop4;
				}
			}

			match(input,34,FOLLOW_34_in_fun72); 
			match(input,54,FOLLOW_54_in_fun74); 
			pushFollow(FOLLOW_declarations_in_fun76);
			declarations();
			state._fsp--;

			pushFollow(FOLLOW_statements_in_fun78);
			statements();
			state._fsp--;

			pushFollow(FOLLOW_return_end_in_fun80);
			return_end();
			state._fsp--;

			match(input,55,FOLLOW_55_in_fun82); 
			// myC_new.g:18:98: ( fun | main_start )
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==CHAR||LA5_0==DOUBLE||LA5_0==FLOAT||LA5_0==INT) ) {
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
					// myC_new.g:18:99: fun
					{
					pushFollow(FOLLOW_fun_in_fun85);
					fun();
					state._fsp--;

					}
					break;
				case 2 :
					// myC_new.g:18:103: main_start
					{
					pushFollow(FOLLOW_main_start_in_fun87);
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
	// myC_new.g:21:1: main_start : VOID MAIN '(' ')' '{' declarations statements ( return_end )? '}' ;
	public final void main_start() throws RecognitionException {
		try {
			// myC_new.g:21:11: ( VOID MAIN '(' ')' '{' declarations statements ( return_end )? '}' )
			// myC_new.g:21:12: VOID MAIN '(' ')' '{' declarations statements ( return_end )? '}'
			{
			match(input,VOID,FOLLOW_VOID_in_main_start101); 
			match(input,MAIN,FOLLOW_MAIN_in_main_start103); 
			match(input,33,FOLLOW_33_in_main_start105); 
			match(input,34,FOLLOW_34_in_main_start107); 
			match(input,54,FOLLOW_54_in_main_start109); 
			pushFollow(FOLLOW_declarations_in_main_start111);
			declarations();
			state._fsp--;

			pushFollow(FOLLOW_statements_in_main_start113);
			statements();
			state._fsp--;

			// myC_new.g:21:58: ( return_end )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==RETURN_TYPE) ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// myC_new.g:21:58: return_end
					{
					pushFollow(FOLLOW_return_end_in_main_start115);
					return_end();
					state._fsp--;

					}
					break;

			}

			match(input,55,FOLLOW_55_in_main_start118); 
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



	// $ANTLR start "declarations"
	// myC_new.g:25:1: declarations : ( type Identifier ';' declarations | type Identifier '=' ( Integer_constant | Floating_point_constant | STRING_TYPE ) ';' declarations |);
	public final void declarations() throws RecognitionException {
		try {
			// myC_new.g:25:13: ( type Identifier ';' declarations | type Identifier '=' ( Integer_constant | Floating_point_constant | STRING_TYPE ) ';' declarations |)
			int alt7=3;
			switch ( input.LA(1) ) {
			case INT:
				{
				int LA7_1 = input.LA(2);
				if ( (LA7_1==35) ) {
					int LA7_6 = input.LA(3);
					if ( (LA7_6==Identifier) ) {
						int LA7_7 = input.LA(4);
						if ( (LA7_7==47) ) {
							alt7=1;
						}
						else if ( (LA7_7==50) ) {
							alt7=2;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 7, 7, input);
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
								new NoViableAltException("", 7, 6, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( (LA7_1==Identifier) ) {
					int LA7_7 = input.LA(3);
					if ( (LA7_7==47) ) {
						alt7=1;
					}
					else if ( (LA7_7==50) ) {
						alt7=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 7, 7, input);
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
							new NoViableAltException("", 7, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case FLOAT:
				{
				int LA7_2 = input.LA(2);
				if ( (LA7_2==35) ) {
					int LA7_8 = input.LA(3);
					if ( (LA7_8==Identifier) ) {
						int LA7_7 = input.LA(4);
						if ( (LA7_7==47) ) {
							alt7=1;
						}
						else if ( (LA7_7==50) ) {
							alt7=2;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 7, 7, input);
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
								new NoViableAltException("", 7, 8, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( (LA7_2==Identifier) ) {
					int LA7_7 = input.LA(3);
					if ( (LA7_7==47) ) {
						alt7=1;
					}
					else if ( (LA7_7==50) ) {
						alt7=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 7, 7, input);
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
							new NoViableAltException("", 7, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case DOUBLE:
				{
				int LA7_3 = input.LA(2);
				if ( (LA7_3==35) ) {
					int LA7_9 = input.LA(3);
					if ( (LA7_9==Identifier) ) {
						int LA7_7 = input.LA(4);
						if ( (LA7_7==47) ) {
							alt7=1;
						}
						else if ( (LA7_7==50) ) {
							alt7=2;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 7, 7, input);
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
								new NoViableAltException("", 7, 9, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( (LA7_3==Identifier) ) {
					int LA7_7 = input.LA(3);
					if ( (LA7_7==47) ) {
						alt7=1;
					}
					else if ( (LA7_7==50) ) {
						alt7=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 7, 7, input);
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
							new NoViableAltException("", 7, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case CHAR:
				{
				int LA7_4 = input.LA(2);
				if ( (LA7_4==35) ) {
					int LA7_10 = input.LA(3);
					if ( (LA7_10==Identifier) ) {
						int LA7_7 = input.LA(4);
						if ( (LA7_7==47) ) {
							alt7=1;
						}
						else if ( (LA7_7==50) ) {
							alt7=2;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 7, 7, input);
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
								new NoViableAltException("", 7, 10, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( (LA7_4==Identifier) ) {
					int LA7_7 = input.LA(3);
					if ( (LA7_7==47) ) {
						alt7=1;
					}
					else if ( (LA7_7==50) ) {
						alt7=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 7, 7, input);
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
							new NoViableAltException("", 7, 4, input);
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
			case Floating_point_constant:
			case IF:
			case Identifier:
			case Integer_constant:
			case PRINTF:
			case RETURN_TYPE:
			case SCANF:
			case SWITCH:
			case WHILE:
			case 33:
			case 38:
			case 41:
			case 42:
			case 55:
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
					// myC_new.g:25:14: type Identifier ';' declarations
					{
					pushFollow(FOLLOW_type_in_declarations143);
					type();
					state._fsp--;

					match(input,Identifier,FOLLOW_Identifier_in_declarations145); 
					match(input,47,FOLLOW_47_in_declarations147); 
					pushFollow(FOLLOW_declarations_in_declarations149);
					declarations();
					state._fsp--;

					 if (TRACEON) System.out.println("declarations: type Identifier : declarations"); 
					}
					break;
				case 2 :
					// myC_new.g:26:13: type Identifier '=' ( Integer_constant | Floating_point_constant | STRING_TYPE ) ';' declarations
					{
					pushFollow(FOLLOW_type_in_declarations164);
					type();
					state._fsp--;

					match(input,Identifier,FOLLOW_Identifier_in_declarations166); 
					match(input,50,FOLLOW_50_in_declarations168); 
					if ( input.LA(1)==Floating_point_constant||input.LA(1)==Integer_constant||input.LA(1)==STRING_TYPE ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					match(input,47,FOLLOW_47_in_declarations178); 
					pushFollow(FOLLOW_declarations_in_declarations180);
					declarations();
					state._fsp--;

					 if (TRACEON) System.out.println("type Identifier '=' (Integer_constant|Floating_point_constant|STRING_TYPE) ';' declarations"); 
					}
					break;
				case 3 :
					// myC_new.g:27:14: 
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
	// myC_new.g:30:1: type : ( INT | FLOAT | DOUBLE | CHAR | INT '*' | FLOAT '*' | DOUBLE '*' | CHAR '*' );
	public final void type() throws RecognitionException {
		try {
			// myC_new.g:30:5: ( INT | FLOAT | DOUBLE | CHAR | INT '*' | FLOAT '*' | DOUBLE '*' | CHAR '*' )
			int alt8=8;
			switch ( input.LA(1) ) {
			case INT:
				{
				int LA8_1 = input.LA(2);
				if ( (LA8_1==35) ) {
					alt8=5;
				}
				else if ( (LA8_1==Identifier) ) {
					alt8=1;
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
				if ( (LA8_2==35) ) {
					alt8=6;
				}
				else if ( (LA8_2==Identifier) ) {
					alt8=2;
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
				if ( (LA8_3==35) ) {
					alt8=7;
				}
				else if ( (LA8_3==Identifier) ) {
					alt8=3;
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
				if ( (LA8_4==35) ) {
					alt8=8;
				}
				else if ( (LA8_4==Identifier) ) {
					alt8=4;
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
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}
			switch (alt8) {
				case 1 :
					// myC_new.g:30:6: INT
					{
					match(input,INT,FOLLOW_INT_in_type215); 
					 if (TRACEON) System.out.println("type: INT"); 
					}
					break;
				case 2 :
					// myC_new.g:31:6: FLOAT
					{
					match(input,FLOAT,FOLLOW_FLOAT_in_type224); 
					if (TRACEON) System.out.println("type: FLOAT"); 
					}
					break;
				case 3 :
					// myC_new.g:32:6: DOUBLE
					{
					match(input,DOUBLE,FOLLOW_DOUBLE_in_type233); 
					if (TRACEON) System.out.println("type: DOUBLE"); 
					}
					break;
				case 4 :
					// myC_new.g:33:6: CHAR
					{
					match(input,CHAR,FOLLOW_CHAR_in_type242); 
					if (TRACEON) System.out.println("type: CHAR"); 
					}
					break;
				case 5 :
					// myC_new.g:34:6: INT '*'
					{
					match(input,INT,FOLLOW_INT_in_type251); 
					match(input,35,FOLLOW_35_in_type252); 
					 if (TRACEON) System.out.println("type: INT*"); 
					}
					break;
				case 6 :
					// myC_new.g:35:6: FLOAT '*'
					{
					match(input,FLOAT,FOLLOW_FLOAT_in_type261); 
					match(input,35,FOLLOW_35_in_type262); 
					if (TRACEON) System.out.println("type: FLOAT*"); 
					}
					break;
				case 7 :
					// myC_new.g:36:6: DOUBLE '*'
					{
					match(input,DOUBLE,FOLLOW_DOUBLE_in_type271); 
					match(input,35,FOLLOW_35_in_type272); 
					if (TRACEON) System.out.println("type: DOUBLE*"); 
					}
					break;
				case 8 :
					// myC_new.g:37:6: CHAR '*'
					{
					match(input,CHAR,FOLLOW_CHAR_in_type281); 
					match(input,35,FOLLOW_35_in_type282); 
					if (TRACEON) System.out.println("type: CHAR*"); 
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
	// $ANTLR end "type"



	// $ANTLR start "return_end"
	// myC_new.g:41:1: return_end : RETURN_TYPE ( Integer_constant ';' | Floating_point_constant ';' | Identifier ';' ) ;
	public final void return_end() throws RecognitionException {
		try {
			// myC_new.g:41:11: ( RETURN_TYPE ( Integer_constant ';' | Floating_point_constant ';' | Identifier ';' ) )
			// myC_new.g:41:12: RETURN_TYPE ( Integer_constant ';' | Floating_point_constant ';' | Identifier ';' )
			{
			match(input,RETURN_TYPE,FOLLOW_RETURN_TYPE_in_return_end298); 
			// myC_new.g:41:24: ( Integer_constant ';' | Floating_point_constant ';' | Identifier ';' )
			int alt9=3;
			switch ( input.LA(1) ) {
			case Integer_constant:
				{
				alt9=1;
				}
				break;
			case Floating_point_constant:
				{
				alt9=2;
				}
				break;
			case Identifier:
				{
				alt9=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}
			switch (alt9) {
				case 1 :
					// myC_new.g:41:25: Integer_constant ';'
					{
					match(input,Integer_constant,FOLLOW_Integer_constant_in_return_end301); 
					match(input,47,FOLLOW_47_in_return_end303); 
					 if (TRACEON) System.out.println("return_end:RETURN_TYPE Integer_constant ;"); 
					}
					break;
				case 2 :
					// myC_new.g:42:12: Floating_point_constant ';'
					{
					match(input,Floating_point_constant,FOLLOW_Floating_point_constant_in_return_end317); 
					match(input,47,FOLLOW_47_in_return_end319); 
					 if (TRACEON) System.out.println("return_end:RETURN_TYPE Floating_point_constant ;"); 
					}
					break;
				case 3 :
					// myC_new.g:43:12: Identifier ';'
					{
					match(input,Identifier,FOLLOW_Identifier_in_return_end333); 
					match(input,47,FOLLOW_47_in_return_end335); 
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



	// $ANTLR start "statements"
	// myC_new.g:47:1: statements : ( statement statements |);
	public final void statements() throws RecognitionException {
		try {
			// myC_new.g:47:11: ( statement statements |)
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( ((LA10_0 >= BREAK && LA10_0 <= CASE)||(LA10_0 >= CONTINUE && LA10_0 <= DEFAULT)||LA10_0==ELSE||LA10_0==FOR||LA10_0==IF||LA10_0==Identifier||LA10_0==PRINTF||LA10_0==SCANF||LA10_0==SWITCH||LA10_0==WHILE||LA10_0==38||LA10_0==42) ) {
				alt10=1;
			}
			else if ( (LA10_0==RETURN_TYPE||LA10_0==55) ) {
				alt10=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}

			switch (alt10) {
				case 1 :
					// myC_new.g:47:12: statement statements
					{
					pushFollow(FOLLOW_statement_in_statements358);
					statement();
					state._fsp--;

					pushFollow(FOLLOW_statements_in_statements360);
					statements();
					state._fsp--;

					}
					break;
				case 2 :
					// myC_new.g:48:10: 
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



	// $ANTLR start "comparison_expression"
	// myC_new.g:51:1: comparison_expression : ( Identifier '>=' Integer_constant | Identifier '==' Integer_constant | Identifier '<=' Integer_constant | Identifier '!=' Integer_constant | Identifier '>' Integer_constant | Identifier '<' Integer_constant | Integer_constant '>=' Identifier | Integer_constant '==' Identifier | Integer_constant '<=' Identifier | Integer_constant '!=' Identifier | Integer_constant '>' Identifier | Integer_constant '<' Identifier | Identifier '>=' Identifier | Identifier '==' Identifier | Identifier '<=' Identifier | Identifier '!=' Identifier | Identifier '>' Identifier | Identifier '<' Identifier );
	public final void comparison_expression() throws RecognitionException {
		try {
			// myC_new.g:51:22: ( Identifier '>=' Integer_constant | Identifier '==' Integer_constant | Identifier '<=' Integer_constant | Identifier '!=' Integer_constant | Identifier '>' Integer_constant | Identifier '<' Integer_constant | Integer_constant '>=' Identifier | Integer_constant '==' Identifier | Integer_constant '<=' Identifier | Integer_constant '!=' Identifier | Integer_constant '>' Identifier | Integer_constant '<' Identifier | Identifier '>=' Identifier | Identifier '==' Identifier | Identifier '<=' Identifier | Identifier '!=' Identifier | Identifier '>' Identifier | Identifier '<' Identifier )
			int alt11=18;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==Identifier) ) {
				switch ( input.LA(2) ) {
				case 53:
					{
					int LA11_3 = input.LA(3);
					if ( (LA11_3==Integer_constant) ) {
						alt11=1;
					}
					else if ( (LA11_3==Identifier) ) {
						alt11=13;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 11, 3, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case 51:
					{
					int LA11_4 = input.LA(3);
					if ( (LA11_4==Integer_constant) ) {
						alt11=2;
					}
					else if ( (LA11_4==Identifier) ) {
						alt11=14;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 11, 4, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case 49:
					{
					int LA11_5 = input.LA(3);
					if ( (LA11_5==Integer_constant) ) {
						alt11=3;
					}
					else if ( (LA11_5==Identifier) ) {
						alt11=15;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 11, 5, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case 29:
					{
					int LA11_6 = input.LA(3);
					if ( (LA11_6==Integer_constant) ) {
						alt11=4;
					}
					else if ( (LA11_6==Identifier) ) {
						alt11=16;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 11, 6, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case 52:
					{
					int LA11_7 = input.LA(3);
					if ( (LA11_7==Integer_constant) ) {
						alt11=5;
					}
					else if ( (LA11_7==Identifier) ) {
						alt11=17;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 11, 7, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case 48:
					{
					int LA11_8 = input.LA(3);
					if ( (LA11_8==Integer_constant) ) {
						alt11=6;
					}
					else if ( (LA11_8==Identifier) ) {
						alt11=18;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 11, 8, input);
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
							new NoViableAltException("", 11, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}
			else if ( (LA11_0==Integer_constant) ) {
				switch ( input.LA(2) ) {
				case 53:
					{
					alt11=7;
					}
					break;
				case 51:
					{
					alt11=8;
					}
					break;
				case 49:
					{
					alt11=9;
					}
					break;
				case 29:
					{
					alt11=10;
					}
					break;
				case 52:
					{
					alt11=11;
					}
					break;
				case 48:
					{
					alt11=12;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 11, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}

			switch (alt11) {
				case 1 :
					// myC_new.g:51:24: Identifier '>=' Integer_constant
					{
					match(input,Identifier,FOLLOW_Identifier_in_comparison_expression378); 
					match(input,53,FOLLOW_53_in_comparison_expression380); 
					match(input,Integer_constant,FOLLOW_Integer_constant_in_comparison_expression382); 
					if (TRACEON) System.out.println("comparison_expression: Identifier >= Integer_constant"); 
					}
					break;
				case 2 :
					// myC_new.g:52:24: Identifier '==' Integer_constant
					{
					match(input,Identifier,FOLLOW_Identifier_in_comparison_expression409); 
					match(input,51,FOLLOW_51_in_comparison_expression411); 
					match(input,Integer_constant,FOLLOW_Integer_constant_in_comparison_expression413); 
					if (TRACEON) System.out.println("comparison_expression: Identifier == Integer_constant"); 
					}
					break;
				case 3 :
					// myC_new.g:53:24: Identifier '<=' Integer_constant
					{
					match(input,Identifier,FOLLOW_Identifier_in_comparison_expression440); 
					match(input,49,FOLLOW_49_in_comparison_expression442); 
					match(input,Integer_constant,FOLLOW_Integer_constant_in_comparison_expression444); 
					if (TRACEON) System.out.println("comparison_expression: Identifier <= Integer_constant"); 
					}
					break;
				case 4 :
					// myC_new.g:54:24: Identifier '!=' Integer_constant
					{
					match(input,Identifier,FOLLOW_Identifier_in_comparison_expression471); 
					match(input,29,FOLLOW_29_in_comparison_expression473); 
					match(input,Integer_constant,FOLLOW_Integer_constant_in_comparison_expression475); 
					if (TRACEON) System.out.println("comparison_expression: Identifier != Integer_constant"); 
					}
					break;
				case 5 :
					// myC_new.g:55:24: Identifier '>' Integer_constant
					{
					match(input,Identifier,FOLLOW_Identifier_in_comparison_expression502); 
					match(input,52,FOLLOW_52_in_comparison_expression504); 
					match(input,Integer_constant,FOLLOW_Integer_constant_in_comparison_expression506); 
					if (TRACEON) System.out.println("comparison_expression: Identifier > Integer_constant"); 
					}
					break;
				case 6 :
					// myC_new.g:56:24: Identifier '<' Integer_constant
					{
					match(input,Identifier,FOLLOW_Identifier_in_comparison_expression533); 
					match(input,48,FOLLOW_48_in_comparison_expression535); 
					match(input,Integer_constant,FOLLOW_Integer_constant_in_comparison_expression537); 
					if (TRACEON) System.out.println("comparison_expression: Identifier < Integer_constant"); 
					}
					break;
				case 7 :
					// myC_new.g:57:24: Integer_constant '>=' Identifier
					{
					match(input,Integer_constant,FOLLOW_Integer_constant_in_comparison_expression564); 
					match(input,53,FOLLOW_53_in_comparison_expression566); 
					match(input,Identifier,FOLLOW_Identifier_in_comparison_expression568); 
					if (TRACEON) System.out.println("comparison_expression: Integer_constant >= Identifier"); 
					}
					break;
				case 8 :
					// myC_new.g:58:24: Integer_constant '==' Identifier
					{
					match(input,Integer_constant,FOLLOW_Integer_constant_in_comparison_expression595); 
					match(input,51,FOLLOW_51_in_comparison_expression597); 
					match(input,Identifier,FOLLOW_Identifier_in_comparison_expression599); 
					if (TRACEON) System.out.println("comparison_expression: Integer_constant == Identifier"); 
					}
					break;
				case 9 :
					// myC_new.g:59:24: Integer_constant '<=' Identifier
					{
					match(input,Integer_constant,FOLLOW_Integer_constant_in_comparison_expression626); 
					match(input,49,FOLLOW_49_in_comparison_expression628); 
					match(input,Identifier,FOLLOW_Identifier_in_comparison_expression630); 
					if (TRACEON) System.out.println("comparison_expression: Integer_constant <= Identifier"); 
					}
					break;
				case 10 :
					// myC_new.g:60:24: Integer_constant '!=' Identifier
					{
					match(input,Integer_constant,FOLLOW_Integer_constant_in_comparison_expression657); 
					match(input,29,FOLLOW_29_in_comparison_expression659); 
					match(input,Identifier,FOLLOW_Identifier_in_comparison_expression661); 
					if (TRACEON) System.out.println("comparison_expression: Integer_constant != Identifier"); 
					}
					break;
				case 11 :
					// myC_new.g:61:24: Integer_constant '>' Identifier
					{
					match(input,Integer_constant,FOLLOW_Integer_constant_in_comparison_expression688); 
					match(input,52,FOLLOW_52_in_comparison_expression690); 
					match(input,Identifier,FOLLOW_Identifier_in_comparison_expression692); 
					if (TRACEON) System.out.println("comparison_expression: Integer_constant > Identifier"); 
					}
					break;
				case 12 :
					// myC_new.g:62:24: Integer_constant '<' Identifier
					{
					match(input,Integer_constant,FOLLOW_Integer_constant_in_comparison_expression719); 
					match(input,48,FOLLOW_48_in_comparison_expression721); 
					match(input,Identifier,FOLLOW_Identifier_in_comparison_expression723); 
					if (TRACEON) System.out.println("comparison_expression: Integer_constant < Identifier"); 
					}
					break;
				case 13 :
					// myC_new.g:63:24: Identifier '>=' Identifier
					{
					match(input,Identifier,FOLLOW_Identifier_in_comparison_expression750); 
					match(input,53,FOLLOW_53_in_comparison_expression752); 
					match(input,Identifier,FOLLOW_Identifier_in_comparison_expression754); 
					if (TRACEON) System.out.println("comparison_expression: Identifier >= Identifier"); 
					}
					break;
				case 14 :
					// myC_new.g:64:24: Identifier '==' Identifier
					{
					match(input,Identifier,FOLLOW_Identifier_in_comparison_expression781); 
					match(input,51,FOLLOW_51_in_comparison_expression783); 
					match(input,Identifier,FOLLOW_Identifier_in_comparison_expression785); 
					if (TRACEON) System.out.println("comparison_expression: Identifier == Identifier"); 
					}
					break;
				case 15 :
					// myC_new.g:65:24: Identifier '<=' Identifier
					{
					match(input,Identifier,FOLLOW_Identifier_in_comparison_expression812); 
					match(input,49,FOLLOW_49_in_comparison_expression814); 
					match(input,Identifier,FOLLOW_Identifier_in_comparison_expression816); 
					if (TRACEON) System.out.println("comparison_expression: Identifier <= Identifier"); 
					}
					break;
				case 16 :
					// myC_new.g:66:24: Identifier '!=' Identifier
					{
					match(input,Identifier,FOLLOW_Identifier_in_comparison_expression843); 
					match(input,29,FOLLOW_29_in_comparison_expression845); 
					match(input,Identifier,FOLLOW_Identifier_in_comparison_expression847); 
					if (TRACEON) System.out.println("comparison_expression: Identifier != Identifier"); 
					}
					break;
				case 17 :
					// myC_new.g:67:24: Identifier '>' Identifier
					{
					match(input,Identifier,FOLLOW_Identifier_in_comparison_expression874); 
					match(input,52,FOLLOW_52_in_comparison_expression876); 
					match(input,Identifier,FOLLOW_Identifier_in_comparison_expression878); 
					if (TRACEON) System.out.println("comparison_expression: Identifier > Identifier"); 
					}
					break;
				case 18 :
					// myC_new.g:68:24: Identifier '<' Identifier
					{
					match(input,Identifier,FOLLOW_Identifier_in_comparison_expression905); 
					match(input,48,FOLLOW_48_in_comparison_expression907); 
					match(input,Identifier,FOLLOW_Identifier_in_comparison_expression909); 
					if (TRACEON) System.out.println("comparison_expression: Identifier < Identifier"); 
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
	// $ANTLR end "comparison_expression"



	// $ANTLR start "incre_decre_expression"
	// myC_new.g:72:1: incre_decre_expression : ( Identifier '++' | Identifier '--' | '++' Identifier | '--' Identifier );
	public final void incre_decre_expression() throws RecognitionException {
		try {
			// myC_new.g:72:23: ( Identifier '++' | Identifier '--' | '++' Identifier | '--' Identifier )
			int alt12=4;
			switch ( input.LA(1) ) {
			case Identifier:
				{
				int LA12_1 = input.LA(2);
				if ( (LA12_1==38) ) {
					alt12=1;
				}
				else if ( (LA12_1==42) ) {
					alt12=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 12, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 38:
				{
				alt12=3;
				}
				break;
			case 42:
				{
				alt12=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}
			switch (alt12) {
				case 1 :
					// myC_new.g:72:24: Identifier '++'
					{
					match(input,Identifier,FOLLOW_Identifier_in_incre_decre_expression941); 
					match(input,38,FOLLOW_38_in_incre_decre_expression943); 
					if (TRACEON) System.out.println("incre_decre_expression:Identifier ++"); 
					}
					break;
				case 2 :
					// myC_new.g:73:24: Identifier '--'
					{
					match(input,Identifier,FOLLOW_Identifier_in_incre_decre_expression971); 
					match(input,42,FOLLOW_42_in_incre_decre_expression973); 
					if (TRACEON) System.out.println("incre_decre_expression:Identifier --"); 
					}
					break;
				case 3 :
					// myC_new.g:74:24: '++' Identifier
					{
					match(input,38,FOLLOW_38_in_incre_decre_expression1001); 
					match(input,Identifier,FOLLOW_Identifier_in_incre_decre_expression1003); 
					if (TRACEON) System.out.println("incre_decre_expression:++ Identifier "); 
					}
					break;
				case 4 :
					// myC_new.g:75:24: '--' Identifier
					{
					match(input,42,FOLLOW_42_in_incre_decre_expression1032); 
					match(input,Identifier,FOLLOW_Identifier_in_incre_decre_expression1034); 
					if (TRACEON) System.out.println("incre_decre_expression:Identifier "); 
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
	// $ANTLR end "incre_decre_expression"



	// $ANTLR start "arith_expression"
	// myC_new.g:79:1: arith_expression : multExpr ( '+' multExpr | '-' multExpr )* ;
	public final void arith_expression() throws RecognitionException {
		try {
			// myC_new.g:79:17: ( multExpr ( '+' multExpr | '-' multExpr )* )
			// myC_new.g:79:19: multExpr ( '+' multExpr | '-' multExpr )*
			{
			pushFollow(FOLLOW_multExpr_in_arith_expression1069);
			multExpr();
			state._fsp--;

			// myC_new.g:80:19: ( '+' multExpr | '-' multExpr )*
			loop13:
			while (true) {
				int alt13=3;
				int LA13_0 = input.LA(1);
				if ( (LA13_0==37) ) {
					alt13=1;
				}
				else if ( (LA13_0==41) ) {
					alt13=2;
				}

				switch (alt13) {
				case 1 :
					// myC_new.g:80:21: '+' multExpr
					{
					match(input,37,FOLLOW_37_in_arith_expression1091); 
					pushFollow(FOLLOW_multExpr_in_arith_expression1093);
					multExpr();
					state._fsp--;

					if (TRACEON) System.out.println("arith_expression: multExpr +"); 
					}
					break;
				case 2 :
					// myC_new.g:81:9: '-' multExpr
					{
					match(input,41,FOLLOW_41_in_arith_expression1105); 
					pushFollow(FOLLOW_multExpr_in_arith_expression1107);
					multExpr();
					state._fsp--;

					if (TRACEON) System.out.println("arith_expression: multExpr -"); 
					}
					break;

				default :
					break loop13;
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
	// $ANTLR end "arith_expression"



	// $ANTLR start "multExpr"
	// myC_new.g:85:1: multExpr : signExpr ( '*' signExpr | '/' signExpr | '%' signExpr )* ;
	public final void multExpr() throws RecognitionException {
		try {
			// myC_new.g:85:9: ( signExpr ( '*' signExpr | '/' signExpr | '%' signExpr )* )
			// myC_new.g:85:11: signExpr ( '*' signExpr | '/' signExpr | '%' signExpr )*
			{
			pushFollow(FOLLOW_signExpr_in_multExpr1148);
			signExpr();
			state._fsp--;

			// myC_new.g:86:11: ( '*' signExpr | '/' signExpr | '%' signExpr )*
			loop14:
			while (true) {
				int alt14=4;
				switch ( input.LA(1) ) {
				case 35:
					{
					alt14=1;
					}
					break;
				case 44:
					{
					alt14=2;
					}
					break;
				case 30:
					{
					alt14=3;
					}
					break;
				}
				switch (alt14) {
				case 1 :
					// myC_new.g:86:13: '*' signExpr
					{
					match(input,35,FOLLOW_35_in_multExpr1162); 
					pushFollow(FOLLOW_signExpr_in_multExpr1164);
					signExpr();
					state._fsp--;

					if (TRACEON) System.out.println("multExpr: signExpr * "); 
					}
					break;
				case 2 :
					// myC_new.g:87:13: '/' signExpr
					{
					match(input,44,FOLLOW_44_in_multExpr1180); 
					pushFollow(FOLLOW_signExpr_in_multExpr1182);
					signExpr();
					state._fsp--;

					if (TRACEON) System.out.println("multExpr: signExpr / "); 
					}
					break;
				case 3 :
					// myC_new.g:88:13: '%' signExpr
					{
					match(input,30,FOLLOW_30_in_multExpr1198); 
					pushFollow(FOLLOW_signExpr_in_multExpr1200);
					signExpr();
					state._fsp--;

					if (TRACEON) System.out.println("multExpr: signExpr % "); 
					}
					break;

				default :
					break loop14;
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
	// $ANTLR end "multExpr"



	// $ANTLR start "signExpr"
	// myC_new.g:92:1: signExpr : ( primaryExpr | '-' primaryExpr );
	public final void signExpr() throws RecognitionException {
		try {
			// myC_new.g:92:9: ( primaryExpr | '-' primaryExpr )
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==Floating_point_constant||(LA15_0 >= Identifier && LA15_0 <= Integer_constant)||LA15_0==33) ) {
				alt15=1;
			}
			else if ( (LA15_0==41) ) {
				alt15=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}

			switch (alt15) {
				case 1 :
					// myC_new.g:92:11: primaryExpr
					{
					pushFollow(FOLLOW_primaryExpr_in_signExpr1221);
					primaryExpr();
					state._fsp--;

					if (TRACEON) System.out.println("signExpr: primaryExpr"); 
					}
					break;
				case 2 :
					// myC_new.g:93:11: '-' primaryExpr
					{
					match(input,41,FOLLOW_41_in_signExpr1235); 
					pushFollow(FOLLOW_primaryExpr_in_signExpr1237);
					primaryExpr();
					state._fsp--;

					if (TRACEON) System.out.println("signExpr: primaryExpr -"); 
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
	// $ANTLR end "signExpr"



	// $ANTLR start "primaryExpr"
	// myC_new.g:96:1: primaryExpr : ( Integer_constant | Floating_point_constant | Identifier | '(' arith_expression ')' );
	public final void primaryExpr() throws RecognitionException {
		try {
			// myC_new.g:96:12: ( Integer_constant | Floating_point_constant | Identifier | '(' arith_expression ')' )
			int alt16=4;
			switch ( input.LA(1) ) {
			case Integer_constant:
				{
				alt16=1;
				}
				break;
			case Floating_point_constant:
				{
				alt16=2;
				}
				break;
			case Identifier:
				{
				alt16=3;
				}
				break;
			case 33:
				{
				alt16=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}
			switch (alt16) {
				case 1 :
					// myC_new.g:96:14: Integer_constant
					{
					match(input,Integer_constant,FOLLOW_Integer_constant_in_primaryExpr1253); 
					if (TRACEON) System.out.println("primaryExpr: Integer_constant"); 
					}
					break;
				case 2 :
					// myC_new.g:97:14: Floating_point_constant
					{
					match(input,Floating_point_constant,FOLLOW_Floating_point_constant_in_primaryExpr1270); 
					if (TRACEON) System.out.println("primaryExpr: Floating_point_constant"); 
					}
					break;
				case 3 :
					// myC_new.g:98:14: Identifier
					{
					match(input,Identifier,FOLLOW_Identifier_in_primaryExpr1287); 
					if (TRACEON) System.out.println("primaryExpr: Identifier"); 
					}
					break;
				case 4 :
					// myC_new.g:99:9: '(' arith_expression ')'
					{
					match(input,33,FOLLOW_33_in_primaryExpr1299); 
					pushFollow(FOLLOW_arith_expression_in_primaryExpr1301);
					arith_expression();
					state._fsp--;

					match(input,34,FOLLOW_34_in_primaryExpr1303); 
					if (TRACEON) System.out.println("\'(\' arith_expression \')\'"); 
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
	// $ANTLR end "primaryExpr"



	// $ANTLR start "overloaded_op"
	// myC_new.g:102:1: overloaded_op : ( Identifier ( '+=' ( Identifier ) )+ | Identifier ( '-=' ( Identifier ) )+ | Identifier ( '/=' ( Identifier ) )+ | Identifier ( '*=' ( Identifier ) )+ | Identifier ( '%=' ( Identifier ) )+ );
	public final void overloaded_op() throws RecognitionException {
		try {
			// myC_new.g:102:14: ( Identifier ( '+=' ( Identifier ) )+ | Identifier ( '-=' ( Identifier ) )+ | Identifier ( '/=' ( Identifier ) )+ | Identifier ( '*=' ( Identifier ) )+ | Identifier ( '%=' ( Identifier ) )+ )
			int alt22=5;
			int LA22_0 = input.LA(1);
			if ( (LA22_0==Identifier) ) {
				switch ( input.LA(2) ) {
				case 39:
					{
					alt22=1;
					}
					break;
				case 43:
					{
					alt22=2;
					}
					break;
				case 45:
					{
					alt22=3;
					}
					break;
				case 36:
					{
					alt22=4;
					}
					break;
				case 31:
					{
					alt22=5;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 22, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 22, 0, input);
				throw nvae;
			}

			switch (alt22) {
				case 1 :
					// myC_new.g:102:16: Identifier ( '+=' ( Identifier ) )+
					{
					match(input,Identifier,FOLLOW_Identifier_in_overloaded_op1324); 
					// myC_new.g:102:27: ( '+=' ( Identifier ) )+
					int cnt17=0;
					loop17:
					while (true) {
						int alt17=2;
						int LA17_0 = input.LA(1);
						if ( (LA17_0==39) ) {
							alt17=1;
						}

						switch (alt17) {
						case 1 :
							// myC_new.g:102:28: '+=' ( Identifier )
							{
							match(input,39,FOLLOW_39_in_overloaded_op1327); 
							// myC_new.g:102:33: ( Identifier )
							// myC_new.g:102:34: Identifier
							{
							match(input,Identifier,FOLLOW_Identifier_in_overloaded_op1330); 
							}

							}
							break;

						default :
							if ( cnt17 >= 1 ) break loop17;
							EarlyExitException eee = new EarlyExitException(17, input);
							throw eee;
						}
						cnt17++;
					}

					if (TRACEON) System.out.println("Identifier (\'+=\' (Identifier))+"); 
					}
					break;
				case 2 :
					// myC_new.g:103:16: Identifier ( '-=' ( Identifier ) )+
					{
					match(input,Identifier,FOLLOW_Identifier_in_overloaded_op1352); 
					// myC_new.g:103:27: ( '-=' ( Identifier ) )+
					int cnt18=0;
					loop18:
					while (true) {
						int alt18=2;
						int LA18_0 = input.LA(1);
						if ( (LA18_0==43) ) {
							alt18=1;
						}

						switch (alt18) {
						case 1 :
							// myC_new.g:103:28: '-=' ( Identifier )
							{
							match(input,43,FOLLOW_43_in_overloaded_op1355); 
							// myC_new.g:103:33: ( Identifier )
							// myC_new.g:103:34: Identifier
							{
							match(input,Identifier,FOLLOW_Identifier_in_overloaded_op1358); 
							}

							}
							break;

						default :
							if ( cnt18 >= 1 ) break loop18;
							EarlyExitException eee = new EarlyExitException(18, input);
							throw eee;
						}
						cnt18++;
					}

					if (TRACEON) System.out.println("Identifier (\'-=\' (Identifier))+"); 
					}
					break;
				case 3 :
					// myC_new.g:104:16: Identifier ( '/=' ( Identifier ) )+
					{
					match(input,Identifier,FOLLOW_Identifier_in_overloaded_op1380); 
					// myC_new.g:104:27: ( '/=' ( Identifier ) )+
					int cnt19=0;
					loop19:
					while (true) {
						int alt19=2;
						int LA19_0 = input.LA(1);
						if ( (LA19_0==45) ) {
							alt19=1;
						}

						switch (alt19) {
						case 1 :
							// myC_new.g:104:28: '/=' ( Identifier )
							{
							match(input,45,FOLLOW_45_in_overloaded_op1383); 
							// myC_new.g:104:33: ( Identifier )
							// myC_new.g:104:34: Identifier
							{
							match(input,Identifier,FOLLOW_Identifier_in_overloaded_op1386); 
							}

							}
							break;

						default :
							if ( cnt19 >= 1 ) break loop19;
							EarlyExitException eee = new EarlyExitException(19, input);
							throw eee;
						}
						cnt19++;
					}

					if (TRACEON) System.out.println("Identifier (\'/=\' (Identifier))+"); 
					}
					break;
				case 4 :
					// myC_new.g:105:16: Identifier ( '*=' ( Identifier ) )+
					{
					match(input,Identifier,FOLLOW_Identifier_in_overloaded_op1408); 
					// myC_new.g:105:27: ( '*=' ( Identifier ) )+
					int cnt20=0;
					loop20:
					while (true) {
						int alt20=2;
						int LA20_0 = input.LA(1);
						if ( (LA20_0==36) ) {
							alt20=1;
						}

						switch (alt20) {
						case 1 :
							// myC_new.g:105:28: '*=' ( Identifier )
							{
							match(input,36,FOLLOW_36_in_overloaded_op1411); 
							// myC_new.g:105:33: ( Identifier )
							// myC_new.g:105:34: Identifier
							{
							match(input,Identifier,FOLLOW_Identifier_in_overloaded_op1414); 
							}

							}
							break;

						default :
							if ( cnt20 >= 1 ) break loop20;
							EarlyExitException eee = new EarlyExitException(20, input);
							throw eee;
						}
						cnt20++;
					}

					if (TRACEON) System.out.println("Identifier (\'*=\' (Identifier))+"); 
					}
					break;
				case 5 :
					// myC_new.g:106:16: Identifier ( '%=' ( Identifier ) )+
					{
					match(input,Identifier,FOLLOW_Identifier_in_overloaded_op1436); 
					// myC_new.g:106:27: ( '%=' ( Identifier ) )+
					int cnt21=0;
					loop21:
					while (true) {
						int alt21=2;
						int LA21_0 = input.LA(1);
						if ( (LA21_0==31) ) {
							alt21=1;
						}

						switch (alt21) {
						case 1 :
							// myC_new.g:106:28: '%=' ( Identifier )
							{
							match(input,31,FOLLOW_31_in_overloaded_op1439); 
							// myC_new.g:106:33: ( Identifier )
							// myC_new.g:106:34: Identifier
							{
							match(input,Identifier,FOLLOW_Identifier_in_overloaded_op1442); 
							}

							}
							break;

						default :
							if ( cnt21 >= 1 ) break loop21;
							EarlyExitException eee = new EarlyExitException(21, input);
							throw eee;
						}
						cnt21++;
					}

					if (TRACEON) System.out.println("Identifier (\'%=\' (Identifier))+"); 
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
	// $ANTLR end "overloaded_op"



	// $ANTLR start "statement"
	// myC_new.g:114:1: statement : ( Identifier '=' arith_expression ';' | overloaded_op ';' | Identifier '=' '&' Identifier ';' | IF '(' ( arith_expression | comparison_expression | incre_decre_expression ) ')' if_then_statements | ELSE else_statements | WHILE '(' ( arith_expression | comparison_expression | incre_decre_expression ) ')' while_statements | FOR '(' declarations ( arith_expression | comparison_expression ) ';' ( Identifier '=' arith_expression | incre_decre_expression ) ')' for_statements | PRINTF printf_statement | SCANF scanf_statement | BREAK ';' | CONTINUE ';' | SWITCH '(' ( arith_expression | comparison_expression ) ')' swtich_statments | CASE ( Integer_constant | Floating_point_constant ) ':' statement | DEFAULT ':' statement | incre_decre_expression ';' | fun_call_statement ';' );
	public final void statement() throws RecognitionException {
		try {
			// myC_new.g:114:10: ( Identifier '=' arith_expression ';' | overloaded_op ';' | Identifier '=' '&' Identifier ';' | IF '(' ( arith_expression | comparison_expression | incre_decre_expression ) ')' if_then_statements | ELSE else_statements | WHILE '(' ( arith_expression | comparison_expression | incre_decre_expression ) ')' while_statements | FOR '(' declarations ( arith_expression | comparison_expression ) ';' ( Identifier '=' arith_expression | incre_decre_expression ) ')' for_statements | PRINTF printf_statement | SCANF scanf_statement | BREAK ';' | CONTINUE ';' | SWITCH '(' ( arith_expression | comparison_expression ) ')' swtich_statments | CASE ( Integer_constant | Floating_point_constant ) ':' statement | DEFAULT ':' statement | incre_decre_expression ';' | fun_call_statement ';' )
			int alt28=16;
			switch ( input.LA(1) ) {
			case Identifier:
				{
				switch ( input.LA(2) ) {
				case 50:
					{
					int LA28_14 = input.LA(3);
					if ( (LA28_14==32) ) {
						alt28=3;
					}
					else if ( (LA28_14==Floating_point_constant||(LA28_14 >= Identifier && LA28_14 <= Integer_constant)||LA28_14==33||LA28_14==41) ) {
						alt28=1;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 28, 14, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case 38:
				case 42:
					{
					alt28=15;
					}
					break;
				case 33:
					{
					alt28=16;
					}
					break;
				case 31:
				case 36:
				case 39:
				case 43:
				case 45:
					{
					alt28=2;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 28, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case IF:
				{
				alt28=4;
				}
				break;
			case ELSE:
				{
				alt28=5;
				}
				break;
			case WHILE:
				{
				alt28=6;
				}
				break;
			case FOR:
				{
				alt28=7;
				}
				break;
			case PRINTF:
				{
				alt28=8;
				}
				break;
			case SCANF:
				{
				alt28=9;
				}
				break;
			case BREAK:
				{
				alt28=10;
				}
				break;
			case CONTINUE:
				{
				alt28=11;
				}
				break;
			case SWITCH:
				{
				alt28=12;
				}
				break;
			case CASE:
				{
				alt28=13;
				}
				break;
			case DEFAULT:
				{
				alt28=14;
				}
				break;
			case 38:
			case 42:
				{
				alt28=15;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 28, 0, input);
				throw nvae;
			}
			switch (alt28) {
				case 1 :
					// myC_new.g:114:12: Identifier '=' arith_expression ';'
					{
					match(input,Identifier,FOLLOW_Identifier_in_statement1474); 
					match(input,50,FOLLOW_50_in_statement1476); 
					pushFollow(FOLLOW_arith_expression_in_statement1478);
					arith_expression();
					state._fsp--;

					match(input,47,FOLLOW_47_in_statement1480); 
					if (TRACEON) System.out.println("statement: Identifier \'=\' arith_expression \';\'"); 
					}
					break;
				case 2 :
					// myC_new.g:115:12: overloaded_op ';'
					{
					pushFollow(FOLLOW_overloaded_op_in_statement1496);
					overloaded_op();
					state._fsp--;

					match(input,47,FOLLOW_47_in_statement1498); 
					if (TRACEON) System.out.println("statement: overloaded_op ;"); 
					}
					break;
				case 3 :
					// myC_new.g:116:12: Identifier '=' '&' Identifier ';'
					{
					match(input,Identifier,FOLLOW_Identifier_in_statement1513); 
					match(input,50,FOLLOW_50_in_statement1515); 
					match(input,32,FOLLOW_32_in_statement1517); 
					match(input,Identifier,FOLLOW_Identifier_in_statement1519); 
					match(input,47,FOLLOW_47_in_statement1521); 
					if (TRACEON) System.out.println("statement: Identifier \'=\' \'&\' Identifier ;"); 
					}
					break;
				case 4 :
					// myC_new.g:117:12: IF '(' ( arith_expression | comparison_expression | incre_decre_expression ) ')' if_then_statements
					{
					match(input,IF,FOLLOW_IF_in_statement1537); 
					match(input,33,FOLLOW_33_in_statement1539); 
					// myC_new.g:117:19: ( arith_expression | comparison_expression | incre_decre_expression )
					int alt23=3;
					switch ( input.LA(1) ) {
					case Integer_constant:
						{
						int LA23_1 = input.LA(2);
						if ( (LA23_1==29||(LA23_1 >= 48 && LA23_1 <= 49)||(LA23_1 >= 51 && LA23_1 <= 53)) ) {
							alt23=2;
						}
						else if ( (LA23_1==30||(LA23_1 >= 34 && LA23_1 <= 35)||LA23_1==37||LA23_1==41||LA23_1==44) ) {
							alt23=1;
						}

						else {
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 23, 1, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case Floating_point_constant:
					case 33:
					case 41:
						{
						alt23=1;
						}
						break;
					case Identifier:
						{
						switch ( input.LA(2) ) {
						case 29:
						case 48:
						case 49:
						case 51:
						case 52:
						case 53:
							{
							alt23=2;
							}
							break;
						case 38:
						case 42:
							{
							alt23=3;
							}
							break;
						case 30:
						case 34:
						case 35:
						case 37:
						case 41:
						case 44:
							{
							alt23=1;
							}
							break;
						default:
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 23, 3, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}
						}
						break;
					case 38:
					case 42:
						{
						alt23=3;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 23, 0, input);
						throw nvae;
					}
					switch (alt23) {
						case 1 :
							// myC_new.g:117:20: arith_expression
							{
							pushFollow(FOLLOW_arith_expression_in_statement1542);
							arith_expression();
							state._fsp--;

							}
							break;
						case 2 :
							// myC_new.g:117:37: comparison_expression
							{
							pushFollow(FOLLOW_comparison_expression_in_statement1544);
							comparison_expression();
							state._fsp--;

							}
							break;
						case 3 :
							// myC_new.g:117:59: incre_decre_expression
							{
							pushFollow(FOLLOW_incre_decre_expression_in_statement1546);
							incre_decre_expression();
							state._fsp--;

							}
							break;

					}

					match(input,34,FOLLOW_34_in_statement1549); 
					pushFollow(FOLLOW_if_then_statements_in_statement1551);
					if_then_statements();
					state._fsp--;

					if (TRACEON) System.out.println("statement: IF \'(\' (arith_expression|comparison_expression|incre_decre_expression) \')\' if_then_statements"); 
					}
					break;
				case 5 :
					// myC_new.g:118:12: ELSE else_statements
					{
					match(input,ELSE,FOLLOW_ELSE_in_statement1567); 
					pushFollow(FOLLOW_else_statements_in_statement1570);
					else_statements();
					state._fsp--;

					if (TRACEON) System.out.println("statement: (ELSE  else_statements)?"); 
					}
					break;
				case 6 :
					// myC_new.g:119:12: WHILE '(' ( arith_expression | comparison_expression | incre_decre_expression ) ')' while_statements
					{
					match(input,WHILE,FOLLOW_WHILE_in_statement1586); 
					match(input,33,FOLLOW_33_in_statement1588); 
					// myC_new.g:119:22: ( arith_expression | comparison_expression | incre_decre_expression )
					int alt24=3;
					switch ( input.LA(1) ) {
					case Integer_constant:
						{
						int LA24_1 = input.LA(2);
						if ( (LA24_1==29||(LA24_1 >= 48 && LA24_1 <= 49)||(LA24_1 >= 51 && LA24_1 <= 53)) ) {
							alt24=2;
						}
						else if ( (LA24_1==30||(LA24_1 >= 34 && LA24_1 <= 35)||LA24_1==37||LA24_1==41||LA24_1==44) ) {
							alt24=1;
						}

						else {
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 24, 1, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case Floating_point_constant:
					case 33:
					case 41:
						{
						alt24=1;
						}
						break;
					case Identifier:
						{
						switch ( input.LA(2) ) {
						case 29:
						case 48:
						case 49:
						case 51:
						case 52:
						case 53:
							{
							alt24=2;
							}
							break;
						case 38:
						case 42:
							{
							alt24=3;
							}
							break;
						case 30:
						case 34:
						case 35:
						case 37:
						case 41:
						case 44:
							{
							alt24=1;
							}
							break;
						default:
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 24, 3, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}
						}
						break;
					case 38:
					case 42:
						{
						alt24=3;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 24, 0, input);
						throw nvae;
					}
					switch (alt24) {
						case 1 :
							// myC_new.g:119:23: arith_expression
							{
							pushFollow(FOLLOW_arith_expression_in_statement1591);
							arith_expression();
							state._fsp--;

							}
							break;
						case 2 :
							// myC_new.g:119:40: comparison_expression
							{
							pushFollow(FOLLOW_comparison_expression_in_statement1593);
							comparison_expression();
							state._fsp--;

							}
							break;
						case 3 :
							// myC_new.g:119:62: incre_decre_expression
							{
							pushFollow(FOLLOW_incre_decre_expression_in_statement1595);
							incre_decre_expression();
							state._fsp--;

							}
							break;

					}

					match(input,34,FOLLOW_34_in_statement1598); 
					pushFollow(FOLLOW_while_statements_in_statement1600);
					while_statements();
					state._fsp--;

					if (TRACEON) System.out.println("statement: WHILE \'(\' (arith_expression|comparison_expression|incre_decre_expression) \')\' while_statements"); 
					}
					break;
				case 7 :
					// myC_new.g:120:12: FOR '(' declarations ( arith_expression | comparison_expression ) ';' ( Identifier '=' arith_expression | incre_decre_expression ) ')' for_statements
					{
					match(input,FOR,FOLLOW_FOR_in_statement1616); 
					match(input,33,FOLLOW_33_in_statement1618); 
					pushFollow(FOLLOW_declarations_in_statement1620);
					declarations();
					state._fsp--;

					// myC_new.g:120:33: ( arith_expression | comparison_expression )
					int alt25=2;
					switch ( input.LA(1) ) {
					case Integer_constant:
						{
						int LA25_1 = input.LA(2);
						if ( (LA25_1==29||(LA25_1 >= 48 && LA25_1 <= 49)||(LA25_1 >= 51 && LA25_1 <= 53)) ) {
							alt25=2;
						}
						else if ( (LA25_1==30||LA25_1==35||LA25_1==37||LA25_1==41||LA25_1==44||LA25_1==47) ) {
							alt25=1;
						}

						else {
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 25, 1, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case Floating_point_constant:
					case 33:
					case 41:
						{
						alt25=1;
						}
						break;
					case Identifier:
						{
						int LA25_3 = input.LA(2);
						if ( (LA25_3==29||(LA25_3 >= 48 && LA25_3 <= 49)||(LA25_3 >= 51 && LA25_3 <= 53)) ) {
							alt25=2;
						}
						else if ( (LA25_3==30||LA25_3==35||LA25_3==37||LA25_3==41||LA25_3==44||LA25_3==47) ) {
							alt25=1;
						}

						else {
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 25, 3, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 25, 0, input);
						throw nvae;
					}
					switch (alt25) {
						case 1 :
							// myC_new.g:120:34: arith_expression
							{
							pushFollow(FOLLOW_arith_expression_in_statement1623);
							arith_expression();
							state._fsp--;

							}
							break;
						case 2 :
							// myC_new.g:120:51: comparison_expression
							{
							pushFollow(FOLLOW_comparison_expression_in_statement1625);
							comparison_expression();
							state._fsp--;

							}
							break;

					}

					match(input,47,FOLLOW_47_in_statement1628); 
					// myC_new.g:120:78: ( Identifier '=' arith_expression | incre_decre_expression )
					int alt26=2;
					int LA26_0 = input.LA(1);
					if ( (LA26_0==Identifier) ) {
						int LA26_1 = input.LA(2);
						if ( (LA26_1==50) ) {
							alt26=1;
						}
						else if ( (LA26_1==38||LA26_1==42) ) {
							alt26=2;
						}

						else {
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 26, 1, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}
					else if ( (LA26_0==38||LA26_0==42) ) {
						alt26=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 26, 0, input);
						throw nvae;
					}

					switch (alt26) {
						case 1 :
							// myC_new.g:120:79: Identifier '=' arith_expression
							{
							match(input,Identifier,FOLLOW_Identifier_in_statement1631); 
							match(input,50,FOLLOW_50_in_statement1633); 
							pushFollow(FOLLOW_arith_expression_in_statement1635);
							arith_expression();
							state._fsp--;

							}
							break;
						case 2 :
							// myC_new.g:120:111: incre_decre_expression
							{
							pushFollow(FOLLOW_incre_decre_expression_in_statement1637);
							incre_decre_expression();
							state._fsp--;

							}
							break;

					}

					match(input,34,FOLLOW_34_in_statement1640); 
					pushFollow(FOLLOW_for_statements_in_statement1642);
					for_statements();
					state._fsp--;

					if (TRACEON) System.out.println("FOR ( declarations (arith_expression|comparison_expression) ; (Identifier '=' arith_expression|incre_decre_expression) ) for_statements"); 
					}
					break;
				case 8 :
					// myC_new.g:121:12: PRINTF printf_statement
					{
					match(input,PRINTF,FOLLOW_PRINTF_in_statement1658); 
					pushFollow(FOLLOW_printf_statement_in_statement1661);
					printf_statement();
					state._fsp--;

					if (TRACEON) System.out.println("statement: PRINTF  printf_statement"); 
					}
					break;
				case 9 :
					// myC_new.g:122:12: SCANF scanf_statement
					{
					match(input,SCANF,FOLLOW_SCANF_in_statement1677); 
					pushFollow(FOLLOW_scanf_statement_in_statement1680);
					scanf_statement();
					state._fsp--;

					if (TRACEON) System.out.println("statement: SCANF  scanf_statement"); 
					}
					break;
				case 10 :
					// myC_new.g:123:12: BREAK ';'
					{
					match(input,BREAK,FOLLOW_BREAK_in_statement1696); 
					match(input,47,FOLLOW_47_in_statement1698); 
					if (TRACEON) System.out.println("statement: BREAK ;"); 
					}
					break;
				case 11 :
					// myC_new.g:124:12: CONTINUE ';'
					{
					match(input,CONTINUE,FOLLOW_CONTINUE_in_statement1713); 
					match(input,47,FOLLOW_47_in_statement1715); 
					if (TRACEON) System.out.println("statement: CONTINUE ;"); 
					}
					break;
				case 12 :
					// myC_new.g:125:12: SWITCH '(' ( arith_expression | comparison_expression ) ')' swtich_statments
					{
					match(input,SWITCH,FOLLOW_SWITCH_in_statement1730); 
					match(input,33,FOLLOW_33_in_statement1732); 
					// myC_new.g:125:23: ( arith_expression | comparison_expression )
					int alt27=2;
					switch ( input.LA(1) ) {
					case Integer_constant:
						{
						int LA27_1 = input.LA(2);
						if ( (LA27_1==29||(LA27_1 >= 48 && LA27_1 <= 49)||(LA27_1 >= 51 && LA27_1 <= 53)) ) {
							alt27=2;
						}
						else if ( (LA27_1==30||(LA27_1 >= 34 && LA27_1 <= 35)||LA27_1==37||LA27_1==41||LA27_1==44) ) {
							alt27=1;
						}

						else {
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 27, 1, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case Floating_point_constant:
					case 33:
					case 41:
						{
						alt27=1;
						}
						break;
					case Identifier:
						{
						int LA27_3 = input.LA(2);
						if ( (LA27_3==29||(LA27_3 >= 48 && LA27_3 <= 49)||(LA27_3 >= 51 && LA27_3 <= 53)) ) {
							alt27=2;
						}
						else if ( (LA27_3==30||(LA27_3 >= 34 && LA27_3 <= 35)||LA27_3==37||LA27_3==41||LA27_3==44) ) {
							alt27=1;
						}

						else {
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 27, 3, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 27, 0, input);
						throw nvae;
					}
					switch (alt27) {
						case 1 :
							// myC_new.g:125:24: arith_expression
							{
							pushFollow(FOLLOW_arith_expression_in_statement1735);
							arith_expression();
							state._fsp--;

							}
							break;
						case 2 :
							// myC_new.g:125:41: comparison_expression
							{
							pushFollow(FOLLOW_comparison_expression_in_statement1737);
							comparison_expression();
							state._fsp--;

							}
							break;

					}

					match(input,34,FOLLOW_34_in_statement1740); 
					pushFollow(FOLLOW_swtich_statments_in_statement1742);
					swtich_statments();
					state._fsp--;

					if (TRACEON) System.out.println("statement: SWITCH ( (arith_expression|comparison_expression) ) swtich_statments"); 
					}
					break;
				case 13 :
					// myC_new.g:126:12: CASE ( Integer_constant | Floating_point_constant ) ':' statement
					{
					match(input,CASE,FOLLOW_CASE_in_statement1757); 
					if ( input.LA(1)==Floating_point_constant||input.LA(1)==Integer_constant ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					match(input,46,FOLLOW_46_in_statement1765); 
					pushFollow(FOLLOW_statement_in_statement1767);
					statement();
					state._fsp--;

					if (TRACEON) System.out.println("statement : CASE (Integer_constant|Floating_point_constant) : statement"); 
					}
					break;
				case 14 :
					// myC_new.g:127:12: DEFAULT ':' statement
					{
					match(input,DEFAULT,FOLLOW_DEFAULT_in_statement1782); 
					match(input,46,FOLLOW_46_in_statement1784); 
					pushFollow(FOLLOW_statement_in_statement1786);
					statement();
					state._fsp--;

					if (TRACEON) System.out.println("statement : DEFAULT : statement"); 
					}
					break;
				case 15 :
					// myC_new.g:128:12: incre_decre_expression ';'
					{
					pushFollow(FOLLOW_incre_decre_expression_in_statement1801);
					incre_decre_expression();
					state._fsp--;

					match(input,47,FOLLOW_47_in_statement1803); 
					if (TRACEON) System.out.println("statement : incre_decre_expression"); 
					}
					break;
				case 16 :
					// myC_new.g:129:12: fun_call_statement ';'
					{
					pushFollow(FOLLOW_fun_call_statement_in_statement1818);
					fun_call_statement();
					state._fsp--;

					match(input,47,FOLLOW_47_in_statement1820); 
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
	}
	// $ANTLR end "statement"



	// $ANTLR start "fun_call_statement"
	// myC_new.g:132:1: fun_call_statement : Identifier '(' ( Identifier ( ',' )? )* ')' ;
	public final void fun_call_statement() throws RecognitionException {
		try {
			// myC_new.g:132:20: ( Identifier '(' ( Identifier ( ',' )? )* ')' )
			// myC_new.g:132:22: Identifier '(' ( Identifier ( ',' )? )* ')'
			{
			match(input,Identifier,FOLLOW_Identifier_in_fun_call_statement1834); 
			match(input,33,FOLLOW_33_in_fun_call_statement1836); 
			// myC_new.g:132:36: ( Identifier ( ',' )? )*
			loop30:
			while (true) {
				int alt30=2;
				int LA30_0 = input.LA(1);
				if ( (LA30_0==Identifier) ) {
					alt30=1;
				}

				switch (alt30) {
				case 1 :
					// myC_new.g:132:37: Identifier ( ',' )?
					{
					match(input,Identifier,FOLLOW_Identifier_in_fun_call_statement1838); 
					// myC_new.g:132:48: ( ',' )?
					int alt29=2;
					int LA29_0 = input.LA(1);
					if ( (LA29_0==40) ) {
						alt29=1;
					}
					switch (alt29) {
						case 1 :
							// myC_new.g:132:48: ','
							{
							match(input,40,FOLLOW_40_in_fun_call_statement1840); 
							}
							break;

					}

					}
					break;

				default :
					break loop30;
				}
			}

			match(input,34,FOLLOW_34_in_fun_call_statement1845); 
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
	// myC_new.g:135:1: if_then_statements : ( statement | '{' statements '}' );
	public final void if_then_statements() throws RecognitionException {
		try {
			// myC_new.g:135:19: ( statement | '{' statements '}' )
			int alt31=2;
			int LA31_0 = input.LA(1);
			if ( ((LA31_0 >= BREAK && LA31_0 <= CASE)||(LA31_0 >= CONTINUE && LA31_0 <= DEFAULT)||LA31_0==ELSE||LA31_0==FOR||LA31_0==IF||LA31_0==Identifier||LA31_0==PRINTF||LA31_0==SCANF||LA31_0==SWITCH||LA31_0==WHILE||LA31_0==38||LA31_0==42) ) {
				alt31=1;
			}
			else if ( (LA31_0==54) ) {
				alt31=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 31, 0, input);
				throw nvae;
			}

			switch (alt31) {
				case 1 :
					// myC_new.g:135:21: statement
					{
					pushFollow(FOLLOW_statement_in_if_then_statements1865);
					statement();
					state._fsp--;

					if (TRACEON) System.out.println("if_then_statements: statement"); 
					}
					break;
				case 2 :
					// myC_new.g:136:21: '{' statements '}'
					{
					match(input,54,FOLLOW_54_in_if_then_statements1889); 
					pushFollow(FOLLOW_statements_in_if_then_statements1891);
					statements();
					state._fsp--;

					match(input,55,FOLLOW_55_in_if_then_statements1893); 
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
	// myC_new.g:140:1: while_statements : ( statement | '{' statements '}' );
	public final void while_statements() throws RecognitionException {
		try {
			// myC_new.g:140:17: ( statement | '{' statements '}' )
			int alt32=2;
			int LA32_0 = input.LA(1);
			if ( ((LA32_0 >= BREAK && LA32_0 <= CASE)||(LA32_0 >= CONTINUE && LA32_0 <= DEFAULT)||LA32_0==ELSE||LA32_0==FOR||LA32_0==IF||LA32_0==Identifier||LA32_0==PRINTF||LA32_0==SCANF||LA32_0==SWITCH||LA32_0==WHILE||LA32_0==38||LA32_0==42) ) {
				alt32=1;
			}
			else if ( (LA32_0==54) ) {
				alt32=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 32, 0, input);
				throw nvae;
			}

			switch (alt32) {
				case 1 :
					// myC_new.g:140:19: statement
					{
					pushFollow(FOLLOW_statement_in_while_statements1910);
					statement();
					state._fsp--;

					if (TRACEON) System.out.println("while_statements: statement"); 
					}
					break;
				case 2 :
					// myC_new.g:141:21: '{' statements '}'
					{
					match(input,54,FOLLOW_54_in_while_statements1934); 
					pushFollow(FOLLOW_statements_in_while_statements1936);
					statements();
					state._fsp--;

					match(input,55,FOLLOW_55_in_while_statements1938); 
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
	// myC_new.g:144:1: for_statements : ( statement | '{' statements '}' );
	public final void for_statements() throws RecognitionException {
		try {
			// myC_new.g:144:15: ( statement | '{' statements '}' )
			int alt33=2;
			int LA33_0 = input.LA(1);
			if ( ((LA33_0 >= BREAK && LA33_0 <= CASE)||(LA33_0 >= CONTINUE && LA33_0 <= DEFAULT)||LA33_0==ELSE||LA33_0==FOR||LA33_0==IF||LA33_0==Identifier||LA33_0==PRINTF||LA33_0==SCANF||LA33_0==SWITCH||LA33_0==WHILE||LA33_0==38||LA33_0==42) ) {
				alt33=1;
			}
			else if ( (LA33_0==54) ) {
				alt33=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 33, 0, input);
				throw nvae;
			}

			switch (alt33) {
				case 1 :
					// myC_new.g:144:17: statement
					{
					pushFollow(FOLLOW_statement_in_for_statements1967);
					statement();
					state._fsp--;

					if (TRACEON) System.out.println("for_statements: statement"); 
					}
					break;
				case 2 :
					// myC_new.g:145:17: '{' statements '}'
					{
					match(input,54,FOLLOW_54_in_for_statements1987); 
					pushFollow(FOLLOW_statements_in_for_statements1989);
					statements();
					state._fsp--;

					match(input,55,FOLLOW_55_in_for_statements1991); 
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
	// myC_new.g:148:1: else_statements : ( statement | '{' statements '}' );
	public final void else_statements() throws RecognitionException {
		try {
			// myC_new.g:148:17: ( statement | '{' statements '}' )
			int alt34=2;
			int LA34_0 = input.LA(1);
			if ( ((LA34_0 >= BREAK && LA34_0 <= CASE)||(LA34_0 >= CONTINUE && LA34_0 <= DEFAULT)||LA34_0==ELSE||LA34_0==FOR||LA34_0==IF||LA34_0==Identifier||LA34_0==PRINTF||LA34_0==SCANF||LA34_0==SWITCH||LA34_0==WHILE||LA34_0==38||LA34_0==42) ) {
				alt34=1;
			}
			else if ( (LA34_0==54) ) {
				alt34=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 34, 0, input);
				throw nvae;
			}

			switch (alt34) {
				case 1 :
					// myC_new.g:148:19: statement
					{
					pushFollow(FOLLOW_statement_in_else_statements2014);
					statement();
					state._fsp--;

					if (TRACEON) System.out.println("else_statements :statement"); 
					}
					break;
				case 2 :
					// myC_new.g:149:21: '{' statements '}'
					{
					match(input,54,FOLLOW_54_in_else_statements2038); 
					pushFollow(FOLLOW_statements_in_else_statements2040);
					statements();
					state._fsp--;

					match(input,55,FOLLOW_55_in_else_statements2042); 
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
	// myC_new.g:152:1: else_if_statements : ( statement | '{' statements '}' );
	public final void else_if_statements() throws RecognitionException {
		try {
			// myC_new.g:152:19: ( statement | '{' statements '}' )
			int alt35=2;
			int LA35_0 = input.LA(1);
			if ( ((LA35_0 >= BREAK && LA35_0 <= CASE)||(LA35_0 >= CONTINUE && LA35_0 <= DEFAULT)||LA35_0==ELSE||LA35_0==FOR||LA35_0==IF||LA35_0==Identifier||LA35_0==PRINTF||LA35_0==SCANF||LA35_0==SWITCH||LA35_0==WHILE||LA35_0==38||LA35_0==42) ) {
				alt35=1;
			}
			else if ( (LA35_0==54) ) {
				alt35=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 35, 0, input);
				throw nvae;
			}

			switch (alt35) {
				case 1 :
					// myC_new.g:152:20: statement
					{
					pushFollow(FOLLOW_statement_in_else_if_statements2080);
					statement();
					state._fsp--;

					if (TRACEON) System.out.println("else_if_statements :statement"); 
					}
					break;
				case 2 :
					// myC_new.g:153:21: '{' statements '}'
					{
					match(input,54,FOLLOW_54_in_else_if_statements2104); 
					pushFollow(FOLLOW_statements_in_else_if_statements2106);
					statements();
					state._fsp--;

					match(input,55,FOLLOW_55_in_else_if_statements2108); 
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
	// myC_new.g:156:1: swtich_statments : '{' statements '}' ;
	public final void swtich_statments() throws RecognitionException {
		try {
			// myC_new.g:156:18: ( '{' statements '}' )
			// myC_new.g:156:21: '{' statements '}'
			{
			match(input,54,FOLLOW_54_in_swtich_statments2135); 
			pushFollow(FOLLOW_statements_in_swtich_statments2137);
			statements();
			state._fsp--;

			match(input,55,FOLLOW_55_in_swtich_statments2139); 
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
	// myC_new.g:160:1: printf_statement : '(' STRING_TYPE ( ',' Identifier )* ')' ';' ;
	public final void printf_statement() throws RecognitionException {
		try {
			// myC_new.g:160:18: ( '(' STRING_TYPE ( ',' Identifier )* ')' ';' )
			// myC_new.g:160:20: '(' STRING_TYPE ( ',' Identifier )* ')' ';'
			{
			match(input,33,FOLLOW_33_in_printf_statement2171); 
			match(input,STRING_TYPE,FOLLOW_STRING_TYPE_in_printf_statement2174); 
			// myC_new.g:160:37: ( ',' Identifier )*
			loop36:
			while (true) {
				int alt36=2;
				int LA36_0 = input.LA(1);
				if ( (LA36_0==40) ) {
					alt36=1;
				}

				switch (alt36) {
				case 1 :
					// myC_new.g:160:38: ',' Identifier
					{
					match(input,40,FOLLOW_40_in_printf_statement2177); 
					match(input,Identifier,FOLLOW_Identifier_in_printf_statement2179); 
					}
					break;

				default :
					break loop36;
				}
			}

			match(input,34,FOLLOW_34_in_printf_statement2183); 
			match(input,47,FOLLOW_47_in_printf_statement2185); 
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
	// myC_new.g:162:1: scanf_statement : '(' STRING_TYPE ( ',' Identifier )* ')' ';' ;
	public final void scanf_statement() throws RecognitionException {
		try {
			// myC_new.g:162:17: ( '(' STRING_TYPE ( ',' Identifier )* ')' ';' )
			// myC_new.g:162:19: '(' STRING_TYPE ( ',' Identifier )* ')' ';'
			{
			match(input,33,FOLLOW_33_in_scanf_statement2204); 
			match(input,STRING_TYPE,FOLLOW_STRING_TYPE_in_scanf_statement2207); 
			// myC_new.g:162:36: ( ',' Identifier )*
			loop37:
			while (true) {
				int alt37=2;
				int LA37_0 = input.LA(1);
				if ( (LA37_0==40) ) {
					alt37=1;
				}

				switch (alt37) {
				case 1 :
					// myC_new.g:162:37: ',' Identifier
					{
					match(input,40,FOLLOW_40_in_scanf_statement2210); 
					match(input,Identifier,FOLLOW_Identifier_in_scanf_statement2212); 
					}
					break;

				default :
					break loop37;
				}
			}

			match(input,34,FOLLOW_34_in_scanf_statement2216); 
			match(input,47,FOLLOW_47_in_scanf_statement2218); 
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



	public static final BitSet FOLLOW_INCLUDE_TYPE_in_program37 = new BitSet(new long[]{0x0000000004031440L});
	public static final BitSet FOLLOW_main_start_in_program42 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fun_in_program44 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_fun55 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_Identifier_in_fun57 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_fun59 = new BitSet(new long[]{0x0000000400021440L});
	public static final BitSet FOLLOW_type_in_fun63 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_Identifier_in_fun65 = new BitSet(new long[]{0x0000010400021440L});
	public static final BitSet FOLLOW_40_in_fun67 = new BitSet(new long[]{0x0000000400021440L});
	public static final BitSet FOLLOW_34_in_fun72 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_fun74 = new BitSet(new long[]{0x000004400AE6BF70L});
	public static final BitSet FOLLOW_declarations_in_fun76 = new BitSet(new long[]{0x000004400AE4AB30L});
	public static final BitSet FOLLOW_statements_in_fun78 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_return_end_in_fun80 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_55_in_fun82 = new BitSet(new long[]{0x0000000004021440L});
	public static final BitSet FOLLOW_fun_in_fun85 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_main_start_in_fun87 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VOID_in_main_start101 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_MAIN_in_main_start103 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_main_start105 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_34_in_main_start107 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_main_start109 = new BitSet(new long[]{0x008004400AE6BF70L});
	public static final BitSet FOLLOW_declarations_in_main_start111 = new BitSet(new long[]{0x008004400AE4AB30L});
	public static final BitSet FOLLOW_statements_in_main_start113 = new BitSet(new long[]{0x0080000000400000L});
	public static final BitSet FOLLOW_return_end_in_main_start115 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_55_in_main_start118 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_declarations143 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_Identifier_in_declarations145 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_declarations147 = new BitSet(new long[]{0x0000000000021440L});
	public static final BitSet FOLLOW_declarations_in_declarations149 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_declarations164 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_Identifier_in_declarations166 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_declarations168 = new BitSet(new long[]{0x0000000001084000L});
	public static final BitSet FOLLOW_set_in_declarations170 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_declarations178 = new BitSet(new long[]{0x0000000000021440L});
	public static final BitSet FOLLOW_declarations_in_declarations180 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_type215 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_type224 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOUBLE_in_type233 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_in_type242 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_type251 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_type252 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_type261 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_type262 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOUBLE_in_type271 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_type272 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_in_type281 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_type282 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RETURN_TYPE_in_return_end298 = new BitSet(new long[]{0x00000000000C4000L});
	public static final BitSet FOLLOW_Integer_constant_in_return_end301 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_return_end303 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Floating_point_constant_in_return_end317 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_return_end319 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_return_end333 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_return_end335 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_statements358 = new BitSet(new long[]{0x000004400AA4AB30L});
	public static final BitSet FOLLOW_statements_in_statements360 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_comparison_expression378 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_53_in_comparison_expression380 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_Integer_constant_in_comparison_expression382 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_comparison_expression409 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_51_in_comparison_expression411 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_Integer_constant_in_comparison_expression413 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_comparison_expression440 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_comparison_expression442 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_Integer_constant_in_comparison_expression444 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_comparison_expression471 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_comparison_expression473 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_Integer_constant_in_comparison_expression475 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_comparison_expression502 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_52_in_comparison_expression504 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_Integer_constant_in_comparison_expression506 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_comparison_expression533 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_comparison_expression535 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_Integer_constant_in_comparison_expression537 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Integer_constant_in_comparison_expression564 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_53_in_comparison_expression566 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_Identifier_in_comparison_expression568 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Integer_constant_in_comparison_expression595 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_51_in_comparison_expression597 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_Identifier_in_comparison_expression599 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Integer_constant_in_comparison_expression626 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_comparison_expression628 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_Identifier_in_comparison_expression630 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Integer_constant_in_comparison_expression657 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_comparison_expression659 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_Identifier_in_comparison_expression661 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Integer_constant_in_comparison_expression688 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_52_in_comparison_expression690 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_Identifier_in_comparison_expression692 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Integer_constant_in_comparison_expression719 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_comparison_expression721 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_Identifier_in_comparison_expression723 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_comparison_expression750 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_53_in_comparison_expression752 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_Identifier_in_comparison_expression754 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_comparison_expression781 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_51_in_comparison_expression783 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_Identifier_in_comparison_expression785 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_comparison_expression812 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_comparison_expression814 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_Identifier_in_comparison_expression816 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_comparison_expression843 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_comparison_expression845 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_Identifier_in_comparison_expression847 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_comparison_expression874 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_52_in_comparison_expression876 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_Identifier_in_comparison_expression878 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_comparison_expression905 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_comparison_expression907 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_Identifier_in_comparison_expression909 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_incre_decre_expression941 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_38_in_incre_decre_expression943 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_incre_decre_expression971 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_42_in_incre_decre_expression973 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_38_in_incre_decre_expression1001 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_Identifier_in_incre_decre_expression1003 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_42_in_incre_decre_expression1032 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_Identifier_in_incre_decre_expression1034 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_multExpr_in_arith_expression1069 = new BitSet(new long[]{0x0000022000000002L});
	public static final BitSet FOLLOW_37_in_arith_expression1091 = new BitSet(new long[]{0x00000202000C4000L});
	public static final BitSet FOLLOW_multExpr_in_arith_expression1093 = new BitSet(new long[]{0x0000022000000002L});
	public static final BitSet FOLLOW_41_in_arith_expression1105 = new BitSet(new long[]{0x00000202000C4000L});
	public static final BitSet FOLLOW_multExpr_in_arith_expression1107 = new BitSet(new long[]{0x0000022000000002L});
	public static final BitSet FOLLOW_signExpr_in_multExpr1148 = new BitSet(new long[]{0x0000100840000002L});
	public static final BitSet FOLLOW_35_in_multExpr1162 = new BitSet(new long[]{0x00000202000C4000L});
	public static final BitSet FOLLOW_signExpr_in_multExpr1164 = new BitSet(new long[]{0x0000100840000002L});
	public static final BitSet FOLLOW_44_in_multExpr1180 = new BitSet(new long[]{0x00000202000C4000L});
	public static final BitSet FOLLOW_signExpr_in_multExpr1182 = new BitSet(new long[]{0x0000100840000002L});
	public static final BitSet FOLLOW_30_in_multExpr1198 = new BitSet(new long[]{0x00000202000C4000L});
	public static final BitSet FOLLOW_signExpr_in_multExpr1200 = new BitSet(new long[]{0x0000100840000002L});
	public static final BitSet FOLLOW_primaryExpr_in_signExpr1221 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_41_in_signExpr1235 = new BitSet(new long[]{0x00000002000C4000L});
	public static final BitSet FOLLOW_primaryExpr_in_signExpr1237 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Integer_constant_in_primaryExpr1253 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Floating_point_constant_in_primaryExpr1270 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_primaryExpr1287 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_33_in_primaryExpr1299 = new BitSet(new long[]{0x00000202000C4000L});
	public static final BitSet FOLLOW_arith_expression_in_primaryExpr1301 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_34_in_primaryExpr1303 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_overloaded_op1324 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_39_in_overloaded_op1327 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_Identifier_in_overloaded_op1330 = new BitSet(new long[]{0x0000008000000002L});
	public static final BitSet FOLLOW_Identifier_in_overloaded_op1352 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_43_in_overloaded_op1355 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_Identifier_in_overloaded_op1358 = new BitSet(new long[]{0x0000080000000002L});
	public static final BitSet FOLLOW_Identifier_in_overloaded_op1380 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_45_in_overloaded_op1383 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_Identifier_in_overloaded_op1386 = new BitSet(new long[]{0x0000200000000002L});
	public static final BitSet FOLLOW_Identifier_in_overloaded_op1408 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_36_in_overloaded_op1411 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_Identifier_in_overloaded_op1414 = new BitSet(new long[]{0x0000001000000002L});
	public static final BitSet FOLLOW_Identifier_in_overloaded_op1436 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_31_in_overloaded_op1439 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_Identifier_in_overloaded_op1442 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_Identifier_in_statement1474 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_statement1476 = new BitSet(new long[]{0x00000202000C4000L});
	public static final BitSet FOLLOW_arith_expression_in_statement1478 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_statement1480 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_overloaded_op_in_statement1496 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_statement1498 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_statement1513 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_statement1515 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_32_in_statement1517 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_Identifier_in_statement1519 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_statement1521 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_statement1537 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_statement1539 = new BitSet(new long[]{0x00000642000C4000L});
	public static final BitSet FOLLOW_arith_expression_in_statement1542 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_comparison_expression_in_statement1544 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_incre_decre_expression_in_statement1546 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_34_in_statement1549 = new BitSet(new long[]{0x004004400AA4AB30L});
	public static final BitSet FOLLOW_if_then_statements_in_statement1551 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ELSE_in_statement1567 = new BitSet(new long[]{0x004004400AA4AB30L});
	public static final BitSet FOLLOW_else_statements_in_statement1570 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE_in_statement1586 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_statement1588 = new BitSet(new long[]{0x00000642000C4000L});
	public static final BitSet FOLLOW_arith_expression_in_statement1591 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_comparison_expression_in_statement1593 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_incre_decre_expression_in_statement1595 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_34_in_statement1598 = new BitSet(new long[]{0x004004400AA4AB30L});
	public static final BitSet FOLLOW_while_statements_in_statement1600 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FOR_in_statement1616 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_statement1618 = new BitSet(new long[]{0x00000202000E5440L});
	public static final BitSet FOLLOW_declarations_in_statement1620 = new BitSet(new long[]{0x00000202000C4000L});
	public static final BitSet FOLLOW_arith_expression_in_statement1623 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_comparison_expression_in_statement1625 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_statement1628 = new BitSet(new long[]{0x0000044000040000L});
	public static final BitSet FOLLOW_Identifier_in_statement1631 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_statement1633 = new BitSet(new long[]{0x00000202000C4000L});
	public static final BitSet FOLLOW_arith_expression_in_statement1635 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_incre_decre_expression_in_statement1637 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_34_in_statement1640 = new BitSet(new long[]{0x004004400AA4AB30L});
	public static final BitSet FOLLOW_for_statements_in_statement1642 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRINTF_in_statement1658 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_printf_statement_in_statement1661 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SCANF_in_statement1677 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_scanf_statement_in_statement1680 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BREAK_in_statement1696 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_statement1698 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONTINUE_in_statement1713 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_statement1715 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SWITCH_in_statement1730 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_statement1732 = new BitSet(new long[]{0x00000202000C4000L});
	public static final BitSet FOLLOW_arith_expression_in_statement1735 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_comparison_expression_in_statement1737 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_34_in_statement1740 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_swtich_statments_in_statement1742 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CASE_in_statement1757 = new BitSet(new long[]{0x0000000000084000L});
	public static final BitSet FOLLOW_set_in_statement1759 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_46_in_statement1765 = new BitSet(new long[]{0x000004400AA4AB30L});
	public static final BitSet FOLLOW_statement_in_statement1767 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DEFAULT_in_statement1782 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_46_in_statement1784 = new BitSet(new long[]{0x000004400AA4AB30L});
	public static final BitSet FOLLOW_statement_in_statement1786 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_incre_decre_expression_in_statement1801 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_statement1803 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fun_call_statement_in_statement1818 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_statement1820 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_fun_call_statement1834 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_fun_call_statement1836 = new BitSet(new long[]{0x0000000400040000L});
	public static final BitSet FOLLOW_Identifier_in_fun_call_statement1838 = new BitSet(new long[]{0x0000010400040000L});
	public static final BitSet FOLLOW_40_in_fun_call_statement1840 = new BitSet(new long[]{0x0000000400040000L});
	public static final BitSet FOLLOW_34_in_fun_call_statement1845 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_if_then_statements1865 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_54_in_if_then_statements1889 = new BitSet(new long[]{0x008004400AA4AB30L});
	public static final BitSet FOLLOW_statements_in_if_then_statements1891 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_55_in_if_then_statements1893 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_while_statements1910 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_54_in_while_statements1934 = new BitSet(new long[]{0x008004400AA4AB30L});
	public static final BitSet FOLLOW_statements_in_while_statements1936 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_55_in_while_statements1938 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_for_statements1967 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_54_in_for_statements1987 = new BitSet(new long[]{0x008004400AA4AB30L});
	public static final BitSet FOLLOW_statements_in_for_statements1989 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_55_in_for_statements1991 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_else_statements2014 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_54_in_else_statements2038 = new BitSet(new long[]{0x008004400AA4AB30L});
	public static final BitSet FOLLOW_statements_in_else_statements2040 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_55_in_else_statements2042 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_else_if_statements2080 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_54_in_else_if_statements2104 = new BitSet(new long[]{0x008004400AA4AB30L});
	public static final BitSet FOLLOW_statements_in_else_if_statements2106 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_55_in_else_if_statements2108 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_54_in_swtich_statments2135 = new BitSet(new long[]{0x008004400AA4AB30L});
	public static final BitSet FOLLOW_statements_in_swtich_statments2137 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_55_in_swtich_statments2139 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_33_in_printf_statement2171 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_STRING_TYPE_in_printf_statement2174 = new BitSet(new long[]{0x0000010400000000L});
	public static final BitSet FOLLOW_40_in_printf_statement2177 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_Identifier_in_printf_statement2179 = new BitSet(new long[]{0x0000010400000000L});
	public static final BitSet FOLLOW_34_in_printf_statement2183 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_printf_statement2185 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_33_in_scanf_statement2204 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_STRING_TYPE_in_scanf_statement2207 = new BitSet(new long[]{0x0000010400000000L});
	public static final BitSet FOLLOW_40_in_scanf_statement2210 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_Identifier_in_scanf_statement2212 = new BitSet(new long[]{0x0000010400000000L});
	public static final BitSet FOLLOW_34_in_scanf_statement2216 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_scanf_statement2218 = new BitSet(new long[]{0x0000000000000002L});
}
