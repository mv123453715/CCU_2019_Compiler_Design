// $ANTLR 3.5.2 myC_new.g 2020-05-14 12:16:54

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class myC_newLexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public myC_newLexer() {} 
	public myC_newLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public myC_newLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "myC_new.g"; }

	// $ANTLR start "T__29"
	public final void mT__29() throws RecognitionException {
		try {
			int _type = T__29;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myC_new.g:7:7: ( '!=' )
			// myC_new.g:7:9: '!='
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
	// $ANTLR end "T__29"

	// $ANTLR start "T__30"
	public final void mT__30() throws RecognitionException {
		try {
			int _type = T__30;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myC_new.g:8:7: ( '%' )
			// myC_new.g:8:9: '%'
			{
			match('%'); 
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
			// myC_new.g:9:7: ( '%=' )
			// myC_new.g:9:9: '%='
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
			// myC_new.g:10:7: ( '&' )
			// myC_new.g:10:9: '&'
			{
			match('&'); 
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
			// myC_new.g:11:7: ( '(' )
			// myC_new.g:11:9: '('
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
	// $ANTLR end "T__33"

	// $ANTLR start "T__34"
	public final void mT__34() throws RecognitionException {
		try {
			int _type = T__34;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myC_new.g:12:7: ( ')' )
			// myC_new.g:12:9: ')'
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
	// $ANTLR end "T__34"

	// $ANTLR start "T__35"
	public final void mT__35() throws RecognitionException {
		try {
			int _type = T__35;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myC_new.g:13:7: ( '*' )
			// myC_new.g:13:9: '*'
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
	// $ANTLR end "T__35"

	// $ANTLR start "T__36"
	public final void mT__36() throws RecognitionException {
		try {
			int _type = T__36;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myC_new.g:14:7: ( '*=' )
			// myC_new.g:14:9: '*='
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
	// $ANTLR end "T__36"

	// $ANTLR start "T__37"
	public final void mT__37() throws RecognitionException {
		try {
			int _type = T__37;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myC_new.g:15:7: ( '+' )
			// myC_new.g:15:9: '+'
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
	// $ANTLR end "T__37"

	// $ANTLR start "T__38"
	public final void mT__38() throws RecognitionException {
		try {
			int _type = T__38;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myC_new.g:16:7: ( '++' )
			// myC_new.g:16:9: '++'
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
	// $ANTLR end "T__38"

	// $ANTLR start "T__39"
	public final void mT__39() throws RecognitionException {
		try {
			int _type = T__39;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myC_new.g:17:7: ( '+=' )
			// myC_new.g:17:9: '+='
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
	// $ANTLR end "T__39"

	// $ANTLR start "T__40"
	public final void mT__40() throws RecognitionException {
		try {
			int _type = T__40;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myC_new.g:18:7: ( ',' )
			// myC_new.g:18:9: ','
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
	// $ANTLR end "T__40"

	// $ANTLR start "T__41"
	public final void mT__41() throws RecognitionException {
		try {
			int _type = T__41;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myC_new.g:19:7: ( '-' )
			// myC_new.g:19:9: '-'
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
	// $ANTLR end "T__41"

	// $ANTLR start "T__42"
	public final void mT__42() throws RecognitionException {
		try {
			int _type = T__42;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myC_new.g:20:7: ( '--' )
			// myC_new.g:20:9: '--'
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
	// $ANTLR end "T__42"

	// $ANTLR start "T__43"
	public final void mT__43() throws RecognitionException {
		try {
			int _type = T__43;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myC_new.g:21:7: ( '-=' )
			// myC_new.g:21:9: '-='
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
	// $ANTLR end "T__43"

	// $ANTLR start "T__44"
	public final void mT__44() throws RecognitionException {
		try {
			int _type = T__44;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myC_new.g:22:7: ( '/' )
			// myC_new.g:22:9: '/'
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
	// $ANTLR end "T__44"

	// $ANTLR start "T__45"
	public final void mT__45() throws RecognitionException {
		try {
			int _type = T__45;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myC_new.g:23:7: ( '/=' )
			// myC_new.g:23:9: '/='
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
	// $ANTLR end "T__45"

	// $ANTLR start "T__46"
	public final void mT__46() throws RecognitionException {
		try {
			int _type = T__46;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myC_new.g:24:7: ( ':' )
			// myC_new.g:24:9: ':'
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
	// $ANTLR end "T__46"

	// $ANTLR start "T__47"
	public final void mT__47() throws RecognitionException {
		try {
			int _type = T__47;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myC_new.g:25:7: ( ';' )
			// myC_new.g:25:9: ';'
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
	// $ANTLR end "T__47"

	// $ANTLR start "T__48"
	public final void mT__48() throws RecognitionException {
		try {
			int _type = T__48;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myC_new.g:26:7: ( '<' )
			// myC_new.g:26:9: '<'
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
	// $ANTLR end "T__48"

	// $ANTLR start "T__49"
	public final void mT__49() throws RecognitionException {
		try {
			int _type = T__49;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myC_new.g:27:7: ( '<=' )
			// myC_new.g:27:9: '<='
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
	// $ANTLR end "T__49"

	// $ANTLR start "T__50"
	public final void mT__50() throws RecognitionException {
		try {
			int _type = T__50;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myC_new.g:28:7: ( '=' )
			// myC_new.g:28:9: '='
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
	// $ANTLR end "T__50"

	// $ANTLR start "T__51"
	public final void mT__51() throws RecognitionException {
		try {
			int _type = T__51;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myC_new.g:29:7: ( '==' )
			// myC_new.g:29:9: '=='
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
	// $ANTLR end "T__51"

	// $ANTLR start "T__52"
	public final void mT__52() throws RecognitionException {
		try {
			int _type = T__52;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myC_new.g:30:7: ( '>' )
			// myC_new.g:30:9: '>'
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
	// $ANTLR end "T__52"

	// $ANTLR start "T__53"
	public final void mT__53() throws RecognitionException {
		try {
			int _type = T__53;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myC_new.g:31:7: ( '>=' )
			// myC_new.g:31:9: '>='
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
	// $ANTLR end "T__53"

	// $ANTLR start "T__54"
	public final void mT__54() throws RecognitionException {
		try {
			int _type = T__54;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myC_new.g:32:7: ( '{' )
			// myC_new.g:32:9: '{'
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
	// $ANTLR end "T__54"

	// $ANTLR start "T__55"
	public final void mT__55() throws RecognitionException {
		try {
			int _type = T__55;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myC_new.g:33:7: ( '}' )
			// myC_new.g:33:9: '}'
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
	// $ANTLR end "T__55"

	// $ANTLR start "STRING_TYPE"
	public final void mSTRING_TYPE() throws RecognitionException {
		try {
			int _type = STRING_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myC_new.g:166:13: ( '\"' (~ ( '\\r' | '\\n' | '\"' ) )* '\"' )
			// myC_new.g:166:16: '\"' (~ ( '\\r' | '\\n' | '\"' ) )* '\"'
			{
			match('\"'); 
			// myC_new.g:166:20: (~ ( '\\r' | '\\n' | '\"' ) )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '\u0000' && LA1_0 <= '\t')||(LA1_0 >= '\u000B' && LA1_0 <= '\f')||(LA1_0 >= '\u000E' && LA1_0 <= '!')||(LA1_0 >= '#' && LA1_0 <= '\uFFFF')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// myC_new.g:
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
			// myC_new.g:167:6: ( 'char' )
			// myC_new.g:167:8: 'char'
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
			// myC_new.g:168:7: ( 'printf' )
			// myC_new.g:168:8: 'printf'
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
			// myC_new.g:169:7: ( 'scanf' )
			// myC_new.g:169:8: 'scanf'
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
			// myC_new.g:170:12: ( 'return' )
			// myC_new.g:170:13: 'return'
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
			// myC_new.g:171:7: ( 'double' )
			// myC_new.g:171:8: 'double'
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
			// myC_new.g:172:6: ( 'float' )
			// myC_new.g:172:7: 'float'
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
			// myC_new.g:173:4: ( 'int' )
			// myC_new.g:173:5: 'int'
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
			// myC_new.g:174:5: ( 'main' )
			// myC_new.g:174:7: 'main'
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
			// myC_new.g:175:5: ( 'void' )
			// myC_new.g:175:7: 'void'
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
			// myC_new.g:176:3: ( 'if' )
			// myC_new.g:176:5: 'if'
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
			// myC_new.g:177:5: ( 'else' )
			// myC_new.g:177:7: 'else'
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
			// myC_new.g:178:6: ( 'while' )
			// myC_new.g:178:8: 'while'
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
			// myC_new.g:179:4: ( 'for' )
			// myC_new.g:179:6: 'for'
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
			// myC_new.g:180:7: ( 'switch' )
			// myC_new.g:180:9: 'switch'
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
			// myC_new.g:181:5: ( 'case' )
			// myC_new.g:181:7: 'case'
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
			// myC_new.g:182:8: ( 'default' )
			// myC_new.g:182:10: 'default'
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
			// myC_new.g:183:6: ( 'break' )
			// myC_new.g:183:8: 'break'
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
			// myC_new.g:184:10: ( 'continue' )
			// myC_new.g:184:12: 'continue'
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

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myC_new.g:191:3: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
			// myC_new.g:191:4: ( ' ' | '\\t' | '\\r' | '\\n' )
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
			// myC_new.g:192:11: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
			// myC_new.g:192:12: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// myC_new.g:192:36: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')||(LA2_0 >= 'A' && LA2_0 <= 'Z')||LA2_0=='_'||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// myC_new.g:
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
			// myC_new.g:193:17: ( ( '0' .. '9' )+ )
			// myC_new.g:193:18: ( '0' .. '9' )+
			{
			// myC_new.g:193:18: ( '0' .. '9' )+
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
					// myC_new.g:
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
			// myC_new.g:194:24: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )+ )
			// myC_new.g:194:25: ( '0' .. '9' )+ '.' ( '0' .. '9' )+
			{
			// myC_new.g:194:25: ( '0' .. '9' )+
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
					// myC_new.g:
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
			// myC_new.g:194:39: ( '0' .. '9' )+
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
					// myC_new.g:
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
			// myC_new.g:197:8: ( '/*' ( . )* '*/' )
			// myC_new.g:197:9: '/*' ( . )* '*/'
			{
			match("/*"); 

			// myC_new.g:197:14: ( . )*
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
					// myC_new.g:197:14: .
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
			// myC_new.g:203:13: ( '#include <' ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* '.h>' )
			// myC_new.g:203:15: '#include <' ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* '.h>'
			{
			match("#include <"); 

			// myC_new.g:203:27: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( ((LA7_0 >= '0' && LA7_0 <= '9')||(LA7_0 >= 'A' && LA7_0 <= 'Z')||LA7_0=='_'||(LA7_0 >= 'a' && LA7_0 <= 'z')) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// myC_new.g:
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
		// myC_new.g:1:8: ( T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | STRING_TYPE | CHAR | PRINTF | SCANF | RETURN_TYPE | DOUBLE | FLOAT | INT | MAIN | VOID | IF | ELSE | WHILE | FOR | SWITCH | CASE | DEFAULT | BREAK | CONTINUE | WS | Identifier | Integer_constant | Floating_point_constant | COMMENT | INCLUDE_TYPE )
		int alt8=52;
		alt8 = dfa8.predict(input);
		switch (alt8) {
			case 1 :
				// myC_new.g:1:10: T__29
				{
				mT__29(); 

				}
				break;
			case 2 :
				// myC_new.g:1:16: T__30
				{
				mT__30(); 

				}
				break;
			case 3 :
				// myC_new.g:1:22: T__31
				{
				mT__31(); 

				}
				break;
			case 4 :
				// myC_new.g:1:28: T__32
				{
				mT__32(); 

				}
				break;
			case 5 :
				// myC_new.g:1:34: T__33
				{
				mT__33(); 

				}
				break;
			case 6 :
				// myC_new.g:1:40: T__34
				{
				mT__34(); 

				}
				break;
			case 7 :
				// myC_new.g:1:46: T__35
				{
				mT__35(); 

				}
				break;
			case 8 :
				// myC_new.g:1:52: T__36
				{
				mT__36(); 

				}
				break;
			case 9 :
				// myC_new.g:1:58: T__37
				{
				mT__37(); 

				}
				break;
			case 10 :
				// myC_new.g:1:64: T__38
				{
				mT__38(); 

				}
				break;
			case 11 :
				// myC_new.g:1:70: T__39
				{
				mT__39(); 

				}
				break;
			case 12 :
				// myC_new.g:1:76: T__40
				{
				mT__40(); 

				}
				break;
			case 13 :
				// myC_new.g:1:82: T__41
				{
				mT__41(); 

				}
				break;
			case 14 :
				// myC_new.g:1:88: T__42
				{
				mT__42(); 

				}
				break;
			case 15 :
				// myC_new.g:1:94: T__43
				{
				mT__43(); 

				}
				break;
			case 16 :
				// myC_new.g:1:100: T__44
				{
				mT__44(); 

				}
				break;
			case 17 :
				// myC_new.g:1:106: T__45
				{
				mT__45(); 

				}
				break;
			case 18 :
				// myC_new.g:1:112: T__46
				{
				mT__46(); 

				}
				break;
			case 19 :
				// myC_new.g:1:118: T__47
				{
				mT__47(); 

				}
				break;
			case 20 :
				// myC_new.g:1:124: T__48
				{
				mT__48(); 

				}
				break;
			case 21 :
				// myC_new.g:1:130: T__49
				{
				mT__49(); 

				}
				break;
			case 22 :
				// myC_new.g:1:136: T__50
				{
				mT__50(); 

				}
				break;
			case 23 :
				// myC_new.g:1:142: T__51
				{
				mT__51(); 

				}
				break;
			case 24 :
				// myC_new.g:1:148: T__52
				{
				mT__52(); 

				}
				break;
			case 25 :
				// myC_new.g:1:154: T__53
				{
				mT__53(); 

				}
				break;
			case 26 :
				// myC_new.g:1:160: T__54
				{
				mT__54(); 

				}
				break;
			case 27 :
				// myC_new.g:1:166: T__55
				{
				mT__55(); 

				}
				break;
			case 28 :
				// myC_new.g:1:172: STRING_TYPE
				{
				mSTRING_TYPE(); 

				}
				break;
			case 29 :
				// myC_new.g:1:184: CHAR
				{
				mCHAR(); 

				}
				break;
			case 30 :
				// myC_new.g:1:189: PRINTF
				{
				mPRINTF(); 

				}
				break;
			case 31 :
				// myC_new.g:1:196: SCANF
				{
				mSCANF(); 

				}
				break;
			case 32 :
				// myC_new.g:1:202: RETURN_TYPE
				{
				mRETURN_TYPE(); 

				}
				break;
			case 33 :
				// myC_new.g:1:214: DOUBLE
				{
				mDOUBLE(); 

				}
				break;
			case 34 :
				// myC_new.g:1:221: FLOAT
				{
				mFLOAT(); 

				}
				break;
			case 35 :
				// myC_new.g:1:227: INT
				{
				mINT(); 

				}
				break;
			case 36 :
				// myC_new.g:1:231: MAIN
				{
				mMAIN(); 

				}
				break;
			case 37 :
				// myC_new.g:1:236: VOID
				{
				mVOID(); 

				}
				break;
			case 38 :
				// myC_new.g:1:241: IF
				{
				mIF(); 

				}
				break;
			case 39 :
				// myC_new.g:1:244: ELSE
				{
				mELSE(); 

				}
				break;
			case 40 :
				// myC_new.g:1:249: WHILE
				{
				mWHILE(); 

				}
				break;
			case 41 :
				// myC_new.g:1:255: FOR
				{
				mFOR(); 

				}
				break;
			case 42 :
				// myC_new.g:1:259: SWITCH
				{
				mSWITCH(); 

				}
				break;
			case 43 :
				// myC_new.g:1:266: CASE
				{
				mCASE(); 

				}
				break;
			case 44 :
				// myC_new.g:1:271: DEFAULT
				{
				mDEFAULT(); 

				}
				break;
			case 45 :
				// myC_new.g:1:279: BREAK
				{
				mBREAK(); 

				}
				break;
			case 46 :
				// myC_new.g:1:285: CONTINUE
				{
				mCONTINUE(); 

				}
				break;
			case 47 :
				// myC_new.g:1:294: WS
				{
				mWS(); 

				}
				break;
			case 48 :
				// myC_new.g:1:297: Identifier
				{
				mIdentifier(); 

				}
				break;
			case 49 :
				// myC_new.g:1:308: Integer_constant
				{
				mInteger_constant(); 

				}
				break;
			case 50 :
				// myC_new.g:1:325: Floating_point_constant
				{
				mFloating_point_constant(); 

				}
				break;
			case 51 :
				// myC_new.g:1:349: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 52 :
				// myC_new.g:1:357: INCLUDE_TYPE
				{
				mINCLUDE_TYPE(); 

				}
				break;

		}
	}


	protected DFA8 dfa8 = new DFA8(this);
	static final String DFA8_eotS =
		"\2\uffff\1\44\3\uffff\1\46\1\51\1\uffff\1\54\1\57\2\uffff\1\61\1\63\1"+
		"\65\3\uffff\14\40\2\uffff\1\110\24\uffff\14\40\1\126\5\40\2\uffff\12\40"+
		"\1\146\1\147\1\uffff\5\40\1\155\1\156\10\40\2\uffff\1\167\1\170\1\171"+
		"\2\40\2\uffff\2\40\1\176\4\40\1\u0083\3\uffff\1\u0084\1\u0085\1\40\1\u0087"+
		"\1\uffff\1\u0088\1\u0089\1\u008a\1\40\3\uffff\1\40\4\uffff\1\u008d\1\u008e"+
		"\2\uffff";
	static final String DFA8_eofS =
		"\u008f\uffff";
	static final String DFA8_minS =
		"\1\11\1\uffff\1\75\3\uffff\1\75\1\53\1\uffff\1\55\1\52\2\uffff\3\75\3"+
		"\uffff\1\141\1\162\1\143\2\145\1\154\1\146\1\141\1\157\1\154\1\150\1\162"+
		"\2\uffff\1\56\24\uffff\1\141\1\163\1\156\1\151\1\141\1\151\1\164\1\165"+
		"\1\146\1\157\1\162\1\164\1\60\2\151\1\163\1\151\1\145\2\uffff\1\162\1"+
		"\145\1\164\2\156\1\164\1\165\1\142\2\141\2\60\1\uffff\1\156\1\144\1\145"+
		"\1\154\1\141\2\60\1\151\1\164\1\146\1\143\1\162\1\154\1\165\1\164\2\uffff"+
		"\3\60\1\145\1\153\2\uffff\1\156\1\146\1\60\1\150\1\156\1\145\1\154\1\60"+
		"\3\uffff\2\60\1\165\1\60\1\uffff\3\60\1\164\3\uffff\1\145\4\uffff\2\60"+
		"\2\uffff";
	static final String DFA8_maxS =
		"\1\175\1\uffff\1\75\3\uffff\2\75\1\uffff\2\75\2\uffff\3\75\3\uffff\1\157"+
		"\1\162\1\167\1\145\2\157\1\156\1\141\1\157\1\154\1\150\1\162\2\uffff\1"+
		"\71\24\uffff\1\141\1\163\1\156\1\151\1\141\1\151\1\164\1\165\1\146\1\157"+
		"\1\162\1\164\1\172\2\151\1\163\1\151\1\145\2\uffff\1\162\1\145\1\164\2"+
		"\156\1\164\1\165\1\142\2\141\2\172\1\uffff\1\156\1\144\1\145\1\154\1\141"+
		"\2\172\1\151\1\164\1\146\1\143\1\162\1\154\1\165\1\164\2\uffff\3\172\1"+
		"\145\1\153\2\uffff\1\156\1\146\1\172\1\150\1\156\1\145\1\154\1\172\3\uffff"+
		"\2\172\1\165\1\172\1\uffff\3\172\1\164\3\uffff\1\145\4\uffff\2\172\2\uffff";
	static final String DFA8_acceptS =
		"\1\uffff\1\1\1\uffff\1\4\1\5\1\6\2\uffff\1\14\2\uffff\1\22\1\23\3\uffff"+
		"\1\32\1\33\1\34\14\uffff\1\57\1\60\1\uffff\1\64\1\3\1\2\1\10\1\7\1\12"+
		"\1\13\1\11\1\16\1\17\1\15\1\21\1\63\1\20\1\25\1\24\1\27\1\26\1\31\1\30"+
		"\22\uffff\1\61\1\62\14\uffff\1\46\17\uffff\1\51\1\43\5\uffff\1\35\1\53"+
		"\10\uffff\1\44\1\45\1\47\4\uffff\1\37\4\uffff\1\42\1\50\1\55\1\uffff\1"+
		"\36\1\52\1\40\1\41\2\uffff\1\54\1\56";
	static final String DFA8_specialS =
		"\u008f\uffff}>";
	static final String[] DFA8_transitionS = {
			"\2\37\2\uffff\1\37\22\uffff\1\37\1\1\1\22\1\42\1\uffff\1\2\1\3\1\uffff"+
			"\1\4\1\5\1\6\1\7\1\10\1\11\1\uffff\1\12\12\41\1\13\1\14\1\15\1\16\1\17"+
			"\2\uffff\32\40\4\uffff\1\40\1\uffff\1\40\1\36\1\23\1\27\1\34\1\30\2\40"+
			"\1\31\3\40\1\32\2\40\1\24\1\40\1\26\1\25\2\40\1\33\1\35\3\40\1\20\1\uffff"+
			"\1\21",
			"",
			"\1\43",
			"",
			"",
			"",
			"\1\45",
			"\1\47\21\uffff\1\50",
			"",
			"\1\52\17\uffff\1\53",
			"\1\56\22\uffff\1\55",
			"",
			"",
			"\1\60",
			"\1\62",
			"\1\64",
			"",
			"",
			"",
			"\1\67\6\uffff\1\66\6\uffff\1\70",
			"\1\71",
			"\1\72\23\uffff\1\73",
			"\1\74",
			"\1\76\11\uffff\1\75",
			"\1\77\2\uffff\1\100",
			"\1\102\7\uffff\1\101",
			"\1\103",
			"\1\104",
			"\1\105",
			"\1\106",
			"\1\107",
			"",
			"",
			"\1\111\1\uffff\12\41",
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
			"",
			"",
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
			"\1\124",
			"\1\125",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\1\127",
			"\1\130",
			"\1\131",
			"\1\132",
			"\1\133",
			"",
			"",
			"\1\134",
			"\1\135",
			"\1\136",
			"\1\137",
			"\1\140",
			"\1\141",
			"\1\142",
			"\1\143",
			"\1\144",
			"\1\145",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"",
			"\1\150",
			"\1\151",
			"\1\152",
			"\1\153",
			"\1\154",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
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
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\1\172",
			"\1\173",
			"",
			"",
			"\1\174",
			"\1\175",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\1\177",
			"\1\u0080",
			"\1\u0081",
			"\1\u0082",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"",
			"",
			"",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\1\u0086",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\1\u008b",
			"",
			"",
			"",
			"\1\u008c",
			"",
			"",
			"",
			"",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
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
			return "1:1: Tokens : ( T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | STRING_TYPE | CHAR | PRINTF | SCANF | RETURN_TYPE | DOUBLE | FLOAT | INT | MAIN | VOID | IF | ELSE | WHILE | FOR | SWITCH | CASE | DEFAULT | BREAK | CONTINUE | WS | Identifier | Integer_constant | Floating_point_constant | COMMENT | INCLUDE_TYPE );";
		}
	}

}
