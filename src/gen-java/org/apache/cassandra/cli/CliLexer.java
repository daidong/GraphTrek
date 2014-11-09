// $ANTLR 3.5.2 /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g 2014-10-08 17:02:52

package org.apache.cassandra.cli;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class CliLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__111=111;
	public static final int T__112=112;
	public static final int T__113=113;
	public static final int T__114=114;
	public static final int T__115=115;
	public static final int T__116=116;
	public static final int T__117=117;
	public static final int T__118=118;
	public static final int T__119=119;
	public static final int T__120=120;
	public static final int T__121=121;
	public static final int T__122=122;
	public static final int T__123=123;
	public static final int T__124=124;
	public static final int T__125=125;
	public static final int T__126=126;
	public static final int T__127=127;
	public static final int T__128=128;
	public static final int T__129=129;
	public static final int T__130=130;
	public static final int T__131=131;
	public static final int T__132=132;
	public static final int AND=4;
	public static final int API_VERSION=5;
	public static final int ARRAY=6;
	public static final int ASSUME=7;
	public static final int Alnum=8;
	public static final int BY=9;
	public static final int COLUMN=10;
	public static final int COMMENT=11;
	public static final int CONDITION=12;
	public static final int CONDITIONS=13;
	public static final int CONFIG=14;
	public static final int CONNECT=15;
	public static final int CONSISTENCYLEVEL=16;
	public static final int CONVERT_TO_TYPE=17;
	public static final int COUNT=18;
	public static final int CREATE=19;
	public static final int CharacterEscapeSequence=20;
	public static final int DECR=21;
	public static final int DEL=22;
	public static final int DESCRIBE=23;
	public static final int DROP=24;
	public static final int DecimalDigit=25;
	public static final int Digit=26;
	public static final int DoubleLiteral=27;
	public static final int EXIT=28;
	public static final int EscapeCharacter=29;
	public static final int EscapeSequence=30;
	public static final int FAMILY=31;
	public static final int FILE=32;
	public static final int FUNCTION_CALL=33;
	public static final int GET=34;
	public static final int HASH=35;
	public static final int HELP=36;
	public static final int HexDigit=37;
	public static final int HexEscapeSequence=38;
	public static final int INCR=39;
	public static final int INDEX=40;
	public static final int IP_ADDRESS=41;
	public static final int Identifier=42;
	public static final int IntegerNegativeLiteral=43;
	public static final int IntegerPositiveLiteral=44;
	public static final int KEYSPACE=45;
	public static final int KEYSPACES=46;
	public static final int LIMIT=47;
	public static final int LIST=48;
	public static final int Letter=49;
	public static final int NEXT=50;
	public static final int NODE_ADD_COLUMN_FAMILY=51;
	public static final int NODE_ADD_KEYSPACE=52;
	public static final int NODE_ASSUME=53;
	public static final int NODE_COLUMNS=54;
	public static final int NODE_COLUMN_ACCESS=55;
	public static final int NODE_CONNECT=56;
	public static final int NODE_CONSISTENCY_LEVEL=57;
	public static final int NODE_DEL_COLUMN_FAMILY=58;
	public static final int NODE_DEL_KEYSPACE=59;
	public static final int NODE_DESCRIBE=60;
	public static final int NODE_DESCRIBE_CLUSTER=61;
	public static final int NODE_DROP_INDEX=62;
	public static final int NODE_EXIT=63;
	public static final int NODE_HELP=64;
	public static final int NODE_ID_LIST=65;
	public static final int NODE_KEY_RANGE=66;
	public static final int NODE_LIMIT=67;
	public static final int NODE_LIST=68;
	public static final int NODE_NEW_CF_ACCESS=69;
	public static final int NODE_NEW_KEYSPACE_ACCESS=70;
	public static final int NODE_NO_OP=71;
	public static final int NODE_REVERSED=72;
	public static final int NODE_SET_TRACE_PROBABILITY=73;
	public static final int NODE_SHOW_CLUSTER_NAME=74;
	public static final int NODE_SHOW_KEYSPACES=75;
	public static final int NODE_SHOW_SCHEMA=76;
	public static final int NODE_SHOW_VERSION=77;
	public static final int NODE_THRIFT_COUNT=78;
	public static final int NODE_THRIFT_DECR=79;
	public static final int NODE_THRIFT_DEL=80;
	public static final int NODE_THRIFT_GET=81;
	public static final int NODE_THRIFT_GET_WITH_CONDITIONS=82;
	public static final int NODE_THRIFT_INCR=83;
	public static final int NODE_THRIFT_SET=84;
	public static final int NODE_TRACE_NEXT_QUERY=85;
	public static final int NODE_TRUNCATE=86;
	public static final int NODE_UPDATE_COLUMN_FAMILY=87;
	public static final int NODE_UPDATE_KEYSPACE=88;
	public static final int NODE_USE_TABLE=89;
	public static final int NonEscapeCharacter=90;
	public static final int ON=91;
	public static final int PAIR=92;
	public static final int PROBABILITY=93;
	public static final int QUERY=94;
	public static final int QUIT=95;
	public static final int SCHEMA=96;
	public static final int SEMICOLON=97;
	public static final int SET=98;
	public static final int SHOW=99;
	public static final int SingleEscapeCharacter=100;
	public static final int SingleStringCharacter=101;
	public static final int StringLiteral=102;
	public static final int TRACE=103;
	public static final int TRUNCATE=104;
	public static final int TTL=105;
	public static final int UPDATE=106;
	public static final int USE=107;
	public static final int UnicodeEscapeSequence=108;
	public static final int WITH=109;
	public static final int WS=110;

	    public void reportError(RecognitionException e) 
	    {
	        StringBuilder errorMessage = new StringBuilder("Syntax error at position ").append(e.charPositionInLine).append(": ");

	        if (e instanceof NoViableAltException)
	        {
	            int index = e.charPositionInLine;
	            String error = this.input.substring(index, index);
	            String statement = this.input.substring(0, this.input.size() - 1);

	            errorMessage.append("unexpected \"").append(error).append("\" for `").append(statement).append("`.");
	        }
	        else
	        {
	            errorMessage.append(this.getErrorMessage(e, this.getTokenNames()));
	        }

	        throw new RuntimeException(errorMessage.toString());
	    }


	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public CliLexer() {} 
	public CliLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public CliLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "/Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g"; }

	// $ANTLR start "T__111"
	public final void mT__111() throws RecognitionException {
		try {
			int _type = T__111;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:27:8: ( '(' )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:27:10: '('
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
	// $ANTLR end "T__111"

	// $ANTLR start "T__112"
	public final void mT__112() throws RecognitionException {
		try {
			int _type = T__112;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:28:8: ( ')' )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:28:10: ')'
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
	// $ANTLR end "T__112"

	// $ANTLR start "T__113"
	public final void mT__113() throws RecognitionException {
		try {
			int _type = T__113;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:29:8: ( ',' )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:29:10: ','
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
	// $ANTLR end "T__113"

	// $ANTLR start "T__114"
	public final void mT__114() throws RecognitionException {
		try {
			int _type = T__114;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:30:8: ( '.' )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:30:10: '.'
			{
			match('.'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__114"

	// $ANTLR start "T__115"
	public final void mT__115() throws RecognitionException {
		try {
			int _type = T__115;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:31:8: ( '/' )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:31:10: '/'
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
	// $ANTLR end "T__115"

	// $ANTLR start "T__116"
	public final void mT__116() throws RecognitionException {
		try {
			int _type = T__116;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:32:8: ( ':' )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:32:10: ':'
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
	// $ANTLR end "T__116"

	// $ANTLR start "T__117"
	public final void mT__117() throws RecognitionException {
		try {
			int _type = T__117;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:33:8: ( '<' )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:33:10: '<'
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
	// $ANTLR end "T__117"

	// $ANTLR start "T__118"
	public final void mT__118() throws RecognitionException {
		try {
			int _type = T__118;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:34:8: ( '<=' )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:34:10: '<='
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
	// $ANTLR end "T__118"

	// $ANTLR start "T__119"
	public final void mT__119() throws RecognitionException {
		try {
			int _type = T__119;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:35:8: ( '=' )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:35:10: '='
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
	// $ANTLR end "T__119"

	// $ANTLR start "T__120"
	public final void mT__120() throws RecognitionException {
		try {
			int _type = T__120;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:36:8: ( '>' )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:36:10: '>'
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
	// $ANTLR end "T__120"

	// $ANTLR start "T__121"
	public final void mT__121() throws RecognitionException {
		try {
			int _type = T__121;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:37:8: ( '>=' )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:37:10: '>='
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
	// $ANTLR end "T__121"

	// $ANTLR start "T__122"
	public final void mT__122() throws RecognitionException {
		try {
			int _type = T__122;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:38:8: ( '?' )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:38:10: '?'
			{
			match('?'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__122"

	// $ANTLR start "T__123"
	public final void mT__123() throws RecognitionException {
		try {
			int _type = T__123;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:39:8: ( 'AS' )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:39:10: 'AS'
			{
			match("AS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__123"

	// $ANTLR start "T__124"
	public final void mT__124() throws RecognitionException {
		try {
			int _type = T__124;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:40:8: ( 'CLUSTER NAME' )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:40:10: 'CLUSTER NAME'
			{
			match("CLUSTER NAME"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__124"

	// $ANTLR start "T__125"
	public final void mT__125() throws RecognitionException {
		try {
			int _type = T__125;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:41:8: ( 'CLUSTER' )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:41:10: 'CLUSTER'
			{
			match("CLUSTER"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__125"

	// $ANTLR start "T__126"
	public final void mT__126() throws RecognitionException {
		try {
			int _type = T__126;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:42:8: ( 'COLUMNS' )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:42:10: 'COLUMNS'
			{
			match("COLUMNS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__126"

	// $ANTLR start "T__127"
	public final void mT__127() throws RecognitionException {
		try {
			int _type = T__127;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:43:8: ( 'REVERSED' )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:43:10: 'REVERSED'
			{
			match("REVERSED"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__127"

	// $ANTLR start "T__128"
	public final void mT__128() throws RecognitionException {
		try {
			int _type = T__128;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:44:8: ( 'WHERE' )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:44:10: 'WHERE'
			{
			match("WHERE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__128"

	// $ANTLR start "T__129"
	public final void mT__129() throws RecognitionException {
		try {
			int _type = T__129;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:45:8: ( '[' )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:45:10: '['
			{
			match('['); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__129"

	// $ANTLR start "T__130"
	public final void mT__130() throws RecognitionException {
		try {
			int _type = T__130;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:46:8: ( ']' )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:46:10: ']'
			{
			match(']'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__130"

	// $ANTLR start "T__131"
	public final void mT__131() throws RecognitionException {
		try {
			int _type = T__131;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:47:8: ( '{' )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:47:10: '{'
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
	// $ANTLR end "T__131"

	// $ANTLR start "T__132"
	public final void mT__132() throws RecognitionException {
		try {
			int _type = T__132;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:48:8: ( '}' )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:48:10: '}'
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
	// $ANTLR end "T__132"

	// $ANTLR start "CONFIG"
	public final void mCONFIG() throws RecognitionException {
		try {
			int _type = CONFIG;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:580:7: ( 'CONFIG' )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:580:14: 'CONFIG'
			{
			match("CONFIG"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CONFIG"

	// $ANTLR start "CONNECT"
	public final void mCONNECT() throws RecognitionException {
		try {
			int _type = CONNECT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:581:8: ( 'CONNECT' )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:581:14: 'CONNECT'
			{
			match("CONNECT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CONNECT"

	// $ANTLR start "COUNT"
	public final void mCOUNT() throws RecognitionException {
		try {
			int _type = COUNT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:582:6: ( 'COUNT' )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:582:14: 'COUNT'
			{
			match("COUNT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COUNT"

	// $ANTLR start "DEL"
	public final void mDEL() throws RecognitionException {
		try {
			int _type = DEL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:583:4: ( 'DEL' )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:583:14: 'DEL'
			{
			match("DEL"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DEL"

	// $ANTLR start "DESCRIBE"
	public final void mDESCRIBE() throws RecognitionException {
		try {
			int _type = DESCRIBE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:584:9: ( 'DESCRIBE' )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:584:14: 'DESCRIBE'
			{
			match("DESCRIBE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DESCRIBE"

	// $ANTLR start "USE"
	public final void mUSE() throws RecognitionException {
		try {
			int _type = USE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:585:4: ( 'USE' )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:585:14: 'USE'
			{
			match("USE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "USE"

	// $ANTLR start "TRACE"
	public final void mTRACE() throws RecognitionException {
		try {
			int _type = TRACE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:586:6: ( 'TRACE' )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:586:14: 'TRACE'
			{
			match("TRACE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TRACE"

	// $ANTLR start "PROBABILITY"
	public final void mPROBABILITY() throws RecognitionException {
		try {
			int _type = PROBABILITY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:587:12: ( 'PROBABILITY' )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:587:14: 'PROBABILITY'
			{
			match("PROBABILITY"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PROBABILITY"

	// $ANTLR start "NEXT"
	public final void mNEXT() throws RecognitionException {
		try {
			int _type = NEXT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:588:5: ( 'NEXT' )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:588:14: 'NEXT'
			{
			match("NEXT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NEXT"

	// $ANTLR start "QUERY"
	public final void mQUERY() throws RecognitionException {
		try {
			int _type = QUERY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:589:6: ( 'QUERY' )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:589:14: 'QUERY'
			{
			match("QUERY"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "QUERY"

	// $ANTLR start "GET"
	public final void mGET() throws RecognitionException {
		try {
			int _type = GET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:590:4: ( 'GET' )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:590:14: 'GET'
			{
			match("GET"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GET"

	// $ANTLR start "HELP"
	public final void mHELP() throws RecognitionException {
		try {
			int _type = HELP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:591:5: ( 'HELP' )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:591:14: 'HELP'
			{
			match("HELP"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HELP"

	// $ANTLR start "EXIT"
	public final void mEXIT() throws RecognitionException {
		try {
			int _type = EXIT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:592:5: ( 'EXIT' )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:592:14: 'EXIT'
			{
			match("EXIT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EXIT"

	// $ANTLR start "FILE"
	public final void mFILE() throws RecognitionException {
		try {
			int _type = FILE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:593:5: ( 'FILE' )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:593:14: 'FILE'
			{
			match("FILE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FILE"

	// $ANTLR start "QUIT"
	public final void mQUIT() throws RecognitionException {
		try {
			int _type = QUIT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:594:5: ( 'QUIT' )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:594:14: 'QUIT'
			{
			match("QUIT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "QUIT"

	// $ANTLR start "SET"
	public final void mSET() throws RecognitionException {
		try {
			int _type = SET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:595:4: ( 'SET' )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:595:14: 'SET'
			{
			match("SET"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SET"

	// $ANTLR start "INCR"
	public final void mINCR() throws RecognitionException {
		try {
			int _type = INCR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:596:5: ( 'INCR' )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:596:14: 'INCR'
			{
			match("INCR"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INCR"

	// $ANTLR start "DECR"
	public final void mDECR() throws RecognitionException {
		try {
			int _type = DECR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:597:5: ( 'DECR' )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:597:14: 'DECR'
			{
			match("DECR"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DECR"

	// $ANTLR start "SHOW"
	public final void mSHOW() throws RecognitionException {
		try {
			int _type = SHOW;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:598:5: ( 'SHOW' )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:598:14: 'SHOW'
			{
			match("SHOW"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SHOW"

	// $ANTLR start "KEYSPACE"
	public final void mKEYSPACE() throws RecognitionException {
		try {
			int _type = KEYSPACE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:599:9: ( 'KEYSPACE' )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:599:14: 'KEYSPACE'
			{
			match("KEYSPACE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KEYSPACE"

	// $ANTLR start "KEYSPACES"
	public final void mKEYSPACES() throws RecognitionException {
		try {
			int _type = KEYSPACES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:600:10: ( 'KEYSPACES' )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:600:14: 'KEYSPACES'
			{
			match("KEYSPACES"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KEYSPACES"

	// $ANTLR start "API_VERSION"
	public final void mAPI_VERSION() throws RecognitionException {
		try {
			int _type = API_VERSION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:601:12: ( 'API VERSION' )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:601:14: 'API VERSION'
			{
			match("API VERSION"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "API_VERSION"

	// $ANTLR start "CREATE"
	public final void mCREATE() throws RecognitionException {
		try {
			int _type = CREATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:602:7: ( 'CREATE' )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:602:14: 'CREATE'
			{
			match("CREATE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CREATE"

	// $ANTLR start "DROP"
	public final void mDROP() throws RecognitionException {
		try {
			int _type = DROP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:603:5: ( 'DROP' )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:603:14: 'DROP'
			{
			match("DROP"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DROP"

	// $ANTLR start "COLUMN"
	public final void mCOLUMN() throws RecognitionException {
		try {
			int _type = COLUMN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:604:7: ( 'COLUMN' )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:604:14: 'COLUMN'
			{
			match("COLUMN"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COLUMN"

	// $ANTLR start "FAMILY"
	public final void mFAMILY() throws RecognitionException {
		try {
			int _type = FAMILY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:605:7: ( 'FAMILY' )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:605:14: 'FAMILY'
			{
			match("FAMILY"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FAMILY"

	// $ANTLR start "WITH"
	public final void mWITH() throws RecognitionException {
		try {
			int _type = WITH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:606:5: ( 'WITH' )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:606:14: 'WITH'
			{
			match("WITH"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WITH"

	// $ANTLR start "BY"
	public final void mBY() throws RecognitionException {
		try {
			int _type = BY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:607:3: ( 'BY' )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:607:14: 'BY'
			{
			match("BY"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BY"

	// $ANTLR start "AND"
	public final void mAND() throws RecognitionException {
		try {
			int _type = AND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:608:4: ( 'AND' )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:608:14: 'AND'
			{
			match("AND"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AND"

	// $ANTLR start "UPDATE"
	public final void mUPDATE() throws RecognitionException {
		try {
			int _type = UPDATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:609:7: ( 'UPDATE' )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:609:14: 'UPDATE'
			{
			match("UPDATE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UPDATE"

	// $ANTLR start "LIST"
	public final void mLIST() throws RecognitionException {
		try {
			int _type = LIST;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:610:5: ( 'LIST' )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:610:14: 'LIST'
			{
			match("LIST"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LIST"

	// $ANTLR start "LIMIT"
	public final void mLIMIT() throws RecognitionException {
		try {
			int _type = LIMIT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:611:6: ( 'LIMIT' )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:611:14: 'LIMIT'
			{
			match("LIMIT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LIMIT"

	// $ANTLR start "TRUNCATE"
	public final void mTRUNCATE() throws RecognitionException {
		try {
			int _type = TRUNCATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:612:9: ( 'TRUNCATE' )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:612:14: 'TRUNCATE'
			{
			match("TRUNCATE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TRUNCATE"

	// $ANTLR start "ASSUME"
	public final void mASSUME() throws RecognitionException {
		try {
			int _type = ASSUME;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:613:7: ( 'ASSUME' )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:613:14: 'ASSUME'
			{
			match("ASSUME"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ASSUME"

	// $ANTLR start "TTL"
	public final void mTTL() throws RecognitionException {
		try {
			int _type = TTL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:614:4: ( 'TTL' )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:614:14: 'TTL'
			{
			match("TTL"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TTL"

	// $ANTLR start "CONSISTENCYLEVEL"
	public final void mCONSISTENCYLEVEL() throws RecognitionException {
		try {
			int _type = CONSISTENCYLEVEL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:615:17: ( 'CONSISTENCYLEVEL' )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:615:21: 'CONSISTENCYLEVEL'
			{
			match("CONSISTENCYLEVEL"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CONSISTENCYLEVEL"

	// $ANTLR start "INDEX"
	public final void mINDEX() throws RecognitionException {
		try {
			int _type = INDEX;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:616:6: ( 'INDEX' )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:616:14: 'INDEX'
			{
			match("INDEX"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INDEX"

	// $ANTLR start "ON"
	public final void mON() throws RecognitionException {
		try {
			int _type = ON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:617:3: ( 'ON' )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:617:14: 'ON'
			{
			match("ON"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ON"

	// $ANTLR start "SCHEMA"
	public final void mSCHEMA() throws RecognitionException {
		try {
			int _type = SCHEMA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:618:7: ( 'SCHEMA' )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:618:14: 'SCHEMA'
			{
			match("SCHEMA"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SCHEMA"

	// $ANTLR start "IP_ADDRESS"
	public final void mIP_ADDRESS() throws RecognitionException {
		try {
			int _type = IP_ADDRESS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:621:5: ( IntegerPositiveLiteral '.' IntegerPositiveLiteral '.' IntegerPositiveLiteral '.' IntegerPositiveLiteral )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:621:7: IntegerPositiveLiteral '.' IntegerPositiveLiteral '.' IntegerPositiveLiteral '.' IntegerPositiveLiteral
			{
			mIntegerPositiveLiteral(); 

			match('.'); 
			mIntegerPositiveLiteral(); 

			match('.'); 
			mIntegerPositiveLiteral(); 

			match('.'); 
			mIntegerPositiveLiteral(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IP_ADDRESS"

	// $ANTLR start "Letter"
	public final void mLetter() throws RecognitionException {
		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:628:5: ( 'a' .. 'z' | 'A' .. 'Z' )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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
	// $ANTLR end "Letter"

	// $ANTLR start "Digit"
	public final void mDigit() throws RecognitionException {
		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:634:5: ( '0' .. '9' )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:
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
	// $ANTLR end "Digit"

	// $ANTLR start "Alnum"
	public final void mAlnum() throws RecognitionException {
		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:639:5: ( Letter | Digit )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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
	// $ANTLR end "Alnum"

	// $ANTLR start "IntegerPositiveLiteral"
	public final void mIntegerPositiveLiteral() throws RecognitionException {
		try {
			int _type = IntegerPositiveLiteral;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:644:4: ( ( Digit )+ )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:644:6: ( Digit )+
			{
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:644:6: ( Digit )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:
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
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IntegerPositiveLiteral"

	// $ANTLR start "IntegerNegativeLiteral"
	public final void mIntegerNegativeLiteral() throws RecognitionException {
		try {
			int _type = IntegerNegativeLiteral;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:648:4: ( '-' ( Digit )+ )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:648:6: '-' ( Digit )+
			{
			match('-'); 
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:648:10: ( Digit )+
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
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:
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
	// $ANTLR end "IntegerNegativeLiteral"

	// $ANTLR start "DoubleLiteral"
	public final void mDoubleLiteral() throws RecognitionException {
		try {
			int _type = DoubleLiteral;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:652:4: ( ( Digit )+ ( '.' ( Digit )+ )? | ' ' '.' ( Digit )+ )
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( ((LA7_0 >= '0' && LA7_0 <= '9')) ) {
				alt7=1;
			}
			else if ( (LA7_0==' ') ) {
				alt7=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}

			switch (alt7) {
				case 1 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:652:6: ( Digit )+ ( '.' ( Digit )+ )?
					{
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:652:6: ( Digit )+
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
							// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:
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

					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:652:13: ( '.' ( Digit )+ )?
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0=='.') ) {
						alt5=1;
					}
					switch (alt5) {
						case 1 :
							// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:652:14: '.' ( Digit )+
							{
							match('.'); 
							// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:652:18: ( Digit )+
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
									// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:
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
							break;

					}

					}
					break;
				case 2 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:653:6: ' ' '.' ( Digit )+
					{
					match(' '); 
					match('.'); 
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:653:14: ( Digit )+
					int cnt6=0;
					loop6:
					while (true) {
						int alt6=2;
						int LA6_0 = input.LA(1);
						if ( ((LA6_0 >= '0' && LA6_0 <= '9')) ) {
							alt6=1;
						}

						switch (alt6) {
						case 1 :
							// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:
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
							if ( cnt6 >= 1 ) break loop6;
							EarlyExitException eee = new EarlyExitException(6, input);
							throw eee;
						}
						cnt6++;
					}

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
	// $ANTLR end "DoubleLiteral"

	// $ANTLR start "Identifier"
	public final void mIdentifier() throws RecognitionException {
		try {
			int _type = Identifier;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:657:5: ( ( Letter | Alnum ) ( Alnum | '_' | '-' )* )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:657:7: ( Letter | Alnum ) ( Alnum | '_' | '-' )*
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:657:24: ( Alnum | '_' | '-' )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0=='-'||(LA8_0 >= '0' && LA8_0 <= '9')||(LA8_0 >= 'A' && LA8_0 <= 'Z')||LA8_0=='_'||(LA8_0 >= 'a' && LA8_0 <= 'z')) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:
					{
					if ( input.LA(1)=='-'||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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
					break loop8;
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

	// $ANTLR start "StringLiteral"
	public final void mStringLiteral() throws RecognitionException {
		try {
			int _type = StringLiteral;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:662:5: ( '\\'' ( SingleStringCharacter )* '\\'' )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:662:7: '\\'' ( SingleStringCharacter )* '\\''
			{
			match('\''); 
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:662:12: ( SingleStringCharacter )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( ((LA9_0 >= '\u0000' && LA9_0 <= '&')||(LA9_0 >= '(' && LA9_0 <= '\uFFFF')) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:662:12: SingleStringCharacter
					{
					mSingleStringCharacter(); 

					}
					break;

				default :
					break loop9;
				}
			}

			match('\''); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "StringLiteral"

	// $ANTLR start "SingleStringCharacter"
	public final void mSingleStringCharacter() throws RecognitionException {
		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:666:5: (~ ( '\\'' | '\\\\' ) | '\\\\' EscapeSequence )
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( ((LA10_0 >= '\u0000' && LA10_0 <= '&')||(LA10_0 >= '(' && LA10_0 <= '[')||(LA10_0 >= ']' && LA10_0 <= '\uFFFF')) ) {
				alt10=1;
			}
			else if ( (LA10_0=='\\') ) {
				alt10=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}

			switch (alt10) {
				case 1 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:666:7: ~ ( '\\'' | '\\\\' )
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 2 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:667:7: '\\\\' EscapeSequence
					{
					match('\\'); 
					mEscapeSequence(); 

					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SingleStringCharacter"

	// $ANTLR start "EscapeSequence"
	public final void mEscapeSequence() throws RecognitionException {
		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:671:5: ( CharacterEscapeSequence | '0' | HexEscapeSequence | UnicodeEscapeSequence )
			int alt11=4;
			int LA11_0 = input.LA(1);
			if ( ((LA11_0 >= '\u0000' && LA11_0 <= '/')||(LA11_0 >= ':' && LA11_0 <= 't')||(LA11_0 >= 'v' && LA11_0 <= 'w')||(LA11_0 >= 'y' && LA11_0 <= '\uFFFF')) ) {
				alt11=1;
			}
			else if ( (LA11_0=='0') ) {
				alt11=2;
			}
			else if ( (LA11_0=='x') ) {
				alt11=3;
			}
			else if ( (LA11_0=='u') ) {
				alt11=4;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}

			switch (alt11) {
				case 1 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:671:7: CharacterEscapeSequence
					{
					mCharacterEscapeSequence(); 

					}
					break;
				case 2 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:672:7: '0'
					{
					match('0'); 
					}
					break;
				case 3 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:673:7: HexEscapeSequence
					{
					mHexEscapeSequence(); 

					}
					break;
				case 4 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:674:7: UnicodeEscapeSequence
					{
					mUnicodeEscapeSequence(); 

					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EscapeSequence"

	// $ANTLR start "CharacterEscapeSequence"
	public final void mCharacterEscapeSequence() throws RecognitionException {
		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:678:5: ( SingleEscapeCharacter | NonEscapeCharacter )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:
			{
			if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '/')||(input.LA(1) >= ':' && input.LA(1) <= 't')||(input.LA(1) >= 'v' && input.LA(1) <= 'w')||(input.LA(1) >= 'y' && input.LA(1) <= '\uFFFF') ) {
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
	// $ANTLR end "CharacterEscapeSequence"

	// $ANTLR start "NonEscapeCharacter"
	public final void mNonEscapeCharacter() throws RecognitionException {
		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:683:5: (~ ( EscapeCharacter ) )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:
			{
			if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '/')||(input.LA(1) >= ':' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= 'a')||(input.LA(1) >= 'c' && input.LA(1) <= 'e')||(input.LA(1) >= 'g' && input.LA(1) <= 'm')||(input.LA(1) >= 'o' && input.LA(1) <= 'q')||input.LA(1)=='s'||input.LA(1)=='w'||(input.LA(1) >= 'y' && input.LA(1) <= '\uFFFF') ) {
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
	// $ANTLR end "NonEscapeCharacter"

	// $ANTLR start "SingleEscapeCharacter"
	public final void mSingleEscapeCharacter() throws RecognitionException {
		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:687:5: ( '\\'' | '\"' | '\\\\' | 'b' | 'f' | 'n' | 'r' | 't' | 'v' )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:
			{
			if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t'||input.LA(1)=='v' ) {
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
	// $ANTLR end "SingleEscapeCharacter"

	// $ANTLR start "EscapeCharacter"
	public final void mEscapeCharacter() throws RecognitionException {
		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:691:5: ( SingleEscapeCharacter | DecimalDigit | 'x' | 'u' )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:
			{
			if ( input.LA(1)=='\"'||input.LA(1)=='\''||(input.LA(1) >= '0' && input.LA(1) <= '9')||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1) >= 't' && input.LA(1) <= 'v')||input.LA(1)=='x' ) {
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
	// $ANTLR end "EscapeCharacter"

	// $ANTLR start "HexEscapeSequence"
	public final void mHexEscapeSequence() throws RecognitionException {
		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:698:5: ( 'x' HexDigit HexDigit )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:698:7: 'x' HexDigit HexDigit
			{
			match('x'); 
			mHexDigit(); 

			mHexDigit(); 

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HexEscapeSequence"

	// $ANTLR start "UnicodeEscapeSequence"
	public final void mUnicodeEscapeSequence() throws RecognitionException {
		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:702:5: ( 'u' HexDigit HexDigit HexDigit HexDigit )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:702:7: 'u' HexDigit HexDigit HexDigit HexDigit
			{
			match('u'); 
			mHexDigit(); 

			mHexDigit(); 

			mHexDigit(); 

			mHexDigit(); 

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UnicodeEscapeSequence"

	// $ANTLR start "HexDigit"
	public final void mHexDigit() throws RecognitionException {
		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:706:5: ( DecimalDigit | ( 'a' .. 'f' ) | ( 'A' .. 'F' ) )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
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
	// $ANTLR end "HexDigit"

	// $ANTLR start "DecimalDigit"
	public final void mDecimalDigit() throws RecognitionException {
		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:710:5: ( ( '0' .. '9' ) )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:
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
	// $ANTLR end "DecimalDigit"

	// $ANTLR start "SEMICOLON"
	public final void mSEMICOLON() throws RecognitionException {
		try {
			int _type = SEMICOLON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:718:5: ( ';' )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:718:7: ';'
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
	// $ANTLR end "SEMICOLON"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:722:5: ( ( ' ' | '\\r' | '\\t' | '\\n' ) )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:722:8: ( ' ' | '\\r' | '\\t' | '\\n' )
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
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:726:5: ( '--' (~ ( '\\n' | '\\r' ) )* | '/*' ( options {greedy=false; } : . )* '*/' )
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0=='-') ) {
				alt14=1;
			}
			else if ( (LA14_0=='/') ) {
				alt14=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}

			switch (alt14) {
				case 1 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:726:7: '--' (~ ( '\\n' | '\\r' ) )*
					{
					match("--"); 

					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:726:12: (~ ( '\\n' | '\\r' ) )*
					loop12:
					while (true) {
						int alt12=2;
						int LA12_0 = input.LA(1);
						if ( ((LA12_0 >= '\u0000' && LA12_0 <= '\t')||(LA12_0 >= '\u000B' && LA12_0 <= '\f')||(LA12_0 >= '\u000E' && LA12_0 <= '\uFFFF')) ) {
							alt12=1;
						}

						switch (alt12) {
						case 1 :
							// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:
							{
							if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
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
							break loop12;
						}
					}

					 _channel=HIDDEN; 
					}
					break;
				case 2 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:727:7: '/*' ( options {greedy=false; } : . )* '*/'
					{
					match("/*"); 

					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:727:12: ( options {greedy=false; } : . )*
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
							// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:727:39: .
							{
							matchAny(); 
							}
							break;

						default :
							break loop13;
						}
					}

					match("*/"); 

					 _channel=HIDDEN; 
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
	// $ANTLR end "COMMENT"

	@Override
	public void mTokens() throws RecognitionException {
		// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:1:8: ( T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | T__120 | T__121 | T__122 | T__123 | T__124 | T__125 | T__126 | T__127 | T__128 | T__129 | T__130 | T__131 | T__132 | CONFIG | CONNECT | COUNT | DEL | DESCRIBE | USE | TRACE | PROBABILITY | NEXT | QUERY | GET | HELP | EXIT | FILE | QUIT | SET | INCR | DECR | SHOW | KEYSPACE | KEYSPACES | API_VERSION | CREATE | DROP | COLUMN | FAMILY | WITH | BY | AND | UPDATE | LIST | LIMIT | TRUNCATE | ASSUME | TTL | CONSISTENCYLEVEL | INDEX | ON | SCHEMA | IP_ADDRESS | IntegerPositiveLiteral | IntegerNegativeLiteral | DoubleLiteral | Identifier | StringLiteral | SEMICOLON | WS | COMMENT )
		int alt15=70;
		alt15 = dfa15.predict(input);
		switch (alt15) {
			case 1 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:1:10: T__111
				{
				mT__111(); 

				}
				break;
			case 2 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:1:17: T__112
				{
				mT__112(); 

				}
				break;
			case 3 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:1:24: T__113
				{
				mT__113(); 

				}
				break;
			case 4 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:1:31: T__114
				{
				mT__114(); 

				}
				break;
			case 5 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:1:38: T__115
				{
				mT__115(); 

				}
				break;
			case 6 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:1:45: T__116
				{
				mT__116(); 

				}
				break;
			case 7 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:1:52: T__117
				{
				mT__117(); 

				}
				break;
			case 8 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:1:59: T__118
				{
				mT__118(); 

				}
				break;
			case 9 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:1:66: T__119
				{
				mT__119(); 

				}
				break;
			case 10 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:1:73: T__120
				{
				mT__120(); 

				}
				break;
			case 11 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:1:80: T__121
				{
				mT__121(); 

				}
				break;
			case 12 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:1:87: T__122
				{
				mT__122(); 

				}
				break;
			case 13 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:1:94: T__123
				{
				mT__123(); 

				}
				break;
			case 14 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:1:101: T__124
				{
				mT__124(); 

				}
				break;
			case 15 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:1:108: T__125
				{
				mT__125(); 

				}
				break;
			case 16 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:1:115: T__126
				{
				mT__126(); 

				}
				break;
			case 17 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:1:122: T__127
				{
				mT__127(); 

				}
				break;
			case 18 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:1:129: T__128
				{
				mT__128(); 

				}
				break;
			case 19 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:1:136: T__129
				{
				mT__129(); 

				}
				break;
			case 20 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:1:143: T__130
				{
				mT__130(); 

				}
				break;
			case 21 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:1:150: T__131
				{
				mT__131(); 

				}
				break;
			case 22 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:1:157: T__132
				{
				mT__132(); 

				}
				break;
			case 23 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:1:164: CONFIG
				{
				mCONFIG(); 

				}
				break;
			case 24 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:1:171: CONNECT
				{
				mCONNECT(); 

				}
				break;
			case 25 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:1:179: COUNT
				{
				mCOUNT(); 

				}
				break;
			case 26 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:1:185: DEL
				{
				mDEL(); 

				}
				break;
			case 27 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:1:189: DESCRIBE
				{
				mDESCRIBE(); 

				}
				break;
			case 28 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:1:198: USE
				{
				mUSE(); 

				}
				break;
			case 29 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:1:202: TRACE
				{
				mTRACE(); 

				}
				break;
			case 30 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:1:208: PROBABILITY
				{
				mPROBABILITY(); 

				}
				break;
			case 31 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:1:220: NEXT
				{
				mNEXT(); 

				}
				break;
			case 32 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:1:225: QUERY
				{
				mQUERY(); 

				}
				break;
			case 33 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:1:231: GET
				{
				mGET(); 

				}
				break;
			case 34 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:1:235: HELP
				{
				mHELP(); 

				}
				break;
			case 35 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:1:240: EXIT
				{
				mEXIT(); 

				}
				break;
			case 36 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:1:245: FILE
				{
				mFILE(); 

				}
				break;
			case 37 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:1:250: QUIT
				{
				mQUIT(); 

				}
				break;
			case 38 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:1:255: SET
				{
				mSET(); 

				}
				break;
			case 39 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:1:259: INCR
				{
				mINCR(); 

				}
				break;
			case 40 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:1:264: DECR
				{
				mDECR(); 

				}
				break;
			case 41 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:1:269: SHOW
				{
				mSHOW(); 

				}
				break;
			case 42 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:1:274: KEYSPACE
				{
				mKEYSPACE(); 

				}
				break;
			case 43 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:1:283: KEYSPACES
				{
				mKEYSPACES(); 

				}
				break;
			case 44 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:1:293: API_VERSION
				{
				mAPI_VERSION(); 

				}
				break;
			case 45 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:1:305: CREATE
				{
				mCREATE(); 

				}
				break;
			case 46 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:1:312: DROP
				{
				mDROP(); 

				}
				break;
			case 47 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:1:317: COLUMN
				{
				mCOLUMN(); 

				}
				break;
			case 48 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:1:324: FAMILY
				{
				mFAMILY(); 

				}
				break;
			case 49 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:1:331: WITH
				{
				mWITH(); 

				}
				break;
			case 50 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:1:336: BY
				{
				mBY(); 

				}
				break;
			case 51 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:1:339: AND
				{
				mAND(); 

				}
				break;
			case 52 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:1:343: UPDATE
				{
				mUPDATE(); 

				}
				break;
			case 53 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:1:350: LIST
				{
				mLIST(); 

				}
				break;
			case 54 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:1:355: LIMIT
				{
				mLIMIT(); 

				}
				break;
			case 55 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:1:361: TRUNCATE
				{
				mTRUNCATE(); 

				}
				break;
			case 56 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:1:370: ASSUME
				{
				mASSUME(); 

				}
				break;
			case 57 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:1:377: TTL
				{
				mTTL(); 

				}
				break;
			case 58 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:1:381: CONSISTENCYLEVEL
				{
				mCONSISTENCYLEVEL(); 

				}
				break;
			case 59 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:1:398: INDEX
				{
				mINDEX(); 

				}
				break;
			case 60 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:1:404: ON
				{
				mON(); 

				}
				break;
			case 61 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:1:407: SCHEMA
				{
				mSCHEMA(); 

				}
				break;
			case 62 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:1:414: IP_ADDRESS
				{
				mIP_ADDRESS(); 

				}
				break;
			case 63 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:1:425: IntegerPositiveLiteral
				{
				mIntegerPositiveLiteral(); 

				}
				break;
			case 64 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:1:448: IntegerNegativeLiteral
				{
				mIntegerNegativeLiteral(); 

				}
				break;
			case 65 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:1:471: DoubleLiteral
				{
				mDoubleLiteral(); 

				}
				break;
			case 66 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:1:485: Identifier
				{
				mIdentifier(); 

				}
				break;
			case 67 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:1:496: StringLiteral
				{
				mStringLiteral(); 

				}
				break;
			case 68 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:1:510: SEMICOLON
				{
				mSEMICOLON(); 

				}
				break;
			case 69 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:1:520: WS
				{
				mWS(); 

				}
				break;
			case 70 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:1:523: COMMENT
				{
				mCOMMENT(); 

				}
				break;

		}
	}


	protected DFA15 dfa15 = new DFA15(this);
	static final String DFA15_eotS =
		"\5\uffff\1\53\1\uffff\1\55\1\uffff\1\57\1\uffff\4\46\4\uffff\20\46\1\117"+
		"\1\uffff\1\51\12\uffff\1\125\33\46\1\170\1\46\1\173\2\uffff\1\117\2\uffff"+
		"\1\46\1\uffff\1\46\1\177\10\46\1\u008a\3\46\1\u008e\3\46\1\u0092\4\46"+
		"\1\u0097\4\46\1\u009c\5\46\1\uffff\2\46\1\uffff\1\123\1\46\2\uffff\11"+
		"\46\1\u00af\1\uffff\1\46\1\u00b1\1\u00b2\1\uffff\3\46\1\uffff\1\46\1\u00b7"+
		"\1\46\1\u00b9\1\uffff\1\u00ba\1\u00bb\1\u00bc\1\46\1\uffff\1\u00be\1\46"+
		"\1\u00c0\2\46\1\u00c3\1\46\1\uffff\6\46\1\u00cb\2\46\1\u00ce\1\uffff\1"+
		"\46\2\uffff\1\46\1\u00d1\2\46\1\uffff\1\u00d4\4\uffff\1\46\1\uffff\1\46"+
		"\1\uffff\1\u00d7\1\46\1\uffff\1\u00d9\1\u00da\1\46\1\u00dd\1\u00de\2\46"+
		"\1\uffff\1\u00e1\1\46\1\uffff\1\46\1\u00e4\1\uffff\2\46\1\uffff\1\u00e7"+
		"\1\u00e8\1\uffff\1\46\2\uffff\1\u00eb\1\u00ec\2\uffff\1\u00ed\1\46\1\uffff"+
		"\2\46\1\uffff\2\46\2\uffff\1\46\4\uffff\1\46\1\u00f5\1\u00f6\1\u00f7\1"+
		"\46\1\u00fa\1\46\3\uffff\1\46\1\u00fd\1\uffff\2\46\1\uffff\1\46\1\u0101"+
		"\1\46\1\uffff\3\46\1\u0106\1\uffff";
	static final String DFA15_eofS =
		"\u0107\uffff";
	static final String DFA15_minS =
		"\1\11\4\uffff\1\52\1\uffff\1\75\1\uffff\1\75\1\uffff\1\116\1\114\1\105"+
		"\1\110\4\uffff\1\105\1\120\2\122\1\105\1\125\2\105\1\130\1\101\1\103\1"+
		"\116\1\105\1\131\1\111\1\116\2\55\1\56\12\uffff\1\55\1\111\1\104\1\125"+
		"\1\114\1\105\1\126\1\105\1\124\1\103\1\117\1\105\1\104\1\101\1\114\1\117"+
		"\1\130\1\105\1\124\1\114\1\111\1\114\1\115\1\124\1\117\1\110\1\103\1\131"+
		"\1\55\1\115\1\55\1\uffff\1\60\1\55\2\uffff\1\125\1\uffff\1\40\1\55\1\123"+
		"\1\125\1\106\1\116\1\101\1\105\1\122\1\110\1\55\1\103\1\122\1\120\1\55"+
		"\1\101\1\103\1\116\1\55\1\102\1\124\1\122\1\124\1\55\1\120\1\124\1\105"+
		"\1\111\1\55\1\127\1\105\1\122\1\105\1\123\1\uffff\1\124\1\111\1\uffff"+
		"\1\56\1\115\2\uffff\1\124\1\115\1\111\1\105\1\111\2\124\1\122\1\105\1"+
		"\55\1\uffff\1\122\2\55\1\uffff\1\124\1\105\1\103\1\uffff\1\101\1\55\1"+
		"\131\1\55\1\uffff\3\55\1\114\1\uffff\1\55\1\115\1\55\1\130\1\120\1\55"+
		"\1\124\1\uffff\2\105\1\116\1\107\1\103\1\123\1\55\1\105\1\123\1\55\1\uffff"+
		"\1\111\2\uffff\1\105\1\55\1\101\1\102\1\uffff\1\55\4\uffff\1\131\1\uffff"+
		"\1\101\1\uffff\1\55\1\101\1\uffff\2\55\1\122\2\55\2\124\1\uffff\1\55\1"+
		"\105\1\uffff\1\102\1\55\1\uffff\1\124\1\111\1\uffff\2\55\1\uffff\1\103"+
		"\2\uffff\1\40\1\55\2\uffff\1\55\1\105\1\uffff\1\104\1\105\1\uffff\1\105"+
		"\1\114\2\uffff\1\105\4\uffff\1\116\3\55\1\111\1\55\1\103\3\uffff\1\124"+
		"\1\55\1\uffff\2\131\1\uffff\1\114\1\55\1\105\1\uffff\1\126\1\105\1\114"+
		"\1\55\1\uffff";
	static final String DFA15_maxS =
		"\1\175\4\uffff\1\52\1\uffff\1\75\1\uffff\1\75\1\uffff\1\123\1\122\1\105"+
		"\1\111\4\uffff\1\122\1\123\1\124\1\122\1\105\1\125\2\105\1\130\1\111\1"+
		"\110\1\116\1\105\1\131\1\111\1\116\1\172\1\71\1\56\12\uffff\1\172\1\111"+
		"\1\104\2\125\1\105\1\126\1\105\1\124\1\123\1\117\1\105\1\104\1\125\1\114"+
		"\1\117\1\130\1\111\1\124\1\114\1\111\1\114\1\115\1\124\1\117\1\110\1\104"+
		"\1\131\1\172\1\123\1\172\1\uffff\1\71\1\172\2\uffff\1\125\1\uffff\1\40"+
		"\1\172\1\123\1\125\1\123\1\116\1\101\1\105\1\122\1\110\1\172\1\103\1\122"+
		"\1\120\1\172\1\101\1\103\1\116\1\172\1\102\1\124\1\122\1\124\1\172\1\120"+
		"\1\124\1\105\1\111\1\172\1\127\1\105\1\122\1\105\1\123\1\uffff\1\124\1"+
		"\111\1\uffff\1\71\1\115\2\uffff\1\124\1\115\1\111\1\105\1\111\2\124\1"+
		"\122\1\105\1\172\1\uffff\1\122\2\172\1\uffff\1\124\1\105\1\103\1\uffff"+
		"\1\101\1\172\1\131\1\172\1\uffff\3\172\1\114\1\uffff\1\172\1\115\1\172"+
		"\1\130\1\120\1\172\1\124\1\uffff\2\105\1\116\1\107\1\103\1\123\1\172\1"+
		"\105\1\123\1\172\1\uffff\1\111\2\uffff\1\105\1\172\1\101\1\102\1\uffff"+
		"\1\172\4\uffff\1\131\1\uffff\1\101\1\uffff\1\172\1\101\1\uffff\2\172\1"+
		"\122\2\172\2\124\1\uffff\1\172\1\105\1\uffff\1\102\1\172\1\uffff\1\124"+
		"\1\111\1\uffff\2\172\1\uffff\1\103\2\uffff\2\172\2\uffff\1\172\1\105\1"+
		"\uffff\1\104\1\105\1\uffff\1\105\1\114\2\uffff\1\105\4\uffff\1\116\3\172"+
		"\1\111\1\172\1\103\3\uffff\1\124\1\172\1\uffff\2\131\1\uffff\1\114\1\172"+
		"\1\105\1\uffff\1\126\1\105\1\114\1\172\1\uffff";
	static final String DFA15_acceptS =
		"\1\uffff\1\1\1\2\1\3\1\4\1\uffff\1\6\1\uffff\1\11\1\uffff\1\14\4\uffff"+
		"\1\23\1\24\1\25\1\26\23\uffff\1\102\1\103\1\104\1\105\1\106\1\5\1\10\1"+
		"\7\1\13\1\12\37\uffff\1\77\2\uffff\1\100\1\101\1\uffff\1\15\42\uffff\1"+
		"\62\2\uffff\1\74\2\uffff\1\54\1\63\12\uffff\1\32\3\uffff\1\34\3\uffff"+
		"\1\71\4\uffff\1\41\4\uffff\1\46\7\uffff\1\76\12\uffff\1\61\1\uffff\1\50"+
		"\1\56\4\uffff\1\37\1\uffff\1\45\1\42\1\43\1\44\1\uffff\1\51\1\uffff\1"+
		"\47\2\uffff\1\65\7\uffff\1\31\2\uffff\1\22\2\uffff\1\35\2\uffff\1\40\2"+
		"\uffff\1\73\1\uffff\1\66\1\70\2\uffff\1\57\1\27\2\uffff\1\55\2\uffff\1"+
		"\64\2\uffff\1\60\1\75\1\uffff\1\16\1\17\1\20\1\30\7\uffff\1\21\1\33\1"+
		"\67\2\uffff\1\52\2\uffff\1\53\3\uffff\1\36\4\uffff\1\72";
	static final String DFA15_specialS =
		"\u0107\uffff}>";
	static final String[] DFA15_transitionS = {
			"\2\51\2\uffff\1\51\22\uffff\1\45\6\uffff\1\47\1\1\1\2\2\uffff\1\3\1\44"+
			"\1\4\1\5\12\43\1\6\1\50\1\7\1\10\1\11\1\12\1\uffff\1\13\1\40\1\14\1\23"+
			"\1\33\1\34\1\31\1\32\1\36\1\46\1\37\1\41\1\46\1\27\1\42\1\26\1\30\1\15"+
			"\1\35\1\25\1\24\1\46\1\16\3\46\1\17\1\uffff\1\20\3\uffff\32\46\1\21\1"+
			"\uffff\1\22",
			"",
			"",
			"",
			"",
			"\1\52",
			"",
			"\1\54",
			"",
			"\1\56",
			"",
			"\1\62\1\uffff\1\61\2\uffff\1\60",
			"\1\63\2\uffff\1\64\2\uffff\1\65",
			"\1\66",
			"\1\67\1\70",
			"",
			"",
			"",
			"",
			"\1\71\14\uffff\1\72",
			"\1\74\2\uffff\1\73",
			"\1\75\1\uffff\1\76",
			"\1\77",
			"\1\100",
			"\1\101",
			"\1\102",
			"\1\103",
			"\1\104",
			"\1\106\7\uffff\1\105",
			"\1\111\1\uffff\1\107\2\uffff\1\110",
			"\1\112",
			"\1\113",
			"\1\114",
			"\1\115",
			"\1\116",
			"\1\46\1\120\1\uffff\12\121\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
			"\1\52\2\uffff\12\122",
			"\1\123",
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
			"\1\46\2\uffff\12\46\7\uffff\22\46\1\124\7\46\4\uffff\1\46\1\uffff\32"+
			"\46",
			"\1\126",
			"\1\127",
			"\1\130",
			"\1\131\1\uffff\1\132\6\uffff\1\133",
			"\1\134",
			"\1\135",
			"\1\136",
			"\1\137",
			"\1\142\10\uffff\1\140\6\uffff\1\141",
			"\1\143",
			"\1\144",
			"\1\145",
			"\1\146\23\uffff\1\147",
			"\1\150",
			"\1\151",
			"\1\152",
			"\1\153\3\uffff\1\154",
			"\1\155",
			"\1\156",
			"\1\157",
			"\1\160",
			"\1\161",
			"\1\162",
			"\1\163",
			"\1\164",
			"\1\165\1\166",
			"\1\167",
			"\1\46\2\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
			"\1\172\5\uffff\1\171",
			"\1\46\2\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
			"",
			"\12\174",
			"\1\46\1\120\1\uffff\12\121\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
			"",
			"",
			"\1\175",
			"",
			"\1\176",
			"\1\46\2\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
			"\1\u0080",
			"\1\u0081",
			"\1\u0082\7\uffff\1\u0083\4\uffff\1\u0084",
			"\1\u0085",
			"\1\u0086",
			"\1\u0087",
			"\1\u0088",
			"\1\u0089",
			"\1\46\2\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
			"\1\u008b",
			"\1\u008c",
			"\1\u008d",
			"\1\46\2\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
			"\1\u008f",
			"\1\u0090",
			"\1\u0091",
			"\1\46\2\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
			"\1\u0093",
			"\1\u0094",
			"\1\u0095",
			"\1\u0096",
			"\1\46\2\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
			"\1\u0098",
			"\1\u0099",
			"\1\u009a",
			"\1\u009b",
			"\1\46\2\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
			"\1\u009d",
			"\1\u009e",
			"\1\u009f",
			"\1\u00a0",
			"\1\u00a1",
			"",
			"\1\u00a2",
			"\1\u00a3",
			"",
			"\1\u00a4\1\uffff\12\174",
			"\1\u00a5",
			"",
			"",
			"\1\u00a6",
			"\1\u00a7",
			"\1\u00a8",
			"\1\u00a9",
			"\1\u00aa",
			"\1\u00ab",
			"\1\u00ac",
			"\1\u00ad",
			"\1\u00ae",
			"\1\46\2\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
			"",
			"\1\u00b0",
			"\1\46\2\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
			"\1\46\2\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
			"",
			"\1\u00b3",
			"\1\u00b4",
			"\1\u00b5",
			"",
			"\1\u00b6",
			"\1\46\2\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
			"\1\u00b8",
			"\1\46\2\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
			"",
			"\1\46\2\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
			"\1\46\2\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
			"\1\46\2\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
			"\1\u00bd",
			"",
			"\1\46\2\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
			"\1\u00bf",
			"\1\46\2\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
			"\1\u00c1",
			"\1\u00c2",
			"\1\46\2\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
			"\1\u00c4",
			"",
			"\1\u00c5",
			"\1\u00c6",
			"\1\u00c7",
			"\1\u00c8",
			"\1\u00c9",
			"\1\u00ca",
			"\1\46\2\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
			"\1\u00cc",
			"\1\u00cd",
			"\1\46\2\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
			"",
			"\1\u00cf",
			"",
			"",
			"\1\u00d0",
			"\1\46\2\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
			"\1\u00d2",
			"\1\u00d3",
			"",
			"\1\46\2\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
			"",
			"",
			"",
			"",
			"\1\u00d5",
			"",
			"\1\u00d6",
			"",
			"\1\46\2\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
			"\1\u00d8",
			"",
			"\1\46\2\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
			"\1\46\2\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
			"\1\u00db",
			"\1\46\2\uffff\12\46\7\uffff\22\46\1\u00dc\7\46\4\uffff\1\46\1\uffff"+
			"\32\46",
			"\1\46\2\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
			"\1\u00df",
			"\1\u00e0",
			"",
			"\1\46\2\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
			"\1\u00e2",
			"",
			"\1\u00e3",
			"\1\46\2\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
			"",
			"\1\u00e5",
			"\1\u00e6",
			"",
			"\1\46\2\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
			"\1\46\2\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
			"",
			"\1\u00e9",
			"",
			"",
			"\1\u00ea\14\uffff\1\46\2\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff"+
			"\32\46",
			"\1\46\2\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
			"",
			"",
			"\1\46\2\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
			"\1\u00ee",
			"",
			"\1\u00ef",
			"\1\u00f0",
			"",
			"\1\u00f1",
			"\1\u00f2",
			"",
			"",
			"\1\u00f3",
			"",
			"",
			"",
			"",
			"\1\u00f4",
			"\1\46\2\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
			"\1\46\2\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
			"\1\46\2\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
			"\1\u00f8",
			"\1\46\2\uffff\12\46\7\uffff\22\46\1\u00f9\7\46\4\uffff\1\46\1\uffff"+
			"\32\46",
			"\1\u00fb",
			"",
			"",
			"",
			"\1\u00fc",
			"\1\46\2\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
			"",
			"\1\u00fe",
			"\1\u00ff",
			"",
			"\1\u0100",
			"\1\46\2\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
			"\1\u0102",
			"",
			"\1\u0103",
			"\1\u0104",
			"\1\u0105",
			"\1\46\2\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
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
			return "1:1: Tokens : ( T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | T__120 | T__121 | T__122 | T__123 | T__124 | T__125 | T__126 | T__127 | T__128 | T__129 | T__130 | T__131 | T__132 | CONFIG | CONNECT | COUNT | DEL | DESCRIBE | USE | TRACE | PROBABILITY | NEXT | QUERY | GET | HELP | EXIT | FILE | QUIT | SET | INCR | DECR | SHOW | KEYSPACE | KEYSPACES | API_VERSION | CREATE | DROP | COLUMN | FAMILY | WITH | BY | AND | UPDATE | LIST | LIMIT | TRUNCATE | ASSUME | TTL | CONSISTENCYLEVEL | INDEX | ON | SCHEMA | IP_ADDRESS | IntegerPositiveLiteral | IntegerNegativeLiteral | DoubleLiteral | Identifier | StringLiteral | SEMICOLON | WS | COMMENT );";
		}
	}

}
