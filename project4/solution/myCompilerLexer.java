// $ANTLR 3.5.2 myCompiler.g 2020-06-26 10:37:07

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class myCompilerLexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public myCompilerLexer() {} 
	public myCompilerLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public myCompilerLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "myCompiler.g"; }

	// $ANTLR start "T__22"
	public final void mT__22() throws RecognitionException {
		try {
			int _type = T__22;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:7:7: ( '!=' )
			// myCompiler.g:7:9: '!='
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
	// $ANTLR end "T__22"

	// $ANTLR start "T__23"
	public final void mT__23() throws RecognitionException {
		try {
			int _type = T__23;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:8:7: ( '(' )
			// myCompiler.g:8:9: '('
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
	// $ANTLR end "T__23"

	// $ANTLR start "T__24"
	public final void mT__24() throws RecognitionException {
		try {
			int _type = T__24;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:9:7: ( ')' )
			// myCompiler.g:9:9: ')'
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
	// $ANTLR end "T__24"

	// $ANTLR start "T__25"
	public final void mT__25() throws RecognitionException {
		try {
			int _type = T__25;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:10:7: ( '*' )
			// myCompiler.g:10:9: '*'
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
	// $ANTLR end "T__25"

	// $ANTLR start "T__26"
	public final void mT__26() throws RecognitionException {
		try {
			int _type = T__26;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:11:7: ( '+' )
			// myCompiler.g:11:9: '+'
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
	// $ANTLR end "T__26"

	// $ANTLR start "T__27"
	public final void mT__27() throws RecognitionException {
		try {
			int _type = T__27;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:12:7: ( ',' )
			// myCompiler.g:12:9: ','
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
	// $ANTLR end "T__27"

	// $ANTLR start "T__28"
	public final void mT__28() throws RecognitionException {
		try {
			int _type = T__28;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:13:7: ( '-' )
			// myCompiler.g:13:9: '-'
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
	// $ANTLR end "T__28"

	// $ANTLR start "T__29"
	public final void mT__29() throws RecognitionException {
		try {
			int _type = T__29;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:14:7: ( '/' )
			// myCompiler.g:14:9: '/'
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
	// $ANTLR end "T__29"

	// $ANTLR start "T__30"
	public final void mT__30() throws RecognitionException {
		try {
			int _type = T__30;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:15:7: ( ';' )
			// myCompiler.g:15:9: ';'
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
	// $ANTLR end "T__30"

	// $ANTLR start "T__31"
	public final void mT__31() throws RecognitionException {
		try {
			int _type = T__31;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:16:7: ( '<' )
			// myCompiler.g:16:9: '<'
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
	// $ANTLR end "T__31"

	// $ANTLR start "T__32"
	public final void mT__32() throws RecognitionException {
		try {
			int _type = T__32;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:17:7: ( '<=' )
			// myCompiler.g:17:9: '<='
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
	// $ANTLR end "T__32"

	// $ANTLR start "T__33"
	public final void mT__33() throws RecognitionException {
		try {
			int _type = T__33;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:18:7: ( '=' )
			// myCompiler.g:18:9: '='
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
	// $ANTLR end "T__33"

	// $ANTLR start "T__34"
	public final void mT__34() throws RecognitionException {
		try {
			int _type = T__34;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:19:7: ( '==' )
			// myCompiler.g:19:9: '=='
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
	// $ANTLR end "T__34"

	// $ANTLR start "T__35"
	public final void mT__35() throws RecognitionException {
		try {
			int _type = T__35;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:20:7: ( '>' )
			// myCompiler.g:20:9: '>'
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
	// $ANTLR end "T__35"

	// $ANTLR start "T__36"
	public final void mT__36() throws RecognitionException {
		try {
			int _type = T__36;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:21:7: ( '>=' )
			// myCompiler.g:21:9: '>='
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
	// $ANTLR end "T__36"

	// $ANTLR start "T__37"
	public final void mT__37() throws RecognitionException {
		try {
			int _type = T__37;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:22:7: ( '{' )
			// myCompiler.g:22:9: '{'
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
	// $ANTLR end "T__37"

	// $ANTLR start "T__38"
	public final void mT__38() throws RecognitionException {
		try {
			int _type = T__38;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:23:7: ( '}' )
			// myCompiler.g:23:9: '}'
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
	// $ANTLR end "T__38"

	// $ANTLR start "FLOAT"
	public final void mFLOAT() throws RecognitionException {
		try {
			int _type = FLOAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:467:6: ( 'float' )
			// myCompiler.g:467:7: 'float'
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
			// myCompiler.g:468:4: ( 'int' )
			// myCompiler.g:468:5: 'int'
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

	// $ANTLR start "CHAR"
	public final void mCHAR() throws RecognitionException {
		try {
			int _type = CHAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:469:5: ( 'char' )
			// myCompiler.g:469:7: 'char'
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
			// myCompiler.g:470:7: ( 'printf' )
			// myCompiler.g:470:9: 'printf'
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

	// $ANTLR start "PRINTF_INT"
	public final void mPRINTF_INT() throws RecognitionException {
		try {
			int _type = PRINTF_INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:471:11: ( '%d' )
			// myCompiler.g:471:13: '%d'
			{
			match("%d"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PRINTF_INT"

	// $ANTLR start "PRINTF_FLOAT"
	public final void mPRINTF_FLOAT() throws RecognitionException {
		try {
			int _type = PRINTF_FLOAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:472:13: ( '%f' )
			// myCompiler.g:472:15: '%f'
			{
			match("%f"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PRINTF_FLOAT"

	// $ANTLR start "MAIN"
	public final void mMAIN() throws RecognitionException {
		try {
			int _type = MAIN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:474:5: ( 'main' )
			// myCompiler.g:474:7: 'main'
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
			// myCompiler.g:475:5: ( 'void' )
			// myCompiler.g:475:7: 'void'
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
			// myCompiler.g:476:3: ( 'if' )
			// myCompiler.g:476:5: 'if'
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
			// myCompiler.g:477:5: ( 'else' )
			// myCompiler.g:477:7: 'else'
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

	// $ANTLR start "FOR"
	public final void mFOR() throws RecognitionException {
		try {
			int _type = FOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:478:4: ( 'for' )
			// myCompiler.g:478:6: 'for'
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

	// $ANTLR start "Identifier"
	public final void mIdentifier() throws RecognitionException {
		try {
			int _type = Identifier;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:482:11: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
			// myCompiler.g:482:12: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// myCompiler.g:482:36: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// myCompiler.g:
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
					break loop1;
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
			// myCompiler.g:483:17: ( ( '0' .. '9' )+ )
			// myCompiler.g:483:18: ( '0' .. '9' )+
			{
			// myCompiler.g:483:18: ( '0' .. '9' )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// myCompiler.g:
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
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
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
			// myCompiler.g:484:24: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )+ )
			// myCompiler.g:484:25: ( '0' .. '9' )+ '.' ( '0' .. '9' )+
			{
			// myCompiler.g:484:25: ( '0' .. '9' )+
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
					// myCompiler.g:
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

			match('.'); 
			// myCompiler.g:484:39: ( '0' .. '9' )+
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
					// myCompiler.g:
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

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Floating_point_constant"

	// $ANTLR start "STRING_LITERAL"
	public final void mSTRING_LITERAL() throws RecognitionException {
		try {
			int _type = STRING_LITERAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:487:5: ( '\"' ( EscapeSequence |~ ( '\\\\' | '\"' ) )* '\"' )
			// myCompiler.g:487:8: '\"' ( EscapeSequence |~ ( '\\\\' | '\"' ) )* '\"'
			{
			match('\"'); 
			// myCompiler.g:487:12: ( EscapeSequence |~ ( '\\\\' | '\"' ) )*
			loop5:
			while (true) {
				int alt5=3;
				int LA5_0 = input.LA(1);
				if ( (LA5_0=='\\') ) {
					alt5=1;
				}
				else if ( ((LA5_0 >= '\u0000' && LA5_0 <= '!')||(LA5_0 >= '#' && LA5_0 <= '[')||(LA5_0 >= ']' && LA5_0 <= '\uFFFF')) ) {
					alt5=2;
				}

				switch (alt5) {
				case 1 :
					// myCompiler.g:487:14: EscapeSequence
					{
					mEscapeSequence(); 

					}
					break;
				case 2 :
					// myCompiler.g:487:31: ~ ( '\\\\' | '\"' )
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
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
					break loop5;
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
	// $ANTLR end "STRING_LITERAL"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:490:3: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
			// myCompiler.g:490:4: ( ' ' | '\\t' | '\\r' | '\\n' )
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

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:491:8: ( '/*' ( . )* '*/' )
			// myCompiler.g:491:9: '/*' ( . )* '*/'
			{
			match("/*"); 

			// myCompiler.g:491:14: ( . )*
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
					// myCompiler.g:491:14: .
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

	// $ANTLR start "EscapeSequence"
	public final void mEscapeSequence() throws RecognitionException {
		try {
			// myCompiler.g:497:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) )
			// myCompiler.g:497:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
			{
			match('\\'); 
			if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EscapeSequence"

	@Override
	public void mTokens() throws RecognitionException {
		// myCompiler.g:1:8: ( T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | FLOAT | INT | CHAR | PRINTF | PRINTF_INT | PRINTF_FLOAT | MAIN | VOID | IF | ELSE | FOR | Identifier | Integer_constant | Floating_point_constant | STRING_LITERAL | WS | COMMENT )
		int alt7=34;
		alt7 = dfa7.predict(input);
		switch (alt7) {
			case 1 :
				// myCompiler.g:1:10: T__22
				{
				mT__22(); 

				}
				break;
			case 2 :
				// myCompiler.g:1:16: T__23
				{
				mT__23(); 

				}
				break;
			case 3 :
				// myCompiler.g:1:22: T__24
				{
				mT__24(); 

				}
				break;
			case 4 :
				// myCompiler.g:1:28: T__25
				{
				mT__25(); 

				}
				break;
			case 5 :
				// myCompiler.g:1:34: T__26
				{
				mT__26(); 

				}
				break;
			case 6 :
				// myCompiler.g:1:40: T__27
				{
				mT__27(); 

				}
				break;
			case 7 :
				// myCompiler.g:1:46: T__28
				{
				mT__28(); 

				}
				break;
			case 8 :
				// myCompiler.g:1:52: T__29
				{
				mT__29(); 

				}
				break;
			case 9 :
				// myCompiler.g:1:58: T__30
				{
				mT__30(); 

				}
				break;
			case 10 :
				// myCompiler.g:1:64: T__31
				{
				mT__31(); 

				}
				break;
			case 11 :
				// myCompiler.g:1:70: T__32
				{
				mT__32(); 

				}
				break;
			case 12 :
				// myCompiler.g:1:76: T__33
				{
				mT__33(); 

				}
				break;
			case 13 :
				// myCompiler.g:1:82: T__34
				{
				mT__34(); 

				}
				break;
			case 14 :
				// myCompiler.g:1:88: T__35
				{
				mT__35(); 

				}
				break;
			case 15 :
				// myCompiler.g:1:94: T__36
				{
				mT__36(); 

				}
				break;
			case 16 :
				// myCompiler.g:1:100: T__37
				{
				mT__37(); 

				}
				break;
			case 17 :
				// myCompiler.g:1:106: T__38
				{
				mT__38(); 

				}
				break;
			case 18 :
				// myCompiler.g:1:112: FLOAT
				{
				mFLOAT(); 

				}
				break;
			case 19 :
				// myCompiler.g:1:118: INT
				{
				mINT(); 

				}
				break;
			case 20 :
				// myCompiler.g:1:122: CHAR
				{
				mCHAR(); 

				}
				break;
			case 21 :
				// myCompiler.g:1:127: PRINTF
				{
				mPRINTF(); 

				}
				break;
			case 22 :
				// myCompiler.g:1:134: PRINTF_INT
				{
				mPRINTF_INT(); 

				}
				break;
			case 23 :
				// myCompiler.g:1:145: PRINTF_FLOAT
				{
				mPRINTF_FLOAT(); 

				}
				break;
			case 24 :
				// myCompiler.g:1:158: MAIN
				{
				mMAIN(); 

				}
				break;
			case 25 :
				// myCompiler.g:1:163: VOID
				{
				mVOID(); 

				}
				break;
			case 26 :
				// myCompiler.g:1:168: IF
				{
				mIF(); 

				}
				break;
			case 27 :
				// myCompiler.g:1:171: ELSE
				{
				mELSE(); 

				}
				break;
			case 28 :
				// myCompiler.g:1:176: FOR
				{
				mFOR(); 

				}
				break;
			case 29 :
				// myCompiler.g:1:180: Identifier
				{
				mIdentifier(); 

				}
				break;
			case 30 :
				// myCompiler.g:1:191: Integer_constant
				{
				mInteger_constant(); 

				}
				break;
			case 31 :
				// myCompiler.g:1:208: Floating_point_constant
				{
				mFloating_point_constant(); 

				}
				break;
			case 32 :
				// myCompiler.g:1:232: STRING_LITERAL
				{
				mSTRING_LITERAL(); 

				}
				break;
			case 33 :
				// myCompiler.g:1:247: WS
				{
				mWS(); 

				}
				break;
			case 34 :
				// myCompiler.g:1:250: COMMENT
				{
				mCOMMENT(); 

				}
				break;

		}
	}


	protected DFA7 dfa7 = new DFA7(this);
	static final String DFA7_eotS =
		"\10\uffff\1\34\1\uffff\1\36\1\40\1\42\2\uffff\4\27\1\uffff\3\27\1\uffff"+
		"\1\56\12\uffff\3\27\1\63\2\27\2\uffff\3\27\2\uffff\1\27\1\72\1\73\1\uffff"+
		"\6\27\2\uffff\1\102\1\27\1\104\1\105\1\106\1\107\1\uffff\1\27\4\uffff"+
		"\1\111\1\uffff";
	static final String DFA7_eofS =
		"\112\uffff";
	static final String DFA7_minS =
		"\1\11\7\uffff\1\52\1\uffff\3\75\2\uffff\1\154\1\146\1\150\1\162\1\144"+
		"\1\141\1\157\1\154\1\uffff\1\56\12\uffff\1\157\1\162\1\164\1\60\1\141"+
		"\1\151\2\uffff\2\151\1\163\2\uffff\1\141\2\60\1\uffff\1\162\2\156\1\144"+
		"\1\145\1\164\2\uffff\1\60\1\164\4\60\1\uffff\1\146\4\uffff\1\60\1\uffff";
	static final String DFA7_maxS =
		"\1\175\7\uffff\1\52\1\uffff\3\75\2\uffff\1\157\1\156\1\150\1\162\1\146"+
		"\1\141\1\157\1\154\1\uffff\1\71\12\uffff\1\157\1\162\1\164\1\172\1\141"+
		"\1\151\2\uffff\2\151\1\163\2\uffff\1\141\2\172\1\uffff\1\162\2\156\1\144"+
		"\1\145\1\164\2\uffff\1\172\1\164\4\172\1\uffff\1\146\4\uffff\1\172\1\uffff";
	static final String DFA7_acceptS =
		"\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\uffff\1\11\3\uffff\1\20\1\21\10"+
		"\uffff\1\35\1\uffff\1\40\1\41\1\42\1\10\1\13\1\12\1\15\1\14\1\17\1\16"+
		"\6\uffff\1\26\1\27\3\uffff\1\36\1\37\3\uffff\1\32\6\uffff\1\34\1\23\6"+
		"\uffff\1\24\1\uffff\1\30\1\31\1\33\1\22\1\uffff\1\25";
	static final String DFA7_specialS =
		"\112\uffff}>";
	static final String[] DFA7_transitionS = {
			"\2\32\2\uffff\1\32\22\uffff\1\32\1\1\1\31\2\uffff\1\23\2\uffff\1\2\1"+
			"\3\1\4\1\5\1\6\1\7\1\uffff\1\10\12\30\1\uffff\1\11\1\12\1\13\1\14\2\uffff"+
			"\32\27\4\uffff\1\27\1\uffff\2\27\1\21\1\27\1\26\1\17\2\27\1\20\3\27\1"+
			"\24\2\27\1\22\5\27\1\25\4\27\1\15\1\uffff\1\16",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\33",
			"",
			"\1\35",
			"\1\37",
			"\1\41",
			"",
			"",
			"\1\43\2\uffff\1\44",
			"\1\46\7\uffff\1\45",
			"\1\47",
			"\1\50",
			"\1\51\1\uffff\1\52",
			"\1\53",
			"\1\54",
			"\1\55",
			"",
			"\1\57\1\uffff\12\30",
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
			"\1\60",
			"\1\61",
			"\1\62",
			"\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
			"\1\64",
			"\1\65",
			"",
			"",
			"\1\66",
			"\1\67",
			"\1\70",
			"",
			"",
			"\1\71",
			"\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
			"\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
			"",
			"\1\74",
			"\1\75",
			"\1\76",
			"\1\77",
			"\1\100",
			"\1\101",
			"",
			"",
			"\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
			"\1\103",
			"\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
			"\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
			"\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
			"\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
			"",
			"\1\110",
			"",
			"",
			"",
			"",
			"\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
			""
	};

	static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
	static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
	static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
	static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
	static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
	static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
	static final short[][] DFA7_transition;

	static {
		int numStates = DFA7_transitionS.length;
		DFA7_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
		}
	}

	protected class DFA7 extends DFA {

		public DFA7(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 7;
			this.eot = DFA7_eot;
			this.eof = DFA7_eof;
			this.min = DFA7_min;
			this.max = DFA7_max;
			this.accept = DFA7_accept;
			this.special = DFA7_special;
			this.transition = DFA7_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | FLOAT | INT | CHAR | PRINTF | PRINTF_INT | PRINTF_FLOAT | MAIN | VOID | IF | ELSE | FOR | Identifier | Integer_constant | Floating_point_constant | STRING_LITERAL | WS | COMMENT );";
		}
	}

}
