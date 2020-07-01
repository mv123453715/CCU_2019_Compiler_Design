// $ANTLR 3.5.2 test1.g 2020-03-30 23:41:31

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class test1 extends Lexer {
	public static final int EOF=-1;
	public static final int ADDRESS_OP=4;
	public static final int BREAK_TYPE=5;
	public static final int CASE_TYPE=6;
	public static final int CHAR_TYPE=7;
	public static final int COMMENT1=8;
	public static final int COMMENT2=9;
	public static final int CON_TYPE=10;
	public static final int DEC_NUM=11;
	public static final int DEFAULT_TYPE=12;
	public static final int DIGIT=13;
	public static final int ELSE_TYPE=14;
	public static final int EQ_OP=15;
	public static final int FLOAT_NUM=16;
	public static final int FLOAT_NUM1=17;
	public static final int FLOAT_NUM2=18;
	public static final int FLOAT_NUM3=19;
	public static final int FLOAT_TYPE=20;
	public static final int FOR_TYPE=21;
	public static final int GE_OP=22;
	public static final int ID=23;
	public static final int IF_TYPE=24;
	public static final int INCLUDE_TYPE=25;
	public static final int INT_TYPE=26;
	public static final int LETTER=27;
	public static final int LE_OP=28;
	public static final int LSHIFT_OP=29;
	public static final int Less_than_OP=30;
	public static final int MAIN_TYPE=31;
	public static final int MM_OP=32;
	public static final int More_than_OP=33;
	public static final int NEW_LINE=34;
	public static final int NE_OP=35;
	public static final int POINTER_OP=36;
	public static final int PP_OP=37;
	public static final int PRINTF_TYPE=38;
	public static final int RETURN_TYPE=39;
	public static final int RSHIFT_OP=40;
	public static final int SCANF_TYPE=41;
	public static final int STRING_TYPE=42;
	public static final int SWTICH_TYPE=43;
	public static final int T_ADD=44;
	public static final int T_ASSIGNMENT=45;
	public static final int T_COMMA=46;
	public static final int T_DIV=47;
	public static final int T_Left_brace=48;
	public static final int T_Left_parenthesis=49;
	public static final int T_MUL=50;
	public static final int T_Righ_brace=51;
	public static final int T_Right_parenthesis=52;
	public static final int T_SEMICOLON=53;
	public static final int T_SUB=54;
	public static final int VOID_TYPE=55;
	public static final int WHILE_TYPE=56;
	public static final int WS=57;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public test1() {} 
	public test1(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public test1(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "test1.g"; }

	// $ANTLR start "INT_TYPE"
	public final void mINT_TYPE() throws RecognitionException {
		try {
			int _type = INT_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// test1.g:10:11: ( 'int' )
			// test1.g:10:13: 'int'
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
	// $ANTLR end "INT_TYPE"

	// $ANTLR start "CHAR_TYPE"
	public final void mCHAR_TYPE() throws RecognitionException {
		try {
			int _type = CHAR_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// test1.g:11:11: ( 'char' )
			// test1.g:11:13: 'char'
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
	// $ANTLR end "CHAR_TYPE"

	// $ANTLR start "VOID_TYPE"
	public final void mVOID_TYPE() throws RecognitionException {
		try {
			int _type = VOID_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// test1.g:12:11: ( 'void' )
			// test1.g:12:13: 'void'
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
	// $ANTLR end "VOID_TYPE"

	// $ANTLR start "FLOAT_TYPE"
	public final void mFLOAT_TYPE() throws RecognitionException {
		try {
			int _type = FLOAT_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// test1.g:13:11: ( 'float' )
			// test1.g:13:13: 'float'
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
	// $ANTLR end "FLOAT_TYPE"

	// $ANTLR start "INCLUDE_TYPE"
	public final void mINCLUDE_TYPE() throws RecognitionException {
		try {
			int _type = INCLUDE_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// test1.g:14:13: ( '#include <' ( LETTER | DIGIT )* '.h>' )
			// test1.g:14:15: '#include <' ( LETTER | DIGIT )* '.h>'
			{
			match("#include <"); 

			// test1.g:14:27: ( LETTER | DIGIT )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// test1.g:
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

	// $ANTLR start "PRINTF_TYPE"
	public final void mPRINTF_TYPE() throws RecognitionException {
		try {
			int _type = PRINTF_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// test1.g:15:12: ( 'printf' )
			// test1.g:15:13: 'printf'
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
	// $ANTLR end "PRINTF_TYPE"

	// $ANTLR start "SCANF_TYPE"
	public final void mSCANF_TYPE() throws RecognitionException {
		try {
			int _type = SCANF_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// test1.g:16:12: ( 'scanf' )
			// test1.g:16:13: 'scanf'
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
	// $ANTLR end "SCANF_TYPE"

	// $ANTLR start "MAIN_TYPE"
	public final void mMAIN_TYPE() throws RecognitionException {
		try {
			int _type = MAIN_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// test1.g:17:11: ( 'mian' )
			// test1.g:17:13: 'mian'
			{
			match("mian"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MAIN_TYPE"

	// $ANTLR start "RETURN_TYPE"
	public final void mRETURN_TYPE() throws RecognitionException {
		try {
			int _type = RETURN_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// test1.g:18:12: ( 'return' )
			// test1.g:18:13: 'return'
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

	// $ANTLR start "WHILE_TYPE"
	public final void mWHILE_TYPE() throws RecognitionException {
		try {
			int _type = WHILE_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// test1.g:24:12: ( 'while' )
			// test1.g:24:14: 'while'
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
	// $ANTLR end "WHILE_TYPE"

	// $ANTLR start "FOR_TYPE"
	public final void mFOR_TYPE() throws RecognitionException {
		try {
			int _type = FOR_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// test1.g:25:11: ( 'for' )
			// test1.g:25:13: 'for'
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
	// $ANTLR end "FOR_TYPE"

	// $ANTLR start "IF_TYPE"
	public final void mIF_TYPE() throws RecognitionException {
		try {
			int _type = IF_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// test1.g:26:11: ( 'if' )
			// test1.g:26:13: 'if'
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
	// $ANTLR end "IF_TYPE"

	// $ANTLR start "ELSE_TYPE"
	public final void mELSE_TYPE() throws RecognitionException {
		try {
			int _type = ELSE_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// test1.g:27:11: ( 'else' )
			// test1.g:27:13: 'else'
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
	// $ANTLR end "ELSE_TYPE"

	// $ANTLR start "BREAK_TYPE"
	public final void mBREAK_TYPE() throws RecognitionException {
		try {
			int _type = BREAK_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// test1.g:28:12: ( 'break' )
			// test1.g:28:14: 'break'
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
	// $ANTLR end "BREAK_TYPE"

	// $ANTLR start "CON_TYPE"
	public final void mCON_TYPE() throws RecognitionException {
		try {
			int _type = CON_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// test1.g:29:10: ( 'continue' )
			// test1.g:29:12: 'continue'
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
	// $ANTLR end "CON_TYPE"

	// $ANTLR start "SWTICH_TYPE"
	public final void mSWTICH_TYPE() throws RecognitionException {
		try {
			int _type = SWTICH_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// test1.g:30:13: ( 'swtich' )
			// test1.g:30:15: 'swtich'
			{
			match("swtich"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SWTICH_TYPE"

	// $ANTLR start "CASE_TYPE"
	public final void mCASE_TYPE() throws RecognitionException {
		try {
			int _type = CASE_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// test1.g:31:11: ( 'case ' ( ID | DIGIT ) ':' )
			// test1.g:31:13: 'case ' ( ID | DIGIT ) ':'
			{
			match("case "); 

			// test1.g:31:20: ( ID | DIGIT )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( ((LA2_0 >= 'A' && LA2_0 <= 'Z')||LA2_0=='_'||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
				alt2=1;
			}
			else if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
				alt2=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// test1.g:31:21: ID
					{
					mID(); 

					}
					break;
				case 2 :
					// test1.g:31:25: DIGIT
					{
					mDIGIT(); 

					}
					break;

			}

			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CASE_TYPE"

	// $ANTLR start "DEFAULT_TYPE"
	public final void mDEFAULT_TYPE() throws RecognitionException {
		try {
			int _type = DEFAULT_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// test1.g:32:14: ( 'default:' )
			// test1.g:32:16: 'default:'
			{
			match("default:"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DEFAULT_TYPE"

	// $ANTLR start "STRING_TYPE"
	public final void mSTRING_TYPE() throws RecognitionException {
		try {
			int _type = STRING_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// test1.g:38:13: ( '\"' (~ ( '\\r' | '\\n' | '\"' ) )* '\"' )
			// test1.g:38:16: '\"' (~ ( '\\r' | '\\n' | '\"' ) )* '\"'
			{
			match('\"'); 
			// test1.g:38:20: (~ ( '\\r' | '\\n' | '\"' ) )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '\u0000' && LA3_0 <= '\t')||(LA3_0 >= '\u000B' && LA3_0 <= '\f')||(LA3_0 >= '\u000E' && LA3_0 <= '!')||(LA3_0 >= '#' && LA3_0 <= '\uFFFF')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// test1.g:
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
					break loop3;
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

	// $ANTLR start "DEC_NUM"
	public final void mDEC_NUM() throws RecognitionException {
		try {
			int _type = DEC_NUM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// test1.g:39:9: ( ( '0' | ( '1' .. '9' ) ( DIGIT )* ) )
			// test1.g:39:11: ( '0' | ( '1' .. '9' ) ( DIGIT )* )
			{
			// test1.g:39:11: ( '0' | ( '1' .. '9' ) ( DIGIT )* )
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0=='0') ) {
				alt5=1;
			}
			else if ( ((LA5_0 >= '1' && LA5_0 <= '9')) ) {
				alt5=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :
					// test1.g:39:12: '0'
					{
					match('0'); 
					}
					break;
				case 2 :
					// test1.g:39:18: ( '1' .. '9' ) ( DIGIT )*
					{
					if ( (input.LA(1) >= '1' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					// test1.g:39:28: ( DIGIT )*
					loop4:
					while (true) {
						int alt4=2;
						int LA4_0 = input.LA(1);
						if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
							alt4=1;
						}

						switch (alt4) {
						case 1 :
							// test1.g:
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
							break loop4;
						}
					}

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DEC_NUM"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// test1.g:42:4: ( ( LETTER ) ( LETTER | DIGIT )* )
			// test1.g:42:6: ( LETTER ) ( LETTER | DIGIT )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// test1.g:42:14: ( LETTER | DIGIT )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( ((LA6_0 >= '0' && LA6_0 <= '9')||(LA6_0 >= 'A' && LA6_0 <= 'Z')||LA6_0=='_'||(LA6_0 >= 'a' && LA6_0 <= 'z')) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// test1.g:
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
					break loop6;
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
	// $ANTLR end "ID"

	// $ANTLR start "FLOAT_NUM"
	public final void mFLOAT_NUM() throws RecognitionException {
		try {
			int _type = FLOAT_NUM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// test1.g:44:10: ( FLOAT_NUM1 | FLOAT_NUM2 | FLOAT_NUM3 )
			int alt7=3;
			alt7 = dfa7.predict(input);
			switch (alt7) {
				case 1 :
					// test1.g:44:12: FLOAT_NUM1
					{
					mFLOAT_NUM1(); 

					}
					break;
				case 2 :
					// test1.g:44:25: FLOAT_NUM2
					{
					mFLOAT_NUM2(); 

					}
					break;
				case 3 :
					// test1.g:44:38: FLOAT_NUM3
					{
					mFLOAT_NUM3(); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT_NUM"

	// $ANTLR start "FLOAT_NUM1"
	public final void mFLOAT_NUM1() throws RecognitionException {
		try {
			// test1.g:45:20: ( ( DIGIT )+ '.' ( DIGIT )* )
			// test1.g:45:22: ( DIGIT )+ '.' ( DIGIT )*
			{
			// test1.g:45:22: ( DIGIT )+
			int cnt8=0;
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( ((LA8_0 >= '0' && LA8_0 <= '9')) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// test1.g:
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
					if ( cnt8 >= 1 ) break loop8;
					EarlyExitException eee = new EarlyExitException(8, input);
					throw eee;
				}
				cnt8++;
			}

			match('.'); 
			// test1.g:45:33: ( DIGIT )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( ((LA9_0 >= '0' && LA9_0 <= '9')) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// test1.g:
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
					break loop9;
				}
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT_NUM1"

	// $ANTLR start "FLOAT_NUM2"
	public final void mFLOAT_NUM2() throws RecognitionException {
		try {
			// test1.g:46:20: ( '.' ( DIGIT )+ )
			// test1.g:46:22: '.' ( DIGIT )+
			{
			match('.'); 
			// test1.g:46:25: ( DIGIT )+
			int cnt10=0;
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( ((LA10_0 >= '0' && LA10_0 <= '9')) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// test1.g:
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
					if ( cnt10 >= 1 ) break loop10;
					EarlyExitException eee = new EarlyExitException(10, input);
					throw eee;
				}
				cnt10++;
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT_NUM2"

	// $ANTLR start "FLOAT_NUM3"
	public final void mFLOAT_NUM3() throws RecognitionException {
		try {
			// test1.g:47:20: ( ( DIGIT )+ )
			// test1.g:47:22: ( DIGIT )+
			{
			// test1.g:47:22: ( DIGIT )+
			int cnt11=0;
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( ((LA11_0 >= '0' && LA11_0 <= '9')) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// test1.g:
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
					if ( cnt11 >= 1 ) break loop11;
					EarlyExitException eee = new EarlyExitException(11, input);
					throw eee;
				}
				cnt11++;
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT_NUM3"

	// $ANTLR start "LETTER"
	public final void mLETTER() throws RecognitionException {
		try {
			// test1.g:48:17: ( 'a' .. 'z' | 'A' .. 'Z' | '_' )
			// test1.g:
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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
	// $ANTLR end "LETTER"

	// $ANTLR start "DIGIT"
	public final void mDIGIT() throws RecognitionException {
		try {
			// test1.g:49:16: ( '0' .. '9' )
			// test1.g:
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

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIGIT"

	// $ANTLR start "COMMENT1"
	public final void mCOMMENT1() throws RecognitionException {
		try {
			int _type = COMMENT1;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// test1.g:55:10: ( '//' ( . )* '\\n' )
			// test1.g:55:12: '//' ( . )* '\\n'
			{
			match("//"); 

			// test1.g:55:16: ( . )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0=='\n') ) {
					alt12=2;
				}
				else if ( ((LA12_0 >= '\u0000' && LA12_0 <= '\t')||(LA12_0 >= '\u000B' && LA12_0 <= '\uFFFF')) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// test1.g:55:17: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop12;
				}
			}

			match('\n'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT1"

	// $ANTLR start "COMMENT2"
	public final void mCOMMENT2() throws RecognitionException {
		try {
			int _type = COMMENT2;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// test1.g:56:10: ( '/*' ( options {greedy=false; } : . )* '*/' )
			// test1.g:56:12: '/*' ( options {greedy=false; } : . )* '*/'
			{
			match("/*"); 

			// test1.g:56:17: ( options {greedy=false; } : . )*
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0=='*') ) {
					int LA13_1 = input.LA(2);
					if ( (LA13_1=='/') ) {
						alt13=2;
					}
					else if ( ((LA13_1 >= '\u0000' && LA13_1 <= '.')||(LA13_1 >= '0' && LA13_1 <= '\uFFFF')) ) {
						alt13=1;
					}

				}
				else if ( ((LA13_0 >= '\u0000' && LA13_0 <= ')')||(LA13_0 >= '+' && LA13_0 <= '\uFFFF')) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// test1.g:56:42: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop13;
				}
			}

			match("*/"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT2"

	// $ANTLR start "EQ_OP"
	public final void mEQ_OP() throws RecognitionException {
		try {
			int _type = EQ_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// test1.g:68:7: ( '==' )
			// test1.g:68:9: '=='
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
	// $ANTLR end "EQ_OP"

	// $ANTLR start "LE_OP"
	public final void mLE_OP() throws RecognitionException {
		try {
			int _type = LE_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// test1.g:69:7: ( '<=' )
			// test1.g:69:9: '<='
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
	// $ANTLR end "LE_OP"

	// $ANTLR start "GE_OP"
	public final void mGE_OP() throws RecognitionException {
		try {
			int _type = GE_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// test1.g:70:7: ( '>=' )
			// test1.g:70:9: '>='
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
	// $ANTLR end "GE_OP"

	// $ANTLR start "NE_OP"
	public final void mNE_OP() throws RecognitionException {
		try {
			int _type = NE_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// test1.g:71:7: ( '!=' )
			// test1.g:71:9: '!='
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
	// $ANTLR end "NE_OP"

	// $ANTLR start "PP_OP"
	public final void mPP_OP() throws RecognitionException {
		try {
			int _type = PP_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// test1.g:72:7: ( '++' )
			// test1.g:72:9: '++'
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
	// $ANTLR end "PP_OP"

	// $ANTLR start "MM_OP"
	public final void mMM_OP() throws RecognitionException {
		try {
			int _type = MM_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// test1.g:73:7: ( '--' )
			// test1.g:73:9: '--'
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
	// $ANTLR end "MM_OP"

	// $ANTLR start "Less_than_OP"
	public final void mLess_than_OP() throws RecognitionException {
		try {
			int _type = Less_than_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// test1.g:74:14: ( '<' )
			// test1.g:74:16: '<'
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
	// $ANTLR end "Less_than_OP"

	// $ANTLR start "More_than_OP"
	public final void mMore_than_OP() throws RecognitionException {
		try {
			int _type = More_than_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// test1.g:75:13: ( '>' )
			// test1.g:75:15: '>'
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
	// $ANTLR end "More_than_OP"

	// $ANTLR start "RSHIFT_OP"
	public final void mRSHIFT_OP() throws RecognitionException {
		try {
			int _type = RSHIFT_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// test1.g:77:11: ( '<<' )
			// test1.g:77:13: '<<'
			{
			match("<<"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RSHIFT_OP"

	// $ANTLR start "LSHIFT_OP"
	public final void mLSHIFT_OP() throws RecognitionException {
		try {
			int _type = LSHIFT_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// test1.g:78:11: ( '>>' )
			// test1.g:78:13: '>>'
			{
			match(">>"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LSHIFT_OP"

	// $ANTLR start "ADDRESS_OP"
	public final void mADDRESS_OP() throws RecognitionException {
		try {
			int _type = ADDRESS_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// test1.g:79:12: ( '&' )
			// test1.g:79:14: '&'
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
	// $ANTLR end "ADDRESS_OP"

	// $ANTLR start "POINTER_OP"
	public final void mPOINTER_OP() throws RecognitionException {
		try {
			int _type = POINTER_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// test1.g:80:12: ( '*(ID)' )
			// test1.g:80:14: '*(ID)'
			{
			match("*(ID)"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "POINTER_OP"

	// $ANTLR start "T_Left_parenthesis"
	public final void mT_Left_parenthesis() throws RecognitionException {
		try {
			int _type = T_Left_parenthesis;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// test1.g:82:20: ( '(' )
			// test1.g:82:22: '('
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
	// $ANTLR end "T_Left_parenthesis"

	// $ANTLR start "T_Right_parenthesis"
	public final void mT_Right_parenthesis() throws RecognitionException {
		try {
			int _type = T_Right_parenthesis;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// test1.g:83:21: ( ')' )
			// test1.g:83:23: ')'
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
	// $ANTLR end "T_Right_parenthesis"

	// $ANTLR start "T_Left_brace"
	public final void mT_Left_brace() throws RecognitionException {
		try {
			int _type = T_Left_brace;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// test1.g:84:14: ( '{' )
			// test1.g:84:16: '{'
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
	// $ANTLR end "T_Left_brace"

	// $ANTLR start "T_Righ_brace"
	public final void mT_Righ_brace() throws RecognitionException {
		try {
			int _type = T_Righ_brace;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// test1.g:85:14: ( '}' )
			// test1.g:85:16: '}'
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
	// $ANTLR end "T_Righ_brace"

	// $ANTLR start "T_ASSIGNMENT"
	public final void mT_ASSIGNMENT() throws RecognitionException {
		try {
			int _type = T_ASSIGNMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// test1.g:87:14: ( '=' )
			// test1.g:87:16: '='
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
	// $ANTLR end "T_ASSIGNMENT"

	// $ANTLR start "T_ADD"
	public final void mT_ADD() throws RecognitionException {
		try {
			int _type = T_ADD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// test1.g:88:7: ( '+' )
			// test1.g:88:9: '+'
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
	// $ANTLR end "T_ADD"

	// $ANTLR start "T_SUB"
	public final void mT_SUB() throws RecognitionException {
		try {
			int _type = T_SUB;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// test1.g:89:7: ( '-' )
			// test1.g:89:9: '-'
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
	// $ANTLR end "T_SUB"

	// $ANTLR start "T_MUL"
	public final void mT_MUL() throws RecognitionException {
		try {
			int _type = T_MUL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// test1.g:90:7: ( '*' )
			// test1.g:90:9: '*'
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
	// $ANTLR end "T_MUL"

	// $ANTLR start "T_DIV"
	public final void mT_DIV() throws RecognitionException {
		try {
			int _type = T_DIV;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// test1.g:91:7: ( '/' )
			// test1.g:91:9: '/'
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
	// $ANTLR end "T_DIV"

	// $ANTLR start "T_COMMA"
	public final void mT_COMMA() throws RecognitionException {
		try {
			int _type = T_COMMA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// test1.g:97:9: ( ',' )
			// test1.g:97:11: ','
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
	// $ANTLR end "T_COMMA"

	// $ANTLR start "T_SEMICOLON"
	public final void mT_SEMICOLON() throws RecognitionException {
		try {
			int _type = T_SEMICOLON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// test1.g:98:13: ( ';' )
			// test1.g:98:15: ';'
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
	// $ANTLR end "T_SEMICOLON"

	// $ANTLR start "NEW_LINE"
	public final void mNEW_LINE() throws RecognitionException {
		try {
			int _type = NEW_LINE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// test1.g:100:9: ( '\\n' )
			// test1.g:100:11: '\\n'
			{
			match('\n'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NEW_LINE"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// test1.g:101:5: ( ( ' ' | '\\r' | '\\t' | '\\n' | '\\r\\n' ) )
			// test1.g:101:7: ( ' ' | '\\r' | '\\t' | '\\n' | '\\r\\n' )
			{
			// test1.g:101:7: ( ' ' | '\\r' | '\\t' | '\\n' | '\\r\\n' )
			int alt14=5;
			switch ( input.LA(1) ) {
			case ' ':
				{
				alt14=1;
				}
				break;
			case '\r':
				{
				int LA14_2 = input.LA(2);
				if ( (LA14_2=='\n') ) {
					alt14=5;
				}

				else {
					alt14=2;
				}

				}
				break;
			case '\t':
				{
				alt14=3;
				}
				break;
			case '\n':
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
					// test1.g:101:8: ' '
					{
					match(' '); 
					}
					break;
				case 2 :
					// test1.g:101:12: '\\r'
					{
					match('\r'); 
					}
					break;
				case 3 :
					// test1.g:101:17: '\\t'
					{
					match('\t'); 
					}
					break;
				case 4 :
					// test1.g:101:22: '\\n'
					{
					match('\n'); 
					}
					break;
				case 5 :
					// test1.g:101:27: '\\r\\n'
					{
					match("\r\n"); 

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	@Override
	public void mTokens() throws RecognitionException {
		// test1.g:1:8: ( INT_TYPE | CHAR_TYPE | VOID_TYPE | FLOAT_TYPE | INCLUDE_TYPE | PRINTF_TYPE | SCANF_TYPE | MAIN_TYPE | RETURN_TYPE | WHILE_TYPE | FOR_TYPE | IF_TYPE | ELSE_TYPE | BREAK_TYPE | CON_TYPE | SWTICH_TYPE | CASE_TYPE | DEFAULT_TYPE | STRING_TYPE | DEC_NUM | ID | FLOAT_NUM | COMMENT1 | COMMENT2 | EQ_OP | LE_OP | GE_OP | NE_OP | PP_OP | MM_OP | Less_than_OP | More_than_OP | RSHIFT_OP | LSHIFT_OP | ADDRESS_OP | POINTER_OP | T_Left_parenthesis | T_Right_parenthesis | T_Left_brace | T_Righ_brace | T_ASSIGNMENT | T_ADD | T_SUB | T_MUL | T_DIV | T_COMMA | T_SEMICOLON | NEW_LINE | WS )
		int alt15=49;
		alt15 = dfa15.predict(input);
		switch (alt15) {
			case 1 :
				// test1.g:1:10: INT_TYPE
				{
				mINT_TYPE(); 

				}
				break;
			case 2 :
				// test1.g:1:19: CHAR_TYPE
				{
				mCHAR_TYPE(); 

				}
				break;
			case 3 :
				// test1.g:1:29: VOID_TYPE
				{
				mVOID_TYPE(); 

				}
				break;
			case 4 :
				// test1.g:1:39: FLOAT_TYPE
				{
				mFLOAT_TYPE(); 

				}
				break;
			case 5 :
				// test1.g:1:50: INCLUDE_TYPE
				{
				mINCLUDE_TYPE(); 

				}
				break;
			case 6 :
				// test1.g:1:63: PRINTF_TYPE
				{
				mPRINTF_TYPE(); 

				}
				break;
			case 7 :
				// test1.g:1:75: SCANF_TYPE
				{
				mSCANF_TYPE(); 

				}
				break;
			case 8 :
				// test1.g:1:86: MAIN_TYPE
				{
				mMAIN_TYPE(); 

				}
				break;
			case 9 :
				// test1.g:1:96: RETURN_TYPE
				{
				mRETURN_TYPE(); 

				}
				break;
			case 10 :
				// test1.g:1:108: WHILE_TYPE
				{
				mWHILE_TYPE(); 

				}
				break;
			case 11 :
				// test1.g:1:119: FOR_TYPE
				{
				mFOR_TYPE(); 

				}
				break;
			case 12 :
				// test1.g:1:128: IF_TYPE
				{
				mIF_TYPE(); 

				}
				break;
			case 13 :
				// test1.g:1:136: ELSE_TYPE
				{
				mELSE_TYPE(); 

				}
				break;
			case 14 :
				// test1.g:1:146: BREAK_TYPE
				{
				mBREAK_TYPE(); 

				}
				break;
			case 15 :
				// test1.g:1:157: CON_TYPE
				{
				mCON_TYPE(); 

				}
				break;
			case 16 :
				// test1.g:1:166: SWTICH_TYPE
				{
				mSWTICH_TYPE(); 

				}
				break;
			case 17 :
				// test1.g:1:178: CASE_TYPE
				{
				mCASE_TYPE(); 

				}
				break;
			case 18 :
				// test1.g:1:188: DEFAULT_TYPE
				{
				mDEFAULT_TYPE(); 

				}
				break;
			case 19 :
				// test1.g:1:201: STRING_TYPE
				{
				mSTRING_TYPE(); 

				}
				break;
			case 20 :
				// test1.g:1:213: DEC_NUM
				{
				mDEC_NUM(); 

				}
				break;
			case 21 :
				// test1.g:1:221: ID
				{
				mID(); 

				}
				break;
			case 22 :
				// test1.g:1:224: FLOAT_NUM
				{
				mFLOAT_NUM(); 

				}
				break;
			case 23 :
				// test1.g:1:234: COMMENT1
				{
				mCOMMENT1(); 

				}
				break;
			case 24 :
				// test1.g:1:243: COMMENT2
				{
				mCOMMENT2(); 

				}
				break;
			case 25 :
				// test1.g:1:252: EQ_OP
				{
				mEQ_OP(); 

				}
				break;
			case 26 :
				// test1.g:1:258: LE_OP
				{
				mLE_OP(); 

				}
				break;
			case 27 :
				// test1.g:1:264: GE_OP
				{
				mGE_OP(); 

				}
				break;
			case 28 :
				// test1.g:1:270: NE_OP
				{
				mNE_OP(); 

				}
				break;
			case 29 :
				// test1.g:1:276: PP_OP
				{
				mPP_OP(); 

				}
				break;
			case 30 :
				// test1.g:1:282: MM_OP
				{
				mMM_OP(); 

				}
				break;
			case 31 :
				// test1.g:1:288: Less_than_OP
				{
				mLess_than_OP(); 

				}
				break;
			case 32 :
				// test1.g:1:301: More_than_OP
				{
				mMore_than_OP(); 

				}
				break;
			case 33 :
				// test1.g:1:314: RSHIFT_OP
				{
				mRSHIFT_OP(); 

				}
				break;
			case 34 :
				// test1.g:1:324: LSHIFT_OP
				{
				mLSHIFT_OP(); 

				}
				break;
			case 35 :
				// test1.g:1:334: ADDRESS_OP
				{
				mADDRESS_OP(); 

				}
				break;
			case 36 :
				// test1.g:1:345: POINTER_OP
				{
				mPOINTER_OP(); 

				}
				break;
			case 37 :
				// test1.g:1:356: T_Left_parenthesis
				{
				mT_Left_parenthesis(); 

				}
				break;
			case 38 :
				// test1.g:1:375: T_Right_parenthesis
				{
				mT_Right_parenthesis(); 

				}
				break;
			case 39 :
				// test1.g:1:395: T_Left_brace
				{
				mT_Left_brace(); 

				}
				break;
			case 40 :
				// test1.g:1:408: T_Righ_brace
				{
				mT_Righ_brace(); 

				}
				break;
			case 41 :
				// test1.g:1:421: T_ASSIGNMENT
				{
				mT_ASSIGNMENT(); 

				}
				break;
			case 42 :
				// test1.g:1:434: T_ADD
				{
				mT_ADD(); 

				}
				break;
			case 43 :
				// test1.g:1:440: T_SUB
				{
				mT_SUB(); 

				}
				break;
			case 44 :
				// test1.g:1:446: T_MUL
				{
				mT_MUL(); 

				}
				break;
			case 45 :
				// test1.g:1:452: T_DIV
				{
				mT_DIV(); 

				}
				break;
			case 46 :
				// test1.g:1:458: T_COMMA
				{
				mT_COMMA(); 

				}
				break;
			case 47 :
				// test1.g:1:466: T_SEMICOLON
				{
				mT_SEMICOLON(); 

				}
				break;
			case 48 :
				// test1.g:1:478: NEW_LINE
				{
				mNEW_LINE(); 

				}
				break;
			case 49 :
				// test1.g:1:487: WS
				{
				mWS(); 

				}
				break;

		}
	}


	protected DFA7 dfa7 = new DFA7(this);
	protected DFA15 dfa15 = new DFA15(this);
	static final String DFA7_eotS =
		"\1\uffff\1\4\3\uffff";
	static final String DFA7_eofS =
		"\5\uffff";
	static final String DFA7_minS =
		"\2\56\3\uffff";
	static final String DFA7_maxS =
		"\2\71\3\uffff";
	static final String DFA7_acceptS =
		"\2\uffff\1\2\1\1\1\3";
	static final String DFA7_specialS =
		"\5\uffff}>";
	static final String[] DFA7_transitionS = {
			"\1\2\1\uffff\12\1",
			"\1\3\1\uffff\12\1",
			"",
			"",
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
			return "44:1: FLOAT_NUM : ( FLOAT_NUM1 | FLOAT_NUM2 | FLOAT_NUM3 );";
		}
	}

	static final String DFA15_eotS =
		"\1\uffff\4\21\1\uffff\10\21\1\uffff\2\65\2\uffff\1\71\1\73\1\76\1\101"+
		"\1\uffff\1\103\1\105\1\uffff\1\107\10\uffff\1\21\1\112\17\21\1\uffff\1"+
		"\65\22\uffff\1\132\1\uffff\5\21\1\140\11\21\1\uffff\1\152\2\21\1\155\1"+
		"\21\1\uffff\3\21\1\162\2\21\1\165\2\21\1\uffff\1\21\2\uffff\1\171\1\21"+
		"\1\173\1\21\1\uffff\1\21\1\176\1\uffff\1\177\2\21\1\uffff\1\u0082\1\uffff"+
		"\1\u0083\1\u0084\2\uffff\2\21\3\uffff\1\21\1\u0088\2\uffff";
	static final String DFA15_eofS =
		"\u0089\uffff";
	static final String DFA15_minS =
		"\1\11\1\146\1\141\1\157\1\154\1\uffff\1\162\1\143\1\151\1\145\1\150\1"+
		"\154\1\162\1\145\1\uffff\2\56\2\uffff\1\52\1\75\1\74\1\75\1\uffff\1\53"+
		"\1\55\1\uffff\1\50\10\uffff\1\164\1\60\1\141\1\156\1\163\1\151\1\157\1"+
		"\162\1\151\1\141\1\164\1\141\1\164\1\151\1\163\1\145\1\146\1\uffff\1\56"+
		"\22\uffff\1\60\1\uffff\1\162\1\164\1\145\1\144\1\141\1\60\2\156\1\151"+
		"\1\156\1\165\1\154\1\145\2\141\1\uffff\1\60\1\151\1\40\1\60\1\164\1\uffff"+
		"\1\164\1\146\1\143\1\60\1\162\1\145\1\60\1\153\1\165\1\uffff\1\156\2\uffff"+
		"\1\60\1\146\1\60\1\150\1\uffff\1\156\1\60\1\uffff\1\60\1\154\1\165\1\uffff"+
		"\1\60\1\uffff\2\60\2\uffff\1\164\1\145\3\uffff\1\72\1\60\2\uffff";
	static final String DFA15_maxS =
		"\1\175\1\156\3\157\1\uffff\1\162\1\167\1\151\1\145\1\150\1\154\1\162\1"+
		"\145\1\uffff\2\71\2\uffff\1\57\2\75\1\76\1\uffff\1\53\1\55\1\uffff\1\50"+
		"\10\uffff\1\164\1\172\1\141\1\156\1\163\1\151\1\157\1\162\1\151\1\141"+
		"\1\164\1\141\1\164\1\151\1\163\1\145\1\146\1\uffff\1\71\22\uffff\1\172"+
		"\1\uffff\1\162\1\164\1\145\1\144\1\141\1\172\2\156\1\151\1\156\1\165\1"+
		"\154\1\145\2\141\1\uffff\1\172\1\151\1\40\1\172\1\164\1\uffff\1\164\1"+
		"\146\1\143\1\172\1\162\1\145\1\172\1\153\1\165\1\uffff\1\156\2\uffff\1"+
		"\172\1\146\1\172\1\150\1\uffff\1\156\1\172\1\uffff\1\172\1\154\1\165\1"+
		"\uffff\1\172\1\uffff\2\172\2\uffff\1\164\1\145\3\uffff\1\72\1\172\2\uffff";
	static final String DFA15_acceptS =
		"\5\uffff\1\5\10\uffff\1\23\2\uffff\1\25\1\26\4\uffff\1\34\2\uffff\1\43"+
		"\1\uffff\1\45\1\46\1\47\1\50\1\56\1\57\1\60\1\61\21\uffff\1\24\1\uffff"+
		"\1\27\1\30\1\55\1\31\1\51\1\32\1\41\1\37\1\33\1\42\1\40\1\35\1\52\1\36"+
		"\1\53\1\44\1\54\1\60\1\uffff\1\14\17\uffff\1\1\5\uffff\1\13\11\uffff\1"+
		"\2\1\uffff\1\21\1\3\4\uffff\1\10\2\uffff\1\15\3\uffff\1\4\1\uffff\1\7"+
		"\2\uffff\1\12\1\16\2\uffff\1\6\1\20\1\11\2\uffff\1\22\1\17";
	static final String DFA15_specialS =
		"\u0089\uffff}>";
	static final String[] DFA15_transitionS = {
			"\1\43\1\42\2\uffff\1\43\22\uffff\1\43\1\27\1\16\1\5\2\uffff\1\32\1\uffff"+
			"\1\34\1\35\1\33\1\30\1\40\1\31\1\22\1\23\1\17\11\20\1\uffff\1\41\1\25"+
			"\1\24\1\26\2\uffff\32\21\4\uffff\1\21\1\uffff\1\21\1\14\1\2\1\15\1\13"+
			"\1\4\2\21\1\1\3\21\1\10\2\21\1\6\1\21\1\11\1\7\2\21\1\3\1\12\3\21\1\36"+
			"\1\uffff\1\37",
			"\1\45\7\uffff\1\44",
			"\1\50\6\uffff\1\46\6\uffff\1\47",
			"\1\51",
			"\1\52\2\uffff\1\53",
			"",
			"\1\54",
			"\1\55\23\uffff\1\56",
			"\1\57",
			"\1\60",
			"\1\61",
			"\1\62",
			"\1\63",
			"\1\64",
			"",
			"\1\22\1\uffff\12\22",
			"\1\22\1\uffff\12\66",
			"",
			"",
			"\1\70\4\uffff\1\67",
			"\1\72",
			"\1\75\1\74",
			"\1\77\1\100",
			"",
			"\1\102",
			"\1\104",
			"",
			"\1\106",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\111",
			"\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
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
			"\1\126",
			"\1\127",
			"\1\130",
			"\1\131",
			"",
			"\1\22\1\uffff\12\66",
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
			"\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
			"",
			"\1\133",
			"\1\134",
			"\1\135",
			"\1\136",
			"\1\137",
			"\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
			"\1\141",
			"\1\142",
			"\1\143",
			"\1\144",
			"\1\145",
			"\1\146",
			"\1\147",
			"\1\150",
			"\1\151",
			"",
			"\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
			"\1\153",
			"\1\154",
			"\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
			"\1\156",
			"",
			"\1\157",
			"\1\160",
			"\1\161",
			"\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
			"\1\163",
			"\1\164",
			"\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
			"\1\166",
			"\1\167",
			"",
			"\1\170",
			"",
			"",
			"\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
			"\1\172",
			"\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
			"\1\174",
			"",
			"\1\175",
			"\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
			"",
			"\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
			"\1\u0080",
			"\1\u0081",
			"",
			"\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
			"",
			"\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
			"\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
			"",
			"",
			"\1\u0085",
			"\1\u0086",
			"",
			"",
			"",
			"\1\u0087",
			"\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
			"",
			""
	};

	static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
	static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
	static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
	static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
	static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
	static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
	static final short[][] DFA15_transition;

	static {
		int numStates = DFA15_transitionS.length;
		DFA15_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
		}
	}

	protected class DFA15 extends DFA {

		public DFA15(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 15;
			this.eot = DFA15_eot;
			this.eof = DFA15_eof;
			this.min = DFA15_min;
			this.max = DFA15_max;
			this.accept = DFA15_accept;
			this.special = DFA15_special;
			this.transition = DFA15_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( INT_TYPE | CHAR_TYPE | VOID_TYPE | FLOAT_TYPE | INCLUDE_TYPE | PRINTF_TYPE | SCANF_TYPE | MAIN_TYPE | RETURN_TYPE | WHILE_TYPE | FOR_TYPE | IF_TYPE | ELSE_TYPE | BREAK_TYPE | CON_TYPE | SWTICH_TYPE | CASE_TYPE | DEFAULT_TYPE | STRING_TYPE | DEC_NUM | ID | FLOAT_NUM | COMMENT1 | COMMENT2 | EQ_OP | LE_OP | GE_OP | NE_OP | PP_OP | MM_OP | Less_than_OP | More_than_OP | RSHIFT_OP | LSHIFT_OP | ADDRESS_OP | POINTER_OP | T_Left_parenthesis | T_Right_parenthesis | T_Left_brace | T_Righ_brace | T_ASSIGNMENT | T_ADD | T_SUB | T_MUL | T_DIV | T_COMMA | T_SEMICOLON | NEW_LINE | WS );";
		}
	}

}
