// $ANTLR 3.5.2 /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g 2014-10-08 17:02:54

    package org.apache.cassandra.cql3;

    import java.util.ArrayList;
    import java.util.Arrays;
    import java.util.Collections;
    import java.util.EnumSet;
    import java.util.HashSet;
    import java.util.HashMap;
    import java.util.LinkedHashMap;
    import java.util.List;
    import java.util.Map;
    import java.util.Set;

    import org.apache.cassandra.auth.Permission;
    import org.apache.cassandra.auth.DataResource;
    import org.apache.cassandra.auth.IResource;
    import org.apache.cassandra.cql3.*;
    import org.apache.cassandra.cql3.statements.*;
    import org.apache.cassandra.cql3.functions.*;
    import org.apache.cassandra.db.marshal.CollectionType;
    import org.apache.cassandra.exceptions.ConfigurationException;
    import org.apache.cassandra.exceptions.InvalidRequestException;
    import org.apache.cassandra.exceptions.SyntaxException;
    import org.apache.cassandra.utils.Pair;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class CqlParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "A", "B", "BOOLEAN", "C", "COMMENT", 
		"D", "DIGIT", "E", "EXPONENT", "F", "FLOAT", "G", "H", "HEX", "HEXNUMBER", 
		"I", "IDENT", "INTEGER", "J", "K", "K_ADD", "K_ALL", "K_ALLOW", "K_ALTER", 
		"K_AND", "K_APPLY", "K_AS", "K_ASC", "K_ASCII", "K_AUTHORIZE", "K_BATCH", 
		"K_BEGIN", "K_BIGINT", "K_BLOB", "K_BOOLEAN", "K_BY", "K_CLUSTERING", 
		"K_COLUMNFAMILY", "K_COMPACT", "K_CONT", "K_CONTAINS", "K_COUNT", "K_COUNTER", 
		"K_CREATE", "K_CUSTOM", "K_DECIMAL", "K_DELETE", "K_DESC", "K_DETERMINISTIC", 
		"K_DISTINCT", "K_DOUBLE", "K_DROP", "K_EDGE", "K_EXISTS", "K_FILTERING", 
		"K_FLOAT", "K_FROM", "K_FROZEN", "K_FUNCTION", "K_GRANT", "K_IF", "K_IN", 
		"K_INDEX", "K_INET", "K_INFINITY", "K_INSERT", "K_INT", "K_INTO", "K_KEY", 
		"K_KEYS", "K_KEYSPACE", "K_KEYSPACES", "K_LANGUAGE", "K_LIMIT", "K_LIST", 
		"K_MAP", "K_MODIFY", "K_NAN", "K_NON", "K_NORECURSIVE", "K_NOSUPERUSER", 
		"K_NOT", "K_NULL", "K_OF", "K_ON", "K_OR", "K_ORDER", "K_PASSWORD", "K_PERMISSION", 
		"K_PERMISSIONS", "K_PRIMARY", "K_RENAME", "K_REPEAT", "K_REPLACE", "K_RETURNS", 
		"K_REVOKE", "K_SELECT", "K_SET", "K_STATIC", "K_STORAGE", "K_SUPERUSER", 
		"K_TEXT", "K_THROUGH", "K_TIMESTAMP", "K_TIMEUUID", "K_TO", "K_TOKEN", 
		"K_TRAVEL", "K_TRIGGER", "K_TRUNCATE", "K_TTL", "K_TUPLE", "K_TYPE", "K_UNLOGGED", 
		"K_UNTIL", "K_UPDATE", "K_USE", "K_USER", "K_USERS", "K_USING", "K_UUID", 
		"K_VALUES", "K_VARCHAR", "K_VARINT", "K_VERTEX", "K_WHERE", "K_WITH", 
		"K_WRITETIME", "L", "LETTER", "M", "MULTILINE_COMMENT", "N", "O", "P", 
		"Q", "QMARK", "QUOTED_NAME", "R", "S", "STRING_LITERAL", "T", "U", "UUID", 
		"V", "W", "WS", "X", "Y", "Z", "'!='", "'('", "')'", "'+'", "','", "'-'", 
		"'.'", "':'", "'::'", "';'", "'<'", "'<='", "'='", "'>'", "'>='", "'['", 
		"'\\*'", "']'", "'{'", "'}'"
	};
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

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public CqlParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public CqlParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return CqlParser.tokenNames; }
	@Override public String getGrammarFileName() { return "/Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g"; }


	    private final List<ErrorListener> listeners = new ArrayList<ErrorListener>();
	    private final List<ColumnIdentifier> bindVariables = new ArrayList<ColumnIdentifier>();

	    public static final Set<String> reservedTypeNames = new HashSet<String>()
	    {{
	        add("byte");
	        add("smallint");
	        add("complex");
	        add("enum");
	        add("date");
	        add("interval");
	        add("macaddr");
	        add("bitstring");
	    }};

	    public AbstractMarker.Raw newBindVariables(ColumnIdentifier name)
	    {
	        AbstractMarker.Raw marker = new AbstractMarker.Raw(bindVariables.size());
	        bindVariables.add(name);
	        return marker;
	    }

	    public AbstractMarker.INRaw newINBindVariables(ColumnIdentifier name)
	    {
	        AbstractMarker.INRaw marker = new AbstractMarker.INRaw(bindVariables.size());
	        bindVariables.add(name);
	        return marker;
	    }

	    public Tuples.Raw newTupleBindVariables(ColumnIdentifier name)
	    {
	        Tuples.Raw marker = new Tuples.Raw(bindVariables.size());
	        bindVariables.add(name);
	        return marker;
	    }

	    public Tuples.INRaw newTupleINBindVariables(ColumnIdentifier name)
	    {
	        Tuples.INRaw marker = new Tuples.INRaw(bindVariables.size());
	        bindVariables.add(name);
	        return marker;
	    }

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

	    private void addRecognitionError(String msg)
	    {
	        for (int i = 0, m = listeners.size(); i < m; i++)
	            listeners.get(i).syntaxError(this, msg);
	    }

	    public Map<String, String> convertPropertyMap(Maps.Literal map)
	    {
	        if (map == null || map.entries == null || map.entries.isEmpty())
	            return Collections.<String, String>emptyMap();

	        Map<String, String> res = new HashMap<String, String>(map.entries.size());

	        for (Pair<Term.Raw, Term.Raw> entry : map.entries)
	        {
	            // Because the parser tries to be smart and recover on error (to
	            // allow displaying more than one error I suppose), we have null
	            // entries in there. Just skip those, a proper error will be thrown in the end.
	            if (entry.left == null || entry.right == null)
	                break;

	            if (!(entry.left instanceof Constants.Literal))
	            {
	                String msg = "Invalid property name: " + entry.left;
	                if (entry.left instanceof AbstractMarker.Raw)
	                    msg += " (bind variables are not supported in DDL queries)";
	                addRecognitionError(msg);
	                break;
	            }
	            if (!(entry.right instanceof Constants.Literal))
	            {
	                String msg = "Invalid property value: " + entry.right + " for property: " + entry.left;
	                if (entry.right instanceof AbstractMarker.Raw)
	                    msg += " (bind variables are not supported in DDL queries)";
	                addRecognitionError(msg);
	                break;
	            }

	            res.put(((Constants.Literal)entry.left).getRawText(), ((Constants.Literal)entry.right).getRawText());
	        }

	        return res;
	    }

	    public void addRawUpdate(List<Pair<ColumnIdentifier, Operation.RawUpdate>> operations, ColumnIdentifier key, Operation.RawUpdate update)
	    {
	        for (Pair<ColumnIdentifier, Operation.RawUpdate> p : operations)
	        {
	            if (p.left.equals(key) && !p.right.isCompatibleWith(update))
	                addRecognitionError("Multiple incompatible setting of column " + key);
	        }
	        operations.add(Pair.create(key, update));
	    }



	// $ANTLR start "query"
	// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:212:1: query returns [ParsedStatement stmnt] : st= cqlStatement ( ';' )* EOF ;
	public final ParsedStatement query() throws RecognitionException {
		ParsedStatement stmnt = null;


		ParsedStatement st =null;

		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:213:5: (st= cqlStatement ( ';' )* EOF )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:213:7: st= cqlStatement ( ';' )* EOF
			{
			pushFollow(FOLLOW_cqlStatement_in_query72);
			st=cqlStatement();
			state._fsp--;

			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:213:23: ( ';' )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==163) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:213:24: ';'
					{
					match(input,163,FOLLOW_163_in_query75); 
					}
					break;

				default :
					break loop1;
				}
			}

			match(input,EOF,FOLLOW_EOF_in_query79); 
			 stmnt = st; 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmnt;
	}
	// $ANTLR end "query"



	// $ANTLR start "cqlStatement"
	// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:216:1: cqlStatement returns [ParsedStatement stmt] : (st1= selectStatement |st2= insertStatement |st3= updateStatement |st4= batchStatement |st5= deleteStatement |st6= useStatement |st7= truncateStatement |st8= createKeyspaceStatement |st9= createTableStatement |st10= createIndexStatement |st11= dropKeyspaceStatement |st12= dropTableStatement |st13= dropIndexStatement |st14= alterTableStatement |st15= alterKeyspaceStatement |st16= grantStatement |st17= revokeStatement |st18= listPermissionsStatement |st19= createUserStatement |st20= alterUserStatement |st21= dropUserStatement |st22= listUsersStatement |st23= createTriggerStatement |st24= dropTriggerStatement |st25= createTypeStatement |st26= alterTypeStatement |st27= dropTypeStatement |st28= createFunctionStatement |st29= dropFunctionStatement |st30= travelStatement );
	public final ParsedStatement cqlStatement() throws RecognitionException {
		ParsedStatement stmt = null;


		SelectStatement.RawStatement st1 =null;
		UpdateStatement.ParsedInsert st2 =null;
		UpdateStatement.ParsedUpdate st3 =null;
		BatchStatement.Parsed st4 =null;
		DeleteStatement.Parsed st5 =null;
		UseStatement st6 =null;
		TruncateStatement st7 =null;
		CreateKeyspaceStatement st8 =null;
		CreateTableStatement.RawStatement st9 =null;
		CreateIndexStatement st10 =null;
		DropKeyspaceStatement st11 =null;
		DropTableStatement st12 =null;
		DropIndexStatement st13 =null;
		AlterTableStatement st14 =null;
		AlterKeyspaceStatement st15 =null;
		GrantStatement st16 =null;
		RevokeStatement st17 =null;
		ListPermissionsStatement st18 =null;
		CreateUserStatement st19 =null;
		AlterUserStatement st20 =null;
		DropUserStatement st21 =null;
		ListUsersStatement st22 =null;
		CreateTriggerStatement st23 =null;
		DropTriggerStatement st24 =null;
		CreateTypeStatement st25 =null;
		AlterTypeStatement st26 =null;
		DropTypeStatement st27 =null;
		CreateFunctionStatement st28 =null;
		DropFunctionStatement st29 =null;
		TravelStatement.RawStatement st30 =null;

		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:218:5: (st1= selectStatement |st2= insertStatement |st3= updateStatement |st4= batchStatement |st5= deleteStatement |st6= useStatement |st7= truncateStatement |st8= createKeyspaceStatement |st9= createTableStatement |st10= createIndexStatement |st11= dropKeyspaceStatement |st12= dropTableStatement |st13= dropIndexStatement |st14= alterTableStatement |st15= alterKeyspaceStatement |st16= grantStatement |st17= revokeStatement |st18= listPermissionsStatement |st19= createUserStatement |st20= alterUserStatement |st21= dropUserStatement |st22= listUsersStatement |st23= createTriggerStatement |st24= dropTriggerStatement |st25= createTypeStatement |st26= alterTypeStatement |st27= dropTypeStatement |st28= createFunctionStatement |st29= dropFunctionStatement |st30= travelStatement )
			int alt2=30;
			switch ( input.LA(1) ) {
			case K_SELECT:
				{
				alt2=1;
				}
				break;
			case K_INSERT:
				{
				alt2=2;
				}
				break;
			case K_UPDATE:
				{
				alt2=3;
				}
				break;
			case K_BEGIN:
				{
				alt2=4;
				}
				break;
			case K_DELETE:
				{
				alt2=5;
				}
				break;
			case K_USE:
				{
				alt2=6;
				}
				break;
			case K_TRUNCATE:
				{
				alt2=7;
				}
				break;
			case K_CREATE:
				{
				switch ( input.LA(2) ) {
				case K_KEYSPACE:
					{
					alt2=8;
					}
					break;
				case K_COLUMNFAMILY:
					{
					alt2=9;
					}
					break;
				case K_USER:
					{
					alt2=19;
					}
					break;
				case K_TRIGGER:
					{
					alt2=23;
					}
					break;
				case K_TYPE:
					{
					alt2=25;
					}
					break;
				case K_CUSTOM:
				case K_INDEX:
					{
					alt2=10;
					}
					break;
				case K_DETERMINISTIC:
				case K_FUNCTION:
				case K_NON:
				case K_OR:
					{
					alt2=28;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 2, 8, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case K_DROP:
				{
				switch ( input.LA(2) ) {
				case K_KEYSPACE:
					{
					alt2=11;
					}
					break;
				case K_COLUMNFAMILY:
					{
					alt2=12;
					}
					break;
				case K_INDEX:
					{
					alt2=13;
					}
					break;
				case K_USER:
					{
					alt2=21;
					}
					break;
				case K_TRIGGER:
					{
					alt2=24;
					}
					break;
				case K_TYPE:
					{
					alt2=27;
					}
					break;
				case K_FUNCTION:
					{
					alt2=29;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 2, 9, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case K_ALTER:
				{
				switch ( input.LA(2) ) {
				case K_COLUMNFAMILY:
					{
					alt2=14;
					}
					break;
				case K_KEYSPACE:
					{
					alt2=15;
					}
					break;
				case K_USER:
					{
					alt2=20;
					}
					break;
				case K_TYPE:
					{
					alt2=26;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 2, 10, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case K_GRANT:
				{
				alt2=16;
				}
				break;
			case K_REVOKE:
				{
				alt2=17;
				}
				break;
			case K_LIST:
				{
				int LA2_13 = input.LA(2);
				if ( (LA2_13==K_USERS) ) {
					alt2=22;
				}
				else if ( (LA2_13==K_ALL||LA2_13==K_ALTER||LA2_13==K_AUTHORIZE||LA2_13==K_CREATE||LA2_13==K_DROP||LA2_13==K_MODIFY||LA2_13==K_SELECT) ) {
					alt2=18;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 2, 13, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case K_TRAVEL:
				{
				alt2=30;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}
			switch (alt2) {
				case 1 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:218:7: st1= selectStatement
					{
					pushFollow(FOLLOW_selectStatement_in_cqlStatement113);
					st1=selectStatement();
					state._fsp--;

					 stmt = st1; 
					}
					break;
				case 2 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:219:7: st2= insertStatement
					{
					pushFollow(FOLLOW_insertStatement_in_cqlStatement138);
					st2=insertStatement();
					state._fsp--;

					 stmt = st2; 
					}
					break;
				case 3 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:220:7: st3= updateStatement
					{
					pushFollow(FOLLOW_updateStatement_in_cqlStatement163);
					st3=updateStatement();
					state._fsp--;

					 stmt = st3; 
					}
					break;
				case 4 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:221:7: st4= batchStatement
					{
					pushFollow(FOLLOW_batchStatement_in_cqlStatement188);
					st4=batchStatement();
					state._fsp--;

					 stmt = st4; 
					}
					break;
				case 5 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:222:7: st5= deleteStatement
					{
					pushFollow(FOLLOW_deleteStatement_in_cqlStatement214);
					st5=deleteStatement();
					state._fsp--;

					 stmt = st5; 
					}
					break;
				case 6 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:223:7: st6= useStatement
					{
					pushFollow(FOLLOW_useStatement_in_cqlStatement239);
					st6=useStatement();
					state._fsp--;

					 stmt = st6; 
					}
					break;
				case 7 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:224:7: st7= truncateStatement
					{
					pushFollow(FOLLOW_truncateStatement_in_cqlStatement267);
					st7=truncateStatement();
					state._fsp--;

					 stmt = st7; 
					}
					break;
				case 8 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:225:7: st8= createKeyspaceStatement
					{
					pushFollow(FOLLOW_createKeyspaceStatement_in_cqlStatement290);
					st8=createKeyspaceStatement();
					state._fsp--;

					 stmt = st8; 
					}
					break;
				case 9 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:226:7: st9= createTableStatement
					{
					pushFollow(FOLLOW_createTableStatement_in_cqlStatement307);
					st9=createTableStatement();
					state._fsp--;

					 stmt = st9; 
					}
					break;
				case 10 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:227:7: st10= createIndexStatement
					{
					pushFollow(FOLLOW_createIndexStatement_in_cqlStatement326);
					st10=createIndexStatement();
					state._fsp--;

					 stmt = st10; 
					}
					break;
				case 11 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:228:7: st11= dropKeyspaceStatement
					{
					pushFollow(FOLLOW_dropKeyspaceStatement_in_cqlStatement345);
					st11=dropKeyspaceStatement();
					state._fsp--;

					 stmt = st11; 
					}
					break;
				case 12 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:229:7: st12= dropTableStatement
					{
					pushFollow(FOLLOW_dropTableStatement_in_cqlStatement363);
					st12=dropTableStatement();
					state._fsp--;

					 stmt = st12; 
					}
					break;
				case 13 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:230:7: st13= dropIndexStatement
					{
					pushFollow(FOLLOW_dropIndexStatement_in_cqlStatement384);
					st13=dropIndexStatement();
					state._fsp--;

					 stmt = st13; 
					}
					break;
				case 14 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:231:7: st14= alterTableStatement
					{
					pushFollow(FOLLOW_alterTableStatement_in_cqlStatement405);
					st14=alterTableStatement();
					state._fsp--;

					 stmt = st14; 
					}
					break;
				case 15 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:232:7: st15= alterKeyspaceStatement
					{
					pushFollow(FOLLOW_alterKeyspaceStatement_in_cqlStatement425);
					st15=alterKeyspaceStatement();
					state._fsp--;

					 stmt = st15; 
					}
					break;
				case 16 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:233:7: st16= grantStatement
					{
					pushFollow(FOLLOW_grantStatement_in_cqlStatement442);
					st16=grantStatement();
					state._fsp--;

					 stmt = st16; 
					}
					break;
				case 17 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:234:7: st17= revokeStatement
					{
					pushFollow(FOLLOW_revokeStatement_in_cqlStatement467);
					st17=revokeStatement();
					state._fsp--;

					 stmt = st17; 
					}
					break;
				case 18 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:235:7: st18= listPermissionsStatement
					{
					pushFollow(FOLLOW_listPermissionsStatement_in_cqlStatement491);
					st18=listPermissionsStatement();
					state._fsp--;

					 stmt = st18; 
					}
					break;
				case 19 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:236:7: st19= createUserStatement
					{
					pushFollow(FOLLOW_createUserStatement_in_cqlStatement506);
					st19=createUserStatement();
					state._fsp--;

					 stmt = st19; 
					}
					break;
				case 20 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:237:7: st20= alterUserStatement
					{
					pushFollow(FOLLOW_alterUserStatement_in_cqlStatement526);
					st20=alterUserStatement();
					state._fsp--;

					 stmt = st20; 
					}
					break;
				case 21 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:238:7: st21= dropUserStatement
					{
					pushFollow(FOLLOW_dropUserStatement_in_cqlStatement547);
					st21=dropUserStatement();
					state._fsp--;

					 stmt = st21; 
					}
					break;
				case 22 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:239:7: st22= listUsersStatement
					{
					pushFollow(FOLLOW_listUsersStatement_in_cqlStatement569);
					st22=listUsersStatement();
					state._fsp--;

					 stmt = st22; 
					}
					break;
				case 23 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:240:7: st23= createTriggerStatement
					{
					pushFollow(FOLLOW_createTriggerStatement_in_cqlStatement590);
					st23=createTriggerStatement();
					state._fsp--;

					 stmt = st23; 
					}
					break;
				case 24 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:241:7: st24= dropTriggerStatement
					{
					pushFollow(FOLLOW_dropTriggerStatement_in_cqlStatement607);
					st24=dropTriggerStatement();
					state._fsp--;

					 stmt = st24; 
					}
					break;
				case 25 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:242:7: st25= createTypeStatement
					{
					pushFollow(FOLLOW_createTypeStatement_in_cqlStatement626);
					st25=createTypeStatement();
					state._fsp--;

					 stmt = st25; 
					}
					break;
				case 26 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:243:7: st26= alterTypeStatement
					{
					pushFollow(FOLLOW_alterTypeStatement_in_cqlStatement646);
					st26=alterTypeStatement();
					state._fsp--;

					 stmt = st26; 
					}
					break;
				case 27 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:244:7: st27= dropTypeStatement
					{
					pushFollow(FOLLOW_dropTypeStatement_in_cqlStatement667);
					st27=dropTypeStatement();
					state._fsp--;

					 stmt = st27; 
					}
					break;
				case 28 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:245:7: st28= createFunctionStatement
					{
					pushFollow(FOLLOW_createFunctionStatement_in_cqlStatement689);
					st28=createFunctionStatement();
					state._fsp--;

					 stmt = st28; 
					}
					break;
				case 29 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:246:7: st29= dropFunctionStatement
					{
					pushFollow(FOLLOW_dropFunctionStatement_in_cqlStatement705);
					st29=dropFunctionStatement();
					state._fsp--;

					 stmt = st29; 
					}
					break;
				case 30 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:247:7: st30= travelStatement
					{
					pushFollow(FOLLOW_travelStatement_in_cqlStatement724);
					st30=travelStatement();
					state._fsp--;

					 stmt = st30; 
					}
					break;

			}
			 if (stmt != null) stmt.setBoundVariables(bindVariables); 
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "cqlStatement"



	// $ANTLR start "useStatement"
	// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:253:1: useStatement returns [UseStatement stmt] : K_USE ks= keyspaceName ;
	public final UseStatement useStatement() throws RecognitionException {
		UseStatement stmt = null;


		String ks =null;

		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:254:5: ( K_USE ks= keyspaceName )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:254:7: K_USE ks= keyspaceName
			{
			match(input,K_USE,FOLLOW_K_USE_in_useStatement760); 
			pushFollow(FOLLOW_keyspaceName_in_useStatement764);
			ks=keyspaceName();
			state._fsp--;

			 stmt = new UseStatement(ks); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "useStatement"



	// $ANTLR start "travelStatement"
	// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:265:1: travelStatement returns [TravelStatement.RawStatement expr] : K_TRAVEL K_FROM startcf= columnFamilyName ( K_WHERE startwclause= whereClause )? ( K_REPEAT times= intValue )? throughClause[paths] ( throughClause[paths] )* ;
	public final TravelStatement.RawStatement travelStatement() throws RecognitionException {
		TravelStatement.RawStatement expr = null;


		CFName startcf =null;
		List<Relation> startwclause =null;
		Term.Raw times =null;


		        Term.Raw repeats = null;
				List<EdgeSelector> paths = new ArrayList<EdgeSelector>();		
		    
		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:270:5: ( K_TRAVEL K_FROM startcf= columnFamilyName ( K_WHERE startwclause= whereClause )? ( K_REPEAT times= intValue )? throughClause[paths] ( throughClause[paths] )* )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:270:7: K_TRAVEL K_FROM startcf= columnFamilyName ( K_WHERE startwclause= whereClause )? ( K_REPEAT times= intValue )? throughClause[paths] ( throughClause[paths] )*
			{
			match(input,K_TRAVEL,FOLLOW_K_TRAVEL_in_travelStatement798); 
			match(input,K_FROM,FOLLOW_K_FROM_in_travelStatement800); 
			pushFollow(FOLLOW_columnFamilyName_in_travelStatement804);
			startcf=columnFamilyName();
			state._fsp--;

			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:271:7: ( K_WHERE startwclause= whereClause )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==K_WHERE) ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:271:9: K_WHERE startwclause= whereClause
					{
					match(input,K_WHERE,FOLLOW_K_WHERE_in_travelStatement814); 
					pushFollow(FOLLOW_whereClause_in_travelStatement818);
					startwclause=whereClause();
					state._fsp--;

					}
					break;

			}

			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:272:7: ( K_REPEAT times= intValue )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==K_REPEAT) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:272:9: K_REPEAT times= intValue
					{
					match(input,K_REPEAT,FOLLOW_K_REPEAT_in_travelStatement832); 
					pushFollow(FOLLOW_intValue_in_travelStatement836);
					times=intValue();
					state._fsp--;

					 repeats = times; 
					}
					break;

			}

			pushFollow(FOLLOW_throughClause_in_travelStatement846);
			throughClause(paths);
			state._fsp--;

			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:273:25: ( throughClause[paths] )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==K_THROUGH) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:273:26: throughClause[paths]
					{
					pushFollow(FOLLOW_throughClause_in_travelStatement850);
					throughClause(paths);
					state._fsp--;

					}
					break;

				default :
					break loop5;
				}
			}


			        expr = new TravelStatement.RawStatement(startcf, startwclause, paths, repeats);
			      
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "travelStatement"



	// $ANTLR start "throughClause"
	// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:279:1: throughClause[List<EdgeSelector> paths] : K_THROUGH edgewclause= whereClause K_TO gocf= columnFamilyName ( K_WHERE endwclause= whereClause )? ;
	public final void throughClause(List<EdgeSelector> paths) throws RecognitionException {
		List<Relation> edgewclause =null;
		CFName gocf =null;
		List<Relation> endwclause =null;

		 EdgeSelector es = new EdgeSelector(); 
		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:281:2: ( K_THROUGH edgewclause= whereClause K_TO gocf= columnFamilyName ( K_WHERE endwclause= whereClause )? )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:281:4: K_THROUGH edgewclause= whereClause K_TO gocf= columnFamilyName ( K_WHERE endwclause= whereClause )?
			{
			match(input,K_THROUGH,FOLLOW_K_THROUGH_in_throughClause882); 
			pushFollow(FOLLOW_whereClause_in_throughClause886);
			edgewclause=whereClause();
			state._fsp--;

			 es.setEdgeWhere(edgewclause); 
			match(input,K_TO,FOLLOW_K_TO_in_throughClause896); 
			pushFollow(FOLLOW_columnFamilyName_in_throughClause900);
			gocf=columnFamilyName();
			state._fsp--;

			 es.setToCF(gocf); 
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:283:6: ( K_WHERE endwclause= whereClause )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==K_WHERE) ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:283:8: K_WHERE endwclause= whereClause
					{
					match(input,K_WHERE,FOLLOW_K_WHERE_in_throughClause911); 
					pushFollow(FOLLOW_whereClause_in_throughClause915);
					endwclause=whereClause();
					state._fsp--;

					 es.setEndWhere(endwclause); 
					}
					break;

			}


					paths.add(es);
				  
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
	// $ANTLR end "throughClause"



	// $ANTLR start "selectStatement"
	// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:316:1: selectStatement returns [SelectStatement.RawStatement expr] : K_SELECT ( ( K_DISTINCT )? sclause= selectClause | ( K_COUNT '(' sclause= selectCountClause ')' ( K_AS c= cident )? ) ) K_FROM cf= columnFamilyName ( K_WHERE wclause= whereClause )? ( K_ORDER K_BY orderByClause[orderings] ( ',' orderByClause[orderings] )* )? ( K_LIMIT rows= intValue )? ( K_ALLOW K_FILTERING )? ;
	public final SelectStatement.RawStatement selectStatement() throws RecognitionException {
		SelectStatement.RawStatement expr = null;


		List<RawSelector> sclause =null;
		ColumnIdentifier c =null;
		CFName cf =null;
		List<Relation> wclause =null;
		Term.Raw rows =null;


		        boolean isDistinct = false;
		        boolean isCount = false;
		        ColumnIdentifier countAlias = null;
		        Term.Raw limit = null;
		        Map<ColumnIdentifier, Boolean> orderings = new LinkedHashMap<ColumnIdentifier, Boolean>();
		        boolean allowFiltering = false;
		    
		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:325:5: ( K_SELECT ( ( K_DISTINCT )? sclause= selectClause | ( K_COUNT '(' sclause= selectCountClause ')' ( K_AS c= cident )? ) ) K_FROM cf= columnFamilyName ( K_WHERE wclause= whereClause )? ( K_ORDER K_BY orderByClause[orderings] ( ',' orderByClause[orderings] )* )? ( K_LIMIT rows= intValue )? ( K_ALLOW K_FILTERING )? )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:325:7: K_SELECT ( ( K_DISTINCT )? sclause= selectClause | ( K_COUNT '(' sclause= selectCountClause ')' ( K_AS c= cident )? ) ) K_FROM cf= columnFamilyName ( K_WHERE wclause= whereClause )? ( K_ORDER K_BY orderByClause[orderings] ( ',' orderByClause[orderings] )* )? ( K_LIMIT rows= intValue )? ( K_ALLOW K_FILTERING )?
			{
			match(input,K_SELECT,FOLLOW_K_SELECT_in_selectStatement960); 
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:325:16: ( ( K_DISTINCT )? sclause= selectClause | ( K_COUNT '(' sclause= selectCountClause ')' ( K_AS c= cident )? ) )
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==IDENT||LA9_0==K_ALL||LA9_0==K_AS||LA9_0==K_ASCII||(LA9_0 >= K_BIGINT && LA9_0 <= K_BOOLEAN)||LA9_0==K_CLUSTERING||LA9_0==K_COMPACT||LA9_0==K_CONTAINS||LA9_0==K_COUNTER||(LA9_0 >= K_CUSTOM && LA9_0 <= K_DECIMAL)||(LA9_0 >= K_DETERMINISTIC && LA9_0 <= K_DOUBLE)||(LA9_0 >= K_EXISTS && LA9_0 <= K_FLOAT)||LA9_0==K_FUNCTION||LA9_0==K_INET||LA9_0==K_INT||(LA9_0 >= K_KEY && LA9_0 <= K_KEYS)||(LA9_0 >= K_KEYSPACES && LA9_0 <= K_LANGUAGE)||(LA9_0 >= K_LIST && LA9_0 <= K_MAP)||LA9_0==K_NON||LA9_0==K_NOSUPERUSER||(LA9_0 >= K_PASSWORD && LA9_0 <= K_PERMISSIONS)||LA9_0==K_RETURNS||(LA9_0 >= K_STATIC && LA9_0 <= K_TEXT)||(LA9_0 >= K_TIMESTAMP && LA9_0 <= K_TIMEUUID)||LA9_0==K_TOKEN||LA9_0==K_TRIGGER||LA9_0==K_TTL||LA9_0==K_TYPE||(LA9_0 >= K_USER && LA9_0 <= K_USERS)||(LA9_0 >= K_UUID && LA9_0 <= K_VARINT)||LA9_0==K_WRITETIME||LA9_0==QUOTED_NAME||LA9_0==170) ) {
				alt9=1;
			}
			else if ( (LA9_0==K_COUNT) ) {
				int LA9_2 = input.LA(2);
				if ( (LA9_2==155) ) {
					alt9=2;
				}
				else if ( (LA9_2==K_AS||LA9_2==K_FROM||LA9_2==158||LA9_2==160) ) {
					alt9=1;
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

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}

			switch (alt9) {
				case 1 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:325:18: ( K_DISTINCT )? sclause= selectClause
					{
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:325:18: ( K_DISTINCT )?
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( (LA7_0==K_DISTINCT) ) {
						int LA7_1 = input.LA(2);
						if ( (LA7_1==IDENT||LA7_1==K_ALL||LA7_1==K_ASCII||(LA7_1 >= K_BIGINT && LA7_1 <= K_BOOLEAN)||LA7_1==K_CLUSTERING||LA7_1==K_COMPACT||(LA7_1 >= K_CONTAINS && LA7_1 <= K_COUNTER)||(LA7_1 >= K_CUSTOM && LA7_1 <= K_DECIMAL)||(LA7_1 >= K_DETERMINISTIC && LA7_1 <= K_DOUBLE)||(LA7_1 >= K_EXISTS && LA7_1 <= K_FLOAT)||LA7_1==K_FUNCTION||LA7_1==K_INET||LA7_1==K_INT||(LA7_1 >= K_KEY && LA7_1 <= K_KEYS)||(LA7_1 >= K_KEYSPACES && LA7_1 <= K_LANGUAGE)||(LA7_1 >= K_LIST && LA7_1 <= K_MAP)||LA7_1==K_NON||LA7_1==K_NOSUPERUSER||(LA7_1 >= K_PASSWORD && LA7_1 <= K_PERMISSIONS)||LA7_1==K_RETURNS||(LA7_1 >= K_STATIC && LA7_1 <= K_TEXT)||(LA7_1 >= K_TIMESTAMP && LA7_1 <= K_TIMEUUID)||LA7_1==K_TOKEN||LA7_1==K_TRIGGER||LA7_1==K_TTL||LA7_1==K_TYPE||(LA7_1 >= K_USER && LA7_1 <= K_USERS)||(LA7_1 >= K_UUID && LA7_1 <= K_VARINT)||LA7_1==K_WRITETIME||LA7_1==QUOTED_NAME||LA7_1==170) ) {
							alt7=1;
						}
						else if ( (LA7_1==K_AS) ) {
							int LA7_4 = input.LA(3);
							if ( (LA7_4==K_FROM||LA7_4==155||LA7_4==158||LA7_4==160||LA7_4==162) ) {
								alt7=1;
							}
							else if ( (LA7_4==K_AS) ) {
								int LA7_5 = input.LA(4);
								if ( (LA7_5==IDENT||LA7_5==K_ALL||LA7_5==K_AS||LA7_5==K_ASCII||(LA7_5 >= K_BIGINT && LA7_5 <= K_BOOLEAN)||LA7_5==K_CLUSTERING||LA7_5==K_COMPACT||(LA7_5 >= K_CONTAINS && LA7_5 <= K_COUNTER)||(LA7_5 >= K_CUSTOM && LA7_5 <= K_DECIMAL)||(LA7_5 >= K_DETERMINISTIC && LA7_5 <= K_DOUBLE)||(LA7_5 >= K_EXISTS && LA7_5 <= K_FLOAT)||LA7_5==K_FUNCTION||LA7_5==K_INET||LA7_5==K_INT||(LA7_5 >= K_KEY && LA7_5 <= K_KEYS)||(LA7_5 >= K_KEYSPACES && LA7_5 <= K_LANGUAGE)||(LA7_5 >= K_LIST && LA7_5 <= K_MAP)||LA7_5==K_NON||LA7_5==K_NOSUPERUSER||(LA7_5 >= K_PASSWORD && LA7_5 <= K_PERMISSIONS)||LA7_5==K_RETURNS||(LA7_5 >= K_STATIC && LA7_5 <= K_TEXT)||(LA7_5 >= K_TIMESTAMP && LA7_5 <= K_TIMEUUID)||LA7_5==K_TRIGGER||LA7_5==K_TTL||LA7_5==K_TYPE||(LA7_5 >= K_USER && LA7_5 <= K_USERS)||(LA7_5 >= K_UUID && LA7_5 <= K_VARINT)||LA7_5==K_WRITETIME||LA7_5==QUOTED_NAME) ) {
									alt7=1;
								}
							}
						}
					}
					switch (alt7) {
						case 1 :
							// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:325:20: K_DISTINCT
							{
							match(input,K_DISTINCT,FOLLOW_K_DISTINCT_in_selectStatement966); 
							 isDistinct = true; 
							}
							break;

					}

					pushFollow(FOLLOW_selectClause_in_selectStatement975);
					sclause=selectClause();
					state._fsp--;

					}
					break;
				case 2 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:326:18: ( K_COUNT '(' sclause= selectCountClause ')' ( K_AS c= cident )? )
					{
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:326:18: ( K_COUNT '(' sclause= selectCountClause ')' ( K_AS c= cident )? )
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:326:19: K_COUNT '(' sclause= selectCountClause ')' ( K_AS c= cident )?
					{
					match(input,K_COUNT,FOLLOW_K_COUNT_in_selectStatement995); 
					match(input,155,FOLLOW_155_in_selectStatement997); 
					pushFollow(FOLLOW_selectCountClause_in_selectStatement1001);
					sclause=selectCountClause();
					state._fsp--;

					match(input,156,FOLLOW_156_in_selectStatement1003); 
					 isCount = true; 
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:326:81: ( K_AS c= cident )?
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( (LA8_0==K_AS) ) {
						alt8=1;
					}
					switch (alt8) {
						case 1 :
							// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:326:82: K_AS c= cident
							{
							match(input,K_AS,FOLLOW_K_AS_in_selectStatement1008); 
							pushFollow(FOLLOW_cident_in_selectStatement1012);
							c=cident();
							state._fsp--;

							 countAlias = c; 
							}
							break;

					}

					}

					}
					break;

			}

			match(input,K_FROM,FOLLOW_K_FROM_in_selectStatement1027); 
			pushFollow(FOLLOW_columnFamilyName_in_selectStatement1031);
			cf=columnFamilyName();
			state._fsp--;

			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:328:7: ( K_WHERE wclause= whereClause )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==K_WHERE) ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:328:9: K_WHERE wclause= whereClause
					{
					match(input,K_WHERE,FOLLOW_K_WHERE_in_selectStatement1041); 
					pushFollow(FOLLOW_whereClause_in_selectStatement1045);
					wclause=whereClause();
					state._fsp--;

					}
					break;

			}

			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:329:7: ( K_ORDER K_BY orderByClause[orderings] ( ',' orderByClause[orderings] )* )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==K_ORDER) ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:329:9: K_ORDER K_BY orderByClause[orderings] ( ',' orderByClause[orderings] )*
					{
					match(input,K_ORDER,FOLLOW_K_ORDER_in_selectStatement1058); 
					match(input,K_BY,FOLLOW_K_BY_in_selectStatement1060); 
					pushFollow(FOLLOW_orderByClause_in_selectStatement1062);
					orderByClause(orderings);
					state._fsp--;

					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:329:47: ( ',' orderByClause[orderings] )*
					loop11:
					while (true) {
						int alt11=2;
						int LA11_0 = input.LA(1);
						if ( (LA11_0==158) ) {
							alt11=1;
						}

						switch (alt11) {
						case 1 :
							// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:329:49: ',' orderByClause[orderings]
							{
							match(input,158,FOLLOW_158_in_selectStatement1067); 
							pushFollow(FOLLOW_orderByClause_in_selectStatement1069);
							orderByClause(orderings);
							state._fsp--;

							}
							break;

						default :
							break loop11;
						}
					}

					}
					break;

			}

			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:330:7: ( K_LIMIT rows= intValue )?
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==K_LIMIT) ) {
				alt13=1;
			}
			switch (alt13) {
				case 1 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:330:9: K_LIMIT rows= intValue
					{
					match(input,K_LIMIT,FOLLOW_K_LIMIT_in_selectStatement1086); 
					pushFollow(FOLLOW_intValue_in_selectStatement1090);
					rows=intValue();
					state._fsp--;

					 limit = rows; 
					}
					break;

			}

			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:331:7: ( K_ALLOW K_FILTERING )?
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==K_ALLOW) ) {
				alt14=1;
			}
			switch (alt14) {
				case 1 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:331:9: K_ALLOW K_FILTERING
					{
					match(input,K_ALLOW,FOLLOW_K_ALLOW_in_selectStatement1105); 
					match(input,K_FILTERING,FOLLOW_K_FILTERING_in_selectStatement1107); 
					 allowFiltering = true; 
					}
					break;

			}


			          SelectStatement.Parameters params = new SelectStatement.Parameters(orderings,
			                                                                             isDistinct,
			                                                                             isCount,
			                                                                             countAlias,
			                                                                             allowFiltering);
			          expr = new SelectStatement.RawStatement(cf, params, sclause, wclause, limit);
			      
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "selectStatement"



	// $ANTLR start "selectClause"
	// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:342:1: selectClause returns [List<RawSelector> expr] : (t1= selector ( ',' tN= selector )* | '\\*' );
	public final List<RawSelector> selectClause() throws RecognitionException {
		List<RawSelector> expr = null;


		RawSelector t1 =null;
		RawSelector tN =null;

		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:343:5: (t1= selector ( ',' tN= selector )* | '\\*' )
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==IDENT||LA16_0==K_ALL||LA16_0==K_AS||LA16_0==K_ASCII||(LA16_0 >= K_BIGINT && LA16_0 <= K_BOOLEAN)||LA16_0==K_CLUSTERING||LA16_0==K_COMPACT||(LA16_0 >= K_CONTAINS && LA16_0 <= K_COUNTER)||(LA16_0 >= K_CUSTOM && LA16_0 <= K_DECIMAL)||(LA16_0 >= K_DETERMINISTIC && LA16_0 <= K_DOUBLE)||(LA16_0 >= K_EXISTS && LA16_0 <= K_FLOAT)||LA16_0==K_FUNCTION||LA16_0==K_INET||LA16_0==K_INT||(LA16_0 >= K_KEY && LA16_0 <= K_KEYS)||(LA16_0 >= K_KEYSPACES && LA16_0 <= K_LANGUAGE)||(LA16_0 >= K_LIST && LA16_0 <= K_MAP)||LA16_0==K_NON||LA16_0==K_NOSUPERUSER||(LA16_0 >= K_PASSWORD && LA16_0 <= K_PERMISSIONS)||LA16_0==K_RETURNS||(LA16_0 >= K_STATIC && LA16_0 <= K_TEXT)||(LA16_0 >= K_TIMESTAMP && LA16_0 <= K_TIMEUUID)||LA16_0==K_TOKEN||LA16_0==K_TRIGGER||LA16_0==K_TTL||LA16_0==K_TYPE||(LA16_0 >= K_USER && LA16_0 <= K_USERS)||(LA16_0 >= K_UUID && LA16_0 <= K_VARINT)||LA16_0==K_WRITETIME||LA16_0==QUOTED_NAME) ) {
				alt16=1;
			}
			else if ( (LA16_0==170) ) {
				alt16=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}

			switch (alt16) {
				case 1 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:343:7: t1= selector ( ',' tN= selector )*
					{
					pushFollow(FOLLOW_selector_in_selectClause1144);
					t1=selector();
					state._fsp--;

					 expr = new ArrayList<RawSelector>(); expr.add(t1); 
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:343:76: ( ',' tN= selector )*
					loop15:
					while (true) {
						int alt15=2;
						int LA15_0 = input.LA(1);
						if ( (LA15_0==158) ) {
							alt15=1;
						}

						switch (alt15) {
						case 1 :
							// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:343:77: ',' tN= selector
							{
							match(input,158,FOLLOW_158_in_selectClause1149); 
							pushFollow(FOLLOW_selector_in_selectClause1153);
							tN=selector();
							state._fsp--;

							 expr.add(tN); 
							}
							break;

						default :
							break loop15;
						}
					}

					}
					break;
				case 2 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:344:7: '\\*'
					{
					match(input,170,FOLLOW_170_in_selectClause1165); 
					 expr = Collections.<RawSelector>emptyList();
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
		return expr;
	}
	// $ANTLR end "selectClause"



	// $ANTLR start "selector"
	// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:347:1: selector returns [RawSelector s] : us= unaliasedSelector ( K_AS c= cident )? ;
	public final RawSelector selector() throws RecognitionException {
		RawSelector s = null;


		Selectable us =null;
		ColumnIdentifier c =null;

		 ColumnIdentifier alias = null; 
		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:349:5: (us= unaliasedSelector ( K_AS c= cident )? )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:349:7: us= unaliasedSelector ( K_AS c= cident )?
			{
			pushFollow(FOLLOW_unaliasedSelector_in_selector1198);
			us=unaliasedSelector();
			state._fsp--;

			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:349:28: ( K_AS c= cident )?
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==K_AS) ) {
				alt17=1;
			}
			switch (alt17) {
				case 1 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:349:29: K_AS c= cident
					{
					match(input,K_AS,FOLLOW_K_AS_in_selector1201); 
					pushFollow(FOLLOW_cident_in_selector1205);
					c=cident();
					state._fsp--;

					 alias = c; 
					}
					break;

			}

			 s = new RawSelector(us, alias); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return s;
	}
	// $ANTLR end "selector"



	// $ANTLR start "unaliasedSelector"
	// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:352:1: unaliasedSelector returns [Selectable s] : (c= cident | K_WRITETIME '(' c= cident ')' | K_TTL '(' c= cident ')' |f= functionName args= selectionFunctionArgs ) ( '.' fi= cident )* ;
	public final Selectable unaliasedSelector() throws RecognitionException {
		Selectable s = null;


		ColumnIdentifier c =null;
		FunctionName f =null;
		List<Selectable> args =null;
		ColumnIdentifier fi =null;

		 Selectable tmp = null; 
		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:354:5: ( (c= cident | K_WRITETIME '(' c= cident ')' | K_TTL '(' c= cident ')' |f= functionName args= selectionFunctionArgs ) ( '.' fi= cident )* )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:354:8: (c= cident | K_WRITETIME '(' c= cident ')' | K_TTL '(' c= cident ')' |f= functionName args= selectionFunctionArgs ) ( '.' fi= cident )*
			{
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:354:8: (c= cident | K_WRITETIME '(' c= cident ')' | K_TTL '(' c= cident ')' |f= functionName args= selectionFunctionArgs )
			int alt18=4;
			switch ( input.LA(1) ) {
			case IDENT:
				{
				int LA18_1 = input.LA(2);
				if ( (LA18_1==K_AS||LA18_1==K_FROM||LA18_1==156||LA18_1==158||LA18_1==160) ) {
					alt18=1;
				}
				else if ( (LA18_1==155||LA18_1==162) ) {
					alt18=4;
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
				break;
			case K_COUNT:
			case K_KEY:
			case QUOTED_NAME:
				{
				alt18=1;
				}
				break;
			case K_ALL:
			case K_AS:
			case K_CLUSTERING:
			case K_COMPACT:
			case K_CONTAINS:
			case K_CUSTOM:
			case K_DETERMINISTIC:
			case K_DISTINCT:
			case K_EXISTS:
			case K_FILTERING:
			case K_FUNCTION:
			case K_KEYS:
			case K_KEYSPACES:
			case K_LANGUAGE:
			case K_LIST:
			case K_MAP:
			case K_NON:
			case K_NOSUPERUSER:
			case K_PASSWORD:
			case K_PERMISSION:
			case K_PERMISSIONS:
			case K_RETURNS:
			case K_STATIC:
			case K_STORAGE:
			case K_SUPERUSER:
			case K_TRIGGER:
			case K_TYPE:
			case K_USER:
			case K_USERS:
			case K_VALUES:
				{
				int LA18_3 = input.LA(2);
				if ( (LA18_3==K_AS||LA18_3==K_FROM||LA18_3==156||LA18_3==158||LA18_3==160) ) {
					alt18=1;
				}
				else if ( (LA18_3==155||LA18_3==162) ) {
					alt18=4;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 18, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case K_ASCII:
				{
				int LA18_4 = input.LA(2);
				if ( (LA18_4==K_AS||LA18_4==K_FROM||LA18_4==156||LA18_4==158||LA18_4==160) ) {
					alt18=1;
				}
				else if ( (LA18_4==155||LA18_4==162) ) {
					alt18=4;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 18, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case K_BIGINT:
				{
				int LA18_5 = input.LA(2);
				if ( (LA18_5==K_AS||LA18_5==K_FROM||LA18_5==156||LA18_5==158||LA18_5==160) ) {
					alt18=1;
				}
				else if ( (LA18_5==155||LA18_5==162) ) {
					alt18=4;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 18, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case K_BLOB:
				{
				int LA18_6 = input.LA(2);
				if ( (LA18_6==K_AS||LA18_6==K_FROM||LA18_6==156||LA18_6==158||LA18_6==160) ) {
					alt18=1;
				}
				else if ( (LA18_6==155||LA18_6==162) ) {
					alt18=4;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 18, 6, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case K_BOOLEAN:
				{
				int LA18_7 = input.LA(2);
				if ( (LA18_7==K_AS||LA18_7==K_FROM||LA18_7==156||LA18_7==158||LA18_7==160) ) {
					alt18=1;
				}
				else if ( (LA18_7==155||LA18_7==162) ) {
					alt18=4;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 18, 7, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case K_COUNTER:
				{
				int LA18_8 = input.LA(2);
				if ( (LA18_8==K_AS||LA18_8==K_FROM||LA18_8==156||LA18_8==158||LA18_8==160) ) {
					alt18=1;
				}
				else if ( (LA18_8==155||LA18_8==162) ) {
					alt18=4;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 18, 8, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case K_DECIMAL:
				{
				int LA18_9 = input.LA(2);
				if ( (LA18_9==K_AS||LA18_9==K_FROM||LA18_9==156||LA18_9==158||LA18_9==160) ) {
					alt18=1;
				}
				else if ( (LA18_9==155||LA18_9==162) ) {
					alt18=4;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 18, 9, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case K_DOUBLE:
				{
				int LA18_10 = input.LA(2);
				if ( (LA18_10==K_AS||LA18_10==K_FROM||LA18_10==156||LA18_10==158||LA18_10==160) ) {
					alt18=1;
				}
				else if ( (LA18_10==155||LA18_10==162) ) {
					alt18=4;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 18, 10, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case K_FLOAT:
				{
				int LA18_11 = input.LA(2);
				if ( (LA18_11==K_AS||LA18_11==K_FROM||LA18_11==156||LA18_11==158||LA18_11==160) ) {
					alt18=1;
				}
				else if ( (LA18_11==155||LA18_11==162) ) {
					alt18=4;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 18, 11, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case K_INET:
				{
				int LA18_12 = input.LA(2);
				if ( (LA18_12==K_AS||LA18_12==K_FROM||LA18_12==156||LA18_12==158||LA18_12==160) ) {
					alt18=1;
				}
				else if ( (LA18_12==155||LA18_12==162) ) {
					alt18=4;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 18, 12, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case K_INT:
				{
				int LA18_13 = input.LA(2);
				if ( (LA18_13==K_AS||LA18_13==K_FROM||LA18_13==156||LA18_13==158||LA18_13==160) ) {
					alt18=1;
				}
				else if ( (LA18_13==155||LA18_13==162) ) {
					alt18=4;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 18, 13, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case K_TEXT:
				{
				int LA18_14 = input.LA(2);
				if ( (LA18_14==K_AS||LA18_14==K_FROM||LA18_14==156||LA18_14==158||LA18_14==160) ) {
					alt18=1;
				}
				else if ( (LA18_14==155||LA18_14==162) ) {
					alt18=4;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 18, 14, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case K_TIMESTAMP:
				{
				int LA18_15 = input.LA(2);
				if ( (LA18_15==K_AS||LA18_15==K_FROM||LA18_15==156||LA18_15==158||LA18_15==160) ) {
					alt18=1;
				}
				else if ( (LA18_15==155||LA18_15==162) ) {
					alt18=4;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 18, 15, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case K_UUID:
				{
				int LA18_16 = input.LA(2);
				if ( (LA18_16==K_AS||LA18_16==K_FROM||LA18_16==156||LA18_16==158||LA18_16==160) ) {
					alt18=1;
				}
				else if ( (LA18_16==155||LA18_16==162) ) {
					alt18=4;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 18, 16, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case K_VARCHAR:
				{
				int LA18_17 = input.LA(2);
				if ( (LA18_17==K_AS||LA18_17==K_FROM||LA18_17==156||LA18_17==158||LA18_17==160) ) {
					alt18=1;
				}
				else if ( (LA18_17==155||LA18_17==162) ) {
					alt18=4;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 18, 17, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case K_VARINT:
				{
				int LA18_18 = input.LA(2);
				if ( (LA18_18==K_AS||LA18_18==K_FROM||LA18_18==156||LA18_18==158||LA18_18==160) ) {
					alt18=1;
				}
				else if ( (LA18_18==155||LA18_18==162) ) {
					alt18=4;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 18, 18, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case K_TIMEUUID:
				{
				int LA18_19 = input.LA(2);
				if ( (LA18_19==K_AS||LA18_19==K_FROM||LA18_19==156||LA18_19==158||LA18_19==160) ) {
					alt18=1;
				}
				else if ( (LA18_19==155||LA18_19==162) ) {
					alt18=4;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 18, 19, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case K_WRITETIME:
				{
				int LA18_20 = input.LA(2);
				if ( (LA18_20==155) ) {
					alt18=2;
				}
				else if ( (LA18_20==K_AS||LA18_20==K_FROM||LA18_20==156||LA18_20==158||LA18_20==160) ) {
					alt18=1;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 18, 20, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case K_TTL:
				{
				int LA18_21 = input.LA(2);
				if ( (LA18_21==155) ) {
					alt18=3;
				}
				else if ( (LA18_21==K_AS||LA18_21==K_FROM||LA18_21==156||LA18_21==158||LA18_21==160) ) {
					alt18=1;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 18, 21, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case K_TOKEN:
				{
				alt18=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}
			switch (alt18) {
				case 1 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:354:10: c= cident
					{
					pushFollow(FOLLOW_cident_in_unaliasedSelector1246);
					c=cident();
					state._fsp--;

					 tmp = c; 
					}
					break;
				case 2 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:355:10: K_WRITETIME '(' c= cident ')'
					{
					match(input,K_WRITETIME,FOLLOW_K_WRITETIME_in_unaliasedSelector1292); 
					match(input,155,FOLLOW_155_in_unaliasedSelector1294); 
					pushFollow(FOLLOW_cident_in_unaliasedSelector1298);
					c=cident();
					state._fsp--;

					match(input,156,FOLLOW_156_in_unaliasedSelector1300); 
					 tmp = new Selectable.WritetimeOrTTL(c, true); 
					}
					break;
				case 3 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:356:10: K_TTL '(' c= cident ')'
					{
					match(input,K_TTL,FOLLOW_K_TTL_in_unaliasedSelector1326); 
					match(input,155,FOLLOW_155_in_unaliasedSelector1334); 
					pushFollow(FOLLOW_cident_in_unaliasedSelector1338);
					c=cident();
					state._fsp--;

					match(input,156,FOLLOW_156_in_unaliasedSelector1340); 
					 tmp = new Selectable.WritetimeOrTTL(c, false); 
					}
					break;
				case 4 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:357:10: f= functionName args= selectionFunctionArgs
					{
					pushFollow(FOLLOW_functionName_in_unaliasedSelector1368);
					f=functionName();
					state._fsp--;

					pushFollow(FOLLOW_selectionFunctionArgs_in_unaliasedSelector1372);
					args=selectionFunctionArgs();
					state._fsp--;

					 tmp = new Selectable.WithFunction(f, args); 
					}
					break;

			}

			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:358:10: ( '.' fi= cident )*
			loop19:
			while (true) {
				int alt19=2;
				int LA19_0 = input.LA(1);
				if ( (LA19_0==160) ) {
					alt19=1;
				}

				switch (alt19) {
				case 1 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:358:12: '.' fi= cident
					{
					match(input,160,FOLLOW_160_in_unaliasedSelector1387); 
					pushFollow(FOLLOW_cident_in_unaliasedSelector1391);
					fi=cident();
					state._fsp--;

					 tmp = new Selectable.WithFieldSelection(tmp, fi); 
					}
					break;

				default :
					break loop19;
				}
			}

			 s = tmp; 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return s;
	}
	// $ANTLR end "unaliasedSelector"



	// $ANTLR start "selectionFunctionArgs"
	// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:361:1: selectionFunctionArgs returns [List<Selectable> a] : ( '(' ')' | '(' s1= unaliasedSelector ( ',' sn= unaliasedSelector )* ')' );
	public final List<Selectable> selectionFunctionArgs() throws RecognitionException {
		List<Selectable> a = null;


		Selectable s1 =null;
		Selectable sn =null;

		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:362:5: ( '(' ')' | '(' s1= unaliasedSelector ( ',' sn= unaliasedSelector )* ')' )
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==155) ) {
				int LA21_1 = input.LA(2);
				if ( (LA21_1==156) ) {
					alt21=1;
				}
				else if ( (LA21_1==IDENT||LA21_1==K_ALL||LA21_1==K_AS||LA21_1==K_ASCII||(LA21_1 >= K_BIGINT && LA21_1 <= K_BOOLEAN)||LA21_1==K_CLUSTERING||LA21_1==K_COMPACT||(LA21_1 >= K_CONTAINS && LA21_1 <= K_COUNTER)||(LA21_1 >= K_CUSTOM && LA21_1 <= K_DECIMAL)||(LA21_1 >= K_DETERMINISTIC && LA21_1 <= K_DOUBLE)||(LA21_1 >= K_EXISTS && LA21_1 <= K_FLOAT)||LA21_1==K_FUNCTION||LA21_1==K_INET||LA21_1==K_INT||(LA21_1 >= K_KEY && LA21_1 <= K_KEYS)||(LA21_1 >= K_KEYSPACES && LA21_1 <= K_LANGUAGE)||(LA21_1 >= K_LIST && LA21_1 <= K_MAP)||LA21_1==K_NON||LA21_1==K_NOSUPERUSER||(LA21_1 >= K_PASSWORD && LA21_1 <= K_PERMISSIONS)||LA21_1==K_RETURNS||(LA21_1 >= K_STATIC && LA21_1 <= K_TEXT)||(LA21_1 >= K_TIMESTAMP && LA21_1 <= K_TIMEUUID)||LA21_1==K_TOKEN||LA21_1==K_TRIGGER||LA21_1==K_TTL||LA21_1==K_TYPE||(LA21_1 >= K_USER && LA21_1 <= K_USERS)||(LA21_1 >= K_UUID && LA21_1 <= K_VARINT)||LA21_1==K_WRITETIME||LA21_1==QUOTED_NAME) ) {
					alt21=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 21, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 21, 0, input);
				throw nvae;
			}

			switch (alt21) {
				case 1 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:362:7: '(' ')'
					{
					match(input,155,FOLLOW_155_in_selectionFunctionArgs1419); 
					match(input,156,FOLLOW_156_in_selectionFunctionArgs1421); 
					 a = Collections.emptyList(); 
					}
					break;
				case 2 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:363:7: '(' s1= unaliasedSelector ( ',' sn= unaliasedSelector )* ')'
					{
					match(input,155,FOLLOW_155_in_selectionFunctionArgs1431); 
					pushFollow(FOLLOW_unaliasedSelector_in_selectionFunctionArgs1435);
					s1=unaliasedSelector();
					state._fsp--;

					 List<Selectable> args = new ArrayList<Selectable>(); args.add(s1); 
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:364:11: ( ',' sn= unaliasedSelector )*
					loop20:
					while (true) {
						int alt20=2;
						int LA20_0 = input.LA(1);
						if ( (LA20_0==158) ) {
							alt20=1;
						}

						switch (alt20) {
						case 1 :
							// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:364:13: ',' sn= unaliasedSelector
							{
							match(input,158,FOLLOW_158_in_selectionFunctionArgs1451); 
							pushFollow(FOLLOW_unaliasedSelector_in_selectionFunctionArgs1455);
							sn=unaliasedSelector();
							state._fsp--;

							 args.add(sn); 
							}
							break;

						default :
							break loop20;
						}
					}

					match(input,156,FOLLOW_156_in_selectionFunctionArgs1468); 
					 a = args; 
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
		return a;
	}
	// $ANTLR end "selectionFunctionArgs"



	// $ANTLR start "selectCountClause"
	// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:368:1: selectCountClause returns [List<RawSelector> expr] : ( '\\*' |i= INTEGER );
	public final List<RawSelector> selectCountClause() throws RecognitionException {
		List<RawSelector> expr = null;


		Token i=null;

		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:369:5: ( '\\*' |i= INTEGER )
			int alt22=2;
			int LA22_0 = input.LA(1);
			if ( (LA22_0==170) ) {
				alt22=1;
			}
			else if ( (LA22_0==INTEGER) ) {
				alt22=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 22, 0, input);
				throw nvae;
			}

			switch (alt22) {
				case 1 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:369:7: '\\*'
					{
					match(input,170,FOLLOW_170_in_selectCountClause1491); 
					 expr = Collections.<RawSelector>emptyList();
					}
					break;
				case 2 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:370:7: i= INTEGER
					{
					i=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_selectCountClause1513); 
					 if (!i.getText().equals("1")) addRecognitionError("Only COUNT(1) is supported, got COUNT(" + i.getText() + ")"); expr = Collections.<RawSelector>emptyList();
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
		return expr;
	}
	// $ANTLR end "selectCountClause"



	// $ANTLR start "whereClause"
	// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:373:1: whereClause returns [List<Relation> clause] : relation[$clause] ( K_AND relation[$clause] )* ;
	public final List<Relation> whereClause() throws RecognitionException {
		List<Relation> clause = null;


		 clause = new ArrayList<Relation>(); 
		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:375:5: ( relation[$clause] ( K_AND relation[$clause] )* )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:375:7: relation[$clause] ( K_AND relation[$clause] )*
			{
			pushFollow(FOLLOW_relation_in_whereClause1549);
			relation(clause);
			state._fsp--;

			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:375:25: ( K_AND relation[$clause] )*
			loop23:
			while (true) {
				int alt23=2;
				int LA23_0 = input.LA(1);
				if ( (LA23_0==K_AND) ) {
					alt23=1;
				}

				switch (alt23) {
				case 1 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:375:26: K_AND relation[$clause]
					{
					match(input,K_AND,FOLLOW_K_AND_in_whereClause1553); 
					pushFollow(FOLLOW_relation_in_whereClause1555);
					relation(clause);
					state._fsp--;

					}
					break;

				default :
					break loop23;
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
		return clause;
	}
	// $ANTLR end "whereClause"



	// $ANTLR start "orderByClause"
	// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:378:1: orderByClause[Map<ColumnIdentifier, Boolean> orderings] : c= cident ( K_ASC | K_DESC )? ;
	public final void orderByClause(Map<ColumnIdentifier, Boolean> orderings) throws RecognitionException {
		ColumnIdentifier c =null;


		        boolean reversed = false;
		    
		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:382:5: (c= cident ( K_ASC | K_DESC )? )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:382:7: c= cident ( K_ASC | K_DESC )?
			{
			pushFollow(FOLLOW_cident_in_orderByClause1586);
			c=cident();
			state._fsp--;

			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:382:16: ( K_ASC | K_DESC )?
			int alt24=3;
			int LA24_0 = input.LA(1);
			if ( (LA24_0==K_ASC) ) {
				alt24=1;
			}
			else if ( (LA24_0==K_DESC) ) {
				alt24=2;
			}
			switch (alt24) {
				case 1 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:382:17: K_ASC
					{
					match(input,K_ASC,FOLLOW_K_ASC_in_orderByClause1589); 
					}
					break;
				case 2 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:382:25: K_DESC
					{
					match(input,K_DESC,FOLLOW_K_DESC_in_orderByClause1593); 
					 reversed = true; 
					}
					break;

			}

			 orderings.put(c, reversed); 
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
	// $ANTLR end "orderByClause"



	// $ANTLR start "insertStatement"
	// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:391:1: insertStatement returns [UpdateStatement.ParsedInsert expr] : K_INSERT K_INTO cf= columnFamilyName '(' c1= cident ( ',' cn= cident )* ')' K_VALUES '(' v1= term ( ',' vn= term )* ')' ( K_IF K_NOT K_EXISTS )? ( usingClause[attrs] )? ;
	public final UpdateStatement.ParsedInsert insertStatement() throws RecognitionException {
		UpdateStatement.ParsedInsert expr = null;


		CFName cf =null;
		ColumnIdentifier c1 =null;
		ColumnIdentifier cn =null;
		Term.Raw v1 =null;
		Term.Raw vn =null;


		        Attributes.Raw attrs = new Attributes.Raw();
		        List<ColumnIdentifier> columnNames  = new ArrayList<ColumnIdentifier>();
		        List<Term.Raw> values = new ArrayList<Term.Raw>();
		        boolean ifNotExists = false;
		    
		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:398:5: ( K_INSERT K_INTO cf= columnFamilyName '(' c1= cident ( ',' cn= cident )* ')' K_VALUES '(' v1= term ( ',' vn= term )* ')' ( K_IF K_NOT K_EXISTS )? ( usingClause[attrs] )? )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:398:7: K_INSERT K_INTO cf= columnFamilyName '(' c1= cident ( ',' cn= cident )* ')' K_VALUES '(' v1= term ( ',' vn= term )* ')' ( K_IF K_NOT K_EXISTS )? ( usingClause[attrs] )?
			{
			match(input,K_INSERT,FOLLOW_K_INSERT_in_insertStatement1631); 
			match(input,K_INTO,FOLLOW_K_INTO_in_insertStatement1633); 
			pushFollow(FOLLOW_columnFamilyName_in_insertStatement1637);
			cf=columnFamilyName();
			state._fsp--;

			match(input,155,FOLLOW_155_in_insertStatement1649); 
			pushFollow(FOLLOW_cident_in_insertStatement1653);
			c1=cident();
			state._fsp--;

			 columnNames.add(c1); 
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:399:51: ( ',' cn= cident )*
			loop25:
			while (true) {
				int alt25=2;
				int LA25_0 = input.LA(1);
				if ( (LA25_0==158) ) {
					alt25=1;
				}

				switch (alt25) {
				case 1 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:399:53: ',' cn= cident
					{
					match(input,158,FOLLOW_158_in_insertStatement1660); 
					pushFollow(FOLLOW_cident_in_insertStatement1664);
					cn=cident();
					state._fsp--;

					 columnNames.add(cn); 
					}
					break;

				default :
					break loop25;
				}
			}

			match(input,156,FOLLOW_156_in_insertStatement1671); 
			match(input,K_VALUES,FOLLOW_K_VALUES_in_insertStatement1681); 
			match(input,155,FOLLOW_155_in_insertStatement1693); 
			pushFollow(FOLLOW_term_in_insertStatement1697);
			v1=term();
			state._fsp--;

			 values.add(v1); 
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:401:43: ( ',' vn= term )*
			loop26:
			while (true) {
				int alt26=2;
				int LA26_0 = input.LA(1);
				if ( (LA26_0==158) ) {
					alt26=1;
				}

				switch (alt26) {
				case 1 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:401:45: ',' vn= term
					{
					match(input,158,FOLLOW_158_in_insertStatement1703); 
					pushFollow(FOLLOW_term_in_insertStatement1707);
					vn=term();
					state._fsp--;

					 values.add(vn); 
					}
					break;

				default :
					break loop26;
				}
			}

			match(input,156,FOLLOW_156_in_insertStatement1714); 
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:403:9: ( K_IF K_NOT K_EXISTS )?
			int alt27=2;
			int LA27_0 = input.LA(1);
			if ( (LA27_0==K_IF) ) {
				alt27=1;
			}
			switch (alt27) {
				case 1 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:403:11: K_IF K_NOT K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_insertStatement1727); 
					match(input,K_NOT,FOLLOW_K_NOT_in_insertStatement1729); 
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_insertStatement1731); 
					 ifNotExists = true; 
					}
					break;

			}

			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:404:9: ( usingClause[attrs] )?
			int alt28=2;
			int LA28_0 = input.LA(1);
			if ( (LA28_0==K_USING) ) {
				alt28=1;
			}
			switch (alt28) {
				case 1 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:404:11: usingClause[attrs]
					{
					pushFollow(FOLLOW_usingClause_in_insertStatement1748);
					usingClause(attrs);
					state._fsp--;

					}
					break;

			}


			          expr = new UpdateStatement.ParsedInsert(cf,
			                                                   attrs,
			                                                   columnNames,
			                                                   values,
			                                                   ifNotExists);
			      
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "insertStatement"



	// $ANTLR start "usingClause"
	// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:414:1: usingClause[Attributes.Raw attrs] : K_USING usingClauseObjective[attrs] ( K_AND usingClauseObjective[attrs] )* ;
	public final void usingClause(Attributes.Raw attrs) throws RecognitionException {
		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:415:5: ( K_USING usingClauseObjective[attrs] ( K_AND usingClauseObjective[attrs] )* )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:415:7: K_USING usingClauseObjective[attrs] ( K_AND usingClauseObjective[attrs] )*
			{
			match(input,K_USING,FOLLOW_K_USING_in_usingClause1778); 
			pushFollow(FOLLOW_usingClauseObjective_in_usingClause1780);
			usingClauseObjective(attrs);
			state._fsp--;

			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:415:43: ( K_AND usingClauseObjective[attrs] )*
			loop29:
			while (true) {
				int alt29=2;
				int LA29_0 = input.LA(1);
				if ( (LA29_0==K_AND) ) {
					alt29=1;
				}

				switch (alt29) {
				case 1 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:415:45: K_AND usingClauseObjective[attrs]
					{
					match(input,K_AND,FOLLOW_K_AND_in_usingClause1785); 
					pushFollow(FOLLOW_usingClauseObjective_in_usingClause1787);
					usingClauseObjective(attrs);
					state._fsp--;

					}
					break;

				default :
					break loop29;
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
	// $ANTLR end "usingClause"



	// $ANTLR start "usingClauseObjective"
	// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:418:1: usingClauseObjective[Attributes.Raw attrs] : ( K_TIMESTAMP ts= intValue | K_TTL t= intValue );
	public final void usingClauseObjective(Attributes.Raw attrs) throws RecognitionException {
		Term.Raw ts =null;
		Term.Raw t =null;

		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:419:5: ( K_TIMESTAMP ts= intValue | K_TTL t= intValue )
			int alt30=2;
			int LA30_0 = input.LA(1);
			if ( (LA30_0==K_TIMESTAMP) ) {
				alt30=1;
			}
			else if ( (LA30_0==K_TTL) ) {
				alt30=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 30, 0, input);
				throw nvae;
			}

			switch (alt30) {
				case 1 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:419:7: K_TIMESTAMP ts= intValue
					{
					match(input,K_TIMESTAMP,FOLLOW_K_TIMESTAMP_in_usingClauseObjective1809); 
					pushFollow(FOLLOW_intValue_in_usingClauseObjective1813);
					ts=intValue();
					state._fsp--;

					 attrs.timestamp = ts; 
					}
					break;
				case 2 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:420:7: K_TTL t= intValue
					{
					match(input,K_TTL,FOLLOW_K_TTL_in_usingClauseObjective1823); 
					pushFollow(FOLLOW_intValue_in_usingClauseObjective1827);
					t=intValue();
					state._fsp--;

					 attrs.timeToLive = t; 
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
	// $ANTLR end "usingClauseObjective"



	// $ANTLR start "updateStatement"
	// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:429:1: updateStatement returns [UpdateStatement.ParsedUpdate expr] : K_UPDATE cf= columnFamilyName ( usingClause[attrs] )? K_SET columnOperation[operations] ( ',' columnOperation[operations] )* K_WHERE wclause= whereClause ( K_IF conditions= updateConditions )? ;
	public final UpdateStatement.ParsedUpdate updateStatement() throws RecognitionException {
		UpdateStatement.ParsedUpdate expr = null;


		CFName cf =null;
		List<Relation> wclause =null;
		List<Pair<ColumnIdentifier, ColumnCondition.Raw>> conditions =null;


		        Attributes.Raw attrs = new Attributes.Raw();
		        List<Pair<ColumnIdentifier, Operation.RawUpdate>> operations = new ArrayList<Pair<ColumnIdentifier, Operation.RawUpdate>>();
		    
		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:434:5: ( K_UPDATE cf= columnFamilyName ( usingClause[attrs] )? K_SET columnOperation[operations] ( ',' columnOperation[operations] )* K_WHERE wclause= whereClause ( K_IF conditions= updateConditions )? )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:434:7: K_UPDATE cf= columnFamilyName ( usingClause[attrs] )? K_SET columnOperation[operations] ( ',' columnOperation[operations] )* K_WHERE wclause= whereClause ( K_IF conditions= updateConditions )?
			{
			match(input,K_UPDATE,FOLLOW_K_UPDATE_in_updateStatement1861); 
			pushFollow(FOLLOW_columnFamilyName_in_updateStatement1865);
			cf=columnFamilyName();
			state._fsp--;

			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:435:7: ( usingClause[attrs] )?
			int alt31=2;
			int LA31_0 = input.LA(1);
			if ( (LA31_0==K_USING) ) {
				alt31=1;
			}
			switch (alt31) {
				case 1 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:435:9: usingClause[attrs]
					{
					pushFollow(FOLLOW_usingClause_in_updateStatement1875);
					usingClause(attrs);
					state._fsp--;

					}
					break;

			}

			match(input,K_SET,FOLLOW_K_SET_in_updateStatement1887); 
			pushFollow(FOLLOW_columnOperation_in_updateStatement1889);
			columnOperation(operations);
			state._fsp--;

			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:436:41: ( ',' columnOperation[operations] )*
			loop32:
			while (true) {
				int alt32=2;
				int LA32_0 = input.LA(1);
				if ( (LA32_0==158) ) {
					alt32=1;
				}

				switch (alt32) {
				case 1 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:436:42: ',' columnOperation[operations]
					{
					match(input,158,FOLLOW_158_in_updateStatement1893); 
					pushFollow(FOLLOW_columnOperation_in_updateStatement1895);
					columnOperation(operations);
					state._fsp--;

					}
					break;

				default :
					break loop32;
				}
			}

			match(input,K_WHERE,FOLLOW_K_WHERE_in_updateStatement1906); 
			pushFollow(FOLLOW_whereClause_in_updateStatement1910);
			wclause=whereClause();
			state._fsp--;

			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:438:7: ( K_IF conditions= updateConditions )?
			int alt33=2;
			int LA33_0 = input.LA(1);
			if ( (LA33_0==K_IF) ) {
				alt33=1;
			}
			switch (alt33) {
				case 1 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:438:9: K_IF conditions= updateConditions
					{
					match(input,K_IF,FOLLOW_K_IF_in_updateStatement1920); 
					pushFollow(FOLLOW_updateConditions_in_updateStatement1924);
					conditions=updateConditions();
					state._fsp--;

					}
					break;

			}


			          return new UpdateStatement.ParsedUpdate(cf,
			                                                  attrs,
			                                                  operations,
			                                                  wclause,
			                                                  conditions == null ? Collections.<Pair<ColumnIdentifier, ColumnCondition.Raw>>emptyList() : conditions);
			     
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "updateStatement"



	// $ANTLR start "updateConditions"
	// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:448:1: updateConditions returns [List<Pair<ColumnIdentifier, ColumnCondition.Raw>> conditions] : columnCondition[conditions] ( K_AND columnCondition[conditions] )* ;
	public final List<Pair<ColumnIdentifier, ColumnCondition.Raw>> updateConditions() throws RecognitionException {
		List<Pair<ColumnIdentifier, ColumnCondition.Raw>> conditions = null;


		 conditions = new ArrayList<Pair<ColumnIdentifier, ColumnCondition.Raw>>(); 
		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:450:5: ( columnCondition[conditions] ( K_AND columnCondition[conditions] )* )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:450:7: columnCondition[conditions] ( K_AND columnCondition[conditions] )*
			{
			pushFollow(FOLLOW_columnCondition_in_updateConditions1965);
			columnCondition(conditions);
			state._fsp--;

			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:450:35: ( K_AND columnCondition[conditions] )*
			loop34:
			while (true) {
				int alt34=2;
				int LA34_0 = input.LA(1);
				if ( (LA34_0==K_AND) ) {
					alt34=1;
				}

				switch (alt34) {
				case 1 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:450:37: K_AND columnCondition[conditions]
					{
					match(input,K_AND,FOLLOW_K_AND_in_updateConditions1970); 
					pushFollow(FOLLOW_columnCondition_in_updateConditions1972);
					columnCondition(conditions);
					state._fsp--;

					}
					break;

				default :
					break loop34;
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
		return conditions;
	}
	// $ANTLR end "updateConditions"



	// $ANTLR start "deleteStatement"
	// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:461:1: deleteStatement returns [DeleteStatement.Parsed expr] : K_DELETE (dels= deleteSelection )? K_FROM cf= columnFamilyName ( usingClauseDelete[attrs] )? K_WHERE wclause= whereClause ( K_IF ( K_EXISTS |conditions= updateConditions ) )? ;
	public final DeleteStatement.Parsed deleteStatement() throws RecognitionException {
		DeleteStatement.Parsed expr = null;


		List<Operation.RawDeletion> dels =null;
		CFName cf =null;
		List<Relation> wclause =null;
		List<Pair<ColumnIdentifier, ColumnCondition.Raw>> conditions =null;


		        Attributes.Raw attrs = new Attributes.Raw();
		        List<Operation.RawDeletion> columnDeletions = Collections.emptyList();
		        boolean ifExists = false;
		    
		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:467:5: ( K_DELETE (dels= deleteSelection )? K_FROM cf= columnFamilyName ( usingClauseDelete[attrs] )? K_WHERE wclause= whereClause ( K_IF ( K_EXISTS |conditions= updateConditions ) )? )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:467:7: K_DELETE (dels= deleteSelection )? K_FROM cf= columnFamilyName ( usingClauseDelete[attrs] )? K_WHERE wclause= whereClause ( K_IF ( K_EXISTS |conditions= updateConditions ) )?
			{
			match(input,K_DELETE,FOLLOW_K_DELETE_in_deleteStatement2009); 
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:467:16: (dels= deleteSelection )?
			int alt35=2;
			int LA35_0 = input.LA(1);
			if ( (LA35_0==IDENT||LA35_0==K_ALL||LA35_0==K_AS||LA35_0==K_ASCII||(LA35_0 >= K_BIGINT && LA35_0 <= K_BOOLEAN)||LA35_0==K_CLUSTERING||LA35_0==K_COMPACT||(LA35_0 >= K_CONTAINS && LA35_0 <= K_COUNTER)||(LA35_0 >= K_CUSTOM && LA35_0 <= K_DECIMAL)||(LA35_0 >= K_DETERMINISTIC && LA35_0 <= K_DOUBLE)||(LA35_0 >= K_EXISTS && LA35_0 <= K_FLOAT)||LA35_0==K_FUNCTION||LA35_0==K_INET||LA35_0==K_INT||(LA35_0 >= K_KEY && LA35_0 <= K_KEYS)||(LA35_0 >= K_KEYSPACES && LA35_0 <= K_LANGUAGE)||(LA35_0 >= K_LIST && LA35_0 <= K_MAP)||LA35_0==K_NON||LA35_0==K_NOSUPERUSER||(LA35_0 >= K_PASSWORD && LA35_0 <= K_PERMISSIONS)||LA35_0==K_RETURNS||(LA35_0 >= K_STATIC && LA35_0 <= K_TEXT)||(LA35_0 >= K_TIMESTAMP && LA35_0 <= K_TIMEUUID)||LA35_0==K_TRIGGER||LA35_0==K_TTL||LA35_0==K_TYPE||(LA35_0 >= K_USER && LA35_0 <= K_USERS)||(LA35_0 >= K_UUID && LA35_0 <= K_VARINT)||LA35_0==K_WRITETIME||LA35_0==QUOTED_NAME) ) {
				alt35=1;
			}
			switch (alt35) {
				case 1 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:467:18: dels= deleteSelection
					{
					pushFollow(FOLLOW_deleteSelection_in_deleteStatement2015);
					dels=deleteSelection();
					state._fsp--;

					 columnDeletions = dels; 
					}
					break;

			}

			match(input,K_FROM,FOLLOW_K_FROM_in_deleteStatement2028); 
			pushFollow(FOLLOW_columnFamilyName_in_deleteStatement2032);
			cf=columnFamilyName();
			state._fsp--;

			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:469:7: ( usingClauseDelete[attrs] )?
			int alt36=2;
			int LA36_0 = input.LA(1);
			if ( (LA36_0==K_USING) ) {
				alt36=1;
			}
			switch (alt36) {
				case 1 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:469:9: usingClauseDelete[attrs]
					{
					pushFollow(FOLLOW_usingClauseDelete_in_deleteStatement2042);
					usingClauseDelete(attrs);
					state._fsp--;

					}
					break;

			}

			match(input,K_WHERE,FOLLOW_K_WHERE_in_deleteStatement2054); 
			pushFollow(FOLLOW_whereClause_in_deleteStatement2058);
			wclause=whereClause();
			state._fsp--;

			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:471:7: ( K_IF ( K_EXISTS |conditions= updateConditions ) )?
			int alt38=2;
			int LA38_0 = input.LA(1);
			if ( (LA38_0==K_IF) ) {
				alt38=1;
			}
			switch (alt38) {
				case 1 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:471:9: K_IF ( K_EXISTS |conditions= updateConditions )
					{
					match(input,K_IF,FOLLOW_K_IF_in_deleteStatement2068); 
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:471:14: ( K_EXISTS |conditions= updateConditions )
					int alt37=2;
					int LA37_0 = input.LA(1);
					if ( (LA37_0==K_EXISTS) ) {
						int LA37_1 = input.LA(2);
						if ( (LA37_1==EOF||LA37_1==K_APPLY||LA37_1==K_DELETE||LA37_1==K_INSERT||LA37_1==K_UPDATE||LA37_1==163) ) {
							alt37=1;
						}
						else if ( (LA37_1==K_IN||LA37_1==154||(LA37_1 >= 164 && LA37_1 <= 169)) ) {
							alt37=2;
						}

						else {
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 37, 1, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}
					else if ( (LA37_0==IDENT||LA37_0==K_ALL||LA37_0==K_AS||LA37_0==K_ASCII||(LA37_0 >= K_BIGINT && LA37_0 <= K_BOOLEAN)||LA37_0==K_CLUSTERING||LA37_0==K_COMPACT||(LA37_0 >= K_CONTAINS && LA37_0 <= K_COUNTER)||(LA37_0 >= K_CUSTOM && LA37_0 <= K_DECIMAL)||(LA37_0 >= K_DETERMINISTIC && LA37_0 <= K_DOUBLE)||(LA37_0 >= K_FILTERING && LA37_0 <= K_FLOAT)||LA37_0==K_FUNCTION||LA37_0==K_INET||LA37_0==K_INT||(LA37_0 >= K_KEY && LA37_0 <= K_KEYS)||(LA37_0 >= K_KEYSPACES && LA37_0 <= K_LANGUAGE)||(LA37_0 >= K_LIST && LA37_0 <= K_MAP)||LA37_0==K_NON||LA37_0==K_NOSUPERUSER||(LA37_0 >= K_PASSWORD && LA37_0 <= K_PERMISSIONS)||LA37_0==K_RETURNS||(LA37_0 >= K_STATIC && LA37_0 <= K_TEXT)||(LA37_0 >= K_TIMESTAMP && LA37_0 <= K_TIMEUUID)||LA37_0==K_TRIGGER||LA37_0==K_TTL||LA37_0==K_TYPE||(LA37_0 >= K_USER && LA37_0 <= K_USERS)||(LA37_0 >= K_UUID && LA37_0 <= K_VARINT)||LA37_0==K_WRITETIME||LA37_0==QUOTED_NAME) ) {
						alt37=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 37, 0, input);
						throw nvae;
					}

					switch (alt37) {
						case 1 :
							// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:471:16: K_EXISTS
							{
							match(input,K_EXISTS,FOLLOW_K_EXISTS_in_deleteStatement2072); 
							 ifExists = true; 
							}
							break;
						case 2 :
							// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:471:48: conditions= updateConditions
							{
							pushFollow(FOLLOW_updateConditions_in_deleteStatement2080);
							conditions=updateConditions();
							state._fsp--;

							}
							break;

					}

					}
					break;

			}


			          return new DeleteStatement.Parsed(cf,
			                                            attrs,
			                                            columnDeletions,
			                                            wclause,
			                                            conditions == null ? Collections.<Pair<ColumnIdentifier, ColumnCondition.Raw>>emptyList() : conditions,
			                                            ifExists);
			      
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "deleteStatement"



	// $ANTLR start "deleteSelection"
	// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:482:1: deleteSelection returns [List<Operation.RawDeletion> operations] :t1= deleteOp ( ',' tN= deleteOp )* ;
	public final List<Operation.RawDeletion> deleteSelection() throws RecognitionException {
		List<Operation.RawDeletion> operations = null;


		Operation.RawDeletion t1 =null;
		Operation.RawDeletion tN =null;

		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:483:5: (t1= deleteOp ( ',' tN= deleteOp )* )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:483:7: t1= deleteOp ( ',' tN= deleteOp )*
			{
			 operations = new ArrayList<Operation.RawDeletion>(); 
			pushFollow(FOLLOW_deleteOp_in_deleteSelection2127);
			t1=deleteOp();
			state._fsp--;

			 operations.add(t1); 
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:485:11: ( ',' tN= deleteOp )*
			loop39:
			while (true) {
				int alt39=2;
				int LA39_0 = input.LA(1);
				if ( (LA39_0==158) ) {
					alt39=1;
				}

				switch (alt39) {
				case 1 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:485:12: ',' tN= deleteOp
					{
					match(input,158,FOLLOW_158_in_deleteSelection2142); 
					pushFollow(FOLLOW_deleteOp_in_deleteSelection2146);
					tN=deleteOp();
					state._fsp--;

					 operations.add(tN); 
					}
					break;

				default :
					break loop39;
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
		return operations;
	}
	// $ANTLR end "deleteSelection"



	// $ANTLR start "deleteOp"
	// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:488:1: deleteOp returns [Operation.RawDeletion op] : (c= cident |c= cident '[' t= term ']' );
	public final Operation.RawDeletion deleteOp() throws RecognitionException {
		Operation.RawDeletion op = null;


		ColumnIdentifier c =null;
		Term.Raw t =null;

		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:489:5: (c= cident |c= cident '[' t= term ']' )
			int alt40=2;
			switch ( input.LA(1) ) {
			case IDENT:
				{
				int LA40_1 = input.LA(2);
				if ( (LA40_1==K_FROM||LA40_1==158) ) {
					alt40=1;
				}
				else if ( (LA40_1==169) ) {
					alt40=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 40, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case QUOTED_NAME:
				{
				int LA40_2 = input.LA(2);
				if ( (LA40_2==K_FROM||LA40_2==158) ) {
					alt40=1;
				}
				else if ( (LA40_2==169) ) {
					alt40=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 40, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case K_ALL:
			case K_AS:
			case K_CLUSTERING:
			case K_COMPACT:
			case K_CONTAINS:
			case K_CUSTOM:
			case K_DETERMINISTIC:
			case K_DISTINCT:
			case K_EXISTS:
			case K_FILTERING:
			case K_FUNCTION:
			case K_KEYS:
			case K_KEYSPACES:
			case K_LANGUAGE:
			case K_LIST:
			case K_MAP:
			case K_NON:
			case K_NOSUPERUSER:
			case K_PASSWORD:
			case K_PERMISSION:
			case K_PERMISSIONS:
			case K_RETURNS:
			case K_STATIC:
			case K_STORAGE:
			case K_SUPERUSER:
			case K_TRIGGER:
			case K_TYPE:
			case K_USER:
			case K_USERS:
			case K_VALUES:
				{
				int LA40_3 = input.LA(2);
				if ( (LA40_3==K_FROM||LA40_3==158) ) {
					alt40=1;
				}
				else if ( (LA40_3==169) ) {
					alt40=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 40, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case K_ASCII:
				{
				int LA40_4 = input.LA(2);
				if ( (LA40_4==K_FROM||LA40_4==158) ) {
					alt40=1;
				}
				else if ( (LA40_4==169) ) {
					alt40=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 40, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case K_BIGINT:
				{
				int LA40_5 = input.LA(2);
				if ( (LA40_5==K_FROM||LA40_5==158) ) {
					alt40=1;
				}
				else if ( (LA40_5==169) ) {
					alt40=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 40, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case K_BLOB:
				{
				int LA40_6 = input.LA(2);
				if ( (LA40_6==K_FROM||LA40_6==158) ) {
					alt40=1;
				}
				else if ( (LA40_6==169) ) {
					alt40=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 40, 6, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case K_BOOLEAN:
				{
				int LA40_7 = input.LA(2);
				if ( (LA40_7==K_FROM||LA40_7==158) ) {
					alt40=1;
				}
				else if ( (LA40_7==169) ) {
					alt40=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 40, 7, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case K_COUNTER:
				{
				int LA40_8 = input.LA(2);
				if ( (LA40_8==K_FROM||LA40_8==158) ) {
					alt40=1;
				}
				else if ( (LA40_8==169) ) {
					alt40=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 40, 8, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case K_DECIMAL:
				{
				int LA40_9 = input.LA(2);
				if ( (LA40_9==K_FROM||LA40_9==158) ) {
					alt40=1;
				}
				else if ( (LA40_9==169) ) {
					alt40=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 40, 9, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case K_DOUBLE:
				{
				int LA40_10 = input.LA(2);
				if ( (LA40_10==K_FROM||LA40_10==158) ) {
					alt40=1;
				}
				else if ( (LA40_10==169) ) {
					alt40=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 40, 10, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case K_FLOAT:
				{
				int LA40_11 = input.LA(2);
				if ( (LA40_11==K_FROM||LA40_11==158) ) {
					alt40=1;
				}
				else if ( (LA40_11==169) ) {
					alt40=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 40, 11, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case K_INET:
				{
				int LA40_12 = input.LA(2);
				if ( (LA40_12==K_FROM||LA40_12==158) ) {
					alt40=1;
				}
				else if ( (LA40_12==169) ) {
					alt40=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 40, 12, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case K_INT:
				{
				int LA40_13 = input.LA(2);
				if ( (LA40_13==K_FROM||LA40_13==158) ) {
					alt40=1;
				}
				else if ( (LA40_13==169) ) {
					alt40=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 40, 13, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case K_TEXT:
				{
				int LA40_14 = input.LA(2);
				if ( (LA40_14==K_FROM||LA40_14==158) ) {
					alt40=1;
				}
				else if ( (LA40_14==169) ) {
					alt40=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 40, 14, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case K_TIMESTAMP:
				{
				int LA40_15 = input.LA(2);
				if ( (LA40_15==K_FROM||LA40_15==158) ) {
					alt40=1;
				}
				else if ( (LA40_15==169) ) {
					alt40=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 40, 15, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case K_UUID:
				{
				int LA40_16 = input.LA(2);
				if ( (LA40_16==K_FROM||LA40_16==158) ) {
					alt40=1;
				}
				else if ( (LA40_16==169) ) {
					alt40=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 40, 16, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case K_VARCHAR:
				{
				int LA40_17 = input.LA(2);
				if ( (LA40_17==K_FROM||LA40_17==158) ) {
					alt40=1;
				}
				else if ( (LA40_17==169) ) {
					alt40=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 40, 17, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case K_VARINT:
				{
				int LA40_18 = input.LA(2);
				if ( (LA40_18==K_FROM||LA40_18==158) ) {
					alt40=1;
				}
				else if ( (LA40_18==169) ) {
					alt40=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 40, 18, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case K_TIMEUUID:
				{
				int LA40_19 = input.LA(2);
				if ( (LA40_19==K_FROM||LA40_19==158) ) {
					alt40=1;
				}
				else if ( (LA40_19==169) ) {
					alt40=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 40, 19, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case K_COUNT:
			case K_KEY:
			case K_TTL:
			case K_WRITETIME:
				{
				int LA40_20 = input.LA(2);
				if ( (LA40_20==K_FROM||LA40_20==158) ) {
					alt40=1;
				}
				else if ( (LA40_20==169) ) {
					alt40=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 40, 20, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 40, 0, input);
				throw nvae;
			}
			switch (alt40) {
				case 1 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:489:7: c= cident
					{
					pushFollow(FOLLOW_cident_in_deleteOp2173);
					c=cident();
					state._fsp--;

					 op = new Operation.ColumnDeletion(c); 
					}
					break;
				case 2 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:490:7: c= cident '[' t= term ']'
					{
					pushFollow(FOLLOW_cident_in_deleteOp2200);
					c=cident();
					state._fsp--;

					match(input,169,FOLLOW_169_in_deleteOp2202); 
					pushFollow(FOLLOW_term_in_deleteOp2206);
					t=term();
					state._fsp--;

					match(input,171,FOLLOW_171_in_deleteOp2208); 
					 op = new Operation.ElementDeletion(c, t); 
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
		return op;
	}
	// $ANTLR end "deleteOp"



	// $ANTLR start "usingClauseDelete"
	// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:493:1: usingClauseDelete[Attributes.Raw attrs] : K_USING K_TIMESTAMP ts= intValue ;
	public final void usingClauseDelete(Attributes.Raw attrs) throws RecognitionException {
		Term.Raw ts =null;

		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:494:5: ( K_USING K_TIMESTAMP ts= intValue )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:494:7: K_USING K_TIMESTAMP ts= intValue
			{
			match(input,K_USING,FOLLOW_K_USING_in_usingClauseDelete2228); 
			match(input,K_TIMESTAMP,FOLLOW_K_TIMESTAMP_in_usingClauseDelete2230); 
			pushFollow(FOLLOW_intValue_in_usingClauseDelete2234);
			ts=intValue();
			state._fsp--;

			 attrs.timestamp = ts; 
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
	// $ANTLR end "usingClauseDelete"



	// $ANTLR start "batchStatement"
	// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:521:1: batchStatement returns [BatchStatement.Parsed expr] : K_BEGIN ( K_UNLOGGED | K_COUNTER )? K_BATCH ( usingClause[attrs] )? (s= batchStatementObjective ( ';' )? )* K_APPLY K_BATCH ;
	public final BatchStatement.Parsed batchStatement() throws RecognitionException {
		BatchStatement.Parsed expr = null;


		ModificationStatement.Parsed s =null;


		        BatchStatement.Type type = BatchStatement.Type.LOGGED;
		        List<ModificationStatement.Parsed> statements = new ArrayList<ModificationStatement.Parsed>();
		        Attributes.Raw attrs = new Attributes.Raw();
		    
		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:527:5: ( K_BEGIN ( K_UNLOGGED | K_COUNTER )? K_BATCH ( usingClause[attrs] )? (s= batchStatementObjective ( ';' )? )* K_APPLY K_BATCH )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:527:7: K_BEGIN ( K_UNLOGGED | K_COUNTER )? K_BATCH ( usingClause[attrs] )? (s= batchStatementObjective ( ';' )? )* K_APPLY K_BATCH
			{
			match(input,K_BEGIN,FOLLOW_K_BEGIN_in_batchStatement2268); 
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:528:7: ( K_UNLOGGED | K_COUNTER )?
			int alt41=3;
			int LA41_0 = input.LA(1);
			if ( (LA41_0==K_UNLOGGED) ) {
				alt41=1;
			}
			else if ( (LA41_0==K_COUNTER) ) {
				alt41=2;
			}
			switch (alt41) {
				case 1 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:528:9: K_UNLOGGED
					{
					match(input,K_UNLOGGED,FOLLOW_K_UNLOGGED_in_batchStatement2278); 
					 type = BatchStatement.Type.UNLOGGED; 
					}
					break;
				case 2 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:528:63: K_COUNTER
					{
					match(input,K_COUNTER,FOLLOW_K_COUNTER_in_batchStatement2284); 
					 type = BatchStatement.Type.COUNTER; 
					}
					break;

			}

			match(input,K_BATCH,FOLLOW_K_BATCH_in_batchStatement2297); 
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:529:15: ( usingClause[attrs] )?
			int alt42=2;
			int LA42_0 = input.LA(1);
			if ( (LA42_0==K_USING) ) {
				alt42=1;
			}
			switch (alt42) {
				case 1 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:529:17: usingClause[attrs]
					{
					pushFollow(FOLLOW_usingClause_in_batchStatement2301);
					usingClause(attrs);
					state._fsp--;

					}
					break;

			}

			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:530:11: (s= batchStatementObjective ( ';' )? )*
			loop44:
			while (true) {
				int alt44=2;
				int LA44_0 = input.LA(1);
				if ( (LA44_0==K_DELETE||LA44_0==K_INSERT||LA44_0==K_UPDATE) ) {
					alt44=1;
				}

				switch (alt44) {
				case 1 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:530:13: s= batchStatementObjective ( ';' )?
					{
					pushFollow(FOLLOW_batchStatementObjective_in_batchStatement2321);
					s=batchStatementObjective();
					state._fsp--;

					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:530:39: ( ';' )?
					int alt43=2;
					int LA43_0 = input.LA(1);
					if ( (LA43_0==163) ) {
						alt43=1;
					}
					switch (alt43) {
						case 1 :
							// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:530:39: ';'
							{
							match(input,163,FOLLOW_163_in_batchStatement2323); 
							}
							break;

					}

					 statements.add(s); 
					}
					break;

				default :
					break loop44;
				}
			}

			match(input,K_APPLY,FOLLOW_K_APPLY_in_batchStatement2337); 
			match(input,K_BATCH,FOLLOW_K_BATCH_in_batchStatement2339); 

			          return new BatchStatement.Parsed(type, attrs, statements);
			      
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "batchStatement"



	// $ANTLR start "batchStatementObjective"
	// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:537:1: batchStatementObjective returns [ModificationStatement.Parsed statement] : (i= insertStatement |u= updateStatement |d= deleteStatement );
	public final ModificationStatement.Parsed batchStatementObjective() throws RecognitionException {
		ModificationStatement.Parsed statement = null;


		UpdateStatement.ParsedInsert i =null;
		UpdateStatement.ParsedUpdate u =null;
		DeleteStatement.Parsed d =null;

		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:538:5: (i= insertStatement |u= updateStatement |d= deleteStatement )
			int alt45=3;
			switch ( input.LA(1) ) {
			case K_INSERT:
				{
				alt45=1;
				}
				break;
			case K_UPDATE:
				{
				alt45=2;
				}
				break;
			case K_DELETE:
				{
				alt45=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 45, 0, input);
				throw nvae;
			}
			switch (alt45) {
				case 1 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:538:7: i= insertStatement
					{
					pushFollow(FOLLOW_insertStatement_in_batchStatementObjective2370);
					i=insertStatement();
					state._fsp--;

					 statement = i; 
					}
					break;
				case 2 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:539:7: u= updateStatement
					{
					pushFollow(FOLLOW_updateStatement_in_batchStatementObjective2383);
					u=updateStatement();
					state._fsp--;

					 statement = u; 
					}
					break;
				case 3 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:540:7: d= deleteStatement
					{
					pushFollow(FOLLOW_deleteStatement_in_batchStatementObjective2396);
					d=deleteStatement();
					state._fsp--;

					 statement = d; 
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
		return statement;
	}
	// $ANTLR end "batchStatementObjective"



	// $ANTLR start "createFunctionStatement"
	// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:543:1: createFunctionStatement returns [CreateFunctionStatement expr] : K_CREATE ( K_OR K_REPLACE )? ( ( K_NON )? K_DETERMINISTIC )? K_FUNCTION ( K_IF K_NOT K_EXISTS )? fn= functionName '(' (k= cident v= comparatorType ( ',' k= cident v= comparatorType )* )? ')' K_RETURNS rt= comparatorType ( ( K_USING cls= STRING_LITERAL ) | ( K_LANGUAGE l= IDENT K_AS ( (body= STRING_LITERAL ) ) ) ) ;
	public final CreateFunctionStatement createFunctionStatement() throws RecognitionException {
		CreateFunctionStatement expr = null;


		Token cls=null;
		Token l=null;
		Token body=null;
		FunctionName fn =null;
		ColumnIdentifier k =null;
		CQL3Type.Raw v =null;
		CQL3Type.Raw rt =null;


		        boolean orReplace = false;
		        boolean ifNotExists = false;

		        boolean deterministic = true;
		        String language = "class";
		        String bodyOrClassName = null;
		        List<ColumnIdentifier> argsNames = new ArrayList<>();
		        List<CQL3Type.Raw> argsTypes = new ArrayList<>();
		    
		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:554:5: ( K_CREATE ( K_OR K_REPLACE )? ( ( K_NON )? K_DETERMINISTIC )? K_FUNCTION ( K_IF K_NOT K_EXISTS )? fn= functionName '(' (k= cident v= comparatorType ( ',' k= cident v= comparatorType )* )? ')' K_RETURNS rt= comparatorType ( ( K_USING cls= STRING_LITERAL ) | ( K_LANGUAGE l= IDENT K_AS ( (body= STRING_LITERAL ) ) ) ) )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:554:7: K_CREATE ( K_OR K_REPLACE )? ( ( K_NON )? K_DETERMINISTIC )? K_FUNCTION ( K_IF K_NOT K_EXISTS )? fn= functionName '(' (k= cident v= comparatorType ( ',' k= cident v= comparatorType )* )? ')' K_RETURNS rt= comparatorType ( ( K_USING cls= STRING_LITERAL ) | ( K_LANGUAGE l= IDENT K_AS ( (body= STRING_LITERAL ) ) ) )
			{
			match(input,K_CREATE,FOLLOW_K_CREATE_in_createFunctionStatement2429); 
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:554:16: ( K_OR K_REPLACE )?
			int alt46=2;
			int LA46_0 = input.LA(1);
			if ( (LA46_0==K_OR) ) {
				alt46=1;
			}
			switch (alt46) {
				case 1 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:554:17: K_OR K_REPLACE
					{
					match(input,K_OR,FOLLOW_K_OR_in_createFunctionStatement2432); 
					match(input,K_REPLACE,FOLLOW_K_REPLACE_in_createFunctionStatement2434); 
					 orReplace = true; 
					}
					break;

			}

			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:555:7: ( ( K_NON )? K_DETERMINISTIC )?
			int alt48=2;
			int LA48_0 = input.LA(1);
			if ( (LA48_0==K_DETERMINISTIC||LA48_0==K_NON) ) {
				alt48=1;
			}
			switch (alt48) {
				case 1 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:555:8: ( K_NON )? K_DETERMINISTIC
					{
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:555:8: ( K_NON )?
					int alt47=2;
					int LA47_0 = input.LA(1);
					if ( (LA47_0==K_NON) ) {
						alt47=1;
					}
					switch (alt47) {
						case 1 :
							// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:555:9: K_NON
							{
							match(input,K_NON,FOLLOW_K_NON_in_createFunctionStatement2448); 
							 deterministic = false; 
							}
							break;

					}

					match(input,K_DETERMINISTIC,FOLLOW_K_DETERMINISTIC_in_createFunctionStatement2454); 
					}
					break;

			}

			match(input,K_FUNCTION,FOLLOW_K_FUNCTION_in_createFunctionStatement2464); 
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:557:7: ( K_IF K_NOT K_EXISTS )?
			int alt49=2;
			int LA49_0 = input.LA(1);
			if ( (LA49_0==K_IF) ) {
				alt49=1;
			}
			switch (alt49) {
				case 1 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:557:8: K_IF K_NOT K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_createFunctionStatement2473); 
					match(input,K_NOT,FOLLOW_K_NOT_in_createFunctionStatement2475); 
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_createFunctionStatement2477); 
					 ifNotExists = true; 
					}
					break;

			}

			pushFollow(FOLLOW_functionName_in_createFunctionStatement2491);
			fn=functionName();
			state._fsp--;

			match(input,155,FOLLOW_155_in_createFunctionStatement2499); 
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:560:9: (k= cident v= comparatorType ( ',' k= cident v= comparatorType )* )?
			int alt51=2;
			int LA51_0 = input.LA(1);
			if ( (LA51_0==IDENT||LA51_0==K_ALL||LA51_0==K_AS||LA51_0==K_ASCII||(LA51_0 >= K_BIGINT && LA51_0 <= K_BOOLEAN)||LA51_0==K_CLUSTERING||LA51_0==K_COMPACT||(LA51_0 >= K_CONTAINS && LA51_0 <= K_COUNTER)||(LA51_0 >= K_CUSTOM && LA51_0 <= K_DECIMAL)||(LA51_0 >= K_DETERMINISTIC && LA51_0 <= K_DOUBLE)||(LA51_0 >= K_EXISTS && LA51_0 <= K_FLOAT)||LA51_0==K_FUNCTION||LA51_0==K_INET||LA51_0==K_INT||(LA51_0 >= K_KEY && LA51_0 <= K_KEYS)||(LA51_0 >= K_KEYSPACES && LA51_0 <= K_LANGUAGE)||(LA51_0 >= K_LIST && LA51_0 <= K_MAP)||LA51_0==K_NON||LA51_0==K_NOSUPERUSER||(LA51_0 >= K_PASSWORD && LA51_0 <= K_PERMISSIONS)||LA51_0==K_RETURNS||(LA51_0 >= K_STATIC && LA51_0 <= K_TEXT)||(LA51_0 >= K_TIMESTAMP && LA51_0 <= K_TIMEUUID)||LA51_0==K_TRIGGER||LA51_0==K_TTL||LA51_0==K_TYPE||(LA51_0 >= K_USER && LA51_0 <= K_USERS)||(LA51_0 >= K_UUID && LA51_0 <= K_VARINT)||LA51_0==K_WRITETIME||LA51_0==QUOTED_NAME) ) {
				alt51=1;
			}
			switch (alt51) {
				case 1 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:561:11: k= cident v= comparatorType ( ',' k= cident v= comparatorType )*
					{
					pushFollow(FOLLOW_cident_in_createFunctionStatement2523);
					k=cident();
					state._fsp--;

					pushFollow(FOLLOW_comparatorType_in_createFunctionStatement2527);
					v=comparatorType();
					state._fsp--;

					 argsNames.add(k); argsTypes.add(v); 
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:562:11: ( ',' k= cident v= comparatorType )*
					loop50:
					while (true) {
						int alt50=2;
						int LA50_0 = input.LA(1);
						if ( (LA50_0==158) ) {
							alt50=1;
						}

						switch (alt50) {
						case 1 :
							// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:562:13: ',' k= cident v= comparatorType
							{
							match(input,158,FOLLOW_158_in_createFunctionStatement2543); 
							pushFollow(FOLLOW_cident_in_createFunctionStatement2547);
							k=cident();
							state._fsp--;

							pushFollow(FOLLOW_comparatorType_in_createFunctionStatement2551);
							v=comparatorType();
							state._fsp--;

							 argsNames.add(k); argsTypes.add(v); 
							}
							break;

						default :
							break loop50;
						}
					}

					}
					break;

			}

			match(input,156,FOLLOW_156_in_createFunctionStatement2575); 
			match(input,K_RETURNS,FOLLOW_K_RETURNS_in_createFunctionStatement2583); 
			pushFollow(FOLLOW_comparatorType_in_createFunctionStatement2593);
			rt=comparatorType();
			state._fsp--;

			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:567:7: ( ( K_USING cls= STRING_LITERAL ) | ( K_LANGUAGE l= IDENT K_AS ( (body= STRING_LITERAL ) ) ) )
			int alt52=2;
			int LA52_0 = input.LA(1);
			if ( (LA52_0==K_USING) ) {
				alt52=1;
			}
			else if ( (LA52_0==K_LANGUAGE) ) {
				alt52=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 52, 0, input);
				throw nvae;
			}

			switch (alt52) {
				case 1 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:568:11: ( K_USING cls= STRING_LITERAL )
					{
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:568:11: ( K_USING cls= STRING_LITERAL )
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:568:13: K_USING cls= STRING_LITERAL
					{
					match(input,K_USING,FOLLOW_K_USING_in_createFunctionStatement2615); 
					cls=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_createFunctionStatement2621); 
					 bodyOrClassName = (cls!=null?cls.getText():null); 
					}

					}
					break;
				case 2 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:569:11: ( K_LANGUAGE l= IDENT K_AS ( (body= STRING_LITERAL ) ) )
					{
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:569:11: ( K_LANGUAGE l= IDENT K_AS ( (body= STRING_LITERAL ) ) )
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:569:13: K_LANGUAGE l= IDENT K_AS ( (body= STRING_LITERAL ) )
					{
					match(input,K_LANGUAGE,FOLLOW_K_LANGUAGE_in_createFunctionStatement2639); 
					l=(Token)match(input,IDENT,FOLLOW_IDENT_in_createFunctionStatement2645); 
					 language=(l!=null?l.getText():null); 
					match(input,K_AS,FOLLOW_K_AS_in_createFunctionStatement2649); 
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:570:13: ( (body= STRING_LITERAL ) )
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:571:15: (body= STRING_LITERAL )
					{
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:571:15: (body= STRING_LITERAL )
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:571:17: body= STRING_LITERAL
					{
					body=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_createFunctionStatement2685); 
					 bodyOrClassName = (body!=null?body.getText():null); 
					}

					}

					}

					}
					break;

			}

			 expr = new CreateFunctionStatement(fn, language.toLowerCase(), bodyOrClassName, deterministic, argsNames, argsTypes, rt, orReplace, ifNotExists); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "createFunctionStatement"



	// $ANTLR start "dropFunctionStatement"
	// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:581:1: dropFunctionStatement returns [DropFunctionStatement expr] : K_DROP K_FUNCTION ( K_IF K_EXISTS )? fn= functionName ( '(' (v= comparatorType ( ',' v= comparatorType )* )? ')' )? ;
	public final DropFunctionStatement dropFunctionStatement() throws RecognitionException {
		DropFunctionStatement expr = null;


		FunctionName fn =null;
		CQL3Type.Raw v =null;


		        boolean ifExists = false;
		        List<CQL3Type.Raw> argsTypes = new ArrayList<>();
		        boolean argsPresent = false;
		    
		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:587:5: ( K_DROP K_FUNCTION ( K_IF K_EXISTS )? fn= functionName ( '(' (v= comparatorType ( ',' v= comparatorType )* )? ')' )? )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:587:7: K_DROP K_FUNCTION ( K_IF K_EXISTS )? fn= functionName ( '(' (v= comparatorType ( ',' v= comparatorType )* )? ')' )?
			{
			match(input,K_DROP,FOLLOW_K_DROP_in_dropFunctionStatement2807); 
			match(input,K_FUNCTION,FOLLOW_K_FUNCTION_in_dropFunctionStatement2809); 
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:588:7: ( K_IF K_EXISTS )?
			int alt53=2;
			int LA53_0 = input.LA(1);
			if ( (LA53_0==K_IF) ) {
				alt53=1;
			}
			switch (alt53) {
				case 1 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:588:8: K_IF K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_dropFunctionStatement2818); 
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_dropFunctionStatement2820); 
					 ifExists = true; 
					}
					break;

			}

			pushFollow(FOLLOW_functionName_in_dropFunctionStatement2835);
			fn=functionName();
			state._fsp--;

			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:590:7: ( '(' (v= comparatorType ( ',' v= comparatorType )* )? ')' )?
			int alt56=2;
			int LA56_0 = input.LA(1);
			if ( (LA56_0==155) ) {
				alt56=1;
			}
			switch (alt56) {
				case 1 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:591:9: '(' (v= comparatorType ( ',' v= comparatorType )* )? ')'
					{
					match(input,155,FOLLOW_155_in_dropFunctionStatement2853); 
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:592:11: (v= comparatorType ( ',' v= comparatorType )* )?
					int alt55=2;
					int LA55_0 = input.LA(1);
					if ( (LA55_0==IDENT||LA55_0==K_ALL||LA55_0==K_AS||LA55_0==K_ASCII||(LA55_0 >= K_BIGINT && LA55_0 <= K_BOOLEAN)||LA55_0==K_CLUSTERING||LA55_0==K_COMPACT||(LA55_0 >= K_CONTAINS && LA55_0 <= K_COUNTER)||(LA55_0 >= K_CUSTOM && LA55_0 <= K_DECIMAL)||(LA55_0 >= K_DETERMINISTIC && LA55_0 <= K_DOUBLE)||(LA55_0 >= K_EXISTS && LA55_0 <= K_FLOAT)||(LA55_0 >= K_FROZEN && LA55_0 <= K_FUNCTION)||LA55_0==K_INET||LA55_0==K_INT||(LA55_0 >= K_KEY && LA55_0 <= K_KEYS)||(LA55_0 >= K_KEYSPACES && LA55_0 <= K_LANGUAGE)||(LA55_0 >= K_LIST && LA55_0 <= K_MAP)||LA55_0==K_NON||LA55_0==K_NOSUPERUSER||(LA55_0 >= K_PASSWORD && LA55_0 <= K_PERMISSIONS)||LA55_0==K_RETURNS||(LA55_0 >= K_SET && LA55_0 <= K_TEXT)||(LA55_0 >= K_TIMESTAMP && LA55_0 <= K_TIMEUUID)||LA55_0==K_TRIGGER||(LA55_0 >= K_TTL && LA55_0 <= K_TYPE)||(LA55_0 >= K_USER && LA55_0 <= K_USERS)||(LA55_0 >= K_UUID && LA55_0 <= K_VARINT)||LA55_0==K_WRITETIME||LA55_0==QUOTED_NAME||LA55_0==STRING_LITERAL) ) {
						alt55=1;
					}
					switch (alt55) {
						case 1 :
							// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:593:13: v= comparatorType ( ',' v= comparatorType )*
							{
							pushFollow(FOLLOW_comparatorType_in_dropFunctionStatement2881);
							v=comparatorType();
							state._fsp--;

							 argsTypes.add(v); 
							// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:594:13: ( ',' v= comparatorType )*
							loop54:
							while (true) {
								int alt54=2;
								int LA54_0 = input.LA(1);
								if ( (LA54_0==158) ) {
									alt54=1;
								}

								switch (alt54) {
								case 1 :
									// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:594:15: ',' v= comparatorType
									{
									match(input,158,FOLLOW_158_in_dropFunctionStatement2899); 
									pushFollow(FOLLOW_comparatorType_in_dropFunctionStatement2903);
									v=comparatorType();
									state._fsp--;

									 argsTypes.add(v); 
									}
									break;

								default :
									break loop54;
								}
							}

							}
							break;

					}

					match(input,156,FOLLOW_156_in_dropFunctionStatement2931); 
					 argsPresent = true; 
					}
					break;

			}

			 expr = new DropFunctionStatement(fn, argsTypes, argsPresent, ifExists); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "dropFunctionStatement"



	// $ANTLR start "createKeyspaceStatement"
	// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:605:1: createKeyspaceStatement returns [CreateKeyspaceStatement expr] : K_CREATE K_KEYSPACE ( K_IF K_NOT K_EXISTS )? ks= keyspaceName K_WITH properties[attrs] ;
	public final CreateKeyspaceStatement createKeyspaceStatement() throws RecognitionException {
		CreateKeyspaceStatement expr = null;


		String ks =null;


		        KSPropDefs attrs = new KSPropDefs();
		        boolean ifNotExists = false;
		    
		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:610:5: ( K_CREATE K_KEYSPACE ( K_IF K_NOT K_EXISTS )? ks= keyspaceName K_WITH properties[attrs] )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:610:7: K_CREATE K_KEYSPACE ( K_IF K_NOT K_EXISTS )? ks= keyspaceName K_WITH properties[attrs]
			{
			match(input,K_CREATE,FOLLOW_K_CREATE_in_createKeyspaceStatement2990); 
			match(input,K_KEYSPACE,FOLLOW_K_KEYSPACE_in_createKeyspaceStatement2992); 
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:610:27: ( K_IF K_NOT K_EXISTS )?
			int alt57=2;
			int LA57_0 = input.LA(1);
			if ( (LA57_0==K_IF) ) {
				alt57=1;
			}
			switch (alt57) {
				case 1 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:610:28: K_IF K_NOT K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_createKeyspaceStatement2995); 
					match(input,K_NOT,FOLLOW_K_NOT_in_createKeyspaceStatement2997); 
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_createKeyspaceStatement2999); 
					 ifNotExists = true; 
					}
					break;

			}

			pushFollow(FOLLOW_keyspaceName_in_createKeyspaceStatement3008);
			ks=keyspaceName();
			state._fsp--;

			match(input,K_WITH,FOLLOW_K_WITH_in_createKeyspaceStatement3016); 
			pushFollow(FOLLOW_properties_in_createKeyspaceStatement3018);
			properties(attrs);
			state._fsp--;

			 expr = new CreateKeyspaceStatement(ks, attrs, ifNotExists); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "createKeyspaceStatement"



	// $ANTLR start "createTableStatement"
	// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:621:1: createTableStatement returns [CreateTableStatement.RawStatement expr] : K_CREATE K_COLUMNFAMILY ( K_IF K_NOT K_EXISTS )? cf= columnFamilyName cfamDefinition[expr] ;
	public final CreateTableStatement.RawStatement createTableStatement() throws RecognitionException {
		CreateTableStatement.RawStatement expr = null;


		CFName cf =null;

		 boolean ifNotExists = false; 
		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:623:5: ( K_CREATE K_COLUMNFAMILY ( K_IF K_NOT K_EXISTS )? cf= columnFamilyName cfamDefinition[expr] )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:623:7: K_CREATE K_COLUMNFAMILY ( K_IF K_NOT K_EXISTS )? cf= columnFamilyName cfamDefinition[expr]
			{
			match(input,K_CREATE,FOLLOW_K_CREATE_in_createTableStatement3053); 
			match(input,K_COLUMNFAMILY,FOLLOW_K_COLUMNFAMILY_in_createTableStatement3055); 
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:623:31: ( K_IF K_NOT K_EXISTS )?
			int alt58=2;
			int LA58_0 = input.LA(1);
			if ( (LA58_0==K_IF) ) {
				alt58=1;
			}
			switch (alt58) {
				case 1 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:623:32: K_IF K_NOT K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_createTableStatement3058); 
					match(input,K_NOT,FOLLOW_K_NOT_in_createTableStatement3060); 
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_createTableStatement3062); 
					 ifNotExists = true; 
					}
					break;

			}

			pushFollow(FOLLOW_columnFamilyName_in_createTableStatement3077);
			cf=columnFamilyName();
			state._fsp--;

			 expr = new CreateTableStatement.RawStatement(cf, ifNotExists); 
			pushFollow(FOLLOW_cfamDefinition_in_createTableStatement3087);
			cfamDefinition(expr);
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
		return expr;
	}
	// $ANTLR end "createTableStatement"



	// $ANTLR start "cfamDefinition"
	// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:628:1: cfamDefinition[CreateTableStatement.RawStatement expr] : '(' cfamColumns[expr] ( ',' ( cfamColumns[expr] )? )* ')' ( K_WITH cfamProperty[expr] ( K_AND cfamProperty[expr] )* )? ;
	public final void cfamDefinition(CreateTableStatement.RawStatement expr) throws RecognitionException {
		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:629:5: ( '(' cfamColumns[expr] ( ',' ( cfamColumns[expr] )? )* ')' ( K_WITH cfamProperty[expr] ( K_AND cfamProperty[expr] )* )? )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:629:7: '(' cfamColumns[expr] ( ',' ( cfamColumns[expr] )? )* ')' ( K_WITH cfamProperty[expr] ( K_AND cfamProperty[expr] )* )?
			{
			match(input,155,FOLLOW_155_in_cfamDefinition3106); 
			pushFollow(FOLLOW_cfamColumns_in_cfamDefinition3108);
			cfamColumns(expr);
			state._fsp--;

			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:629:29: ( ',' ( cfamColumns[expr] )? )*
			loop60:
			while (true) {
				int alt60=2;
				int LA60_0 = input.LA(1);
				if ( (LA60_0==158) ) {
					alt60=1;
				}

				switch (alt60) {
				case 1 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:629:31: ',' ( cfamColumns[expr] )?
					{
					match(input,158,FOLLOW_158_in_cfamDefinition3113); 
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:629:35: ( cfamColumns[expr] )?
					int alt59=2;
					int LA59_0 = input.LA(1);
					if ( (LA59_0==IDENT||LA59_0==K_ALL||LA59_0==K_AS||LA59_0==K_ASCII||(LA59_0 >= K_BIGINT && LA59_0 <= K_BOOLEAN)||LA59_0==K_CLUSTERING||LA59_0==K_COMPACT||(LA59_0 >= K_CONTAINS && LA59_0 <= K_COUNTER)||(LA59_0 >= K_CUSTOM && LA59_0 <= K_DECIMAL)||(LA59_0 >= K_DETERMINISTIC && LA59_0 <= K_DOUBLE)||(LA59_0 >= K_EXISTS && LA59_0 <= K_FLOAT)||LA59_0==K_FUNCTION||LA59_0==K_INET||LA59_0==K_INT||(LA59_0 >= K_KEY && LA59_0 <= K_KEYS)||(LA59_0 >= K_KEYSPACES && LA59_0 <= K_LANGUAGE)||(LA59_0 >= K_LIST && LA59_0 <= K_MAP)||LA59_0==K_NON||LA59_0==K_NOSUPERUSER||(LA59_0 >= K_PASSWORD && LA59_0 <= K_PRIMARY)||LA59_0==K_RETURNS||(LA59_0 >= K_STATIC && LA59_0 <= K_TEXT)||(LA59_0 >= K_TIMESTAMP && LA59_0 <= K_TIMEUUID)||LA59_0==K_TRIGGER||LA59_0==K_TTL||LA59_0==K_TYPE||(LA59_0 >= K_USER && LA59_0 <= K_USERS)||(LA59_0 >= K_UUID && LA59_0 <= K_VARINT)||LA59_0==K_WRITETIME||LA59_0==QUOTED_NAME) ) {
						alt59=1;
					}
					switch (alt59) {
						case 1 :
							// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:629:35: cfamColumns[expr]
							{
							pushFollow(FOLLOW_cfamColumns_in_cfamDefinition3115);
							cfamColumns(expr);
							state._fsp--;

							}
							break;

					}

					}
					break;

				default :
					break loop60;
				}
			}

			match(input,156,FOLLOW_156_in_cfamDefinition3122); 
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:630:7: ( K_WITH cfamProperty[expr] ( K_AND cfamProperty[expr] )* )?
			int alt62=2;
			int LA62_0 = input.LA(1);
			if ( (LA62_0==K_WITH) ) {
				alt62=1;
			}
			switch (alt62) {
				case 1 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:630:9: K_WITH cfamProperty[expr] ( K_AND cfamProperty[expr] )*
					{
					match(input,K_WITH,FOLLOW_K_WITH_in_cfamDefinition3132); 
					pushFollow(FOLLOW_cfamProperty_in_cfamDefinition3134);
					cfamProperty(expr);
					state._fsp--;

					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:630:35: ( K_AND cfamProperty[expr] )*
					loop61:
					while (true) {
						int alt61=2;
						int LA61_0 = input.LA(1);
						if ( (LA61_0==K_AND) ) {
							alt61=1;
						}

						switch (alt61) {
						case 1 :
							// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:630:37: K_AND cfamProperty[expr]
							{
							match(input,K_AND,FOLLOW_K_AND_in_cfamDefinition3139); 
							pushFollow(FOLLOW_cfamProperty_in_cfamDefinition3141);
							cfamProperty(expr);
							state._fsp--;

							}
							break;

						default :
							break loop61;
						}
					}

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
	// $ANTLR end "cfamDefinition"



	// $ANTLR start "cfamColumns"
	// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:633:1: cfamColumns[CreateTableStatement.RawStatement expr] : (k= cident v= comparatorType ( K_STATIC )? ( K_PRIMARY K_KEY )? | K_PRIMARY K_KEY '(' pkDef[expr] ( ',' c= cident )* ')' );
	public final void cfamColumns(CreateTableStatement.RawStatement expr) throws RecognitionException {
		ColumnIdentifier k =null;
		CQL3Type.Raw v =null;
		ColumnIdentifier c =null;

		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:634:5: (k= cident v= comparatorType ( K_STATIC )? ( K_PRIMARY K_KEY )? | K_PRIMARY K_KEY '(' pkDef[expr] ( ',' c= cident )* ')' )
			int alt66=2;
			int LA66_0 = input.LA(1);
			if ( (LA66_0==IDENT||LA66_0==K_ALL||LA66_0==K_AS||LA66_0==K_ASCII||(LA66_0 >= K_BIGINT && LA66_0 <= K_BOOLEAN)||LA66_0==K_CLUSTERING||LA66_0==K_COMPACT||(LA66_0 >= K_CONTAINS && LA66_0 <= K_COUNTER)||(LA66_0 >= K_CUSTOM && LA66_0 <= K_DECIMAL)||(LA66_0 >= K_DETERMINISTIC && LA66_0 <= K_DOUBLE)||(LA66_0 >= K_EXISTS && LA66_0 <= K_FLOAT)||LA66_0==K_FUNCTION||LA66_0==K_INET||LA66_0==K_INT||(LA66_0 >= K_KEY && LA66_0 <= K_KEYS)||(LA66_0 >= K_KEYSPACES && LA66_0 <= K_LANGUAGE)||(LA66_0 >= K_LIST && LA66_0 <= K_MAP)||LA66_0==K_NON||LA66_0==K_NOSUPERUSER||(LA66_0 >= K_PASSWORD && LA66_0 <= K_PERMISSIONS)||LA66_0==K_RETURNS||(LA66_0 >= K_STATIC && LA66_0 <= K_TEXT)||(LA66_0 >= K_TIMESTAMP && LA66_0 <= K_TIMEUUID)||LA66_0==K_TRIGGER||LA66_0==K_TTL||LA66_0==K_TYPE||(LA66_0 >= K_USER && LA66_0 <= K_USERS)||(LA66_0 >= K_UUID && LA66_0 <= K_VARINT)||LA66_0==K_WRITETIME||LA66_0==QUOTED_NAME) ) {
				alt66=1;
			}
			else if ( (LA66_0==K_PRIMARY) ) {
				alt66=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 66, 0, input);
				throw nvae;
			}

			switch (alt66) {
				case 1 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:634:7: k= cident v= comparatorType ( K_STATIC )? ( K_PRIMARY K_KEY )?
					{
					pushFollow(FOLLOW_cident_in_cfamColumns3167);
					k=cident();
					state._fsp--;

					pushFollow(FOLLOW_comparatorType_in_cfamColumns3171);
					v=comparatorType();
					state._fsp--;

					 boolean isStatic=false; 
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:634:61: ( K_STATIC )?
					int alt63=2;
					int LA63_0 = input.LA(1);
					if ( (LA63_0==K_STATIC) ) {
						alt63=1;
					}
					switch (alt63) {
						case 1 :
							// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:634:62: K_STATIC
							{
							match(input,K_STATIC,FOLLOW_K_STATIC_in_cfamColumns3176); 
							isStatic = true;
							}
							break;

					}

					 expr.addDefinition(k, v, isStatic); 
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:635:9: ( K_PRIMARY K_KEY )?
					int alt64=2;
					int LA64_0 = input.LA(1);
					if ( (LA64_0==K_PRIMARY) ) {
						alt64=1;
					}
					switch (alt64) {
						case 1 :
							// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:635:10: K_PRIMARY K_KEY
							{
							match(input,K_PRIMARY,FOLLOW_K_PRIMARY_in_cfamColumns3193); 
							match(input,K_KEY,FOLLOW_K_KEY_in_cfamColumns3195); 
							 expr.addKeyAliases(Collections.singletonList(k)); 
							}
							break;

					}

					}
					break;
				case 2 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:636:7: K_PRIMARY K_KEY '(' pkDef[expr] ( ',' c= cident )* ')'
					{
					match(input,K_PRIMARY,FOLLOW_K_PRIMARY_in_cfamColumns3207); 
					match(input,K_KEY,FOLLOW_K_KEY_in_cfamColumns3209); 
					match(input,155,FOLLOW_155_in_cfamColumns3211); 
					pushFollow(FOLLOW_pkDef_in_cfamColumns3213);
					pkDef(expr);
					state._fsp--;

					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:636:39: ( ',' c= cident )*
					loop65:
					while (true) {
						int alt65=2;
						int LA65_0 = input.LA(1);
						if ( (LA65_0==158) ) {
							alt65=1;
						}

						switch (alt65) {
						case 1 :
							// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:636:40: ',' c= cident
							{
							match(input,158,FOLLOW_158_in_cfamColumns3217); 
							pushFollow(FOLLOW_cident_in_cfamColumns3221);
							c=cident();
							state._fsp--;

							 expr.addColumnAlias(c); 
							}
							break;

						default :
							break loop65;
						}
					}

					match(input,156,FOLLOW_156_in_cfamColumns3228); 
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
	// $ANTLR end "cfamColumns"



	// $ANTLR start "pkDef"
	// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:639:1: pkDef[CreateTableStatement.RawStatement expr] : (k= cident | '(' k1= cident ( ',' kn= cident )* ')' );
	public final void pkDef(CreateTableStatement.RawStatement expr) throws RecognitionException {
		ColumnIdentifier k =null;
		ColumnIdentifier k1 =null;
		ColumnIdentifier kn =null;

		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:640:5: (k= cident | '(' k1= cident ( ',' kn= cident )* ')' )
			int alt68=2;
			int LA68_0 = input.LA(1);
			if ( (LA68_0==IDENT||LA68_0==K_ALL||LA68_0==K_AS||LA68_0==K_ASCII||(LA68_0 >= K_BIGINT && LA68_0 <= K_BOOLEAN)||LA68_0==K_CLUSTERING||LA68_0==K_COMPACT||(LA68_0 >= K_CONTAINS && LA68_0 <= K_COUNTER)||(LA68_0 >= K_CUSTOM && LA68_0 <= K_DECIMAL)||(LA68_0 >= K_DETERMINISTIC && LA68_0 <= K_DOUBLE)||(LA68_0 >= K_EXISTS && LA68_0 <= K_FLOAT)||LA68_0==K_FUNCTION||LA68_0==K_INET||LA68_0==K_INT||(LA68_0 >= K_KEY && LA68_0 <= K_KEYS)||(LA68_0 >= K_KEYSPACES && LA68_0 <= K_LANGUAGE)||(LA68_0 >= K_LIST && LA68_0 <= K_MAP)||LA68_0==K_NON||LA68_0==K_NOSUPERUSER||(LA68_0 >= K_PASSWORD && LA68_0 <= K_PERMISSIONS)||LA68_0==K_RETURNS||(LA68_0 >= K_STATIC && LA68_0 <= K_TEXT)||(LA68_0 >= K_TIMESTAMP && LA68_0 <= K_TIMEUUID)||LA68_0==K_TRIGGER||LA68_0==K_TTL||LA68_0==K_TYPE||(LA68_0 >= K_USER && LA68_0 <= K_USERS)||(LA68_0 >= K_UUID && LA68_0 <= K_VARINT)||LA68_0==K_WRITETIME||LA68_0==QUOTED_NAME) ) {
				alt68=1;
			}
			else if ( (LA68_0==155) ) {
				alt68=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 68, 0, input);
				throw nvae;
			}

			switch (alt68) {
				case 1 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:640:7: k= cident
					{
					pushFollow(FOLLOW_cident_in_pkDef3248);
					k=cident();
					state._fsp--;

					 expr.addKeyAliases(Collections.singletonList(k)); 
					}
					break;
				case 2 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:641:7: '(' k1= cident ( ',' kn= cident )* ')'
					{
					match(input,155,FOLLOW_155_in_pkDef3258); 
					 List<ColumnIdentifier> l = new ArrayList<ColumnIdentifier>(); 
					pushFollow(FOLLOW_cident_in_pkDef3264);
					k1=cident();
					state._fsp--;

					 l.add(k1); 
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:641:102: ( ',' kn= cident )*
					loop67:
					while (true) {
						int alt67=2;
						int LA67_0 = input.LA(1);
						if ( (LA67_0==158) ) {
							alt67=1;
						}

						switch (alt67) {
						case 1 :
							// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:641:104: ',' kn= cident
							{
							match(input,158,FOLLOW_158_in_pkDef3270); 
							pushFollow(FOLLOW_cident_in_pkDef3274);
							kn=cident();
							state._fsp--;

							 l.add(kn); 
							}
							break;

						default :
							break loop67;
						}
					}

					match(input,156,FOLLOW_156_in_pkDef3281); 
					 expr.addKeyAliases(l); 
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
	// $ANTLR end "pkDef"



	// $ANTLR start "cfamProperty"
	// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:644:1: cfamProperty[CreateTableStatement.RawStatement expr] : ( property[expr.properties] | K_COMPACT K_STORAGE | K_CLUSTERING K_ORDER K_BY '(' cfamOrdering[expr] ( ',' cfamOrdering[expr] )* ')' );
	public final void cfamProperty(CreateTableStatement.RawStatement expr) throws RecognitionException {
		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:645:5: ( property[expr.properties] | K_COMPACT K_STORAGE | K_CLUSTERING K_ORDER K_BY '(' cfamOrdering[expr] ( ',' cfamOrdering[expr] )* ')' )
			int alt70=3;
			switch ( input.LA(1) ) {
			case IDENT:
			case K_ALL:
			case K_AS:
			case K_ASCII:
			case K_BIGINT:
			case K_BLOB:
			case K_BOOLEAN:
			case K_CONTAINS:
			case K_COUNT:
			case K_COUNTER:
			case K_CUSTOM:
			case K_DECIMAL:
			case K_DETERMINISTIC:
			case K_DISTINCT:
			case K_DOUBLE:
			case K_EXISTS:
			case K_FILTERING:
			case K_FLOAT:
			case K_FUNCTION:
			case K_INET:
			case K_INT:
			case K_KEY:
			case K_KEYS:
			case K_KEYSPACES:
			case K_LANGUAGE:
			case K_LIST:
			case K_MAP:
			case K_NON:
			case K_NOSUPERUSER:
			case K_PASSWORD:
			case K_PERMISSION:
			case K_PERMISSIONS:
			case K_RETURNS:
			case K_STATIC:
			case K_STORAGE:
			case K_SUPERUSER:
			case K_TEXT:
			case K_TIMESTAMP:
			case K_TIMEUUID:
			case K_TRIGGER:
			case K_TTL:
			case K_TYPE:
			case K_USER:
			case K_USERS:
			case K_UUID:
			case K_VALUES:
			case K_VARCHAR:
			case K_VARINT:
			case K_WRITETIME:
			case QUOTED_NAME:
				{
				alt70=1;
				}
				break;
			case K_COMPACT:
				{
				int LA70_2 = input.LA(2);
				if ( (LA70_2==K_STORAGE) ) {
					alt70=2;
				}
				else if ( (LA70_2==166) ) {
					alt70=1;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 70, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case K_CLUSTERING:
				{
				int LA70_3 = input.LA(2);
				if ( (LA70_3==K_ORDER) ) {
					alt70=3;
				}
				else if ( (LA70_3==166) ) {
					alt70=1;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 70, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 70, 0, input);
				throw nvae;
			}
			switch (alt70) {
				case 1 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:645:7: property[expr.properties]
					{
					pushFollow(FOLLOW_property_in_cfamProperty3301);
					property(expr.properties);
					state._fsp--;

					}
					break;
				case 2 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:646:7: K_COMPACT K_STORAGE
					{
					match(input,K_COMPACT,FOLLOW_K_COMPACT_in_cfamProperty3310); 
					match(input,K_STORAGE,FOLLOW_K_STORAGE_in_cfamProperty3312); 
					 expr.setCompactStorage(); 
					}
					break;
				case 3 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:647:7: K_CLUSTERING K_ORDER K_BY '(' cfamOrdering[expr] ( ',' cfamOrdering[expr] )* ')'
					{
					match(input,K_CLUSTERING,FOLLOW_K_CLUSTERING_in_cfamProperty3322); 
					match(input,K_ORDER,FOLLOW_K_ORDER_in_cfamProperty3324); 
					match(input,K_BY,FOLLOW_K_BY_in_cfamProperty3326); 
					match(input,155,FOLLOW_155_in_cfamProperty3328); 
					pushFollow(FOLLOW_cfamOrdering_in_cfamProperty3330);
					cfamOrdering(expr);
					state._fsp--;

					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:647:56: ( ',' cfamOrdering[expr] )*
					loop69:
					while (true) {
						int alt69=2;
						int LA69_0 = input.LA(1);
						if ( (LA69_0==158) ) {
							alt69=1;
						}

						switch (alt69) {
						case 1 :
							// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:647:57: ',' cfamOrdering[expr]
							{
							match(input,158,FOLLOW_158_in_cfamProperty3334); 
							pushFollow(FOLLOW_cfamOrdering_in_cfamProperty3336);
							cfamOrdering(expr);
							state._fsp--;

							}
							break;

						default :
							break loop69;
						}
					}

					match(input,156,FOLLOW_156_in_cfamProperty3341); 
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
	// $ANTLR end "cfamProperty"



	// $ANTLR start "cfamOrdering"
	// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:650:1: cfamOrdering[CreateTableStatement.RawStatement expr] : k= cident ( K_ASC | K_DESC ) ;
	public final void cfamOrdering(CreateTableStatement.RawStatement expr) throws RecognitionException {
		ColumnIdentifier k =null;

		 boolean reversed=false; 
		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:652:5: (k= cident ( K_ASC | K_DESC ) )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:652:7: k= cident ( K_ASC | K_DESC )
			{
			pushFollow(FOLLOW_cident_in_cfamOrdering3369);
			k=cident();
			state._fsp--;

			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:652:16: ( K_ASC | K_DESC )
			int alt71=2;
			int LA71_0 = input.LA(1);
			if ( (LA71_0==K_ASC) ) {
				alt71=1;
			}
			else if ( (LA71_0==K_DESC) ) {
				alt71=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 71, 0, input);
				throw nvae;
			}

			switch (alt71) {
				case 1 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:652:17: K_ASC
					{
					match(input,K_ASC,FOLLOW_K_ASC_in_cfamOrdering3372); 
					}
					break;
				case 2 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:652:25: K_DESC
					{
					match(input,K_DESC,FOLLOW_K_DESC_in_cfamOrdering3376); 
					 reversed=true;
					}
					break;

			}

			 expr.setOrdering(k, reversed); 
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
	// $ANTLR end "cfamOrdering"



	// $ANTLR start "createTypeStatement"
	// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:663:1: createTypeStatement returns [CreateTypeStatement expr] : K_CREATE K_TYPE ( K_IF K_NOT K_EXISTS )? tn= userTypeName '(' typeColumns[expr] ( ',' ( typeColumns[expr] )? )* ')' ;
	public final CreateTypeStatement createTypeStatement() throws RecognitionException {
		CreateTypeStatement expr = null;


		UTName tn =null;

		 boolean ifNotExists = false; 
		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:665:5: ( K_CREATE K_TYPE ( K_IF K_NOT K_EXISTS )? tn= userTypeName '(' typeColumns[expr] ( ',' ( typeColumns[expr] )? )* ')' )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:665:7: K_CREATE K_TYPE ( K_IF K_NOT K_EXISTS )? tn= userTypeName '(' typeColumns[expr] ( ',' ( typeColumns[expr] )? )* ')'
			{
			match(input,K_CREATE,FOLLOW_K_CREATE_in_createTypeStatement3415); 
			match(input,K_TYPE,FOLLOW_K_TYPE_in_createTypeStatement3417); 
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:665:23: ( K_IF K_NOT K_EXISTS )?
			int alt72=2;
			int LA72_0 = input.LA(1);
			if ( (LA72_0==K_IF) ) {
				alt72=1;
			}
			switch (alt72) {
				case 1 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:665:24: K_IF K_NOT K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_createTypeStatement3420); 
					match(input,K_NOT,FOLLOW_K_NOT_in_createTypeStatement3422); 
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_createTypeStatement3424); 
					 ifNotExists = true; 
					}
					break;

			}

			pushFollow(FOLLOW_userTypeName_in_createTypeStatement3442);
			tn=userTypeName();
			state._fsp--;

			 expr = new CreateTypeStatement(tn, ifNotExists); 
			match(input,155,FOLLOW_155_in_createTypeStatement3455); 
			pushFollow(FOLLOW_typeColumns_in_createTypeStatement3457);
			typeColumns(expr);
			state._fsp--;

			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:667:32: ( ',' ( typeColumns[expr] )? )*
			loop74:
			while (true) {
				int alt74=2;
				int LA74_0 = input.LA(1);
				if ( (LA74_0==158) ) {
					alt74=1;
				}

				switch (alt74) {
				case 1 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:667:34: ',' ( typeColumns[expr] )?
					{
					match(input,158,FOLLOW_158_in_createTypeStatement3462); 
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:667:38: ( typeColumns[expr] )?
					int alt73=2;
					int LA73_0 = input.LA(1);
					if ( (LA73_0==IDENT||LA73_0==K_ALL||LA73_0==K_AS||LA73_0==K_ASCII||(LA73_0 >= K_BIGINT && LA73_0 <= K_BOOLEAN)||LA73_0==K_CLUSTERING||LA73_0==K_COMPACT||(LA73_0 >= K_CONTAINS && LA73_0 <= K_COUNTER)||(LA73_0 >= K_CUSTOM && LA73_0 <= K_DECIMAL)||(LA73_0 >= K_DETERMINISTIC && LA73_0 <= K_DOUBLE)||(LA73_0 >= K_EXISTS && LA73_0 <= K_FLOAT)||LA73_0==K_FUNCTION||LA73_0==K_INET||LA73_0==K_INT||(LA73_0 >= K_KEY && LA73_0 <= K_KEYS)||(LA73_0 >= K_KEYSPACES && LA73_0 <= K_LANGUAGE)||(LA73_0 >= K_LIST && LA73_0 <= K_MAP)||LA73_0==K_NON||LA73_0==K_NOSUPERUSER||(LA73_0 >= K_PASSWORD && LA73_0 <= K_PERMISSIONS)||LA73_0==K_RETURNS||(LA73_0 >= K_STATIC && LA73_0 <= K_TEXT)||(LA73_0 >= K_TIMESTAMP && LA73_0 <= K_TIMEUUID)||LA73_0==K_TRIGGER||LA73_0==K_TTL||LA73_0==K_TYPE||(LA73_0 >= K_USER && LA73_0 <= K_USERS)||(LA73_0 >= K_UUID && LA73_0 <= K_VARINT)||LA73_0==K_WRITETIME||LA73_0==QUOTED_NAME) ) {
						alt73=1;
					}
					switch (alt73) {
						case 1 :
							// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:667:38: typeColumns[expr]
							{
							pushFollow(FOLLOW_typeColumns_in_createTypeStatement3464);
							typeColumns(expr);
							state._fsp--;

							}
							break;

					}

					}
					break;

				default :
					break loop74;
				}
			}

			match(input,156,FOLLOW_156_in_createTypeStatement3471); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "createTypeStatement"



	// $ANTLR start "typeColumns"
	// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:670:1: typeColumns[CreateTypeStatement expr] : k= cident v= comparatorType ;
	public final void typeColumns(CreateTypeStatement expr) throws RecognitionException {
		ColumnIdentifier k =null;
		CQL3Type.Raw v =null;

		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:671:5: (k= cident v= comparatorType )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:671:7: k= cident v= comparatorType
			{
			pushFollow(FOLLOW_cident_in_typeColumns3491);
			k=cident();
			state._fsp--;

			pushFollow(FOLLOW_comparatorType_in_typeColumns3495);
			v=comparatorType();
			state._fsp--;

			 expr.addDefinition(k, v); 
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
	// $ANTLR end "typeColumns"



	// $ANTLR start "createIndexStatement"
	// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:679:1: createIndexStatement returns [CreateIndexStatement expr] : K_CREATE ( K_CUSTOM )? K_INDEX ( K_IF K_NOT K_EXISTS )? (idxName= IDENT )? K_ON cf= columnFamilyName '(' id= indexIdent ')' ( K_USING cls= STRING_LITERAL )? ( K_WITH properties[props] )? ;
	public final CreateIndexStatement createIndexStatement() throws RecognitionException {
		CreateIndexStatement expr = null;


		Token idxName=null;
		Token cls=null;
		CFName cf =null;
		IndexTarget id =null;


		        IndexPropDefs props = new IndexPropDefs();
		        boolean ifNotExists = false;
		    
		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:684:5: ( K_CREATE ( K_CUSTOM )? K_INDEX ( K_IF K_NOT K_EXISTS )? (idxName= IDENT )? K_ON cf= columnFamilyName '(' id= indexIdent ')' ( K_USING cls= STRING_LITERAL )? ( K_WITH properties[props] )? )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:684:7: K_CREATE ( K_CUSTOM )? K_INDEX ( K_IF K_NOT K_EXISTS )? (idxName= IDENT )? K_ON cf= columnFamilyName '(' id= indexIdent ')' ( K_USING cls= STRING_LITERAL )? ( K_WITH properties[props] )?
			{
			match(input,K_CREATE,FOLLOW_K_CREATE_in_createIndexStatement3530); 
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:684:16: ( K_CUSTOM )?
			int alt75=2;
			int LA75_0 = input.LA(1);
			if ( (LA75_0==K_CUSTOM) ) {
				alt75=1;
			}
			switch (alt75) {
				case 1 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:684:17: K_CUSTOM
					{
					match(input,K_CUSTOM,FOLLOW_K_CUSTOM_in_createIndexStatement3533); 
					 props.isCustom = true; 
					}
					break;

			}

			match(input,K_INDEX,FOLLOW_K_INDEX_in_createIndexStatement3539); 
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:684:63: ( K_IF K_NOT K_EXISTS )?
			int alt76=2;
			int LA76_0 = input.LA(1);
			if ( (LA76_0==K_IF) ) {
				alt76=1;
			}
			switch (alt76) {
				case 1 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:684:64: K_IF K_NOT K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_createIndexStatement3542); 
					match(input,K_NOT,FOLLOW_K_NOT_in_createIndexStatement3544); 
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_createIndexStatement3546); 
					 ifNotExists = true; 
					}
					break;

			}

			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:685:9: (idxName= IDENT )?
			int alt77=2;
			int LA77_0 = input.LA(1);
			if ( (LA77_0==IDENT) ) {
				alt77=1;
			}
			switch (alt77) {
				case 1 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:685:10: idxName= IDENT
					{
					idxName=(Token)match(input,IDENT,FOLLOW_IDENT_in_createIndexStatement3564); 
					}
					break;

			}

			match(input,K_ON,FOLLOW_K_ON_in_createIndexStatement3568); 
			pushFollow(FOLLOW_columnFamilyName_in_createIndexStatement3572);
			cf=columnFamilyName();
			state._fsp--;

			match(input,155,FOLLOW_155_in_createIndexStatement3574); 
			pushFollow(FOLLOW_indexIdent_in_createIndexStatement3578);
			id=indexIdent();
			state._fsp--;

			match(input,156,FOLLOW_156_in_createIndexStatement3580); 
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:686:9: ( K_USING cls= STRING_LITERAL )?
			int alt78=2;
			int LA78_0 = input.LA(1);
			if ( (LA78_0==K_USING) ) {
				alt78=1;
			}
			switch (alt78) {
				case 1 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:686:10: K_USING cls= STRING_LITERAL
					{
					match(input,K_USING,FOLLOW_K_USING_in_createIndexStatement3591); 
					cls=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_createIndexStatement3595); 
					 props.customClass = (cls!=null?cls.getText():null); 
					}
					break;

			}

			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:687:9: ( K_WITH properties[props] )?
			int alt79=2;
			int LA79_0 = input.LA(1);
			if ( (LA79_0==K_WITH) ) {
				alt79=1;
			}
			switch (alt79) {
				case 1 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:687:10: K_WITH properties[props]
					{
					match(input,K_WITH,FOLLOW_K_WITH_in_createIndexStatement3610); 
					pushFollow(FOLLOW_properties_in_createIndexStatement3612);
					properties(props);
					state._fsp--;

					}
					break;

			}

			 expr = new CreateIndexStatement(cf, (idxName!=null?idxName.getText():null), id, props, ifNotExists); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "createIndexStatement"



	// $ANTLR start "indexIdent"
	// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:691:1: indexIdent returns [IndexTarget id] : (c= cident | K_KEYS '(' c= cident ')' );
	public final IndexTarget indexIdent() throws RecognitionException {
		IndexTarget id = null;


		ColumnIdentifier c =null;

		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:692:5: (c= cident | K_KEYS '(' c= cident ')' )
			int alt80=2;
			int LA80_0 = input.LA(1);
			if ( (LA80_0==IDENT||LA80_0==K_ALL||LA80_0==K_AS||LA80_0==K_ASCII||(LA80_0 >= K_BIGINT && LA80_0 <= K_BOOLEAN)||LA80_0==K_CLUSTERING||LA80_0==K_COMPACT||(LA80_0 >= K_CONTAINS && LA80_0 <= K_COUNTER)||(LA80_0 >= K_CUSTOM && LA80_0 <= K_DECIMAL)||(LA80_0 >= K_DETERMINISTIC && LA80_0 <= K_DOUBLE)||(LA80_0 >= K_EXISTS && LA80_0 <= K_FLOAT)||LA80_0==K_FUNCTION||LA80_0==K_INET||LA80_0==K_INT||LA80_0==K_KEY||(LA80_0 >= K_KEYSPACES && LA80_0 <= K_LANGUAGE)||(LA80_0 >= K_LIST && LA80_0 <= K_MAP)||LA80_0==K_NON||LA80_0==K_NOSUPERUSER||(LA80_0 >= K_PASSWORD && LA80_0 <= K_PERMISSIONS)||LA80_0==K_RETURNS||(LA80_0 >= K_STATIC && LA80_0 <= K_TEXT)||(LA80_0 >= K_TIMESTAMP && LA80_0 <= K_TIMEUUID)||LA80_0==K_TRIGGER||LA80_0==K_TTL||LA80_0==K_TYPE||(LA80_0 >= K_USER && LA80_0 <= K_USERS)||(LA80_0 >= K_UUID && LA80_0 <= K_VARINT)||LA80_0==K_WRITETIME||LA80_0==QUOTED_NAME) ) {
				alt80=1;
			}
			else if ( (LA80_0==K_KEYS) ) {
				int LA80_2 = input.LA(2);
				if ( (LA80_2==155) ) {
					alt80=2;
				}
				else if ( (LA80_2==156) ) {
					alt80=1;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 80, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 80, 0, input);
				throw nvae;
			}

			switch (alt80) {
				case 1 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:692:7: c= cident
					{
					pushFollow(FOLLOW_cident_in_indexIdent3646);
					c=cident();
					state._fsp--;

					 id = IndexTarget.of(c); 
					}
					break;
				case 2 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:693:7: K_KEYS '(' c= cident ')'
					{
					match(input,K_KEYS,FOLLOW_K_KEYS_in_indexIdent3671); 
					match(input,155,FOLLOW_155_in_indexIdent3673); 
					pushFollow(FOLLOW_cident_in_indexIdent3677);
					c=cident();
					state._fsp--;

					match(input,156,FOLLOW_156_in_indexIdent3679); 
					 id = IndexTarget.keysOf(c); 
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
		return id;
	}
	// $ANTLR end "indexIdent"



	// $ANTLR start "createTriggerStatement"
	// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:700:1: createTriggerStatement returns [CreateTriggerStatement expr] : K_CREATE K_TRIGGER ( K_IF K_NOT K_EXISTS )? (name= cident ) K_ON cf= columnFamilyName K_USING cls= STRING_LITERAL ;
	public final CreateTriggerStatement createTriggerStatement() throws RecognitionException {
		CreateTriggerStatement expr = null;


		Token cls=null;
		ColumnIdentifier name =null;
		CFName cf =null;


		        boolean ifNotExists = false;
		    
		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:704:5: ( K_CREATE K_TRIGGER ( K_IF K_NOT K_EXISTS )? (name= cident ) K_ON cf= columnFamilyName K_USING cls= STRING_LITERAL )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:704:7: K_CREATE K_TRIGGER ( K_IF K_NOT K_EXISTS )? (name= cident ) K_ON cf= columnFamilyName K_USING cls= STRING_LITERAL
			{
			match(input,K_CREATE,FOLLOW_K_CREATE_in_createTriggerStatement3714); 
			match(input,K_TRIGGER,FOLLOW_K_TRIGGER_in_createTriggerStatement3716); 
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:704:26: ( K_IF K_NOT K_EXISTS )?
			int alt81=2;
			int LA81_0 = input.LA(1);
			if ( (LA81_0==K_IF) ) {
				alt81=1;
			}
			switch (alt81) {
				case 1 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:704:27: K_IF K_NOT K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_createTriggerStatement3719); 
					match(input,K_NOT,FOLLOW_K_NOT_in_createTriggerStatement3721); 
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_createTriggerStatement3723); 
					 ifNotExists = true; 
					}
					break;

			}

			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:704:74: (name= cident )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:704:75: name= cident
			{
			pushFollow(FOLLOW_cident_in_createTriggerStatement3733);
			name=cident();
			state._fsp--;

			}

			match(input,K_ON,FOLLOW_K_ON_in_createTriggerStatement3744); 
			pushFollow(FOLLOW_columnFamilyName_in_createTriggerStatement3748);
			cf=columnFamilyName();
			state._fsp--;

			match(input,K_USING,FOLLOW_K_USING_in_createTriggerStatement3750); 
			cls=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_createTriggerStatement3754); 
			 expr = new CreateTriggerStatement(cf, name.toString(), (cls!=null?cls.getText():null), ifNotExists); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "createTriggerStatement"



	// $ANTLR start "dropTriggerStatement"
	// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:712:1: dropTriggerStatement returns [DropTriggerStatement expr] : K_DROP K_TRIGGER ( K_IF K_EXISTS )? (name= cident ) K_ON cf= columnFamilyName ;
	public final DropTriggerStatement dropTriggerStatement() throws RecognitionException {
		DropTriggerStatement expr = null;


		ColumnIdentifier name =null;
		CFName cf =null;

		 boolean ifExists = false; 
		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:714:5: ( K_DROP K_TRIGGER ( K_IF K_EXISTS )? (name= cident ) K_ON cf= columnFamilyName )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:714:7: K_DROP K_TRIGGER ( K_IF K_EXISTS )? (name= cident ) K_ON cf= columnFamilyName
			{
			match(input,K_DROP,FOLLOW_K_DROP_in_dropTriggerStatement3795); 
			match(input,K_TRIGGER,FOLLOW_K_TRIGGER_in_dropTriggerStatement3797); 
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:714:24: ( K_IF K_EXISTS )?
			int alt82=2;
			int LA82_0 = input.LA(1);
			if ( (LA82_0==K_IF) ) {
				alt82=1;
			}
			switch (alt82) {
				case 1 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:714:25: K_IF K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_dropTriggerStatement3800); 
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_dropTriggerStatement3802); 
					 ifExists = true; 
					}
					break;

			}

			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:714:63: (name= cident )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:714:64: name= cident
			{
			pushFollow(FOLLOW_cident_in_dropTriggerStatement3812);
			name=cident();
			state._fsp--;

			}

			match(input,K_ON,FOLLOW_K_ON_in_dropTriggerStatement3815); 
			pushFollow(FOLLOW_columnFamilyName_in_dropTriggerStatement3819);
			cf=columnFamilyName();
			state._fsp--;

			 expr = new DropTriggerStatement(cf, name.toString(), ifExists); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "dropTriggerStatement"



	// $ANTLR start "alterKeyspaceStatement"
	// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:721:1: alterKeyspaceStatement returns [AlterKeyspaceStatement expr] : K_ALTER K_KEYSPACE ks= keyspaceName K_WITH properties[attrs] ;
	public final AlterKeyspaceStatement alterKeyspaceStatement() throws RecognitionException {
		AlterKeyspaceStatement expr = null;


		String ks =null;

		 KSPropDefs attrs = new KSPropDefs(); 
		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:723:5: ( K_ALTER K_KEYSPACE ks= keyspaceName K_WITH properties[attrs] )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:723:7: K_ALTER K_KEYSPACE ks= keyspaceName K_WITH properties[attrs]
			{
			match(input,K_ALTER,FOLLOW_K_ALTER_in_alterKeyspaceStatement3859); 
			match(input,K_KEYSPACE,FOLLOW_K_KEYSPACE_in_alterKeyspaceStatement3861); 
			pushFollow(FOLLOW_keyspaceName_in_alterKeyspaceStatement3865);
			ks=keyspaceName();
			state._fsp--;

			match(input,K_WITH,FOLLOW_K_WITH_in_alterKeyspaceStatement3875); 
			pushFollow(FOLLOW_properties_in_alterKeyspaceStatement3877);
			properties(attrs);
			state._fsp--;

			 expr = new AlterKeyspaceStatement(ks, attrs); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "alterKeyspaceStatement"



	// $ANTLR start "alterTableStatement"
	// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:735:1: alterTableStatement returns [AlterTableStatement expr] : K_ALTER K_COLUMNFAMILY cf= columnFamilyName ( K_ALTER id= cident K_TYPE v= comparatorType | K_ADD id= cident v= comparatorType ( K_STATIC )? | K_DROP id= cident | K_WITH properties[props] | K_RENAME id1= cident K_TO toId1= cident ( K_AND idn= cident K_TO toIdn= cident )* ) ;
	public final AlterTableStatement alterTableStatement() throws RecognitionException {
		AlterTableStatement expr = null;


		CFName cf =null;
		ColumnIdentifier id =null;
		CQL3Type.Raw v =null;
		ColumnIdentifier id1 =null;
		ColumnIdentifier toId1 =null;
		ColumnIdentifier idn =null;
		ColumnIdentifier toIdn =null;


		        AlterTableStatement.Type type = null;
		        CFPropDefs props = new CFPropDefs();
		        Map<ColumnIdentifier, ColumnIdentifier> renames = new HashMap<ColumnIdentifier, ColumnIdentifier>();
		        boolean isStatic = false;
		    
		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:742:5: ( K_ALTER K_COLUMNFAMILY cf= columnFamilyName ( K_ALTER id= cident K_TYPE v= comparatorType | K_ADD id= cident v= comparatorType ( K_STATIC )? | K_DROP id= cident | K_WITH properties[props] | K_RENAME id1= cident K_TO toId1= cident ( K_AND idn= cident K_TO toIdn= cident )* ) )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:742:7: K_ALTER K_COLUMNFAMILY cf= columnFamilyName ( K_ALTER id= cident K_TYPE v= comparatorType | K_ADD id= cident v= comparatorType ( K_STATIC )? | K_DROP id= cident | K_WITH properties[props] | K_RENAME id1= cident K_TO toId1= cident ( K_AND idn= cident K_TO toIdn= cident )* )
			{
			match(input,K_ALTER,FOLLOW_K_ALTER_in_alterTableStatement3913); 
			match(input,K_COLUMNFAMILY,FOLLOW_K_COLUMNFAMILY_in_alterTableStatement3915); 
			pushFollow(FOLLOW_columnFamilyName_in_alterTableStatement3919);
			cf=columnFamilyName();
			state._fsp--;

			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:743:11: ( K_ALTER id= cident K_TYPE v= comparatorType | K_ADD id= cident v= comparatorType ( K_STATIC )? | K_DROP id= cident | K_WITH properties[props] | K_RENAME id1= cident K_TO toId1= cident ( K_AND idn= cident K_TO toIdn= cident )* )
			int alt85=5;
			switch ( input.LA(1) ) {
			case K_ALTER:
				{
				alt85=1;
				}
				break;
			case K_ADD:
				{
				alt85=2;
				}
				break;
			case K_DROP:
				{
				alt85=3;
				}
				break;
			case K_WITH:
				{
				alt85=4;
				}
				break;
			case K_RENAME:
				{
				alt85=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 85, 0, input);
				throw nvae;
			}
			switch (alt85) {
				case 1 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:743:13: K_ALTER id= cident K_TYPE v= comparatorType
					{
					match(input,K_ALTER,FOLLOW_K_ALTER_in_alterTableStatement3933); 
					pushFollow(FOLLOW_cident_in_alterTableStatement3937);
					id=cident();
					state._fsp--;

					match(input,K_TYPE,FOLLOW_K_TYPE_in_alterTableStatement3939); 
					pushFollow(FOLLOW_comparatorType_in_alterTableStatement3943);
					v=comparatorType();
					state._fsp--;

					 type = AlterTableStatement.Type.ALTER; 
					}
					break;
				case 2 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:744:13: K_ADD id= cident v= comparatorType ( K_STATIC )?
					{
					match(input,K_ADD,FOLLOW_K_ADD_in_alterTableStatement3959); 
					pushFollow(FOLLOW_cident_in_alterTableStatement3965);
					id=cident();
					state._fsp--;

					pushFollow(FOLLOW_comparatorType_in_alterTableStatement3969);
					v=comparatorType();
					state._fsp--;

					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:744:48: ( K_STATIC )?
					int alt83=2;
					int LA83_0 = input.LA(1);
					if ( (LA83_0==K_STATIC) ) {
						alt83=1;
					}
					switch (alt83) {
						case 1 :
							// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:744:49: K_STATIC
							{
							 isStatic=true; 
							match(input,K_STATIC,FOLLOW_K_STATIC_in_alterTableStatement3974); 
							}
							break;

					}

					 type = AlterTableStatement.Type.ADD; 
					}
					break;
				case 3 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:745:13: K_DROP id= cident
					{
					match(input,K_DROP,FOLLOW_K_DROP_in_alterTableStatement3992); 
					pushFollow(FOLLOW_cident_in_alterTableStatement3997);
					id=cident();
					state._fsp--;

					 type = AlterTableStatement.Type.DROP; 
					}
					break;
				case 4 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:746:13: K_WITH properties[props]
					{
					match(input,K_WITH,FOLLOW_K_WITH_in_alterTableStatement4037); 
					pushFollow(FOLLOW_properties_in_alterTableStatement4040);
					properties(props);
					state._fsp--;

					 type = AlterTableStatement.Type.OPTS; 
					}
					break;
				case 5 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:747:13: K_RENAME id1= cident K_TO toId1= cident ( K_AND idn= cident K_TO toIdn= cident )*
					{
					match(input,K_RENAME,FOLLOW_K_RENAME_in_alterTableStatement4073); 
					 type = AlterTableStatement.Type.RENAME; 
					pushFollow(FOLLOW_cident_in_alterTableStatement4127);
					id1=cident();
					state._fsp--;

					match(input,K_TO,FOLLOW_K_TO_in_alterTableStatement4129); 
					pushFollow(FOLLOW_cident_in_alterTableStatement4133);
					toId1=cident();
					state._fsp--;

					 renames.put(id1, toId1); 
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:749:16: ( K_AND idn= cident K_TO toIdn= cident )*
					loop84:
					while (true) {
						int alt84=2;
						int LA84_0 = input.LA(1);
						if ( (LA84_0==K_AND) ) {
							alt84=1;
						}

						switch (alt84) {
						case 1 :
							// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:749:18: K_AND idn= cident K_TO toIdn= cident
							{
							match(input,K_AND,FOLLOW_K_AND_in_alterTableStatement4154); 
							pushFollow(FOLLOW_cident_in_alterTableStatement4158);
							idn=cident();
							state._fsp--;

							match(input,K_TO,FOLLOW_K_TO_in_alterTableStatement4160); 
							pushFollow(FOLLOW_cident_in_alterTableStatement4164);
							toIdn=cident();
							state._fsp--;

							 renames.put(idn, toIdn); 
							}
							break;

						default :
							break loop84;
						}
					}

					}
					break;

			}


			        expr = new AlterTableStatement(cf, type, id, v, props, renames, isStatic);
			    
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "alterTableStatement"



	// $ANTLR start "alterTypeStatement"
	// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:761:1: alterTypeStatement returns [AlterTypeStatement expr] : K_ALTER K_TYPE name= userTypeName ( K_ALTER f= cident K_TYPE v= comparatorType | K_ADD f= cident v= comparatorType | K_RENAME id1= cident K_TO toId1= cident ( K_AND idn= cident K_TO toIdn= cident )* ) ;
	public final AlterTypeStatement alterTypeStatement() throws RecognitionException {
		AlterTypeStatement expr = null;


		UTName name =null;
		ColumnIdentifier f =null;
		CQL3Type.Raw v =null;
		ColumnIdentifier id1 =null;
		ColumnIdentifier toId1 =null;
		ColumnIdentifier idn =null;
		ColumnIdentifier toIdn =null;

		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:762:5: ( K_ALTER K_TYPE name= userTypeName ( K_ALTER f= cident K_TYPE v= comparatorType | K_ADD f= cident v= comparatorType | K_RENAME id1= cident K_TO toId1= cident ( K_AND idn= cident K_TO toIdn= cident )* ) )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:762:7: K_ALTER K_TYPE name= userTypeName ( K_ALTER f= cident K_TYPE v= comparatorType | K_ADD f= cident v= comparatorType | K_RENAME id1= cident K_TO toId1= cident ( K_AND idn= cident K_TO toIdn= cident )* )
			{
			match(input,K_ALTER,FOLLOW_K_ALTER_in_alterTypeStatement4210); 
			match(input,K_TYPE,FOLLOW_K_TYPE_in_alterTypeStatement4212); 
			pushFollow(FOLLOW_userTypeName_in_alterTypeStatement4216);
			name=userTypeName();
			state._fsp--;

			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:763:11: ( K_ALTER f= cident K_TYPE v= comparatorType | K_ADD f= cident v= comparatorType | K_RENAME id1= cident K_TO toId1= cident ( K_AND idn= cident K_TO toIdn= cident )* )
			int alt87=3;
			switch ( input.LA(1) ) {
			case K_ALTER:
				{
				alt87=1;
				}
				break;
			case K_ADD:
				{
				alt87=2;
				}
				break;
			case K_RENAME:
				{
				alt87=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 87, 0, input);
				throw nvae;
			}
			switch (alt87) {
				case 1 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:763:13: K_ALTER f= cident K_TYPE v= comparatorType
					{
					match(input,K_ALTER,FOLLOW_K_ALTER_in_alterTypeStatement4230); 
					pushFollow(FOLLOW_cident_in_alterTypeStatement4234);
					f=cident();
					state._fsp--;

					match(input,K_TYPE,FOLLOW_K_TYPE_in_alterTypeStatement4236); 
					pushFollow(FOLLOW_comparatorType_in_alterTypeStatement4240);
					v=comparatorType();
					state._fsp--;

					 expr = AlterTypeStatement.alter(name, f, v); 
					}
					break;
				case 2 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:764:13: K_ADD f= cident v= comparatorType
					{
					match(input,K_ADD,FOLLOW_K_ADD_in_alterTypeStatement4256); 
					pushFollow(FOLLOW_cident_in_alterTypeStatement4262);
					f=cident();
					state._fsp--;

					pushFollow(FOLLOW_comparatorType_in_alterTypeStatement4266);
					v=comparatorType();
					state._fsp--;

					 expr = AlterTypeStatement.addition(name, f, v); 
					}
					break;
				case 3 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:765:13: K_RENAME id1= cident K_TO toId1= cident ( K_AND idn= cident K_TO toIdn= cident )*
					{
					match(input,K_RENAME,FOLLOW_K_RENAME_in_alterTypeStatement4289); 
					 Map<ColumnIdentifier, ColumnIdentifier> renames = new HashMap<ColumnIdentifier, ColumnIdentifier>(); 
					pushFollow(FOLLOW_cident_in_alterTypeStatement4327);
					id1=cident();
					state._fsp--;

					match(input,K_TO,FOLLOW_K_TO_in_alterTypeStatement4329); 
					pushFollow(FOLLOW_cident_in_alterTypeStatement4333);
					toId1=cident();
					state._fsp--;

					 renames.put(id1, toId1); 
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:768:18: ( K_AND idn= cident K_TO toIdn= cident )*
					loop86:
					while (true) {
						int alt86=2;
						int LA86_0 = input.LA(1);
						if ( (LA86_0==K_AND) ) {
							alt86=1;
						}

						switch (alt86) {
						case 1 :
							// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:768:20: K_AND idn= cident K_TO toIdn= cident
							{
							match(input,K_AND,FOLLOW_K_AND_in_alterTypeStatement4356); 
							pushFollow(FOLLOW_cident_in_alterTypeStatement4360);
							idn=cident();
							state._fsp--;

							match(input,K_TO,FOLLOW_K_TO_in_alterTypeStatement4362); 
							pushFollow(FOLLOW_cident_in_alterTypeStatement4366);
							toIdn=cident();
							state._fsp--;

							 renames.put(idn, toIdn); 
							}
							break;

						default :
							break loop86;
						}
					}

					 expr = AlterTypeStatement.renames(name, renames); 
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
		return expr;
	}
	// $ANTLR end "alterTypeStatement"



	// $ANTLR start "dropKeyspaceStatement"
	// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:777:1: dropKeyspaceStatement returns [DropKeyspaceStatement ksp] : K_DROP K_KEYSPACE ( K_IF K_EXISTS )? ks= keyspaceName ;
	public final DropKeyspaceStatement dropKeyspaceStatement() throws RecognitionException {
		DropKeyspaceStatement ksp = null;


		String ks =null;

		 boolean ifExists = false; 
		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:779:5: ( K_DROP K_KEYSPACE ( K_IF K_EXISTS )? ks= keyspaceName )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:779:7: K_DROP K_KEYSPACE ( K_IF K_EXISTS )? ks= keyspaceName
			{
			match(input,K_DROP,FOLLOW_K_DROP_in_dropKeyspaceStatement4433); 
			match(input,K_KEYSPACE,FOLLOW_K_KEYSPACE_in_dropKeyspaceStatement4435); 
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:779:25: ( K_IF K_EXISTS )?
			int alt88=2;
			int LA88_0 = input.LA(1);
			if ( (LA88_0==K_IF) ) {
				alt88=1;
			}
			switch (alt88) {
				case 1 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:779:26: K_IF K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_dropKeyspaceStatement4438); 
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_dropKeyspaceStatement4440); 
					 ifExists = true; 
					}
					break;

			}

			pushFollow(FOLLOW_keyspaceName_in_dropKeyspaceStatement4449);
			ks=keyspaceName();
			state._fsp--;

			 ksp = new DropKeyspaceStatement(ks, ifExists); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return ksp;
	}
	// $ANTLR end "dropKeyspaceStatement"



	// $ANTLR start "dropTableStatement"
	// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:785:1: dropTableStatement returns [DropTableStatement stmt] : K_DROP K_COLUMNFAMILY ( K_IF K_EXISTS )? cf= columnFamilyName ;
	public final DropTableStatement dropTableStatement() throws RecognitionException {
		DropTableStatement stmt = null;


		CFName cf =null;

		 boolean ifExists = false; 
		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:787:5: ( K_DROP K_COLUMNFAMILY ( K_IF K_EXISTS )? cf= columnFamilyName )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:787:7: K_DROP K_COLUMNFAMILY ( K_IF K_EXISTS )? cf= columnFamilyName
			{
			match(input,K_DROP,FOLLOW_K_DROP_in_dropTableStatement4483); 
			match(input,K_COLUMNFAMILY,FOLLOW_K_COLUMNFAMILY_in_dropTableStatement4485); 
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:787:29: ( K_IF K_EXISTS )?
			int alt89=2;
			int LA89_0 = input.LA(1);
			if ( (LA89_0==K_IF) ) {
				alt89=1;
			}
			switch (alt89) {
				case 1 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:787:30: K_IF K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_dropTableStatement4488); 
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_dropTableStatement4490); 
					 ifExists = true; 
					}
					break;

			}

			pushFollow(FOLLOW_columnFamilyName_in_dropTableStatement4499);
			cf=columnFamilyName();
			state._fsp--;

			 stmt = new DropTableStatement(cf, ifExists); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "dropTableStatement"



	// $ANTLR start "dropTypeStatement"
	// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:793:1: dropTypeStatement returns [DropTypeStatement stmt] : K_DROP K_TYPE ( K_IF K_EXISTS )? name= userTypeName ;
	public final DropTypeStatement dropTypeStatement() throws RecognitionException {
		DropTypeStatement stmt = null;


		UTName name =null;

		 boolean ifExists = false; 
		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:795:5: ( K_DROP K_TYPE ( K_IF K_EXISTS )? name= userTypeName )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:795:7: K_DROP K_TYPE ( K_IF K_EXISTS )? name= userTypeName
			{
			match(input,K_DROP,FOLLOW_K_DROP_in_dropTypeStatement4533); 
			match(input,K_TYPE,FOLLOW_K_TYPE_in_dropTypeStatement4535); 
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:795:21: ( K_IF K_EXISTS )?
			int alt90=2;
			int LA90_0 = input.LA(1);
			if ( (LA90_0==K_IF) ) {
				alt90=1;
			}
			switch (alt90) {
				case 1 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:795:22: K_IF K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_dropTypeStatement4538); 
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_dropTypeStatement4540); 
					 ifExists = true; 
					}
					break;

			}

			pushFollow(FOLLOW_userTypeName_in_dropTypeStatement4549);
			name=userTypeName();
			state._fsp--;

			 stmt = new DropTypeStatement(name, ifExists); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "dropTypeStatement"



	// $ANTLR start "dropIndexStatement"
	// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:801:1: dropIndexStatement returns [DropIndexStatement expr] : K_DROP K_INDEX ( K_IF K_EXISTS )? index= indexName ;
	public final DropIndexStatement dropIndexStatement() throws RecognitionException {
		DropIndexStatement expr = null;


		IndexName index =null;

		 boolean ifExists = false; 
		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:803:5: ( K_DROP K_INDEX ( K_IF K_EXISTS )? index= indexName )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:803:7: K_DROP K_INDEX ( K_IF K_EXISTS )? index= indexName
			{
			match(input,K_DROP,FOLLOW_K_DROP_in_dropIndexStatement4583); 
			match(input,K_INDEX,FOLLOW_K_INDEX_in_dropIndexStatement4585); 
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:803:22: ( K_IF K_EXISTS )?
			int alt91=2;
			int LA91_0 = input.LA(1);
			if ( (LA91_0==K_IF) ) {
				alt91=1;
			}
			switch (alt91) {
				case 1 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:803:23: K_IF K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_dropIndexStatement4588); 
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_dropIndexStatement4590); 
					 ifExists = true; 
					}
					break;

			}

			pushFollow(FOLLOW_indexName_in_dropIndexStatement4599);
			index=indexName();
			state._fsp--;

			 expr = new DropIndexStatement(index, ifExists); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "dropIndexStatement"



	// $ANTLR start "truncateStatement"
	// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:810:1: truncateStatement returns [TruncateStatement stmt] : K_TRUNCATE cf= columnFamilyName ;
	public final TruncateStatement truncateStatement() throws RecognitionException {
		TruncateStatement stmt = null;


		CFName cf =null;

		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:811:5: ( K_TRUNCATE cf= columnFamilyName )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:811:7: K_TRUNCATE cf= columnFamilyName
			{
			match(input,K_TRUNCATE,FOLLOW_K_TRUNCATE_in_truncateStatement4630); 
			pushFollow(FOLLOW_columnFamilyName_in_truncateStatement4634);
			cf=columnFamilyName();
			state._fsp--;

			 stmt = new TruncateStatement(cf); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "truncateStatement"



	// $ANTLR start "grantStatement"
	// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:817:1: grantStatement returns [GrantStatement stmt] : K_GRANT permissionOrAll K_ON resource K_TO username ;
	public final GrantStatement grantStatement() throws RecognitionException {
		GrantStatement stmt = null;


		Set<Permission> permissionOrAll1 =null;
		IResource resource2 =null;
		ParserRuleReturnScope username3 =null;

		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:818:5: ( K_GRANT permissionOrAll K_ON resource K_TO username )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:818:7: K_GRANT permissionOrAll K_ON resource K_TO username
			{
			match(input,K_GRANT,FOLLOW_K_GRANT_in_grantStatement4659); 
			pushFollow(FOLLOW_permissionOrAll_in_grantStatement4671);
			permissionOrAll1=permissionOrAll();
			state._fsp--;

			match(input,K_ON,FOLLOW_K_ON_in_grantStatement4679); 
			pushFollow(FOLLOW_resource_in_grantStatement4691);
			resource2=resource();
			state._fsp--;

			match(input,K_TO,FOLLOW_K_TO_in_grantStatement4699); 
			pushFollow(FOLLOW_username_in_grantStatement4711);
			username3=username();
			state._fsp--;

			 stmt = new GrantStatement(permissionOrAll1, resource2, (username3!=null?input.toString(username3.start,username3.stop):null)); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "grantStatement"



	// $ANTLR start "revokeStatement"
	// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:830:1: revokeStatement returns [RevokeStatement stmt] : K_REVOKE permissionOrAll K_ON resource K_FROM username ;
	public final RevokeStatement revokeStatement() throws RecognitionException {
		RevokeStatement stmt = null;


		Set<Permission> permissionOrAll4 =null;
		IResource resource5 =null;
		ParserRuleReturnScope username6 =null;

		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:831:5: ( K_REVOKE permissionOrAll K_ON resource K_FROM username )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:831:7: K_REVOKE permissionOrAll K_ON resource K_FROM username
			{
			match(input,K_REVOKE,FOLLOW_K_REVOKE_in_revokeStatement4742); 
			pushFollow(FOLLOW_permissionOrAll_in_revokeStatement4754);
			permissionOrAll4=permissionOrAll();
			state._fsp--;

			match(input,K_ON,FOLLOW_K_ON_in_revokeStatement4762); 
			pushFollow(FOLLOW_resource_in_revokeStatement4774);
			resource5=resource();
			state._fsp--;

			match(input,K_FROM,FOLLOW_K_FROM_in_revokeStatement4782); 
			pushFollow(FOLLOW_username_in_revokeStatement4794);
			username6=username();
			state._fsp--;

			 stmt = new RevokeStatement(permissionOrAll4, resource5, (username6!=null?input.toString(username6.start,username6.stop):null)); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "revokeStatement"



	// $ANTLR start "listPermissionsStatement"
	// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:840:1: listPermissionsStatement returns [ListPermissionsStatement stmt] : K_LIST permissionOrAll ( K_ON resource )? ( K_OF username )? ( K_NORECURSIVE )? ;
	public final ListPermissionsStatement listPermissionsStatement() throws RecognitionException {
		ListPermissionsStatement stmt = null;


		IResource resource7 =null;
		ParserRuleReturnScope username8 =null;
		Set<Permission> permissionOrAll9 =null;


		        IResource resource = null;
		        String username = null;
		        boolean recursive = true;
		    
		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:846:5: ( K_LIST permissionOrAll ( K_ON resource )? ( K_OF username )? ( K_NORECURSIVE )? )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:846:7: K_LIST permissionOrAll ( K_ON resource )? ( K_OF username )? ( K_NORECURSIVE )?
			{
			match(input,K_LIST,FOLLOW_K_LIST_in_listPermissionsStatement4832); 
			pushFollow(FOLLOW_permissionOrAll_in_listPermissionsStatement4844);
			permissionOrAll9=permissionOrAll();
			state._fsp--;

			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:848:7: ( K_ON resource )?
			int alt92=2;
			int LA92_0 = input.LA(1);
			if ( (LA92_0==K_ON) ) {
				alt92=1;
			}
			switch (alt92) {
				case 1 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:848:9: K_ON resource
					{
					match(input,K_ON,FOLLOW_K_ON_in_listPermissionsStatement4854); 
					pushFollow(FOLLOW_resource_in_listPermissionsStatement4856);
					resource7=resource();
					state._fsp--;

					 resource = resource7; 
					}
					break;

			}

			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:849:7: ( K_OF username )?
			int alt93=2;
			int LA93_0 = input.LA(1);
			if ( (LA93_0==K_OF) ) {
				alt93=1;
			}
			switch (alt93) {
				case 1 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:849:9: K_OF username
					{
					match(input,K_OF,FOLLOW_K_OF_in_listPermissionsStatement4871); 
					pushFollow(FOLLOW_username_in_listPermissionsStatement4873);
					username8=username();
					state._fsp--;

					 username = (username8!=null?input.toString(username8.start,username8.stop):null); 
					}
					break;

			}

			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:850:7: ( K_NORECURSIVE )?
			int alt94=2;
			int LA94_0 = input.LA(1);
			if ( (LA94_0==K_NORECURSIVE) ) {
				alt94=1;
			}
			switch (alt94) {
				case 1 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:850:9: K_NORECURSIVE
					{
					match(input,K_NORECURSIVE,FOLLOW_K_NORECURSIVE_in_listPermissionsStatement4888); 
					 recursive = false; 
					}
					break;

			}

			 stmt = new ListPermissionsStatement(permissionOrAll9, resource, username, recursive); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "listPermissionsStatement"



	// $ANTLR start "permission"
	// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:854:1: permission returns [Permission perm] : p= ( K_CREATE | K_ALTER | K_DROP | K_SELECT | K_MODIFY | K_AUTHORIZE ) ;
	public final Permission permission() throws RecognitionException {
		Permission perm = null;


		Token p=null;

		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:855:5: (p= ( K_CREATE | K_ALTER | K_DROP | K_SELECT | K_MODIFY | K_AUTHORIZE ) )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:855:7: p= ( K_CREATE | K_ALTER | K_DROP | K_SELECT | K_MODIFY | K_AUTHORIZE )
			{
			p=input.LT(1);
			if ( input.LA(1)==K_ALTER||input.LA(1)==K_AUTHORIZE||input.LA(1)==K_CREATE||input.LA(1)==K_DROP||input.LA(1)==K_MODIFY||input.LA(1)==K_SELECT ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			 perm = Permission.valueOf((p!=null?p.getText():null).toUpperCase()); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return perm;
	}
	// $ANTLR end "permission"



	// $ANTLR start "permissionOrAll"
	// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:859:1: permissionOrAll returns [Set<Permission> perms] : ( K_ALL ( K_PERMISSIONS )? |p= permission ( K_PERMISSION )? );
	public final Set<Permission> permissionOrAll() throws RecognitionException {
		Set<Permission> perms = null;


		Permission p =null;

		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:860:5: ( K_ALL ( K_PERMISSIONS )? |p= permission ( K_PERMISSION )? )
			int alt97=2;
			int LA97_0 = input.LA(1);
			if ( (LA97_0==K_ALL) ) {
				alt97=1;
			}
			else if ( (LA97_0==K_ALTER||LA97_0==K_AUTHORIZE||LA97_0==K_CREATE||LA97_0==K_DROP||LA97_0==K_MODIFY||LA97_0==K_SELECT) ) {
				alt97=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 97, 0, input);
				throw nvae;
			}

			switch (alt97) {
				case 1 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:860:7: K_ALL ( K_PERMISSIONS )?
					{
					match(input,K_ALL,FOLLOW_K_ALL_in_permissionOrAll4973); 
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:860:13: ( K_PERMISSIONS )?
					int alt95=2;
					int LA95_0 = input.LA(1);
					if ( (LA95_0==K_PERMISSIONS) ) {
						alt95=1;
					}
					switch (alt95) {
						case 1 :
							// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:860:15: K_PERMISSIONS
							{
							match(input,K_PERMISSIONS,FOLLOW_K_PERMISSIONS_in_permissionOrAll4977); 
							}
							break;

					}

					 perms = Permission.ALL_DATA; 
					}
					break;
				case 2 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:861:7: p= permission ( K_PERMISSION )?
					{
					pushFollow(FOLLOW_permission_in_permissionOrAll4998);
					p=permission();
					state._fsp--;

					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:861:20: ( K_PERMISSION )?
					int alt96=2;
					int LA96_0 = input.LA(1);
					if ( (LA96_0==K_PERMISSION) ) {
						alt96=1;
					}
					switch (alt96) {
						case 1 :
							// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:861:22: K_PERMISSION
							{
							match(input,K_PERMISSION,FOLLOW_K_PERMISSION_in_permissionOrAll5002); 
							}
							break;

					}

					 perms = EnumSet.of(p); 
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
		return perms;
	}
	// $ANTLR end "permissionOrAll"



	// $ANTLR start "resource"
	// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:864:1: resource returns [IResource res] : r= dataResource ;
	public final IResource resource() throws RecognitionException {
		IResource res = null;


		DataResource r =null;

		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:865:5: (r= dataResource )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:865:7: r= dataResource
			{
			pushFollow(FOLLOW_dataResource_in_resource5030);
			r=dataResource();
			state._fsp--;

			 res = r; 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return res;
	}
	// $ANTLR end "resource"



	// $ANTLR start "dataResource"
	// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:868:1: dataResource returns [DataResource res] : ( K_ALL K_KEYSPACES | K_KEYSPACE ks= keyspaceName | ( K_COLUMNFAMILY )? cf= columnFamilyName );
	public final DataResource dataResource() throws RecognitionException {
		DataResource res = null;


		String ks =null;
		CFName cf =null;

		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:869:5: ( K_ALL K_KEYSPACES | K_KEYSPACE ks= keyspaceName | ( K_COLUMNFAMILY )? cf= columnFamilyName )
			int alt99=3;
			switch ( input.LA(1) ) {
			case K_ALL:
				{
				int LA99_1 = input.LA(2);
				if ( (LA99_1==K_KEYSPACES) ) {
					alt99=1;
				}
				else if ( (LA99_1==EOF||LA99_1==K_FROM||LA99_1==K_NORECURSIVE||LA99_1==K_OF||LA99_1==K_TO||LA99_1==160||LA99_1==163) ) {
					alt99=3;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 99, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case K_KEYSPACE:
				{
				alt99=2;
				}
				break;
			case IDENT:
			case K_AS:
			case K_ASCII:
			case K_BIGINT:
			case K_BLOB:
			case K_BOOLEAN:
			case K_CLUSTERING:
			case K_COLUMNFAMILY:
			case K_COMPACT:
			case K_CONTAINS:
			case K_COUNT:
			case K_COUNTER:
			case K_CUSTOM:
			case K_DECIMAL:
			case K_DETERMINISTIC:
			case K_DISTINCT:
			case K_DOUBLE:
			case K_EXISTS:
			case K_FILTERING:
			case K_FLOAT:
			case K_FUNCTION:
			case K_INET:
			case K_INT:
			case K_KEY:
			case K_KEYS:
			case K_KEYSPACES:
			case K_LANGUAGE:
			case K_LIST:
			case K_MAP:
			case K_NON:
			case K_NOSUPERUSER:
			case K_PASSWORD:
			case K_PERMISSION:
			case K_PERMISSIONS:
			case K_RETURNS:
			case K_STATIC:
			case K_STORAGE:
			case K_SUPERUSER:
			case K_TEXT:
			case K_TIMESTAMP:
			case K_TIMEUUID:
			case K_TRIGGER:
			case K_TTL:
			case K_TYPE:
			case K_USER:
			case K_USERS:
			case K_UUID:
			case K_VALUES:
			case K_VARCHAR:
			case K_VARINT:
			case K_WRITETIME:
			case QUOTED_NAME:
				{
				alt99=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 99, 0, input);
				throw nvae;
			}
			switch (alt99) {
				case 1 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:869:7: K_ALL K_KEYSPACES
					{
					match(input,K_ALL,FOLLOW_K_ALL_in_dataResource5053); 
					match(input,K_KEYSPACES,FOLLOW_K_KEYSPACES_in_dataResource5055); 
					 res = DataResource.root(); 
					}
					break;
				case 2 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:870:7: K_KEYSPACE ks= keyspaceName
					{
					match(input,K_KEYSPACE,FOLLOW_K_KEYSPACE_in_dataResource5065); 
					pushFollow(FOLLOW_keyspaceName_in_dataResource5071);
					ks=keyspaceName();
					state._fsp--;

					 res = DataResource.keyspace(ks); 
					}
					break;
				case 3 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:871:7: ( K_COLUMNFAMILY )? cf= columnFamilyName
					{
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:871:7: ( K_COLUMNFAMILY )?
					int alt98=2;
					int LA98_0 = input.LA(1);
					if ( (LA98_0==K_COLUMNFAMILY) ) {
						alt98=1;
					}
					switch (alt98) {
						case 1 :
							// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:871:9: K_COLUMNFAMILY
							{
							match(input,K_COLUMNFAMILY,FOLLOW_K_COLUMNFAMILY_in_dataResource5083); 
							}
							break;

					}

					pushFollow(FOLLOW_columnFamilyName_in_dataResource5092);
					cf=columnFamilyName();
					state._fsp--;

					 res = DataResource.columnFamily(cf.getKeyspace(), cf.getColumnFamily()); 
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
		return res;
	}
	// $ANTLR end "dataResource"



	// $ANTLR start "createUserStatement"
	// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:878:1: createUserStatement returns [CreateUserStatement stmt] : K_CREATE K_USER ( K_IF K_NOT K_EXISTS )? username ( K_WITH userOptions[opts] )? ( K_SUPERUSER | K_NOSUPERUSER )? ;
	public final CreateUserStatement createUserStatement() throws RecognitionException {
		CreateUserStatement stmt = null;


		ParserRuleReturnScope username10 =null;


		        UserOptions opts = new UserOptions();
		        boolean superuser = false;
		        boolean ifNotExists = false;
		    
		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:884:5: ( K_CREATE K_USER ( K_IF K_NOT K_EXISTS )? username ( K_WITH userOptions[opts] )? ( K_SUPERUSER | K_NOSUPERUSER )? )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:884:7: K_CREATE K_USER ( K_IF K_NOT K_EXISTS )? username ( K_WITH userOptions[opts] )? ( K_SUPERUSER | K_NOSUPERUSER )?
			{
			match(input,K_CREATE,FOLLOW_K_CREATE_in_createUserStatement5132); 
			match(input,K_USER,FOLLOW_K_USER_in_createUserStatement5134); 
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:884:23: ( K_IF K_NOT K_EXISTS )?
			int alt100=2;
			int LA100_0 = input.LA(1);
			if ( (LA100_0==K_IF) ) {
				alt100=1;
			}
			switch (alt100) {
				case 1 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:884:24: K_IF K_NOT K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_createUserStatement5137); 
					match(input,K_NOT,FOLLOW_K_NOT_in_createUserStatement5139); 
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_createUserStatement5141); 
					 ifNotExists = true; 
					}
					break;

			}

			pushFollow(FOLLOW_username_in_createUserStatement5147);
			username10=username();
			state._fsp--;

			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:885:7: ( K_WITH userOptions[opts] )?
			int alt101=2;
			int LA101_0 = input.LA(1);
			if ( (LA101_0==K_WITH) ) {
				alt101=1;
			}
			switch (alt101) {
				case 1 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:885:9: K_WITH userOptions[opts]
					{
					match(input,K_WITH,FOLLOW_K_WITH_in_createUserStatement5157); 
					pushFollow(FOLLOW_userOptions_in_createUserStatement5159);
					userOptions(opts);
					state._fsp--;

					}
					break;

			}

			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:886:7: ( K_SUPERUSER | K_NOSUPERUSER )?
			int alt102=3;
			int LA102_0 = input.LA(1);
			if ( (LA102_0==K_SUPERUSER) ) {
				alt102=1;
			}
			else if ( (LA102_0==K_NOSUPERUSER) ) {
				alt102=2;
			}
			switch (alt102) {
				case 1 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:886:9: K_SUPERUSER
					{
					match(input,K_SUPERUSER,FOLLOW_K_SUPERUSER_in_createUserStatement5173); 
					 superuser = true; 
					}
					break;
				case 2 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:886:45: K_NOSUPERUSER
					{
					match(input,K_NOSUPERUSER,FOLLOW_K_NOSUPERUSER_in_createUserStatement5179); 
					 superuser = false; 
					}
					break;

			}

			 stmt = new CreateUserStatement((username10!=null?input.toString(username10.start,username10.stop):null), opts, superuser, ifNotExists); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "createUserStatement"



	// $ANTLR start "alterUserStatement"
	// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:893:1: alterUserStatement returns [AlterUserStatement stmt] : K_ALTER K_USER username ( K_WITH userOptions[opts] )? ( K_SUPERUSER | K_NOSUPERUSER )? ;
	public final AlterUserStatement alterUserStatement() throws RecognitionException {
		AlterUserStatement stmt = null;


		ParserRuleReturnScope username11 =null;


		        UserOptions opts = new UserOptions();
		        Boolean superuser = null;
		    
		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:898:5: ( K_ALTER K_USER username ( K_WITH userOptions[opts] )? ( K_SUPERUSER | K_NOSUPERUSER )? )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:898:7: K_ALTER K_USER username ( K_WITH userOptions[opts] )? ( K_SUPERUSER | K_NOSUPERUSER )?
			{
			match(input,K_ALTER,FOLLOW_K_ALTER_in_alterUserStatement5224); 
			match(input,K_USER,FOLLOW_K_USER_in_alterUserStatement5226); 
			pushFollow(FOLLOW_username_in_alterUserStatement5228);
			username11=username();
			state._fsp--;

			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:899:7: ( K_WITH userOptions[opts] )?
			int alt103=2;
			int LA103_0 = input.LA(1);
			if ( (LA103_0==K_WITH) ) {
				alt103=1;
			}
			switch (alt103) {
				case 1 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:899:9: K_WITH userOptions[opts]
					{
					match(input,K_WITH,FOLLOW_K_WITH_in_alterUserStatement5238); 
					pushFollow(FOLLOW_userOptions_in_alterUserStatement5240);
					userOptions(opts);
					state._fsp--;

					}
					break;

			}

			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:900:7: ( K_SUPERUSER | K_NOSUPERUSER )?
			int alt104=3;
			int LA104_0 = input.LA(1);
			if ( (LA104_0==K_SUPERUSER) ) {
				alt104=1;
			}
			else if ( (LA104_0==K_NOSUPERUSER) ) {
				alt104=2;
			}
			switch (alt104) {
				case 1 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:900:9: K_SUPERUSER
					{
					match(input,K_SUPERUSER,FOLLOW_K_SUPERUSER_in_alterUserStatement5254); 
					 superuser = true; 
					}
					break;
				case 2 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:900:45: K_NOSUPERUSER
					{
					match(input,K_NOSUPERUSER,FOLLOW_K_NOSUPERUSER_in_alterUserStatement5260); 
					 superuser = false; 
					}
					break;

			}

			 stmt = new AlterUserStatement((username11!=null?input.toString(username11.start,username11.stop):null), opts, superuser); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "alterUserStatement"



	// $ANTLR start "dropUserStatement"
	// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:907:1: dropUserStatement returns [DropUserStatement stmt] : K_DROP K_USER ( K_IF K_EXISTS )? username ;
	public final DropUserStatement dropUserStatement() throws RecognitionException {
		DropUserStatement stmt = null;


		ParserRuleReturnScope username12 =null;

		 boolean ifExists = false; 
		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:909:5: ( K_DROP K_USER ( K_IF K_EXISTS )? username )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:909:7: K_DROP K_USER ( K_IF K_EXISTS )? username
			{
			match(input,K_DROP,FOLLOW_K_DROP_in_dropUserStatement5305); 
			match(input,K_USER,FOLLOW_K_USER_in_dropUserStatement5307); 
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:909:21: ( K_IF K_EXISTS )?
			int alt105=2;
			int LA105_0 = input.LA(1);
			if ( (LA105_0==K_IF) ) {
				alt105=1;
			}
			switch (alt105) {
				case 1 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:909:22: K_IF K_EXISTS
					{
					match(input,K_IF,FOLLOW_K_IF_in_dropUserStatement5310); 
					match(input,K_EXISTS,FOLLOW_K_EXISTS_in_dropUserStatement5312); 
					 ifExists = true; 
					}
					break;

			}

			pushFollow(FOLLOW_username_in_dropUserStatement5318);
			username12=username();
			state._fsp--;

			 stmt = new DropUserStatement((username12!=null?input.toString(username12.start,username12.stop):null), ifExists); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "dropUserStatement"



	// $ANTLR start "listUsersStatement"
	// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:915:1: listUsersStatement returns [ListUsersStatement stmt] : K_LIST K_USERS ;
	public final ListUsersStatement listUsersStatement() throws RecognitionException {
		ListUsersStatement stmt = null;


		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:916:5: ( K_LIST K_USERS )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:916:7: K_LIST K_USERS
			{
			match(input,K_LIST,FOLLOW_K_LIST_in_listUsersStatement5343); 
			match(input,K_USERS,FOLLOW_K_USERS_in_listUsersStatement5345); 
			 stmt = new ListUsersStatement(); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmt;
	}
	// $ANTLR end "listUsersStatement"



	// $ANTLR start "userOptions"
	// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:919:1: userOptions[UserOptions opts] : userOption[opts] ;
	public final void userOptions(UserOptions opts) throws RecognitionException {
		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:920:5: ( userOption[opts] )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:920:7: userOption[opts]
			{
			pushFollow(FOLLOW_userOption_in_userOptions5365);
			userOption(opts);
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
	// $ANTLR end "userOptions"



	// $ANTLR start "userOption"
	// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:923:1: userOption[UserOptions opts] : k= K_PASSWORD v= STRING_LITERAL ;
	public final void userOption(UserOptions opts) throws RecognitionException {
		Token k=null;
		Token v=null;

		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:924:5: (k= K_PASSWORD v= STRING_LITERAL )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:924:7: k= K_PASSWORD v= STRING_LITERAL
			{
			k=(Token)match(input,K_PASSWORD,FOLLOW_K_PASSWORD_in_userOption5386); 
			v=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_userOption5390); 
			 opts.put((k!=null?k.getText():null), (v!=null?v.getText():null)); 
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
	// $ANTLR end "userOption"



	// $ANTLR start "cident"
	// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:930:1: cident returns [ColumnIdentifier id] : (t= IDENT |t= QUOTED_NAME |k= unreserved_keyword );
	public final ColumnIdentifier cident() throws RecognitionException {
		ColumnIdentifier id = null;


		Token t=null;
		String k =null;

		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:931:5: (t= IDENT |t= QUOTED_NAME |k= unreserved_keyword )
			int alt106=3;
			switch ( input.LA(1) ) {
			case IDENT:
				{
				alt106=1;
				}
				break;
			case QUOTED_NAME:
				{
				alt106=2;
				}
				break;
			case K_ALL:
			case K_AS:
			case K_ASCII:
			case K_BIGINT:
			case K_BLOB:
			case K_BOOLEAN:
			case K_CLUSTERING:
			case K_COMPACT:
			case K_CONTAINS:
			case K_COUNT:
			case K_COUNTER:
			case K_CUSTOM:
			case K_DECIMAL:
			case K_DETERMINISTIC:
			case K_DISTINCT:
			case K_DOUBLE:
			case K_EXISTS:
			case K_FILTERING:
			case K_FLOAT:
			case K_FUNCTION:
			case K_INET:
			case K_INT:
			case K_KEY:
			case K_KEYS:
			case K_KEYSPACES:
			case K_LANGUAGE:
			case K_LIST:
			case K_MAP:
			case K_NON:
			case K_NOSUPERUSER:
			case K_PASSWORD:
			case K_PERMISSION:
			case K_PERMISSIONS:
			case K_RETURNS:
			case K_STATIC:
			case K_STORAGE:
			case K_SUPERUSER:
			case K_TEXT:
			case K_TIMESTAMP:
			case K_TIMEUUID:
			case K_TRIGGER:
			case K_TTL:
			case K_TYPE:
			case K_USER:
			case K_USERS:
			case K_UUID:
			case K_VALUES:
			case K_VARCHAR:
			case K_VARINT:
			case K_WRITETIME:
				{
				alt106=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 106, 0, input);
				throw nvae;
			}
			switch (alt106) {
				case 1 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:931:7: t= IDENT
					{
					t=(Token)match(input,IDENT,FOLLOW_IDENT_in_cident5419); 
					 id = new ColumnIdentifier((t!=null?t.getText():null), false); 
					}
					break;
				case 2 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:932:7: t= QUOTED_NAME
					{
					t=(Token)match(input,QUOTED_NAME,FOLLOW_QUOTED_NAME_in_cident5444); 
					 id = new ColumnIdentifier((t!=null?t.getText():null), true); 
					}
					break;
				case 3 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:933:7: k= unreserved_keyword
					{
					pushFollow(FOLLOW_unreserved_keyword_in_cident5463);
					k=unreserved_keyword();
					state._fsp--;

					 id = new ColumnIdentifier(k, false); 
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
		return id;
	}
	// $ANTLR end "cident"



	// $ANTLR start "keyspaceName"
	// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:937:1: keyspaceName returns [String id] : cfOrKsName[name, true] ;
	public final String keyspaceName() throws RecognitionException {
		String id = null;


		 CFName name = new CFName(); 
		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:939:5: ( cfOrKsName[name, true] )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:939:7: cfOrKsName[name, true]
			{
			pushFollow(FOLLOW_cfOrKsName_in_keyspaceName5496);
			cfOrKsName(name, true);
			state._fsp--;

			 id = name.getKeyspace(); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return id;
	}
	// $ANTLR end "keyspaceName"



	// $ANTLR start "indexName"
	// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:942:1: indexName returns [IndexName name] : ( idxOrKsName[name, true] '.' )? idxOrKsName[name, false] ;
	public final IndexName indexName() throws RecognitionException {
		IndexName name = null;


		 name = new IndexName(); 
		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:944:5: ( ( idxOrKsName[name, true] '.' )? idxOrKsName[name, false] )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:944:7: ( idxOrKsName[name, true] '.' )? idxOrKsName[name, false]
			{
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:944:7: ( idxOrKsName[name, true] '.' )?
			int alt107=2;
			switch ( input.LA(1) ) {
				case IDENT:
					{
					int LA107_1 = input.LA(2);
					if ( (LA107_1==160) ) {
						alt107=1;
					}
					}
					break;
				case QUOTED_NAME:
					{
					int LA107_2 = input.LA(2);
					if ( (LA107_2==160) ) {
						alt107=1;
					}
					}
					break;
				case K_ALL:
				case K_AS:
				case K_CLUSTERING:
				case K_COMPACT:
				case K_CONTAINS:
				case K_CUSTOM:
				case K_DETERMINISTIC:
				case K_DISTINCT:
				case K_EXISTS:
				case K_FILTERING:
				case K_FUNCTION:
				case K_KEYS:
				case K_KEYSPACES:
				case K_LANGUAGE:
				case K_LIST:
				case K_MAP:
				case K_NON:
				case K_NOSUPERUSER:
				case K_PASSWORD:
				case K_PERMISSION:
				case K_PERMISSIONS:
				case K_RETURNS:
				case K_STATIC:
				case K_STORAGE:
				case K_SUPERUSER:
				case K_TRIGGER:
				case K_TYPE:
				case K_USER:
				case K_USERS:
				case K_VALUES:
					{
					int LA107_3 = input.LA(2);
					if ( (LA107_3==160) ) {
						alt107=1;
					}
					}
					break;
				case K_ASCII:
					{
					int LA107_4 = input.LA(2);
					if ( (LA107_4==160) ) {
						alt107=1;
					}
					}
					break;
				case K_BIGINT:
					{
					int LA107_5 = input.LA(2);
					if ( (LA107_5==160) ) {
						alt107=1;
					}
					}
					break;
				case K_BLOB:
					{
					int LA107_6 = input.LA(2);
					if ( (LA107_6==160) ) {
						alt107=1;
					}
					}
					break;
				case K_BOOLEAN:
					{
					int LA107_7 = input.LA(2);
					if ( (LA107_7==160) ) {
						alt107=1;
					}
					}
					break;
				case K_COUNTER:
					{
					int LA107_8 = input.LA(2);
					if ( (LA107_8==160) ) {
						alt107=1;
					}
					}
					break;
				case K_DECIMAL:
					{
					int LA107_9 = input.LA(2);
					if ( (LA107_9==160) ) {
						alt107=1;
					}
					}
					break;
				case K_DOUBLE:
					{
					int LA107_10 = input.LA(2);
					if ( (LA107_10==160) ) {
						alt107=1;
					}
					}
					break;
				case K_FLOAT:
					{
					int LA107_11 = input.LA(2);
					if ( (LA107_11==160) ) {
						alt107=1;
					}
					}
					break;
				case K_INET:
					{
					int LA107_12 = input.LA(2);
					if ( (LA107_12==160) ) {
						alt107=1;
					}
					}
					break;
				case K_INT:
					{
					int LA107_13 = input.LA(2);
					if ( (LA107_13==160) ) {
						alt107=1;
					}
					}
					break;
				case K_TEXT:
					{
					int LA107_14 = input.LA(2);
					if ( (LA107_14==160) ) {
						alt107=1;
					}
					}
					break;
				case K_TIMESTAMP:
					{
					int LA107_15 = input.LA(2);
					if ( (LA107_15==160) ) {
						alt107=1;
					}
					}
					break;
				case K_UUID:
					{
					int LA107_16 = input.LA(2);
					if ( (LA107_16==160) ) {
						alt107=1;
					}
					}
					break;
				case K_VARCHAR:
					{
					int LA107_17 = input.LA(2);
					if ( (LA107_17==160) ) {
						alt107=1;
					}
					}
					break;
				case K_VARINT:
					{
					int LA107_18 = input.LA(2);
					if ( (LA107_18==160) ) {
						alt107=1;
					}
					}
					break;
				case K_TIMEUUID:
					{
					int LA107_19 = input.LA(2);
					if ( (LA107_19==160) ) {
						alt107=1;
					}
					}
					break;
				case K_COUNT:
				case K_KEY:
				case K_TTL:
				case K_WRITETIME:
					{
					int LA107_20 = input.LA(2);
					if ( (LA107_20==160) ) {
						alt107=1;
					}
					}
					break;
			}
			switch (alt107) {
				case 1 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:944:8: idxOrKsName[name, true] '.'
					{
					pushFollow(FOLLOW_idxOrKsName_in_indexName5530);
					idxOrKsName(name, true);
					state._fsp--;

					match(input,160,FOLLOW_160_in_indexName5533); 
					}
					break;

			}

			pushFollow(FOLLOW_idxOrKsName_in_indexName5537);
			idxOrKsName(name, false);
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
		return name;
	}
	// $ANTLR end "indexName"



	// $ANTLR start "idxOrKsName"
	// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:947:1: idxOrKsName[IndexName name, boolean isKs] : (t= IDENT |t= QUOTED_NAME |k= unreserved_keyword );
	public final void idxOrKsName(IndexName name, boolean isKs) throws RecognitionException {
		Token t=null;
		String k =null;

		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:948:5: (t= IDENT |t= QUOTED_NAME |k= unreserved_keyword )
			int alt108=3;
			switch ( input.LA(1) ) {
			case IDENT:
				{
				alt108=1;
				}
				break;
			case QUOTED_NAME:
				{
				alt108=2;
				}
				break;
			case K_ALL:
			case K_AS:
			case K_ASCII:
			case K_BIGINT:
			case K_BLOB:
			case K_BOOLEAN:
			case K_CLUSTERING:
			case K_COMPACT:
			case K_CONTAINS:
			case K_COUNT:
			case K_COUNTER:
			case K_CUSTOM:
			case K_DECIMAL:
			case K_DETERMINISTIC:
			case K_DISTINCT:
			case K_DOUBLE:
			case K_EXISTS:
			case K_FILTERING:
			case K_FLOAT:
			case K_FUNCTION:
			case K_INET:
			case K_INT:
			case K_KEY:
			case K_KEYS:
			case K_KEYSPACES:
			case K_LANGUAGE:
			case K_LIST:
			case K_MAP:
			case K_NON:
			case K_NOSUPERUSER:
			case K_PASSWORD:
			case K_PERMISSION:
			case K_PERMISSIONS:
			case K_RETURNS:
			case K_STATIC:
			case K_STORAGE:
			case K_SUPERUSER:
			case K_TEXT:
			case K_TIMESTAMP:
			case K_TIMEUUID:
			case K_TRIGGER:
			case K_TTL:
			case K_TYPE:
			case K_USER:
			case K_USERS:
			case K_UUID:
			case K_VALUES:
			case K_VARCHAR:
			case K_VARINT:
			case K_WRITETIME:
				{
				alt108=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 108, 0, input);
				throw nvae;
			}
			switch (alt108) {
				case 1 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:948:7: t= IDENT
					{
					t=(Token)match(input,IDENT,FOLLOW_IDENT_in_idxOrKsName5558); 
					 if (isKs) name.setKeyspace((t!=null?t.getText():null), false); else name.setIndex((t!=null?t.getText():null), false); 
					}
					break;
				case 2 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:949:7: t= QUOTED_NAME
					{
					t=(Token)match(input,QUOTED_NAME,FOLLOW_QUOTED_NAME_in_idxOrKsName5583); 
					 if (isKs) name.setKeyspace((t!=null?t.getText():null), true); else name.setIndex((t!=null?t.getText():null), true); 
					}
					break;
				case 3 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:950:7: k= unreserved_keyword
					{
					pushFollow(FOLLOW_unreserved_keyword_in_idxOrKsName5602);
					k=unreserved_keyword();
					state._fsp--;

					 if (isKs) name.setKeyspace(k, false); else name.setIndex(k, false); 
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
	// $ANTLR end "idxOrKsName"



	// $ANTLR start "columnFamilyName"
	// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:953:1: columnFamilyName returns [CFName name] : ( cfOrKsName[name, true] '.' )? cfOrKsName[name, false] ;
	public final CFName columnFamilyName() throws RecognitionException {
		CFName name = null;


		 name = new CFName(); 
		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:955:5: ( ( cfOrKsName[name, true] '.' )? cfOrKsName[name, false] )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:955:7: ( cfOrKsName[name, true] '.' )? cfOrKsName[name, false]
			{
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:955:7: ( cfOrKsName[name, true] '.' )?
			int alt109=2;
			switch ( input.LA(1) ) {
				case IDENT:
					{
					int LA109_1 = input.LA(2);
					if ( (LA109_1==160) ) {
						alt109=1;
					}
					}
					break;
				case QUOTED_NAME:
					{
					int LA109_2 = input.LA(2);
					if ( (LA109_2==160) ) {
						alt109=1;
					}
					}
					break;
				case K_ALL:
				case K_AS:
				case K_CLUSTERING:
				case K_COMPACT:
				case K_CONTAINS:
				case K_CUSTOM:
				case K_DETERMINISTIC:
				case K_DISTINCT:
				case K_EXISTS:
				case K_FILTERING:
				case K_FUNCTION:
				case K_KEYS:
				case K_KEYSPACES:
				case K_LANGUAGE:
				case K_LIST:
				case K_MAP:
				case K_NON:
				case K_NOSUPERUSER:
				case K_PASSWORD:
				case K_PERMISSION:
				case K_PERMISSIONS:
				case K_RETURNS:
				case K_STATIC:
				case K_STORAGE:
				case K_SUPERUSER:
				case K_TRIGGER:
				case K_TYPE:
				case K_USER:
				case K_USERS:
				case K_VALUES:
					{
					int LA109_3 = input.LA(2);
					if ( (LA109_3==160) ) {
						alt109=1;
					}
					}
					break;
				case K_ASCII:
					{
					int LA109_4 = input.LA(2);
					if ( (LA109_4==160) ) {
						alt109=1;
					}
					}
					break;
				case K_BIGINT:
					{
					int LA109_5 = input.LA(2);
					if ( (LA109_5==160) ) {
						alt109=1;
					}
					}
					break;
				case K_BLOB:
					{
					int LA109_6 = input.LA(2);
					if ( (LA109_6==160) ) {
						alt109=1;
					}
					}
					break;
				case K_BOOLEAN:
					{
					int LA109_7 = input.LA(2);
					if ( (LA109_7==160) ) {
						alt109=1;
					}
					}
					break;
				case K_COUNTER:
					{
					int LA109_8 = input.LA(2);
					if ( (LA109_8==160) ) {
						alt109=1;
					}
					}
					break;
				case K_DECIMAL:
					{
					int LA109_9 = input.LA(2);
					if ( (LA109_9==160) ) {
						alt109=1;
					}
					}
					break;
				case K_DOUBLE:
					{
					int LA109_10 = input.LA(2);
					if ( (LA109_10==160) ) {
						alt109=1;
					}
					}
					break;
				case K_FLOAT:
					{
					int LA109_11 = input.LA(2);
					if ( (LA109_11==160) ) {
						alt109=1;
					}
					}
					break;
				case K_INET:
					{
					int LA109_12 = input.LA(2);
					if ( (LA109_12==160) ) {
						alt109=1;
					}
					}
					break;
				case K_INT:
					{
					int LA109_13 = input.LA(2);
					if ( (LA109_13==160) ) {
						alt109=1;
					}
					}
					break;
				case K_TEXT:
					{
					int LA109_14 = input.LA(2);
					if ( (LA109_14==160) ) {
						alt109=1;
					}
					}
					break;
				case K_TIMESTAMP:
					{
					int LA109_15 = input.LA(2);
					if ( (LA109_15==160) ) {
						alt109=1;
					}
					}
					break;
				case K_UUID:
					{
					int LA109_16 = input.LA(2);
					if ( (LA109_16==160) ) {
						alt109=1;
					}
					}
					break;
				case K_VARCHAR:
					{
					int LA109_17 = input.LA(2);
					if ( (LA109_17==160) ) {
						alt109=1;
					}
					}
					break;
				case K_VARINT:
					{
					int LA109_18 = input.LA(2);
					if ( (LA109_18==160) ) {
						alt109=1;
					}
					}
					break;
				case K_TIMEUUID:
					{
					int LA109_19 = input.LA(2);
					if ( (LA109_19==160) ) {
						alt109=1;
					}
					}
					break;
				case K_COUNT:
				case K_KEY:
				case K_TTL:
				case K_WRITETIME:
					{
					int LA109_20 = input.LA(2);
					if ( (LA109_20==160) ) {
						alt109=1;
					}
					}
					break;
			}
			switch (alt109) {
				case 1 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:955:8: cfOrKsName[name, true] '.'
					{
					pushFollow(FOLLOW_cfOrKsName_in_columnFamilyName5635);
					cfOrKsName(name, true);
					state._fsp--;

					match(input,160,FOLLOW_160_in_columnFamilyName5638); 
					}
					break;

			}

			pushFollow(FOLLOW_cfOrKsName_in_columnFamilyName5642);
			cfOrKsName(name, false);
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
		return name;
	}
	// $ANTLR end "columnFamilyName"



	// $ANTLR start "userTypeName"
	// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:958:1: userTypeName returns [UTName name] : (ks= cident '.' )? ut= non_type_ident ;
	public final UTName userTypeName() throws RecognitionException {
		UTName name = null;


		ColumnIdentifier ks =null;
		ColumnIdentifier ut =null;

		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:959:5: ( (ks= cident '.' )? ut= non_type_ident )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:959:7: (ks= cident '.' )? ut= non_type_ident
			{
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:959:7: (ks= cident '.' )?
			int alt110=2;
			switch ( input.LA(1) ) {
				case IDENT:
					{
					int LA110_1 = input.LA(2);
					if ( (LA110_1==160) ) {
						alt110=1;
					}
					}
					break;
				case QUOTED_NAME:
					{
					int LA110_2 = input.LA(2);
					if ( (LA110_2==160) ) {
						alt110=1;
					}
					}
					break;
				case K_ALL:
				case K_AS:
				case K_CLUSTERING:
				case K_COMPACT:
				case K_CONTAINS:
				case K_CUSTOM:
				case K_DETERMINISTIC:
				case K_DISTINCT:
				case K_EXISTS:
				case K_FILTERING:
				case K_FUNCTION:
				case K_KEYS:
				case K_KEYSPACES:
				case K_LANGUAGE:
				case K_LIST:
				case K_MAP:
				case K_NON:
				case K_NOSUPERUSER:
				case K_PASSWORD:
				case K_PERMISSION:
				case K_PERMISSIONS:
				case K_RETURNS:
				case K_STATIC:
				case K_STORAGE:
				case K_SUPERUSER:
				case K_TRIGGER:
				case K_TYPE:
				case K_USER:
				case K_USERS:
				case K_VALUES:
					{
					int LA110_3 = input.LA(2);
					if ( (LA110_3==160) ) {
						alt110=1;
					}
					}
					break;
				case K_ASCII:
				case K_BIGINT:
				case K_BLOB:
				case K_BOOLEAN:
				case K_COUNT:
				case K_COUNTER:
				case K_DECIMAL:
				case K_DOUBLE:
				case K_FLOAT:
				case K_INET:
				case K_INT:
				case K_TEXT:
				case K_TIMESTAMP:
				case K_TIMEUUID:
				case K_TTL:
				case K_UUID:
				case K_VARCHAR:
				case K_VARINT:
				case K_WRITETIME:
					{
					alt110=1;
					}
					break;
				case K_KEY:
					{
					int LA110_5 = input.LA(2);
					if ( (LA110_5==160) ) {
						alt110=1;
					}
					}
					break;
			}
			switch (alt110) {
				case 1 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:959:8: ks= cident '.'
					{
					pushFollow(FOLLOW_cident_in_userTypeName5667);
					ks=cident();
					state._fsp--;

					match(input,160,FOLLOW_160_in_userTypeName5669); 
					}
					break;

			}

			pushFollow(FOLLOW_non_type_ident_in_userTypeName5675);
			ut=non_type_ident();
			state._fsp--;

			 return new UTName(ks, ut); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return name;
	}
	// $ANTLR end "userTypeName"



	// $ANTLR start "cfOrKsName"
	// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:962:1: cfOrKsName[CFName name, boolean isKs] : (t= IDENT |t= QUOTED_NAME |k= unreserved_keyword );
	public final void cfOrKsName(CFName name, boolean isKs) throws RecognitionException {
		Token t=null;
		String k =null;

		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:963:5: (t= IDENT |t= QUOTED_NAME |k= unreserved_keyword )
			int alt111=3;
			switch ( input.LA(1) ) {
			case IDENT:
				{
				alt111=1;
				}
				break;
			case QUOTED_NAME:
				{
				alt111=2;
				}
				break;
			case K_ALL:
			case K_AS:
			case K_ASCII:
			case K_BIGINT:
			case K_BLOB:
			case K_BOOLEAN:
			case K_CLUSTERING:
			case K_COMPACT:
			case K_CONTAINS:
			case K_COUNT:
			case K_COUNTER:
			case K_CUSTOM:
			case K_DECIMAL:
			case K_DETERMINISTIC:
			case K_DISTINCT:
			case K_DOUBLE:
			case K_EXISTS:
			case K_FILTERING:
			case K_FLOAT:
			case K_FUNCTION:
			case K_INET:
			case K_INT:
			case K_KEY:
			case K_KEYS:
			case K_KEYSPACES:
			case K_LANGUAGE:
			case K_LIST:
			case K_MAP:
			case K_NON:
			case K_NOSUPERUSER:
			case K_PASSWORD:
			case K_PERMISSION:
			case K_PERMISSIONS:
			case K_RETURNS:
			case K_STATIC:
			case K_STORAGE:
			case K_SUPERUSER:
			case K_TEXT:
			case K_TIMESTAMP:
			case K_TIMEUUID:
			case K_TRIGGER:
			case K_TTL:
			case K_TYPE:
			case K_USER:
			case K_USERS:
			case K_UUID:
			case K_VALUES:
			case K_VARCHAR:
			case K_VARINT:
			case K_WRITETIME:
				{
				alt111=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 111, 0, input);
				throw nvae;
			}
			switch (alt111) {
				case 1 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:963:7: t= IDENT
					{
					t=(Token)match(input,IDENT,FOLLOW_IDENT_in_cfOrKsName5697); 
					 if (isKs) name.setKeyspace((t!=null?t.getText():null), false); else name.setColumnFamily((t!=null?t.getText():null), false); 
					}
					break;
				case 2 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:964:7: t= QUOTED_NAME
					{
					t=(Token)match(input,QUOTED_NAME,FOLLOW_QUOTED_NAME_in_cfOrKsName5722); 
					 if (isKs) name.setKeyspace((t!=null?t.getText():null), true); else name.setColumnFamily((t!=null?t.getText():null), true); 
					}
					break;
				case 3 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:965:7: k= unreserved_keyword
					{
					pushFollow(FOLLOW_unreserved_keyword_in_cfOrKsName5741);
					k=unreserved_keyword();
					state._fsp--;

					 if (isKs) name.setKeyspace(k, false); else name.setColumnFamily(k, false); 
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
	// $ANTLR end "cfOrKsName"



	// $ANTLR start "constant"
	// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:968:1: constant returns [Constants.Literal constant] : (t= STRING_LITERAL |t= INTEGER |t= FLOAT |t= BOOLEAN |t= UUID |t= HEXNUMBER | ( '-' )? t= ( K_NAN | K_INFINITY ) );
	public final Constants.Literal constant() throws RecognitionException {
		Constants.Literal constant = null;


		Token t=null;

		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:969:5: (t= STRING_LITERAL |t= INTEGER |t= FLOAT |t= BOOLEAN |t= UUID |t= HEXNUMBER | ( '-' )? t= ( K_NAN | K_INFINITY ) )
			int alt113=7;
			switch ( input.LA(1) ) {
			case STRING_LITERAL:
				{
				alt113=1;
				}
				break;
			case INTEGER:
				{
				alt113=2;
				}
				break;
			case FLOAT:
				{
				alt113=3;
				}
				break;
			case BOOLEAN:
				{
				alt113=4;
				}
				break;
			case UUID:
				{
				alt113=5;
				}
				break;
			case HEXNUMBER:
				{
				alt113=6;
				}
				break;
			case K_INFINITY:
			case K_NAN:
			case 159:
				{
				alt113=7;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 113, 0, input);
				throw nvae;
			}
			switch (alt113) {
				case 1 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:969:7: t= STRING_LITERAL
					{
					t=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_constant5766); 
					 constant = Constants.Literal.string((t!=null?t.getText():null)); 
					}
					break;
				case 2 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:970:7: t= INTEGER
					{
					t=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_constant5778); 
					 constant = Constants.Literal.integer((t!=null?t.getText():null)); 
					}
					break;
				case 3 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:971:7: t= FLOAT
					{
					t=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_constant5797); 
					 constant = Constants.Literal.floatingPoint((t!=null?t.getText():null)); 
					}
					break;
				case 4 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:972:7: t= BOOLEAN
					{
					t=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_constant5818); 
					 constant = Constants.Literal.bool((t!=null?t.getText():null)); 
					}
					break;
				case 5 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:973:7: t= UUID
					{
					t=(Token)match(input,UUID,FOLLOW_UUID_in_constant5837); 
					 constant = Constants.Literal.uuid((t!=null?t.getText():null)); 
					}
					break;
				case 6 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:974:7: t= HEXNUMBER
					{
					t=(Token)match(input,HEXNUMBER,FOLLOW_HEXNUMBER_in_constant5859); 
					 constant = Constants.Literal.hex((t!=null?t.getText():null)); 
					}
					break;
				case 7 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:975:7: ( '-' )? t= ( K_NAN | K_INFINITY )
					{
					 String sign=""; 
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:975:27: ( '-' )?
					int alt112=2;
					int LA112_0 = input.LA(1);
					if ( (LA112_0==159) ) {
						alt112=1;
					}
					switch (alt112) {
						case 1 :
							// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:975:28: '-'
							{
							match(input,159,FOLLOW_159_in_constant5877); 
							sign = "-"; 
							}
							break;

					}

					t=input.LT(1);
					if ( input.LA(1)==K_INFINITY||input.LA(1)==K_NAN ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					 constant = Constants.Literal.floatingPoint(sign + (t!=null?t.getText():null)); 
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
		return constant;
	}
	// $ANTLR end "constant"



	// $ANTLR start "mapLiteral"
	// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:978:1: mapLiteral returns [Maps.Literal map] : '{' (k1= term ':' v1= term ( ',' kn= term ':' vn= term )* )? '}' ;
	public final Maps.Literal mapLiteral() throws RecognitionException {
		Maps.Literal map = null;


		Term.Raw k1 =null;
		Term.Raw v1 =null;
		Term.Raw kn =null;
		Term.Raw vn =null;

		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:979:5: ( '{' (k1= term ':' v1= term ( ',' kn= term ':' vn= term )* )? '}' )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:979:7: '{' (k1= term ':' v1= term ( ',' kn= term ':' vn= term )* )? '}'
			{
			match(input,172,FOLLOW_172_in_mapLiteral5915); 
			 List<Pair<Term.Raw, Term.Raw>> m = new ArrayList<Pair<Term.Raw, Term.Raw>>(); 
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:980:11: (k1= term ':' v1= term ( ',' kn= term ':' vn= term )* )?
			int alt115=2;
			int LA115_0 = input.LA(1);
			if ( (LA115_0==BOOLEAN||LA115_0==FLOAT||LA115_0==HEXNUMBER||(LA115_0 >= IDENT && LA115_0 <= INTEGER)||LA115_0==K_ALL||LA115_0==K_AS||LA115_0==K_ASCII||(LA115_0 >= K_BIGINT && LA115_0 <= K_BOOLEAN)||LA115_0==K_CLUSTERING||LA115_0==K_COMPACT||LA115_0==K_CONTAINS||LA115_0==K_COUNTER||(LA115_0 >= K_CUSTOM && LA115_0 <= K_DECIMAL)||(LA115_0 >= K_DETERMINISTIC && LA115_0 <= K_DOUBLE)||(LA115_0 >= K_EXISTS && LA115_0 <= K_FLOAT)||LA115_0==K_FUNCTION||(LA115_0 >= K_INET && LA115_0 <= K_INFINITY)||LA115_0==K_INT||LA115_0==K_KEYS||(LA115_0 >= K_KEYSPACES && LA115_0 <= K_LANGUAGE)||(LA115_0 >= K_LIST && LA115_0 <= K_MAP)||(LA115_0 >= K_NAN && LA115_0 <= K_NON)||LA115_0==K_NOSUPERUSER||LA115_0==K_NULL||(LA115_0 >= K_PASSWORD && LA115_0 <= K_PERMISSIONS)||LA115_0==K_RETURNS||(LA115_0 >= K_STATIC && LA115_0 <= K_TEXT)||(LA115_0 >= K_TIMESTAMP && LA115_0 <= K_TIMEUUID)||LA115_0==K_TOKEN||LA115_0==K_TRIGGER||LA115_0==K_TYPE||(LA115_0 >= K_USER && LA115_0 <= K_USERS)||(LA115_0 >= K_UUID && LA115_0 <= K_VARINT)||LA115_0==QMARK||LA115_0==STRING_LITERAL||LA115_0==UUID||LA115_0==155||LA115_0==159||LA115_0==161||LA115_0==169||LA115_0==172) ) {
				alt115=1;
			}
			switch (alt115) {
				case 1 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:980:13: k1= term ':' v1= term ( ',' kn= term ':' vn= term )*
					{
					pushFollow(FOLLOW_term_in_mapLiteral5933);
					k1=term();
					state._fsp--;

					match(input,161,FOLLOW_161_in_mapLiteral5935); 
					pushFollow(FOLLOW_term_in_mapLiteral5939);
					v1=term();
					state._fsp--;

					 m.add(Pair.create(k1, v1)); 
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:980:65: ( ',' kn= term ':' vn= term )*
					loop114:
					while (true) {
						int alt114=2;
						int LA114_0 = input.LA(1);
						if ( (LA114_0==158) ) {
							alt114=1;
						}

						switch (alt114) {
						case 1 :
							// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:980:67: ',' kn= term ':' vn= term
							{
							match(input,158,FOLLOW_158_in_mapLiteral5945); 
							pushFollow(FOLLOW_term_in_mapLiteral5949);
							kn=term();
							state._fsp--;

							match(input,161,FOLLOW_161_in_mapLiteral5951); 
							pushFollow(FOLLOW_term_in_mapLiteral5955);
							vn=term();
							state._fsp--;

							 m.add(Pair.create(kn, vn)); 
							}
							break;

						default :
							break loop114;
						}
					}

					}
					break;

			}

			match(input,173,FOLLOW_173_in_mapLiteral5971); 
			 map = new Maps.Literal(m); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return map;
	}
	// $ANTLR end "mapLiteral"



	// $ANTLR start "setOrMapLiteral"
	// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:984:1: setOrMapLiteral[Term.Raw t] returns [Term.Raw value] : ( ':' v= term ( ',' kn= term ':' vn= term )* | ( ',' tn= term )* );
	public final Term.Raw setOrMapLiteral(Term.Raw t) throws RecognitionException {
		Term.Raw value = null;


		Term.Raw v =null;
		Term.Raw kn =null;
		Term.Raw vn =null;
		Term.Raw tn =null;

		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:985:5: ( ':' v= term ( ',' kn= term ':' vn= term )* | ( ',' tn= term )* )
			int alt118=2;
			int LA118_0 = input.LA(1);
			if ( (LA118_0==161) ) {
				alt118=1;
			}
			else if ( (LA118_0==158||LA118_0==173) ) {
				alt118=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 118, 0, input);
				throw nvae;
			}

			switch (alt118) {
				case 1 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:985:7: ':' v= term ( ',' kn= term ':' vn= term )*
					{
					match(input,161,FOLLOW_161_in_setOrMapLiteral5995); 
					pushFollow(FOLLOW_term_in_setOrMapLiteral5999);
					v=term();
					state._fsp--;

					 List<Pair<Term.Raw, Term.Raw>> m = new ArrayList<Pair<Term.Raw, Term.Raw>>(); m.add(Pair.create(t, v)); 
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:986:11: ( ',' kn= term ':' vn= term )*
					loop116:
					while (true) {
						int alt116=2;
						int LA116_0 = input.LA(1);
						if ( (LA116_0==158) ) {
							alt116=1;
						}

						switch (alt116) {
						case 1 :
							// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:986:13: ',' kn= term ':' vn= term
							{
							match(input,158,FOLLOW_158_in_setOrMapLiteral6015); 
							pushFollow(FOLLOW_term_in_setOrMapLiteral6019);
							kn=term();
							state._fsp--;

							match(input,161,FOLLOW_161_in_setOrMapLiteral6021); 
							pushFollow(FOLLOW_term_in_setOrMapLiteral6025);
							vn=term();
							state._fsp--;

							 m.add(Pair.create(kn, vn)); 
							}
							break;

						default :
							break loop116;
						}
					}

					 value = new Maps.Literal(m); 
					}
					break;
				case 2 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:988:7: ( ',' tn= term )*
					{
					 List<Term.Raw> s = new ArrayList<Term.Raw>(); s.add(t); 
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:989:11: ( ',' tn= term )*
					loop117:
					while (true) {
						int alt117=2;
						int LA117_0 = input.LA(1);
						if ( (LA117_0==158) ) {
							alt117=1;
						}

						switch (alt117) {
						case 1 :
							// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:989:13: ',' tn= term
							{
							match(input,158,FOLLOW_158_in_setOrMapLiteral6060); 
							pushFollow(FOLLOW_term_in_setOrMapLiteral6064);
							tn=term();
							state._fsp--;

							 s.add(tn); 
							}
							break;

						default :
							break loop117;
						}
					}

					 value = new Sets.Literal(s); 
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
		return value;
	}
	// $ANTLR end "setOrMapLiteral"



	// $ANTLR start "collectionLiteral"
	// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:993:1: collectionLiteral returns [Term.Raw value] : ( '[' (t1= term ( ',' tn= term )* )? ']' | '{' t= term v= setOrMapLiteral[t] '}' | '{' '}' );
	public final Term.Raw collectionLiteral() throws RecognitionException {
		Term.Raw value = null;


		Term.Raw t1 =null;
		Term.Raw tn =null;
		Term.Raw t =null;
		Term.Raw v =null;

		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:994:5: ( '[' (t1= term ( ',' tn= term )* )? ']' | '{' t= term v= setOrMapLiteral[t] '}' | '{' '}' )
			int alt121=3;
			int LA121_0 = input.LA(1);
			if ( (LA121_0==169) ) {
				alt121=1;
			}
			else if ( (LA121_0==172) ) {
				int LA121_2 = input.LA(2);
				if ( (LA121_2==173) ) {
					alt121=3;
				}
				else if ( (LA121_2==BOOLEAN||LA121_2==FLOAT||LA121_2==HEXNUMBER||(LA121_2 >= IDENT && LA121_2 <= INTEGER)||LA121_2==K_ALL||LA121_2==K_AS||LA121_2==K_ASCII||(LA121_2 >= K_BIGINT && LA121_2 <= K_BOOLEAN)||LA121_2==K_CLUSTERING||LA121_2==K_COMPACT||LA121_2==K_CONTAINS||LA121_2==K_COUNTER||(LA121_2 >= K_CUSTOM && LA121_2 <= K_DECIMAL)||(LA121_2 >= K_DETERMINISTIC && LA121_2 <= K_DOUBLE)||(LA121_2 >= K_EXISTS && LA121_2 <= K_FLOAT)||LA121_2==K_FUNCTION||(LA121_2 >= K_INET && LA121_2 <= K_INFINITY)||LA121_2==K_INT||LA121_2==K_KEYS||(LA121_2 >= K_KEYSPACES && LA121_2 <= K_LANGUAGE)||(LA121_2 >= K_LIST && LA121_2 <= K_MAP)||(LA121_2 >= K_NAN && LA121_2 <= K_NON)||LA121_2==K_NOSUPERUSER||LA121_2==K_NULL||(LA121_2 >= K_PASSWORD && LA121_2 <= K_PERMISSIONS)||LA121_2==K_RETURNS||(LA121_2 >= K_STATIC && LA121_2 <= K_TEXT)||(LA121_2 >= K_TIMESTAMP && LA121_2 <= K_TIMEUUID)||LA121_2==K_TOKEN||LA121_2==K_TRIGGER||LA121_2==K_TYPE||(LA121_2 >= K_USER && LA121_2 <= K_USERS)||(LA121_2 >= K_UUID && LA121_2 <= K_VARINT)||LA121_2==QMARK||LA121_2==STRING_LITERAL||LA121_2==UUID||LA121_2==155||LA121_2==159||LA121_2==161||LA121_2==169||LA121_2==172) ) {
					alt121=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 121, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 121, 0, input);
				throw nvae;
			}

			switch (alt121) {
				case 1 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:994:7: '[' (t1= term ( ',' tn= term )* )? ']'
					{
					match(input,169,FOLLOW_169_in_collectionLiteral6098); 
					 List<Term.Raw> l = new ArrayList<Term.Raw>(); 
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:995:11: (t1= term ( ',' tn= term )* )?
					int alt120=2;
					int LA120_0 = input.LA(1);
					if ( (LA120_0==BOOLEAN||LA120_0==FLOAT||LA120_0==HEXNUMBER||(LA120_0 >= IDENT && LA120_0 <= INTEGER)||LA120_0==K_ALL||LA120_0==K_AS||LA120_0==K_ASCII||(LA120_0 >= K_BIGINT && LA120_0 <= K_BOOLEAN)||LA120_0==K_CLUSTERING||LA120_0==K_COMPACT||LA120_0==K_CONTAINS||LA120_0==K_COUNTER||(LA120_0 >= K_CUSTOM && LA120_0 <= K_DECIMAL)||(LA120_0 >= K_DETERMINISTIC && LA120_0 <= K_DOUBLE)||(LA120_0 >= K_EXISTS && LA120_0 <= K_FLOAT)||LA120_0==K_FUNCTION||(LA120_0 >= K_INET && LA120_0 <= K_INFINITY)||LA120_0==K_INT||LA120_0==K_KEYS||(LA120_0 >= K_KEYSPACES && LA120_0 <= K_LANGUAGE)||(LA120_0 >= K_LIST && LA120_0 <= K_MAP)||(LA120_0 >= K_NAN && LA120_0 <= K_NON)||LA120_0==K_NOSUPERUSER||LA120_0==K_NULL||(LA120_0 >= K_PASSWORD && LA120_0 <= K_PERMISSIONS)||LA120_0==K_RETURNS||(LA120_0 >= K_STATIC && LA120_0 <= K_TEXT)||(LA120_0 >= K_TIMESTAMP && LA120_0 <= K_TIMEUUID)||LA120_0==K_TOKEN||LA120_0==K_TRIGGER||LA120_0==K_TYPE||(LA120_0 >= K_USER && LA120_0 <= K_USERS)||(LA120_0 >= K_UUID && LA120_0 <= K_VARINT)||LA120_0==QMARK||LA120_0==STRING_LITERAL||LA120_0==UUID||LA120_0==155||LA120_0==159||LA120_0==161||LA120_0==169||LA120_0==172) ) {
						alt120=1;
					}
					switch (alt120) {
						case 1 :
							// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:995:13: t1= term ( ',' tn= term )*
							{
							pushFollow(FOLLOW_term_in_collectionLiteral6116);
							t1=term();
							state._fsp--;

							 l.add(t1); 
							// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:995:36: ( ',' tn= term )*
							loop119:
							while (true) {
								int alt119=2;
								int LA119_0 = input.LA(1);
								if ( (LA119_0==158) ) {
									alt119=1;
								}

								switch (alt119) {
								case 1 :
									// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:995:38: ',' tn= term
									{
									match(input,158,FOLLOW_158_in_collectionLiteral6122); 
									pushFollow(FOLLOW_term_in_collectionLiteral6126);
									tn=term();
									state._fsp--;

									 l.add(tn); 
									}
									break;

								default :
									break loop119;
								}
							}

							}
							break;

					}

					match(input,171,FOLLOW_171_in_collectionLiteral6142); 
					 value = new Lists.Literal(l); 
					}
					break;
				case 2 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:997:7: '{' t= term v= setOrMapLiteral[t] '}'
					{
					match(input,172,FOLLOW_172_in_collectionLiteral6152); 
					pushFollow(FOLLOW_term_in_collectionLiteral6156);
					t=term();
					state._fsp--;

					pushFollow(FOLLOW_setOrMapLiteral_in_collectionLiteral6160);
					v=setOrMapLiteral(t);
					state._fsp--;

					 value = v; 
					match(input,173,FOLLOW_173_in_collectionLiteral6165); 
					}
					break;
				case 3 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1000:7: '{' '}'
					{
					match(input,172,FOLLOW_172_in_collectionLiteral6183); 
					match(input,173,FOLLOW_173_in_collectionLiteral6185); 
					 value = new Sets.Literal(Collections.<Term.Raw>emptyList()); 
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
		return value;
	}
	// $ANTLR end "collectionLiteral"



	// $ANTLR start "usertypeLiteral"
	// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1003:1: usertypeLiteral returns [UserTypes.Literal ut] : '{' k1= cident ':' v1= term ( ',' kn= cident ':' vn= term )* '}' ;
	public final UserTypes.Literal usertypeLiteral() throws RecognitionException {
		UserTypes.Literal ut = null;


		ColumnIdentifier k1 =null;
		Term.Raw v1 =null;
		ColumnIdentifier kn =null;
		Term.Raw vn =null;

		 Map<ColumnIdentifier, Term.Raw> m = new HashMap<ColumnIdentifier, Term.Raw>(); 
		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1007:5: ( '{' k1= cident ':' v1= term ( ',' kn= cident ':' vn= term )* '}' )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1007:7: '{' k1= cident ':' v1= term ( ',' kn= cident ':' vn= term )* '}'
			{
			match(input,172,FOLLOW_172_in_usertypeLiteral6229); 
			pushFollow(FOLLOW_cident_in_usertypeLiteral6233);
			k1=cident();
			state._fsp--;

			match(input,161,FOLLOW_161_in_usertypeLiteral6235); 
			pushFollow(FOLLOW_term_in_usertypeLiteral6239);
			v1=term();
			state._fsp--;

			 m.put(k1, v1); 
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1007:52: ( ',' kn= cident ':' vn= term )*
			loop122:
			while (true) {
				int alt122=2;
				int LA122_0 = input.LA(1);
				if ( (LA122_0==158) ) {
					alt122=1;
				}

				switch (alt122) {
				case 1 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1007:54: ',' kn= cident ':' vn= term
					{
					match(input,158,FOLLOW_158_in_usertypeLiteral6245); 
					pushFollow(FOLLOW_cident_in_usertypeLiteral6249);
					kn=cident();
					state._fsp--;

					match(input,161,FOLLOW_161_in_usertypeLiteral6251); 
					pushFollow(FOLLOW_term_in_usertypeLiteral6255);
					vn=term();
					state._fsp--;

					 m.put(kn, vn); 
					}
					break;

				default :
					break loop122;
				}
			}

			match(input,173,FOLLOW_173_in_usertypeLiteral6262); 
			}

			 ut = new UserTypes.Literal(m); 
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return ut;
	}
	// $ANTLR end "usertypeLiteral"



	// $ANTLR start "tupleLiteral"
	// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1010:1: tupleLiteral returns [Tuples.Literal tt] : '(' t1= term ( ',' tn= term )* ')' ;
	public final Tuples.Literal tupleLiteral() throws RecognitionException {
		Tuples.Literal tt = null;


		Term.Raw t1 =null;
		Term.Raw tn =null;

		 List<Term.Raw> l = new ArrayList<Term.Raw>(); 
		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1013:5: ( '(' t1= term ( ',' tn= term )* ')' )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1013:7: '(' t1= term ( ',' tn= term )* ')'
			{
			match(input,155,FOLLOW_155_in_tupleLiteral6299); 
			pushFollow(FOLLOW_term_in_tupleLiteral6303);
			t1=term();
			state._fsp--;

			 l.add(t1); 
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1013:34: ( ',' tn= term )*
			loop123:
			while (true) {
				int alt123=2;
				int LA123_0 = input.LA(1);
				if ( (LA123_0==158) ) {
					alt123=1;
				}

				switch (alt123) {
				case 1 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1013:36: ',' tn= term
					{
					match(input,158,FOLLOW_158_in_tupleLiteral6309); 
					pushFollow(FOLLOW_term_in_tupleLiteral6313);
					tn=term();
					state._fsp--;

					 l.add(tn); 
					}
					break;

				default :
					break loop123;
				}
			}

			match(input,156,FOLLOW_156_in_tupleLiteral6320); 
			}

			 tt = new Tuples.Literal(l); 
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return tt;
	}
	// $ANTLR end "tupleLiteral"



	// $ANTLR start "value"
	// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1016:1: value returns [Term.Raw value] : (c= constant |l= collectionLiteral |u= usertypeLiteral |t= tupleLiteral | K_NULL | ':' id= cident | QMARK );
	public final Term.Raw value() throws RecognitionException {
		Term.Raw value = null;


		Constants.Literal c =null;
		Term.Raw l =null;
		UserTypes.Literal u =null;
		Tuples.Literal t =null;
		ColumnIdentifier id =null;

		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1017:5: (c= constant |l= collectionLiteral |u= usertypeLiteral |t= tupleLiteral | K_NULL | ':' id= cident | QMARK )
			int alt124=7;
			switch ( input.LA(1) ) {
			case BOOLEAN:
			case FLOAT:
			case HEXNUMBER:
			case INTEGER:
			case K_INFINITY:
			case K_NAN:
			case STRING_LITERAL:
			case UUID:
			case 159:
				{
				alt124=1;
				}
				break;
			case 169:
				{
				alt124=2;
				}
				break;
			case 172:
				{
				switch ( input.LA(2) ) {
				case BOOLEAN:
				case FLOAT:
				case HEXNUMBER:
				case INTEGER:
				case K_INFINITY:
				case K_NAN:
				case K_NULL:
				case K_TOKEN:
				case QMARK:
				case STRING_LITERAL:
				case UUID:
				case 155:
				case 159:
				case 161:
				case 169:
				case 172:
				case 173:
					{
					alt124=2;
					}
					break;
				case IDENT:
					{
					int LA124_8 = input.LA(3);
					if ( (LA124_8==155||LA124_8==162) ) {
						alt124=2;
					}
					else if ( (LA124_8==161) ) {
						alt124=3;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 124, 8, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case K_ALL:
				case K_AS:
				case K_CLUSTERING:
				case K_COMPACT:
				case K_CONTAINS:
				case K_CUSTOM:
				case K_DETERMINISTIC:
				case K_DISTINCT:
				case K_EXISTS:
				case K_FILTERING:
				case K_FUNCTION:
				case K_KEYS:
				case K_KEYSPACES:
				case K_LANGUAGE:
				case K_LIST:
				case K_MAP:
				case K_NON:
				case K_NOSUPERUSER:
				case K_PASSWORD:
				case K_PERMISSION:
				case K_PERMISSIONS:
				case K_RETURNS:
				case K_STATIC:
				case K_STORAGE:
				case K_SUPERUSER:
				case K_TRIGGER:
				case K_TYPE:
				case K_USER:
				case K_USERS:
				case K_VALUES:
					{
					int LA124_9 = input.LA(3);
					if ( (LA124_9==155||LA124_9==162) ) {
						alt124=2;
					}
					else if ( (LA124_9==161) ) {
						alt124=3;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 124, 9, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case K_ASCII:
					{
					int LA124_10 = input.LA(3);
					if ( (LA124_10==155||LA124_10==162) ) {
						alt124=2;
					}
					else if ( (LA124_10==161) ) {
						alt124=3;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 124, 10, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case K_BIGINT:
					{
					int LA124_11 = input.LA(3);
					if ( (LA124_11==155||LA124_11==162) ) {
						alt124=2;
					}
					else if ( (LA124_11==161) ) {
						alt124=3;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 124, 11, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case K_BLOB:
					{
					int LA124_12 = input.LA(3);
					if ( (LA124_12==155||LA124_12==162) ) {
						alt124=2;
					}
					else if ( (LA124_12==161) ) {
						alt124=3;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 124, 12, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case K_BOOLEAN:
					{
					int LA124_13 = input.LA(3);
					if ( (LA124_13==155||LA124_13==162) ) {
						alt124=2;
					}
					else if ( (LA124_13==161) ) {
						alt124=3;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 124, 13, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case K_COUNTER:
					{
					int LA124_14 = input.LA(3);
					if ( (LA124_14==155||LA124_14==162) ) {
						alt124=2;
					}
					else if ( (LA124_14==161) ) {
						alt124=3;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 124, 14, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case K_DECIMAL:
					{
					int LA124_15 = input.LA(3);
					if ( (LA124_15==155||LA124_15==162) ) {
						alt124=2;
					}
					else if ( (LA124_15==161) ) {
						alt124=3;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 124, 15, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case K_DOUBLE:
					{
					int LA124_16 = input.LA(3);
					if ( (LA124_16==155||LA124_16==162) ) {
						alt124=2;
					}
					else if ( (LA124_16==161) ) {
						alt124=3;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 124, 16, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case K_FLOAT:
					{
					int LA124_17 = input.LA(3);
					if ( (LA124_17==155||LA124_17==162) ) {
						alt124=2;
					}
					else if ( (LA124_17==161) ) {
						alt124=3;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 124, 17, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case K_INET:
					{
					int LA124_18 = input.LA(3);
					if ( (LA124_18==155||LA124_18==162) ) {
						alt124=2;
					}
					else if ( (LA124_18==161) ) {
						alt124=3;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 124, 18, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case K_INT:
					{
					int LA124_19 = input.LA(3);
					if ( (LA124_19==155||LA124_19==162) ) {
						alt124=2;
					}
					else if ( (LA124_19==161) ) {
						alt124=3;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 124, 19, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case K_TEXT:
					{
					int LA124_20 = input.LA(3);
					if ( (LA124_20==155||LA124_20==162) ) {
						alt124=2;
					}
					else if ( (LA124_20==161) ) {
						alt124=3;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 124, 20, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case K_TIMESTAMP:
					{
					int LA124_21 = input.LA(3);
					if ( (LA124_21==155||LA124_21==162) ) {
						alt124=2;
					}
					else if ( (LA124_21==161) ) {
						alt124=3;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 124, 21, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case K_UUID:
					{
					int LA124_22 = input.LA(3);
					if ( (LA124_22==155||LA124_22==162) ) {
						alt124=2;
					}
					else if ( (LA124_22==161) ) {
						alt124=3;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 124, 22, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case K_VARCHAR:
					{
					int LA124_23 = input.LA(3);
					if ( (LA124_23==155||LA124_23==162) ) {
						alt124=2;
					}
					else if ( (LA124_23==161) ) {
						alt124=3;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 124, 23, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case K_VARINT:
					{
					int LA124_24 = input.LA(3);
					if ( (LA124_24==155||LA124_24==162) ) {
						alt124=2;
					}
					else if ( (LA124_24==161) ) {
						alt124=3;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 124, 24, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case K_TIMEUUID:
					{
					int LA124_25 = input.LA(3);
					if ( (LA124_25==155||LA124_25==162) ) {
						alt124=2;
					}
					else if ( (LA124_25==161) ) {
						alt124=3;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 124, 25, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case K_COUNT:
				case K_KEY:
				case K_TTL:
				case K_WRITETIME:
				case QUOTED_NAME:
					{
					alt124=3;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 124, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 155:
				{
				alt124=4;
				}
				break;
			case K_NULL:
				{
				alt124=5;
				}
				break;
			case 161:
				{
				alt124=6;
				}
				break;
			case QMARK:
				{
				alt124=7;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 124, 0, input);
				throw nvae;
			}
			switch (alt124) {
				case 1 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1017:7: c= constant
					{
					pushFollow(FOLLOW_constant_in_value6343);
					c=constant();
					state._fsp--;

					 value = c; 
					}
					break;
				case 2 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1018:7: l= collectionLiteral
					{
					pushFollow(FOLLOW_collectionLiteral_in_value6365);
					l=collectionLiteral();
					state._fsp--;

					 value = l; 
					}
					break;
				case 3 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1019:7: u= usertypeLiteral
					{
					pushFollow(FOLLOW_usertypeLiteral_in_value6378);
					u=usertypeLiteral();
					state._fsp--;

					 value = u; 
					}
					break;
				case 4 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1020:7: t= tupleLiteral
					{
					pushFollow(FOLLOW_tupleLiteral_in_value6393);
					t=tupleLiteral();
					state._fsp--;

					 value = t; 
					}
					break;
				case 5 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1021:7: K_NULL
					{
					match(input,K_NULL,FOLLOW_K_NULL_in_value6409); 
					 value = Constants.NULL_LITERAL; 
					}
					break;
				case 6 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1022:7: ':' id= cident
					{
					match(input,161,FOLLOW_161_in_value6433); 
					pushFollow(FOLLOW_cident_in_value6437);
					id=cident();
					state._fsp--;

					 value = newBindVariables(id); 
					}
					break;
				case 7 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1023:7: QMARK
					{
					match(input,QMARK,FOLLOW_QMARK_in_value6454); 
					 value = newBindVariables(null); 
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
		return value;
	}
	// $ANTLR end "value"



	// $ANTLR start "intValue"
	// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1026:1: intValue returns [Term.Raw value] : (|t= INTEGER | ':' id= cident | QMARK );
	public final Term.Raw intValue() throws RecognitionException {
		Term.Raw value = null;


		Token t=null;
		ColumnIdentifier id =null;

		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1027:5: (|t= INTEGER | ':' id= cident | QMARK )
			int alt125=4;
			switch ( input.LA(1) ) {
			case EOF:
			case K_ALLOW:
			case K_AND:
			case K_APPLY:
			case K_DELETE:
			case K_INSERT:
			case K_SET:
			case K_THROUGH:
			case K_UPDATE:
			case K_WHERE:
			case 163:
				{
				alt125=1;
				}
				break;
			case INTEGER:
				{
				alt125=2;
				}
				break;
			case 161:
				{
				alt125=3;
				}
				break;
			case QMARK:
				{
				alt125=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 125, 0, input);
				throw nvae;
			}
			switch (alt125) {
				case 1 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1028:5: 
					{
					}
					break;
				case 2 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1028:7: t= INTEGER
					{
					t=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_intValue6500); 
					 value = Constants.Literal.integer((t!=null?t.getText():null)); 
					}
					break;
				case 3 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1029:7: ':' id= cident
					{
					match(input,161,FOLLOW_161_in_intValue6514); 
					pushFollow(FOLLOW_cident_in_intValue6518);
					id=cident();
					state._fsp--;

					 value = newBindVariables(id); 
					}
					break;
				case 4 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1030:7: QMARK
					{
					match(input,QMARK,FOLLOW_QMARK_in_intValue6528); 
					 value = newBindVariables(null); 
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
		return value;
	}
	// $ANTLR end "intValue"



	// $ANTLR start "functionName"
	// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1033:1: functionName returns [FunctionName s] : (f= allowedFunctionName |b= allowedFunctionName '::' f= allowedFunctionName );
	public final FunctionName functionName() throws RecognitionException {
		FunctionName s = null;


		String f =null;
		String b =null;

		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1034:5: (f= allowedFunctionName |b= allowedFunctionName '::' f= allowedFunctionName )
			int alt126=2;
			switch ( input.LA(1) ) {
			case IDENT:
				{
				int LA126_1 = input.LA(2);
				if ( (LA126_1==EOF||LA126_1==155||LA126_1==163) ) {
					alt126=1;
				}
				else if ( (LA126_1==162) ) {
					alt126=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 126, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case K_ALL:
			case K_AS:
			case K_CLUSTERING:
			case K_COMPACT:
			case K_CONTAINS:
			case K_CUSTOM:
			case K_DETERMINISTIC:
			case K_DISTINCT:
			case K_EXISTS:
			case K_FILTERING:
			case K_FUNCTION:
			case K_KEYS:
			case K_KEYSPACES:
			case K_LANGUAGE:
			case K_LIST:
			case K_MAP:
			case K_NON:
			case K_NOSUPERUSER:
			case K_PASSWORD:
			case K_PERMISSION:
			case K_PERMISSIONS:
			case K_RETURNS:
			case K_STATIC:
			case K_STORAGE:
			case K_SUPERUSER:
			case K_TRIGGER:
			case K_TYPE:
			case K_USER:
			case K_USERS:
			case K_VALUES:
				{
				int LA126_2 = input.LA(2);
				if ( (LA126_2==EOF||LA126_2==155||LA126_2==163) ) {
					alt126=1;
				}
				else if ( (LA126_2==162) ) {
					alt126=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 126, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case K_ASCII:
				{
				int LA126_3 = input.LA(2);
				if ( (LA126_3==EOF||LA126_3==155||LA126_3==163) ) {
					alt126=1;
				}
				else if ( (LA126_3==162) ) {
					alt126=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 126, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case K_BIGINT:
				{
				int LA126_4 = input.LA(2);
				if ( (LA126_4==EOF||LA126_4==155||LA126_4==163) ) {
					alt126=1;
				}
				else if ( (LA126_4==162) ) {
					alt126=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 126, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case K_BLOB:
				{
				int LA126_5 = input.LA(2);
				if ( (LA126_5==EOF||LA126_5==155||LA126_5==163) ) {
					alt126=1;
				}
				else if ( (LA126_5==162) ) {
					alt126=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 126, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case K_BOOLEAN:
				{
				int LA126_6 = input.LA(2);
				if ( (LA126_6==EOF||LA126_6==155||LA126_6==163) ) {
					alt126=1;
				}
				else if ( (LA126_6==162) ) {
					alt126=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 126, 6, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case K_COUNTER:
				{
				int LA126_7 = input.LA(2);
				if ( (LA126_7==EOF||LA126_7==155||LA126_7==163) ) {
					alt126=1;
				}
				else if ( (LA126_7==162) ) {
					alt126=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 126, 7, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case K_DECIMAL:
				{
				int LA126_8 = input.LA(2);
				if ( (LA126_8==EOF||LA126_8==155||LA126_8==163) ) {
					alt126=1;
				}
				else if ( (LA126_8==162) ) {
					alt126=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 126, 8, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case K_DOUBLE:
				{
				int LA126_9 = input.LA(2);
				if ( (LA126_9==EOF||LA126_9==155||LA126_9==163) ) {
					alt126=1;
				}
				else if ( (LA126_9==162) ) {
					alt126=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 126, 9, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case K_FLOAT:
				{
				int LA126_10 = input.LA(2);
				if ( (LA126_10==EOF||LA126_10==155||LA126_10==163) ) {
					alt126=1;
				}
				else if ( (LA126_10==162) ) {
					alt126=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 126, 10, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case K_INET:
				{
				int LA126_11 = input.LA(2);
				if ( (LA126_11==EOF||LA126_11==155||LA126_11==163) ) {
					alt126=1;
				}
				else if ( (LA126_11==162) ) {
					alt126=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 126, 11, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case K_INT:
				{
				int LA126_12 = input.LA(2);
				if ( (LA126_12==EOF||LA126_12==155||LA126_12==163) ) {
					alt126=1;
				}
				else if ( (LA126_12==162) ) {
					alt126=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 126, 12, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case K_TEXT:
				{
				int LA126_13 = input.LA(2);
				if ( (LA126_13==EOF||LA126_13==155||LA126_13==163) ) {
					alt126=1;
				}
				else if ( (LA126_13==162) ) {
					alt126=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 126, 13, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case K_TIMESTAMP:
				{
				int LA126_14 = input.LA(2);
				if ( (LA126_14==EOF||LA126_14==155||LA126_14==163) ) {
					alt126=1;
				}
				else if ( (LA126_14==162) ) {
					alt126=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 126, 14, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case K_UUID:
				{
				int LA126_15 = input.LA(2);
				if ( (LA126_15==EOF||LA126_15==155||LA126_15==163) ) {
					alt126=1;
				}
				else if ( (LA126_15==162) ) {
					alt126=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 126, 15, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case K_VARCHAR:
				{
				int LA126_16 = input.LA(2);
				if ( (LA126_16==EOF||LA126_16==155||LA126_16==163) ) {
					alt126=1;
				}
				else if ( (LA126_16==162) ) {
					alt126=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 126, 16, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case K_VARINT:
				{
				int LA126_17 = input.LA(2);
				if ( (LA126_17==EOF||LA126_17==155||LA126_17==163) ) {
					alt126=1;
				}
				else if ( (LA126_17==162) ) {
					alt126=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 126, 17, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case K_TIMEUUID:
				{
				int LA126_18 = input.LA(2);
				if ( (LA126_18==EOF||LA126_18==155||LA126_18==163) ) {
					alt126=1;
				}
				else if ( (LA126_18==162) ) {
					alt126=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 126, 18, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case K_TOKEN:
				{
				int LA126_19 = input.LA(2);
				if ( (LA126_19==EOF||LA126_19==155||LA126_19==163) ) {
					alt126=1;
				}
				else if ( (LA126_19==162) ) {
					alt126=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 126, 19, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 126, 0, input);
				throw nvae;
			}
			switch (alt126) {
				case 1 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1034:7: f= allowedFunctionName
					{
					pushFollow(FOLLOW_allowedFunctionName_in_functionName6561);
					f=allowedFunctionName();
					state._fsp--;

					 s = new FunctionName(f); 
					}
					break;
				case 2 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1035:7: b= allowedFunctionName '::' f= allowedFunctionName
					{
					pushFollow(FOLLOW_allowedFunctionName_in_functionName6600);
					b=allowedFunctionName();
					state._fsp--;

					match(input,162,FOLLOW_162_in_functionName6602); 
					pushFollow(FOLLOW_allowedFunctionName_in_functionName6606);
					f=allowedFunctionName();
					state._fsp--;

					 s = new FunctionName(b, f); 
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
		return s;
	}
	// $ANTLR end "functionName"



	// $ANTLR start "allowedFunctionName"
	// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1038:1: allowedFunctionName returns [String s] : (f= IDENT |u= unreserved_function_keyword | K_TOKEN );
	public final String allowedFunctionName() throws RecognitionException {
		String s = null;


		Token f=null;
		String u =null;

		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1039:5: (f= IDENT |u= unreserved_function_keyword | K_TOKEN )
			int alt127=3;
			switch ( input.LA(1) ) {
			case IDENT:
				{
				alt127=1;
				}
				break;
			case K_ALL:
			case K_AS:
			case K_ASCII:
			case K_BIGINT:
			case K_BLOB:
			case K_BOOLEAN:
			case K_CLUSTERING:
			case K_COMPACT:
			case K_CONTAINS:
			case K_COUNTER:
			case K_CUSTOM:
			case K_DECIMAL:
			case K_DETERMINISTIC:
			case K_DISTINCT:
			case K_DOUBLE:
			case K_EXISTS:
			case K_FILTERING:
			case K_FLOAT:
			case K_FUNCTION:
			case K_INET:
			case K_INT:
			case K_KEYS:
			case K_KEYSPACES:
			case K_LANGUAGE:
			case K_LIST:
			case K_MAP:
			case K_NON:
			case K_NOSUPERUSER:
			case K_PASSWORD:
			case K_PERMISSION:
			case K_PERMISSIONS:
			case K_RETURNS:
			case K_STATIC:
			case K_STORAGE:
			case K_SUPERUSER:
			case K_TEXT:
			case K_TIMESTAMP:
			case K_TIMEUUID:
			case K_TRIGGER:
			case K_TYPE:
			case K_USER:
			case K_USERS:
			case K_UUID:
			case K_VALUES:
			case K_VARCHAR:
			case K_VARINT:
				{
				alt127=2;
				}
				break;
			case K_TOKEN:
				{
				alt127=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 127, 0, input);
				throw nvae;
			}
			switch (alt127) {
				case 1 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1039:7: f= IDENT
					{
					f=(Token)match(input,IDENT,FOLLOW_IDENT_in_allowedFunctionName6631); 
					 s = (f!=null?f.getText():null); 
					}
					break;
				case 2 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1040:7: u= unreserved_function_keyword
					{
					pushFollow(FOLLOW_unreserved_function_keyword_in_allowedFunctionName6665);
					u=unreserved_function_keyword();
					state._fsp--;

					 s = u; 
					}
					break;
				case 3 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1041:7: K_TOKEN
					{
					match(input,K_TOKEN,FOLLOW_K_TOKEN_in_allowedFunctionName6675); 
					 s = "token"; 
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
		return s;
	}
	// $ANTLR end "allowedFunctionName"



	// $ANTLR start "functionArgs"
	// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1044:1: functionArgs returns [List<Term.Raw> a] : ( '(' ')' | '(' t1= term ( ',' tn= term )* ')' );
	public final List<Term.Raw> functionArgs() throws RecognitionException {
		List<Term.Raw> a = null;


		Term.Raw t1 =null;
		Term.Raw tn =null;

		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1045:5: ( '(' ')' | '(' t1= term ( ',' tn= term )* ')' )
			int alt129=2;
			int LA129_0 = input.LA(1);
			if ( (LA129_0==155) ) {
				int LA129_1 = input.LA(2);
				if ( (LA129_1==156) ) {
					alt129=1;
				}
				else if ( (LA129_1==BOOLEAN||LA129_1==FLOAT||LA129_1==HEXNUMBER||(LA129_1 >= IDENT && LA129_1 <= INTEGER)||LA129_1==K_ALL||LA129_1==K_AS||LA129_1==K_ASCII||(LA129_1 >= K_BIGINT && LA129_1 <= K_BOOLEAN)||LA129_1==K_CLUSTERING||LA129_1==K_COMPACT||LA129_1==K_CONTAINS||LA129_1==K_COUNTER||(LA129_1 >= K_CUSTOM && LA129_1 <= K_DECIMAL)||(LA129_1 >= K_DETERMINISTIC && LA129_1 <= K_DOUBLE)||(LA129_1 >= K_EXISTS && LA129_1 <= K_FLOAT)||LA129_1==K_FUNCTION||(LA129_1 >= K_INET && LA129_1 <= K_INFINITY)||LA129_1==K_INT||LA129_1==K_KEYS||(LA129_1 >= K_KEYSPACES && LA129_1 <= K_LANGUAGE)||(LA129_1 >= K_LIST && LA129_1 <= K_MAP)||(LA129_1 >= K_NAN && LA129_1 <= K_NON)||LA129_1==K_NOSUPERUSER||LA129_1==K_NULL||(LA129_1 >= K_PASSWORD && LA129_1 <= K_PERMISSIONS)||LA129_1==K_RETURNS||(LA129_1 >= K_STATIC && LA129_1 <= K_TEXT)||(LA129_1 >= K_TIMESTAMP && LA129_1 <= K_TIMEUUID)||LA129_1==K_TOKEN||LA129_1==K_TRIGGER||LA129_1==K_TYPE||(LA129_1 >= K_USER && LA129_1 <= K_USERS)||(LA129_1 >= K_UUID && LA129_1 <= K_VARINT)||LA129_1==QMARK||LA129_1==STRING_LITERAL||LA129_1==UUID||LA129_1==155||LA129_1==159||LA129_1==161||LA129_1==169||LA129_1==172) ) {
					alt129=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 129, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 129, 0, input);
				throw nvae;
			}

			switch (alt129) {
				case 1 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1045:7: '(' ')'
					{
					match(input,155,FOLLOW_155_in_functionArgs6720); 
					match(input,156,FOLLOW_156_in_functionArgs6722); 
					 a = Collections.emptyList(); 
					}
					break;
				case 2 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1046:7: '(' t1= term ( ',' tn= term )* ')'
					{
					match(input,155,FOLLOW_155_in_functionArgs6732); 
					pushFollow(FOLLOW_term_in_functionArgs6736);
					t1=term();
					state._fsp--;

					 List<Term.Raw> args = new ArrayList<Term.Raw>(); args.add(t1); 
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1047:11: ( ',' tn= term )*
					loop128:
					while (true) {
						int alt128=2;
						int LA128_0 = input.LA(1);
						if ( (LA128_0==158) ) {
							alt128=1;
						}

						switch (alt128) {
						case 1 :
							// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1047:13: ',' tn= term
							{
							match(input,158,FOLLOW_158_in_functionArgs6752); 
							pushFollow(FOLLOW_term_in_functionArgs6756);
							tn=term();
							state._fsp--;

							 args.add(tn); 
							}
							break;

						default :
							break loop128;
						}
					}

					match(input,156,FOLLOW_156_in_functionArgs6770); 
					 a = args; 
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
		return a;
	}
	// $ANTLR end "functionArgs"



	// $ANTLR start "term"
	// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1051:1: term returns [Term.Raw term] : (v= value |f= functionName args= functionArgs | '(' c= comparatorType ')' t= term );
	public final Term.Raw term() throws RecognitionException {
		Term.Raw term = null;


		Term.Raw v =null;
		FunctionName f =null;
		List<Term.Raw> args =null;
		CQL3Type.Raw c =null;
		Term.Raw t =null;

		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1052:5: (v= value |f= functionName args= functionArgs | '(' c= comparatorType ')' t= term )
			int alt130=3;
			switch ( input.LA(1) ) {
			case BOOLEAN:
			case FLOAT:
			case HEXNUMBER:
			case INTEGER:
			case K_INFINITY:
			case K_NAN:
			case K_NULL:
			case QMARK:
			case STRING_LITERAL:
			case UUID:
			case 159:
			case 161:
			case 169:
			case 172:
				{
				alt130=1;
				}
				break;
			case 155:
				{
				switch ( input.LA(2) ) {
				case STRING_LITERAL:
					{
					int LA130_4 = input.LA(3);
					if ( (LA130_4==158) ) {
						alt130=1;
					}
					else if ( (LA130_4==156) ) {
						switch ( input.LA(4) ) {
						case EOF:
						case K_ALLOW:
						case K_AND:
						case K_APPLY:
						case K_DELETE:
						case K_IF:
						case K_INSERT:
						case K_LIMIT:
						case K_ORDER:
						case K_REPEAT:
						case K_THROUGH:
						case K_TO:
						case K_UPDATE:
						case K_WHERE:
						case 156:
						case 157:
						case 158:
						case 163:
						case 171:
						case 173:
							{
							alt130=1;
							}
							break;
						case 161:
							{
							switch ( input.LA(5) ) {
							case BOOLEAN:
							case FLOAT:
							case HEXNUMBER:
							case INTEGER:
							case K_INFINITY:
							case K_NAN:
							case K_NULL:
							case K_TOKEN:
							case QMARK:
							case STRING_LITERAL:
							case UUID:
							case 155:
							case 159:
							case 161:
							case 169:
							case 172:
								{
								alt130=1;
								}
								break;
							case IDENT:
								{
								int LA130_28 = input.LA(6);
								if ( (LA130_28==155||LA130_28==162) ) {
									alt130=1;
								}
								else if ( (LA130_28==EOF||LA130_28==K_ALLOW||(LA130_28 >= K_AND && LA130_28 <= K_APPLY)||LA130_28==K_DELETE||LA130_28==K_IF||LA130_28==K_INSERT||LA130_28==K_LIMIT||LA130_28==K_ORDER||LA130_28==K_REPEAT||LA130_28==K_THROUGH||LA130_28==K_TO||LA130_28==K_UPDATE||LA130_28==K_WHERE||(LA130_28 >= 156 && LA130_28 <= 158)||LA130_28==161||LA130_28==163||LA130_28==171||LA130_28==173) ) {
									alt130=3;
								}

								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 130, 28, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

								}
								break;
							case K_ALL:
							case K_AS:
							case K_CLUSTERING:
							case K_COMPACT:
							case K_CONTAINS:
							case K_CUSTOM:
							case K_DETERMINISTIC:
							case K_DISTINCT:
							case K_EXISTS:
							case K_FILTERING:
							case K_FUNCTION:
							case K_KEYS:
							case K_KEYSPACES:
							case K_LANGUAGE:
							case K_LIST:
							case K_MAP:
							case K_NON:
							case K_NOSUPERUSER:
							case K_PASSWORD:
							case K_PERMISSION:
							case K_PERMISSIONS:
							case K_RETURNS:
							case K_STATIC:
							case K_STORAGE:
							case K_SUPERUSER:
							case K_TRIGGER:
							case K_TYPE:
							case K_USER:
							case K_USERS:
							case K_VALUES:
								{
								int LA130_29 = input.LA(6);
								if ( (LA130_29==155||LA130_29==162) ) {
									alt130=1;
								}
								else if ( (LA130_29==EOF||LA130_29==K_ALLOW||(LA130_29 >= K_AND && LA130_29 <= K_APPLY)||LA130_29==K_DELETE||LA130_29==K_IF||LA130_29==K_INSERT||LA130_29==K_LIMIT||LA130_29==K_ORDER||LA130_29==K_REPEAT||LA130_29==K_THROUGH||LA130_29==K_TO||LA130_29==K_UPDATE||LA130_29==K_WHERE||(LA130_29 >= 156 && LA130_29 <= 158)||LA130_29==161||LA130_29==163||LA130_29==171||LA130_29==173) ) {
									alt130=3;
								}

								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 130, 29, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

								}
								break;
							case K_ASCII:
								{
								int LA130_30 = input.LA(6);
								if ( (LA130_30==155||LA130_30==162) ) {
									alt130=1;
								}
								else if ( (LA130_30==EOF||LA130_30==K_ALLOW||(LA130_30 >= K_AND && LA130_30 <= K_APPLY)||LA130_30==K_DELETE||LA130_30==K_IF||LA130_30==K_INSERT||LA130_30==K_LIMIT||LA130_30==K_ORDER||LA130_30==K_REPEAT||LA130_30==K_THROUGH||LA130_30==K_TO||LA130_30==K_UPDATE||LA130_30==K_WHERE||(LA130_30 >= 156 && LA130_30 <= 158)||LA130_30==161||LA130_30==163||LA130_30==171||LA130_30==173) ) {
									alt130=3;
								}

								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 130, 30, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

								}
								break;
							case K_BIGINT:
								{
								int LA130_31 = input.LA(6);
								if ( (LA130_31==155||LA130_31==162) ) {
									alt130=1;
								}
								else if ( (LA130_31==EOF||LA130_31==K_ALLOW||(LA130_31 >= K_AND && LA130_31 <= K_APPLY)||LA130_31==K_DELETE||LA130_31==K_IF||LA130_31==K_INSERT||LA130_31==K_LIMIT||LA130_31==K_ORDER||LA130_31==K_REPEAT||LA130_31==K_THROUGH||LA130_31==K_TO||LA130_31==K_UPDATE||LA130_31==K_WHERE||(LA130_31 >= 156 && LA130_31 <= 158)||LA130_31==161||LA130_31==163||LA130_31==171||LA130_31==173) ) {
									alt130=3;
								}

								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 130, 31, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

								}
								break;
							case K_BLOB:
								{
								int LA130_32 = input.LA(6);
								if ( (LA130_32==155||LA130_32==162) ) {
									alt130=1;
								}
								else if ( (LA130_32==EOF||LA130_32==K_ALLOW||(LA130_32 >= K_AND && LA130_32 <= K_APPLY)||LA130_32==K_DELETE||LA130_32==K_IF||LA130_32==K_INSERT||LA130_32==K_LIMIT||LA130_32==K_ORDER||LA130_32==K_REPEAT||LA130_32==K_THROUGH||LA130_32==K_TO||LA130_32==K_UPDATE||LA130_32==K_WHERE||(LA130_32 >= 156 && LA130_32 <= 158)||LA130_32==161||LA130_32==163||LA130_32==171||LA130_32==173) ) {
									alt130=3;
								}

								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 130, 32, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

								}
								break;
							case K_BOOLEAN:
								{
								int LA130_33 = input.LA(6);
								if ( (LA130_33==155||LA130_33==162) ) {
									alt130=1;
								}
								else if ( (LA130_33==EOF||LA130_33==K_ALLOW||(LA130_33 >= K_AND && LA130_33 <= K_APPLY)||LA130_33==K_DELETE||LA130_33==K_IF||LA130_33==K_INSERT||LA130_33==K_LIMIT||LA130_33==K_ORDER||LA130_33==K_REPEAT||LA130_33==K_THROUGH||LA130_33==K_TO||LA130_33==K_UPDATE||LA130_33==K_WHERE||(LA130_33 >= 156 && LA130_33 <= 158)||LA130_33==161||LA130_33==163||LA130_33==171||LA130_33==173) ) {
									alt130=3;
								}

								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 130, 33, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

								}
								break;
							case K_COUNTER:
								{
								int LA130_34 = input.LA(6);
								if ( (LA130_34==155||LA130_34==162) ) {
									alt130=1;
								}
								else if ( (LA130_34==EOF||LA130_34==K_ALLOW||(LA130_34 >= K_AND && LA130_34 <= K_APPLY)||LA130_34==K_DELETE||LA130_34==K_IF||LA130_34==K_INSERT||LA130_34==K_LIMIT||LA130_34==K_ORDER||LA130_34==K_REPEAT||LA130_34==K_THROUGH||LA130_34==K_TO||LA130_34==K_UPDATE||LA130_34==K_WHERE||(LA130_34 >= 156 && LA130_34 <= 158)||LA130_34==161||LA130_34==163||LA130_34==171||LA130_34==173) ) {
									alt130=3;
								}

								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 130, 34, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

								}
								break;
							case K_DECIMAL:
								{
								int LA130_35 = input.LA(6);
								if ( (LA130_35==155||LA130_35==162) ) {
									alt130=1;
								}
								else if ( (LA130_35==EOF||LA130_35==K_ALLOW||(LA130_35 >= K_AND && LA130_35 <= K_APPLY)||LA130_35==K_DELETE||LA130_35==K_IF||LA130_35==K_INSERT||LA130_35==K_LIMIT||LA130_35==K_ORDER||LA130_35==K_REPEAT||LA130_35==K_THROUGH||LA130_35==K_TO||LA130_35==K_UPDATE||LA130_35==K_WHERE||(LA130_35 >= 156 && LA130_35 <= 158)||LA130_35==161||LA130_35==163||LA130_35==171||LA130_35==173) ) {
									alt130=3;
								}

								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 130, 35, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

								}
								break;
							case K_DOUBLE:
								{
								int LA130_36 = input.LA(6);
								if ( (LA130_36==155||LA130_36==162) ) {
									alt130=1;
								}
								else if ( (LA130_36==EOF||LA130_36==K_ALLOW||(LA130_36 >= K_AND && LA130_36 <= K_APPLY)||LA130_36==K_DELETE||LA130_36==K_IF||LA130_36==K_INSERT||LA130_36==K_LIMIT||LA130_36==K_ORDER||LA130_36==K_REPEAT||LA130_36==K_THROUGH||LA130_36==K_TO||LA130_36==K_UPDATE||LA130_36==K_WHERE||(LA130_36 >= 156 && LA130_36 <= 158)||LA130_36==161||LA130_36==163||LA130_36==171||LA130_36==173) ) {
									alt130=3;
								}

								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 130, 36, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

								}
								break;
							case K_FLOAT:
								{
								int LA130_37 = input.LA(6);
								if ( (LA130_37==155||LA130_37==162) ) {
									alt130=1;
								}
								else if ( (LA130_37==EOF||LA130_37==K_ALLOW||(LA130_37 >= K_AND && LA130_37 <= K_APPLY)||LA130_37==K_DELETE||LA130_37==K_IF||LA130_37==K_INSERT||LA130_37==K_LIMIT||LA130_37==K_ORDER||LA130_37==K_REPEAT||LA130_37==K_THROUGH||LA130_37==K_TO||LA130_37==K_UPDATE||LA130_37==K_WHERE||(LA130_37 >= 156 && LA130_37 <= 158)||LA130_37==161||LA130_37==163||LA130_37==171||LA130_37==173) ) {
									alt130=3;
								}

								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 130, 37, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

								}
								break;
							case K_INET:
								{
								int LA130_38 = input.LA(6);
								if ( (LA130_38==155||LA130_38==162) ) {
									alt130=1;
								}
								else if ( (LA130_38==EOF||LA130_38==K_ALLOW||(LA130_38 >= K_AND && LA130_38 <= K_APPLY)||LA130_38==K_DELETE||LA130_38==K_IF||LA130_38==K_INSERT||LA130_38==K_LIMIT||LA130_38==K_ORDER||LA130_38==K_REPEAT||LA130_38==K_THROUGH||LA130_38==K_TO||LA130_38==K_UPDATE||LA130_38==K_WHERE||(LA130_38 >= 156 && LA130_38 <= 158)||LA130_38==161||LA130_38==163||LA130_38==171||LA130_38==173) ) {
									alt130=3;
								}

								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 130, 38, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

								}
								break;
							case K_INT:
								{
								int LA130_39 = input.LA(6);
								if ( (LA130_39==155||LA130_39==162) ) {
									alt130=1;
								}
								else if ( (LA130_39==EOF||LA130_39==K_ALLOW||(LA130_39 >= K_AND && LA130_39 <= K_APPLY)||LA130_39==K_DELETE||LA130_39==K_IF||LA130_39==K_INSERT||LA130_39==K_LIMIT||LA130_39==K_ORDER||LA130_39==K_REPEAT||LA130_39==K_THROUGH||LA130_39==K_TO||LA130_39==K_UPDATE||LA130_39==K_WHERE||(LA130_39 >= 156 && LA130_39 <= 158)||LA130_39==161||LA130_39==163||LA130_39==171||LA130_39==173) ) {
									alt130=3;
								}

								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 130, 39, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

								}
								break;
							case K_TEXT:
								{
								int LA130_40 = input.LA(6);
								if ( (LA130_40==155||LA130_40==162) ) {
									alt130=1;
								}
								else if ( (LA130_40==EOF||LA130_40==K_ALLOW||(LA130_40 >= K_AND && LA130_40 <= K_APPLY)||LA130_40==K_DELETE||LA130_40==K_IF||LA130_40==K_INSERT||LA130_40==K_LIMIT||LA130_40==K_ORDER||LA130_40==K_REPEAT||LA130_40==K_THROUGH||LA130_40==K_TO||LA130_40==K_UPDATE||LA130_40==K_WHERE||(LA130_40 >= 156 && LA130_40 <= 158)||LA130_40==161||LA130_40==163||LA130_40==171||LA130_40==173) ) {
									alt130=3;
								}

								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 130, 40, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

								}
								break;
							case K_TIMESTAMP:
								{
								int LA130_41 = input.LA(6);
								if ( (LA130_41==155||LA130_41==162) ) {
									alt130=1;
								}
								else if ( (LA130_41==EOF||LA130_41==K_ALLOW||(LA130_41 >= K_AND && LA130_41 <= K_APPLY)||LA130_41==K_DELETE||LA130_41==K_IF||LA130_41==K_INSERT||LA130_41==K_LIMIT||LA130_41==K_ORDER||LA130_41==K_REPEAT||LA130_41==K_THROUGH||LA130_41==K_TO||LA130_41==K_UPDATE||LA130_41==K_WHERE||(LA130_41 >= 156 && LA130_41 <= 158)||LA130_41==161||LA130_41==163||LA130_41==171||LA130_41==173) ) {
									alt130=3;
								}

								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 130, 41, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

								}
								break;
							case K_UUID:
								{
								int LA130_42 = input.LA(6);
								if ( (LA130_42==155||LA130_42==162) ) {
									alt130=1;
								}
								else if ( (LA130_42==EOF||LA130_42==K_ALLOW||(LA130_42 >= K_AND && LA130_42 <= K_APPLY)||LA130_42==K_DELETE||LA130_42==K_IF||LA130_42==K_INSERT||LA130_42==K_LIMIT||LA130_42==K_ORDER||LA130_42==K_REPEAT||LA130_42==K_THROUGH||LA130_42==K_TO||LA130_42==K_UPDATE||LA130_42==K_WHERE||(LA130_42 >= 156 && LA130_42 <= 158)||LA130_42==161||LA130_42==163||LA130_42==171||LA130_42==173) ) {
									alt130=3;
								}

								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 130, 42, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

								}
								break;
							case K_VARCHAR:
								{
								int LA130_43 = input.LA(6);
								if ( (LA130_43==155||LA130_43==162) ) {
									alt130=1;
								}
								else if ( (LA130_43==EOF||LA130_43==K_ALLOW||(LA130_43 >= K_AND && LA130_43 <= K_APPLY)||LA130_43==K_DELETE||LA130_43==K_IF||LA130_43==K_INSERT||LA130_43==K_LIMIT||LA130_43==K_ORDER||LA130_43==K_REPEAT||LA130_43==K_THROUGH||LA130_43==K_TO||LA130_43==K_UPDATE||LA130_43==K_WHERE||(LA130_43 >= 156 && LA130_43 <= 158)||LA130_43==161||LA130_43==163||LA130_43==171||LA130_43==173) ) {
									alt130=3;
								}

								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 130, 43, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

								}
								break;
							case K_VARINT:
								{
								int LA130_44 = input.LA(6);
								if ( (LA130_44==155||LA130_44==162) ) {
									alt130=1;
								}
								else if ( (LA130_44==EOF||LA130_44==K_ALLOW||(LA130_44 >= K_AND && LA130_44 <= K_APPLY)||LA130_44==K_DELETE||LA130_44==K_IF||LA130_44==K_INSERT||LA130_44==K_LIMIT||LA130_44==K_ORDER||LA130_44==K_REPEAT||LA130_44==K_THROUGH||LA130_44==K_TO||LA130_44==K_UPDATE||LA130_44==K_WHERE||(LA130_44 >= 156 && LA130_44 <= 158)||LA130_44==161||LA130_44==163||LA130_44==171||LA130_44==173) ) {
									alt130=3;
								}

								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 130, 44, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

								}
								break;
							case K_TIMEUUID:
								{
								int LA130_45 = input.LA(6);
								if ( (LA130_45==155||LA130_45==162) ) {
									alt130=1;
								}
								else if ( (LA130_45==EOF||LA130_45==K_ALLOW||(LA130_45 >= K_AND && LA130_45 <= K_APPLY)||LA130_45==K_DELETE||LA130_45==K_IF||LA130_45==K_INSERT||LA130_45==K_LIMIT||LA130_45==K_ORDER||LA130_45==K_REPEAT||LA130_45==K_THROUGH||LA130_45==K_TO||LA130_45==K_UPDATE||LA130_45==K_WHERE||(LA130_45 >= 156 && LA130_45 <= 158)||LA130_45==161||LA130_45==163||LA130_45==171||LA130_45==173) ) {
									alt130=3;
								}

								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 130, 45, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

								}
								break;
							case K_COUNT:
							case K_KEY:
							case K_TTL:
							case K_WRITETIME:
							case QUOTED_NAME:
								{
								alt130=3;
								}
								break;
							default:
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 130, 27, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}
							}
							break;
						case BOOLEAN:
						case FLOAT:
						case HEXNUMBER:
						case IDENT:
						case INTEGER:
						case K_ALL:
						case K_AS:
						case K_ASCII:
						case K_BIGINT:
						case K_BLOB:
						case K_BOOLEAN:
						case K_CLUSTERING:
						case K_COMPACT:
						case K_CONTAINS:
						case K_COUNTER:
						case K_CUSTOM:
						case K_DECIMAL:
						case K_DETERMINISTIC:
						case K_DISTINCT:
						case K_DOUBLE:
						case K_EXISTS:
						case K_FILTERING:
						case K_FLOAT:
						case K_FUNCTION:
						case K_INET:
						case K_INFINITY:
						case K_INT:
						case K_KEYS:
						case K_KEYSPACES:
						case K_LANGUAGE:
						case K_LIST:
						case K_MAP:
						case K_NAN:
						case K_NON:
						case K_NOSUPERUSER:
						case K_NULL:
						case K_PASSWORD:
						case K_PERMISSION:
						case K_PERMISSIONS:
						case K_RETURNS:
						case K_STATIC:
						case K_STORAGE:
						case K_SUPERUSER:
						case K_TEXT:
						case K_TIMESTAMP:
						case K_TIMEUUID:
						case K_TOKEN:
						case K_TRIGGER:
						case K_TYPE:
						case K_USER:
						case K_USERS:
						case K_UUID:
						case K_VALUES:
						case K_VARCHAR:
						case K_VARINT:
						case QMARK:
						case STRING_LITERAL:
						case UUID:
						case 155:
						case 159:
						case 169:
						case 172:
							{
							alt130=3;
							}
							break;
						default:
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 130, 26, input);
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
								new NoViableAltException("", 130, 4, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case BOOLEAN:
				case FLOAT:
				case HEXNUMBER:
				case INTEGER:
				case K_INFINITY:
				case K_NAN:
				case K_NULL:
				case K_TOKEN:
				case QMARK:
				case UUID:
				case 155:
				case 159:
				case 161:
				case 169:
				case 172:
					{
					alt130=1;
					}
					break;
				case IDENT:
					{
					int LA130_5 = input.LA(3);
					if ( (LA130_5==155||LA130_5==162) ) {
						alt130=1;
					}
					else if ( (LA130_5==156||LA130_5==160) ) {
						alt130=3;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 130, 5, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case K_MAP:
					{
					int LA130_6 = input.LA(3);
					if ( (LA130_6==156||LA130_6==160||LA130_6==164) ) {
						alt130=3;
					}
					else if ( (LA130_6==155||LA130_6==162) ) {
						alt130=1;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 130, 6, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case K_ASCII:
					{
					int LA130_7 = input.LA(3);
					if ( (LA130_7==155||LA130_7==162) ) {
						alt130=1;
					}
					else if ( (LA130_7==156||LA130_7==160) ) {
						alt130=3;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 130, 7, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case K_BIGINT:
					{
					int LA130_8 = input.LA(3);
					if ( (LA130_8==155||LA130_8==162) ) {
						alt130=1;
					}
					else if ( (LA130_8==156||LA130_8==160) ) {
						alt130=3;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 130, 8, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case K_BLOB:
					{
					int LA130_9 = input.LA(3);
					if ( (LA130_9==155||LA130_9==162) ) {
						alt130=1;
					}
					else if ( (LA130_9==156||LA130_9==160) ) {
						alt130=3;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 130, 9, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case K_BOOLEAN:
					{
					int LA130_10 = input.LA(3);
					if ( (LA130_10==155||LA130_10==162) ) {
						alt130=1;
					}
					else if ( (LA130_10==156||LA130_10==160) ) {
						alt130=3;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 130, 10, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case K_COUNTER:
					{
					int LA130_11 = input.LA(3);
					if ( (LA130_11==155||LA130_11==162) ) {
						alt130=1;
					}
					else if ( (LA130_11==156||LA130_11==160) ) {
						alt130=3;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 130, 11, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case K_DECIMAL:
					{
					int LA130_12 = input.LA(3);
					if ( (LA130_12==155||LA130_12==162) ) {
						alt130=1;
					}
					else if ( (LA130_12==156||LA130_12==160) ) {
						alt130=3;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 130, 12, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case K_DOUBLE:
					{
					int LA130_13 = input.LA(3);
					if ( (LA130_13==155||LA130_13==162) ) {
						alt130=1;
					}
					else if ( (LA130_13==156||LA130_13==160) ) {
						alt130=3;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 130, 13, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case K_FLOAT:
					{
					int LA130_14 = input.LA(3);
					if ( (LA130_14==155||LA130_14==162) ) {
						alt130=1;
					}
					else if ( (LA130_14==156||LA130_14==160) ) {
						alt130=3;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 130, 14, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case K_INET:
					{
					int LA130_15 = input.LA(3);
					if ( (LA130_15==155||LA130_15==162) ) {
						alt130=1;
					}
					else if ( (LA130_15==156||LA130_15==160) ) {
						alt130=3;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 130, 15, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case K_INT:
					{
					int LA130_16 = input.LA(3);
					if ( (LA130_16==155||LA130_16==162) ) {
						alt130=1;
					}
					else if ( (LA130_16==156||LA130_16==160) ) {
						alt130=3;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 130, 16, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case K_TEXT:
					{
					int LA130_17 = input.LA(3);
					if ( (LA130_17==155||LA130_17==162) ) {
						alt130=1;
					}
					else if ( (LA130_17==156||LA130_17==160) ) {
						alt130=3;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 130, 17, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case K_TIMESTAMP:
					{
					int LA130_18 = input.LA(3);
					if ( (LA130_18==155||LA130_18==162) ) {
						alt130=1;
					}
					else if ( (LA130_18==156||LA130_18==160) ) {
						alt130=3;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 130, 18, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case K_UUID:
					{
					int LA130_19 = input.LA(3);
					if ( (LA130_19==155||LA130_19==162) ) {
						alt130=1;
					}
					else if ( (LA130_19==156||LA130_19==160) ) {
						alt130=3;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 130, 19, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case K_VARCHAR:
					{
					int LA130_20 = input.LA(3);
					if ( (LA130_20==155||LA130_20==162) ) {
						alt130=1;
					}
					else if ( (LA130_20==156||LA130_20==160) ) {
						alt130=3;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 130, 20, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case K_VARINT:
					{
					int LA130_21 = input.LA(3);
					if ( (LA130_21==155||LA130_21==162) ) {
						alt130=1;
					}
					else if ( (LA130_21==156||LA130_21==160) ) {
						alt130=3;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 130, 21, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case K_TIMEUUID:
					{
					int LA130_22 = input.LA(3);
					if ( (LA130_22==155||LA130_22==162) ) {
						alt130=1;
					}
					else if ( (LA130_22==156||LA130_22==160) ) {
						alt130=3;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 130, 22, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case K_LIST:
					{
					int LA130_23 = input.LA(3);
					if ( (LA130_23==156||LA130_23==160||LA130_23==164) ) {
						alt130=3;
					}
					else if ( (LA130_23==155||LA130_23==162) ) {
						alt130=1;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 130, 23, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case K_ALL:
				case K_AS:
				case K_CLUSTERING:
				case K_COMPACT:
				case K_CONTAINS:
				case K_CUSTOM:
				case K_DETERMINISTIC:
				case K_DISTINCT:
				case K_EXISTS:
				case K_FILTERING:
				case K_FUNCTION:
				case K_KEYS:
				case K_KEYSPACES:
				case K_LANGUAGE:
				case K_NON:
				case K_NOSUPERUSER:
				case K_PASSWORD:
				case K_PERMISSION:
				case K_PERMISSIONS:
				case K_RETURNS:
				case K_STATIC:
				case K_STORAGE:
				case K_SUPERUSER:
				case K_TRIGGER:
				case K_TYPE:
				case K_USER:
				case K_USERS:
				case K_VALUES:
					{
					int LA130_24 = input.LA(3);
					if ( (LA130_24==155||LA130_24==162) ) {
						alt130=1;
					}
					else if ( (LA130_24==156||LA130_24==160) ) {
						alt130=3;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 130, 24, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case K_COUNT:
				case K_FROZEN:
				case K_KEY:
				case K_SET:
				case K_TTL:
				case K_TUPLE:
				case K_WRITETIME:
				case QUOTED_NAME:
					{
					alt130=3;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 130, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case IDENT:
			case K_ALL:
			case K_AS:
			case K_ASCII:
			case K_BIGINT:
			case K_BLOB:
			case K_BOOLEAN:
			case K_CLUSTERING:
			case K_COMPACT:
			case K_CONTAINS:
			case K_COUNTER:
			case K_CUSTOM:
			case K_DECIMAL:
			case K_DETERMINISTIC:
			case K_DISTINCT:
			case K_DOUBLE:
			case K_EXISTS:
			case K_FILTERING:
			case K_FLOAT:
			case K_FUNCTION:
			case K_INET:
			case K_INT:
			case K_KEYS:
			case K_KEYSPACES:
			case K_LANGUAGE:
			case K_LIST:
			case K_MAP:
			case K_NON:
			case K_NOSUPERUSER:
			case K_PASSWORD:
			case K_PERMISSION:
			case K_PERMISSIONS:
			case K_RETURNS:
			case K_STATIC:
			case K_STORAGE:
			case K_SUPERUSER:
			case K_TEXT:
			case K_TIMESTAMP:
			case K_TIMEUUID:
			case K_TOKEN:
			case K_TRIGGER:
			case K_TYPE:
			case K_USER:
			case K_USERS:
			case K_UUID:
			case K_VALUES:
			case K_VARCHAR:
			case K_VARINT:
				{
				alt130=2;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 130, 0, input);
				throw nvae;
			}
			switch (alt130) {
				case 1 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1052:7: v= value
					{
					pushFollow(FOLLOW_value_in_term6795);
					v=value();
					state._fsp--;

					 term = v; 
					}
					break;
				case 2 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1053:7: f= functionName args= functionArgs
					{
					pushFollow(FOLLOW_functionName_in_term6832);
					f=functionName();
					state._fsp--;

					pushFollow(FOLLOW_functionArgs_in_term6836);
					args=functionArgs();
					state._fsp--;

					 term = new FunctionCall.Raw(f, args); 
					}
					break;
				case 3 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1054:7: '(' c= comparatorType ')' t= term
					{
					match(input,155,FOLLOW_155_in_term6846); 
					pushFollow(FOLLOW_comparatorType_in_term6850);
					c=comparatorType();
					state._fsp--;

					match(input,156,FOLLOW_156_in_term6852); 
					pushFollow(FOLLOW_term_in_term6856);
					t=term();
					state._fsp--;

					 term = new TypeCast(c, t); 
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
		return term;
	}
	// $ANTLR end "term"



	// $ANTLR start "columnOperation"
	// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1057:1: columnOperation[List<Pair<ColumnIdentifier, Operation.RawUpdate>> operations] : key= cident columnOperationDifferentiator[operations, key] ;
	public final void columnOperation(List<Pair<ColumnIdentifier, Operation.RawUpdate>> operations) throws RecognitionException {
		ColumnIdentifier key =null;

		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1058:5: (key= cident columnOperationDifferentiator[operations, key] )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1058:7: key= cident columnOperationDifferentiator[operations, key]
			{
			pushFollow(FOLLOW_cident_in_columnOperation6879);
			key=cident();
			state._fsp--;

			pushFollow(FOLLOW_columnOperationDifferentiator_in_columnOperation6881);
			columnOperationDifferentiator(operations, key);
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
	// $ANTLR end "columnOperation"



	// $ANTLR start "columnOperationDifferentiator"
	// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1061:1: columnOperationDifferentiator[List<Pair<ColumnIdentifier, Operation.RawUpdate>> operations, ColumnIdentifier key] : ( '=' normalColumnOperation[operations, key] | '[' k= term ']' specializedColumnOperation[operations, key, k] );
	public final void columnOperationDifferentiator(List<Pair<ColumnIdentifier, Operation.RawUpdate>> operations, ColumnIdentifier key) throws RecognitionException {
		Term.Raw k =null;

		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1062:5: ( '=' normalColumnOperation[operations, key] | '[' k= term ']' specializedColumnOperation[operations, key, k] )
			int alt131=2;
			int LA131_0 = input.LA(1);
			if ( (LA131_0==166) ) {
				alt131=1;
			}
			else if ( (LA131_0==169) ) {
				alt131=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 131, 0, input);
				throw nvae;
			}

			switch (alt131) {
				case 1 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1062:7: '=' normalColumnOperation[operations, key]
					{
					match(input,166,FOLLOW_166_in_columnOperationDifferentiator6904); 
					pushFollow(FOLLOW_normalColumnOperation_in_columnOperationDifferentiator6906);
					normalColumnOperation(operations, key);
					state._fsp--;

					}
					break;
				case 2 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1063:7: '[' k= term ']' specializedColumnOperation[operations, key, k]
					{
					match(input,169,FOLLOW_169_in_columnOperationDifferentiator6915); 
					pushFollow(FOLLOW_term_in_columnOperationDifferentiator6919);
					k=term();
					state._fsp--;

					match(input,171,FOLLOW_171_in_columnOperationDifferentiator6921); 
					pushFollow(FOLLOW_specializedColumnOperation_in_columnOperationDifferentiator6923);
					specializedColumnOperation(operations, key, k);
					state._fsp--;

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
	// $ANTLR end "columnOperationDifferentiator"



	// $ANTLR start "normalColumnOperation"
	// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1066:1: normalColumnOperation[List<Pair<ColumnIdentifier, Operation.RawUpdate>> operations, ColumnIdentifier key] : (t= term ( '+' c= cident )? |c= cident sig= ( '+' | '-' ) t= term |c= cident i= INTEGER );
	public final void normalColumnOperation(List<Pair<ColumnIdentifier, Operation.RawUpdate>> operations, ColumnIdentifier key) throws RecognitionException {
		Token sig=null;
		Token i=null;
		Term.Raw t =null;
		ColumnIdentifier c =null;

		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1067:5: (t= term ( '+' c= cident )? |c= cident sig= ( '+' | '-' ) t= term |c= cident i= INTEGER )
			int alt133=3;
			switch ( input.LA(1) ) {
			case BOOLEAN:
			case FLOAT:
			case HEXNUMBER:
			case INTEGER:
			case K_INFINITY:
			case K_NAN:
			case K_NULL:
			case K_TOKEN:
			case QMARK:
			case STRING_LITERAL:
			case UUID:
			case 155:
			case 159:
			case 161:
			case 169:
			case 172:
				{
				alt133=1;
				}
				break;
			case IDENT:
				{
				switch ( input.LA(2) ) {
				case 155:
				case 162:
					{
					alt133=1;
					}
					break;
				case 157:
				case 159:
					{
					alt133=2;
					}
					break;
				case INTEGER:
					{
					alt133=3;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 133, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case K_ALL:
			case K_AS:
			case K_CLUSTERING:
			case K_COMPACT:
			case K_CONTAINS:
			case K_CUSTOM:
			case K_DETERMINISTIC:
			case K_DISTINCT:
			case K_EXISTS:
			case K_FILTERING:
			case K_FUNCTION:
			case K_KEYS:
			case K_KEYSPACES:
			case K_LANGUAGE:
			case K_LIST:
			case K_MAP:
			case K_NON:
			case K_NOSUPERUSER:
			case K_PASSWORD:
			case K_PERMISSION:
			case K_PERMISSIONS:
			case K_RETURNS:
			case K_STATIC:
			case K_STORAGE:
			case K_SUPERUSER:
			case K_TRIGGER:
			case K_TYPE:
			case K_USER:
			case K_USERS:
			case K_VALUES:
				{
				switch ( input.LA(2) ) {
				case 155:
				case 162:
					{
					alt133=1;
					}
					break;
				case 157:
				case 159:
					{
					alt133=2;
					}
					break;
				case INTEGER:
					{
					alt133=3;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 133, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case K_ASCII:
				{
				switch ( input.LA(2) ) {
				case 155:
				case 162:
					{
					alt133=1;
					}
					break;
				case 157:
				case 159:
					{
					alt133=2;
					}
					break;
				case INTEGER:
					{
					alt133=3;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 133, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case K_BIGINT:
				{
				switch ( input.LA(2) ) {
				case 155:
				case 162:
					{
					alt133=1;
					}
					break;
				case 157:
				case 159:
					{
					alt133=2;
					}
					break;
				case INTEGER:
					{
					alt133=3;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 133, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case K_BLOB:
				{
				switch ( input.LA(2) ) {
				case 155:
				case 162:
					{
					alt133=1;
					}
					break;
				case 157:
				case 159:
					{
					alt133=2;
					}
					break;
				case INTEGER:
					{
					alt133=3;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 133, 6, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case K_BOOLEAN:
				{
				switch ( input.LA(2) ) {
				case 155:
				case 162:
					{
					alt133=1;
					}
					break;
				case 157:
				case 159:
					{
					alt133=2;
					}
					break;
				case INTEGER:
					{
					alt133=3;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 133, 7, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case K_COUNTER:
				{
				switch ( input.LA(2) ) {
				case 155:
				case 162:
					{
					alt133=1;
					}
					break;
				case 157:
				case 159:
					{
					alt133=2;
					}
					break;
				case INTEGER:
					{
					alt133=3;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 133, 8, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case K_DECIMAL:
				{
				switch ( input.LA(2) ) {
				case 155:
				case 162:
					{
					alt133=1;
					}
					break;
				case 157:
				case 159:
					{
					alt133=2;
					}
					break;
				case INTEGER:
					{
					alt133=3;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 133, 9, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case K_DOUBLE:
				{
				switch ( input.LA(2) ) {
				case 155:
				case 162:
					{
					alt133=1;
					}
					break;
				case 157:
				case 159:
					{
					alt133=2;
					}
					break;
				case INTEGER:
					{
					alt133=3;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 133, 10, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case K_FLOAT:
				{
				switch ( input.LA(2) ) {
				case 155:
				case 162:
					{
					alt133=1;
					}
					break;
				case 157:
				case 159:
					{
					alt133=2;
					}
					break;
				case INTEGER:
					{
					alt133=3;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 133, 11, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case K_INET:
				{
				switch ( input.LA(2) ) {
				case 155:
				case 162:
					{
					alt133=1;
					}
					break;
				case 157:
				case 159:
					{
					alt133=2;
					}
					break;
				case INTEGER:
					{
					alt133=3;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 133, 12, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case K_INT:
				{
				switch ( input.LA(2) ) {
				case 155:
				case 162:
					{
					alt133=1;
					}
					break;
				case 157:
				case 159:
					{
					alt133=2;
					}
					break;
				case INTEGER:
					{
					alt133=3;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 133, 13, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case K_TEXT:
				{
				switch ( input.LA(2) ) {
				case 155:
				case 162:
					{
					alt133=1;
					}
					break;
				case 157:
				case 159:
					{
					alt133=2;
					}
					break;
				case INTEGER:
					{
					alt133=3;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 133, 14, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case K_TIMESTAMP:
				{
				switch ( input.LA(2) ) {
				case 155:
				case 162:
					{
					alt133=1;
					}
					break;
				case 157:
				case 159:
					{
					alt133=2;
					}
					break;
				case INTEGER:
					{
					alt133=3;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 133, 15, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case K_UUID:
				{
				switch ( input.LA(2) ) {
				case 155:
				case 162:
					{
					alt133=1;
					}
					break;
				case 157:
				case 159:
					{
					alt133=2;
					}
					break;
				case INTEGER:
					{
					alt133=3;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 133, 16, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case K_VARCHAR:
				{
				switch ( input.LA(2) ) {
				case 155:
				case 162:
					{
					alt133=1;
					}
					break;
				case 157:
				case 159:
					{
					alt133=2;
					}
					break;
				case INTEGER:
					{
					alt133=3;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 133, 17, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case K_VARINT:
				{
				switch ( input.LA(2) ) {
				case 155:
				case 162:
					{
					alt133=1;
					}
					break;
				case 157:
				case 159:
					{
					alt133=2;
					}
					break;
				case INTEGER:
					{
					alt133=3;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 133, 18, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case K_TIMEUUID:
				{
				switch ( input.LA(2) ) {
				case 155:
				case 162:
					{
					alt133=1;
					}
					break;
				case 157:
				case 159:
					{
					alt133=2;
					}
					break;
				case INTEGER:
					{
					alt133=3;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 133, 19, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case QUOTED_NAME:
				{
				int LA133_20 = input.LA(2);
				if ( (LA133_20==157||LA133_20==159) ) {
					alt133=2;
				}
				else if ( (LA133_20==INTEGER) ) {
					alt133=3;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 133, 20, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case K_COUNT:
			case K_KEY:
			case K_TTL:
			case K_WRITETIME:
				{
				int LA133_21 = input.LA(2);
				if ( (LA133_21==157||LA133_21==159) ) {
					alt133=2;
				}
				else if ( (LA133_21==INTEGER) ) {
					alt133=3;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 133, 21, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 133, 0, input);
				throw nvae;
			}
			switch (alt133) {
				case 1 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1067:7: t= term ( '+' c= cident )?
					{
					pushFollow(FOLLOW_term_in_normalColumnOperation6948);
					t=term();
					state._fsp--;

					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1067:14: ( '+' c= cident )?
					int alt132=2;
					int LA132_0 = input.LA(1);
					if ( (LA132_0==157) ) {
						alt132=1;
					}
					switch (alt132) {
						case 1 :
							// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1067:15: '+' c= cident
							{
							match(input,157,FOLLOW_157_in_normalColumnOperation6951); 
							pushFollow(FOLLOW_cident_in_normalColumnOperation6955);
							c=cident();
							state._fsp--;

							}
							break;

					}


					          if (c == null)
					          {
					              addRawUpdate(operations, key, new Operation.SetValue(t));
					          }
					          else
					          {
					              if (!key.equals(c))
					                  addRecognitionError("Only expressions of the form X = <value> + X are supported.");
					              addRawUpdate(operations, key, new Operation.Prepend(t));
					          }
					      
					}
					break;
				case 2 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1080:7: c= cident sig= ( '+' | '-' ) t= term
					{
					pushFollow(FOLLOW_cident_in_normalColumnOperation6976);
					c=cident();
					state._fsp--;

					sig=input.LT(1);
					if ( input.LA(1)==157||input.LA(1)==159 ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_term_in_normalColumnOperation6990);
					t=term();
					state._fsp--;


					          if (!key.equals(c))
					              addRecognitionError("Only expressions of the form X = X " + (sig!=null?sig.getText():null) + "<value> are supported.");
					          addRawUpdate(operations, key, (sig!=null?sig.getText():null).equals("+") ? new Operation.Addition(t) : new Operation.Substraction(t));
					      
					}
					break;
				case 3 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1086:7: c= cident i= INTEGER
					{
					pushFollow(FOLLOW_cident_in_normalColumnOperation7008);
					c=cident();
					state._fsp--;

					i=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_normalColumnOperation7012); 

					          // Note that this production *is* necessary because X = X - 3 will in fact be lexed as [ X, '=', X, INTEGER].
					          if (!key.equals(c))
					              // We don't yet allow a '+' in front of an integer, but we could in the future really, so let's be future-proof in our error message
					              addRecognitionError("Only expressions of the form X = X " + ((i!=null?i.getText():null).charAt(0) == '-' ? '-' : '+') + " <value> are supported.");
					          addRawUpdate(operations, key, new Operation.Addition(Constants.Literal.integer((i!=null?i.getText():null))));
					      
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
	// $ANTLR end "normalColumnOperation"



	// $ANTLR start "specializedColumnOperation"
	// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1096:1: specializedColumnOperation[List<Pair<ColumnIdentifier, Operation.RawUpdate>> operations, ColumnIdentifier key, Term.Raw k] : '=' t= term ;
	public final void specializedColumnOperation(List<Pair<ColumnIdentifier, Operation.RawUpdate>> operations, ColumnIdentifier key, Term.Raw k) throws RecognitionException {
		Term.Raw t =null;

		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1097:5: ( '=' t= term )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1097:7: '=' t= term
			{
			match(input,166,FOLLOW_166_in_specializedColumnOperation7044); 
			pushFollow(FOLLOW_term_in_specializedColumnOperation7048);
			t=term();
			state._fsp--;


			          addRawUpdate(operations, key, new Operation.SetElement(k, t));
			      
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
	// $ANTLR end "specializedColumnOperation"



	// $ANTLR start "columnCondition"
	// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1103:1: columnCondition[List<Pair<ColumnIdentifier, ColumnCondition.Raw>> conditions] : key= cident (op= relationType t= term | K_IN (values= singleColumnInValues |marker= inMarker ) | '[' element= term ']' (op= relationType t= term | K_IN (values= singleColumnInValues |marker= inMarker ) ) ) ;
	public final void columnCondition(List<Pair<ColumnIdentifier, ColumnCondition.Raw>> conditions) throws RecognitionException {
		ColumnIdentifier key =null;
		Relation.Type op =null;
		Term.Raw t =null;
		List<Term.Raw> values =null;
		AbstractMarker.INRaw marker =null;
		Term.Raw element =null;

		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1105:5: (key= cident (op= relationType t= term | K_IN (values= singleColumnInValues |marker= inMarker ) | '[' element= term ']' (op= relationType t= term | K_IN (values= singleColumnInValues |marker= inMarker ) ) ) )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1105:7: key= cident (op= relationType t= term | K_IN (values= singleColumnInValues |marker= inMarker ) | '[' element= term ']' (op= relationType t= term | K_IN (values= singleColumnInValues |marker= inMarker ) ) )
			{
			pushFollow(FOLLOW_cident_in_columnCondition7081);
			key=cident();
			state._fsp--;

			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1106:9: (op= relationType t= term | K_IN (values= singleColumnInValues |marker= inMarker ) | '[' element= term ']' (op= relationType t= term | K_IN (values= singleColumnInValues |marker= inMarker ) ) )
			int alt137=3;
			switch ( input.LA(1) ) {
			case 154:
			case 164:
			case 165:
			case 166:
			case 167:
			case 168:
				{
				alt137=1;
				}
				break;
			case K_IN:
				{
				alt137=2;
				}
				break;
			case 169:
				{
				alt137=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 137, 0, input);
				throw nvae;
			}
			switch (alt137) {
				case 1 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1106:11: op= relationType t= term
					{
					pushFollow(FOLLOW_relationType_in_columnCondition7095);
					op=relationType();
					state._fsp--;

					pushFollow(FOLLOW_term_in_columnCondition7099);
					t=term();
					state._fsp--;

					 conditions.add(Pair.create(key, ColumnCondition.Raw.simpleCondition(t, op))); 
					}
					break;
				case 2 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1107:11: K_IN (values= singleColumnInValues |marker= inMarker )
					{
					match(input,K_IN,FOLLOW_K_IN_in_columnCondition7113); 
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1108:13: (values= singleColumnInValues |marker= inMarker )
					int alt134=2;
					int LA134_0 = input.LA(1);
					if ( (LA134_0==155) ) {
						alt134=1;
					}
					else if ( (LA134_0==QMARK||LA134_0==161) ) {
						alt134=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 134, 0, input);
						throw nvae;
					}

					switch (alt134) {
						case 1 :
							// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1108:15: values= singleColumnInValues
							{
							pushFollow(FOLLOW_singleColumnInValues_in_columnCondition7131);
							values=singleColumnInValues();
							state._fsp--;

							 conditions.add(Pair.create(key, ColumnCondition.Raw.simpleInCondition(values))); 
							}
							break;
						case 2 :
							// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1109:15: marker= inMarker
							{
							pushFollow(FOLLOW_inMarker_in_columnCondition7151);
							marker=inMarker();
							state._fsp--;

							 conditions.add(Pair.create(key, ColumnCondition.Raw.simpleInCondition(marker))); 
							}
							break;

					}

					}
					break;
				case 3 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1111:11: '[' element= term ']' (op= relationType t= term | K_IN (values= singleColumnInValues |marker= inMarker ) )
					{
					match(input,169,FOLLOW_169_in_columnCondition7179); 
					pushFollow(FOLLOW_term_in_columnCondition7183);
					element=term();
					state._fsp--;

					match(input,171,FOLLOW_171_in_columnCondition7185); 
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1112:13: (op= relationType t= term | K_IN (values= singleColumnInValues |marker= inMarker ) )
					int alt136=2;
					int LA136_0 = input.LA(1);
					if ( (LA136_0==154||(LA136_0 >= 164 && LA136_0 <= 168)) ) {
						alt136=1;
					}
					else if ( (LA136_0==K_IN) ) {
						alt136=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 136, 0, input);
						throw nvae;
					}

					switch (alt136) {
						case 1 :
							// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1112:15: op= relationType t= term
							{
							pushFollow(FOLLOW_relationType_in_columnCondition7203);
							op=relationType();
							state._fsp--;

							pushFollow(FOLLOW_term_in_columnCondition7207);
							t=term();
							state._fsp--;

							 conditions.add(Pair.create(key, ColumnCondition.Raw.collectionCondition(t, element, op))); 
							}
							break;
						case 2 :
							// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1113:15: K_IN (values= singleColumnInValues |marker= inMarker )
							{
							match(input,K_IN,FOLLOW_K_IN_in_columnCondition7225); 
							// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1114:17: (values= singleColumnInValues |marker= inMarker )
							int alt135=2;
							int LA135_0 = input.LA(1);
							if ( (LA135_0==155) ) {
								alt135=1;
							}
							else if ( (LA135_0==QMARK||LA135_0==161) ) {
								alt135=2;
							}

							else {
								NoViableAltException nvae =
									new NoViableAltException("", 135, 0, input);
								throw nvae;
							}

							switch (alt135) {
								case 1 :
									// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1114:19: values= singleColumnInValues
									{
									pushFollow(FOLLOW_singleColumnInValues_in_columnCondition7247);
									values=singleColumnInValues();
									state._fsp--;

									 conditions.add(Pair.create(key, ColumnCondition.Raw.collectionInCondition(element, values))); 
									}
									break;
								case 2 :
									// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1115:19: marker= inMarker
									{
									pushFollow(FOLLOW_inMarker_in_columnCondition7271);
									marker=inMarker();
									state._fsp--;

									 conditions.add(Pair.create(key, ColumnCondition.Raw.collectionInCondition(element, marker))); 
									}
									break;

							}

							}
							break;

					}

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
	// $ANTLR end "columnCondition"



	// $ANTLR start "properties"
	// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1121:1: properties[PropertyDefinitions props] : property[props] ( K_AND property[props] )* ;
	public final void properties(PropertyDefinitions props) throws RecognitionException {
		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1122:5: ( property[props] ( K_AND property[props] )* )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1122:7: property[props] ( K_AND property[props] )*
			{
			pushFollow(FOLLOW_property_in_properties7333);
			property(props);
			state._fsp--;

			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1122:23: ( K_AND property[props] )*
			loop138:
			while (true) {
				int alt138=2;
				int LA138_0 = input.LA(1);
				if ( (LA138_0==K_AND) ) {
					alt138=1;
				}

				switch (alt138) {
				case 1 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1122:24: K_AND property[props]
					{
					match(input,K_AND,FOLLOW_K_AND_in_properties7337); 
					pushFollow(FOLLOW_property_in_properties7339);
					property(props);
					state._fsp--;

					}
					break;

				default :
					break loop138;
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
	// $ANTLR end "properties"



	// $ANTLR start "property"
	// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1125:1: property[PropertyDefinitions props] : k= cident '=' (simple= propertyValue |map= mapLiteral ) ;
	public final void property(PropertyDefinitions props) throws RecognitionException {
		ColumnIdentifier k =null;
		String simple =null;
		Maps.Literal map =null;

		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1126:5: (k= cident '=' (simple= propertyValue |map= mapLiteral ) )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1126:7: k= cident '=' (simple= propertyValue |map= mapLiteral )
			{
			pushFollow(FOLLOW_cident_in_property7362);
			k=cident();
			state._fsp--;

			match(input,166,FOLLOW_166_in_property7364); 
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1126:20: (simple= propertyValue |map= mapLiteral )
			int alt139=2;
			int LA139_0 = input.LA(1);
			if ( (LA139_0==BOOLEAN||LA139_0==FLOAT||LA139_0==HEXNUMBER||LA139_0==INTEGER||LA139_0==K_ALL||LA139_0==K_AS||LA139_0==K_ASCII||(LA139_0 >= K_BIGINT && LA139_0 <= K_BOOLEAN)||LA139_0==K_CLUSTERING||LA139_0==K_COMPACT||(LA139_0 >= K_CONTAINS && LA139_0 <= K_COUNTER)||(LA139_0 >= K_CUSTOM && LA139_0 <= K_DECIMAL)||(LA139_0 >= K_DETERMINISTIC && LA139_0 <= K_DOUBLE)||(LA139_0 >= K_EXISTS && LA139_0 <= K_FLOAT)||LA139_0==K_FUNCTION||(LA139_0 >= K_INET && LA139_0 <= K_INFINITY)||LA139_0==K_INT||(LA139_0 >= K_KEY && LA139_0 <= K_KEYS)||(LA139_0 >= K_KEYSPACES && LA139_0 <= K_LANGUAGE)||(LA139_0 >= K_LIST && LA139_0 <= K_MAP)||(LA139_0 >= K_NAN && LA139_0 <= K_NON)||LA139_0==K_NOSUPERUSER||(LA139_0 >= K_PASSWORD && LA139_0 <= K_PERMISSIONS)||LA139_0==K_RETURNS||(LA139_0 >= K_STATIC && LA139_0 <= K_TEXT)||(LA139_0 >= K_TIMESTAMP && LA139_0 <= K_TIMEUUID)||LA139_0==K_TRIGGER||LA139_0==K_TTL||LA139_0==K_TYPE||(LA139_0 >= K_USER && LA139_0 <= K_USERS)||(LA139_0 >= K_UUID && LA139_0 <= K_VARINT)||LA139_0==K_WRITETIME||LA139_0==STRING_LITERAL||LA139_0==UUID||LA139_0==159) ) {
				alt139=1;
			}
			else if ( (LA139_0==172) ) {
				alt139=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 139, 0, input);
				throw nvae;
			}

			switch (alt139) {
				case 1 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1126:21: simple= propertyValue
					{
					pushFollow(FOLLOW_propertyValue_in_property7369);
					simple=propertyValue();
					state._fsp--;

					 try { props.addProperty(k.toString(), simple); } catch (SyntaxException e) { addRecognitionError(e.getMessage()); } 
					}
					break;
				case 2 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1127:24: map= mapLiteral
					{
					pushFollow(FOLLOW_mapLiteral_in_property7398);
					map=mapLiteral();
					state._fsp--;

					 try { props.addProperty(k.toString(), convertPropertyMap(map)); } catch (SyntaxException e) { addRecognitionError(e.getMessage()); } 
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
	// $ANTLR end "property"



	// $ANTLR start "propertyValue"
	// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1130:1: propertyValue returns [String str] : (c= constant |u= unreserved_keyword );
	public final String propertyValue() throws RecognitionException {
		String str = null;


		Constants.Literal c =null;
		String u =null;

		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1131:5: (c= constant |u= unreserved_keyword )
			int alt140=2;
			int LA140_0 = input.LA(1);
			if ( (LA140_0==BOOLEAN||LA140_0==FLOAT||LA140_0==HEXNUMBER||LA140_0==INTEGER||LA140_0==K_INFINITY||LA140_0==K_NAN||LA140_0==STRING_LITERAL||LA140_0==UUID||LA140_0==159) ) {
				alt140=1;
			}
			else if ( (LA140_0==K_ALL||LA140_0==K_AS||LA140_0==K_ASCII||(LA140_0 >= K_BIGINT && LA140_0 <= K_BOOLEAN)||LA140_0==K_CLUSTERING||LA140_0==K_COMPACT||(LA140_0 >= K_CONTAINS && LA140_0 <= K_COUNTER)||(LA140_0 >= K_CUSTOM && LA140_0 <= K_DECIMAL)||(LA140_0 >= K_DETERMINISTIC && LA140_0 <= K_DOUBLE)||(LA140_0 >= K_EXISTS && LA140_0 <= K_FLOAT)||LA140_0==K_FUNCTION||LA140_0==K_INET||LA140_0==K_INT||(LA140_0 >= K_KEY && LA140_0 <= K_KEYS)||(LA140_0 >= K_KEYSPACES && LA140_0 <= K_LANGUAGE)||(LA140_0 >= K_LIST && LA140_0 <= K_MAP)||LA140_0==K_NON||LA140_0==K_NOSUPERUSER||(LA140_0 >= K_PASSWORD && LA140_0 <= K_PERMISSIONS)||LA140_0==K_RETURNS||(LA140_0 >= K_STATIC && LA140_0 <= K_TEXT)||(LA140_0 >= K_TIMESTAMP && LA140_0 <= K_TIMEUUID)||LA140_0==K_TRIGGER||LA140_0==K_TTL||LA140_0==K_TYPE||(LA140_0 >= K_USER && LA140_0 <= K_USERS)||(LA140_0 >= K_UUID && LA140_0 <= K_VARINT)||LA140_0==K_WRITETIME) ) {
				alt140=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 140, 0, input);
				throw nvae;
			}

			switch (alt140) {
				case 1 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1131:7: c= constant
					{
					pushFollow(FOLLOW_constant_in_propertyValue7427);
					c=constant();
					state._fsp--;

					 str = c.getRawText(); 
					}
					break;
				case 2 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1132:7: u= unreserved_keyword
					{
					pushFollow(FOLLOW_unreserved_keyword_in_propertyValue7449);
					u=unreserved_keyword();
					state._fsp--;

					 str = u; 
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
		return str;
	}
	// $ANTLR end "propertyValue"



	// $ANTLR start "relationType"
	// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1135:1: relationType returns [Relation.Type op] : ( '=' | '<' | '<=' | '>' | '>=' | '!=' );
	public final Relation.Type relationType() throws RecognitionException {
		Relation.Type op = null;


		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1136:5: ( '=' | '<' | '<=' | '>' | '>=' | '!=' )
			int alt141=6;
			switch ( input.LA(1) ) {
			case 166:
				{
				alt141=1;
				}
				break;
			case 164:
				{
				alt141=2;
				}
				break;
			case 165:
				{
				alt141=3;
				}
				break;
			case 167:
				{
				alt141=4;
				}
				break;
			case 168:
				{
				alt141=5;
				}
				break;
			case 154:
				{
				alt141=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 141, 0, input);
				throw nvae;
			}
			switch (alt141) {
				case 1 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1136:7: '='
					{
					match(input,166,FOLLOW_166_in_relationType7472); 
					 op = Relation.Type.EQ; 
					}
					break;
				case 2 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1137:7: '<'
					{
					match(input,164,FOLLOW_164_in_relationType7483); 
					 op = Relation.Type.LT; 
					}
					break;
				case 3 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1138:7: '<='
					{
					match(input,165,FOLLOW_165_in_relationType7494); 
					 op = Relation.Type.LTE; 
					}
					break;
				case 4 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1139:7: '>'
					{
					match(input,167,FOLLOW_167_in_relationType7504); 
					 op = Relation.Type.GT; 
					}
					break;
				case 5 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1140:7: '>='
					{
					match(input,168,FOLLOW_168_in_relationType7515); 
					 op = Relation.Type.GTE; 
					}
					break;
				case 6 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1141:7: '!='
					{
					match(input,154,FOLLOW_154_in_relationType7525); 
					 op = Relation.Type.NEQ; 
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
		return op;
	}
	// $ANTLR end "relationType"



	// $ANTLR start "relation"
	// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1144:1: relation[List<Relation> clauses] : (name= cident type= relationType t= term | K_TOKEN l= tupleOfIdentifiers type= relationType t= term |name= cident K_IN marker= inMarker |name= cident K_IN inValues= singleColumnInValues |name= cident K_CONTAINS ( K_KEY )? t= term |ids= tupleOfIdentifiers ( K_IN ( '(' ')' |tupleInMarker= inMarkerForTuple |literals= tupleOfTupleLiterals |markers= tupleOfMarkersForTuples ) |type= relationType literal= tupleLiteral |type= relationType tupleMarker= markerForTuple ) | '(' relation[$clauses] ')' );
	public final void relation(List<Relation> clauses) throws RecognitionException {
		ColumnIdentifier name =null;
		Relation.Type type =null;
		Term.Raw t =null;
		List<ColumnIdentifier> l =null;
		AbstractMarker.INRaw marker =null;
		List<Term.Raw> inValues =null;
		List<ColumnIdentifier> ids =null;
		Tuples.INRaw tupleInMarker =null;
		List<Tuples.Literal> literals =null;
		List<Tuples.Raw> markers =null;
		Tuples.Literal literal =null;
		Tuples.Raw tupleMarker =null;

		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1145:5: (name= cident type= relationType t= term | K_TOKEN l= tupleOfIdentifiers type= relationType t= term |name= cident K_IN marker= inMarker |name= cident K_IN inValues= singleColumnInValues |name= cident K_CONTAINS ( K_KEY )? t= term |ids= tupleOfIdentifiers ( K_IN ( '(' ')' |tupleInMarker= inMarkerForTuple |literals= tupleOfTupleLiterals |markers= tupleOfMarkersForTuples ) |type= relationType literal= tupleLiteral |type= relationType tupleMarker= markerForTuple ) | '(' relation[$clauses] ')' )
			int alt145=7;
			switch ( input.LA(1) ) {
			case IDENT:
				{
				switch ( input.LA(2) ) {
				case 154:
				case 164:
				case 165:
				case 166:
				case 167:
				case 168:
					{
					alt145=1;
					}
					break;
				case K_IN:
					{
					int LA145_24 = input.LA(3);
					if ( (LA145_24==QMARK||LA145_24==161) ) {
						alt145=3;
					}
					else if ( (LA145_24==155) ) {
						alt145=4;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 145, 24, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case K_CONTAINS:
					{
					alt145=5;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 145, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case QUOTED_NAME:
				{
				switch ( input.LA(2) ) {
				case 154:
				case 164:
				case 165:
				case 166:
				case 167:
				case 168:
					{
					alt145=1;
					}
					break;
				case K_IN:
					{
					int LA145_24 = input.LA(3);
					if ( (LA145_24==QMARK||LA145_24==161) ) {
						alt145=3;
					}
					else if ( (LA145_24==155) ) {
						alt145=4;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 145, 24, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case K_CONTAINS:
					{
					alt145=5;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 145, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case K_ALL:
			case K_AS:
			case K_CLUSTERING:
			case K_COMPACT:
			case K_CONTAINS:
			case K_CUSTOM:
			case K_DETERMINISTIC:
			case K_DISTINCT:
			case K_EXISTS:
			case K_FILTERING:
			case K_FUNCTION:
			case K_KEYS:
			case K_KEYSPACES:
			case K_LANGUAGE:
			case K_LIST:
			case K_MAP:
			case K_NON:
			case K_NOSUPERUSER:
			case K_PASSWORD:
			case K_PERMISSION:
			case K_PERMISSIONS:
			case K_RETURNS:
			case K_STATIC:
			case K_STORAGE:
			case K_SUPERUSER:
			case K_TRIGGER:
			case K_TYPE:
			case K_USER:
			case K_USERS:
			case K_VALUES:
				{
				switch ( input.LA(2) ) {
				case 154:
				case 164:
				case 165:
				case 166:
				case 167:
				case 168:
					{
					alt145=1;
					}
					break;
				case K_IN:
					{
					int LA145_24 = input.LA(3);
					if ( (LA145_24==QMARK||LA145_24==161) ) {
						alt145=3;
					}
					else if ( (LA145_24==155) ) {
						alt145=4;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 145, 24, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case K_CONTAINS:
					{
					alt145=5;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 145, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case K_ASCII:
				{
				switch ( input.LA(2) ) {
				case 154:
				case 164:
				case 165:
				case 166:
				case 167:
				case 168:
					{
					alt145=1;
					}
					break;
				case K_IN:
					{
					int LA145_24 = input.LA(3);
					if ( (LA145_24==QMARK||LA145_24==161) ) {
						alt145=3;
					}
					else if ( (LA145_24==155) ) {
						alt145=4;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 145, 24, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case K_CONTAINS:
					{
					alt145=5;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 145, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case K_BIGINT:
				{
				switch ( input.LA(2) ) {
				case 154:
				case 164:
				case 165:
				case 166:
				case 167:
				case 168:
					{
					alt145=1;
					}
					break;
				case K_IN:
					{
					int LA145_24 = input.LA(3);
					if ( (LA145_24==QMARK||LA145_24==161) ) {
						alt145=3;
					}
					else if ( (LA145_24==155) ) {
						alt145=4;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 145, 24, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case K_CONTAINS:
					{
					alt145=5;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 145, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case K_BLOB:
				{
				switch ( input.LA(2) ) {
				case 154:
				case 164:
				case 165:
				case 166:
				case 167:
				case 168:
					{
					alt145=1;
					}
					break;
				case K_IN:
					{
					int LA145_24 = input.LA(3);
					if ( (LA145_24==QMARK||LA145_24==161) ) {
						alt145=3;
					}
					else if ( (LA145_24==155) ) {
						alt145=4;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 145, 24, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case K_CONTAINS:
					{
					alt145=5;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 145, 6, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case K_BOOLEAN:
				{
				switch ( input.LA(2) ) {
				case 154:
				case 164:
				case 165:
				case 166:
				case 167:
				case 168:
					{
					alt145=1;
					}
					break;
				case K_IN:
					{
					int LA145_24 = input.LA(3);
					if ( (LA145_24==QMARK||LA145_24==161) ) {
						alt145=3;
					}
					else if ( (LA145_24==155) ) {
						alt145=4;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 145, 24, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case K_CONTAINS:
					{
					alt145=5;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 145, 7, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case K_COUNTER:
				{
				switch ( input.LA(2) ) {
				case 154:
				case 164:
				case 165:
				case 166:
				case 167:
				case 168:
					{
					alt145=1;
					}
					break;
				case K_IN:
					{
					int LA145_24 = input.LA(3);
					if ( (LA145_24==QMARK||LA145_24==161) ) {
						alt145=3;
					}
					else if ( (LA145_24==155) ) {
						alt145=4;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 145, 24, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case K_CONTAINS:
					{
					alt145=5;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 145, 8, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case K_DECIMAL:
				{
				switch ( input.LA(2) ) {
				case 154:
				case 164:
				case 165:
				case 166:
				case 167:
				case 168:
					{
					alt145=1;
					}
					break;
				case K_IN:
					{
					int LA145_24 = input.LA(3);
					if ( (LA145_24==QMARK||LA145_24==161) ) {
						alt145=3;
					}
					else if ( (LA145_24==155) ) {
						alt145=4;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 145, 24, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case K_CONTAINS:
					{
					alt145=5;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 145, 9, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case K_DOUBLE:
				{
				switch ( input.LA(2) ) {
				case 154:
				case 164:
				case 165:
				case 166:
				case 167:
				case 168:
					{
					alt145=1;
					}
					break;
				case K_IN:
					{
					int LA145_24 = input.LA(3);
					if ( (LA145_24==QMARK||LA145_24==161) ) {
						alt145=3;
					}
					else if ( (LA145_24==155) ) {
						alt145=4;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 145, 24, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case K_CONTAINS:
					{
					alt145=5;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 145, 10, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case K_FLOAT:
				{
				switch ( input.LA(2) ) {
				case 154:
				case 164:
				case 165:
				case 166:
				case 167:
				case 168:
					{
					alt145=1;
					}
					break;
				case K_IN:
					{
					int LA145_24 = input.LA(3);
					if ( (LA145_24==QMARK||LA145_24==161) ) {
						alt145=3;
					}
					else if ( (LA145_24==155) ) {
						alt145=4;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 145, 24, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case K_CONTAINS:
					{
					alt145=5;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 145, 11, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case K_INET:
				{
				switch ( input.LA(2) ) {
				case 154:
				case 164:
				case 165:
				case 166:
				case 167:
				case 168:
					{
					alt145=1;
					}
					break;
				case K_IN:
					{
					int LA145_24 = input.LA(3);
					if ( (LA145_24==QMARK||LA145_24==161) ) {
						alt145=3;
					}
					else if ( (LA145_24==155) ) {
						alt145=4;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 145, 24, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case K_CONTAINS:
					{
					alt145=5;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 145, 12, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case K_INT:
				{
				switch ( input.LA(2) ) {
				case 154:
				case 164:
				case 165:
				case 166:
				case 167:
				case 168:
					{
					alt145=1;
					}
					break;
				case K_IN:
					{
					int LA145_24 = input.LA(3);
					if ( (LA145_24==QMARK||LA145_24==161) ) {
						alt145=3;
					}
					else if ( (LA145_24==155) ) {
						alt145=4;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 145, 24, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case K_CONTAINS:
					{
					alt145=5;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 145, 13, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case K_TEXT:
				{
				switch ( input.LA(2) ) {
				case 154:
				case 164:
				case 165:
				case 166:
				case 167:
				case 168:
					{
					alt145=1;
					}
					break;
				case K_IN:
					{
					int LA145_24 = input.LA(3);
					if ( (LA145_24==QMARK||LA145_24==161) ) {
						alt145=3;
					}
					else if ( (LA145_24==155) ) {
						alt145=4;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 145, 24, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case K_CONTAINS:
					{
					alt145=5;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 145, 14, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case K_TIMESTAMP:
				{
				switch ( input.LA(2) ) {
				case 154:
				case 164:
				case 165:
				case 166:
				case 167:
				case 168:
					{
					alt145=1;
					}
					break;
				case K_IN:
					{
					int LA145_24 = input.LA(3);
					if ( (LA145_24==QMARK||LA145_24==161) ) {
						alt145=3;
					}
					else if ( (LA145_24==155) ) {
						alt145=4;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 145, 24, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case K_CONTAINS:
					{
					alt145=5;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 145, 15, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case K_UUID:
				{
				switch ( input.LA(2) ) {
				case 154:
				case 164:
				case 165:
				case 166:
				case 167:
				case 168:
					{
					alt145=1;
					}
					break;
				case K_IN:
					{
					int LA145_24 = input.LA(3);
					if ( (LA145_24==QMARK||LA145_24==161) ) {
						alt145=3;
					}
					else if ( (LA145_24==155) ) {
						alt145=4;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 145, 24, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case K_CONTAINS:
					{
					alt145=5;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 145, 16, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case K_VARCHAR:
				{
				switch ( input.LA(2) ) {
				case 154:
				case 164:
				case 165:
				case 166:
				case 167:
				case 168:
					{
					alt145=1;
					}
					break;
				case K_IN:
					{
					int LA145_24 = input.LA(3);
					if ( (LA145_24==QMARK||LA145_24==161) ) {
						alt145=3;
					}
					else if ( (LA145_24==155) ) {
						alt145=4;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 145, 24, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case K_CONTAINS:
					{
					alt145=5;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 145, 17, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case K_VARINT:
				{
				switch ( input.LA(2) ) {
				case 154:
				case 164:
				case 165:
				case 166:
				case 167:
				case 168:
					{
					alt145=1;
					}
					break;
				case K_IN:
					{
					int LA145_24 = input.LA(3);
					if ( (LA145_24==QMARK||LA145_24==161) ) {
						alt145=3;
					}
					else if ( (LA145_24==155) ) {
						alt145=4;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 145, 24, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case K_CONTAINS:
					{
					alt145=5;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 145, 18, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case K_TIMEUUID:
				{
				switch ( input.LA(2) ) {
				case 154:
				case 164:
				case 165:
				case 166:
				case 167:
				case 168:
					{
					alt145=1;
					}
					break;
				case K_IN:
					{
					int LA145_24 = input.LA(3);
					if ( (LA145_24==QMARK||LA145_24==161) ) {
						alt145=3;
					}
					else if ( (LA145_24==155) ) {
						alt145=4;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 145, 24, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case K_CONTAINS:
					{
					alt145=5;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 145, 19, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case K_COUNT:
			case K_KEY:
			case K_TTL:
			case K_WRITETIME:
				{
				switch ( input.LA(2) ) {
				case 154:
				case 164:
				case 165:
				case 166:
				case 167:
				case 168:
					{
					alt145=1;
					}
					break;
				case K_IN:
					{
					int LA145_24 = input.LA(3);
					if ( (LA145_24==QMARK||LA145_24==161) ) {
						alt145=3;
					}
					else if ( (LA145_24==155) ) {
						alt145=4;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 145, 24, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case K_CONTAINS:
					{
					alt145=5;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 145, 20, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case K_TOKEN:
				{
				alt145=2;
				}
				break;
			case 155:
				{
				switch ( input.LA(2) ) {
				case IDENT:
					{
					int LA145_26 = input.LA(3);
					if ( (LA145_26==156||LA145_26==158) ) {
						alt145=6;
					}
					else if ( (LA145_26==K_CONTAINS||LA145_26==K_IN||LA145_26==154||(LA145_26 >= 164 && LA145_26 <= 168)) ) {
						alt145=7;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 145, 26, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case QUOTED_NAME:
					{
					int LA145_27 = input.LA(3);
					if ( (LA145_27==156||LA145_27==158) ) {
						alt145=6;
					}
					else if ( (LA145_27==K_CONTAINS||LA145_27==K_IN||LA145_27==154||(LA145_27 >= 164 && LA145_27 <= 168)) ) {
						alt145=7;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 145, 27, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case K_ALL:
				case K_AS:
				case K_CLUSTERING:
				case K_COMPACT:
				case K_CONTAINS:
				case K_CUSTOM:
				case K_DETERMINISTIC:
				case K_DISTINCT:
				case K_EXISTS:
				case K_FILTERING:
				case K_FUNCTION:
				case K_KEYS:
				case K_KEYSPACES:
				case K_LANGUAGE:
				case K_LIST:
				case K_MAP:
				case K_NON:
				case K_NOSUPERUSER:
				case K_PASSWORD:
				case K_PERMISSION:
				case K_PERMISSIONS:
				case K_RETURNS:
				case K_STATIC:
				case K_STORAGE:
				case K_SUPERUSER:
				case K_TRIGGER:
				case K_TYPE:
				case K_USER:
				case K_USERS:
				case K_VALUES:
					{
					int LA145_28 = input.LA(3);
					if ( (LA145_28==156||LA145_28==158) ) {
						alt145=6;
					}
					else if ( (LA145_28==K_CONTAINS||LA145_28==K_IN||LA145_28==154||(LA145_28 >= 164 && LA145_28 <= 168)) ) {
						alt145=7;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 145, 28, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case K_ASCII:
					{
					int LA145_29 = input.LA(3);
					if ( (LA145_29==156||LA145_29==158) ) {
						alt145=6;
					}
					else if ( (LA145_29==K_CONTAINS||LA145_29==K_IN||LA145_29==154||(LA145_29 >= 164 && LA145_29 <= 168)) ) {
						alt145=7;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 145, 29, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case K_BIGINT:
					{
					int LA145_30 = input.LA(3);
					if ( (LA145_30==156||LA145_30==158) ) {
						alt145=6;
					}
					else if ( (LA145_30==K_CONTAINS||LA145_30==K_IN||LA145_30==154||(LA145_30 >= 164 && LA145_30 <= 168)) ) {
						alt145=7;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 145, 30, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case K_BLOB:
					{
					int LA145_31 = input.LA(3);
					if ( (LA145_31==156||LA145_31==158) ) {
						alt145=6;
					}
					else if ( (LA145_31==K_CONTAINS||LA145_31==K_IN||LA145_31==154||(LA145_31 >= 164 && LA145_31 <= 168)) ) {
						alt145=7;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 145, 31, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case K_BOOLEAN:
					{
					int LA145_32 = input.LA(3);
					if ( (LA145_32==156||LA145_32==158) ) {
						alt145=6;
					}
					else if ( (LA145_32==K_CONTAINS||LA145_32==K_IN||LA145_32==154||(LA145_32 >= 164 && LA145_32 <= 168)) ) {
						alt145=7;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 145, 32, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case K_COUNTER:
					{
					int LA145_33 = input.LA(3);
					if ( (LA145_33==156||LA145_33==158) ) {
						alt145=6;
					}
					else if ( (LA145_33==K_CONTAINS||LA145_33==K_IN||LA145_33==154||(LA145_33 >= 164 && LA145_33 <= 168)) ) {
						alt145=7;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 145, 33, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case K_DECIMAL:
					{
					int LA145_34 = input.LA(3);
					if ( (LA145_34==156||LA145_34==158) ) {
						alt145=6;
					}
					else if ( (LA145_34==K_CONTAINS||LA145_34==K_IN||LA145_34==154||(LA145_34 >= 164 && LA145_34 <= 168)) ) {
						alt145=7;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 145, 34, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case K_DOUBLE:
					{
					int LA145_35 = input.LA(3);
					if ( (LA145_35==156||LA145_35==158) ) {
						alt145=6;
					}
					else if ( (LA145_35==K_CONTAINS||LA145_35==K_IN||LA145_35==154||(LA145_35 >= 164 && LA145_35 <= 168)) ) {
						alt145=7;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 145, 35, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case K_FLOAT:
					{
					int LA145_36 = input.LA(3);
					if ( (LA145_36==156||LA145_36==158) ) {
						alt145=6;
					}
					else if ( (LA145_36==K_CONTAINS||LA145_36==K_IN||LA145_36==154||(LA145_36 >= 164 && LA145_36 <= 168)) ) {
						alt145=7;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 145, 36, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case K_INET:
					{
					int LA145_37 = input.LA(3);
					if ( (LA145_37==156||LA145_37==158) ) {
						alt145=6;
					}
					else if ( (LA145_37==K_CONTAINS||LA145_37==K_IN||LA145_37==154||(LA145_37 >= 164 && LA145_37 <= 168)) ) {
						alt145=7;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 145, 37, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case K_INT:
					{
					int LA145_38 = input.LA(3);
					if ( (LA145_38==156||LA145_38==158) ) {
						alt145=6;
					}
					else if ( (LA145_38==K_CONTAINS||LA145_38==K_IN||LA145_38==154||(LA145_38 >= 164 && LA145_38 <= 168)) ) {
						alt145=7;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 145, 38, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case K_TEXT:
					{
					int LA145_39 = input.LA(3);
					if ( (LA145_39==156||LA145_39==158) ) {
						alt145=6;
					}
					else if ( (LA145_39==K_CONTAINS||LA145_39==K_IN||LA145_39==154||(LA145_39 >= 164 && LA145_39 <= 168)) ) {
						alt145=7;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 145, 39, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case K_TIMESTAMP:
					{
					int LA145_40 = input.LA(3);
					if ( (LA145_40==156||LA145_40==158) ) {
						alt145=6;
					}
					else if ( (LA145_40==K_CONTAINS||LA145_40==K_IN||LA145_40==154||(LA145_40 >= 164 && LA145_40 <= 168)) ) {
						alt145=7;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 145, 40, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case K_UUID:
					{
					int LA145_41 = input.LA(3);
					if ( (LA145_41==156||LA145_41==158) ) {
						alt145=6;
					}
					else if ( (LA145_41==K_CONTAINS||LA145_41==K_IN||LA145_41==154||(LA145_41 >= 164 && LA145_41 <= 168)) ) {
						alt145=7;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 145, 41, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case K_VARCHAR:
					{
					int LA145_42 = input.LA(3);
					if ( (LA145_42==156||LA145_42==158) ) {
						alt145=6;
					}
					else if ( (LA145_42==K_CONTAINS||LA145_42==K_IN||LA145_42==154||(LA145_42 >= 164 && LA145_42 <= 168)) ) {
						alt145=7;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 145, 42, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case K_VARINT:
					{
					int LA145_43 = input.LA(3);
					if ( (LA145_43==156||LA145_43==158) ) {
						alt145=6;
					}
					else if ( (LA145_43==K_CONTAINS||LA145_43==K_IN||LA145_43==154||(LA145_43 >= 164 && LA145_43 <= 168)) ) {
						alt145=7;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 145, 43, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case K_TIMEUUID:
					{
					int LA145_44 = input.LA(3);
					if ( (LA145_44==156||LA145_44==158) ) {
						alt145=6;
					}
					else if ( (LA145_44==K_CONTAINS||LA145_44==K_IN||LA145_44==154||(LA145_44 >= 164 && LA145_44 <= 168)) ) {
						alt145=7;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 145, 44, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case K_COUNT:
				case K_KEY:
				case K_TTL:
				case K_WRITETIME:
					{
					int LA145_45 = input.LA(3);
					if ( (LA145_45==156||LA145_45==158) ) {
						alt145=6;
					}
					else if ( (LA145_45==K_CONTAINS||LA145_45==K_IN||LA145_45==154||(LA145_45 >= 164 && LA145_45 <= 168)) ) {
						alt145=7;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 145, 45, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case K_TOKEN:
				case 155:
					{
					alt145=7;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 145, 22, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 145, 0, input);
				throw nvae;
			}
			switch (alt145) {
				case 1 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1145:7: name= cident type= relationType t= term
					{
					pushFollow(FOLLOW_cident_in_relation7547);
					name=cident();
					state._fsp--;

					pushFollow(FOLLOW_relationType_in_relation7551);
					type=relationType();
					state._fsp--;

					pushFollow(FOLLOW_term_in_relation7555);
					t=term();
					state._fsp--;

					 clauses.add(new SingleColumnRelation(name, type, t)); 
					}
					break;
				case 2 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1146:7: K_TOKEN l= tupleOfIdentifiers type= relationType t= term
					{
					match(input,K_TOKEN,FOLLOW_K_TOKEN_in_relation7565); 
					pushFollow(FOLLOW_tupleOfIdentifiers_in_relation7569);
					l=tupleOfIdentifiers();
					state._fsp--;

					pushFollow(FOLLOW_relationType_in_relation7573);
					type=relationType();
					state._fsp--;

					pushFollow(FOLLOW_term_in_relation7577);
					t=term();
					state._fsp--;


					            for (ColumnIdentifier id : l)
					                clauses.add(new SingleColumnRelation(id, type, t, true));
					        
					}
					break;
				case 3 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1151:7: name= cident K_IN marker= inMarker
					{
					pushFollow(FOLLOW_cident_in_relation7597);
					name=cident();
					state._fsp--;

					match(input,K_IN,FOLLOW_K_IN_in_relation7599); 
					pushFollow(FOLLOW_inMarker_in_relation7603);
					marker=inMarker();
					state._fsp--;

					 clauses.add(new SingleColumnRelation(name, Relation.Type.IN, marker)); 
					}
					break;
				case 4 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1153:7: name= cident K_IN inValues= singleColumnInValues
					{
					pushFollow(FOLLOW_cident_in_relation7623);
					name=cident();
					state._fsp--;

					match(input,K_IN,FOLLOW_K_IN_in_relation7625); 
					pushFollow(FOLLOW_singleColumnInValues_in_relation7629);
					inValues=singleColumnInValues();
					state._fsp--;

					 clauses.add(SingleColumnRelation.createInRelation(name, inValues)); 
					}
					break;
				case 5 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1155:7: name= cident K_CONTAINS ( K_KEY )? t= term
					{
					pushFollow(FOLLOW_cident_in_relation7649);
					name=cident();
					state._fsp--;

					match(input,K_CONTAINS,FOLLOW_K_CONTAINS_in_relation7651); 
					 Relation.Type rt = Relation.Type.CONTAINS; 
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1155:77: ( K_KEY )?
					int alt142=2;
					int LA142_0 = input.LA(1);
					if ( (LA142_0==K_KEY) ) {
						alt142=1;
					}
					switch (alt142) {
						case 1 :
							// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1155:78: K_KEY
							{
							match(input,K_KEY,FOLLOW_K_KEY_in_relation7656); 
							 rt = Relation.Type.CONTAINS_KEY; 
							}
							break;

					}

					pushFollow(FOLLOW_term_in_relation7672);
					t=term();
					state._fsp--;

					 clauses.add(new SingleColumnRelation(name, rt, t)); 
					}
					break;
				case 6 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1157:7: ids= tupleOfIdentifiers ( K_IN ( '(' ')' |tupleInMarker= inMarkerForTuple |literals= tupleOfTupleLiterals |markers= tupleOfMarkersForTuples ) |type= relationType literal= tupleLiteral |type= relationType tupleMarker= markerForTuple )
					{
					pushFollow(FOLLOW_tupleOfIdentifiers_in_relation7684);
					ids=tupleOfIdentifiers();
					state._fsp--;

					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1158:7: ( K_IN ( '(' ')' |tupleInMarker= inMarkerForTuple |literals= tupleOfTupleLiterals |markers= tupleOfMarkersForTuples ) |type= relationType literal= tupleLiteral |type= relationType tupleMarker= markerForTuple )
					int alt144=3;
					switch ( input.LA(1) ) {
					case K_IN:
						{
						alt144=1;
						}
						break;
					case 166:
						{
						int LA144_2 = input.LA(2);
						if ( (LA144_2==155) ) {
							alt144=2;
						}
						else if ( (LA144_2==QMARK||LA144_2==161) ) {
							alt144=3;
						}

						else {
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 144, 2, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case 164:
						{
						int LA144_3 = input.LA(2);
						if ( (LA144_3==155) ) {
							alt144=2;
						}
						else if ( (LA144_3==QMARK||LA144_3==161) ) {
							alt144=3;
						}

						else {
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 144, 3, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case 165:
						{
						int LA144_4 = input.LA(2);
						if ( (LA144_4==155) ) {
							alt144=2;
						}
						else if ( (LA144_4==QMARK||LA144_4==161) ) {
							alt144=3;
						}

						else {
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 144, 4, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case 167:
						{
						int LA144_5 = input.LA(2);
						if ( (LA144_5==155) ) {
							alt144=2;
						}
						else if ( (LA144_5==QMARK||LA144_5==161) ) {
							alt144=3;
						}

						else {
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 144, 5, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case 168:
						{
						int LA144_6 = input.LA(2);
						if ( (LA144_6==155) ) {
							alt144=2;
						}
						else if ( (LA144_6==QMARK||LA144_6==161) ) {
							alt144=3;
						}

						else {
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 144, 6, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case 154:
						{
						int LA144_7 = input.LA(2);
						if ( (LA144_7==155) ) {
							alt144=2;
						}
						else if ( (LA144_7==QMARK||LA144_7==161) ) {
							alt144=3;
						}

						else {
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 144, 7, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 144, 0, input);
						throw nvae;
					}
					switch (alt144) {
						case 1 :
							// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1158:9: K_IN ( '(' ')' |tupleInMarker= inMarkerForTuple |literals= tupleOfTupleLiterals |markers= tupleOfMarkersForTuples )
							{
							match(input,K_IN,FOLLOW_K_IN_in_relation7694); 
							// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1159:11: ( '(' ')' |tupleInMarker= inMarkerForTuple |literals= tupleOfTupleLiterals |markers= tupleOfMarkersForTuples )
							int alt143=4;
							int LA143_0 = input.LA(1);
							if ( (LA143_0==155) ) {
								switch ( input.LA(2) ) {
								case 156:
									{
									alt143=1;
									}
									break;
								case 155:
									{
									alt143=3;
									}
									break;
								case QMARK:
								case 161:
									{
									alt143=4;
									}
									break;
								default:
									int nvaeMark = input.mark();
									try {
										input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 143, 1, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}
							}
							else if ( (LA143_0==QMARK||LA143_0==161) ) {
								alt143=2;
							}

							else {
								NoViableAltException nvae =
									new NoViableAltException("", 143, 0, input);
								throw nvae;
							}

							switch (alt143) {
								case 1 :
									// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1159:13: '(' ')'
									{
									match(input,155,FOLLOW_155_in_relation7708); 
									match(input,156,FOLLOW_156_in_relation7710); 
									 clauses.add(MultiColumnRelation.createInRelation(ids, new ArrayList<Tuples.Literal>())); 
									}
									break;
								case 2 :
									// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1161:13: tupleInMarker= inMarkerForTuple
									{
									pushFollow(FOLLOW_inMarkerForTuple_in_relation7742);
									tupleInMarker=inMarkerForTuple();
									state._fsp--;

									 clauses.add(MultiColumnRelation.createSingleMarkerInRelation(ids, tupleInMarker)); 
									}
									break;
								case 3 :
									// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1163:13: literals= tupleOfTupleLiterals
									{
									pushFollow(FOLLOW_tupleOfTupleLiterals_in_relation7776);
									literals=tupleOfTupleLiterals();
									state._fsp--;


									                  clauses.add(MultiColumnRelation.createInRelation(ids, literals));
									              
									}
									break;
								case 4 :
									// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1167:13: markers= tupleOfMarkersForTuples
									{
									pushFollow(FOLLOW_tupleOfMarkersForTuples_in_relation7810);
									markers=tupleOfMarkersForTuples();
									state._fsp--;

									 clauses.add(MultiColumnRelation.createInRelation(ids, markers)); 
									}
									break;

							}

							}
							break;
						case 2 :
							// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1170:9: type= relationType literal= tupleLiteral
							{
							pushFollow(FOLLOW_relationType_in_relation7852);
							type=relationType();
							state._fsp--;

							pushFollow(FOLLOW_tupleLiteral_in_relation7856);
							literal=tupleLiteral();
							state._fsp--;


							              clauses.add(MultiColumnRelation.createNonInRelation(ids, type, literal));
							          
							}
							break;
						case 3 :
							// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1174:9: type= relationType tupleMarker= markerForTuple
							{
							pushFollow(FOLLOW_relationType_in_relation7882);
							type=relationType();
							state._fsp--;

							pushFollow(FOLLOW_markerForTuple_in_relation7886);
							tupleMarker=markerForTuple();
							state._fsp--;

							 clauses.add(MultiColumnRelation.createNonInRelation(ids, type, tupleMarker)); 
							}
							break;

					}

					}
					break;
				case 7 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1177:7: '(' relation[$clauses] ')'
					{
					match(input,155,FOLLOW_155_in_relation7916); 
					pushFollow(FOLLOW_relation_in_relation7918);
					relation(clauses);
					state._fsp--;

					match(input,156,FOLLOW_156_in_relation7921); 
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
	// $ANTLR end "relation"



	// $ANTLR start "inMarker"
	// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1180:1: inMarker returns [AbstractMarker.INRaw marker] : ( QMARK | ':' name= cident );
	public final AbstractMarker.INRaw inMarker() throws RecognitionException {
		AbstractMarker.INRaw marker = null;


		ColumnIdentifier name =null;

		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1181:5: ( QMARK | ':' name= cident )
			int alt146=2;
			int LA146_0 = input.LA(1);
			if ( (LA146_0==QMARK) ) {
				alt146=1;
			}
			else if ( (LA146_0==161) ) {
				alt146=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 146, 0, input);
				throw nvae;
			}

			switch (alt146) {
				case 1 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1181:7: QMARK
					{
					match(input,QMARK,FOLLOW_QMARK_in_inMarker7942); 
					 marker = newINBindVariables(null); 
					}
					break;
				case 2 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1182:7: ':' name= cident
					{
					match(input,161,FOLLOW_161_in_inMarker7952); 
					pushFollow(FOLLOW_cident_in_inMarker7956);
					name=cident();
					state._fsp--;

					 marker = newINBindVariables(name); 
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
		return marker;
	}
	// $ANTLR end "inMarker"



	// $ANTLR start "tupleOfIdentifiers"
	// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1185:1: tupleOfIdentifiers returns [List<ColumnIdentifier> ids] : '(' n1= cident ( ',' ni= cident )* ')' ;
	public final List<ColumnIdentifier> tupleOfIdentifiers() throws RecognitionException {
		List<ColumnIdentifier> ids = null;


		ColumnIdentifier n1 =null;
		ColumnIdentifier ni =null;

		 ids = new ArrayList<ColumnIdentifier>(); 
		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1187:5: ( '(' n1= cident ( ',' ni= cident )* ')' )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1187:7: '(' n1= cident ( ',' ni= cident )* ')'
			{
			match(input,155,FOLLOW_155_in_tupleOfIdentifiers7988); 
			pushFollow(FOLLOW_cident_in_tupleOfIdentifiers7992);
			n1=cident();
			state._fsp--;

			 ids.add(n1); 
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1187:39: ( ',' ni= cident )*
			loop147:
			while (true) {
				int alt147=2;
				int LA147_0 = input.LA(1);
				if ( (LA147_0==158) ) {
					alt147=1;
				}

				switch (alt147) {
				case 1 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1187:40: ',' ni= cident
					{
					match(input,158,FOLLOW_158_in_tupleOfIdentifiers7997); 
					pushFollow(FOLLOW_cident_in_tupleOfIdentifiers8001);
					ni=cident();
					state._fsp--;

					 ids.add(ni); 
					}
					break;

				default :
					break loop147;
				}
			}

			match(input,156,FOLLOW_156_in_tupleOfIdentifiers8007); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return ids;
	}
	// $ANTLR end "tupleOfIdentifiers"



	// $ANTLR start "singleColumnInValues"
	// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1190:1: singleColumnInValues returns [List<Term.Raw> terms] : '(' (t1= term ( ',' ti= term )* )? ')' ;
	public final List<Term.Raw> singleColumnInValues() throws RecognitionException {
		List<Term.Raw> terms = null;


		Term.Raw t1 =null;
		Term.Raw ti =null;

		 terms = new ArrayList<Term.Raw>(); 
		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1192:5: ( '(' (t1= term ( ',' ti= term )* )? ')' )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1192:7: '(' (t1= term ( ',' ti= term )* )? ')'
			{
			match(input,155,FOLLOW_155_in_singleColumnInValues8037); 
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1192:11: (t1= term ( ',' ti= term )* )?
			int alt149=2;
			int LA149_0 = input.LA(1);
			if ( (LA149_0==BOOLEAN||LA149_0==FLOAT||LA149_0==HEXNUMBER||(LA149_0 >= IDENT && LA149_0 <= INTEGER)||LA149_0==K_ALL||LA149_0==K_AS||LA149_0==K_ASCII||(LA149_0 >= K_BIGINT && LA149_0 <= K_BOOLEAN)||LA149_0==K_CLUSTERING||LA149_0==K_COMPACT||LA149_0==K_CONTAINS||LA149_0==K_COUNTER||(LA149_0 >= K_CUSTOM && LA149_0 <= K_DECIMAL)||(LA149_0 >= K_DETERMINISTIC && LA149_0 <= K_DOUBLE)||(LA149_0 >= K_EXISTS && LA149_0 <= K_FLOAT)||LA149_0==K_FUNCTION||(LA149_0 >= K_INET && LA149_0 <= K_INFINITY)||LA149_0==K_INT||LA149_0==K_KEYS||(LA149_0 >= K_KEYSPACES && LA149_0 <= K_LANGUAGE)||(LA149_0 >= K_LIST && LA149_0 <= K_MAP)||(LA149_0 >= K_NAN && LA149_0 <= K_NON)||LA149_0==K_NOSUPERUSER||LA149_0==K_NULL||(LA149_0 >= K_PASSWORD && LA149_0 <= K_PERMISSIONS)||LA149_0==K_RETURNS||(LA149_0 >= K_STATIC && LA149_0 <= K_TEXT)||(LA149_0 >= K_TIMESTAMP && LA149_0 <= K_TIMEUUID)||LA149_0==K_TOKEN||LA149_0==K_TRIGGER||LA149_0==K_TYPE||(LA149_0 >= K_USER && LA149_0 <= K_USERS)||(LA149_0 >= K_UUID && LA149_0 <= K_VARINT)||LA149_0==QMARK||LA149_0==STRING_LITERAL||LA149_0==UUID||LA149_0==155||LA149_0==159||LA149_0==161||LA149_0==169||LA149_0==172) ) {
				alt149=1;
			}
			switch (alt149) {
				case 1 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1192:13: t1= term ( ',' ti= term )*
					{
					pushFollow(FOLLOW_term_in_singleColumnInValues8045);
					t1=term();
					state._fsp--;

					 terms.add(t1); 
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1192:43: ( ',' ti= term )*
					loop148:
					while (true) {
						int alt148=2;
						int LA148_0 = input.LA(1);
						if ( (LA148_0==158) ) {
							alt148=1;
						}

						switch (alt148) {
						case 1 :
							// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1192:44: ',' ti= term
							{
							match(input,158,FOLLOW_158_in_singleColumnInValues8050); 
							pushFollow(FOLLOW_term_in_singleColumnInValues8054);
							ti=term();
							state._fsp--;

							 terms.add(ti); 
							}
							break;

						default :
							break loop148;
						}
					}

					}
					break;

			}

			match(input,156,FOLLOW_156_in_singleColumnInValues8063); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return terms;
	}
	// $ANTLR end "singleColumnInValues"



	// $ANTLR start "tupleOfTupleLiterals"
	// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1195:1: tupleOfTupleLiterals returns [List<Tuples.Literal> literals] : '(' t1= tupleLiteral ( ',' ti= tupleLiteral )* ')' ;
	public final List<Tuples.Literal> tupleOfTupleLiterals() throws RecognitionException {
		List<Tuples.Literal> literals = null;


		Tuples.Literal t1 =null;
		Tuples.Literal ti =null;

		 literals = new ArrayList<>(); 
		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1197:5: ( '(' t1= tupleLiteral ( ',' ti= tupleLiteral )* ')' )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1197:7: '(' t1= tupleLiteral ( ',' ti= tupleLiteral )* ')'
			{
			match(input,155,FOLLOW_155_in_tupleOfTupleLiterals8093); 
			pushFollow(FOLLOW_tupleLiteral_in_tupleOfTupleLiterals8097);
			t1=tupleLiteral();
			state._fsp--;

			 literals.add(t1); 
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1197:50: ( ',' ti= tupleLiteral )*
			loop150:
			while (true) {
				int alt150=2;
				int LA150_0 = input.LA(1);
				if ( (LA150_0==158) ) {
					alt150=1;
				}

				switch (alt150) {
				case 1 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1197:51: ',' ti= tupleLiteral
					{
					match(input,158,FOLLOW_158_in_tupleOfTupleLiterals8102); 
					pushFollow(FOLLOW_tupleLiteral_in_tupleOfTupleLiterals8106);
					ti=tupleLiteral();
					state._fsp--;

					 literals.add(ti); 
					}
					break;

				default :
					break loop150;
				}
			}

			match(input,156,FOLLOW_156_in_tupleOfTupleLiterals8112); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return literals;
	}
	// $ANTLR end "tupleOfTupleLiterals"



	// $ANTLR start "markerForTuple"
	// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1200:1: markerForTuple returns [Tuples.Raw marker] : ( QMARK | ':' name= cident );
	public final Tuples.Raw markerForTuple() throws RecognitionException {
		Tuples.Raw marker = null;


		ColumnIdentifier name =null;

		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1201:5: ( QMARK | ':' name= cident )
			int alt151=2;
			int LA151_0 = input.LA(1);
			if ( (LA151_0==QMARK) ) {
				alt151=1;
			}
			else if ( (LA151_0==161) ) {
				alt151=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 151, 0, input);
				throw nvae;
			}

			switch (alt151) {
				case 1 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1201:7: QMARK
					{
					match(input,QMARK,FOLLOW_QMARK_in_markerForTuple8133); 
					 marker = newTupleBindVariables(null); 
					}
					break;
				case 2 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1202:7: ':' name= cident
					{
					match(input,161,FOLLOW_161_in_markerForTuple8143); 
					pushFollow(FOLLOW_cident_in_markerForTuple8147);
					name=cident();
					state._fsp--;

					 marker = newTupleBindVariables(name); 
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
		return marker;
	}
	// $ANTLR end "markerForTuple"



	// $ANTLR start "tupleOfMarkersForTuples"
	// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1205:1: tupleOfMarkersForTuples returns [List<Tuples.Raw> markers] : '(' m1= markerForTuple ( ',' mi= markerForTuple )* ')' ;
	public final List<Tuples.Raw> tupleOfMarkersForTuples() throws RecognitionException {
		List<Tuples.Raw> markers = null;


		Tuples.Raw m1 =null;
		Tuples.Raw mi =null;

		 markers = new ArrayList<Tuples.Raw>(); 
		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1207:5: ( '(' m1= markerForTuple ( ',' mi= markerForTuple )* ')' )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1207:7: '(' m1= markerForTuple ( ',' mi= markerForTuple )* ')'
			{
			match(input,155,FOLLOW_155_in_tupleOfMarkersForTuples8179); 
			pushFollow(FOLLOW_markerForTuple_in_tupleOfMarkersForTuples8183);
			m1=markerForTuple();
			state._fsp--;

			 markers.add(m1); 
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1207:51: ( ',' mi= markerForTuple )*
			loop152:
			while (true) {
				int alt152=2;
				int LA152_0 = input.LA(1);
				if ( (LA152_0==158) ) {
					alt152=1;
				}

				switch (alt152) {
				case 1 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1207:52: ',' mi= markerForTuple
					{
					match(input,158,FOLLOW_158_in_tupleOfMarkersForTuples8188); 
					pushFollow(FOLLOW_markerForTuple_in_tupleOfMarkersForTuples8192);
					mi=markerForTuple();
					state._fsp--;

					 markers.add(mi); 
					}
					break;

				default :
					break loop152;
				}
			}

			match(input,156,FOLLOW_156_in_tupleOfMarkersForTuples8198); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return markers;
	}
	// $ANTLR end "tupleOfMarkersForTuples"



	// $ANTLR start "inMarkerForTuple"
	// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1210:1: inMarkerForTuple returns [Tuples.INRaw marker] : ( QMARK | ':' name= cident );
	public final Tuples.INRaw inMarkerForTuple() throws RecognitionException {
		Tuples.INRaw marker = null;


		ColumnIdentifier name =null;

		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1211:5: ( QMARK | ':' name= cident )
			int alt153=2;
			int LA153_0 = input.LA(1);
			if ( (LA153_0==QMARK) ) {
				alt153=1;
			}
			else if ( (LA153_0==161) ) {
				alt153=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 153, 0, input);
				throw nvae;
			}

			switch (alt153) {
				case 1 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1211:7: QMARK
					{
					match(input,QMARK,FOLLOW_QMARK_in_inMarkerForTuple8219); 
					 marker = newTupleINBindVariables(null); 
					}
					break;
				case 2 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1212:7: ':' name= cident
					{
					match(input,161,FOLLOW_161_in_inMarkerForTuple8229); 
					pushFollow(FOLLOW_cident_in_inMarkerForTuple8233);
					name=cident();
					state._fsp--;

					 marker = newTupleINBindVariables(name); 
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
		return marker;
	}
	// $ANTLR end "inMarkerForTuple"



	// $ANTLR start "comparatorType"
	// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1215:1: comparatorType returns [CQL3Type.Raw t] : (n= native_type |c= collection_type |tt= tuple_type |id= userTypeName | K_FROZEN '<' f= comparatorType '>' |s= STRING_LITERAL );
	public final CQL3Type.Raw comparatorType() throws RecognitionException {
		CQL3Type.Raw t = null;


		Token s=null;
		CQL3Type n =null;
		CQL3Type.Raw c =null;
		CQL3Type.Raw tt =null;
		UTName id =null;
		CQL3Type.Raw f =null;

		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1216:5: (n= native_type |c= collection_type |tt= tuple_type |id= userTypeName | K_FROZEN '<' f= comparatorType '>' |s= STRING_LITERAL )
			int alt154=6;
			switch ( input.LA(1) ) {
			case K_ASCII:
				{
				int LA154_1 = input.LA(2);
				if ( (LA154_1==EOF||LA154_1==K_LANGUAGE||LA154_1==K_PRIMARY||LA154_1==K_STATIC||LA154_1==K_USING||LA154_1==156||LA154_1==158||LA154_1==163||LA154_1==167) ) {
					alt154=1;
				}
				else if ( (LA154_1==160) ) {
					alt154=4;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 154, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case K_BIGINT:
				{
				int LA154_2 = input.LA(2);
				if ( (LA154_2==EOF||LA154_2==K_LANGUAGE||LA154_2==K_PRIMARY||LA154_2==K_STATIC||LA154_2==K_USING||LA154_2==156||LA154_2==158||LA154_2==163||LA154_2==167) ) {
					alt154=1;
				}
				else if ( (LA154_2==160) ) {
					alt154=4;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 154, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case K_BLOB:
				{
				int LA154_3 = input.LA(2);
				if ( (LA154_3==EOF||LA154_3==K_LANGUAGE||LA154_3==K_PRIMARY||LA154_3==K_STATIC||LA154_3==K_USING||LA154_3==156||LA154_3==158||LA154_3==163||LA154_3==167) ) {
					alt154=1;
				}
				else if ( (LA154_3==160) ) {
					alt154=4;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 154, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case K_BOOLEAN:
				{
				int LA154_4 = input.LA(2);
				if ( (LA154_4==EOF||LA154_4==K_LANGUAGE||LA154_4==K_PRIMARY||LA154_4==K_STATIC||LA154_4==K_USING||LA154_4==156||LA154_4==158||LA154_4==163||LA154_4==167) ) {
					alt154=1;
				}
				else if ( (LA154_4==160) ) {
					alt154=4;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 154, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case K_COUNTER:
				{
				int LA154_5 = input.LA(2);
				if ( (LA154_5==EOF||LA154_5==K_LANGUAGE||LA154_5==K_PRIMARY||LA154_5==K_STATIC||LA154_5==K_USING||LA154_5==156||LA154_5==158||LA154_5==163||LA154_5==167) ) {
					alt154=1;
				}
				else if ( (LA154_5==160) ) {
					alt154=4;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 154, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case K_DECIMAL:
				{
				int LA154_6 = input.LA(2);
				if ( (LA154_6==EOF||LA154_6==K_LANGUAGE||LA154_6==K_PRIMARY||LA154_6==K_STATIC||LA154_6==K_USING||LA154_6==156||LA154_6==158||LA154_6==163||LA154_6==167) ) {
					alt154=1;
				}
				else if ( (LA154_6==160) ) {
					alt154=4;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 154, 6, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case K_DOUBLE:
				{
				int LA154_7 = input.LA(2);
				if ( (LA154_7==EOF||LA154_7==K_LANGUAGE||LA154_7==K_PRIMARY||LA154_7==K_STATIC||LA154_7==K_USING||LA154_7==156||LA154_7==158||LA154_7==163||LA154_7==167) ) {
					alt154=1;
				}
				else if ( (LA154_7==160) ) {
					alt154=4;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 154, 7, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case K_FLOAT:
				{
				int LA154_8 = input.LA(2);
				if ( (LA154_8==EOF||LA154_8==K_LANGUAGE||LA154_8==K_PRIMARY||LA154_8==K_STATIC||LA154_8==K_USING||LA154_8==156||LA154_8==158||LA154_8==163||LA154_8==167) ) {
					alt154=1;
				}
				else if ( (LA154_8==160) ) {
					alt154=4;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 154, 8, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case K_INET:
				{
				int LA154_9 = input.LA(2);
				if ( (LA154_9==EOF||LA154_9==K_LANGUAGE||LA154_9==K_PRIMARY||LA154_9==K_STATIC||LA154_9==K_USING||LA154_9==156||LA154_9==158||LA154_9==163||LA154_9==167) ) {
					alt154=1;
				}
				else if ( (LA154_9==160) ) {
					alt154=4;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 154, 9, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case K_INT:
				{
				int LA154_10 = input.LA(2);
				if ( (LA154_10==EOF||LA154_10==K_LANGUAGE||LA154_10==K_PRIMARY||LA154_10==K_STATIC||LA154_10==K_USING||LA154_10==156||LA154_10==158||LA154_10==163||LA154_10==167) ) {
					alt154=1;
				}
				else if ( (LA154_10==160) ) {
					alt154=4;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 154, 10, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case K_TEXT:
				{
				int LA154_11 = input.LA(2);
				if ( (LA154_11==EOF||LA154_11==K_LANGUAGE||LA154_11==K_PRIMARY||LA154_11==K_STATIC||LA154_11==K_USING||LA154_11==156||LA154_11==158||LA154_11==163||LA154_11==167) ) {
					alt154=1;
				}
				else if ( (LA154_11==160) ) {
					alt154=4;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 154, 11, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case K_TIMESTAMP:
				{
				int LA154_12 = input.LA(2);
				if ( (LA154_12==EOF||LA154_12==K_LANGUAGE||LA154_12==K_PRIMARY||LA154_12==K_STATIC||LA154_12==K_USING||LA154_12==156||LA154_12==158||LA154_12==163||LA154_12==167) ) {
					alt154=1;
				}
				else if ( (LA154_12==160) ) {
					alt154=4;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 154, 12, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case K_UUID:
				{
				int LA154_13 = input.LA(2);
				if ( (LA154_13==EOF||LA154_13==K_LANGUAGE||LA154_13==K_PRIMARY||LA154_13==K_STATIC||LA154_13==K_USING||LA154_13==156||LA154_13==158||LA154_13==163||LA154_13==167) ) {
					alt154=1;
				}
				else if ( (LA154_13==160) ) {
					alt154=4;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 154, 13, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case K_VARCHAR:
				{
				int LA154_14 = input.LA(2);
				if ( (LA154_14==EOF||LA154_14==K_LANGUAGE||LA154_14==K_PRIMARY||LA154_14==K_STATIC||LA154_14==K_USING||LA154_14==156||LA154_14==158||LA154_14==163||LA154_14==167) ) {
					alt154=1;
				}
				else if ( (LA154_14==160) ) {
					alt154=4;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 154, 14, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case K_VARINT:
				{
				int LA154_15 = input.LA(2);
				if ( (LA154_15==EOF||LA154_15==K_LANGUAGE||LA154_15==K_PRIMARY||LA154_15==K_STATIC||LA154_15==K_USING||LA154_15==156||LA154_15==158||LA154_15==163||LA154_15==167) ) {
					alt154=1;
				}
				else if ( (LA154_15==160) ) {
					alt154=4;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 154, 15, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case K_TIMEUUID:
				{
				int LA154_16 = input.LA(2);
				if ( (LA154_16==EOF||LA154_16==K_LANGUAGE||LA154_16==K_PRIMARY||LA154_16==K_STATIC||LA154_16==K_USING||LA154_16==156||LA154_16==158||LA154_16==163||LA154_16==167) ) {
					alt154=1;
				}
				else if ( (LA154_16==160) ) {
					alt154=4;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 154, 16, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case K_MAP:
				{
				int LA154_17 = input.LA(2);
				if ( (LA154_17==164) ) {
					alt154=2;
				}
				else if ( (LA154_17==EOF||LA154_17==K_LANGUAGE||LA154_17==K_PRIMARY||LA154_17==K_STATIC||LA154_17==K_USING||LA154_17==156||LA154_17==158||LA154_17==160||LA154_17==163||LA154_17==167) ) {
					alt154=4;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 154, 17, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case K_LIST:
				{
				int LA154_18 = input.LA(2);
				if ( (LA154_18==164) ) {
					alt154=2;
				}
				else if ( (LA154_18==EOF||LA154_18==K_LANGUAGE||LA154_18==K_PRIMARY||LA154_18==K_STATIC||LA154_18==K_USING||LA154_18==156||LA154_18==158||LA154_18==160||LA154_18==163||LA154_18==167) ) {
					alt154=4;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 154, 18, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case K_SET:
				{
				alt154=2;
				}
				break;
			case K_TUPLE:
				{
				alt154=3;
				}
				break;
			case IDENT:
			case K_ALL:
			case K_AS:
			case K_CLUSTERING:
			case K_COMPACT:
			case K_CONTAINS:
			case K_COUNT:
			case K_CUSTOM:
			case K_DETERMINISTIC:
			case K_DISTINCT:
			case K_EXISTS:
			case K_FILTERING:
			case K_FUNCTION:
			case K_KEY:
			case K_KEYS:
			case K_KEYSPACES:
			case K_LANGUAGE:
			case K_NON:
			case K_NOSUPERUSER:
			case K_PASSWORD:
			case K_PERMISSION:
			case K_PERMISSIONS:
			case K_RETURNS:
			case K_STATIC:
			case K_STORAGE:
			case K_SUPERUSER:
			case K_TRIGGER:
			case K_TTL:
			case K_TYPE:
			case K_USER:
			case K_USERS:
			case K_VALUES:
			case K_WRITETIME:
			case QUOTED_NAME:
				{
				alt154=4;
				}
				break;
			case K_FROZEN:
				{
				alt154=5;
				}
				break;
			case STRING_LITERAL:
				{
				alt154=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 154, 0, input);
				throw nvae;
			}
			switch (alt154) {
				case 1 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1216:7: n= native_type
					{
					pushFollow(FOLLOW_native_type_in_comparatorType8258);
					n=native_type();
					state._fsp--;

					 t = CQL3Type.Raw.from(n); 
					}
					break;
				case 2 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1217:7: c= collection_type
					{
					pushFollow(FOLLOW_collection_type_in_comparatorType8274);
					c=collection_type();
					state._fsp--;

					 t = c; 
					}
					break;
				case 3 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1218:7: tt= tuple_type
					{
					pushFollow(FOLLOW_tuple_type_in_comparatorType8286);
					tt=tuple_type();
					state._fsp--;

					 t = tt; 
					}
					break;
				case 4 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1219:7: id= userTypeName
					{
					pushFollow(FOLLOW_userTypeName_in_comparatorType8302);
					id=userTypeName();
					state._fsp--;

					 t = CQL3Type.Raw.userType(id); 
					}
					break;
				case 5 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1220:7: K_FROZEN '<' f= comparatorType '>'
					{
					match(input,K_FROZEN,FOLLOW_K_FROZEN_in_comparatorType8314); 
					match(input,164,FOLLOW_164_in_comparatorType8316); 
					pushFollow(FOLLOW_comparatorType_in_comparatorType8320);
					f=comparatorType();
					state._fsp--;

					match(input,167,FOLLOW_167_in_comparatorType8322); 

					        try {
					            t = CQL3Type.Raw.frozen(f);
					        } catch (InvalidRequestException e) {
					            addRecognitionError(e.getMessage());
					        }
					      
					}
					break;
				case 6 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1228:7: s= STRING_LITERAL
					{
					s=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_comparatorType8340); 

					        try {
					            t = CQL3Type.Raw.from(new CQL3Type.Custom((s!=null?s.getText():null)));
					        } catch (SyntaxException e) {
					            addRecognitionError("Cannot parse type " + (s!=null?s.getText():null) + ": " + e.getMessage());
					        } catch (ConfigurationException e) {
					            addRecognitionError("Error setting type " + (s!=null?s.getText():null) + ": " + e.getMessage());
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
		return t;
	}
	// $ANTLR end "comparatorType"



	// $ANTLR start "native_type"
	// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1240:1: native_type returns [CQL3Type t] : ( K_ASCII | K_BIGINT | K_BLOB | K_BOOLEAN | K_COUNTER | K_DECIMAL | K_DOUBLE | K_FLOAT | K_INET | K_INT | K_TEXT | K_TIMESTAMP | K_UUID | K_VARCHAR | K_VARINT | K_TIMEUUID );
	public final CQL3Type native_type() throws RecognitionException {
		CQL3Type t = null;


		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1241:5: ( K_ASCII | K_BIGINT | K_BLOB | K_BOOLEAN | K_COUNTER | K_DECIMAL | K_DOUBLE | K_FLOAT | K_INET | K_INT | K_TEXT | K_TIMESTAMP | K_UUID | K_VARCHAR | K_VARINT | K_TIMEUUID )
			int alt155=16;
			switch ( input.LA(1) ) {
			case K_ASCII:
				{
				alt155=1;
				}
				break;
			case K_BIGINT:
				{
				alt155=2;
				}
				break;
			case K_BLOB:
				{
				alt155=3;
				}
				break;
			case K_BOOLEAN:
				{
				alt155=4;
				}
				break;
			case K_COUNTER:
				{
				alt155=5;
				}
				break;
			case K_DECIMAL:
				{
				alt155=6;
				}
				break;
			case K_DOUBLE:
				{
				alt155=7;
				}
				break;
			case K_FLOAT:
				{
				alt155=8;
				}
				break;
			case K_INET:
				{
				alt155=9;
				}
				break;
			case K_INT:
				{
				alt155=10;
				}
				break;
			case K_TEXT:
				{
				alt155=11;
				}
				break;
			case K_TIMESTAMP:
				{
				alt155=12;
				}
				break;
			case K_UUID:
				{
				alt155=13;
				}
				break;
			case K_VARCHAR:
				{
				alt155=14;
				}
				break;
			case K_VARINT:
				{
				alt155=15;
				}
				break;
			case K_TIMEUUID:
				{
				alt155=16;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 155, 0, input);
				throw nvae;
			}
			switch (alt155) {
				case 1 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1241:7: K_ASCII
					{
					match(input,K_ASCII,FOLLOW_K_ASCII_in_native_type8369); 
					 t = CQL3Type.Native.ASCII; 
					}
					break;
				case 2 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1242:7: K_BIGINT
					{
					match(input,K_BIGINT,FOLLOW_K_BIGINT_in_native_type8383); 
					 t = CQL3Type.Native.BIGINT; 
					}
					break;
				case 3 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1243:7: K_BLOB
					{
					match(input,K_BLOB,FOLLOW_K_BLOB_in_native_type8396); 
					 t = CQL3Type.Native.BLOB; 
					}
					break;
				case 4 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1244:7: K_BOOLEAN
					{
					match(input,K_BOOLEAN,FOLLOW_K_BOOLEAN_in_native_type8411); 
					 t = CQL3Type.Native.BOOLEAN; 
					}
					break;
				case 5 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1245:7: K_COUNTER
					{
					match(input,K_COUNTER,FOLLOW_K_COUNTER_in_native_type8423); 
					 t = CQL3Type.Native.COUNTER; 
					}
					break;
				case 6 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1246:7: K_DECIMAL
					{
					match(input,K_DECIMAL,FOLLOW_K_DECIMAL_in_native_type8435); 
					 t = CQL3Type.Native.DECIMAL; 
					}
					break;
				case 7 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1247:7: K_DOUBLE
					{
					match(input,K_DOUBLE,FOLLOW_K_DOUBLE_in_native_type8447); 
					 t = CQL3Type.Native.DOUBLE; 
					}
					break;
				case 8 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1248:7: K_FLOAT
					{
					match(input,K_FLOAT,FOLLOW_K_FLOAT_in_native_type8460); 
					 t = CQL3Type.Native.FLOAT; 
					}
					break;
				case 9 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1249:7: K_INET
					{
					match(input,K_INET,FOLLOW_K_INET_in_native_type8474); 
					 t = CQL3Type.Native.INET;
					}
					break;
				case 10 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1250:7: K_INT
					{
					match(input,K_INT,FOLLOW_K_INT_in_native_type8489); 
					 t = CQL3Type.Native.INT; 
					}
					break;
				case 11 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1251:7: K_TEXT
					{
					match(input,K_TEXT,FOLLOW_K_TEXT_in_native_type8505); 
					 t = CQL3Type.Native.TEXT; 
					}
					break;
				case 12 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1252:7: K_TIMESTAMP
					{
					match(input,K_TIMESTAMP,FOLLOW_K_TIMESTAMP_in_native_type8520); 
					 t = CQL3Type.Native.TIMESTAMP; 
					}
					break;
				case 13 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1253:7: K_UUID
					{
					match(input,K_UUID,FOLLOW_K_UUID_in_native_type8530); 
					 t = CQL3Type.Native.UUID; 
					}
					break;
				case 14 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1254:7: K_VARCHAR
					{
					match(input,K_VARCHAR,FOLLOW_K_VARCHAR_in_native_type8545); 
					 t = CQL3Type.Native.VARCHAR; 
					}
					break;
				case 15 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1255:7: K_VARINT
					{
					match(input,K_VARINT,FOLLOW_K_VARINT_in_native_type8557); 
					 t = CQL3Type.Native.VARINT; 
					}
					break;
				case 16 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1256:7: K_TIMEUUID
					{
					match(input,K_TIMEUUID,FOLLOW_K_TIMEUUID_in_native_type8570); 
					 t = CQL3Type.Native.TIMEUUID; 
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
		return t;
	}
	// $ANTLR end "native_type"



	// $ANTLR start "collection_type"
	// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1259:1: collection_type returns [CQL3Type.Raw pt] : ( K_MAP '<' t1= comparatorType ',' t2= comparatorType '>' | K_LIST '<' t= comparatorType '>' | K_SET '<' t= comparatorType '>' );
	public final CQL3Type.Raw collection_type() throws RecognitionException {
		CQL3Type.Raw pt = null;


		CQL3Type.Raw t1 =null;
		CQL3Type.Raw t2 =null;
		CQL3Type.Raw t =null;

		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1260:5: ( K_MAP '<' t1= comparatorType ',' t2= comparatorType '>' | K_LIST '<' t= comparatorType '>' | K_SET '<' t= comparatorType '>' )
			int alt156=3;
			switch ( input.LA(1) ) {
			case K_MAP:
				{
				alt156=1;
				}
				break;
			case K_LIST:
				{
				alt156=2;
				}
				break;
			case K_SET:
				{
				alt156=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 156, 0, input);
				throw nvae;
			}
			switch (alt156) {
				case 1 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1260:7: K_MAP '<' t1= comparatorType ',' t2= comparatorType '>'
					{
					match(input,K_MAP,FOLLOW_K_MAP_in_collection_type8594); 
					match(input,164,FOLLOW_164_in_collection_type8597); 
					pushFollow(FOLLOW_comparatorType_in_collection_type8601);
					t1=comparatorType();
					state._fsp--;

					match(input,158,FOLLOW_158_in_collection_type8603); 
					pushFollow(FOLLOW_comparatorType_in_collection_type8607);
					t2=comparatorType();
					state._fsp--;

					match(input,167,FOLLOW_167_in_collection_type8609); 
					 try {
					            // if we can't parse either t1 or t2, antlr will "recover" and we may have t1 or t2 null.
					            if (t1 != null && t2 != null)
					                pt = CQL3Type.Raw.map(t1, t2);
					          } catch (InvalidRequestException e) { addRecognitionError(e.getMessage()); } 
					}
					break;
				case 2 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1266:7: K_LIST '<' t= comparatorType '>'
					{
					match(input,K_LIST,FOLLOW_K_LIST_in_collection_type8627); 
					match(input,164,FOLLOW_164_in_collection_type8629); 
					pushFollow(FOLLOW_comparatorType_in_collection_type8633);
					t=comparatorType();
					state._fsp--;

					match(input,167,FOLLOW_167_in_collection_type8635); 
					 try { if (t != null) pt = CQL3Type.Raw.list(t); } catch (InvalidRequestException e) { addRecognitionError(e.getMessage()); } 
					}
					break;
				case 3 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1268:7: K_SET '<' t= comparatorType '>'
					{
					match(input,K_SET,FOLLOW_K_SET_in_collection_type8653); 
					match(input,164,FOLLOW_164_in_collection_type8656); 
					pushFollow(FOLLOW_comparatorType_in_collection_type8660);
					t=comparatorType();
					state._fsp--;

					match(input,167,FOLLOW_167_in_collection_type8662); 
					 try { if (t != null) pt = CQL3Type.Raw.set(t); } catch (InvalidRequestException e) { addRecognitionError(e.getMessage()); } 
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
		return pt;
	}
	// $ANTLR end "collection_type"



	// $ANTLR start "tuple_type"
	// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1272:1: tuple_type returns [CQL3Type.Raw t] : K_TUPLE '<' t1= comparatorType ( ',' tn= comparatorType )* '>' ;
	public final CQL3Type.Raw tuple_type() throws RecognitionException {
		CQL3Type.Raw t = null;


		CQL3Type.Raw t1 =null;
		CQL3Type.Raw tn =null;

		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1273:5: ( K_TUPLE '<' t1= comparatorType ( ',' tn= comparatorType )* '>' )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1273:7: K_TUPLE '<' t1= comparatorType ( ',' tn= comparatorType )* '>'
			{
			match(input,K_TUPLE,FOLLOW_K_TUPLE_in_tuple_type8693); 
			match(input,164,FOLLOW_164_in_tuple_type8695); 
			 List<CQL3Type.Raw> types = new ArrayList<>(); 
			pushFollow(FOLLOW_comparatorType_in_tuple_type8710);
			t1=comparatorType();
			state._fsp--;

			 types.add(t1); 
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1274:47: ( ',' tn= comparatorType )*
			loop157:
			while (true) {
				int alt157=2;
				int LA157_0 = input.LA(1);
				if ( (LA157_0==158) ) {
					alt157=1;
				}

				switch (alt157) {
				case 1 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1274:48: ',' tn= comparatorType
					{
					match(input,158,FOLLOW_158_in_tuple_type8715); 
					pushFollow(FOLLOW_comparatorType_in_tuple_type8719);
					tn=comparatorType();
					state._fsp--;

					 types.add(tn); 
					}
					break;

				default :
					break loop157;
				}
			}

			match(input,167,FOLLOW_167_in_tuple_type8731); 
			 try { t = CQL3Type.Raw.tuple(types); } catch (InvalidRequestException e) { addRecognitionError(e.getMessage()); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return t;
	}
	// $ANTLR end "tuple_type"


	public static class username_return extends ParserRuleReturnScope {
	};


	// $ANTLR start "username"
	// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1278:1: username : ( IDENT | STRING_LITERAL );
	public final CqlParser.username_return username() throws RecognitionException {
		CqlParser.username_return retval = new CqlParser.username_return();
		retval.start = input.LT(1);

		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1279:5: ( IDENT | STRING_LITERAL )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:
			{
			if ( input.LA(1)==IDENT||input.LA(1)==STRING_LITERAL ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
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
	// $ANTLR end "username"



	// $ANTLR start "non_type_ident"
	// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1285:1: non_type_ident returns [ColumnIdentifier id] : (t= IDENT |t= QUOTED_NAME |k= basic_unreserved_keyword |kk= K_KEY );
	public final ColumnIdentifier non_type_ident() throws RecognitionException {
		ColumnIdentifier id = null;


		Token t=null;
		Token kk=null;
		String k =null;

		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1286:5: (t= IDENT |t= QUOTED_NAME |k= basic_unreserved_keyword |kk= K_KEY )
			int alt158=4;
			switch ( input.LA(1) ) {
			case IDENT:
				{
				alt158=1;
				}
				break;
			case QUOTED_NAME:
				{
				alt158=2;
				}
				break;
			case K_ALL:
			case K_AS:
			case K_CLUSTERING:
			case K_COMPACT:
			case K_CONTAINS:
			case K_CUSTOM:
			case K_DETERMINISTIC:
			case K_DISTINCT:
			case K_EXISTS:
			case K_FILTERING:
			case K_FUNCTION:
			case K_KEYS:
			case K_KEYSPACES:
			case K_LANGUAGE:
			case K_LIST:
			case K_MAP:
			case K_NON:
			case K_NOSUPERUSER:
			case K_PASSWORD:
			case K_PERMISSION:
			case K_PERMISSIONS:
			case K_RETURNS:
			case K_STATIC:
			case K_STORAGE:
			case K_SUPERUSER:
			case K_TRIGGER:
			case K_TYPE:
			case K_USER:
			case K_USERS:
			case K_VALUES:
				{
				alt158=3;
				}
				break;
			case K_KEY:
				{
				alt158=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 158, 0, input);
				throw nvae;
			}
			switch (alt158) {
				case 1 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1286:7: t= IDENT
					{
					t=(Token)match(input,IDENT,FOLLOW_IDENT_in_non_type_ident8783); 
					 if (reservedTypeNames.contains((t!=null?t.getText():null))) addRecognitionError("Invalid (reserved) user type name " + (t!=null?t.getText():null)); id = new ColumnIdentifier((t!=null?t.getText():null), false); 
					}
					break;
				case 2 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1287:7: t= QUOTED_NAME
					{
					t=(Token)match(input,QUOTED_NAME,FOLLOW_QUOTED_NAME_in_non_type_ident8814); 
					 id = new ColumnIdentifier((t!=null?t.getText():null), true); 
					}
					break;
				case 3 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1288:7: k= basic_unreserved_keyword
					{
					pushFollow(FOLLOW_basic_unreserved_keyword_in_non_type_ident8839);
					k=basic_unreserved_keyword();
					state._fsp--;

					 id = new ColumnIdentifier(k, false); 
					}
					break;
				case 4 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1289:7: kk= K_KEY
					{
					kk=(Token)match(input,K_KEY,FOLLOW_K_KEY_in_non_type_ident8851); 
					 id = new ColumnIdentifier((kk!=null?kk.getText():null), false); 
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
		return id;
	}
	// $ANTLR end "non_type_ident"



	// $ANTLR start "unreserved_keyword"
	// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1292:1: unreserved_keyword returns [String str] : (u= unreserved_function_keyword |k= ( K_TTL | K_COUNT | K_WRITETIME | K_KEY ) );
	public final String unreserved_keyword() throws RecognitionException {
		String str = null;


		Token k=null;
		String u =null;

		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1293:5: (u= unreserved_function_keyword |k= ( K_TTL | K_COUNT | K_WRITETIME | K_KEY ) )
			int alt159=2;
			int LA159_0 = input.LA(1);
			if ( (LA159_0==K_ALL||LA159_0==K_AS||LA159_0==K_ASCII||(LA159_0 >= K_BIGINT && LA159_0 <= K_BOOLEAN)||LA159_0==K_CLUSTERING||LA159_0==K_COMPACT||LA159_0==K_CONTAINS||LA159_0==K_COUNTER||(LA159_0 >= K_CUSTOM && LA159_0 <= K_DECIMAL)||(LA159_0 >= K_DETERMINISTIC && LA159_0 <= K_DOUBLE)||(LA159_0 >= K_EXISTS && LA159_0 <= K_FLOAT)||LA159_0==K_FUNCTION||LA159_0==K_INET||LA159_0==K_INT||LA159_0==K_KEYS||(LA159_0 >= K_KEYSPACES && LA159_0 <= K_LANGUAGE)||(LA159_0 >= K_LIST && LA159_0 <= K_MAP)||LA159_0==K_NON||LA159_0==K_NOSUPERUSER||(LA159_0 >= K_PASSWORD && LA159_0 <= K_PERMISSIONS)||LA159_0==K_RETURNS||(LA159_0 >= K_STATIC && LA159_0 <= K_TEXT)||(LA159_0 >= K_TIMESTAMP && LA159_0 <= K_TIMEUUID)||LA159_0==K_TRIGGER||LA159_0==K_TYPE||(LA159_0 >= K_USER && LA159_0 <= K_USERS)||(LA159_0 >= K_UUID && LA159_0 <= K_VARINT)) ) {
				alt159=1;
			}
			else if ( (LA159_0==K_COUNT||LA159_0==K_KEY||LA159_0==K_TTL||LA159_0==K_WRITETIME) ) {
				alt159=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 159, 0, input);
				throw nvae;
			}

			switch (alt159) {
				case 1 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1293:7: u= unreserved_function_keyword
					{
					pushFollow(FOLLOW_unreserved_function_keyword_in_unreserved_keyword8894);
					u=unreserved_function_keyword();
					state._fsp--;

					 str = u; 
					}
					break;
				case 2 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1294:7: k= ( K_TTL | K_COUNT | K_WRITETIME | K_KEY )
					{
					k=input.LT(1);
					if ( input.LA(1)==K_COUNT||input.LA(1)==K_KEY||input.LA(1)==K_TTL||input.LA(1)==K_WRITETIME ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					 str = (k!=null?k.getText():null); 
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
		return str;
	}
	// $ANTLR end "unreserved_keyword"



	// $ANTLR start "unreserved_function_keyword"
	// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1297:1: unreserved_function_keyword returns [String str] : (u= basic_unreserved_keyword |t= native_type );
	public final String unreserved_function_keyword() throws RecognitionException {
		String str = null;


		String u =null;
		CQL3Type t =null;

		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1298:5: (u= basic_unreserved_keyword |t= native_type )
			int alt160=2;
			int LA160_0 = input.LA(1);
			if ( (LA160_0==K_ALL||LA160_0==K_AS||LA160_0==K_CLUSTERING||LA160_0==K_COMPACT||LA160_0==K_CONTAINS||LA160_0==K_CUSTOM||(LA160_0 >= K_DETERMINISTIC && LA160_0 <= K_DISTINCT)||(LA160_0 >= K_EXISTS && LA160_0 <= K_FILTERING)||LA160_0==K_FUNCTION||LA160_0==K_KEYS||(LA160_0 >= K_KEYSPACES && LA160_0 <= K_LANGUAGE)||(LA160_0 >= K_LIST && LA160_0 <= K_MAP)||LA160_0==K_NON||LA160_0==K_NOSUPERUSER||(LA160_0 >= K_PASSWORD && LA160_0 <= K_PERMISSIONS)||LA160_0==K_RETURNS||(LA160_0 >= K_STATIC && LA160_0 <= K_SUPERUSER)||LA160_0==K_TRIGGER||LA160_0==K_TYPE||(LA160_0 >= K_USER && LA160_0 <= K_USERS)||LA160_0==K_VALUES) ) {
				alt160=1;
			}
			else if ( (LA160_0==K_ASCII||(LA160_0 >= K_BIGINT && LA160_0 <= K_BOOLEAN)||LA160_0==K_COUNTER||LA160_0==K_DECIMAL||LA160_0==K_DOUBLE||LA160_0==K_FLOAT||LA160_0==K_INET||LA160_0==K_INT||LA160_0==K_TEXT||(LA160_0 >= K_TIMESTAMP && LA160_0 <= K_TIMEUUID)||LA160_0==K_UUID||(LA160_0 >= K_VARCHAR && LA160_0 <= K_VARINT)) ) {
				alt160=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 160, 0, input);
				throw nvae;
			}

			switch (alt160) {
				case 1 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1298:7: u= basic_unreserved_keyword
					{
					pushFollow(FOLLOW_basic_unreserved_keyword_in_unreserved_function_keyword8949);
					u=basic_unreserved_keyword();
					state._fsp--;

					 str = u; 
					}
					break;
				case 2 :
					// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1299:7: t= native_type
					{
					pushFollow(FOLLOW_native_type_in_unreserved_function_keyword8961);
					t=native_type();
					state._fsp--;

					 str = t.toString(); 
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
		return str;
	}
	// $ANTLR end "unreserved_function_keyword"



	// $ANTLR start "basic_unreserved_keyword"
	// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1302:1: basic_unreserved_keyword returns [String str] : k= ( K_KEYS | K_AS | K_CLUSTERING | K_COMPACT | K_STORAGE | K_TYPE | K_VALUES | K_MAP | K_LIST | K_FILTERING | K_PERMISSION | K_PERMISSIONS | K_KEYSPACES | K_ALL | K_USER | K_USERS | K_SUPERUSER | K_NOSUPERUSER | K_PASSWORD | K_EXISTS | K_CUSTOM | K_TRIGGER | K_DISTINCT | K_CONTAINS | K_STATIC | K_FUNCTION | K_RETURNS | K_LANGUAGE | K_NON | K_DETERMINISTIC ) ;
	public final String basic_unreserved_keyword() throws RecognitionException {
		String str = null;


		Token k=null;

		try {
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1303:5: (k= ( K_KEYS | K_AS | K_CLUSTERING | K_COMPACT | K_STORAGE | K_TYPE | K_VALUES | K_MAP | K_LIST | K_FILTERING | K_PERMISSION | K_PERMISSIONS | K_KEYSPACES | K_ALL | K_USER | K_USERS | K_SUPERUSER | K_NOSUPERUSER | K_PASSWORD | K_EXISTS | K_CUSTOM | K_TRIGGER | K_DISTINCT | K_CONTAINS | K_STATIC | K_FUNCTION | K_RETURNS | K_LANGUAGE | K_NON | K_DETERMINISTIC ) )
			// /Users/daidong/Documents/gitrepos/cassandra-trunk/src/java/org/apache/cassandra/cql3/Cql.g:1303:7: k= ( K_KEYS | K_AS | K_CLUSTERING | K_COMPACT | K_STORAGE | K_TYPE | K_VALUES | K_MAP | K_LIST | K_FILTERING | K_PERMISSION | K_PERMISSIONS | K_KEYSPACES | K_ALL | K_USER | K_USERS | K_SUPERUSER | K_NOSUPERUSER | K_PASSWORD | K_EXISTS | K_CUSTOM | K_TRIGGER | K_DISTINCT | K_CONTAINS | K_STATIC | K_FUNCTION | K_RETURNS | K_LANGUAGE | K_NON | K_DETERMINISTIC )
			{
			k=input.LT(1);
			if ( input.LA(1)==K_ALL||input.LA(1)==K_AS||input.LA(1)==K_CLUSTERING||input.LA(1)==K_COMPACT||input.LA(1)==K_CONTAINS||input.LA(1)==K_CUSTOM||(input.LA(1) >= K_DETERMINISTIC && input.LA(1) <= K_DISTINCT)||(input.LA(1) >= K_EXISTS && input.LA(1) <= K_FILTERING)||input.LA(1)==K_FUNCTION||input.LA(1)==K_KEYS||(input.LA(1) >= K_KEYSPACES && input.LA(1) <= K_LANGUAGE)||(input.LA(1) >= K_LIST && input.LA(1) <= K_MAP)||input.LA(1)==K_NON||input.LA(1)==K_NOSUPERUSER||(input.LA(1) >= K_PASSWORD && input.LA(1) <= K_PERMISSIONS)||input.LA(1)==K_RETURNS||(input.LA(1) >= K_STATIC && input.LA(1) <= K_SUPERUSER)||input.LA(1)==K_TRIGGER||input.LA(1)==K_TYPE||(input.LA(1) >= K_USER && input.LA(1) <= K_USERS)||input.LA(1)==K_VALUES ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			 str = (k!=null?k.getText():null); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return str;
	}
	// $ANTLR end "basic_unreserved_keyword"

	// Delegated rules



	public static final BitSet FOLLOW_cqlStatement_in_query72 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_163_in_query75 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_EOF_in_query79 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_selectStatement_in_cqlStatement113 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insertStatement_in_cqlStatement138 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_updateStatement_in_cqlStatement163 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_batchStatement_in_cqlStatement188 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_deleteStatement_in_cqlStatement214 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_useStatement_in_cqlStatement239 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_truncateStatement_in_cqlStatement267 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_createKeyspaceStatement_in_cqlStatement290 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_createTableStatement_in_cqlStatement307 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_createIndexStatement_in_cqlStatement326 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dropKeyspaceStatement_in_cqlStatement345 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dropTableStatement_in_cqlStatement363 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dropIndexStatement_in_cqlStatement384 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_alterTableStatement_in_cqlStatement405 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_alterKeyspaceStatement_in_cqlStatement425 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_grantStatement_in_cqlStatement442 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_revokeStatement_in_cqlStatement467 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_listPermissionsStatement_in_cqlStatement491 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_createUserStatement_in_cqlStatement506 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_alterUserStatement_in_cqlStatement526 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dropUserStatement_in_cqlStatement547 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_listUsersStatement_in_cqlStatement569 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_createTriggerStatement_in_cqlStatement590 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dropTriggerStatement_in_cqlStatement607 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_createTypeStatement_in_cqlStatement626 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_alterTypeStatement_in_cqlStatement646 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dropTypeStatement_in_cqlStatement667 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_createFunctionStatement_in_cqlStatement689 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dropFunctionStatement_in_cqlStatement705 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_travelStatement_in_cqlStatement724 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_USE_in_useStatement760 = new BitSet(new long[]{0x4E73757142100000L,0xF6151BC43814DB48L,0x0000000000002008L});
	public static final BitSet FOLLOW_keyspaceName_in_useStatement764 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_TRAVEL_in_travelStatement798 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_K_FROM_in_travelStatement800 = new BitSet(new long[]{0x4E73757142100000L,0xF6151BC43814DB48L,0x0000000000002008L});
	public static final BitSet FOLLOW_columnFamilyName_in_travelStatement804 = new BitSet(new long[]{0x0000000000000000L,0x0000040100000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_K_WHERE_in_travelStatement814 = new BitSet(new long[]{0x4E73757142100000L,0xF6155BC43814DB48L,0x0000000008002008L});
	public static final BitSet FOLLOW_whereClause_in_travelStatement818 = new BitSet(new long[]{0x0000000000000000L,0x0000040100000000L});
	public static final BitSet FOLLOW_K_REPEAT_in_travelStatement832 = new BitSet(new long[]{0x0000000000200000L,0x0000040000000000L,0x0000000200001000L});
	public static final BitSet FOLLOW_intValue_in_travelStatement836 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_throughClause_in_travelStatement846 = new BitSet(new long[]{0x0000000000000002L,0x0000040000000000L});
	public static final BitSet FOLLOW_throughClause_in_travelStatement850 = new BitSet(new long[]{0x0000000000000002L,0x0000040000000000L});
	public static final BitSet FOLLOW_K_THROUGH_in_throughClause882 = new BitSet(new long[]{0x4E73757142100000L,0xF6155BC43814DB48L,0x0000000008002008L});
	public static final BitSet FOLLOW_whereClause_in_throughClause886 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
	public static final BitSet FOLLOW_K_TO_in_throughClause896 = new BitSet(new long[]{0x4E73757142100000L,0xF6151BC43814DB48L,0x0000000000002008L});
	public static final BitSet FOLLOW_columnFamilyName_in_throughClause900 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_K_WHERE_in_throughClause911 = new BitSet(new long[]{0x4E73757142100000L,0xF6155BC43814DB48L,0x0000000008002008L});
	public static final BitSet FOLLOW_whereClause_in_throughClause915 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_SELECT_in_selectStatement960 = new BitSet(new long[]{0x4E73757142100000L,0xF6155BC43814DB48L,0x0000040000002008L});
	public static final BitSet FOLLOW_K_DISTINCT_in_selectStatement966 = new BitSet(new long[]{0x4E73757142100000L,0xF6155BC43814DB48L,0x0000040000002008L});
	public static final BitSet FOLLOW_selectClause_in_selectStatement975 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_K_COUNT_in_selectStatement995 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_155_in_selectStatement997 = new BitSet(new long[]{0x0000000000200000L,0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_selectCountClause_in_selectStatement1001 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_156_in_selectStatement1003 = new BitSet(new long[]{0x1000000040000000L});
	public static final BitSet FOLLOW_K_AS_in_selectStatement1008 = new BitSet(new long[]{0x4E73757142100000L,0xF6151BC43814DB48L,0x0000000000002008L});
	public static final BitSet FOLLOW_cident_in_selectStatement1012 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_K_FROM_in_selectStatement1027 = new BitSet(new long[]{0x4E73757142100000L,0xF6151BC43814DB48L,0x0000000000002008L});
	public static final BitSet FOLLOW_columnFamilyName_in_selectStatement1031 = new BitSet(new long[]{0x0000000004000002L,0x0000000004002000L,0x0000000000000002L});
	public static final BitSet FOLLOW_K_WHERE_in_selectStatement1041 = new BitSet(new long[]{0x4E73757142100000L,0xF6155BC43814DB48L,0x0000000008002008L});
	public static final BitSet FOLLOW_whereClause_in_selectStatement1045 = new BitSet(new long[]{0x0000000004000002L,0x0000000004002000L});
	public static final BitSet FOLLOW_K_ORDER_in_selectStatement1058 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_K_BY_in_selectStatement1060 = new BitSet(new long[]{0x4E73757142100000L,0xF6151BC43814DB48L,0x0000000000002008L});
	public static final BitSet FOLLOW_orderByClause_in_selectStatement1062 = new BitSet(new long[]{0x0000000004000002L,0x0000000000002000L,0x0000000040000000L});
	public static final BitSet FOLLOW_158_in_selectStatement1067 = new BitSet(new long[]{0x4E73757142100000L,0xF6151BC43814DB48L,0x0000000000002008L});
	public static final BitSet FOLLOW_orderByClause_in_selectStatement1069 = new BitSet(new long[]{0x0000000004000002L,0x0000000000002000L,0x0000000040000000L});
	public static final BitSet FOLLOW_K_LIMIT_in_selectStatement1086 = new BitSet(new long[]{0x0000000004200000L,0x0000000000000000L,0x0000000200001000L});
	public static final BitSet FOLLOW_intValue_in_selectStatement1090 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_K_ALLOW_in_selectStatement1105 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_K_FILTERING_in_selectStatement1107 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_selector_in_selectClause1144 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_158_in_selectClause1149 = new BitSet(new long[]{0x4E73757142100000L,0xF6155BC43814DB48L,0x0000000000002008L});
	public static final BitSet FOLLOW_selector_in_selectClause1153 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_170_in_selectClause1165 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unaliasedSelector_in_selector1198 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_K_AS_in_selector1201 = new BitSet(new long[]{0x4E73757142100000L,0xF6151BC43814DB48L,0x0000000000002008L});
	public static final BitSet FOLLOW_cident_in_selector1205 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cident_in_unaliasedSelector1246 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_K_WRITETIME_in_unaliasedSelector1292 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_155_in_unaliasedSelector1294 = new BitSet(new long[]{0x4E73757142100000L,0xF6151BC43814DB48L,0x0000000000002008L});
	public static final BitSet FOLLOW_cident_in_unaliasedSelector1298 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_156_in_unaliasedSelector1300 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_K_TTL_in_unaliasedSelector1326 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_155_in_unaliasedSelector1334 = new BitSet(new long[]{0x4E73757142100000L,0xF6151BC43814DB48L,0x0000000000002008L});
	public static final BitSet FOLLOW_cident_in_unaliasedSelector1338 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_156_in_unaliasedSelector1340 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_functionName_in_unaliasedSelector1368 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_selectionFunctionArgs_in_unaliasedSelector1372 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_160_in_unaliasedSelector1387 = new BitSet(new long[]{0x4E73757142100000L,0xF6151BC43814DB48L,0x0000000000002008L});
	public static final BitSet FOLLOW_cident_in_unaliasedSelector1391 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_155_in_selectionFunctionArgs1419 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_156_in_selectionFunctionArgs1421 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_155_in_selectionFunctionArgs1431 = new BitSet(new long[]{0x4E73757142100000L,0xF6155BC43814DB48L,0x0000000000002008L});
	public static final BitSet FOLLOW_unaliasedSelector_in_selectionFunctionArgs1435 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000050000000L});
	public static final BitSet FOLLOW_158_in_selectionFunctionArgs1451 = new BitSet(new long[]{0x4E73757142100000L,0xF6155BC43814DB48L,0x0000000000002008L});
	public static final BitSet FOLLOW_unaliasedSelector_in_selectionFunctionArgs1455 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000050000000L});
	public static final BitSet FOLLOW_156_in_selectionFunctionArgs1468 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_170_in_selectCountClause1491 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTEGER_in_selectCountClause1513 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_relation_in_whereClause1549 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_K_AND_in_whereClause1553 = new BitSet(new long[]{0x4E73757142100000L,0xF6155BC43814DB48L,0x0000000008002008L});
	public static final BitSet FOLLOW_relation_in_whereClause1555 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_cident_in_orderByClause1586 = new BitSet(new long[]{0x0008000080000002L});
	public static final BitSet FOLLOW_K_ASC_in_orderByClause1589 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_DESC_in_orderByClause1593 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_INSERT_in_insertStatement1631 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_K_INTO_in_insertStatement1633 = new BitSet(new long[]{0x4E73757142100000L,0xF6151BC43814DB48L,0x0000000000002008L});
	public static final BitSet FOLLOW_columnFamilyName_in_insertStatement1637 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_155_in_insertStatement1649 = new BitSet(new long[]{0x4E73757142100000L,0xF6151BC43814DB48L,0x0000000000002008L});
	public static final BitSet FOLLOW_cident_in_insertStatement1653 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000050000000L});
	public static final BitSet FOLLOW_158_in_insertStatement1660 = new BitSet(new long[]{0x4E73757142100000L,0xF6151BC43814DB48L,0x0000000000002008L});
	public static final BitSet FOLLOW_cident_in_insertStatement1664 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000050000000L});
	public static final BitSet FOLLOW_156_in_insertStatement1671 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
	public static final BitSet FOLLOW_K_VALUES_in_insertStatement1681 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_155_in_insertStatement1693 = new BitSet(new long[]{0x4E73557142344040L,0xF6115BC43856DA58L,0x0000120288091000L});
	public static final BitSet FOLLOW_term_in_insertStatement1697 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000050000000L});
	public static final BitSet FOLLOW_158_in_insertStatement1703 = new BitSet(new long[]{0x4E73557142344040L,0xF6115BC43856DA58L,0x0000120288091000L});
	public static final BitSet FOLLOW_term_in_insertStatement1707 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000050000000L});
	public static final BitSet FOLLOW_156_in_insertStatement1714 = new BitSet(new long[]{0x0000000000000002L,0x0800000000000001L});
	public static final BitSet FOLLOW_K_IF_in_insertStatement1727 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_K_NOT_in_insertStatement1729 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_K_EXISTS_in_insertStatement1731 = new BitSet(new long[]{0x0000000000000002L,0x0800000000000000L});
	public static final BitSet FOLLOW_usingClause_in_insertStatement1748 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_USING_in_usingClause1778 = new BitSet(new long[]{0x0000000000000000L,0x0004080000000000L});
	public static final BitSet FOLLOW_usingClauseObjective_in_usingClause1780 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_K_AND_in_usingClause1785 = new BitSet(new long[]{0x0000000000000000L,0x0004080000000000L});
	public static final BitSet FOLLOW_usingClauseObjective_in_usingClause1787 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_K_TIMESTAMP_in_usingClauseObjective1809 = new BitSet(new long[]{0x0000000000200000L,0x0000000000000000L,0x0000000200001000L});
	public static final BitSet FOLLOW_intValue_in_usingClauseObjective1813 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_TTL_in_usingClauseObjective1823 = new BitSet(new long[]{0x0000000000200000L,0x0000000000000000L,0x0000000200001000L});
	public static final BitSet FOLLOW_intValue_in_usingClauseObjective1827 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_UPDATE_in_updateStatement1861 = new BitSet(new long[]{0x4E73757142100000L,0xF6151BC43814DB48L,0x0000000000002008L});
	public static final BitSet FOLLOW_columnFamilyName_in_updateStatement1865 = new BitSet(new long[]{0x0000000000000000L,0x0800002000000000L});
	public static final BitSet FOLLOW_usingClause_in_updateStatement1875 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_K_SET_in_updateStatement1887 = new BitSet(new long[]{0x4E73757142100000L,0xF6151BC43814DB48L,0x0000000000002008L});
	public static final BitSet FOLLOW_columnOperation_in_updateStatement1889 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000002L});
	public static final BitSet FOLLOW_158_in_updateStatement1893 = new BitSet(new long[]{0x4E73757142100000L,0xF6151BC43814DB48L,0x0000000000002008L});
	public static final BitSet FOLLOW_columnOperation_in_updateStatement1895 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000002L});
	public static final BitSet FOLLOW_K_WHERE_in_updateStatement1906 = new BitSet(new long[]{0x4E73757142100000L,0xF6155BC43814DB48L,0x0000000008002008L});
	public static final BitSet FOLLOW_whereClause_in_updateStatement1910 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
	public static final BitSet FOLLOW_K_IF_in_updateStatement1920 = new BitSet(new long[]{0x4E73757142100000L,0xF6151BC43814DB48L,0x0000000000002008L});
	public static final BitSet FOLLOW_updateConditions_in_updateStatement1924 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_columnCondition_in_updateConditions1965 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_K_AND_in_updateConditions1970 = new BitSet(new long[]{0x4E73757142100000L,0xF6151BC43814DB48L,0x0000000000002008L});
	public static final BitSet FOLLOW_columnCondition_in_updateConditions1972 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_K_DELETE_in_deleteStatement2009 = new BitSet(new long[]{0x5E73757142100000L,0xF6151BC43814DB48L,0x0000000000002008L});
	public static final BitSet FOLLOW_deleteSelection_in_deleteStatement2015 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_K_FROM_in_deleteStatement2028 = new BitSet(new long[]{0x4E73757142100000L,0xF6151BC43814DB48L,0x0000000000002008L});
	public static final BitSet FOLLOW_columnFamilyName_in_deleteStatement2032 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_usingClauseDelete_in_deleteStatement2042 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_K_WHERE_in_deleteStatement2054 = new BitSet(new long[]{0x4E73757142100000L,0xF6155BC43814DB48L,0x0000000008002008L});
	public static final BitSet FOLLOW_whereClause_in_deleteStatement2058 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
	public static final BitSet FOLLOW_K_IF_in_deleteStatement2068 = new BitSet(new long[]{0x4E73757142100000L,0xF6151BC43814DB48L,0x0000000000002008L});
	public static final BitSet FOLLOW_K_EXISTS_in_deleteStatement2072 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_updateConditions_in_deleteStatement2080 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_deleteOp_in_deleteSelection2127 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_158_in_deleteSelection2142 = new BitSet(new long[]{0x4E73757142100000L,0xF6151BC43814DB48L,0x0000000000002008L});
	public static final BitSet FOLLOW_deleteOp_in_deleteSelection2146 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_cident_in_deleteOp2173 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cident_in_deleteOp2200 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
	public static final BitSet FOLLOW_169_in_deleteOp2202 = new BitSet(new long[]{0x4E73557142344040L,0xF6115BC43856DA58L,0x0000120288091000L});
	public static final BitSet FOLLOW_term_in_deleteOp2206 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_171_in_deleteOp2208 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_USING_in_usingClauseDelete2228 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_K_TIMESTAMP_in_usingClauseDelete2230 = new BitSet(new long[]{0x0000000000200000L,0x0000000000000000L,0x0000000200001000L});
	public static final BitSet FOLLOW_intValue_in_usingClauseDelete2234 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_BEGIN_in_batchStatement2268 = new BitSet(new long[]{0x0000400400000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_K_UNLOGGED_in_batchStatement2278 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_K_COUNTER_in_batchStatement2284 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_K_BATCH_in_batchStatement2297 = new BitSet(new long[]{0x0004000020000000L,0x0880000000000020L});
	public static final BitSet FOLLOW_usingClause_in_batchStatement2301 = new BitSet(new long[]{0x0004000020000000L,0x0080000000000020L});
	public static final BitSet FOLLOW_batchStatementObjective_in_batchStatement2321 = new BitSet(new long[]{0x0004000020000000L,0x0080000000000020L,0x0000000800000000L});
	public static final BitSet FOLLOW_163_in_batchStatement2323 = new BitSet(new long[]{0x0004000020000000L,0x0080000000000020L});
	public static final BitSet FOLLOW_K_APPLY_in_batchStatement2337 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_K_BATCH_in_batchStatement2339 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insertStatement_in_batchStatementObjective2370 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_updateStatement_in_batchStatementObjective2383 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_deleteStatement_in_batchStatementObjective2396 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_CREATE_in_createFunctionStatement2429 = new BitSet(new long[]{0x4010000000000000L,0x0000000002040000L});
	public static final BitSet FOLLOW_K_OR_in_createFunctionStatement2432 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_K_REPLACE_in_createFunctionStatement2434 = new BitSet(new long[]{0x4010000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_K_NON_in_createFunctionStatement2448 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_K_DETERMINISTIC_in_createFunctionStatement2454 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_K_FUNCTION_in_createFunctionStatement2464 = new BitSet(new long[]{0x4E73557142100000L,0xF6115BC43814DA49L});
	public static final BitSet FOLLOW_K_IF_in_createFunctionStatement2473 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_K_NOT_in_createFunctionStatement2475 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_K_EXISTS_in_createFunctionStatement2477 = new BitSet(new long[]{0x4E73557142100000L,0xF6115BC43814DA48L});
	public static final BitSet FOLLOW_functionName_in_createFunctionStatement2491 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_155_in_createFunctionStatement2499 = new BitSet(new long[]{0x4E73757142100000L,0xF6151BC43814DB48L,0x0000000010002008L});
	public static final BitSet FOLLOW_cident_in_createFunctionStatement2523 = new BitSet(new long[]{0x6E73757142100000L,0xF61D1BE43814DB48L,0x0000000000012008L});
	public static final BitSet FOLLOW_comparatorType_in_createFunctionStatement2527 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000050000000L});
	public static final BitSet FOLLOW_158_in_createFunctionStatement2543 = new BitSet(new long[]{0x4E73757142100000L,0xF6151BC43814DB48L,0x0000000000002008L});
	public static final BitSet FOLLOW_cident_in_createFunctionStatement2547 = new BitSet(new long[]{0x6E73757142100000L,0xF61D1BE43814DB48L,0x0000000000012008L});
	public static final BitSet FOLLOW_comparatorType_in_createFunctionStatement2551 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000050000000L});
	public static final BitSet FOLLOW_156_in_createFunctionStatement2575 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
	public static final BitSet FOLLOW_K_RETURNS_in_createFunctionStatement2583 = new BitSet(new long[]{0x6E73757142100000L,0xF61D1BE43814DB48L,0x0000000000012008L});
	public static final BitSet FOLLOW_comparatorType_in_createFunctionStatement2593 = new BitSet(new long[]{0x0000000000000000L,0x0800000000001000L});
	public static final BitSet FOLLOW_K_USING_in_createFunctionStatement2615 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_createFunctionStatement2621 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_LANGUAGE_in_createFunctionStatement2639 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_IDENT_in_createFunctionStatement2645 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_K_AS_in_createFunctionStatement2649 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_createFunctionStatement2685 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_DROP_in_dropFunctionStatement2807 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_K_FUNCTION_in_dropFunctionStatement2809 = new BitSet(new long[]{0x4E73557142100000L,0xF6115BC43814DA49L});
	public static final BitSet FOLLOW_K_IF_in_dropFunctionStatement2818 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_K_EXISTS_in_dropFunctionStatement2820 = new BitSet(new long[]{0x4E73557142100000L,0xF6115BC43814DA48L});
	public static final BitSet FOLLOW_functionName_in_dropFunctionStatement2835 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_155_in_dropFunctionStatement2853 = new BitSet(new long[]{0x6E73757142100000L,0xF61D1BE43814DB48L,0x0000000010012008L});
	public static final BitSet FOLLOW_comparatorType_in_dropFunctionStatement2881 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000050000000L});
	public static final BitSet FOLLOW_158_in_dropFunctionStatement2899 = new BitSet(new long[]{0x6E73757142100000L,0xF61D1BE43814DB48L,0x0000000000012008L});
	public static final BitSet FOLLOW_comparatorType_in_dropFunctionStatement2903 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000050000000L});
	public static final BitSet FOLLOW_156_in_dropFunctionStatement2931 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_CREATE_in_createKeyspaceStatement2990 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_K_KEYSPACE_in_createKeyspaceStatement2992 = new BitSet(new long[]{0x4E73757142100000L,0xF6151BC43814DB49L,0x0000000000002008L});
	public static final BitSet FOLLOW_K_IF_in_createKeyspaceStatement2995 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_K_NOT_in_createKeyspaceStatement2997 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_K_EXISTS_in_createKeyspaceStatement2999 = new BitSet(new long[]{0x4E73757142100000L,0xF6151BC43814DB48L,0x0000000000002008L});
	public static final BitSet FOLLOW_keyspaceName_in_createKeyspaceStatement3008 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_K_WITH_in_createKeyspaceStatement3016 = new BitSet(new long[]{0x4E73757142100000L,0xF6151BC43814DB48L,0x0000000000002008L});
	public static final BitSet FOLLOW_properties_in_createKeyspaceStatement3018 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_CREATE_in_createTableStatement3053 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_K_COLUMNFAMILY_in_createTableStatement3055 = new BitSet(new long[]{0x4E73757142100000L,0xF6151BC43814DB49L,0x0000000000002008L});
	public static final BitSet FOLLOW_K_IF_in_createTableStatement3058 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_K_NOT_in_createTableStatement3060 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_K_EXISTS_in_createTableStatement3062 = new BitSet(new long[]{0x4E73757142100000L,0xF6151BC43814DB48L,0x0000000000002008L});
	public static final BitSet FOLLOW_columnFamilyName_in_createTableStatement3077 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_cfamDefinition_in_createTableStatement3087 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_155_in_cfamDefinition3106 = new BitSet(new long[]{0x4E73757142100000L,0xF6151BC47814DB48L,0x0000000000002008L});
	public static final BitSet FOLLOW_cfamColumns_in_cfamDefinition3108 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000050000000L});
	public static final BitSet FOLLOW_158_in_cfamDefinition3113 = new BitSet(new long[]{0x4E73757142100000L,0xF6151BC47814DB48L,0x0000000050002008L});
	public static final BitSet FOLLOW_cfamColumns_in_cfamDefinition3115 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000050000000L});
	public static final BitSet FOLLOW_156_in_cfamDefinition3122 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_K_WITH_in_cfamDefinition3132 = new BitSet(new long[]{0x4E73757142100000L,0xF6151BC43814DB48L,0x0000000000002008L});
	public static final BitSet FOLLOW_cfamProperty_in_cfamDefinition3134 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_K_AND_in_cfamDefinition3139 = new BitSet(new long[]{0x4E73757142100000L,0xF6151BC43814DB48L,0x0000000000002008L});
	public static final BitSet FOLLOW_cfamProperty_in_cfamDefinition3141 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_cident_in_cfamColumns3167 = new BitSet(new long[]{0x6E73757142100000L,0xF61D1BE43814DB48L,0x0000000000012008L});
	public static final BitSet FOLLOW_comparatorType_in_cfamColumns3171 = new BitSet(new long[]{0x0000000000000002L,0x0000004040000000L});
	public static final BitSet FOLLOW_K_STATIC_in_cfamColumns3176 = new BitSet(new long[]{0x0000000000000002L,0x0000000040000000L});
	public static final BitSet FOLLOW_K_PRIMARY_in_cfamColumns3193 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_K_KEY_in_cfamColumns3195 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_PRIMARY_in_cfamColumns3207 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_K_KEY_in_cfamColumns3209 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_155_in_cfamColumns3211 = new BitSet(new long[]{0x4E73757142100000L,0xF6151BC43814DB48L,0x0000000008002008L});
	public static final BitSet FOLLOW_pkDef_in_cfamColumns3213 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000050000000L});
	public static final BitSet FOLLOW_158_in_cfamColumns3217 = new BitSet(new long[]{0x4E73757142100000L,0xF6151BC43814DB48L,0x0000000000002008L});
	public static final BitSet FOLLOW_cident_in_cfamColumns3221 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000050000000L});
	public static final BitSet FOLLOW_156_in_cfamColumns3228 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cident_in_pkDef3248 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_155_in_pkDef3258 = new BitSet(new long[]{0x4E73757142100000L,0xF6151BC43814DB48L,0x0000000000002008L});
	public static final BitSet FOLLOW_cident_in_pkDef3264 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000050000000L});
	public static final BitSet FOLLOW_158_in_pkDef3270 = new BitSet(new long[]{0x4E73757142100000L,0xF6151BC43814DB48L,0x0000000000002008L});
	public static final BitSet FOLLOW_cident_in_pkDef3274 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000050000000L});
	public static final BitSet FOLLOW_156_in_pkDef3281 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_property_in_cfamProperty3301 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_COMPACT_in_cfamProperty3310 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_K_STORAGE_in_cfamProperty3312 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_CLUSTERING_in_cfamProperty3322 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_K_ORDER_in_cfamProperty3324 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_K_BY_in_cfamProperty3326 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_155_in_cfamProperty3328 = new BitSet(new long[]{0x4E73757142100000L,0xF6151BC43814DB48L,0x0000000000002008L});
	public static final BitSet FOLLOW_cfamOrdering_in_cfamProperty3330 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000050000000L});
	public static final BitSet FOLLOW_158_in_cfamProperty3334 = new BitSet(new long[]{0x4E73757142100000L,0xF6151BC43814DB48L,0x0000000000002008L});
	public static final BitSet FOLLOW_cfamOrdering_in_cfamProperty3336 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000050000000L});
	public static final BitSet FOLLOW_156_in_cfamProperty3341 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cident_in_cfamOrdering3369 = new BitSet(new long[]{0x0008000080000000L});
	public static final BitSet FOLLOW_K_ASC_in_cfamOrdering3372 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_DESC_in_cfamOrdering3376 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_CREATE_in_createTypeStatement3415 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
	public static final BitSet FOLLOW_K_TYPE_in_createTypeStatement3417 = new BitSet(new long[]{0x4E73757142100000L,0xF6151BC43814DB49L,0x0000000000002008L});
	public static final BitSet FOLLOW_K_IF_in_createTypeStatement3420 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_K_NOT_in_createTypeStatement3422 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_K_EXISTS_in_createTypeStatement3424 = new BitSet(new long[]{0x4E73757142100000L,0xF6151BC43814DB48L,0x0000000000002008L});
	public static final BitSet FOLLOW_userTypeName_in_createTypeStatement3442 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_155_in_createTypeStatement3455 = new BitSet(new long[]{0x4E73757142100000L,0xF6151BC43814DB48L,0x0000000000002008L});
	public static final BitSet FOLLOW_typeColumns_in_createTypeStatement3457 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000050000000L});
	public static final BitSet FOLLOW_158_in_createTypeStatement3462 = new BitSet(new long[]{0x4E73757142100000L,0xF6151BC43814DB48L,0x0000000050002008L});
	public static final BitSet FOLLOW_typeColumns_in_createTypeStatement3464 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000050000000L});
	public static final BitSet FOLLOW_156_in_createTypeStatement3471 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cident_in_typeColumns3491 = new BitSet(new long[]{0x6E73757142100000L,0xF61D1BE43814DB48L,0x0000000000012008L});
	public static final BitSet FOLLOW_comparatorType_in_typeColumns3495 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_CREATE_in_createIndexStatement3530 = new BitSet(new long[]{0x0001000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_K_CUSTOM_in_createIndexStatement3533 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_K_INDEX_in_createIndexStatement3539 = new BitSet(new long[]{0x0000000000100000L,0x0000000001000001L});
	public static final BitSet FOLLOW_K_IF_in_createIndexStatement3542 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_K_NOT_in_createIndexStatement3544 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_K_EXISTS_in_createIndexStatement3546 = new BitSet(new long[]{0x0000000000100000L,0x0000000001000000L});
	public static final BitSet FOLLOW_IDENT_in_createIndexStatement3564 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_K_ON_in_createIndexStatement3568 = new BitSet(new long[]{0x4E73757142100000L,0xF6151BC43814DB48L,0x0000000000002008L});
	public static final BitSet FOLLOW_columnFamilyName_in_createIndexStatement3572 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_155_in_createIndexStatement3574 = new BitSet(new long[]{0x4E73757142100000L,0xF6151BC43814DB48L,0x0000000000002008L});
	public static final BitSet FOLLOW_indexIdent_in_createIndexStatement3578 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_156_in_createIndexStatement3580 = new BitSet(new long[]{0x0000000000000002L,0x0800000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_K_USING_in_createIndexStatement3591 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_createIndexStatement3595 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_K_WITH_in_createIndexStatement3610 = new BitSet(new long[]{0x4E73757142100000L,0xF6151BC43814DB48L,0x0000000000002008L});
	public static final BitSet FOLLOW_properties_in_createIndexStatement3612 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cident_in_indexIdent3646 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_KEYS_in_indexIdent3671 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_155_in_indexIdent3673 = new BitSet(new long[]{0x4E73757142100000L,0xF6151BC43814DB48L,0x0000000000002008L});
	public static final BitSet FOLLOW_cident_in_indexIdent3677 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_156_in_indexIdent3679 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_CREATE_in_createTriggerStatement3714 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
	public static final BitSet FOLLOW_K_TRIGGER_in_createTriggerStatement3716 = new BitSet(new long[]{0x4E73757142100000L,0xF6151BC43814DB49L,0x0000000000002008L});
	public static final BitSet FOLLOW_K_IF_in_createTriggerStatement3719 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_K_NOT_in_createTriggerStatement3721 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_K_EXISTS_in_createTriggerStatement3723 = new BitSet(new long[]{0x4E73757142100000L,0xF6151BC43814DB48L,0x0000000000002008L});
	public static final BitSet FOLLOW_cident_in_createTriggerStatement3733 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_K_ON_in_createTriggerStatement3744 = new BitSet(new long[]{0x4E73757142100000L,0xF6151BC43814DB48L,0x0000000000002008L});
	public static final BitSet FOLLOW_columnFamilyName_in_createTriggerStatement3748 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_K_USING_in_createTriggerStatement3750 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_createTriggerStatement3754 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_DROP_in_dropTriggerStatement3795 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
	public static final BitSet FOLLOW_K_TRIGGER_in_dropTriggerStatement3797 = new BitSet(new long[]{0x4E73757142100000L,0xF6151BC43814DB49L,0x0000000000002008L});
	public static final BitSet FOLLOW_K_IF_in_dropTriggerStatement3800 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_K_EXISTS_in_dropTriggerStatement3802 = new BitSet(new long[]{0x4E73757142100000L,0xF6151BC43814DB48L,0x0000000000002008L});
	public static final BitSet FOLLOW_cident_in_dropTriggerStatement3812 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_K_ON_in_dropTriggerStatement3815 = new BitSet(new long[]{0x4E73757142100000L,0xF6151BC43814DB48L,0x0000000000002008L});
	public static final BitSet FOLLOW_columnFamilyName_in_dropTriggerStatement3819 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_ALTER_in_alterKeyspaceStatement3859 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_K_KEYSPACE_in_alterKeyspaceStatement3861 = new BitSet(new long[]{0x4E73757142100000L,0xF6151BC43814DB48L,0x0000000000002008L});
	public static final BitSet FOLLOW_keyspaceName_in_alterKeyspaceStatement3865 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_K_WITH_in_alterKeyspaceStatement3875 = new BitSet(new long[]{0x4E73757142100000L,0xF6151BC43814DB48L,0x0000000000002008L});
	public static final BitSet FOLLOW_properties_in_alterKeyspaceStatement3877 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_ALTER_in_alterTableStatement3913 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_K_COLUMNFAMILY_in_alterTableStatement3915 = new BitSet(new long[]{0x4E73757142100000L,0xF6151BC43814DB48L,0x0000000000002008L});
	public static final BitSet FOLLOW_columnFamilyName_in_alterTableStatement3919 = new BitSet(new long[]{0x0080000009000000L,0x0000000080000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_K_ALTER_in_alterTableStatement3933 = new BitSet(new long[]{0x4E73757142100000L,0xF6151BC43814DB48L,0x0000000000002008L});
	public static final BitSet FOLLOW_cident_in_alterTableStatement3937 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
	public static final BitSet FOLLOW_K_TYPE_in_alterTableStatement3939 = new BitSet(new long[]{0x6E73757142100000L,0xF61D1BE43814DB48L,0x0000000000012008L});
	public static final BitSet FOLLOW_comparatorType_in_alterTableStatement3943 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_ADD_in_alterTableStatement3959 = new BitSet(new long[]{0x4E73757142100000L,0xF6151BC43814DB48L,0x0000000000002008L});
	public static final BitSet FOLLOW_cident_in_alterTableStatement3965 = new BitSet(new long[]{0x6E73757142100000L,0xF61D1BE43814DB48L,0x0000000000012008L});
	public static final BitSet FOLLOW_comparatorType_in_alterTableStatement3969 = new BitSet(new long[]{0x0000000000000002L,0x0000004000000000L});
	public static final BitSet FOLLOW_K_STATIC_in_alterTableStatement3974 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_DROP_in_alterTableStatement3992 = new BitSet(new long[]{0x4E73757142100000L,0xF6151BC43814DB48L,0x0000000000002008L});
	public static final BitSet FOLLOW_cident_in_alterTableStatement3997 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_WITH_in_alterTableStatement4037 = new BitSet(new long[]{0x4E73757142100000L,0xF6151BC43814DB48L,0x0000000000002008L});
	public static final BitSet FOLLOW_properties_in_alterTableStatement4040 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_RENAME_in_alterTableStatement4073 = new BitSet(new long[]{0x4E73757142100000L,0xF6151BC43814DB48L,0x0000000000002008L});
	public static final BitSet FOLLOW_cident_in_alterTableStatement4127 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
	public static final BitSet FOLLOW_K_TO_in_alterTableStatement4129 = new BitSet(new long[]{0x4E73757142100000L,0xF6151BC43814DB48L,0x0000000000002008L});
	public static final BitSet FOLLOW_cident_in_alterTableStatement4133 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_K_AND_in_alterTableStatement4154 = new BitSet(new long[]{0x4E73757142100000L,0xF6151BC43814DB48L,0x0000000000002008L});
	public static final BitSet FOLLOW_cident_in_alterTableStatement4158 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
	public static final BitSet FOLLOW_K_TO_in_alterTableStatement4160 = new BitSet(new long[]{0x4E73757142100000L,0xF6151BC43814DB48L,0x0000000000002008L});
	public static final BitSet FOLLOW_cident_in_alterTableStatement4164 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_K_ALTER_in_alterTypeStatement4210 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
	public static final BitSet FOLLOW_K_TYPE_in_alterTypeStatement4212 = new BitSet(new long[]{0x4E73757142100000L,0xF6151BC43814DB48L,0x0000000000002008L});
	public static final BitSet FOLLOW_userTypeName_in_alterTypeStatement4216 = new BitSet(new long[]{0x0000000009000000L,0x0000000080000000L});
	public static final BitSet FOLLOW_K_ALTER_in_alterTypeStatement4230 = new BitSet(new long[]{0x4E73757142100000L,0xF6151BC43814DB48L,0x0000000000002008L});
	public static final BitSet FOLLOW_cident_in_alterTypeStatement4234 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
	public static final BitSet FOLLOW_K_TYPE_in_alterTypeStatement4236 = new BitSet(new long[]{0x6E73757142100000L,0xF61D1BE43814DB48L,0x0000000000012008L});
	public static final BitSet FOLLOW_comparatorType_in_alterTypeStatement4240 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_ADD_in_alterTypeStatement4256 = new BitSet(new long[]{0x4E73757142100000L,0xF6151BC43814DB48L,0x0000000000002008L});
	public static final BitSet FOLLOW_cident_in_alterTypeStatement4262 = new BitSet(new long[]{0x6E73757142100000L,0xF61D1BE43814DB48L,0x0000000000012008L});
	public static final BitSet FOLLOW_comparatorType_in_alterTypeStatement4266 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_RENAME_in_alterTypeStatement4289 = new BitSet(new long[]{0x4E73757142100000L,0xF6151BC43814DB48L,0x0000000000002008L});
	public static final BitSet FOLLOW_cident_in_alterTypeStatement4327 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
	public static final BitSet FOLLOW_K_TO_in_alterTypeStatement4329 = new BitSet(new long[]{0x4E73757142100000L,0xF6151BC43814DB48L,0x0000000000002008L});
	public static final BitSet FOLLOW_cident_in_alterTypeStatement4333 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_K_AND_in_alterTypeStatement4356 = new BitSet(new long[]{0x4E73757142100000L,0xF6151BC43814DB48L,0x0000000000002008L});
	public static final BitSet FOLLOW_cident_in_alterTypeStatement4360 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
	public static final BitSet FOLLOW_K_TO_in_alterTypeStatement4362 = new BitSet(new long[]{0x4E73757142100000L,0xF6151BC43814DB48L,0x0000000000002008L});
	public static final BitSet FOLLOW_cident_in_alterTypeStatement4366 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_K_DROP_in_dropKeyspaceStatement4433 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_K_KEYSPACE_in_dropKeyspaceStatement4435 = new BitSet(new long[]{0x4E73757142100000L,0xF6151BC43814DB49L,0x0000000000002008L});
	public static final BitSet FOLLOW_K_IF_in_dropKeyspaceStatement4438 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_K_EXISTS_in_dropKeyspaceStatement4440 = new BitSet(new long[]{0x4E73757142100000L,0xF6151BC43814DB48L,0x0000000000002008L});
	public static final BitSet FOLLOW_keyspaceName_in_dropKeyspaceStatement4449 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_DROP_in_dropTableStatement4483 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_K_COLUMNFAMILY_in_dropTableStatement4485 = new BitSet(new long[]{0x4E73757142100000L,0xF6151BC43814DB49L,0x0000000000002008L});
	public static final BitSet FOLLOW_K_IF_in_dropTableStatement4488 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_K_EXISTS_in_dropTableStatement4490 = new BitSet(new long[]{0x4E73757142100000L,0xF6151BC43814DB48L,0x0000000000002008L});
	public static final BitSet FOLLOW_columnFamilyName_in_dropTableStatement4499 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_DROP_in_dropTypeStatement4533 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
	public static final BitSet FOLLOW_K_TYPE_in_dropTypeStatement4535 = new BitSet(new long[]{0x4E73757142100000L,0xF6151BC43814DB49L,0x0000000000002008L});
	public static final BitSet FOLLOW_K_IF_in_dropTypeStatement4538 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_K_EXISTS_in_dropTypeStatement4540 = new BitSet(new long[]{0x4E73757142100000L,0xF6151BC43814DB48L,0x0000000000002008L});
	public static final BitSet FOLLOW_userTypeName_in_dropTypeStatement4549 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_DROP_in_dropIndexStatement4583 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_K_INDEX_in_dropIndexStatement4585 = new BitSet(new long[]{0x4E73757142100000L,0xF6151BC43814DB49L,0x0000000000002008L});
	public static final BitSet FOLLOW_K_IF_in_dropIndexStatement4588 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_K_EXISTS_in_dropIndexStatement4590 = new BitSet(new long[]{0x4E73757142100000L,0xF6151BC43814DB48L,0x0000000000002008L});
	public static final BitSet FOLLOW_indexName_in_dropIndexStatement4599 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_TRUNCATE_in_truncateStatement4630 = new BitSet(new long[]{0x4E73757142100000L,0xF6151BC43814DB48L,0x0000000000002008L});
	public static final BitSet FOLLOW_columnFamilyName_in_truncateStatement4634 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_GRANT_in_grantStatement4659 = new BitSet(new long[]{0x008080020A000000L,0x0000001000010000L});
	public static final BitSet FOLLOW_permissionOrAll_in_grantStatement4671 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_K_ON_in_grantStatement4679 = new BitSet(new long[]{0x4E73777142100000L,0xF6151BC43814DF48L,0x0000000000002008L});
	public static final BitSet FOLLOW_resource_in_grantStatement4691 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
	public static final BitSet FOLLOW_K_TO_in_grantStatement4699 = new BitSet(new long[]{0x0000000000100000L,0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_username_in_grantStatement4711 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_REVOKE_in_revokeStatement4742 = new BitSet(new long[]{0x008080020A000000L,0x0000001000010000L});
	public static final BitSet FOLLOW_permissionOrAll_in_revokeStatement4754 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_K_ON_in_revokeStatement4762 = new BitSet(new long[]{0x4E73777142100000L,0xF6151BC43814DF48L,0x0000000000002008L});
	public static final BitSet FOLLOW_resource_in_revokeStatement4774 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_K_FROM_in_revokeStatement4782 = new BitSet(new long[]{0x0000000000100000L,0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_username_in_revokeStatement4794 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_LIST_in_listPermissionsStatement4832 = new BitSet(new long[]{0x008080020A000000L,0x0000001000010000L});
	public static final BitSet FOLLOW_permissionOrAll_in_listPermissionsStatement4844 = new BitSet(new long[]{0x0000000000000002L,0x0000000001880000L});
	public static final BitSet FOLLOW_K_ON_in_listPermissionsStatement4854 = new BitSet(new long[]{0x4E73777142100000L,0xF6151BC43814DF48L,0x0000000000002008L});
	public static final BitSet FOLLOW_resource_in_listPermissionsStatement4856 = new BitSet(new long[]{0x0000000000000002L,0x0000000000880000L});
	public static final BitSet FOLLOW_K_OF_in_listPermissionsStatement4871 = new BitSet(new long[]{0x0000000000100000L,0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_username_in_listPermissionsStatement4873 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
	public static final BitSet FOLLOW_K_NORECURSIVE_in_listPermissionsStatement4888 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_permission4924 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_ALL_in_permissionOrAll4973 = new BitSet(new long[]{0x0000000000000002L,0x0000000020000000L});
	public static final BitSet FOLLOW_K_PERMISSIONS_in_permissionOrAll4977 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_permission_in_permissionOrAll4998 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000000L});
	public static final BitSet FOLLOW_K_PERMISSION_in_permissionOrAll5002 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dataResource_in_resource5030 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_ALL_in_dataResource5053 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_K_KEYSPACES_in_dataResource5055 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_KEYSPACE_in_dataResource5065 = new BitSet(new long[]{0x4E73757142100000L,0xF6151BC43814DB48L,0x0000000000002008L});
	public static final BitSet FOLLOW_keyspaceName_in_dataResource5071 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_COLUMNFAMILY_in_dataResource5083 = new BitSet(new long[]{0x4E73757142100000L,0xF6151BC43814DB48L,0x0000000000002008L});
	public static final BitSet FOLLOW_columnFamilyName_in_dataResource5092 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_CREATE_in_createUserStatement5132 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
	public static final BitSet FOLLOW_K_USER_in_createUserStatement5134 = new BitSet(new long[]{0x0000000000100000L,0x0000000000000001L,0x0000000000010000L});
	public static final BitSet FOLLOW_K_IF_in_createUserStatement5137 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_K_NOT_in_createUserStatement5139 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_K_EXISTS_in_createUserStatement5141 = new BitSet(new long[]{0x0000000000100000L,0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_username_in_createUserStatement5147 = new BitSet(new long[]{0x0000000000000002L,0x0000010000100000L,0x0000000000000004L});
	public static final BitSet FOLLOW_K_WITH_in_createUserStatement5157 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_userOptions_in_createUserStatement5159 = new BitSet(new long[]{0x0000000000000002L,0x0000010000100000L});
	public static final BitSet FOLLOW_K_SUPERUSER_in_createUserStatement5173 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_NOSUPERUSER_in_createUserStatement5179 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_ALTER_in_alterUserStatement5224 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
	public static final BitSet FOLLOW_K_USER_in_alterUserStatement5226 = new BitSet(new long[]{0x0000000000100000L,0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_username_in_alterUserStatement5228 = new BitSet(new long[]{0x0000000000000002L,0x0000010000100000L,0x0000000000000004L});
	public static final BitSet FOLLOW_K_WITH_in_alterUserStatement5238 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_userOptions_in_alterUserStatement5240 = new BitSet(new long[]{0x0000000000000002L,0x0000010000100000L});
	public static final BitSet FOLLOW_K_SUPERUSER_in_alterUserStatement5254 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_NOSUPERUSER_in_alterUserStatement5260 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_DROP_in_dropUserStatement5305 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
	public static final BitSet FOLLOW_K_USER_in_dropUserStatement5307 = new BitSet(new long[]{0x0000000000100000L,0x0000000000000001L,0x0000000000010000L});
	public static final BitSet FOLLOW_K_IF_in_dropUserStatement5310 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_K_EXISTS_in_dropUserStatement5312 = new BitSet(new long[]{0x0000000000100000L,0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_username_in_dropUserStatement5318 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_LIST_in_listUsersStatement5343 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_K_USERS_in_listUsersStatement5345 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_userOption_in_userOptions5365 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_PASSWORD_in_userOption5386 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_userOption5390 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_cident5419 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QUOTED_NAME_in_cident5444 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unreserved_keyword_in_cident5463 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cfOrKsName_in_keyspaceName5496 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_idxOrKsName_in_indexName5530 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_160_in_indexName5533 = new BitSet(new long[]{0x4E73757142100000L,0xF6151BC43814DB48L,0x0000000000002008L});
	public static final BitSet FOLLOW_idxOrKsName_in_indexName5537 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_idxOrKsName5558 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QUOTED_NAME_in_idxOrKsName5583 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unreserved_keyword_in_idxOrKsName5602 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cfOrKsName_in_columnFamilyName5635 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_160_in_columnFamilyName5638 = new BitSet(new long[]{0x4E73757142100000L,0xF6151BC43814DB48L,0x0000000000002008L});
	public static final BitSet FOLLOW_cfOrKsName_in_columnFamilyName5642 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cident_in_userTypeName5667 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_160_in_userTypeName5669 = new BitSet(new long[]{0x4631150042100000L,0x261101C43814DB00L,0x0000000000002000L});
	public static final BitSet FOLLOW_non_type_ident_in_userTypeName5675 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_cfOrKsName5697 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QUOTED_NAME_in_cfOrKsName5722 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unreserved_keyword_in_cfOrKsName5741 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_constant5766 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTEGER_in_constant5778 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_constant5797 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOLEAN_in_constant5818 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UUID_in_constant5837 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HEXNUMBER_in_constant5859 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_159_in_constant5877 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020010L});
	public static final BitSet FOLLOW_set_in_constant5886 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_172_in_mapLiteral5915 = new BitSet(new long[]{0x4E73557142344040L,0xF6115BC43856DA58L,0x0000320288091000L});
	public static final BitSet FOLLOW_term_in_mapLiteral5933 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_161_in_mapLiteral5935 = new BitSet(new long[]{0x4E73557142344040L,0xF6115BC43856DA58L,0x0000120288091000L});
	public static final BitSet FOLLOW_term_in_mapLiteral5939 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000200040000000L});
	public static final BitSet FOLLOW_158_in_mapLiteral5945 = new BitSet(new long[]{0x4E73557142344040L,0xF6115BC43856DA58L,0x0000120288091000L});
	public static final BitSet FOLLOW_term_in_mapLiteral5949 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_161_in_mapLiteral5951 = new BitSet(new long[]{0x4E73557142344040L,0xF6115BC43856DA58L,0x0000120288091000L});
	public static final BitSet FOLLOW_term_in_mapLiteral5955 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000200040000000L});
	public static final BitSet FOLLOW_173_in_mapLiteral5971 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_161_in_setOrMapLiteral5995 = new BitSet(new long[]{0x4E73557142344040L,0xF6115BC43856DA58L,0x0000120288091000L});
	public static final BitSet FOLLOW_term_in_setOrMapLiteral5999 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_158_in_setOrMapLiteral6015 = new BitSet(new long[]{0x4E73557142344040L,0xF6115BC43856DA58L,0x0000120288091000L});
	public static final BitSet FOLLOW_term_in_setOrMapLiteral6019 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_161_in_setOrMapLiteral6021 = new BitSet(new long[]{0x4E73557142344040L,0xF6115BC43856DA58L,0x0000120288091000L});
	public static final BitSet FOLLOW_term_in_setOrMapLiteral6025 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_158_in_setOrMapLiteral6060 = new BitSet(new long[]{0x4E73557142344040L,0xF6115BC43856DA58L,0x0000120288091000L});
	public static final BitSet FOLLOW_term_in_setOrMapLiteral6064 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_169_in_collectionLiteral6098 = new BitSet(new long[]{0x4E73557142344040L,0xF6115BC43856DA58L,0x00001A0288091000L});
	public static final BitSet FOLLOW_term_in_collectionLiteral6116 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000080040000000L});
	public static final BitSet FOLLOW_158_in_collectionLiteral6122 = new BitSet(new long[]{0x4E73557142344040L,0xF6115BC43856DA58L,0x0000120288091000L});
	public static final BitSet FOLLOW_term_in_collectionLiteral6126 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000080040000000L});
	public static final BitSet FOLLOW_171_in_collectionLiteral6142 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_172_in_collectionLiteral6152 = new BitSet(new long[]{0x4E73557142344040L,0xF6115BC43856DA58L,0x0000120288091000L});
	public static final BitSet FOLLOW_term_in_collectionLiteral6156 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000200240000000L});
	public static final BitSet FOLLOW_setOrMapLiteral_in_collectionLiteral6160 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000200000000000L});
	public static final BitSet FOLLOW_173_in_collectionLiteral6165 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_172_in_collectionLiteral6183 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000200000000000L});
	public static final BitSet FOLLOW_173_in_collectionLiteral6185 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_172_in_usertypeLiteral6229 = new BitSet(new long[]{0x4E73757142100000L,0xF6151BC43814DB48L,0x0000000000002008L});
	public static final BitSet FOLLOW_cident_in_usertypeLiteral6233 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_161_in_usertypeLiteral6235 = new BitSet(new long[]{0x4E73557142344040L,0xF6115BC43856DA58L,0x0000120288091000L});
	public static final BitSet FOLLOW_term_in_usertypeLiteral6239 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000200040000000L});
	public static final BitSet FOLLOW_158_in_usertypeLiteral6245 = new BitSet(new long[]{0x4E73757142100000L,0xF6151BC43814DB48L,0x0000000000002008L});
	public static final BitSet FOLLOW_cident_in_usertypeLiteral6249 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_161_in_usertypeLiteral6251 = new BitSet(new long[]{0x4E73557142344040L,0xF6115BC43856DA58L,0x0000120288091000L});
	public static final BitSet FOLLOW_term_in_usertypeLiteral6255 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000200040000000L});
	public static final BitSet FOLLOW_173_in_usertypeLiteral6262 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_155_in_tupleLiteral6299 = new BitSet(new long[]{0x4E73557142344040L,0xF6115BC43856DA58L,0x0000120288091000L});
	public static final BitSet FOLLOW_term_in_tupleLiteral6303 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000050000000L});
	public static final BitSet FOLLOW_158_in_tupleLiteral6309 = new BitSet(new long[]{0x4E73557142344040L,0xF6115BC43856DA58L,0x0000120288091000L});
	public static final BitSet FOLLOW_term_in_tupleLiteral6313 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000050000000L});
	public static final BitSet FOLLOW_156_in_tupleLiteral6320 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constant_in_value6343 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_collectionLiteral_in_value6365 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_usertypeLiteral_in_value6378 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tupleLiteral_in_value6393 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_NULL_in_value6409 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_161_in_value6433 = new BitSet(new long[]{0x4E73757142100000L,0xF6151BC43814DB48L,0x0000000000002008L});
	public static final BitSet FOLLOW_cident_in_value6437 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QMARK_in_value6454 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTEGER_in_intValue6500 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_161_in_intValue6514 = new BitSet(new long[]{0x4E73757142100000L,0xF6151BC43814DB48L,0x0000000000002008L});
	public static final BitSet FOLLOW_cident_in_intValue6518 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QMARK_in_intValue6528 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_allowedFunctionName_in_functionName6561 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_allowedFunctionName_in_functionName6600 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
	public static final BitSet FOLLOW_162_in_functionName6602 = new BitSet(new long[]{0x4E73557142100000L,0xF6115BC43814DA48L});
	public static final BitSet FOLLOW_allowedFunctionName_in_functionName6606 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_allowedFunctionName6631 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unreserved_function_keyword_in_allowedFunctionName6665 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_TOKEN_in_allowedFunctionName6675 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_155_in_functionArgs6720 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_156_in_functionArgs6722 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_155_in_functionArgs6732 = new BitSet(new long[]{0x4E73557142344040L,0xF6115BC43856DA58L,0x0000120288091000L});
	public static final BitSet FOLLOW_term_in_functionArgs6736 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000050000000L});
	public static final BitSet FOLLOW_158_in_functionArgs6752 = new BitSet(new long[]{0x4E73557142344040L,0xF6115BC43856DA58L,0x0000120288091000L});
	public static final BitSet FOLLOW_term_in_functionArgs6756 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000050000000L});
	public static final BitSet FOLLOW_156_in_functionArgs6770 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_value_in_term6795 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionName_in_term6832 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_functionArgs_in_term6836 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_155_in_term6846 = new BitSet(new long[]{0x6E73757142100000L,0xF61D1BE43814DB48L,0x0000000000012008L});
	public static final BitSet FOLLOW_comparatorType_in_term6850 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_156_in_term6852 = new BitSet(new long[]{0x4E73557142344040L,0xF6115BC43856DA58L,0x0000120288091000L});
	public static final BitSet FOLLOW_term_in_term6856 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cident_in_columnOperation6879 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000024000000000L});
	public static final BitSet FOLLOW_columnOperationDifferentiator_in_columnOperation6881 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_166_in_columnOperationDifferentiator6904 = new BitSet(new long[]{0x4E73757142344040L,0xF6155BC43856DB58L,0x0000120288093008L});
	public static final BitSet FOLLOW_normalColumnOperation_in_columnOperationDifferentiator6906 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_169_in_columnOperationDifferentiator6915 = new BitSet(new long[]{0x4E73557142344040L,0xF6115BC43856DA58L,0x0000120288091000L});
	public static final BitSet FOLLOW_term_in_columnOperationDifferentiator6919 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_171_in_columnOperationDifferentiator6921 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
	public static final BitSet FOLLOW_specializedColumnOperation_in_columnOperationDifferentiator6923 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_term_in_normalColumnOperation6948 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_157_in_normalColumnOperation6951 = new BitSet(new long[]{0x4E73757142100000L,0xF6151BC43814DB48L,0x0000000000002008L});
	public static final BitSet FOLLOW_cident_in_normalColumnOperation6955 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cident_in_normalColumnOperation6976 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000A0000000L});
	public static final BitSet FOLLOW_set_in_normalColumnOperation6980 = new BitSet(new long[]{0x4E73557142344040L,0xF6115BC43856DA58L,0x0000120288091000L});
	public static final BitSet FOLLOW_term_in_normalColumnOperation6990 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cident_in_normalColumnOperation7008 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_INTEGER_in_normalColumnOperation7012 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_166_in_specializedColumnOperation7044 = new BitSet(new long[]{0x4E73557142344040L,0xF6115BC43856DA58L,0x0000120288091000L});
	public static final BitSet FOLLOW_term_in_specializedColumnOperation7048 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cident_in_columnCondition7081 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L,0x000003F004000000L});
	public static final BitSet FOLLOW_relationType_in_columnCondition7095 = new BitSet(new long[]{0x4E73557142344040L,0xF6115BC43856DA58L,0x0000120288091000L});
	public static final BitSet FOLLOW_term_in_columnCondition7099 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_IN_in_columnCondition7113 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000208001000L});
	public static final BitSet FOLLOW_singleColumnInValues_in_columnCondition7131 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_inMarker_in_columnCondition7151 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_169_in_columnCondition7179 = new BitSet(new long[]{0x4E73557142344040L,0xF6115BC43856DA58L,0x0000120288091000L});
	public static final BitSet FOLLOW_term_in_columnCondition7183 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_171_in_columnCondition7185 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L,0x000001F004000000L});
	public static final BitSet FOLLOW_relationType_in_columnCondition7203 = new BitSet(new long[]{0x4E73557142344040L,0xF6115BC43856DA58L,0x0000120288091000L});
	public static final BitSet FOLLOW_term_in_columnCondition7207 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_IN_in_columnCondition7225 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000208001000L});
	public static final BitSet FOLLOW_singleColumnInValues_in_columnCondition7247 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_inMarker_in_columnCondition7271 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_property_in_properties7333 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_K_AND_in_properties7337 = new BitSet(new long[]{0x4E73757142100000L,0xF6151BC43814DB48L,0x0000000000002008L});
	public static final BitSet FOLLOW_property_in_properties7339 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_cident_in_property7362 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
	public static final BitSet FOLLOW_166_in_property7364 = new BitSet(new long[]{0x4E73757142244040L,0xF6151BC43816DB58L,0x0000100080090008L});
	public static final BitSet FOLLOW_propertyValue_in_property7369 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_mapLiteral_in_property7398 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constant_in_propertyValue7427 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unreserved_keyword_in_propertyValue7449 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_166_in_relationType7472 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_164_in_relationType7483 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_165_in_relationType7494 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_167_in_relationType7504 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_168_in_relationType7515 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_154_in_relationType7525 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cident_in_relation7547 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000001F004000000L});
	public static final BitSet FOLLOW_relationType_in_relation7551 = new BitSet(new long[]{0x4E73557142344040L,0xF6115BC43856DA58L,0x0000120288091000L});
	public static final BitSet FOLLOW_term_in_relation7555 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_TOKEN_in_relation7565 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_tupleOfIdentifiers_in_relation7569 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000001F004000000L});
	public static final BitSet FOLLOW_relationType_in_relation7573 = new BitSet(new long[]{0x4E73557142344040L,0xF6115BC43856DA58L,0x0000120288091000L});
	public static final BitSet FOLLOW_term_in_relation7577 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cident_in_relation7597 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_K_IN_in_relation7599 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000200001000L});
	public static final BitSet FOLLOW_inMarker_in_relation7603 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cident_in_relation7623 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_K_IN_in_relation7625 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_singleColumnInValues_in_relation7629 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cident_in_relation7649 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_K_CONTAINS_in_relation7651 = new BitSet(new long[]{0x4E73557142344040L,0xF6115BC43856DB58L,0x0000120288091000L});
	public static final BitSet FOLLOW_K_KEY_in_relation7656 = new BitSet(new long[]{0x4E73557142344040L,0xF6115BC43856DA58L,0x0000120288091000L});
	public static final BitSet FOLLOW_term_in_relation7672 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tupleOfIdentifiers_in_relation7684 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L,0x000001F004000000L});
	public static final BitSet FOLLOW_K_IN_in_relation7694 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000208001000L});
	public static final BitSet FOLLOW_155_in_relation7708 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_156_in_relation7710 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_inMarkerForTuple_in_relation7742 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tupleOfTupleLiterals_in_relation7776 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tupleOfMarkersForTuples_in_relation7810 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_relationType_in_relation7852 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_tupleLiteral_in_relation7856 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_relationType_in_relation7882 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000200001000L});
	public static final BitSet FOLLOW_markerForTuple_in_relation7886 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_155_in_relation7916 = new BitSet(new long[]{0x4E73757142100000L,0xF6155BC43814DB48L,0x0000000008002008L});
	public static final BitSet FOLLOW_relation_in_relation7918 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_156_in_relation7921 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QMARK_in_inMarker7942 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_161_in_inMarker7952 = new BitSet(new long[]{0x4E73757142100000L,0xF6151BC43814DB48L,0x0000000000002008L});
	public static final BitSet FOLLOW_cident_in_inMarker7956 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_155_in_tupleOfIdentifiers7988 = new BitSet(new long[]{0x4E73757142100000L,0xF6151BC43814DB48L,0x0000000000002008L});
	public static final BitSet FOLLOW_cident_in_tupleOfIdentifiers7992 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000050000000L});
	public static final BitSet FOLLOW_158_in_tupleOfIdentifiers7997 = new BitSet(new long[]{0x4E73757142100000L,0xF6151BC43814DB48L,0x0000000000002008L});
	public static final BitSet FOLLOW_cident_in_tupleOfIdentifiers8001 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000050000000L});
	public static final BitSet FOLLOW_156_in_tupleOfIdentifiers8007 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_155_in_singleColumnInValues8037 = new BitSet(new long[]{0x4E73557142344040L,0xF6115BC43856DA58L,0x0000120298091000L});
	public static final BitSet FOLLOW_term_in_singleColumnInValues8045 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000050000000L});
	public static final BitSet FOLLOW_158_in_singleColumnInValues8050 = new BitSet(new long[]{0x4E73557142344040L,0xF6115BC43856DA58L,0x0000120288091000L});
	public static final BitSet FOLLOW_term_in_singleColumnInValues8054 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000050000000L});
	public static final BitSet FOLLOW_156_in_singleColumnInValues8063 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_155_in_tupleOfTupleLiterals8093 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_tupleLiteral_in_tupleOfTupleLiterals8097 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000050000000L});
	public static final BitSet FOLLOW_158_in_tupleOfTupleLiterals8102 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_tupleLiteral_in_tupleOfTupleLiterals8106 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000050000000L});
	public static final BitSet FOLLOW_156_in_tupleOfTupleLiterals8112 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QMARK_in_markerForTuple8133 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_161_in_markerForTuple8143 = new BitSet(new long[]{0x4E73757142100000L,0xF6151BC43814DB48L,0x0000000000002008L});
	public static final BitSet FOLLOW_cident_in_markerForTuple8147 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_155_in_tupleOfMarkersForTuples8179 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000200001000L});
	public static final BitSet FOLLOW_markerForTuple_in_tupleOfMarkersForTuples8183 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000050000000L});
	public static final BitSet FOLLOW_158_in_tupleOfMarkersForTuples8188 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000200001000L});
	public static final BitSet FOLLOW_markerForTuple_in_tupleOfMarkersForTuples8192 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000050000000L});
	public static final BitSet FOLLOW_156_in_tupleOfMarkersForTuples8198 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QMARK_in_inMarkerForTuple8219 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_161_in_inMarkerForTuple8229 = new BitSet(new long[]{0x4E73757142100000L,0xF6151BC43814DB48L,0x0000000000002008L});
	public static final BitSet FOLLOW_cident_in_inMarkerForTuple8233 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_native_type_in_comparatorType8258 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_collection_type_in_comparatorType8274 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tuple_type_in_comparatorType8286 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_userTypeName_in_comparatorType8302 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_FROZEN_in_comparatorType8314 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
	public static final BitSet FOLLOW_164_in_comparatorType8316 = new BitSet(new long[]{0x6E73757142100000L,0xF61D1BE43814DB48L,0x0000000000012008L});
	public static final BitSet FOLLOW_comparatorType_in_comparatorType8320 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_167_in_comparatorType8322 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_comparatorType8340 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_ASCII_in_native_type8369 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_BIGINT_in_native_type8383 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_BLOB_in_native_type8396 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_BOOLEAN_in_native_type8411 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_COUNTER_in_native_type8423 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_DECIMAL_in_native_type8435 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_DOUBLE_in_native_type8447 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_FLOAT_in_native_type8460 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_INET_in_native_type8474 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_INT_in_native_type8489 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_TEXT_in_native_type8505 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_TIMESTAMP_in_native_type8520 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_UUID_in_native_type8530 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_VARCHAR_in_native_type8545 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_VARINT_in_native_type8557 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_TIMEUUID_in_native_type8570 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_MAP_in_collection_type8594 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
	public static final BitSet FOLLOW_164_in_collection_type8597 = new BitSet(new long[]{0x6E73757142100000L,0xF61D1BE43814DB48L,0x0000000000012008L});
	public static final BitSet FOLLOW_comparatorType_in_collection_type8601 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_158_in_collection_type8603 = new BitSet(new long[]{0x6E73757142100000L,0xF61D1BE43814DB48L,0x0000000000012008L});
	public static final BitSet FOLLOW_comparatorType_in_collection_type8607 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_167_in_collection_type8609 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_LIST_in_collection_type8627 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
	public static final BitSet FOLLOW_164_in_collection_type8629 = new BitSet(new long[]{0x6E73757142100000L,0xF61D1BE43814DB48L,0x0000000000012008L});
	public static final BitSet FOLLOW_comparatorType_in_collection_type8633 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_167_in_collection_type8635 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_SET_in_collection_type8653 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
	public static final BitSet FOLLOW_164_in_collection_type8656 = new BitSet(new long[]{0x6E73757142100000L,0xF61D1BE43814DB48L,0x0000000000012008L});
	public static final BitSet FOLLOW_comparatorType_in_collection_type8660 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_167_in_collection_type8662 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_TUPLE_in_tuple_type8693 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
	public static final BitSet FOLLOW_164_in_tuple_type8695 = new BitSet(new long[]{0x6E73757142100000L,0xF61D1BE43814DB48L,0x0000000000012008L});
	public static final BitSet FOLLOW_comparatorType_in_tuple_type8710 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000008040000000L});
	public static final BitSet FOLLOW_158_in_tuple_type8715 = new BitSet(new long[]{0x6E73757142100000L,0xF61D1BE43814DB48L,0x0000000000012008L});
	public static final BitSet FOLLOW_comparatorType_in_tuple_type8719 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000008040000000L});
	public static final BitSet FOLLOW_167_in_tuple_type8731 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_non_type_ident8783 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QUOTED_NAME_in_non_type_ident8814 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_basic_unreserved_keyword_in_non_type_ident8839 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_K_KEY_in_non_type_ident8851 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unreserved_function_keyword_in_unreserved_keyword8894 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_unreserved_keyword8910 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_basic_unreserved_keyword_in_unreserved_function_keyword8949 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_native_type_in_unreserved_function_keyword8961 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_basic_unreserved_keyword8999 = new BitSet(new long[]{0x0000000000000002L});
}
