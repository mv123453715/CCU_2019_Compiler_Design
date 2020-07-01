// $ANTLR 3.5.2 myChecker.g 2020-05-30 14:54:35

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class myCheckerLexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public myCheckerLexer() {} 
	public myCheckerLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public myCheckerLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "myChecker.g"; }

	// $ANTLR start "T__30"
	public final void mT__30() throws RecognitionException {
		try {
			int _type = T__30;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:2:7: ( '!=' )
			// myChecker.g:2:9: '!='
			{
			match("!="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__30"

	// $ANTLR start "T__31"
	public final void mT__31() throws RecognitionException {
		try {
			int _type = T__31;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:3:7: ( '%=' )
			// myChecker.g:3:9: '%='
			{
			match("%="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__31"

	// $ANTLR start "T__32"
	public final void mT__32() throws RecognitionException {
		try {
			int _type = T__32;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:4:7: ( '(' )
			// myChecker.g:4:9: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__32"

	// $ANTLR start "T__33"
	public final void mT__33() throws RecognitionException {
		try {
			int _type = T__33;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:5:7: ( ')' )
			// myChecker.g:5:9: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__33"

	// $ANTLR start "T__34"
	public final void mT__34() throws RecognitionException {
		try {
			int _type = T__34;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:6:7: ( '*' )
			// myChecker.g:6:9: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__34"

	// $ANTLR start "T__35"
	public final void mT__35() throws RecognitionException {
		try {
			int _type = T__35;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:7:7: ( '*=' )
			// myChecker.g:7:9: '*='
			{
			match("*="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__35"

	// $ANTLR start "T__36"
	public final void mT__36() throws RecognitionException {
		try {
			int _type = T__36;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:8:7: ( '+' )
			// myChecker.g:8:9: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__36"

	// $ANTLR start "T__37"
	public final void mT__37() throws RecognitionException {
		try {
			int _type = T__37;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:9:7: ( '++' )
			// myChecker.g:9:9: '++'
			{
			match("++"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__37"

	// $ANTLR start "T__38"
	public final void mT__38() throws RecognitionException {
		try {
			int _type = T__38;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:10:7: ( '+=' )
			// myChecker.g:10:9: '+='
			{
			match("+="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__38"

	// $ANTLR start "T__39"
	public final void mT__39() throws RecognitionException {
		try {
			int _type = T__39;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:11:7: ( ',' )
			// myChecker.g:11:9: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__39"

	// $ANTLR start "T__40"
	public final void mT__40() throws RecognitionException {
		try {
			int _type = T__40;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:12:7: ( '-' )
			// myChecker.g:12:9: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__40"

	// $ANTLR start "T__41"
	public final void mT__41() throws RecognitionException {
		try {
			int _type = T__41;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:13:7: ( '--' )
			// myChecker.g:13:9: '--'
			{
			match("--"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__41"

	// $ANTLR start "T__42"
	public final void mT__42() throws RecognitionException {
		try {
			int _type = T__42;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:14:7: ( '-=' )
			// myChecker.g:14:9: '-='
			{
			match("-="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__42"

	// $ANTLR start "T__43"
	public final void mT__43() throws RecognitionException {
		try {
			int _type = T__43;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:15:7: ( '/' )
			// myChecker.g:15:9: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__43"

	// $ANTLR start "T__44"
	public final void mT__44() throws RecognitionException {
		try {
			int _type = T__44;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:16:7: ( '/=' )
			// myChecker.g:16:9: '/='
			{
			match("/="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__44"

	// $ANTLR start "T__45"
	public final void mT__45() throws RecognitionException {
		try {
			int _type = T__45;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:17:7: ( ':' )
			// myChecker.g:17:9: ':'
			{
			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__45"

	// $ANTLR start "T__46"
	public final void mT__46() throws RecognitionException {
		try {
			int _type = T__46;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:18:7: ( ';' )
			// myChecker.g:18:9: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__46"

	// $ANTLR start "T__47"
	public final void mT__47() throws RecognitionException {
		try {
			int _type = T__47;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:19:7: ( '<' )
			// myChecker.g:19:9: '<'
			{
			match('<'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__47"

	// $ANTLR start "T__48"
	public final void mT__48() throws RecognitionException {
		try {
			int _type = T__48;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:20:7: ( '<=' )
			// myChecker.g:20:9: '<='
			{
			match("<="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__48"

	// $ANTLR start "T__49"
	public final void mT__49() throws RecognitionException {
		try {
			int _type = T__49;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:21:7: ( '=' )
			// myChecker.g:21:9: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__49"

	// $ANTLR start "T__50"
	public final void mT__50() throws RecognitionException {
		try {
			int _type = T__50;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:22:7: ( '==' )
			// myChecker.g:22:9: '=='
			{
			match("=="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__50"

	// $ANTLR start "T__51"
	public final void mT__51() throws RecognitionException {
		try {
			int _type = T__51;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:23:7: ( '>' )
			// myChecker.g:23:9: '>'
			{
			match('>'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__51"

	// $ANTLR start "T__52"
	public final void mT__52() throws RecognitionException {
		try {
			int _type = T__52;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:24:7: ( '>=' )
			// myChecker.g:24:9: '>='
			{
			match(">="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__52"

	// $ANTLR start "T__53"
	public final void mT__53() throws RecognitionException {
		try {
			int _type = T__53;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:25:7: ( '{' )
			// myChecker.g:25:9: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__53"

	// $ANTLR start "T__54"
	public final void mT__54() throws RecognitionException {
		try {
			int _type = T__54;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:26:7: ( '}' )
			// myChecker.g:26:9: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__54"

	// $ANTLR start "STRING_TYPE"
	public final void mSTRING_TYPE() throws RecognitionException {
		try {
			int _type = STRING_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:383:13: ( '\"' (~ ( '\\r' | '\\n' | '\"' ) )* '\"' )
			// myChecker.g:383:16: '\"' (~ ( '\\r' | '\\n' | '\"' ) )* '\"'
			{
			match('\"'); 
			// myChecker.g:383:20: (~ ( '\\r' | '\\n' | '\"' ) )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '\u0000' && LA1_0 <= '\t')||(LA1_0 >= '\u000B' && LA1_0 <= '\f')||(LA1_0 >= '\u000E' && LA1_0 <= '!')||(LA1_0 >= '#' && LA1_0 <= '\uFFFF')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// myChecker.g:
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop1;
				}
			}

			match('\"'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING_TYPE"

	// $ANTLR start "CHAR"
	public final void mCHAR() throws RecognitionException {
		try {
			int _type = CHAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:384:6: ( 'char' )
			// myChecker.g:384:8: 'char'
			{
			match("char"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CHAR"

	// $ANTLR start "PRINTF"
	public final void mPRINTF() throws RecognitionException {
		try {
			int _type = PRINTF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:385:7: ( 'printf' )
			// myChecker.g:385:8: 'printf'
			{
			match("printf"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PRINTF"

	// $ANTLR start "SCANF"
	public final void mSCANF() throws RecognitionException {
		try {
			int _type = SCANF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:386:7: ( 'scanf' )
			// myChecker.g:386:8: 'scanf'
			{
			match("scanf"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SCANF"

	// $ANTLR start "RETURN_TYPE"
	public final void mRETURN_TYPE() throws RecognitionException {
		try {
			int _type = RETURN_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:387:12: ( 'return' )
			// myChecker.g:387:13: 'return'
			{
			match("return"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RETURN_TYPE"

	// $ANTLR start "DOUBLE"
	public final void mDOUBLE() throws RecognitionException {
		try {
			int _type = DOUBLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:388:7: ( 'double' )
			// myChecker.g:388:8: 'double'
			{
			match("double"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DOUBLE"

	// $ANTLR start "FLOAT"
	public final void mFLOAT() throws RecognitionException {
		try {
			int _type = FLOAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:389:6: ( 'float' )
			// myChecker.g:389:7: 'float'
			{
			match("float"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT"

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:390:4: ( 'int' )
			// myChecker.g:390:5: 'int'
			{
			match("int"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT"

	// $ANTLR start "MAIN"
	public final void mMAIN() throws RecognitionException {
		try {
			int _type = MAIN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:391:5: ( 'main' )
			// myChecker.g:391:7: 'main'
			{
			match("main"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MAIN"

	// $ANTLR start "VOID"
	public final void mVOID() throws RecognitionException {
		try {
			int _type = VOID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:392:5: ( 'void' )
			// myChecker.g:392:7: 'void'
			{
			match("void"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VOID"

	// $ANTLR start "IF"
	public final void mIF() throws RecognitionException {
		try {
			int _type = IF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:393:3: ( 'if' )
			// myChecker.g:393:5: 'if'
			{
			match("if"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IF"

	// $ANTLR start "ELSE"
	public final void mELSE() throws RecognitionException {
		try {
			int _type = ELSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:394:5: ( 'else' )
			// myChecker.g:394:7: 'else'
			{
			match("else"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ELSE"

	// $ANTLR start "WHILE"
	public final void mWHILE() throws RecognitionException {
		try {
			int _type = WHILE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:395:6: ( 'while' )
			// myChecker.g:395:8: 'while'
			{
			match("while"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WHILE"

	// $ANTLR start "FOR"
	public final void mFOR() throws RecognitionException {
		try {
			int _type = FOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:396:4: ( 'for' )
			// myChecker.g:396:6: 'for'
			{
			match("for"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FOR"

	// $ANTLR start "SWITCH"
	public final void mSWITCH() throws RecognitionException {
		try {
			int _type = SWITCH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:397:7: ( 'switch' )
			// myChecker.g:397:9: 'switch'
			{
			match("switch"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SWITCH"

	// $ANTLR start "CASE"
	public final void mCASE() throws RecognitionException {
		try {
			int _type = CASE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:398:5: ( 'case' )
			// myChecker.g:398:7: 'case'
			{
			match("case"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CASE"

	// $ANTLR start "DEFAULT"
	public final void mDEFAULT() throws RecognitionException {
		try {
			int _type = DEFAULT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:399:8: ( 'default' )
			// myChecker.g:399:10: 'default'
			{
			match("default"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DEFAULT"

	// $ANTLR start "BREAK"
	public final void mBREAK() throws RecognitionException {
		try {
			int _type = BREAK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:400:6: ( 'break' )
			// myChecker.g:400:8: 'break'
			{
			match("break"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BREAK"

	// $ANTLR start "CONTINUE"
	public final void mCONTINUE() throws RecognitionException {
		try {
			int _type = CONTINUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:401:10: ( 'continue' )
			// myChecker.g:401:12: 'continue'
			{
			match("continue"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CONTINUE"

	// $ANTLR start "BOOL"
	public final void mBOOL() throws RecognitionException {
		try {
			int _type = BOOL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:402:6: ( 'bool' )
			// myChecker.g:402:7: 'bool'
			{
			match("bool"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BOOL"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:408:3: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
			// myChecker.g:408:4: ( ' ' | '\\t' | '\\r' | '\\n' )
			{
			if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "Identifier"
	public final void mIdentifier() throws RecognitionException {
		try {
			int _type = Identifier;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:409:11: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
			// myChecker.g:409:12: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// myChecker.g:409:36: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')||(LA2_0 >= 'A' && LA2_0 <= 'Z')||LA2_0=='_'||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// myChecker.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop2;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Identifier"

	// $ANTLR start "Integer_constant"
	public final void mInteger_constant() throws RecognitionException {
		try {
			int _type = Integer_constant;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:410:17: ( ( '0' .. '9' )+ )
			// myChecker.g:410:18: ( '0' .. '9' )+
			{
			// myChecker.g:410:18: ( '0' .. '9' )+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// myChecker.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt3 >= 1 ) break loop3;
					EarlyExitException eee = new EarlyExitException(3, input);
					throw eee;
				}
				cnt3++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Integer_constant"

	// $ANTLR start "Floating_point_constant"
	public final void mFloating_point_constant() throws RecognitionException {
		try {
			int _type = Floating_point_constant;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:411:24: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )+ )
			// myChecker.g:411:25: ( '0' .. '9' )+ '.' ( '0' .. '9' )+
			{
			// myChecker.g:411:25: ( '0' .. '9' )+
			int cnt4=0;
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// myChecker.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt4 >= 1 ) break loop4;
					EarlyExitException eee = new EarlyExitException(4, input);
					throw eee;
				}
				cnt4++;
			}

			match('.'); 
			// myChecker.g:411:39: ( '0' .. '9' )+
			int cnt5=0;
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( ((LA5_0 >= '0' && LA5_0 <= '9')) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// myChecker.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt5 >= 1 ) break loop5;
					EarlyExitException eee = new EarlyExitException(5, input);
					throw eee;
				}
				cnt5++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Floating_point_constant"

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:414:8: ( '/*' ( . )* '*/' )
			// myChecker.g:414:9: '/*' ( . )* '*/'
			{
			match("/*"); 

			// myChecker.g:414:14: ( . )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0=='*') ) {
					int LA6_1 = input.LA(2);
					if ( (LA6_1=='/') ) {
						alt6=2;
					}
					else if ( ((LA6_1 >= '\u0000' && LA6_1 <= '.')||(LA6_1 >= '0' && LA6_1 <= '\uFFFF')) ) {
						alt6=1;
					}

				}
				else if ( ((LA6_0 >= '\u0000' && LA6_0 <= ')')||(LA6_0 >= '+' && LA6_0 <= '\uFFFF')) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// myChecker.g:414:14: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop6;
				}
			}

			match("*/"); 

			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT"

	// $ANTLR start "INCLUDE_TYPE"
	public final void mINCLUDE_TYPE() throws RecognitionException {
		try {
			int _type = INCLUDE_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:420:13: ( '#include <' ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* '.h>' )
			// myChecker.g:420:15: '#include <' ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* '.h>'
			{
			match("#include <"); 

			// myChecker.g:420:27: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( ((LA7_0 >= '0' && LA7_0 <= '9')||(LA7_0 >= 'A' && LA7_0 <= 'Z')||LA7_0=='_'||(LA7_0 >= 'a' && LA7_0 <= 'z')) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// myChecker.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop7;
				}
			}

			match(".h>"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INCLUDE_TYPE"

	@Override
	public void mTokens() throws RecognitionException {
		// myChecker.g:1:8: ( T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | STRING_TYPE | CHAR | PRINTF | SCANF | RETURN_TYPE | DOUBLE | FLOAT | INT | MAIN | VOID | IF | ELSE | WHILE | FOR | SWITCH | CASE | DEFAULT | BREAK | CONTINUE | BOOL | WS | Identifier | Integer_constant | Floating_point_constant | COMMENT | INCLUDE_TYPE )
		int alt8=51;
		alt8 = dfa8.predict(input);
		switch (alt8) {
			case 1 :
				// myChecker.g:1:10: T__30
				{
				mT__30(); 

				}
				break;
			case 2 :
				// myChecker.g:1:16: T__31
				{
				mT__31(); 

				}
				break;
			case 3 :
				// myChecker.g:1:22: T__32
				{
				mT__32(); 

				}
				break;
			case 4 :
				// myChecker.g:1:28: T__33
				{
				mT__33(); 

				}
				break;
			case 5 :
				// myChecker.g:1:34: T__34
				{
				mT__34(); 

				}
				break;
			case 6 :
				// myChecker.g:1:40: T__35
				{
				mT__35(); 

				}
				break;
			case 7 :
				// myChecker.g:1:46: T__36
				{
				mT__36(); 

				}
				break;
			case 8 :
				// myChecker.g:1:52: T__37
				{
				mT__37(); 

				}
				break;
			case 9 :
				// myChecker.g:1:58: T__38
				{
				mT__38(); 

				}
				break;
			case 10 :
				// myChecker.g:1:64: T__39
				{
				mT__39(); 

				}
				break;
			case 11 :
				// myChecker.g:1:70: T__40
				{
				mT__40(); 

				}
				break;
			case 12 :
				// myChecker.g:1:76: T__41
				{
				mT__41(); 

				}
				break;
			case 13 :
				// myChecker.g:1:82: T__42
				{
				mT__42(); 

				}
				break;
			case 14 :
				// myChecker.g:1:88: T__43
				{
				mT__43(); 

				}
				break;
			case 15 :
				// myChecker.g:1:94: T__44
				{
				mT__44(); 

				}
				break;
			case 16 :
				// myChecker.g:1:100: T__45
				{
				mT__45(); 

				}
				break;
			case 17 :
				// myChecker.g:1:106: T__46
				{
				mT__46(); 

				}
				break;
			case 18 :
				// myChecker.g:1:112: T__47
				{
				mT__47(); 

				}
				break;
			case 19 :
				// myChecker.g:1:118: T__48
				{
				mT__48(); 

				}
				break;
			case 20 :
				// myChecker.g:1:124: T__49
				{
				mT__49(); 

				}
				break;
			case 21 :
				// myChecker.g:1:130: T__50
				{
				mT__50(); 

				}
				break;
			case 22 :
				// myChecker.g:1:136: T__51
				{
				mT__51(); 

				}
				break;
			case 23 :
				// myChecker.g:1:142: T__52
				{
				mT__52(); 

				}
				break;
			case 24 :
				// myChecker.g:1:148: T__53
				{
				mT__53(); 

				}
				break;
			case 25 :
				// myChecker.g:1:154: T__54
				{
				mT__54(); 

				}
				break;
			case 26 :
				// myChecker.g:1:160: STRING_TYPE
				{
				mSTRING_TYPE(); 

				}
				break;
			case 27 :
				// myChecker.g:1:172: CHAR
				{
				mCHAR(); 

				}
				break;
			case 28 :
				// myChecker.g:1:177: PRINTF
				{
				mPRINTF(); 

				}
				break;
			case 29 :
				// myChecker.g:1:184: SCANF
				{
				mSCANF(); 

				}
				break;
			case 30 :
				// myChecker.g:1:190: RETURN_TYPE
				{
				mRETURN_TYPE(); 

				}
				break;
			case 31 :
				// myChecker.g:1:202: DOUBLE
				{
				mDOUBLE(); 

				}
				break;
			case 32 :
				// myChecker.g:1:209: FLOAT
				{
				mFLOAT(); 

				}
				break;
			case 33 :
				// myChecker.g:1:215: INT
				{
				mINT(); 

				}
				break;
			case 34 :
				// myChecker.g:1:219: MAIN
				{
				mMAIN(); 

				}
				break;
			case 35 :
				// myChecker.g:1:224: VOID
				{
				mVOID(); 

				}
				break;
			case 36 :
				// myChecker.g:1:229: IF
				{
				mIF(); 

				}
				break;
			case 37 :
				// myChecker.g:1:232: ELSE
				{
				mELSE(); 

				}
				break;
			case 38 :
				// myChecker.g:1:237: WHILE
				{
				mWHILE(); 

				}
				break;
			case 39 :
				// myChecker.g:1:243: FOR
				{
				mFOR(); 

				}
				break;
			case 40 :
				// myChecker.g:1:247: SWITCH
				{
				mSWITCH(); 

				}
				break;
			case 41 :
				// myChecker.g:1:254: CASE
				{
				mCASE(); 

				}
				break;
			case 42 :
				// myChecker.g:1:259: DEFAULT
				{
				mDEFAULT(); 

				}
				break;
			case 43 :
				// myChecker.g:1:267: BREAK
				{
				mBREAK(); 

				}
				break;
			case 44 :
				// myChecker.g:1:273: CONTINUE
				{
				mCONTINUE(); 

				}
				break;
			case 45 :
				// myChecker.g:1:282: BOOL
				{
				mBOOL(); 

				}
				break;
			case 46 :
				// myChecker.g:1:287: WS
				{
				mWS(); 

				}
				break;
			case 47 :
				// myChecker.g:1:290: Identifier
				{
				mIdentifier(); 

				}
				break;
			case 48 :
				// myChecker.g:1:301: Integer_constant
				{
				mInteger_constant(); 

				}
				break;
			case 49 :
				// myChecker.g:1:318: Floating_point_constant
				{
				mFloating_point_constant(); 

				}
				break;
			case 50 :
				// myChecker.g:1:342: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 51 :
				// myChecker.g:1:350: INCLUDE_TYPE
				{
				mINCLUDE_TYPE(); 

				}
				break;

		}
	}


	protected DFA8 dfa8 = new DFA8(this);
	static final String DFA8_eotS =
		"\5\uffff\1\43\1\46\1\uffff\1\51\1\54\2\uffff\1\56\1\60\1\62\3\uffff\14"+
		"\37\2\uffff\1\106\22\uffff\14\37\1\124\6\37\2\uffff\12\37\1\145\1\146"+
		"\1\uffff\6\37\1\155\1\156\10\37\2\uffff\1\167\1\170\1\171\2\37\1\174\2"+
		"\uffff\2\37\1\177\4\37\1\u0084\3\uffff\1\u0085\1\u0086\1\uffff\1\37\1"+
		"\u0088\1\uffff\1\u0089\1\u008a\1\u008b\1\37\3\uffff\1\37\4\uffff\1\u008e"+
		"\1\u008f\2\uffff";
	static final String DFA8_eofS =
		"\u0090\uffff";
	static final String DFA8_minS =
		"\1\11\4\uffff\1\75\1\53\1\uffff\1\55\1\52\2\uffff\3\75\3\uffff\1\141\1"+
		"\162\1\143\2\145\1\154\1\146\1\141\1\157\1\154\1\150\1\157\2\uffff\1\56"+
		"\22\uffff\1\141\1\163\1\156\1\151\1\141\1\151\1\164\1\165\1\146\1\157"+
		"\1\162\1\164\1\60\2\151\1\163\1\151\1\145\1\157\2\uffff\1\162\1\145\1"+
		"\164\2\156\1\164\1\165\1\142\2\141\2\60\1\uffff\1\156\1\144\1\145\1\154"+
		"\1\141\1\154\2\60\1\151\1\164\1\146\1\143\1\162\1\154\1\165\1\164\2\uffff"+
		"\3\60\1\145\1\153\1\60\2\uffff\1\156\1\146\1\60\1\150\1\156\1\145\1\154"+
		"\1\60\3\uffff\2\60\1\uffff\1\165\1\60\1\uffff\3\60\1\164\3\uffff\1\145"+
		"\4\uffff\2\60\2\uffff";
	static final String DFA8_maxS =
		"\1\175\4\uffff\2\75\1\uffff\2\75\2\uffff\3\75\3\uffff\1\157\1\162\1\167"+
		"\1\145\2\157\1\156\1\141\1\157\1\154\1\150\1\162\2\uffff\1\71\22\uffff"+
		"\1\141\1\163\1\156\1\151\1\141\1\151\1\164\1\165\1\146\1\157\1\162\1\164"+
		"\1\172\2\151\1\163\1\151\1\145\1\157\2\uffff\1\162\1\145\1\164\2\156\1"+
		"\164\1\165\1\142\2\141\2\172\1\uffff\1\156\1\144\1\145\1\154\1\141\1\154"+
		"\2\172\1\151\1\164\1\146\1\143\1\162\1\154\1\165\1\164\2\uffff\3\172\1"+
		"\145\1\153\1\172\2\uffff\1\156\1\146\1\172\1\150\1\156\1\145\1\154\1\172"+
		"\3\uffff\2\172\1\uffff\1\165\1\172\1\uffff\3\172\1\164\3\uffff\1\145\4"+
		"\uffff\2\172\2\uffff";
	static final String DFA8_acceptS =
		"\1\uffff\1\1\1\2\1\3\1\4\2\uffff\1\12\2\uffff\1\20\1\21\3\uffff\1\30\1"+
		"\31\1\32\14\uffff\1\56\1\57\1\uffff\1\63\1\6\1\5\1\10\1\11\1\7\1\14\1"+
		"\15\1\13\1\17\1\62\1\16\1\23\1\22\1\25\1\24\1\27\1\26\23\uffff\1\60\1"+
		"\61\14\uffff\1\44\20\uffff\1\47\1\41\6\uffff\1\33\1\51\10\uffff\1\42\1"+
		"\43\1\45\2\uffff\1\55\2\uffff\1\35\4\uffff\1\40\1\46\1\53\1\uffff\1\34"+
		"\1\50\1\36\1\37\2\uffff\1\52\1\54";
	static final String DFA8_specialS =
		"\u0090\uffff}>";
	static final String[] DFA8_transitionS = {
			"\2\36\2\uffff\1\36\22\uffff\1\36\1\1\1\21\1\41\1\uffff\1\2\2\uffff\1"+
			"\3\1\4\1\5\1\6\1\7\1\10\1\uffff\1\11\12\40\1\12\1\13\1\14\1\15\1\16\2"+
			"\uffff\32\37\4\uffff\1\37\1\uffff\1\37\1\35\1\22\1\26\1\33\1\27\2\37"+
			"\1\30\3\37\1\31\2\37\1\23\1\37\1\25\1\24\2\37\1\32\1\34\3\37\1\17\1\uffff"+
			"\1\20",
			"",
			"",
			"",
			"",
			"\1\42",
			"\1\44\21\uffff\1\45",
			"",
			"\1\47\17\uffff\1\50",
			"\1\53\22\uffff\1\52",
			"",
			"",
			"\1\55",
			"\1\57",
			"\1\61",
			"",
			"",
			"",
			"\1\64\6\uffff\1\63\6\uffff\1\65",
			"\1\66",
			"\1\67\23\uffff\1\70",
			"\1\71",
			"\1\73\11\uffff\1\72",
			"\1\74\2\uffff\1\75",
			"\1\77\7\uffff\1\76",
			"\1\100",
			"\1\101",
			"\1\102",
			"\1\103",
			"\1\105\2\uffff\1\104",
			"",
			"",
			"\1\107\1\uffff\12\40",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\110",
			"\1\111",
			"\1\112",
			"\1\113",
			"\1\114",
			"\1\115",
			"\1\116",
			"\1\117",
			"\1\120",
			"\1\121",
			"\1\122",
			"\1\123",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"\1\125",
			"\1\126",
			"\1\127",
			"\1\130",
			"\1\131",
			"\1\132",
			"",
			"",
			"\1\133",
			"\1\134",
			"\1\135",
			"\1\136",
			"\1\137",
			"\1\140",
			"\1\141",
			"\1\142",
			"\1\143",
			"\1\144",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"",
			"\1\147",
			"\1\150",
			"\1\151",
			"\1\152",
			"\1\153",
			"\1\154",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"\1\157",
			"\1\160",
			"\1\161",
			"\1\162",
			"\1\163",
			"\1\164",
			"\1\165",
			"\1\166",
			"",
			"",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"\1\172",
			"\1\173",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"",
			"",
			"\1\175",
			"\1\176",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"\1\u0080",
			"\1\u0081",
			"\1\u0082",
			"\1\u0083",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"",
			"",
			"",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"",
			"\1\u0087",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"\1\u008c",
			"",
			"",
			"",
			"\1\u008d",
			"",
			"",
			"",
			"",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"",
			""
	};

	static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
	static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
	static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
	static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
	static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
	static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
	static final short[][] DFA8_transition;

	static {
		int numStates = DFA8_transitionS.length;
		DFA8_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
		}
	}

	protected class DFA8 extends DFA {

		public DFA8(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 8;
			this.eot = DFA8_eot;
			this.eof = DFA8_eof;
			this.min = DFA8_min;
			this.max = DFA8_max;
			this.accept = DFA8_accept;
			this.special = DFA8_special;
			this.transition = DFA8_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | STRING_TYPE | CHAR | PRINTF | SCANF | RETURN_TYPE | DOUBLE | FLOAT | INT | MAIN | VOID | IF | ELSE | WHILE | FOR | SWITCH | CASE | DEFAULT | BREAK | CONTINUE | BOOL | WS | Identifier | Integer_constant | Floating_point_constant | COMMENT | INCLUDE_TYPE );";
		}
	}

}
