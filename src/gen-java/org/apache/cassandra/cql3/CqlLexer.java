// $ANTLR 3.5.2 /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g 2014-10-08 17:02:55

    package org.apache.cassandra.cql3;

    import org.apache.cassandra.exceptions.SyntaxException;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class CqlLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__154=154;
	public static final int T__155=155;
	public static final int T__156=156;
	public static final int T__157=157;
	public static final int T__158=158;
	public static final int T__159=159;
	public static final int T__160=160;
	public static final int T__161=161;
	public static final int T__162=162;
	public static final int T__163=163;
	public static final int T__164=164;
	public static final int T__165=165;
	public static final int T__166=166;
	public static final int T__167=167;
	public static final int T__168=168;
	public static final int T__169=169;
	public static final int T__170=170;
	public static final int T__171=171;
	public static final int T__172=172;
	public static final int T__173=173;
	public static final int A=4;
	public static final int B=5;
	public static final int BOOLEAN=6;
	public static final int C=7;
	public static final int COMMENT=8;
	public static final int D=9;
	public static final int DIGIT=10;
	public static final int E=11;
	public static final int EXPONENT=12;
	public static final int F=13;
	public static final int FLOAT=14;
	public static final int G=15;
	public static final int H=16;
	public static final int HEX=17;
	public static final int HEXNUMBER=18;
	public static final int I=19;
	public static final int IDENT=20;
	public static final int INTEGER=21;
	public static final int J=22;
	public static final int K=23;
	public static final int K_ADD=24;
	public static final int K_ALL=25;
	public static final int K_ALLOW=26;
	public static final int K_ALTER=27;
	public static final int K_AND=28;
	public static final int K_APPLY=29;
	public static final int K_AS=30;
	public static final int K_ASC=31;
	public static final int K_ASCII=32;
	public static final int K_AUTHORIZE=33;
	public static final int K_BATCH=34;
	public static final int K_BEGIN=35;
	public static final int K_BIGINT=36;
	public static final int K_BLOB=37;
	public static final int K_BOOLEAN=38;
	public static final int K_BY=39;
	public static final int K_CLUSTERING=40;
	public static final int K_COLUMNFAMILY=41;
	public static final int K_COMPACT=42;
	public static final int K_CONT=43;
	public static final int K_CONTAINS=44;
	public static final int K_COUNT=45;
	public static final int K_COUNTER=46;
	public static final int K_CREATE=47;
	public static final int K_CUSTOM=48;
	public static final int K_DECIMAL=49;
	public static final int K_DELETE=50;
	public static final int K_DESC=51;
	public static final int K_DETERMINISTIC=52;
	public static final int K_DISTINCT=53;
	public static final int K_DOUBLE=54;
	public static final int K_DROP=55;
	public static final int K_EDGE=56;
	public static final int K_EXISTS=57;
	public static final int K_FILTERING=58;
	public static final int K_FLOAT=59;
	public static final int K_FROM=60;
	public static final int K_FROZEN=61;
	public static final int K_FUNCTION=62;
	public static final int K_GRANT=63;
	public static final int K_IF=64;
	public static final int K_IN=65;
	public static final int K_INDEX=66;
	public static final int K_INET=67;
	public static final int K_INFINITY=68;
	public static final int K_INSERT=69;
	public static final int K_INT=70;
	public static final int K_INTO=71;
	public static final int K_KEY=72;
	public static final int K_KEYS=73;
	public static final int K_KEYSPACE=74;
	public static final int K_KEYSPACES=75;
	public static final int K_LANGUAGE=76;
	public static final int K_LIMIT=77;
	public static final int K_LIST=78;
	public static final int K_MAP=79;
	public static final int K_MODIFY=80;
	public static final int K_NAN=81;
	public static final int K_NON=82;
	public static final int K_NORECURSIVE=83;
	public static final int K_NOSUPERUSER=84;
	public static final int K_NOT=85;
	public static final int K_NULL=86;
	public static final int K_OF=87;
	public static final int K_ON=88;
	public static final int K_OR=89;
	public static final int K_ORDER=90;
	public static final int K_PASSWORD=91;
	public static final int K_PERMISSION=92;
	public static final int K_PERMISSIONS=93;
	public static final int K_PRIMARY=94;
	public static final int K_RENAME=95;
	public static final int K_REPEAT=96;
	public static final int K_REPLACE=97;
	public static final int K_RETURNS=98;
	public static final int K_REVOKE=99;
	public static final int K_SELECT=100;
	public static final int K_SET=101;
	public static final int K_STATIC=102;
	public static final int K_STORAGE=103;
	public static final int K_SUPERUSER=104;
	public static final int K_TEXT=105;
	public static final int K_THROUGH=106;
	public static final int K_TIMESTAMP=107;
	public static final int K_TIMEUUID=108;
	public static final int K_TO=109;
	public static final int K_TOKEN=110;
	public static final int K_TRAVEL=111;
	public static final int K_TRIGGER=112;
	public static final int K_TRUNCATE=113;
	public static final int K_TTL=114;
	public static final int K_TUPLE=115;
	public static final int K_TYPE=116;
	public static final int K_UNLOGGED=117;
	public static final int K_UNTIL=118;
	public static final int K_UPDATE=119;
	public static final int K_USE=120;
	public static final int K_USER=121;
	public static final int K_USERS=122;
	public static final int K_USING=123;
	public static final int K_UUID=124;
	public static final int K_VALUES=125;
	public static final int K_VARCHAR=126;
	public static final int K_VARINT=127;
	public static final int K_VERTEX=128;
	public static final int K_WHERE=129;
	public static final int K_WITH=130;
	public static final int K_WRITETIME=131;
	public static final int L=132;
	public static final int LETTER=133;
	public static final int M=134;
	public static final int MULTILINE_COMMENT=135;
	public static final int N=136;
	public static final int O=137;
	public static final int P=138;
	public static final int Q=139;
	public static final int QMARK=140;
	public static final int QUOTED_NAME=141;
	public static final int R=142;
	public static final int S=143;
	public static final int STRING_LITERAL=144;
	public static final int T=145;
	public static final int U=146;
	public static final int UUID=147;
	public static final int V=148;
	public static final int W=149;
	public static final int WS=150;
	public static final int X=151;
	public static final int Y=152;
	public static final int Z=153;

	    List<Token> tokens = new ArrayList<Token>();

	    public void emit(Token token)
	    {
	        state.token = token;
	        tokens.add(token);
	    }

	    public Token nextToken()
	    {
	        super.nextToken();
	        if (tokens.size() == 0)
	            return new CommonToken(Token.EOF);
	        return tokens.remove(0);
	    }

	    private final List<ErrorListener> listeners = new ArrayList<ErrorListener>();

	    public void addErrorListener(ErrorListener listener)
	    {
	        this.listeners.add(listener);
	    }

	    public void removeErrorListener(ErrorListener listener)
	    {
	        this.listeners.remove(listener);
	    }

	    public void displayRecognitionError(String[] tokenNames, RecognitionException e)
	    {
	        for (int i = 0, m = listeners.size(); i < m; i++)
	            listeners.get(i).syntaxError(this, tokenNames, e);
	    }


	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public CqlLexer() {} 
	public CqlLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public CqlLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "/Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g"; }

	// $ANTLR start "T__154"
	public final void mT__154() throws RecognitionException {
		try {
			int _type = T__154;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:48:8: ( '!=' )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:48:10: '!='
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
	// $ANTLR end "T__154"

	// $ANTLR start "T__155"
	public final void mT__155() throws RecognitionException {
		try {
			int _type = T__155;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:49:8: ( '(' )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:49:10: '('
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
	// $ANTLR end "T__155"

	// $ANTLR start "T__156"
	public final void mT__156() throws RecognitionException {
		try {
			int _type = T__156;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:50:8: ( ')' )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:50:10: ')'
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
	// $ANTLR end "T__156"

	// $ANTLR start "T__157"
	public final void mT__157() throws RecognitionException {
		try {
			int _type = T__157;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:51:8: ( '+' )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:51:10: '+'
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
	// $ANTLR end "T__157"

	// $ANTLR start "T__158"
	public final void mT__158() throws RecognitionException {
		try {
			int _type = T__158;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:52:8: ( ',' )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:52:10: ','
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
	// $ANTLR end "T__158"

	// $ANTLR start "T__159"
	public final void mT__159() throws RecognitionException {
		try {
			int _type = T__159;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:53:8: ( '-' )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:53:10: '-'
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
	// $ANTLR end "T__159"

	// $ANTLR start "T__160"
	public final void mT__160() throws RecognitionException {
		try {
			int _type = T__160;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:54:8: ( '.' )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:54:10: '.'
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
	// $ANTLR end "T__160"

	// $ANTLR start "T__161"
	public final void mT__161() throws RecognitionException {
		try {
			int _type = T__161;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:55:8: ( ':' )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:55:10: ':'
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
	// $ANTLR end "T__161"

	// $ANTLR start "T__162"
	public final void mT__162() throws RecognitionException {
		try {
			int _type = T__162;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:56:8: ( '::' )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:56:10: '::'
			{
			match("::"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__162"

	// $ANTLR start "T__163"
	public final void mT__163() throws RecognitionException {
		try {
			int _type = T__163;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:57:8: ( ';' )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:57:10: ';'
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
	// $ANTLR end "T__163"

	// $ANTLR start "T__164"
	public final void mT__164() throws RecognitionException {
		try {
			int _type = T__164;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:58:8: ( '<' )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:58:10: '<'
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
	// $ANTLR end "T__164"

	// $ANTLR start "T__165"
	public final void mT__165() throws RecognitionException {
		try {
			int _type = T__165;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:59:8: ( '<=' )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:59:10: '<='
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
	// $ANTLR end "T__165"

	// $ANTLR start "T__166"
	public final void mT__166() throws RecognitionException {
		try {
			int _type = T__166;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:60:8: ( '=' )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:60:10: '='
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
	// $ANTLR end "T__166"

	// $ANTLR start "T__167"
	public final void mT__167() throws RecognitionException {
		try {
			int _type = T__167;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:61:8: ( '>' )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:61:10: '>'
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
	// $ANTLR end "T__167"

	// $ANTLR start "T__168"
	public final void mT__168() throws RecognitionException {
		try {
			int _type = T__168;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:62:8: ( '>=' )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:62:10: '>='
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
	// $ANTLR end "T__168"

	// $ANTLR start "T__169"
	public final void mT__169() throws RecognitionException {
		try {
			int _type = T__169;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:63:8: ( '[' )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:63:10: '['
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
	// $ANTLR end "T__169"

	// $ANTLR start "T__170"
	public final void mT__170() throws RecognitionException {
		try {
			int _type = T__170;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:64:8: ( '\\*' )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:64:10: '\\*'
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
	// $ANTLR end "T__170"

	// $ANTLR start "T__171"
	public final void mT__171() throws RecognitionException {
		try {
			int _type = T__171;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:65:8: ( ']' )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:65:10: ']'
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
	// $ANTLR end "T__171"

	// $ANTLR start "T__172"
	public final void mT__172() throws RecognitionException {
		try {
			int _type = T__172;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:66:8: ( '{' )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:66:10: '{'
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
	// $ANTLR end "T__172"

	// $ANTLR start "T__173"
	public final void mT__173() throws RecognitionException {
		try {
			int _type = T__173;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:67:8: ( '}' )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:67:10: '}'
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
	// $ANTLR end "T__173"

	// $ANTLR start "K_TRAVEL"
	public final void mK_TRAVEL() throws RecognitionException {
		try {
			int _type = K_TRAVEL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1337:9: ( T R A V E L )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1337:16: T R A V E L
			{
			mT(); 

			mR(); 

			mA(); 

			mV(); 

			mE(); 

			mL(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_TRAVEL"

	// $ANTLR start "K_VERTEX"
	public final void mK_VERTEX() throws RecognitionException {
		try {
			int _type = K_VERTEX;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1338:9: ( V E R T E X )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1338:16: V E R T E X
			{
			mV(); 

			mE(); 

			mR(); 

			mT(); 

			mE(); 

			mX(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_VERTEX"

	// $ANTLR start "K_REPEAT"
	public final void mK_REPEAT() throws RecognitionException {
		try {
			int _type = K_REPEAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1339:9: ( R E P E A T )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1339:16: R E P E A T
			{
			mR(); 

			mE(); 

			mP(); 

			mE(); 

			mA(); 

			mT(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_REPEAT"

	// $ANTLR start "K_UNTIL"
	public final void mK_UNTIL() throws RecognitionException {
		try {
			int _type = K_UNTIL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1340:8: ( U N T I L )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1340:16: U N T I L
			{
			mU(); 

			mN(); 

			mT(); 

			mI(); 

			mL(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_UNTIL"

	// $ANTLR start "K_CONT"
	public final void mK_CONT() throws RecognitionException {
		try {
			int _type = K_CONT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1341:7: ( C O N T )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1341:13: C O N T
			{
			mC(); 

			mO(); 

			mN(); 

			mT(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_CONT"

	// $ANTLR start "K_THROUGH"
	public final void mK_THROUGH() throws RecognitionException {
		try {
			int _type = K_THROUGH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1342:10: ( T H R O U G H )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1342:16: T H R O U G H
			{
			mT(); 

			mH(); 

			mR(); 

			mO(); 

			mU(); 

			mG(); 

			mH(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_THROUGH"

	// $ANTLR start "K_EDGE"
	public final void mK_EDGE() throws RecognitionException {
		try {
			int _type = K_EDGE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1343:7: ( E D G E )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1343:16: E D G E
			{
			mE(); 

			mD(); 

			mG(); 

			mE(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_EDGE"

	// $ANTLR start "K_SELECT"
	public final void mK_SELECT() throws RecognitionException {
		try {
			int _type = K_SELECT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1344:9: ( S E L E C T )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1344:16: S E L E C T
			{
			mS(); 

			mE(); 

			mL(); 

			mE(); 

			mC(); 

			mT(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_SELECT"

	// $ANTLR start "K_FROM"
	public final void mK_FROM() throws RecognitionException {
		try {
			int _type = K_FROM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1345:7: ( F R O M )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1345:16: F R O M
			{
			mF(); 

			mR(); 

			mO(); 

			mM(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_FROM"

	// $ANTLR start "K_AS"
	public final void mK_AS() throws RecognitionException {
		try {
			int _type = K_AS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1346:5: ( A S )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1346:16: A S
			{
			mA(); 

			mS(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_AS"

	// $ANTLR start "K_WHERE"
	public final void mK_WHERE() throws RecognitionException {
		try {
			int _type = K_WHERE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1347:8: ( W H E R E )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1347:16: W H E R E
			{
			mW(); 

			mH(); 

			mE(); 

			mR(); 

			mE(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_WHERE"

	// $ANTLR start "K_AND"
	public final void mK_AND() throws RecognitionException {
		try {
			int _type = K_AND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1348:6: ( A N D )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1348:16: A N D
			{
			mA(); 

			mN(); 

			mD(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_AND"

	// $ANTLR start "K_KEY"
	public final void mK_KEY() throws RecognitionException {
		try {
			int _type = K_KEY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1349:6: ( K E Y )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1349:16: K E Y
			{
			mK(); 

			mE(); 

			mY(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_KEY"

	// $ANTLR start "K_KEYS"
	public final void mK_KEYS() throws RecognitionException {
		try {
			int _type = K_KEYS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1350:7: ( K E Y S )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1350:16: K E Y S
			{
			mK(); 

			mE(); 

			mY(); 

			mS(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_KEYS"

	// $ANTLR start "K_INSERT"
	public final void mK_INSERT() throws RecognitionException {
		try {
			int _type = K_INSERT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1351:9: ( I N S E R T )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1351:16: I N S E R T
			{
			mI(); 

			mN(); 

			mS(); 

			mE(); 

			mR(); 

			mT(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_INSERT"

	// $ANTLR start "K_UPDATE"
	public final void mK_UPDATE() throws RecognitionException {
		try {
			int _type = K_UPDATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1352:9: ( U P D A T E )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1352:16: U P D A T E
			{
			mU(); 

			mP(); 

			mD(); 

			mA(); 

			mT(); 

			mE(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_UPDATE"

	// $ANTLR start "K_WITH"
	public final void mK_WITH() throws RecognitionException {
		try {
			int _type = K_WITH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1353:7: ( W I T H )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1353:16: W I T H
			{
			mW(); 

			mI(); 

			mT(); 

			mH(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_WITH"

	// $ANTLR start "K_LIMIT"
	public final void mK_LIMIT() throws RecognitionException {
		try {
			int _type = K_LIMIT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1354:8: ( L I M I T )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1354:16: L I M I T
			{
			mL(); 

			mI(); 

			mM(); 

			mI(); 

			mT(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_LIMIT"

	// $ANTLR start "K_USING"
	public final void mK_USING() throws RecognitionException {
		try {
			int _type = K_USING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1355:8: ( U S I N G )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1355:16: U S I N G
			{
			mU(); 

			mS(); 

			mI(); 

			mN(); 

			mG(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_USING"

	// $ANTLR start "K_USE"
	public final void mK_USE() throws RecognitionException {
		try {
			int _type = K_USE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1356:6: ( U S E )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1356:16: U S E
			{
			mU(); 

			mS(); 

			mE(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_USE"

	// $ANTLR start "K_DISTINCT"
	public final void mK_DISTINCT() throws RecognitionException {
		try {
			int _type = K_DISTINCT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1357:11: ( D I S T I N C T )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1357:16: D I S T I N C T
			{
			mD(); 

			mI(); 

			mS(); 

			mT(); 

			mI(); 

			mN(); 

			mC(); 

			mT(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_DISTINCT"

	// $ANTLR start "K_COUNT"
	public final void mK_COUNT() throws RecognitionException {
		try {
			int _type = K_COUNT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1358:8: ( C O U N T )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1358:16: C O U N T
			{
			mC(); 

			mO(); 

			mU(); 

			mN(); 

			mT(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_COUNT"

	// $ANTLR start "K_SET"
	public final void mK_SET() throws RecognitionException {
		try {
			int _type = K_SET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1359:6: ( S E T )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1359:16: S E T
			{
			mS(); 

			mE(); 

			mT(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_SET"

	// $ANTLR start "K_BEGIN"
	public final void mK_BEGIN() throws RecognitionException {
		try {
			int _type = K_BEGIN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1360:8: ( B E G I N )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1360:16: B E G I N
			{
			mB(); 

			mE(); 

			mG(); 

			mI(); 

			mN(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_BEGIN"

	// $ANTLR start "K_UNLOGGED"
	public final void mK_UNLOGGED() throws RecognitionException {
		try {
			int _type = K_UNLOGGED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1361:11: ( U N L O G G E D )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1361:16: U N L O G G E D
			{
			mU(); 

			mN(); 

			mL(); 

			mO(); 

			mG(); 

			mG(); 

			mE(); 

			mD(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_UNLOGGED"

	// $ANTLR start "K_BATCH"
	public final void mK_BATCH() throws RecognitionException {
		try {
			int _type = K_BATCH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1362:8: ( B A T C H )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1362:16: B A T C H
			{
			mB(); 

			mA(); 

			mT(); 

			mC(); 

			mH(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_BATCH"

	// $ANTLR start "K_APPLY"
	public final void mK_APPLY() throws RecognitionException {
		try {
			int _type = K_APPLY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1363:8: ( A P P L Y )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1363:16: A P P L Y
			{
			mA(); 

			mP(); 

			mP(); 

			mL(); 

			mY(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_APPLY"

	// $ANTLR start "K_TRUNCATE"
	public final void mK_TRUNCATE() throws RecognitionException {
		try {
			int _type = K_TRUNCATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1364:11: ( T R U N C A T E )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1364:16: T R U N C A T E
			{
			mT(); 

			mR(); 

			mU(); 

			mN(); 

			mC(); 

			mA(); 

			mT(); 

			mE(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_TRUNCATE"

	// $ANTLR start "K_DELETE"
	public final void mK_DELETE() throws RecognitionException {
		try {
			int _type = K_DELETE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1365:9: ( D E L E T E )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1365:16: D E L E T E
			{
			mD(); 

			mE(); 

			mL(); 

			mE(); 

			mT(); 

			mE(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_DELETE"

	// $ANTLR start "K_IN"
	public final void mK_IN() throws RecognitionException {
		try {
			int _type = K_IN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1366:5: ( I N )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1366:16: I N
			{
			mI(); 

			mN(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_IN"

	// $ANTLR start "K_CREATE"
	public final void mK_CREATE() throws RecognitionException {
		try {
			int _type = K_CREATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1367:9: ( C R E A T E )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1367:16: C R E A T E
			{
			mC(); 

			mR(); 

			mE(); 

			mA(); 

			mT(); 

			mE(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_CREATE"

	// $ANTLR start "K_KEYSPACE"
	public final void mK_KEYSPACE() throws RecognitionException {
		try {
			int _type = K_KEYSPACE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1368:11: ( ( K E Y S P A C E | S C H E M A ) )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1368:16: ( K E Y S P A C E | S C H E M A )
			{
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1368:16: ( K E Y S P A C E | S C H E M A )
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0=='K'||LA1_0=='k') ) {
				alt1=1;
			}
			else if ( (LA1_0=='S'||LA1_0=='s') ) {
				alt1=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}

			switch (alt1) {
				case 1 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1368:18: K E Y S P A C E
					{
					mK(); 

					mE(); 

					mY(); 

					mS(); 

					mP(); 

					mA(); 

					mC(); 

					mE(); 

					}
					break;
				case 2 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1369:20: S C H E M A
					{
					mS(); 

					mC(); 

					mH(); 

					mE(); 

					mM(); 

					mA(); 

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
	// $ANTLR end "K_KEYSPACE"

	// $ANTLR start "K_KEYSPACES"
	public final void mK_KEYSPACES() throws RecognitionException {
		try {
			int _type = K_KEYSPACES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1370:12: ( K E Y S P A C E S )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1370:16: K E Y S P A C E S
			{
			mK(); 

			mE(); 

			mY(); 

			mS(); 

			mP(); 

			mA(); 

			mC(); 

			mE(); 

			mS(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_KEYSPACES"

	// $ANTLR start "K_COLUMNFAMILY"
	public final void mK_COLUMNFAMILY() throws RecognitionException {
		try {
			int _type = K_COLUMNFAMILY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1371:15: ( ( C O L U M N F A M I L Y | T A B L E ) )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1371:16: ( C O L U M N F A M I L Y | T A B L E )
			{
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1371:16: ( C O L U M N F A M I L Y | T A B L E )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0=='C'||LA2_0=='c') ) {
				alt2=1;
			}
			else if ( (LA2_0=='T'||LA2_0=='t') ) {
				alt2=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1371:18: C O L U M N F A M I L Y
					{
					mC(); 

					mO(); 

					mL(); 

					mU(); 

					mM(); 

					mN(); 

					mF(); 

					mA(); 

					mM(); 

					mI(); 

					mL(); 

					mY(); 

					}
					break;
				case 2 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1372:20: T A B L E
					{
					mT(); 

					mA(); 

					mB(); 

					mL(); 

					mE(); 

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
	// $ANTLR end "K_COLUMNFAMILY"

	// $ANTLR start "K_INDEX"
	public final void mK_INDEX() throws RecognitionException {
		try {
			int _type = K_INDEX;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1373:8: ( I N D E X )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1373:16: I N D E X
			{
			mI(); 

			mN(); 

			mD(); 

			mE(); 

			mX(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_INDEX"

	// $ANTLR start "K_CUSTOM"
	public final void mK_CUSTOM() throws RecognitionException {
		try {
			int _type = K_CUSTOM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1374:9: ( C U S T O M )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1374:16: C U S T O M
			{
			mC(); 

			mU(); 

			mS(); 

			mT(); 

			mO(); 

			mM(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_CUSTOM"

	// $ANTLR start "K_ON"
	public final void mK_ON() throws RecognitionException {
		try {
			int _type = K_ON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1375:5: ( O N )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1375:16: O N
			{
			mO(); 

			mN(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_ON"

	// $ANTLR start "K_TO"
	public final void mK_TO() throws RecognitionException {
		try {
			int _type = K_TO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1376:5: ( T O )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1376:16: T O
			{
			mT(); 

			mO(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_TO"

	// $ANTLR start "K_DROP"
	public final void mK_DROP() throws RecognitionException {
		try {
			int _type = K_DROP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1377:7: ( D R O P )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1377:16: D R O P
			{
			mD(); 

			mR(); 

			mO(); 

			mP(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_DROP"

	// $ANTLR start "K_PRIMARY"
	public final void mK_PRIMARY() throws RecognitionException {
		try {
			int _type = K_PRIMARY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1378:10: ( P R I M A R Y )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1378:16: P R I M A R Y
			{
			mP(); 

			mR(); 

			mI(); 

			mM(); 

			mA(); 

			mR(); 

			mY(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_PRIMARY"

	// $ANTLR start "K_INTO"
	public final void mK_INTO() throws RecognitionException {
		try {
			int _type = K_INTO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1379:7: ( I N T O )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1379:16: I N T O
			{
			mI(); 

			mN(); 

			mT(); 

			mO(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_INTO"

	// $ANTLR start "K_VALUES"
	public final void mK_VALUES() throws RecognitionException {
		try {
			int _type = K_VALUES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1380:9: ( V A L U E S )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1380:16: V A L U E S
			{
			mV(); 

			mA(); 

			mL(); 

			mU(); 

			mE(); 

			mS(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_VALUES"

	// $ANTLR start "K_TIMESTAMP"
	public final void mK_TIMESTAMP() throws RecognitionException {
		try {
			int _type = K_TIMESTAMP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1381:12: ( T I M E S T A M P )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1381:16: T I M E S T A M P
			{
			mT(); 

			mI(); 

			mM(); 

			mE(); 

			mS(); 

			mT(); 

			mA(); 

			mM(); 

			mP(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_TIMESTAMP"

	// $ANTLR start "K_TTL"
	public final void mK_TTL() throws RecognitionException {
		try {
			int _type = K_TTL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1382:6: ( T T L )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1382:16: T T L
			{
			mT(); 

			mT(); 

			mL(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_TTL"

	// $ANTLR start "K_ALTER"
	public final void mK_ALTER() throws RecognitionException {
		try {
			int _type = K_ALTER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1383:8: ( A L T E R )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1383:16: A L T E R
			{
			mA(); 

			mL(); 

			mT(); 

			mE(); 

			mR(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_ALTER"

	// $ANTLR start "K_RENAME"
	public final void mK_RENAME() throws RecognitionException {
		try {
			int _type = K_RENAME;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1384:9: ( R E N A M E )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1384:16: R E N A M E
			{
			mR(); 

			mE(); 

			mN(); 

			mA(); 

			mM(); 

			mE(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_RENAME"

	// $ANTLR start "K_ADD"
	public final void mK_ADD() throws RecognitionException {
		try {
			int _type = K_ADD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1385:6: ( A D D )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1385:16: A D D
			{
			mA(); 

			mD(); 

			mD(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_ADD"

	// $ANTLR start "K_TYPE"
	public final void mK_TYPE() throws RecognitionException {
		try {
			int _type = K_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1386:7: ( T Y P E )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1386:16: T Y P E
			{
			mT(); 

			mY(); 

			mP(); 

			mE(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_TYPE"

	// $ANTLR start "K_COMPACT"
	public final void mK_COMPACT() throws RecognitionException {
		try {
			int _type = K_COMPACT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1387:10: ( C O M P A C T )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1387:16: C O M P A C T
			{
			mC(); 

			mO(); 

			mM(); 

			mP(); 

			mA(); 

			mC(); 

			mT(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_COMPACT"

	// $ANTLR start "K_STORAGE"
	public final void mK_STORAGE() throws RecognitionException {
		try {
			int _type = K_STORAGE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1388:10: ( S T O R A G E )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1388:16: S T O R A G E
			{
			mS(); 

			mT(); 

			mO(); 

			mR(); 

			mA(); 

			mG(); 

			mE(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_STORAGE"

	// $ANTLR start "K_ORDER"
	public final void mK_ORDER() throws RecognitionException {
		try {
			int _type = K_ORDER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1389:8: ( O R D E R )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1389:16: O R D E R
			{
			mO(); 

			mR(); 

			mD(); 

			mE(); 

			mR(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_ORDER"

	// $ANTLR start "K_BY"
	public final void mK_BY() throws RecognitionException {
		try {
			int _type = K_BY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1390:5: ( B Y )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1390:16: B Y
			{
			mB(); 

			mY(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_BY"

	// $ANTLR start "K_ASC"
	public final void mK_ASC() throws RecognitionException {
		try {
			int _type = K_ASC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1391:6: ( A S C )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1391:16: A S C
			{
			mA(); 

			mS(); 

			mC(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_ASC"

	// $ANTLR start "K_DESC"
	public final void mK_DESC() throws RecognitionException {
		try {
			int _type = K_DESC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1392:7: ( D E S C )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1392:16: D E S C
			{
			mD(); 

			mE(); 

			mS(); 

			mC(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_DESC"

	// $ANTLR start "K_ALLOW"
	public final void mK_ALLOW() throws RecognitionException {
		try {
			int _type = K_ALLOW;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1393:8: ( A L L O W )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1393:16: A L L O W
			{
			mA(); 

			mL(); 

			mL(); 

			mO(); 

			mW(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_ALLOW"

	// $ANTLR start "K_FILTERING"
	public final void mK_FILTERING() throws RecognitionException {
		try {
			int _type = K_FILTERING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1394:12: ( F I L T E R I N G )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1394:16: F I L T E R I N G
			{
			mF(); 

			mI(); 

			mL(); 

			mT(); 

			mE(); 

			mR(); 

			mI(); 

			mN(); 

			mG(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_FILTERING"

	// $ANTLR start "K_IF"
	public final void mK_IF() throws RecognitionException {
		try {
			int _type = K_IF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1395:5: ( I F )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1395:16: I F
			{
			mI(); 

			mF(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_IF"

	// $ANTLR start "K_CONTAINS"
	public final void mK_CONTAINS() throws RecognitionException {
		try {
			int _type = K_CONTAINS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1396:11: ( C O N T A I N S )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1396:16: C O N T A I N S
			{
			mC(); 

			mO(); 

			mN(); 

			mT(); 

			mA(); 

			mI(); 

			mN(); 

			mS(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_CONTAINS"

	// $ANTLR start "K_GRANT"
	public final void mK_GRANT() throws RecognitionException {
		try {
			int _type = K_GRANT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1398:8: ( G R A N T )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1398:16: G R A N T
			{
			mG(); 

			mR(); 

			mA(); 

			mN(); 

			mT(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_GRANT"

	// $ANTLR start "K_ALL"
	public final void mK_ALL() throws RecognitionException {
		try {
			int _type = K_ALL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1399:6: ( A L L )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1399:16: A L L
			{
			mA(); 

			mL(); 

			mL(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_ALL"

	// $ANTLR start "K_PERMISSION"
	public final void mK_PERMISSION() throws RecognitionException {
		try {
			int _type = K_PERMISSION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1400:13: ( P E R M I S S I O N )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1400:16: P E R M I S S I O N
			{
			mP(); 

			mE(); 

			mR(); 

			mM(); 

			mI(); 

			mS(); 

			mS(); 

			mI(); 

			mO(); 

			mN(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_PERMISSION"

	// $ANTLR start "K_PERMISSIONS"
	public final void mK_PERMISSIONS() throws RecognitionException {
		try {
			int _type = K_PERMISSIONS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1401:14: ( P E R M I S S I O N S )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1401:16: P E R M I S S I O N S
			{
			mP(); 

			mE(); 

			mR(); 

			mM(); 

			mI(); 

			mS(); 

			mS(); 

			mI(); 

			mO(); 

			mN(); 

			mS(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_PERMISSIONS"

	// $ANTLR start "K_OF"
	public final void mK_OF() throws RecognitionException {
		try {
			int _type = K_OF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1402:5: ( O F )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1402:16: O F
			{
			mO(); 

			mF(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_OF"

	// $ANTLR start "K_REVOKE"
	public final void mK_REVOKE() throws RecognitionException {
		try {
			int _type = K_REVOKE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1403:9: ( R E V O K E )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1403:16: R E V O K E
			{
			mR(); 

			mE(); 

			mV(); 

			mO(); 

			mK(); 

			mE(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_REVOKE"

	// $ANTLR start "K_MODIFY"
	public final void mK_MODIFY() throws RecognitionException {
		try {
			int _type = K_MODIFY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1404:9: ( M O D I F Y )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1404:16: M O D I F Y
			{
			mM(); 

			mO(); 

			mD(); 

			mI(); 

			mF(); 

			mY(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_MODIFY"

	// $ANTLR start "K_AUTHORIZE"
	public final void mK_AUTHORIZE() throws RecognitionException {
		try {
			int _type = K_AUTHORIZE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1405:12: ( A U T H O R I Z E )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1405:16: A U T H O R I Z E
			{
			mA(); 

			mU(); 

			mT(); 

			mH(); 

			mO(); 

			mR(); 

			mI(); 

			mZ(); 

			mE(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_AUTHORIZE"

	// $ANTLR start "K_NORECURSIVE"
	public final void mK_NORECURSIVE() throws RecognitionException {
		try {
			int _type = K_NORECURSIVE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1406:14: ( N O R E C U R S I V E )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1406:16: N O R E C U R S I V E
			{
			mN(); 

			mO(); 

			mR(); 

			mE(); 

			mC(); 

			mU(); 

			mR(); 

			mS(); 

			mI(); 

			mV(); 

			mE(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_NORECURSIVE"

	// $ANTLR start "K_USER"
	public final void mK_USER() throws RecognitionException {
		try {
			int _type = K_USER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1408:7: ( U S E R )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1408:16: U S E R
			{
			mU(); 

			mS(); 

			mE(); 

			mR(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_USER"

	// $ANTLR start "K_USERS"
	public final void mK_USERS() throws RecognitionException {
		try {
			int _type = K_USERS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1409:8: ( U S E R S )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1409:16: U S E R S
			{
			mU(); 

			mS(); 

			mE(); 

			mR(); 

			mS(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_USERS"

	// $ANTLR start "K_SUPERUSER"
	public final void mK_SUPERUSER() throws RecognitionException {
		try {
			int _type = K_SUPERUSER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1410:12: ( S U P E R U S E R )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1410:16: S U P E R U S E R
			{
			mS(); 

			mU(); 

			mP(); 

			mE(); 

			mR(); 

			mU(); 

			mS(); 

			mE(); 

			mR(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_SUPERUSER"

	// $ANTLR start "K_NOSUPERUSER"
	public final void mK_NOSUPERUSER() throws RecognitionException {
		try {
			int _type = K_NOSUPERUSER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1411:14: ( N O S U P E R U S E R )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1411:16: N O S U P E R U S E R
			{
			mN(); 

			mO(); 

			mS(); 

			mU(); 

			mP(); 

			mE(); 

			mR(); 

			mU(); 

			mS(); 

			mE(); 

			mR(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_NOSUPERUSER"

	// $ANTLR start "K_PASSWORD"
	public final void mK_PASSWORD() throws RecognitionException {
		try {
			int _type = K_PASSWORD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1412:11: ( P A S S W O R D )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1412:16: P A S S W O R D
			{
			mP(); 

			mA(); 

			mS(); 

			mS(); 

			mW(); 

			mO(); 

			mR(); 

			mD(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_PASSWORD"

	// $ANTLR start "K_CLUSTERING"
	public final void mK_CLUSTERING() throws RecognitionException {
		try {
			int _type = K_CLUSTERING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1414:13: ( C L U S T E R I N G )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1414:16: C L U S T E R I N G
			{
			mC(); 

			mL(); 

			mU(); 

			mS(); 

			mT(); 

			mE(); 

			mR(); 

			mI(); 

			mN(); 

			mG(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_CLUSTERING"

	// $ANTLR start "K_ASCII"
	public final void mK_ASCII() throws RecognitionException {
		try {
			int _type = K_ASCII;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1415:8: ( A S C I I )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1415:16: A S C I I
			{
			mA(); 

			mS(); 

			mC(); 

			mI(); 

			mI(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_ASCII"

	// $ANTLR start "K_BIGINT"
	public final void mK_BIGINT() throws RecognitionException {
		try {
			int _type = K_BIGINT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1416:9: ( B I G I N T )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1416:16: B I G I N T
			{
			mB(); 

			mI(); 

			mG(); 

			mI(); 

			mN(); 

			mT(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_BIGINT"

	// $ANTLR start "K_BLOB"
	public final void mK_BLOB() throws RecognitionException {
		try {
			int _type = K_BLOB;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1417:7: ( B L O B )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1417:16: B L O B
			{
			mB(); 

			mL(); 

			mO(); 

			mB(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_BLOB"

	// $ANTLR start "K_BOOLEAN"
	public final void mK_BOOLEAN() throws RecognitionException {
		try {
			int _type = K_BOOLEAN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1418:10: ( B O O L E A N )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1418:16: B O O L E A N
			{
			mB(); 

			mO(); 

			mO(); 

			mL(); 

			mE(); 

			mA(); 

			mN(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_BOOLEAN"

	// $ANTLR start "K_COUNTER"
	public final void mK_COUNTER() throws RecognitionException {
		try {
			int _type = K_COUNTER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1419:10: ( C O U N T E R )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1419:16: C O U N T E R
			{
			mC(); 

			mO(); 

			mU(); 

			mN(); 

			mT(); 

			mE(); 

			mR(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_COUNTER"

	// $ANTLR start "K_DECIMAL"
	public final void mK_DECIMAL() throws RecognitionException {
		try {
			int _type = K_DECIMAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1420:10: ( D E C I M A L )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1420:16: D E C I M A L
			{
			mD(); 

			mE(); 

			mC(); 

			mI(); 

			mM(); 

			mA(); 

			mL(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_DECIMAL"

	// $ANTLR start "K_DOUBLE"
	public final void mK_DOUBLE() throws RecognitionException {
		try {
			int _type = K_DOUBLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1421:9: ( D O U B L E )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1421:16: D O U B L E
			{
			mD(); 

			mO(); 

			mU(); 

			mB(); 

			mL(); 

			mE(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_DOUBLE"

	// $ANTLR start "K_FLOAT"
	public final void mK_FLOAT() throws RecognitionException {
		try {
			int _type = K_FLOAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1422:8: ( F L O A T )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1422:16: F L O A T
			{
			mF(); 

			mL(); 

			mO(); 

			mA(); 

			mT(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_FLOAT"

	// $ANTLR start "K_INET"
	public final void mK_INET() throws RecognitionException {
		try {
			int _type = K_INET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1423:7: ( I N E T )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1423:16: I N E T
			{
			mI(); 

			mN(); 

			mE(); 

			mT(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_INET"

	// $ANTLR start "K_INT"
	public final void mK_INT() throws RecognitionException {
		try {
			int _type = K_INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1424:6: ( I N T )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1424:16: I N T
			{
			mI(); 

			mN(); 

			mT(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_INT"

	// $ANTLR start "K_TEXT"
	public final void mK_TEXT() throws RecognitionException {
		try {
			int _type = K_TEXT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1425:7: ( T E X T )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1425:16: T E X T
			{
			mT(); 

			mE(); 

			mX(); 

			mT(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_TEXT"

	// $ANTLR start "K_UUID"
	public final void mK_UUID() throws RecognitionException {
		try {
			int _type = K_UUID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1426:7: ( U U I D )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1426:16: U U I D
			{
			mU(); 

			mU(); 

			mI(); 

			mD(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_UUID"

	// $ANTLR start "K_VARCHAR"
	public final void mK_VARCHAR() throws RecognitionException {
		try {
			int _type = K_VARCHAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1427:10: ( V A R C H A R )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1427:16: V A R C H A R
			{
			mV(); 

			mA(); 

			mR(); 

			mC(); 

			mH(); 

			mA(); 

			mR(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_VARCHAR"

	// $ANTLR start "K_VARINT"
	public final void mK_VARINT() throws RecognitionException {
		try {
			int _type = K_VARINT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1428:9: ( V A R I N T )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1428:16: V A R I N T
			{
			mV(); 

			mA(); 

			mR(); 

			mI(); 

			mN(); 

			mT(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_VARINT"

	// $ANTLR start "K_TIMEUUID"
	public final void mK_TIMEUUID() throws RecognitionException {
		try {
			int _type = K_TIMEUUID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1429:11: ( T I M E U U I D )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1429:16: T I M E U U I D
			{
			mT(); 

			mI(); 

			mM(); 

			mE(); 

			mU(); 

			mU(); 

			mI(); 

			mD(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_TIMEUUID"

	// $ANTLR start "K_TOKEN"
	public final void mK_TOKEN() throws RecognitionException {
		try {
			int _type = K_TOKEN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1430:8: ( T O K E N )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1430:16: T O K E N
			{
			mT(); 

			mO(); 

			mK(); 

			mE(); 

			mN(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_TOKEN"

	// $ANTLR start "K_WRITETIME"
	public final void mK_WRITETIME() throws RecognitionException {
		try {
			int _type = K_WRITETIME;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1431:12: ( W R I T E T I M E )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1431:16: W R I T E T I M E
			{
			mW(); 

			mR(); 

			mI(); 

			mT(); 

			mE(); 

			mT(); 

			mI(); 

			mM(); 

			mE(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_WRITETIME"

	// $ANTLR start "K_NULL"
	public final void mK_NULL() throws RecognitionException {
		try {
			int _type = K_NULL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1433:7: ( N U L L )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1433:16: N U L L
			{
			mN(); 

			mU(); 

			mL(); 

			mL(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_NULL"

	// $ANTLR start "K_NOT"
	public final void mK_NOT() throws RecognitionException {
		try {
			int _type = K_NOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1434:6: ( N O T )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1434:16: N O T
			{
			mN(); 

			mO(); 

			mT(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_NOT"

	// $ANTLR start "K_EXISTS"
	public final void mK_EXISTS() throws RecognitionException {
		try {
			int _type = K_EXISTS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1435:9: ( E X I S T S )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1435:16: E X I S T S
			{
			mE(); 

			mX(); 

			mI(); 

			mS(); 

			mT(); 

			mS(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_EXISTS"

	// $ANTLR start "K_MAP"
	public final void mK_MAP() throws RecognitionException {
		try {
			int _type = K_MAP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1437:6: ( M A P )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1437:16: M A P
			{
			mM(); 

			mA(); 

			mP(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_MAP"

	// $ANTLR start "K_LIST"
	public final void mK_LIST() throws RecognitionException {
		try {
			int _type = K_LIST;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1438:7: ( L I S T )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1438:16: L I S T
			{
			mL(); 

			mI(); 

			mS(); 

			mT(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_LIST"

	// $ANTLR start "K_NAN"
	public final void mK_NAN() throws RecognitionException {
		try {
			int _type = K_NAN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1439:6: ( N A N )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1439:16: N A N
			{
			mN(); 

			mA(); 

			mN(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_NAN"

	// $ANTLR start "K_INFINITY"
	public final void mK_INFINITY() throws RecognitionException {
		try {
			int _type = K_INFINITY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1440:11: ( I N F I N I T Y )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1440:16: I N F I N I T Y
			{
			mI(); 

			mN(); 

			mF(); 

			mI(); 

			mN(); 

			mI(); 

			mT(); 

			mY(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_INFINITY"

	// $ANTLR start "K_TUPLE"
	public final void mK_TUPLE() throws RecognitionException {
		try {
			int _type = K_TUPLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1441:8: ( T U P L E )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1441:16: T U P L E
			{
			mT(); 

			mU(); 

			mP(); 

			mL(); 

			mE(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_TUPLE"

	// $ANTLR start "K_TRIGGER"
	public final void mK_TRIGGER() throws RecognitionException {
		try {
			int _type = K_TRIGGER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1443:10: ( T R I G G E R )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1443:16: T R I G G E R
			{
			mT(); 

			mR(); 

			mI(); 

			mG(); 

			mG(); 

			mE(); 

			mR(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_TRIGGER"

	// $ANTLR start "K_STATIC"
	public final void mK_STATIC() throws RecognitionException {
		try {
			int _type = K_STATIC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1444:9: ( S T A T I C )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1444:16: S T A T I C
			{
			mS(); 

			mT(); 

			mA(); 

			mT(); 

			mI(); 

			mC(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_STATIC"

	// $ANTLR start "K_FROZEN"
	public final void mK_FROZEN() throws RecognitionException {
		try {
			int _type = K_FROZEN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1445:9: ( F R O Z E N )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1445:16: F R O Z E N
			{
			mF(); 

			mR(); 

			mO(); 

			mZ(); 

			mE(); 

			mN(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_FROZEN"

	// $ANTLR start "K_FUNCTION"
	public final void mK_FUNCTION() throws RecognitionException {
		try {
			int _type = K_FUNCTION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1447:11: ( F U N C T I O N )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1447:16: F U N C T I O N
			{
			mF(); 

			mU(); 

			mN(); 

			mC(); 

			mT(); 

			mI(); 

			mO(); 

			mN(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_FUNCTION"

	// $ANTLR start "K_RETURNS"
	public final void mK_RETURNS() throws RecognitionException {
		try {
			int _type = K_RETURNS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1448:10: ( R E T U R N S )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1448:16: R E T U R N S
			{
			mR(); 

			mE(); 

			mT(); 

			mU(); 

			mR(); 

			mN(); 

			mS(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_RETURNS"

	// $ANTLR start "K_LANGUAGE"
	public final void mK_LANGUAGE() throws RecognitionException {
		try {
			int _type = K_LANGUAGE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1449:11: ( L A N G U A G E )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1449:16: L A N G U A G E
			{
			mL(); 

			mA(); 

			mN(); 

			mG(); 

			mU(); 

			mA(); 

			mG(); 

			mE(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_LANGUAGE"

	// $ANTLR start "K_NON"
	public final void mK_NON() throws RecognitionException {
		try {
			int _type = K_NON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1450:6: ( N O N )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1450:16: N O N
			{
			mN(); 

			mO(); 

			mN(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_NON"

	// $ANTLR start "K_OR"
	public final void mK_OR() throws RecognitionException {
		try {
			int _type = K_OR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1451:5: ( O R )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1451:16: O R
			{
			mO(); 

			mR(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_OR"

	// $ANTLR start "K_REPLACE"
	public final void mK_REPLACE() throws RecognitionException {
		try {
			int _type = K_REPLACE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1452:10: ( R E P L A C E )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1452:16: R E P L A C E
			{
			mR(); 

			mE(); 

			mP(); 

			mL(); 

			mA(); 

			mC(); 

			mE(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_REPLACE"

	// $ANTLR start "K_DETERMINISTIC"
	public final void mK_DETERMINISTIC() throws RecognitionException {
		try {
			int _type = K_DETERMINISTIC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1453:16: ( D E T E R M I N I S T I C )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1453:18: D E T E R M I N I S T I C
			{
			mD(); 

			mE(); 

			mT(); 

			mE(); 

			mR(); 

			mM(); 

			mI(); 

			mN(); 

			mI(); 

			mS(); 

			mT(); 

			mI(); 

			mC(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K_DETERMINISTIC"

	// $ANTLR start "A"
	public final void mA() throws RecognitionException {
		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1456:11: ( ( 'a' | 'A' ) )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:
			{
			if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
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
	// $ANTLR end "A"

	// $ANTLR start "B"
	public final void mB() throws RecognitionException {
		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1457:11: ( ( 'b' | 'B' ) )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:
			{
			if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
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
	// $ANTLR end "B"

	// $ANTLR start "C"
	public final void mC() throws RecognitionException {
		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1458:11: ( ( 'c' | 'C' ) )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:
			{
			if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
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
	// $ANTLR end "C"

	// $ANTLR start "D"
	public final void mD() throws RecognitionException {
		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1459:11: ( ( 'd' | 'D' ) )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:
			{
			if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
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
	// $ANTLR end "D"

	// $ANTLR start "E"
	public final void mE() throws RecognitionException {
		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1460:11: ( ( 'e' | 'E' ) )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:
			{
			if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
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
	// $ANTLR end "E"

	// $ANTLR start "F"
	public final void mF() throws RecognitionException {
		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1461:11: ( ( 'f' | 'F' ) )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:
			{
			if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
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
	// $ANTLR end "F"

	// $ANTLR start "G"
	public final void mG() throws RecognitionException {
		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1462:11: ( ( 'g' | 'G' ) )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:
			{
			if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
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
	// $ANTLR end "G"

	// $ANTLR start "H"
	public final void mH() throws RecognitionException {
		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1463:11: ( ( 'h' | 'H' ) )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:
			{
			if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
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
	// $ANTLR end "H"

	// $ANTLR start "I"
	public final void mI() throws RecognitionException {
		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1464:11: ( ( 'i' | 'I' ) )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:
			{
			if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
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
	// $ANTLR end "I"

	// $ANTLR start "J"
	public final void mJ() throws RecognitionException {
		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1465:11: ( ( 'j' | 'J' ) )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:
			{
			if ( input.LA(1)=='J'||input.LA(1)=='j' ) {
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
	// $ANTLR end "J"

	// $ANTLR start "K"
	public final void mK() throws RecognitionException {
		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1466:11: ( ( 'k' | 'K' ) )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:
			{
			if ( input.LA(1)=='K'||input.LA(1)=='k' ) {
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
	// $ANTLR end "K"

	// $ANTLR start "L"
	public final void mL() throws RecognitionException {
		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1467:11: ( ( 'l' | 'L' ) )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:
			{
			if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
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
	// $ANTLR end "L"

	// $ANTLR start "M"
	public final void mM() throws RecognitionException {
		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1468:11: ( ( 'm' | 'M' ) )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:
			{
			if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
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
	// $ANTLR end "M"

	// $ANTLR start "N"
	public final void mN() throws RecognitionException {
		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1469:11: ( ( 'n' | 'N' ) )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:
			{
			if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
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
	// $ANTLR end "N"

	// $ANTLR start "O"
	public final void mO() throws RecognitionException {
		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1470:11: ( ( 'o' | 'O' ) )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:
			{
			if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
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
	// $ANTLR end "O"

	// $ANTLR start "P"
	public final void mP() throws RecognitionException {
		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1471:11: ( ( 'p' | 'P' ) )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:
			{
			if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
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
	// $ANTLR end "P"

	// $ANTLR start "Q"
	public final void mQ() throws RecognitionException {
		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1472:11: ( ( 'q' | 'Q' ) )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:
			{
			if ( input.LA(1)=='Q'||input.LA(1)=='q' ) {
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
	// $ANTLR end "Q"

	// $ANTLR start "R"
	public final void mR() throws RecognitionException {
		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1473:11: ( ( 'r' | 'R' ) )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:
			{
			if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
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
	// $ANTLR end "R"

	// $ANTLR start "S"
	public final void mS() throws RecognitionException {
		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1474:11: ( ( 's' | 'S' ) )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:
			{
			if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
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
	// $ANTLR end "S"

	// $ANTLR start "T"
	public final void mT() throws RecognitionException {
		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1475:11: ( ( 't' | 'T' ) )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:
			{
			if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
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
	// $ANTLR end "T"

	// $ANTLR start "U"
	public final void mU() throws RecognitionException {
		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1476:11: ( ( 'u' | 'U' ) )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:
			{
			if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
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
	// $ANTLR end "U"

	// $ANTLR start "V"
	public final void mV() throws RecognitionException {
		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1477:11: ( ( 'v' | 'V' ) )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:
			{
			if ( input.LA(1)=='V'||input.LA(1)=='v' ) {
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
	// $ANTLR end "V"

	// $ANTLR start "W"
	public final void mW() throws RecognitionException {
		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1478:11: ( ( 'w' | 'W' ) )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:
			{
			if ( input.LA(1)=='W'||input.LA(1)=='w' ) {
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
	// $ANTLR end "W"

	// $ANTLR start "X"
	public final void mX() throws RecognitionException {
		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1479:11: ( ( 'x' | 'X' ) )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:
			{
			if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
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
	// $ANTLR end "X"

	// $ANTLR start "Y"
	public final void mY() throws RecognitionException {
		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1480:11: ( ( 'y' | 'Y' ) )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:
			{
			if ( input.LA(1)=='Y'||input.LA(1)=='y' ) {
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
	// $ANTLR end "Y"

	// $ANTLR start "Z"
	public final void mZ() throws RecognitionException {
		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1481:11: ( ( 'z' | 'Z' ) )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:
			{
			if ( input.LA(1)=='Z'||input.LA(1)=='z' ) {
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
	// $ANTLR end "Z"

	// $ANTLR start "STRING_LITERAL"
	public final void mSTRING_LITERAL() throws RecognitionException {
		try {
			int _type = STRING_LITERAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			int c;

			 StringBuilder b = new StringBuilder(); 
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1486:5: ( '\\'' (c=~ ( '\\'' ) | '\\'' '\\'' )* '\\'' )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1486:7: '\\'' (c=~ ( '\\'' ) | '\\'' '\\'' )* '\\''
			{
			match('\''); 
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1486:12: (c=~ ( '\\'' ) | '\\'' '\\'' )*
			loop3:
			while (true) {
				int alt3=3;
				int LA3_0 = input.LA(1);
				if ( (LA3_0=='\'') ) {
					int LA3_1 = input.LA(2);
					if ( (LA3_1=='\'') ) {
						alt3=2;
					}

				}
				else if ( ((LA3_0 >= '\u0000' && LA3_0 <= '&')||(LA3_0 >= '(' && LA3_0 <= '\uFFFF')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1486:13: c=~ ( '\\'' )
					{
					c= input.LA(1);
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					 b.appendCodePoint(c);
					}
					break;
				case 2 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1486:50: '\\'' '\\''
					{
					match('\''); 
					match('\''); 
					 b.appendCodePoint('\''); 
					}
					break;

				default :
					break loop3;
				}
			}

			match('\''); 
			}

			state.type = _type;
			state.channel = _channel;
			 setText(b.toString()); 
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING_LITERAL"

	// $ANTLR start "QUOTED_NAME"
	public final void mQUOTED_NAME() throws RecognitionException {
		try {
			int _type = QUOTED_NAME;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			int c;

			 StringBuilder b = new StringBuilder(); 
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1492:5: ( '\\\"' (c=~ ( '\\\"' ) | '\\\"' '\\\"' )+ '\\\"' )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1492:7: '\\\"' (c=~ ( '\\\"' ) | '\\\"' '\\\"' )+ '\\\"'
			{
			match('\"'); 
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1492:12: (c=~ ( '\\\"' ) | '\\\"' '\\\"' )+
			int cnt4=0;
			loop4:
			while (true) {
				int alt4=3;
				int LA4_0 = input.LA(1);
				if ( (LA4_0=='\"') ) {
					int LA4_1 = input.LA(2);
					if ( (LA4_1=='\"') ) {
						alt4=2;
					}

				}
				else if ( ((LA4_0 >= '\u0000' && LA4_0 <= '!')||(LA4_0 >= '#' && LA4_0 <= '\uFFFF')) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1492:13: c=~ ( '\\\"' )
					{
					c= input.LA(1);
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					 b.appendCodePoint(c); 
					}
					break;
				case 2 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1492:51: '\\\"' '\\\"'
					{
					match('\"'); 
					match('\"'); 
					 b.appendCodePoint('\"'); 
					}
					break;

				default :
					if ( cnt4 >= 1 ) break loop4;
					EarlyExitException eee = new EarlyExitException(4, input);
					throw eee;
				}
				cnt4++;
			}

			match('\"'); 
			}

			state.type = _type;
			state.channel = _channel;
			 setText(b.toString()); 
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "QUOTED_NAME"

	// $ANTLR start "DIGIT"
	public final void mDIGIT() throws RecognitionException {
		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1496:5: ( '0' .. '9' )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:
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

	// $ANTLR start "LETTER"
	public final void mLETTER() throws RecognitionException {
		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1500:5: ( ( 'A' .. 'Z' | 'a' .. 'z' ) )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:
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
	// $ANTLR end "LETTER"

	// $ANTLR start "HEX"
	public final void mHEX() throws RecognitionException {
		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1504:5: ( ( 'A' .. 'F' | 'a' .. 'f' | '0' .. '9' ) )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:
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
	// $ANTLR end "HEX"

	// $ANTLR start "EXPONENT"
	public final void mEXPONENT() throws RecognitionException {
		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1508:5: ( E ( '+' | '-' )? ( DIGIT )+ )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1508:7: E ( '+' | '-' )? ( DIGIT )+
			{
			mE(); 

			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1508:9: ( '+' | '-' )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0=='+'||LA5_0=='-') ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:
					{
					if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1508:22: ( DIGIT )+
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
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:
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

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EXPONENT"

	// $ANTLR start "INTEGER"
	public final void mINTEGER() throws RecognitionException {
		try {
			int _type = INTEGER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1512:5: ( ( '-' )? ( DIGIT )+ )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1512:7: ( '-' )? ( DIGIT )+
			{
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1512:7: ( '-' )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0=='-') ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1512:7: '-'
					{
					match('-'); 
					}
					break;

			}

			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1512:12: ( DIGIT )+
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
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:
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

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INTEGER"

	// $ANTLR start "QMARK"
	public final void mQMARK() throws RecognitionException {
		try {
			int _type = QMARK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1516:5: ( '?' )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1516:7: '?'
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
	// $ANTLR end "QMARK"

	// $ANTLR start "FLOAT"
	public final void mFLOAT() throws RecognitionException {
		try {
			int _type = FLOAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1524:5: ( INTEGER EXPONENT | INTEGER '.' ( DIGIT )* ( EXPONENT )? )
			int alt11=2;
			alt11 = dfa11.predict(input);
			switch (alt11) {
				case 1 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1524:7: INTEGER EXPONENT
					{
					mINTEGER(); 

					mEXPONENT(); 

					}
					break;
				case 2 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1525:7: INTEGER '.' ( DIGIT )* ( EXPONENT )?
					{
					mINTEGER(); 

					match('.'); 
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1525:19: ( DIGIT )*
					loop9:
					while (true) {
						int alt9=2;
						int LA9_0 = input.LA(1);
						if ( ((LA9_0 >= '0' && LA9_0 <= '9')) ) {
							alt9=1;
						}

						switch (alt9) {
						case 1 :
							// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:
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

					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1525:26: ( EXPONENT )?
					int alt10=2;
					int LA10_0 = input.LA(1);
					if ( (LA10_0=='E'||LA10_0=='e') ) {
						alt10=1;
					}
					switch (alt10) {
						case 1 :
							// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1525:26: EXPONENT
							{
							mEXPONENT(); 

							}
							break;

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
	// $ANTLR end "FLOAT"

	// $ANTLR start "BOOLEAN"
	public final void mBOOLEAN() throws RecognitionException {
		try {
			int _type = BOOLEAN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1532:5: ( T R U E | F A L S E )
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0=='T'||LA12_0=='t') ) {
				alt12=1;
			}
			else if ( (LA12_0=='F'||LA12_0=='f') ) {
				alt12=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}

			switch (alt12) {
				case 1 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1532:7: T R U E
					{
					mT(); 

					mR(); 

					mU(); 

					mE(); 

					}
					break;
				case 2 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1532:17: F A L S E
					{
					mF(); 

					mA(); 

					mL(); 

					mS(); 

					mE(); 

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
	// $ANTLR end "BOOLEAN"

	// $ANTLR start "IDENT"
	public final void mIDENT() throws RecognitionException {
		try {
			int _type = IDENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1536:5: ( LETTER ( LETTER | DIGIT | '_' )* )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1536:7: LETTER ( LETTER | DIGIT | '_' )*
			{
			mLETTER(); 

			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1536:14: ( LETTER | DIGIT | '_' )*
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( ((LA13_0 >= '0' && LA13_0 <= '9')||(LA13_0 >= 'A' && LA13_0 <= 'Z')||LA13_0=='_'||(LA13_0 >= 'a' && LA13_0 <= 'z')) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:
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
					break loop13;
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
	// $ANTLR end "IDENT"

	// $ANTLR start "HEXNUMBER"
	public final void mHEXNUMBER() throws RecognitionException {
		try {
			int _type = HEXNUMBER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1540:5: ( '0' X ( HEX )* )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1540:7: '0' X ( HEX )*
			{
			match('0'); 
			mX(); 

			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1540:13: ( HEX )*
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( ((LA14_0 >= '0' && LA14_0 <= '9')||(LA14_0 >= 'A' && LA14_0 <= 'F')||(LA14_0 >= 'a' && LA14_0 <= 'f')) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:
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
					break;

				default :
					break loop14;
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
	// $ANTLR end "HEXNUMBER"

	// $ANTLR start "UUID"
	public final void mUUID() throws RecognitionException {
		try {
			int _type = UUID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1544:5: ( HEX HEX HEX HEX HEX HEX HEX HEX '-' HEX HEX HEX HEX '-' HEX HEX HEX HEX '-' HEX HEX HEX HEX '-' HEX HEX HEX HEX HEX HEX HEX HEX HEX HEX HEX HEX )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1544:7: HEX HEX HEX HEX HEX HEX HEX HEX '-' HEX HEX HEX HEX '-' HEX HEX HEX HEX '-' HEX HEX HEX HEX '-' HEX HEX HEX HEX HEX HEX HEX HEX HEX HEX HEX HEX
			{
			mHEX(); 

			mHEX(); 

			mHEX(); 

			mHEX(); 

			mHEX(); 

			mHEX(); 

			mHEX(); 

			mHEX(); 

			match('-'); 
			mHEX(); 

			mHEX(); 

			mHEX(); 

			mHEX(); 

			match('-'); 
			mHEX(); 

			mHEX(); 

			mHEX(); 

			mHEX(); 

			match('-'); 
			mHEX(); 

			mHEX(); 

			mHEX(); 

			mHEX(); 

			match('-'); 
			mHEX(); 

			mHEX(); 

			mHEX(); 

			mHEX(); 

			mHEX(); 

			mHEX(); 

			mHEX(); 

			mHEX(); 

			mHEX(); 

			mHEX(); 

			mHEX(); 

			mHEX(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UUID"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1552:5: ( ( ' ' | '\\t' | '\\n' | '\\r' )+ )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1552:7: ( ' ' | '\\t' | '\\n' | '\\r' )+
			{
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1552:7: ( ' ' | '\\t' | '\\n' | '\\r' )+
			int cnt15=0;
			loop15:
			while (true) {
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( ((LA15_0 >= '\t' && LA15_0 <= '\n')||LA15_0=='\r'||LA15_0==' ') ) {
					alt15=1;
				}

				switch (alt15) {
				case 1 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
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
					if ( cnt15 >= 1 ) break loop15;
					EarlyExitException eee = new EarlyExitException(15, input);
					throw eee;
				}
				cnt15++;
			}

			 _channel = HIDDEN; 
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
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1556:5: ( ( '--' | '//' ) ( . )* ( '\\n' | '\\r' ) )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1556:7: ( '--' | '//' ) ( . )* ( '\\n' | '\\r' )
			{
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1556:7: ( '--' | '//' )
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0=='-') ) {
				alt16=1;
			}
			else if ( (LA16_0=='/') ) {
				alt16=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}

			switch (alt16) {
				case 1 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1556:8: '--'
					{
					match("--"); 

					}
					break;
				case 2 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1556:15: '//'
					{
					match("//"); 

					}
					break;

			}

			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1556:21: ( . )*
			loop17:
			while (true) {
				int alt17=2;
				int LA17_0 = input.LA(1);
				if ( (LA17_0=='\n'||LA17_0=='\r') ) {
					alt17=2;
				}
				else if ( ((LA17_0 >= '\u0000' && LA17_0 <= '\t')||(LA17_0 >= '\u000B' && LA17_0 <= '\f')||(LA17_0 >= '\u000E' && LA17_0 <= '\uFFFF')) ) {
					alt17=1;
				}

				switch (alt17) {
				case 1 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1556:21: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop17;
				}
			}

			if ( input.LA(1)=='\n'||input.LA(1)=='\r' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			 _channel = HIDDEN; 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT"

	// $ANTLR start "MULTILINE_COMMENT"
	public final void mMULTILINE_COMMENT() throws RecognitionException {
		try {
			int _type = MULTILINE_COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1560:5: ( '/*' ( . )* '*/' )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1560:7: '/*' ( . )* '*/'
			{
			match("/*"); 

			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1560:12: ( . )*
			loop18:
			while (true) {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( (LA18_0=='*') ) {
					int LA18_1 = input.LA(2);
					if ( (LA18_1=='/') ) {
						alt18=2;
					}
					else if ( ((LA18_1 >= '\u0000' && LA18_1 <= '.')||(LA18_1 >= '0' && LA18_1 <= '\uFFFF')) ) {
						alt18=1;
					}

				}
				else if ( ((LA18_0 >= '\u0000' && LA18_0 <= ')')||(LA18_0 >= '+' && LA18_0 <= '\uFFFF')) ) {
					alt18=1;
				}

				switch (alt18) {
				case 1 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1560:12: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop18;
				}
			}

			match("*/"); 

			 _channel = HIDDEN; 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MULTILINE_COMMENT"

	@Override
	public void mTokens() throws RecognitionException {
		// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1:8: ( T__154 | T__155 | T__156 | T__157 | T__158 | T__159 | T__160 | T__161 | T__162 | T__163 | T__164 | T__165 | T__166 | T__167 | T__168 | T__169 | T__170 | T__171 | T__172 | T__173 | K_TRAVEL | K_VERTEX | K_REPEAT | K_UNTIL | K_CONT | K_THROUGH | K_EDGE | K_SELECT | K_FROM | K_AS | K_WHERE | K_AND | K_KEY | K_KEYS | K_INSERT | K_UPDATE | K_WITH | K_LIMIT | K_USING | K_USE | K_DISTINCT | K_COUNT | K_SET | K_BEGIN | K_UNLOGGED | K_BATCH | K_APPLY | K_TRUNCATE | K_DELETE | K_IN | K_CREATE | K_KEYSPACE | K_KEYSPACES | K_COLUMNFAMILY | K_INDEX | K_CUSTOM | K_ON | K_TO | K_DROP | K_PRIMARY | K_INTO | K_VALUES | K_TIMESTAMP | K_TTL | K_ALTER | K_RENAME | K_ADD | K_TYPE | K_COMPACT | K_STORAGE | K_ORDER | K_BY | K_ASC | K_DESC | K_ALLOW | K_FILTERING | K_IF | K_CONTAINS | K_GRANT | K_ALL | K_PERMISSION | K_PERMISSIONS | K_OF | K_REVOKE | K_MODIFY | K_AUTHORIZE | K_NORECURSIVE | K_USER | K_USERS | K_SUPERUSER | K_NOSUPERUSER | K_PASSWORD | K_CLUSTERING | K_ASCII | K_BIGINT | K_BLOB | K_BOOLEAN | K_COUNTER | K_DECIMAL | K_DOUBLE | K_FLOAT | K_INET | K_INT | K_TEXT | K_UUID | K_VARCHAR | K_VARINT | K_TIMEUUID | K_TOKEN | K_WRITETIME | K_NULL | K_NOT | K_EXISTS | K_MAP | K_LIST | K_NAN | K_INFINITY | K_TUPLE | K_TRIGGER | K_STATIC | K_FROZEN | K_FUNCTION | K_RETURNS | K_LANGUAGE | K_NON | K_OR | K_REPLACE | K_DETERMINISTIC | STRING_LITERAL | QUOTED_NAME | INTEGER | QMARK | FLOAT | BOOLEAN | IDENT | HEXNUMBER | UUID | WS | COMMENT | MULTILINE_COMMENT )
		int alt19=140;
		alt19 = dfa19.predict(input);
		switch (alt19) {
			case 1 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1:10: T__154
				{
				mT__154(); 

				}
				break;
			case 2 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1:17: T__155
				{
				mT__155(); 

				}
				break;
			case 3 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1:24: T__156
				{
				mT__156(); 

				}
				break;
			case 4 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1:31: T__157
				{
				mT__157(); 

				}
				break;
			case 5 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1:38: T__158
				{
				mT__158(); 

				}
				break;
			case 6 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1:45: T__159
				{
				mT__159(); 

				}
				break;
			case 7 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1:52: T__160
				{
				mT__160(); 

				}
				break;
			case 8 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1:59: T__161
				{
				mT__161(); 

				}
				break;
			case 9 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1:66: T__162
				{
				mT__162(); 

				}
				break;
			case 10 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1:73: T__163
				{
				mT__163(); 

				}
				break;
			case 11 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1:80: T__164
				{
				mT__164(); 

				}
				break;
			case 12 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1:87: T__165
				{
				mT__165(); 

				}
				break;
			case 13 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1:94: T__166
				{
				mT__166(); 

				}
				break;
			case 14 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1:101: T__167
				{
				mT__167(); 

				}
				break;
			case 15 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1:108: T__168
				{
				mT__168(); 

				}
				break;
			case 16 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1:115: T__169
				{
				mT__169(); 

				}
				break;
			case 17 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1:122: T__170
				{
				mT__170(); 

				}
				break;
			case 18 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1:129: T__171
				{
				mT__171(); 

				}
				break;
			case 19 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1:136: T__172
				{
				mT__172(); 

				}
				break;
			case 20 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1:143: T__173
				{
				mT__173(); 

				}
				break;
			case 21 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1:150: K_TRAVEL
				{
				mK_TRAVEL(); 

				}
				break;
			case 22 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1:159: K_VERTEX
				{
				mK_VERTEX(); 

				}
				break;
			case 23 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1:168: K_REPEAT
				{
				mK_REPEAT(); 

				}
				break;
			case 24 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1:177: K_UNTIL
				{
				mK_UNTIL(); 

				}
				break;
			case 25 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1:185: K_CONT
				{
				mK_CONT(); 

				}
				break;
			case 26 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1:192: K_THROUGH
				{
				mK_THROUGH(); 

				}
				break;
			case 27 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1:202: K_EDGE
				{
				mK_EDGE(); 

				}
				break;
			case 28 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1:209: K_SELECT
				{
				mK_SELECT(); 

				}
				break;
			case 29 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1:218: K_FROM
				{
				mK_FROM(); 

				}
				break;
			case 30 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1:225: K_AS
				{
				mK_AS(); 

				}
				break;
			case 31 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1:230: K_WHERE
				{
				mK_WHERE(); 

				}
				break;
			case 32 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1:238: K_AND
				{
				mK_AND(); 

				}
				break;
			case 33 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1:244: K_KEY
				{
				mK_KEY(); 

				}
				break;
			case 34 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1:250: K_KEYS
				{
				mK_KEYS(); 

				}
				break;
			case 35 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1:257: K_INSERT
				{
				mK_INSERT(); 

				}
				break;
			case 36 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1:266: K_UPDATE
				{
				mK_UPDATE(); 

				}
				break;
			case 37 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1:275: K_WITH
				{
				mK_WITH(); 

				}
				break;
			case 38 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1:282: K_LIMIT
				{
				mK_LIMIT(); 

				}
				break;
			case 39 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1:290: K_USING
				{
				mK_USING(); 

				}
				break;
			case 40 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1:298: K_USE
				{
				mK_USE(); 

				}
				break;
			case 41 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1:304: K_DISTINCT
				{
				mK_DISTINCT(); 

				}
				break;
			case 42 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1:315: K_COUNT
				{
				mK_COUNT(); 

				}
				break;
			case 43 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1:323: K_SET
				{
				mK_SET(); 

				}
				break;
			case 44 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1:329: K_BEGIN
				{
				mK_BEGIN(); 

				}
				break;
			case 45 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1:337: K_UNLOGGED
				{
				mK_UNLOGGED(); 

				}
				break;
			case 46 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1:348: K_BATCH
				{
				mK_BATCH(); 

				}
				break;
			case 47 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1:356: K_APPLY
				{
				mK_APPLY(); 

				}
				break;
			case 48 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1:364: K_TRUNCATE
				{
				mK_TRUNCATE(); 

				}
				break;
			case 49 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1:375: K_DELETE
				{
				mK_DELETE(); 

				}
				break;
			case 50 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1:384: K_IN
				{
				mK_IN(); 

				}
				break;
			case 51 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1:389: K_CREATE
				{
				mK_CREATE(); 

				}
				break;
			case 52 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1:398: K_KEYSPACE
				{
				mK_KEYSPACE(); 

				}
				break;
			case 53 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1:409: K_KEYSPACES
				{
				mK_KEYSPACES(); 

				}
				break;
			case 54 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1:421: K_COLUMNFAMILY
				{
				mK_COLUMNFAMILY(); 

				}
				break;
			case 55 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1:436: K_INDEX
				{
				mK_INDEX(); 

				}
				break;
			case 56 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1:444: K_CUSTOM
				{
				mK_CUSTOM(); 

				}
				break;
			case 57 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1:453: K_ON
				{
				mK_ON(); 

				}
				break;
			case 58 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1:458: K_TO
				{
				mK_TO(); 

				}
				break;
			case 59 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1:463: K_DROP
				{
				mK_DROP(); 

				}
				break;
			case 60 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1:470: K_PRIMARY
				{
				mK_PRIMARY(); 

				}
				break;
			case 61 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1:480: K_INTO
				{
				mK_INTO(); 

				}
				break;
			case 62 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1:487: K_VALUES
				{
				mK_VALUES(); 

				}
				break;
			case 63 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1:496: K_TIMESTAMP
				{
				mK_TIMESTAMP(); 

				}
				break;
			case 64 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1:508: K_TTL
				{
				mK_TTL(); 

				}
				break;
			case 65 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1:514: K_ALTER
				{
				mK_ALTER(); 

				}
				break;
			case 66 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1:522: K_RENAME
				{
				mK_RENAME(); 

				}
				break;
			case 67 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1:531: K_ADD
				{
				mK_ADD(); 

				}
				break;
			case 68 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1:537: K_TYPE
				{
				mK_TYPE(); 

				}
				break;
			case 69 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1:544: K_COMPACT
				{
				mK_COMPACT(); 

				}
				break;
			case 70 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1:554: K_STORAGE
				{
				mK_STORAGE(); 

				}
				break;
			case 71 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1:564: K_ORDER
				{
				mK_ORDER(); 

				}
				break;
			case 72 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1:572: K_BY
				{
				mK_BY(); 

				}
				break;
			case 73 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1:577: K_ASC
				{
				mK_ASC(); 

				}
				break;
			case 74 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1:583: K_DESC
				{
				mK_DESC(); 

				}
				break;
			case 75 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1:590: K_ALLOW
				{
				mK_ALLOW(); 

				}
				break;
			case 76 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1:598: K_FILTERING
				{
				mK_FILTERING(); 

				}
				break;
			case 77 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1:610: K_IF
				{
				mK_IF(); 

				}
				break;
			case 78 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1:615: K_CONTAINS
				{
				mK_CONTAINS(); 

				}
				break;
			case 79 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1:626: K_GRANT
				{
				mK_GRANT(); 

				}
				break;
			case 80 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1:634: K_ALL
				{
				mK_ALL(); 

				}
				break;
			case 81 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1:640: K_PERMISSION
				{
				mK_PERMISSION(); 

				}
				break;
			case 82 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1:653: K_PERMISSIONS
				{
				mK_PERMISSIONS(); 

				}
				break;
			case 83 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1:667: K_OF
				{
				mK_OF(); 

				}
				break;
			case 84 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1:672: K_REVOKE
				{
				mK_REVOKE(); 

				}
				break;
			case 85 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1:681: K_MODIFY
				{
				mK_MODIFY(); 

				}
				break;
			case 86 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1:690: K_AUTHORIZE
				{
				mK_AUTHORIZE(); 

				}
				break;
			case 87 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1:702: K_NORECURSIVE
				{
				mK_NORECURSIVE(); 

				}
				break;
			case 88 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1:716: K_USER
				{
				mK_USER(); 

				}
				break;
			case 89 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1:723: K_USERS
				{
				mK_USERS(); 

				}
				break;
			case 90 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1:731: K_SUPERUSER
				{
				mK_SUPERUSER(); 

				}
				break;
			case 91 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1:743: K_NOSUPERUSER
				{
				mK_NOSUPERUSER(); 

				}
				break;
			case 92 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1:757: K_PASSWORD
				{
				mK_PASSWORD(); 

				}
				break;
			case 93 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1:768: K_CLUSTERING
				{
				mK_CLUSTERING(); 

				}
				break;
			case 94 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1:781: K_ASCII
				{
				mK_ASCII(); 

				}
				break;
			case 95 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1:789: K_BIGINT
				{
				mK_BIGINT(); 

				}
				break;
			case 96 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1:798: K_BLOB
				{
				mK_BLOB(); 

				}
				break;
			case 97 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1:805: K_BOOLEAN
				{
				mK_BOOLEAN(); 

				}
				break;
			case 98 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1:815: K_COUNTER
				{
				mK_COUNTER(); 

				}
				break;
			case 99 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1:825: K_DECIMAL
				{
				mK_DECIMAL(); 

				}
				break;
			case 100 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1:835: K_DOUBLE
				{
				mK_DOUBLE(); 

				}
				break;
			case 101 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1:844: K_FLOAT
				{
				mK_FLOAT(); 

				}
				break;
			case 102 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1:852: K_INET
				{
				mK_INET(); 

				}
				break;
			case 103 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1:859: K_INT
				{
				mK_INT(); 

				}
				break;
			case 104 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1:865: K_TEXT
				{
				mK_TEXT(); 

				}
				break;
			case 105 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1:872: K_UUID
				{
				mK_UUID(); 

				}
				break;
			case 106 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1:879: K_VARCHAR
				{
				mK_VARCHAR(); 

				}
				break;
			case 107 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1:889: K_VARINT
				{
				mK_VARINT(); 

				}
				break;
			case 108 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1:898: K_TIMEUUID
				{
				mK_TIMEUUID(); 

				}
				break;
			case 109 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1:909: K_TOKEN
				{
				mK_TOKEN(); 

				}
				break;
			case 110 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1:917: K_WRITETIME
				{
				mK_WRITETIME(); 

				}
				break;
			case 111 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1:929: K_NULL
				{
				mK_NULL(); 

				}
				break;
			case 112 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1:936: K_NOT
				{
				mK_NOT(); 

				}
				break;
			case 113 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1:942: K_EXISTS
				{
				mK_EXISTS(); 

				}
				break;
			case 114 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1:951: K_MAP
				{
				mK_MAP(); 

				}
				break;
			case 115 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1:957: K_LIST
				{
				mK_LIST(); 

				}
				break;
			case 116 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1:964: K_NAN
				{
				mK_NAN(); 

				}
				break;
			case 117 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1:970: K_INFINITY
				{
				mK_INFINITY(); 

				}
				break;
			case 118 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1:981: K_TUPLE
				{
				mK_TUPLE(); 

				}
				break;
			case 119 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1:989: K_TRIGGER
				{
				mK_TRIGGER(); 

				}
				break;
			case 120 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1:999: K_STATIC
				{
				mK_STATIC(); 

				}
				break;
			case 121 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1:1008: K_FROZEN
				{
				mK_FROZEN(); 

				}
				break;
			case 122 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1:1017: K_FUNCTION
				{
				mK_FUNCTION(); 

				}
				break;
			case 123 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1:1028: K_RETURNS
				{
				mK_RETURNS(); 

				}
				break;
			case 124 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1:1038: K_LANGUAGE
				{
				mK_LANGUAGE(); 

				}
				break;
			case 125 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1:1049: K_NON
				{
				mK_NON(); 

				}
				break;
			case 126 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1:1055: K_OR
				{
				mK_OR(); 

				}
				break;
			case 127 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1:1060: K_REPLACE
				{
				mK_REPLACE(); 

				}
				break;
			case 128 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1:1070: K_DETERMINISTIC
				{
				mK_DETERMINISTIC(); 

				}
				break;
			case 129 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1:1086: STRING_LITERAL
				{
				mSTRING_LITERAL(); 

				}
				break;
			case 130 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1:1101: QUOTED_NAME
				{
				mQUOTED_NAME(); 

				}
				break;
			case 131 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1:1113: INTEGER
				{
				mINTEGER(); 

				}
				break;
			case 132 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1:1121: QMARK
				{
				mQMARK(); 

				}
				break;
			case 133 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1:1127: FLOAT
				{
				mFLOAT(); 

				}
				break;
			case 134 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1:1133: BOOLEAN
				{
				mBOOLEAN(); 

				}
				break;
			case 135 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1:1141: IDENT
				{
				mIDENT(); 

				}
				break;
			case 136 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1:1147: HEXNUMBER
				{
				mHEXNUMBER(); 

				}
				break;
			case 137 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1:1157: UUID
				{
				mUUID(); 

				}
				break;
			case 138 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1:1162: WS
				{
				mWS(); 

				}
				break;
			case 139 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1:1165: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 140 :
				// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1:1173: MULTILINE_COMMENT
				{
				mMULTILINE_COMMENT(); 

				}
				break;

		}
	}


	protected DFA11 dfa11 = new DFA11(this);
	protected DFA19 dfa19 = new DFA19(this);
	static final String DFA11_eotS =
		"\5\uffff";
	static final String DFA11_eofS =
		"\5\uffff";
	static final String DFA11_minS =
		"\1\55\1\60\1\56\2\uffff";
	static final String DFA11_maxS =
		"\2\71\1\145\2\uffff";
	static final String DFA11_acceptS =
		"\3\uffff\1\1\1\2";
	static final String DFA11_specialS =
		"\5\uffff}>";
	static final String[] DFA11_transitionS = {
			"\1\1\2\uffff\12\2",
			"\12\2",
			"\1\4\1\uffff\12\2\13\uffff\1\3\37\uffff\1\3",
			"",
			""
	};

	static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
	static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
	static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
	static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
	static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
	static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
	static final short[][] DFA11_transition;

	static {
		int numStates = DFA11_transitionS.length;
		DFA11_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
		}
	}

	protected class DFA11 extends DFA {

		public DFA11(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 11;
			this.eot = DFA11_eot;
			this.eof = DFA11_eof;
			this.min = DFA11_min;
			this.max = DFA11_max;
			this.accept = DFA11_accept;
			this.special = DFA11_special;
			this.transition = DFA11_transition;
		}
		@Override
		public String getDescription() {
			return "1523:1: FLOAT : ( INTEGER EXPONENT | INTEGER '.' ( DIGIT )* ( EXPONENT )? );";
		}
	}

	static final String DFA19_eotS =
		"\6\uffff\1\57\1\uffff\1\62\1\uffff\1\64\1\uffff\1\66\5\uffff\24\52\2\uffff"+
		"\1\173\2\uffff\1\173\4\uffff\1\173\6\uffff\3\52\1\u0087\34\52\1\u00b0"+
		"\11\52\1\u00bc\1\u00c2\10\52\1\u00cf\3\52\1\u00d3\1\u00d4\1\u00d6\11\52"+
		"\1\uffff\1\173\5\uffff\5\52\1\uffff\2\52\1\u00ee\16\52\1\u00ff\14\52\1"+
		"\u010d\11\52\1\uffff\1\u0118\1\u011a\2\52\1\u011d\1\u011f\4\52\1\u0124"+
		"\1\uffff\2\52\1\u0128\2\52\1\uffff\14\52\1\uffff\3\52\2\uffff\1\52\1\uffff"+
		"\5\52\1\u0141\2\52\1\u0144\1\u0145\1\52\1\u0147\1\173\1\uffff\1\176\2"+
		"\52\1\u014d\5\52\1\uffff\1\u0154\1\u0155\16\52\1\uffff\1\u0164\1\u0166"+
		"\1\u0167\7\52\1\u0170\2\52\1\uffff\4\52\1\u0177\5\52\1\uffff\1\52\1\uffff"+
		"\2\52\1\uffff\1\52\1\uffff\2\52\1\u0183\1\52\1\uffff\1\u0185\2\52\1\uffff"+
		"\1\u0189\1\u018a\2\52\1\u018d\3\52\1\u0191\2\52\1\u0194\4\52\1\u0199\7"+
		"\52\1\uffff\2\52\2\uffff\1\u01a3\1\uffff\1\173\1\uffff\1\176\2\52\1\uffff"+
		"\2\52\1\u01ab\1\u01ac\2\52\2\uffff\1\u01af\11\52\1\u01b9\2\52\1\u01bc"+
		"\1\uffff\1\u01bd\2\uffff\1\52\1\u01bf\6\52\1\uffff\6\52\1\uffff\2\52\1"+
		"\u01cf\1\52\1\u014d\1\u01d1\1\u01d2\1\u01d3\1\u01d4\1\52\1\u01d6\1\uffff"+
		"\1\52\1\uffff\2\52\1\u01da\2\uffff\1\52\1\u01dc\1\uffff\3\52\1\uffff\2"+
		"\52\1\uffff\1\52\1\u01e3\1\u01e4\1\52\1\uffff\1\52\1\u01e7\3\52\1\u01eb"+
		"\3\52\1\uffff\1\173\1\uffff\1\176\1\u01f2\3\52\2\uffff\2\52\1\uffff\1"+
		"\u01f8\1\u01f9\1\52\1\u01fb\1\u01fc\1\52\1\u01fe\1\u01ff\1\52\1\uffff"+
		"\1\52\1\u0202\2\uffff\1\52\1\uffff\3\52\1\u0207\1\u0208\2\52\1\u020b\1"+
		"\u020c\1\u020d\1\52\1\u020f\1\52\1\u0211\1\52\1\uffff\1\52\4\uffff\1\52"+
		"\1\uffff\2\52\1\u0217\1\uffff\1\52\1\uffff\2\52\1\u021b\2\52\1\u021e\2"+
		"\uffff\1\u021f\1\52\1\uffff\3\52\1\uffff\1\u0224\2\52\1\173\1\uffff\1"+
		"\176\1\uffff\1\52\1\u022b\1\u022c\2\52\2\uffff\1\u022f\2\uffff\1\u0230"+
		"\2\uffff\1\u0231\1\52\1\uffff\1\52\1\u0234\1\52\1\u0236\2\uffff\2\52\3"+
		"\uffff\1\u0239\1\uffff\1\52\1\uffff\5\52\1\uffff\3\52\1\uffff\1\u0243"+
		"\1\52\2\uffff\1\u0245\1\u0246\2\52\1\uffff\2\52\1\173\1\uffff\1\176\1"+
		"\u024e\2\uffff\1\52\1\u0250\3\uffff\1\u0251\1\u0252\1\uffff\1\52\1\uffff"+
		"\2\52\1\uffff\2\52\1\u0257\2\52\1\u020d\1\u025b\1\u025c\1\u025d\1\uffff"+
		"\1\52\2\uffff\1\52\1\u0260\2\52\1\173\1\uffff\1\176\1\uffff\1\u0264\3"+
		"\uffff\2\52\1\u0267\1\u0268\1\uffff\1\u0269\1\u026a\1\u026b\3\uffff\2"+
		"\52\1\uffff\2\52\2\uffff\1\52\1\u0272\5\uffff\1\52\1\u0274\2\52\1\176"+
		"\1\52\1\uffff\1\52\1\uffff\1\u027b\1\u027c\1\u027d\1\176\1\u01ab\1\52"+
		"\3\uffff\1\176\1\u0281\1\176\1\uffff";
	static final String DFA19_eofS =
		"\u0282\uffff";
	static final String DFA19_minS =
		"\1\11\5\uffff\1\55\1\uffff\1\72\1\uffff\1\75\1\uffff\1\75\5\uffff\2\101"+
		"\1\105\1\116\2\60\1\103\2\60\1\110\1\105\1\106\1\101\2\60\1\106\1\101"+
		"\1\122\2\101\2\uffff\1\56\2\uffff\1\56\1\uffff\1\52\2\uffff\1\56\6\uffff"+
		"\1\101\1\122\1\102\1\60\1\115\1\114\1\120\1\130\1\120\1\122\1\114\1\116"+
		"\1\114\1\104\1\105\1\111\1\114\1\105\1\123\1\125\2\60\1\111\1\114\1\110"+
		"\1\101\1\120\1\117\1\114\1\117\1\116\2\60\1\104\1\120\1\114\1\60\1\124"+
		"\1\105\1\124\1\111\1\131\2\60\1\115\1\116\1\123\1\60\1\117\1\125\3\60"+
		"\1\107\2\117\3\60\1\111\1\122\1\123\1\101\1\104\1\120\1\116\1\114\1\116"+
		"\1\uffff\1\56\1\53\4\uffff\1\126\1\105\1\107\1\117\1\114\1\uffff\2\105"+
		"\1\60\1\105\1\124\1\114\1\124\1\125\1\103\1\105\1\101\1\117\1\125\1\111"+
		"\1\117\1\101\1\116\1\60\1\104\1\124\1\116\1\125\1\120\1\101\1\124\1\123"+
		"\1\60\1\105\1\123\1\105\1\60\1\105\1\122\1\124\1\105\1\115\1\124\1\101"+
		"\1\103\1\123\1\uffff\2\60\1\114\1\105\2\60\1\110\1\122\1\110\1\124\1\60"+
		"\1\uffff\2\105\1\60\1\124\1\111\1\uffff\1\111\1\124\1\107\1\124\1\105"+
		"\1\103\1\60\1\105\1\120\1\102\1\111\1\103\1\uffff\1\111\1\102\1\114\2"+
		"\uffff\1\105\1\uffff\2\115\1\123\1\116\1\111\1\60\1\105\1\125\2\60\1\114"+
		"\1\60\1\56\1\53\1\60\1\105\1\103\1\60\1\107\1\125\1\105\1\116\1\123\1"+
		"\uffff\2\60\3\105\1\110\1\116\2\101\1\115\1\113\1\122\1\114\1\107\1\124"+
		"\1\107\1\uffff\3\60\1\124\1\115\1\101\1\124\1\117\1\124\2\60\1\124\1\103"+
		"\1\uffff\1\115\1\101\1\111\1\122\1\60\2\105\2\124\1\105\1\uffff\1\111"+
		"\1\uffff\1\131\1\122\1\uffff\1\127\1\uffff\1\117\1\105\1\60\1\105\1\uffff"+
		"\1\60\1\122\1\130\1\uffff\2\60\1\116\1\124\1\60\1\125\1\111\1\124\1\60"+
		"\1\115\1\122\1\60\1\114\1\116\1\110\1\116\1\60\1\105\1\122\1\101\1\111"+
		"\1\127\1\124\1\106\1\uffff\1\103\1\120\2\uffff\1\60\1\uffff\1\56\1\53"+
		"\1\60\1\114\1\101\1\uffff\1\105\1\107\2\60\1\124\1\125\2\uffff\1\60\1"+
		"\130\1\123\1\101\2\124\1\103\2\105\1\116\1\60\1\107\1\105\1\60\1\uffff"+
		"\1\60\2\uffff\1\111\1\60\1\116\1\103\1\105\1\115\1\105\1\60\1\uffff\1"+
		"\123\1\124\1\101\1\107\1\103\1\125\1\uffff\1\116\1\122\1\60\1\111\5\60"+
		"\1\122\1\60\1\uffff\1\124\1\uffff\1\101\1\124\1\60\2\uffff\1\111\1\60"+
		"\1\uffff\1\101\1\116\1\105\1\uffff\1\101\1\115\1\uffff\1\105\2\60\1\124"+
		"\1\uffff\1\101\1\60\1\122\1\123\1\117\1\60\1\131\1\125\1\105\1\uffff\1"+
		"\56\1\53\2\60\1\124\1\122\1\110\2\uffff\1\101\1\111\1\uffff\2\60\1\122"+
		"\2\60\1\105\2\60\1\123\1\uffff\1\105\1\60\2\uffff\1\116\1\uffff\1\122"+
		"\1\106\1\124\2\60\1\122\4\60\1\105\1\60\1\123\1\60\1\111\1\uffff\1\117"+
		"\4\uffff\1\111\1\uffff\1\111\1\103\1\60\1\uffff\1\124\1\uffff\1\107\1"+
		"\103\1\60\1\114\1\111\1\60\2\uffff\1\60\1\116\1\uffff\1\131\1\123\1\122"+
		"\1\uffff\1\60\2\122\1\56\1\53\1\60\1\uffff\1\105\2\60\1\115\1\104\2\uffff"+
		"\1\60\2\uffff\1\60\2\uffff\1\60\1\104\1\uffff\1\123\1\60\1\101\1\60\2"+
		"\uffff\1\111\1\60\3\uffff\1\60\1\uffff\1\105\1\uffff\2\116\1\132\1\115"+
		"\1\105\1\uffff\1\131\1\105\1\124\1\uffff\1\60\1\116\2\uffff\2\60\1\111"+
		"\1\104\1\uffff\1\123\1\125\1\56\1\53\2\60\2\uffff\1\120\1\60\3\uffff\2"+
		"\60\1\uffff\1\115\1\uffff\1\116\1\55\1\uffff\1\122\1\107\1\60\2\105\4"+
		"\60\1\uffff\1\111\2\uffff\1\117\1\60\1\111\1\123\1\55\1\53\1\55\1\uffff"+
		"\1\60\3\uffff\1\111\1\107\2\60\1\uffff\3\60\3\uffff\1\123\1\116\1\uffff"+
		"\1\126\1\105\1\60\1\uffff\1\114\1\60\5\uffff\1\124\1\60\1\105\1\122\1"+
		"\60\1\131\1\uffff\1\111\1\uffff\5\60\1\103\3\uffff\2\60\1\55\1\uffff";
	static final String DFA19_maxS =
		"\1\175\5\uffff\1\71\1\uffff\1\72\1\uffff\1\75\1\uffff\1\75\5\uffff\1\171"+
		"\2\145\2\165\1\170\3\165\1\162\1\145\1\156\1\151\1\162\1\171\3\162\1\157"+
		"\1\165\2\uffff\1\170\2\uffff\1\146\1\uffff\1\57\2\uffff\1\145\6\uffff"+
		"\1\165\1\162\1\142\1\172\1\155\1\154\1\160\1\170\1\160\2\162\1\166\1\164"+
		"\1\144\2\151\1\165\1\145\1\163\1\165\1\146\1\147\1\151\1\164\1\150\1\157"+
		"\1\160\1\157\1\154\1\157\1\156\1\154\1\172\1\144\1\160\1\164\1\146\1\164"+
		"\1\145\1\164\1\151\1\171\2\172\1\163\1\156\1\163\1\164\1\157\1\165\1\147"+
		"\1\164\1\172\1\147\2\157\3\172\1\151\1\162\1\163\1\141\1\144\1\160\1\164"+
		"\1\154\1\156\1\uffff\2\146\4\uffff\1\166\1\156\1\147\1\157\1\154\1\uffff"+
		"\2\145\1\172\1\145\1\164\1\154\1\164\1\165\1\151\1\154\1\141\1\157\1\165"+
		"\1\151\1\157\1\141\1\156\1\172\1\144\1\164\1\156\1\165\1\160\1\141\1\164"+
		"\1\163\1\146\1\145\1\163\1\145\1\172\1\145\1\162\1\164\1\145\1\172\1\164"+
		"\1\141\1\143\1\163\1\uffff\2\172\1\154\1\145\2\172\1\150\1\162\1\150\1"+
		"\164\1\172\1\uffff\2\145\1\172\1\164\1\151\1\uffff\1\151\1\164\1\147\1"+
		"\164\1\145\1\143\1\151\1\145\1\160\1\142\1\151\1\143\1\uffff\1\151\1\142"+
		"\1\154\2\uffff\1\145\1\uffff\2\155\1\163\1\156\1\151\1\172\1\145\1\165"+
		"\2\172\1\154\1\172\3\146\1\145\1\143\1\172\1\147\1\165\1\145\1\156\1\165"+
		"\1\uffff\2\172\3\145\1\150\1\156\2\141\1\155\1\153\1\162\1\154\1\147\1"+
		"\164\1\147\1\uffff\3\172\1\164\1\155\1\141\1\164\1\157\1\164\1\146\1\172"+
		"\1\164\1\143\1\uffff\1\155\1\141\1\151\1\162\1\172\2\145\2\164\1\145\1"+
		"\uffff\1\151\1\uffff\1\171\1\162\1\uffff\1\167\1\uffff\1\157\1\145\1\172"+
		"\1\145\1\uffff\1\172\1\162\1\170\1\uffff\2\172\1\156\1\164\1\172\1\165"+
		"\1\151\1\164\1\172\1\155\1\162\1\172\1\154\1\156\1\150\1\156\1\172\1\145"+
		"\1\162\1\141\1\151\1\167\1\164\1\146\1\uffff\1\143\1\160\2\uffff\1\172"+
		"\1\uffff\3\146\1\154\1\141\1\uffff\1\145\1\147\2\172\1\164\1\165\2\uffff"+
		"\1\172\1\170\1\163\1\141\2\164\1\143\2\145\1\156\1\172\1\147\1\145\1\172"+
		"\1\uffff\1\172\2\uffff\1\151\1\172\1\156\1\143\1\145\1\155\1\145\1\146"+
		"\1\uffff\1\163\1\164\1\141\1\147\1\143\1\165\1\uffff\1\156\1\162\1\172"+
		"\1\151\5\172\1\162\1\172\1\uffff\1\164\1\uffff\1\141\1\164\1\172\2\uffff"+
		"\1\151\1\172\1\uffff\1\141\1\156\1\145\1\uffff\1\141\1\155\1\uffff\1\145"+
		"\2\172\1\164\1\uffff\1\141\1\172\1\162\1\163\1\157\1\172\1\171\1\165\1"+
		"\145\1\uffff\3\146\1\172\1\164\1\162\1\150\2\uffff\1\141\1\151\1\uffff"+
		"\2\172\1\162\2\172\1\145\2\172\1\163\1\uffff\1\145\1\172\2\uffff\1\156"+
		"\1\uffff\1\162\1\146\1\164\2\172\1\162\1\146\3\172\1\145\1\172\1\163\1"+
		"\172\1\151\1\uffff\1\157\4\uffff\1\151\1\uffff\1\151\1\143\1\172\1\uffff"+
		"\1\164\1\uffff\1\147\1\143\1\172\1\154\1\151\1\172\2\uffff\1\172\1\156"+
		"\1\uffff\1\171\1\163\1\162\1\uffff\1\172\2\162\3\146\1\uffff\1\145\2\172"+
		"\1\155\1\144\2\uffff\1\172\2\uffff\1\172\2\uffff\1\172\1\144\1\uffff\1"+
		"\163\1\172\1\141\1\172\2\uffff\1\151\1\146\3\uffff\1\172\1\uffff\1\145"+
		"\1\uffff\2\156\1\172\1\155\1\145\1\uffff\1\171\1\145\1\164\1\uffff\1\172"+
		"\1\156\2\uffff\2\172\1\151\1\144\1\uffff\1\163\1\165\3\146\1\172\2\uffff"+
		"\1\160\1\172\3\uffff\2\172\1\uffff\1\155\1\uffff\1\156\1\55\1\uffff\1"+
		"\162\1\147\1\172\2\145\4\172\1\uffff\1\151\2\uffff\1\157\1\172\1\151\1"+
		"\163\1\145\1\71\1\55\1\uffff\1\172\3\uffff\1\151\1\147\2\172\1\uffff\3"+
		"\172\3\uffff\1\163\1\156\1\uffff\1\166\1\145\1\146\1\uffff\1\154\1\172"+
		"\5\uffff\1\164\1\172\1\145\1\162\1\146\1\171\1\uffff\1\151\1\uffff\3\172"+
		"\1\146\1\172\1\143\3\uffff\1\146\1\172\1\55\1\uffff";
	static final String DFA19_acceptS =
		"\1\uffff\1\1\1\2\1\3\1\4\1\5\1\uffff\1\7\1\uffff\1\12\1\uffff\1\15\1\uffff"+
		"\1\20\1\21\1\22\1\23\1\24\24\uffff\1\u0081\1\u0082\1\uffff\1\u0084\1\u0087"+
		"\1\uffff\1\u008a\1\uffff\1\u008b\1\6\1\uffff\1\11\1\10\1\14\1\13\1\17"+
		"\1\16\104\uffff\1\u0083\2\uffff\1\u0085\1\u0088\1\u0089\1\u008c\5\uffff"+
		"\1\72\50\uffff\1\36\13\uffff\1\62\5\uffff\1\115\14\uffff\1\110\3\uffff"+
		"\1\71\1\176\1\uffff\1\123\27\uffff\1\100\20\uffff\1\50\15\uffff\1\53\12"+
		"\uffff\1\111\1\uffff\1\40\2\uffff\1\120\1\uffff\1\103\4\uffff\1\41\3\uffff"+
		"\1\147\30\uffff\1\162\2\uffff\1\160\1\175\1\uffff\1\164\5\uffff\1\u0086"+
		"\6\uffff\1\104\1\150\16\uffff\1\130\1\uffff\1\151\1\31\10\uffff\1\33\6"+
		"\uffff\1\35\13\uffff\1\45\1\uffff\1\42\3\uffff\1\75\1\146\2\uffff\1\163"+
		"\3\uffff\1\112\2\uffff\1\73\4\uffff\1\140\11\uffff\1\157\7\uffff\1\66"+
		"\1\155\2\uffff\1\166\11\uffff\1\30\2\uffff\1\47\1\131\1\uffff\1\52\17"+
		"\uffff\1\145\1\uffff\1\136\1\57\1\101\1\113\1\uffff\1\37\3\uffff\1\67"+
		"\1\uffff\1\46\6\uffff\1\54\1\56\2\uffff\1\107\3\uffff\1\117\6\uffff\1"+
		"\25\5\uffff\1\26\1\76\1\uffff\1\153\1\27\1\uffff\1\102\1\124\2\uffff\1"+
		"\44\4\uffff\1\63\1\70\2\uffff\1\161\1\34\1\64\1\uffff\1\170\1\uffff\1"+
		"\171\5\uffff\1\43\3\uffff\1\61\2\uffff\1\144\1\137\4\uffff\1\125\6\uffff"+
		"\1\167\1\32\2\uffff\1\152\1\177\1\173\2\uffff\1\142\1\uffff\1\105\2\uffff"+
		"\1\106\11\uffff\1\143\1\uffff\1\141\1\74\7\uffff\1\60\1\uffff\1\154\1"+
		"\55\1\116\4\uffff\1\172\3\uffff\1\165\1\174\1\51\2\uffff\1\134\3\uffff"+
		"\1\77\2\uffff\1\132\1\114\1\126\1\156\1\65\6\uffff\1\135\1\uffff\1\121"+
		"\6\uffff\1\122\1\127\1\133\3\uffff\1\u0080";
	static final String DFA19_specialS =
		"\u0282\uffff}>";
	static final String[] DFA19_transitionS = {
			"\2\54\2\uffff\1\54\22\uffff\1\54\1\1\1\47\4\uffff\1\46\1\2\1\3\1\16\1"+
			"\4\1\5\1\6\1\7\1\55\1\50\11\53\1\10\1\11\1\12\1\13\1\14\1\51\1\uffff"+
			"\1\32\1\40\1\26\1\37\1\27\1\31\1\43\1\52\1\35\1\52\1\34\1\36\1\44\1\45"+
			"\1\41\1\42\1\52\1\24\1\30\1\22\1\25\1\23\1\33\3\52\1\15\1\uffff\1\17"+
			"\3\uffff\1\32\1\40\1\26\1\37\1\27\1\31\1\43\1\52\1\35\1\52\1\34\1\36"+
			"\1\44\1\45\1\41\1\42\1\52\1\24\1\30\1\22\1\25\1\23\1\33\3\52\1\20\1\uffff"+
			"\1\21",
			"",
			"",
			"",
			"",
			"",
			"\1\56\2\uffff\12\60",
			"",
			"\1\61",
			"",
			"\1\63",
			"",
			"\1\65",
			"",
			"",
			"",
			"",
			"",
			"\1\71\3\uffff\1\76\2\uffff\1\70\1\73\5\uffff\1\72\2\uffff\1\67\1\uffff"+
			"\1\74\1\77\3\uffff\1\75\7\uffff\1\71\3\uffff\1\76\2\uffff\1\70\1\73\5"+
			"\uffff\1\72\2\uffff\1\67\1\uffff\1\74\1\77\3\uffff\1\75",
			"\1\101\3\uffff\1\100\33\uffff\1\101\3\uffff\1\100",
			"\1\102\37\uffff\1\102",
			"\1\103\1\uffff\1\104\2\uffff\1\105\1\uffff\1\106\30\uffff\1\103\1\uffff"+
			"\1\104\2\uffff\1\105\1\uffff\1\106",
			"\12\113\7\uffff\6\113\5\uffff\1\112\2\uffff\1\107\2\uffff\1\110\2\uffff"+
			"\1\111\13\uffff\6\113\5\uffff\1\112\2\uffff\1\107\2\uffff\1\110\2\uffff"+
			"\1\111",
			"\12\113\7\uffff\3\113\1\114\2\113\21\uffff\1\115\10\uffff\3\113\1\114"+
			"\2\113\21\uffff\1\115",
			"\1\117\1\uffff\1\116\16\uffff\1\120\1\121\15\uffff\1\117\1\uffff\1\116"+
			"\16\uffff\1\120\1\121",
			"\12\113\7\uffff\1\126\5\113\2\uffff\1\123\2\uffff\1\124\5\uffff\1\122"+
			"\2\uffff\1\125\13\uffff\1\126\5\113\2\uffff\1\123\2\uffff\1\124\5\uffff"+
			"\1\122\2\uffff\1\125",
			"\12\113\7\uffff\3\113\1\133\2\113\5\uffff\1\132\1\uffff\1\130\1\uffff"+
			"\1\131\2\uffff\1\127\1\uffff\1\134\13\uffff\3\113\1\133\2\113\5\uffff"+
			"\1\132\1\uffff\1\130\1\uffff\1\131\2\uffff\1\127\1\uffff\1\134",
			"\1\135\1\136\10\uffff\1\137\25\uffff\1\135\1\136\10\uffff\1\137",
			"\1\140\37\uffff\1\140",
			"\1\142\7\uffff\1\141\27\uffff\1\142\7\uffff\1\141",
			"\1\144\7\uffff\1\143\27\uffff\1\144\7\uffff\1\143",
			"\12\113\7\uffff\4\113\1\146\1\113\2\uffff\1\145\5\uffff\1\150\2\uffff"+
			"\1\147\16\uffff\4\113\1\146\1\113\2\uffff\1\145\5\uffff\1\150\2\uffff"+
			"\1\147",
			"\12\113\7\uffff\1\152\3\113\1\151\1\113\2\uffff\1\154\2\uffff\1\155"+
			"\2\uffff\1\156\11\uffff\1\153\7\uffff\1\152\3\113\1\151\1\113\2\uffff"+
			"\1\154\2\uffff\1\155\2\uffff\1\156\11\uffff\1\153",
			"\1\161\7\uffff\1\157\3\uffff\1\160\23\uffff\1\161\7\uffff\1\157\3\uffff"+
			"\1\160",
			"\1\164\3\uffff\1\163\14\uffff\1\162\16\uffff\1\164\3\uffff\1\163\14"+
			"\uffff\1\162",
			"\1\165\37\uffff\1\165",
			"\1\167\15\uffff\1\166\21\uffff\1\167\15\uffff\1\166",
			"\1\172\15\uffff\1\170\5\uffff\1\171\13\uffff\1\172\15\uffff\1\170\5"+
			"\uffff\1\171",
			"",
			"",
			"\1\176\1\uffff\12\174\7\uffff\4\u0080\1\175\1\u0080\21\uffff\1\177\10"+
			"\uffff\4\u0080\1\175\1\u0080\21\uffff\1\177",
			"",
			"",
			"\1\176\1\uffff\12\174\7\uffff\4\u0080\1\175\1\u0080\32\uffff\4\u0080"+
			"\1\175\1\u0080",
			"",
			"\1\u0081\4\uffff\1\56",
			"",
			"",
			"\1\176\1\uffff\12\60\13\uffff\1\176\37\uffff\1\176",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u0082\7\uffff\1\u0084\13\uffff\1\u0083\13\uffff\1\u0082\7\uffff\1"+
			"\u0084\13\uffff\1\u0083",
			"\1\u0085\37\uffff\1\u0085",
			"\1\u0086\37\uffff\1\u0086",
			"\12\52\7\uffff\12\52\1\u0088\17\52\4\uffff\1\52\1\uffff\12\52\1\u0088"+
			"\17\52",
			"\1\u0089\37\uffff\1\u0089",
			"\1\u008a\37\uffff\1\u008a",
			"\1\u008b\37\uffff\1\u008b",
			"\1\u008c\37\uffff\1\u008c",
			"\1\u008d\37\uffff\1\u008d",
			"\1\u008e\37\uffff\1\u008e",
			"\1\u008f\5\uffff\1\u0090\31\uffff\1\u008f\5\uffff\1\u0090",
			"\1\u0092\1\uffff\1\u0091\3\uffff\1\u0094\1\uffff\1\u0093\27\uffff\1"+
			"\u0092\1\uffff\1\u0091\3\uffff\1\u0094\1\uffff\1\u0093",
			"\1\u0096\7\uffff\1\u0095\27\uffff\1\u0096\7\uffff\1\u0095",
			"\1\u0097\37\uffff\1\u0097",
			"\1\u0099\3\uffff\1\u0098\33\uffff\1\u0099\3\uffff\1\u0098",
			"\1\u009a\37\uffff\1\u009a",
			"\1\u009d\1\u009e\1\u009b\6\uffff\1\u009c\26\uffff\1\u009d\1\u009e\1"+
			"\u009b\6\uffff\1\u009c",
			"\1\u009f\37\uffff\1\u009f",
			"\1\u00a0\37\uffff\1\u00a0",
			"\1\u00a1\37\uffff\1\u00a1",
			"\12\u00a2\7\uffff\6\u00a2\32\uffff\6\u00a2",
			"\12\u00a2\7\uffff\6\u00a2\1\u00a3\31\uffff\6\u00a2\1\u00a3",
			"\1\u00a4\37\uffff\1\u00a4",
			"\1\u00a5\7\uffff\1\u00a6\27\uffff\1\u00a5\7\uffff\1\u00a6",
			"\1\u00a7\37\uffff\1\u00a7",
			"\1\u00a9\15\uffff\1\u00a8\21\uffff\1\u00a9\15\uffff\1\u00a8",
			"\1\u00aa\37\uffff\1\u00aa",
			"\1\u00ab\37\uffff\1\u00ab",
			"\1\u00ac\37\uffff\1\u00ac",
			"\1\u00ad\37\uffff\1\u00ad",
			"\1\u00ae\37\uffff\1\u00ae",
			"\12\u00a2\7\uffff\6\u00a2\5\uffff\1\u00af\24\uffff\6\u00a2\5\uffff\1"+
			"\u00af",
			"\12\52\7\uffff\2\52\1\u00b1\27\52\4\uffff\1\52\1\uffff\2\52\1\u00b1"+
			"\27\52",
			"\1\u00b2\37\uffff\1\u00b2",
			"\1\u00b3\37\uffff\1\u00b3",
			"\1\u00b5\7\uffff\1\u00b4\27\uffff\1\u00b5\7\uffff\1\u00b4",
			"\12\u00a2\7\uffff\3\u00a2\1\u00b6\2\u00a2\32\uffff\3\u00a2\1\u00b6\2"+
			"\u00a2",
			"\1\u00b7\37\uffff\1\u00b7",
			"\1\u00b8\37\uffff\1\u00b8",
			"\1\u00b9\37\uffff\1\u00b9",
			"\1\u00ba\37\uffff\1\u00ba",
			"\1\u00bb\37\uffff\1\u00bb",
			"\12\52\7\uffff\3\52\1\u00be\1\u00c0\1\u00c1\14\52\1\u00bd\1\u00bf\6"+
			"\52\4\uffff\1\52\1\uffff\3\52\1\u00be\1\u00c0\1\u00c1\14\52\1\u00bd\1"+
			"\u00bf\6\52",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"\1\u00c3\5\uffff\1\u00c4\31\uffff\1\u00c3\5\uffff\1\u00c4",
			"\1\u00c5\37\uffff\1\u00c5",
			"\1\u00c6\37\uffff\1\u00c6",
			"\12\u00a2\7\uffff\2\u00a2\1\u00c9\3\u00a2\5\uffff\1\u00c7\6\uffff\1"+
			"\u00c8\1\u00ca\14\uffff\2\u00a2\1\u00c9\3\u00a2\5\uffff\1\u00c7\6\uffff"+
			"\1\u00c8\1\u00ca",
			"\1\u00cb\37\uffff\1\u00cb",
			"\1\u00cc\37\uffff\1\u00cc",
			"\12\u00a2\7\uffff\6\u00a2\1\u00cd\31\uffff\6\u00a2\1\u00cd",
			"\12\u00a2\7\uffff\6\u00a2\15\uffff\1\u00ce\14\uffff\6\u00a2\15\uffff"+
			"\1\u00ce",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"\1\u00d0\37\uffff\1\u00d0",
			"\1\u00d1\37\uffff\1\u00d1",
			"\1\u00d2\37\uffff\1\u00d2",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"\12\52\7\uffff\3\52\1\u00d5\26\52\4\uffff\1\52\1\uffff\3\52\1\u00d5"+
			"\26\52",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"\1\u00d7\37\uffff\1\u00d7",
			"\1\u00d8\37\uffff\1\u00d8",
			"\1\u00d9\37\uffff\1\u00d9",
			"\1\u00da\37\uffff\1\u00da",
			"\1\u00db\37\uffff\1\u00db",
			"\1\u00dc\37\uffff\1\u00dc",
			"\1\u00e0\3\uffff\1\u00dd\1\u00de\1\u00df\31\uffff\1\u00e0\3\uffff\1"+
			"\u00dd\1\u00de\1\u00df",
			"\1\u00e1\37\uffff\1\u00e1",
			"\1\u00e2\37\uffff\1\u00e2",
			"",
			"\1\176\1\uffff\12\u00e3\7\uffff\4\u0080\1\u00e4\1\u0080\32\uffff\4\u0080"+
			"\1\u00e4\1\u0080",
			"\1\176\1\uffff\1\176\2\uffff\12\u00e5\7\uffff\6\u0080\32\uffff\6\u0080",
			"",
			"",
			"",
			"",
			"\1\u00e6\37\uffff\1\u00e6",
			"\1\u00e8\10\uffff\1\u00e7\26\uffff\1\u00e8\10\uffff\1\u00e7",
			"\1\u00e9\37\uffff\1\u00e9",
			"\1\u00ea\37\uffff\1\u00ea",
			"\1\u00eb\37\uffff\1\u00eb",
			"",
			"\1\u00ec\37\uffff\1\u00ec",
			"\1\u00ed\37\uffff\1\u00ed",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"\1\u00ef\37\uffff\1\u00ef",
			"\1\u00f0\37\uffff\1\u00f0",
			"\1\u00f1\37\uffff\1\u00f1",
			"\1\u00f2\37\uffff\1\u00f2",
			"\1\u00f3\37\uffff\1\u00f3",
			"\1\u00f4\5\uffff\1\u00f5\31\uffff\1\u00f4\5\uffff\1\u00f5",
			"\1\u00f6\6\uffff\1\u00f7\30\uffff\1\u00f6\6\uffff\1\u00f7",
			"\1\u00f8\37\uffff\1\u00f8",
			"\1\u00f9\37\uffff\1\u00f9",
			"\1\u00fa\37\uffff\1\u00fa",
			"\1\u00fb\37\uffff\1\u00fb",
			"\1\u00fc\37\uffff\1\u00fc",
			"\1\u00fd\37\uffff\1\u00fd",
			"\1\u00fe\37\uffff\1\u00fe",
			"\12\52\7\uffff\21\52\1\u0100\10\52\4\uffff\1\52\1\uffff\21\52\1\u0100"+
			"\10\52",
			"\1\u0101\37\uffff\1\u0101",
			"\1\u0102\37\uffff\1\u0102",
			"\1\u0103\37\uffff\1\u0103",
			"\1\u0104\37\uffff\1\u0104",
			"\1\u0105\37\uffff\1\u0105",
			"\1\u0106\37\uffff\1\u0106",
			"\1\u0107\37\uffff\1\u0107",
			"\1\u0108\37\uffff\1\u0108",
			"\12\u0109\7\uffff\6\u0109\32\uffff\6\u0109",
			"\1\u010a\37\uffff\1\u010a",
			"\1\u010b\37\uffff\1\u010b",
			"\1\u010c\37\uffff\1\u010c",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"\1\u010e\37\uffff\1\u010e",
			"\1\u010f\37\uffff\1\u010f",
			"\1\u0110\37\uffff\1\u0110",
			"\1\u0111\37\uffff\1\u0111",
			"\1\u0112\14\uffff\1\u0113\22\uffff\1\u0112\14\uffff\1\u0113",
			"\1\u0114\37\uffff\1\u0114",
			"\1\u0115\37\uffff\1\u0115",
			"\1\u0116\37\uffff\1\u0116",
			"\1\u0117\37\uffff\1\u0117",
			"",
			"\12\52\7\uffff\10\52\1\u0119\21\52\4\uffff\1\52\1\uffff\10\52\1\u0119"+
			"\21\52",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"\1\u011b\37\uffff\1\u011b",
			"\1\u011c\37\uffff\1\u011c",
			"\12\52\7\uffff\16\52\1\u011e\13\52\4\uffff\1\52\1\uffff\16\52\1\u011e"+
			"\13\52",
			"\12\u0109\7\uffff\6\u0109\24\52\4\uffff\1\52\1\uffff\6\u0109\24\52",
			"\1\u0120\37\uffff\1\u0120",
			"\1\u0121\37\uffff\1\u0121",
			"\1\u0122\37\uffff\1\u0122",
			"\1\u0123\37\uffff\1\u0123",
			"\12\52\7\uffff\22\52\1\u0125\7\52\4\uffff\1\52\1\uffff\22\52\1\u0125"+
			"\7\52",
			"",
			"\1\u0126\37\uffff\1\u0126",
			"\1\u0127\37\uffff\1\u0127",
			"\12\52\7\uffff\16\52\1\u0129\13\52\4\uffff\1\52\1\uffff\16\52\1\u0129"+
			"\13\52",
			"\1\u012a\37\uffff\1\u012a",
			"\1\u012b\37\uffff\1\u012b",
			"",
			"\1\u012c\37\uffff\1\u012c",
			"\1\u012d\37\uffff\1\u012d",
			"\1\u012e\37\uffff\1\u012e",
			"\1\u012f\37\uffff\1\u012f",
			"\1\u0130\37\uffff\1\u0130",
			"\1\u0131\37\uffff\1\u0131",
			"\12\u0109\7\uffff\6\u0109\2\uffff\1\u0132\27\uffff\6\u0109\2\uffff\1"+
			"\u0132",
			"\1\u0133\37\uffff\1\u0133",
			"\1\u0134\37\uffff\1\u0134",
			"\1\u0135\37\uffff\1\u0135",
			"\1\u0136\37\uffff\1\u0136",
			"\1\u0137\37\uffff\1\u0137",
			"",
			"\1\u0138\37\uffff\1\u0138",
			"\1\u0139\37\uffff\1\u0139",
			"\1\u013a\37\uffff\1\u013a",
			"",
			"",
			"\1\u013b\37\uffff\1\u013b",
			"",
			"\1\u013c\37\uffff\1\u013c",
			"\1\u013d\37\uffff\1\u013d",
			"\1\u013e\37\uffff\1\u013e",
			"\1\u013f\37\uffff\1\u013f",
			"\1\u0140\37\uffff\1\u0140",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"\1\u0142\37\uffff\1\u0142",
			"\1\u0143\37\uffff\1\u0143",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"\1\u0146\37\uffff\1\u0146",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"\1\176\1\uffff\12\u0148\7\uffff\4\u0080\1\u0149\1\u0080\32\uffff\4\u0080"+
			"\1\u0149\1\u0080",
			"\1\176\1\uffff\1\176\2\uffff\12\u014a\7\uffff\6\u0080\32\uffff\6\u0080",
			"\12\u014a\7\uffff\6\u0080\32\uffff\6\u0080",
			"\1\u014b\37\uffff\1\u014b",
			"\1\u014c\37\uffff\1\u014c",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"\1\u014e\37\uffff\1\u014e",
			"\1\u014f\37\uffff\1\u014f",
			"\1\u0150\37\uffff\1\u0150",
			"\1\u0151\37\uffff\1\u0151",
			"\1\u0152\1\uffff\1\u0153\35\uffff\1\u0152\1\uffff\1\u0153",
			"",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"\1\u0156\37\uffff\1\u0156",
			"\1\u0157\37\uffff\1\u0157",
			"\1\u0158\37\uffff\1\u0158",
			"\1\u0159\37\uffff\1\u0159",
			"\1\u015a\37\uffff\1\u015a",
			"\1\u015b\37\uffff\1\u015b",
			"\1\u015c\37\uffff\1\u015c",
			"\1\u015d\37\uffff\1\u015d",
			"\1\u015e\37\uffff\1\u015e",
			"\1\u015f\37\uffff\1\u015f",
			"\1\u0160\37\uffff\1\u0160",
			"\1\u0161\37\uffff\1\u0161",
			"\1\u0162\37\uffff\1\u0162",
			"\1\u0163\37\uffff\1\u0163",
			"",
			"\12\52\7\uffff\22\52\1\u0165\7\52\4\uffff\1\52\1\uffff\22\52\1\u0165"+
			"\7\52",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"\12\52\7\uffff\1\u0168\31\52\4\uffff\1\52\1\uffff\1\u0168\31\52",
			"\1\u0169\37\uffff\1\u0169",
			"\1\u016a\37\uffff\1\u016a",
			"\1\u016b\37\uffff\1\u016b",
			"\1\u016c\37\uffff\1\u016c",
			"\1\u016d\37\uffff\1\u016d",
			"\1\u016e\37\uffff\1\u016e",
			"\12\u016f\7\uffff\6\u016f\32\uffff\6\u016f",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"\1\u0171\37\uffff\1\u0171",
			"\1\u0172\37\uffff\1\u0172",
			"",
			"\1\u0173\37\uffff\1\u0173",
			"\1\u0174\37\uffff\1\u0174",
			"\1\u0175\37\uffff\1\u0175",
			"\1\u0176\37\uffff\1\u0176",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"\1\u0178\37\uffff\1\u0178",
			"\1\u0179\37\uffff\1\u0179",
			"\1\u017a\37\uffff\1\u017a",
			"\1\u017b\37\uffff\1\u017b",
			"\1\u017c\37\uffff\1\u017c",
			"",
			"\1\u017d\37\uffff\1\u017d",
			"",
			"\1\u017e\37\uffff\1\u017e",
			"\1\u017f\37\uffff\1\u017f",
			"",
			"\1\u0180\37\uffff\1\u0180",
			"",
			"\1\u0181\37\uffff\1\u0181",
			"\1\u0182\37\uffff\1\u0182",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"\1\u0184\37\uffff\1\u0184",
			"",
			"\12\52\7\uffff\17\52\1\u0186\12\52\4\uffff\1\52\1\uffff\17\52\1\u0186"+
			"\12\52",
			"\1\u0187\37\uffff\1\u0187",
			"\1\u0188\37\uffff\1\u0188",
			"",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"\1\u018b\37\uffff\1\u018b",
			"\1\u018c\37\uffff\1\u018c",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"\1\u018e\37\uffff\1\u018e",
			"\1\u018f\37\uffff\1\u018f",
			"\1\u0190\37\uffff\1\u0190",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"\1\u0192\37\uffff\1\u0192",
			"\1\u0193\37\uffff\1\u0193",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"\1\u0195\37\uffff\1\u0195",
			"\1\u0196\37\uffff\1\u0196",
			"\1\u0197\37\uffff\1\u0197",
			"\1\u0198\37\uffff\1\u0198",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"\1\u019a\37\uffff\1\u019a",
			"\1\u019b\37\uffff\1\u019b",
			"\1\u019c\37\uffff\1\u019c",
			"\1\u019d\37\uffff\1\u019d",
			"\1\u019e\37\uffff\1\u019e",
			"\1\u019f\37\uffff\1\u019f",
			"\1\u01a0\37\uffff\1\u01a0",
			"",
			"\1\u01a1\37\uffff\1\u01a1",
			"\1\u01a2\37\uffff\1\u01a2",
			"",
			"",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"",
			"\1\176\1\uffff\12\u01a4\7\uffff\4\u0080\1\u01a5\1\u0080\32\uffff\4\u0080"+
			"\1\u01a5\1\u0080",
			"\1\176\1\uffff\1\176\2\uffff\12\u01a6\7\uffff\6\u0080\32\uffff\6\u0080",
			"\12\u01a6\7\uffff\6\u0080\32\uffff\6\u0080",
			"\1\u01a7\37\uffff\1\u01a7",
			"\1\u01a8\37\uffff\1\u01a8",
			"",
			"\1\u01a9\37\uffff\1\u01a9",
			"\1\u01aa\37\uffff\1\u01aa",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"\1\u01ad\37\uffff\1\u01ad",
			"\1\u01ae\37\uffff\1\u01ae",
			"",
			"",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"\1\u01b0\37\uffff\1\u01b0",
			"\1\u01b1\37\uffff\1\u01b1",
			"\1\u01b2\37\uffff\1\u01b2",
			"\1\u01b3\37\uffff\1\u01b3",
			"\1\u01b4\37\uffff\1\u01b4",
			"\1\u01b5\37\uffff\1\u01b5",
			"\1\u01b6\37\uffff\1\u01b6",
			"\1\u01b7\37\uffff\1\u01b7",
			"\1\u01b8\37\uffff\1\u01b8",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"\1\u01ba\37\uffff\1\u01ba",
			"\1\u01bb\37\uffff\1\u01bb",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"",
			"",
			"\1\u01be\37\uffff\1\u01be",
			"\12\52\7\uffff\4\52\1\u01c0\25\52\4\uffff\1\52\1\uffff\4\52\1\u01c0"+
			"\25\52",
			"\1\u01c1\37\uffff\1\u01c1",
			"\1\u01c2\37\uffff\1\u01c2",
			"\1\u01c3\37\uffff\1\u01c3",
			"\1\u01c4\37\uffff\1\u01c4",
			"\1\u01c5\37\uffff\1\u01c5",
			"\12\u01c6\7\uffff\6\u01c6\32\uffff\6\u01c6",
			"",
			"\1\u01c7\37\uffff\1\u01c7",
			"\1\u01c8\37\uffff\1\u01c8",
			"\1\u01c9\37\uffff\1\u01c9",
			"\1\u01ca\37\uffff\1\u01ca",
			"\1\u01cb\37\uffff\1\u01cb",
			"\1\u01cc\37\uffff\1\u01cc",
			"",
			"\1\u01cd\37\uffff\1\u01cd",
			"\1\u01ce\37\uffff\1\u01ce",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"\1\u01d0\37\uffff\1\u01d0",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"\1\u01d5\37\uffff\1\u01d5",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"",
			"\1\u01d7\37\uffff\1\u01d7",
			"",
			"\1\u01d8\37\uffff\1\u01d8",
			"\1\u01d9\37\uffff\1\u01d9",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"",
			"",
			"\1\u01db\37\uffff\1\u01db",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"",
			"\1\u01dd\37\uffff\1\u01dd",
			"\1\u01de\37\uffff\1\u01de",
			"\1\u01df\37\uffff\1\u01df",
			"",
			"\1\u01e0\37\uffff\1\u01e0",
			"\1\u01e1\37\uffff\1\u01e1",
			"",
			"\1\u01e2\37\uffff\1\u01e2",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"\1\u01e5\37\uffff\1\u01e5",
			"",
			"\1\u01e6\37\uffff\1\u01e6",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"\1\u01e8\37\uffff\1\u01e8",
			"\1\u01e9\37\uffff\1\u01e9",
			"\1\u01ea\37\uffff\1\u01ea",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"\1\u01ec\37\uffff\1\u01ec",
			"\1\u01ed\37\uffff\1\u01ed",
			"\1\u01ee\37\uffff\1\u01ee",
			"",
			"\1\176\1\uffff\12\u01ef\7\uffff\4\u0080\1\u01f0\1\u0080\32\uffff\4\u0080"+
			"\1\u01f0\1\u0080",
			"\1\176\1\uffff\1\176\2\uffff\12\u01f1\7\uffff\6\u0080\32\uffff\6\u0080",
			"\12\u01f1\7\uffff\6\u0080\32\uffff\6\u0080",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"\1\u01f3\37\uffff\1\u01f3",
			"\1\u01f4\37\uffff\1\u01f4",
			"\1\u01f5\37\uffff\1\u01f5",
			"",
			"",
			"\1\u01f6\37\uffff\1\u01f6",
			"\1\u01f7\37\uffff\1\u01f7",
			"",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"\1\u01fa\37\uffff\1\u01fa",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"\1\u01fd\37\uffff\1\u01fd",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"\1\u0200\37\uffff\1\u0200",
			"",
			"\1\u0201\37\uffff\1\u0201",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"",
			"",
			"\1\u0203\37\uffff\1\u0203",
			"",
			"\1\u0204\37\uffff\1\u0204",
			"\1\u0205\37\uffff\1\u0205",
			"\1\u0206\37\uffff\1\u0206",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"\1\u0209\37\uffff\1\u0209",
			"\12\u020a\7\uffff\6\u020a\32\uffff\6\u020a",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"\1\u020e\37\uffff\1\u020e",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"\1\u0210\37\uffff\1\u0210",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"\1\u0212\37\uffff\1\u0212",
			"",
			"\1\u0213\37\uffff\1\u0213",
			"",
			"",
			"",
			"",
			"\1\u0214\37\uffff\1\u0214",
			"",
			"\1\u0215\37\uffff\1\u0215",
			"\1\u0216\37\uffff\1\u0216",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"",
			"\1\u0218\37\uffff\1\u0218",
			"",
			"\1\u0219\37\uffff\1\u0219",
			"\1\u021a\37\uffff\1\u021a",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"\1\u021c\37\uffff\1\u021c",
			"\1\u021d\37\uffff\1\u021d",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"",
			"",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"\1\u0220\37\uffff\1\u0220",
			"",
			"\1\u0221\37\uffff\1\u0221",
			"\1\u0222\37\uffff\1\u0222",
			"\1\u0223\37\uffff\1\u0223",
			"",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"\1\u0225\37\uffff\1\u0225",
			"\1\u0226\37\uffff\1\u0226",
			"\1\176\1\uffff\12\u0227\7\uffff\4\u0080\1\u0228\1\u0080\32\uffff\4\u0080"+
			"\1\u0228\1\u0080",
			"\1\176\1\uffff\1\176\2\uffff\12\u0229\7\uffff\6\u0080\32\uffff\6\u0080",
			"\12\u0229\7\uffff\6\u0080\32\uffff\6\u0080",
			"",
			"\1\u022a\37\uffff\1\u022a",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"\1\u022d\37\uffff\1\u022d",
			"\1\u022e\37\uffff\1\u022e",
			"",
			"",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"",
			"",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"",
			"",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"\1\u0232\37\uffff\1\u0232",
			"",
			"\1\u0233\37\uffff\1\u0233",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"\1\u0235\37\uffff\1\u0235",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"",
			"",
			"\1\u0237\37\uffff\1\u0237",
			"\12\u0238\7\uffff\6\u0238\32\uffff\6\u0238",
			"",
			"",
			"",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"",
			"\1\u023a\37\uffff\1\u023a",
			"",
			"\1\u023b\37\uffff\1\u023b",
			"\1\u023c\37\uffff\1\u023c",
			"\1\u023d\37\uffff\1\u023d",
			"\1\u023e\37\uffff\1\u023e",
			"\1\u023f\37\uffff\1\u023f",
			"",
			"\1\u0240\37\uffff\1\u0240",
			"\1\u0241\37\uffff\1\u0241",
			"\1\u0242\37\uffff\1\u0242",
			"",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"\1\u0244\37\uffff\1\u0244",
			"",
			"",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"\1\u0247\37\uffff\1\u0247",
			"\1\u0248\37\uffff\1\u0248",
			"",
			"\1\u0249\37\uffff\1\u0249",
			"\1\u024a\37\uffff\1\u024a",
			"\1\176\1\uffff\12\u024b\7\uffff\4\u0080\1\u024c\1\u0080\32\uffff\4\u0080"+
			"\1\u024c\1\u0080",
			"\1\176\1\uffff\1\176\2\uffff\12\u024d\7\uffff\6\u0080\32\uffff\6\u0080",
			"\12\u024d\7\uffff\6\u0080\32\uffff\6\u0080",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"",
			"",
			"\1\u024f\37\uffff\1\u024f",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"",
			"",
			"",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"",
			"\1\u0253\37\uffff\1\u0253",
			"",
			"\1\u0254\37\uffff\1\u0254",
			"\1\u0080",
			"",
			"\1\u0255\37\uffff\1\u0255",
			"\1\u0256\37\uffff\1\u0256",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"\1\u0258\37\uffff\1\u0258",
			"\1\u0259\37\uffff\1\u0259",
			"\12\52\7\uffff\22\52\1\u025a\7\52\4\uffff\1\52\1\uffff\22\52\1\u025a"+
			"\7\52",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"",
			"\1\u025e\37\uffff\1\u025e",
			"",
			"",
			"\1\u025f\37\uffff\1\u025f",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"\1\u0261\37\uffff\1\u0261",
			"\1\u0262\37\uffff\1\u0262",
			"\1\u0080\1\176\1\uffff\12\60\13\uffff\1\176\37\uffff\1\176",
			"\1\176\1\uffff\1\u0263\2\uffff\12\176",
			"\1\u0080",
			"",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"",
			"",
			"",
			"\1\u0265\37\uffff\1\u0265",
			"\1\u0266\37\uffff\1\u0266",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"",
			"",
			"",
			"\1\u026c\37\uffff\1\u026c",
			"\1\u026d\37\uffff\1\u026d",
			"",
			"\1\u026e\37\uffff\1\u026e",
			"\1\u026f\37\uffff\1\u026f",
			"\12\u0270\7\uffff\6\u0080\32\uffff\6\u0080",
			"",
			"\1\u0271\37\uffff\1\u0271",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"",
			"",
			"",
			"",
			"",
			"\1\u0273\37\uffff\1\u0273",
			"\12\52\7\uffff\22\52\1\u0275\7\52\4\uffff\1\52\1\uffff\22\52\1\u0275"+
			"\7\52",
			"\1\u0276\37\uffff\1\u0276",
			"\1\u0277\37\uffff\1\u0277",
			"\12\u0278\7\uffff\6\u0080\32\uffff\6\u0080",
			"\1\u0279\37\uffff\1\u0279",
			"",
			"\1\u027a\37\uffff\1\u027a",
			"",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"\12\u027e\7\uffff\6\u0080\32\uffff\6\u0080",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"\1\u027f\37\uffff\1\u027f",
			"",
			"",
			"",
			"\12\u0280\7\uffff\6\u0080\32\uffff\6\u0080",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"\1\u0080",
			""
	};

	static final short[] DFA19_eot = DFA.unpackEncodedString(DFA19_eotS);
	static final short[] DFA19_eof = DFA.unpackEncodedString(DFA19_eofS);
	static final char[] DFA19_min = DFA.unpackEncodedStringToUnsignedChars(DFA19_minS);
	static final char[] DFA19_max = DFA.unpackEncodedStringToUnsignedChars(DFA19_maxS);
	static final short[] DFA19_accept = DFA.unpackEncodedString(DFA19_acceptS);
	static final short[] DFA19_special = DFA.unpackEncodedString(DFA19_specialS);
	static final short[][] DFA19_transition;

	static {
		int numStates = DFA19_transitionS.length;
		DFA19_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA19_transition[i] = DFA.unpackEncodedString(DFA19_transitionS[i]);
		}
	}

	protected class DFA19 extends DFA {

		public DFA19(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 19;
			this.eot = DFA19_eot;
			this.eof = DFA19_eof;
			this.min = DFA19_min;
			this.max = DFA19_max;
			this.accept = DFA19_accept;
			this.special = DFA19_special;
			this.transition = DFA19_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__154 | T__155 | T__156 | T__157 | T__158 | T__159 | T__160 | T__161 | T__162 | T__163 | T__164 | T__165 | T__166 | T__167 | T__168 | T__169 | T__170 | T__171 | T__172 | T__173 | K_TRAVEL | K_VERTEX | K_REPEAT | K_UNTIL | K_CONT | K_THROUGH | K_EDGE | K_SELECT | K_FROM | K_AS | K_WHERE | K_AND | K_KEY | K_KEYS | K_INSERT | K_UPDATE | K_WITH | K_LIMIT | K_USING | K_USE | K_DISTINCT | K_COUNT | K_SET | K_BEGIN | K_UNLOGGED | K_BATCH | K_APPLY | K_TRUNCATE | K_DELETE | K_IN | K_CREATE | K_KEYSPACE | K_KEYSPACES | K_COLUMNFAMILY | K_INDEX | K_CUSTOM | K_ON | K_TO | K_DROP | K_PRIMARY | K_INTO | K_VALUES | K_TIMESTAMP | K_TTL | K_ALTER | K_RENAME | K_ADD | K_TYPE | K_COMPACT | K_STORAGE | K_ORDER | K_BY | K_ASC | K_DESC | K_ALLOW | K_FILTERING | K_IF | K_CONTAINS | K_GRANT | K_ALL | K_PERMISSION | K_PERMISSIONS | K_OF | K_REVOKE | K_MODIFY | K_AUTHORIZE | K_NORECURSIVE | K_USER | K_USERS | K_SUPERUSER | K_NOSUPERUSER | K_PASSWORD | K_CLUSTERING | K_ASCII | K_BIGINT | K_BLOB | K_BOOLEAN | K_COUNTER | K_DECIMAL | K_DOUBLE | K_FLOAT | K_INET | K_INT | K_TEXT | K_UUID | K_VARCHAR | K_VARINT | K_TIMEUUID | K_TOKEN | K_WRITETIME | K_NULL | K_NOT | K_EXISTS | K_MAP | K_LIST | K_NAN | K_INFINITY | K_TUPLE | K_TRIGGER | K_STATIC | K_FROZEN | K_FUNCTION | K_RETURNS | K_LANGUAGE | K_NON | K_OR | K_REPLACE | K_DETERMINISTIC | STRING_LITERAL | QUOTED_NAME | INTEGER | QMARK | FLOAT | BOOLEAN | IDENT | HEXNUMBER | UUID | WS | COMMENT | MULTILINE_COMMENT );";
		}
	}

}
