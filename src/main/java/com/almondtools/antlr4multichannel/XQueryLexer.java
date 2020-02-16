// Generated from XQueryLexer.g4 by ANTLR 4.7.2
package com.almondtools.antlr4multichannel;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class XQueryLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IntegerLiteral=1, DecimalLiteral=2, DoubleLiteral=3, PredefinedEntityRef=4, 
		CharRef=5, Quot=6, Apos=7, COMMENT=8, XMLDECL=9, PI=10, CDATA=11, PRAGMA=12, 
		WS=13, EQUAL=14, NOT_EQUAL=15, LPAREN=16, RPAREN=17, LBRACKET=18, RBRACKET=19, 
		LBRACE=20, RBRACE=21, STAR=22, PLUS=23, MINUS=24, COMMA=25, DOT=26, DDOT=27, 
		COLON=28, COLON_EQ=29, SEMICOLON=30, SLASH=31, DSLASH=32, VBAR=33, LANGLE=34, 
		RANGLE=35, QUESTION=36, AT=37, DOLLAR=38, KW_ANCESTOR=39, KW_ANCESTOR_OR_SELF=40, 
		KW_AND=41, KW_AS=42, KW_ASCENDING=43, KW_AT=44, KW_ATTRIBUTE=45, KW_BASE_URI=46, 
		KW_BOUNDARY_SPACE=47, KW_BY=48, KW_CASE=49, KW_CAST=50, KW_CASTABLE=51, 
		KW_CHILD=52, KW_COLLATION=53, KW_COMMENT=54, KW_CONSTRUCTION=55, KW_COPY_NS=56, 
		KW_DECLARE=57, KW_DEFAULT=58, KW_DESCENDANT=59, KW_DESCENDANT_OR_SELF=60, 
		KW_DESCENDING=61, KW_DIV=62, KW_DOCUMENT=63, KW_DOCUMENT_NODE=64, KW_ELEMENT=65, 
		KW_ELSE=66, KW_EMPTY=67, KW_EMPTY_SEQUENCE=68, KW_ENCODING=69, KW_EQ=70, 
		KW_EVERY=71, KW_EXCEPT=72, KW_EXTERNAL=73, KW_FOLLOWING=74, KW_FOLLOWING_SIBLING=75, 
		KW_FOR=76, KW_FUNCTION=77, KW_GE=78, KW_GREATEST=79, KW_GT=80, KW_IDIV=81, 
		KW_IF=82, KW_IMPORT=83, KW_IN=84, KW_INHERIT=85, KW_INSTANCE=86, KW_INTERSECT=87, 
		KW_IS=88, KW_ITEM=89, KW_LAX=90, KW_LE=91, KW_LEAST=92, KW_LET=93, KW_LT=94, 
		KW_MOD=95, KW_MODULE=96, KW_NAMESPACE=97, KW_NE=98, KW_NO_INHERIT=99, 
		KW_NO_PRESERVE=100, KW_NODE=101, KW_OF=102, KW_OPTION=103, KW_OR=104, 
		KW_ORDER=105, KW_ORDERED=106, KW_ORDERING=107, KW_PARENT=108, KW_PRECEDING=109, 
		KW_PRECEDING_SIBLING=110, KW_PRESERVE=111, KW_PI=112, KW_RETURN=113, KW_SATISFIES=114, 
		KW_SCHEMA=115, KW_SCHEMA_ATTR=116, KW_SCHEMA_ELEM=117, KW_SELF=118, KW_SOME=119, 
		KW_STABLE=120, KW_STRICT=121, KW_STRIP=122, KW_TEXT=123, KW_THEN=124, 
		KW_TO=125, KW_TREAT=126, KW_TYPESWITCH=127, KW_UNION=128, KW_UNORDERED=129, 
		KW_VALIDATE=130, KW_VARIABLE=131, KW_VERSION=132, KW_WHERE=133, KW_XQUERY=134, 
		FullQName=135, NCNameWithLocalWildcard=136, NCNameWithPrefixWildcard=137, 
		NCName=138, XQComment=139, ContentChar=140;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"IntegerLiteral", "DecimalLiteral", "DoubleLiteral", "Digits", "PredefinedEntityRef", 
			"CharRef", "Quot", "Apos", "COMMENT", "XMLDECL", "PI", "CDATA", "PRAGMA", 
			"WS", "EQUAL", "NOT_EQUAL", "LPAREN", "RPAREN", "LBRACKET", "RBRACKET", 
			"LBRACE", "RBRACE", "STAR", "PLUS", "MINUS", "COMMA", "DOT", "DDOT", 
			"COLON", "COLON_EQ", "SEMICOLON", "SLASH", "DSLASH", "VBAR", "LANGLE", 
			"RANGLE", "QUESTION", "AT", "DOLLAR", "KW_ANCESTOR", "KW_ANCESTOR_OR_SELF", 
			"KW_AND", "KW_AS", "KW_ASCENDING", "KW_AT", "KW_ATTRIBUTE", "KW_BASE_URI", 
			"KW_BOUNDARY_SPACE", "KW_BY", "KW_CASE", "KW_CAST", "KW_CASTABLE", "KW_CHILD", 
			"KW_COLLATION", "KW_COMMENT", "KW_CONSTRUCTION", "KW_COPY_NS", "KW_DECLARE", 
			"KW_DEFAULT", "KW_DESCENDANT", "KW_DESCENDANT_OR_SELF", "KW_DESCENDING", 
			"KW_DIV", "KW_DOCUMENT", "KW_DOCUMENT_NODE", "KW_ELEMENT", "KW_ELSE", 
			"KW_EMPTY", "KW_EMPTY_SEQUENCE", "KW_ENCODING", "KW_EQ", "KW_EVERY", 
			"KW_EXCEPT", "KW_EXTERNAL", "KW_FOLLOWING", "KW_FOLLOWING_SIBLING", "KW_FOR", 
			"KW_FUNCTION", "KW_GE", "KW_GREATEST", "KW_GT", "KW_IDIV", "KW_IF", "KW_IMPORT", 
			"KW_IN", "KW_INHERIT", "KW_INSTANCE", "KW_INTERSECT", "KW_IS", "KW_ITEM", 
			"KW_LAX", "KW_LE", "KW_LEAST", "KW_LET", "KW_LT", "KW_MOD", "KW_MODULE", 
			"KW_NAMESPACE", "KW_NE", "KW_NO_INHERIT", "KW_NO_PRESERVE", "KW_NODE", 
			"KW_OF", "KW_OPTION", "KW_OR", "KW_ORDER", "KW_ORDERED", "KW_ORDERING", 
			"KW_PARENT", "KW_PRECEDING", "KW_PRECEDING_SIBLING", "KW_PRESERVE", "KW_PI", 
			"KW_RETURN", "KW_SATISFIES", "KW_SCHEMA", "KW_SCHEMA_ATTR", "KW_SCHEMA_ELEM", 
			"KW_SELF", "KW_SOME", "KW_STABLE", "KW_STRICT", "KW_STRIP", "KW_TEXT", 
			"KW_THEN", "KW_TO", "KW_TREAT", "KW_TYPESWITCH", "KW_UNION", "KW_UNORDERED", 
			"KW_VALIDATE", "KW_VARIABLE", "KW_VERSION", "KW_WHERE", "KW_XQUERY", 
			"FullQName", "NCNameWithLocalWildcard", "NCNameWithPrefixWildcard", "NCName", 
			"NameStartChar", "NameChar", "XQComment", "ContentChar"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, "'\"'", "'''", null, null, null, 
			null, null, null, "'='", "'!='", "'('", "')'", "'['", "']'", "'{'", "'}'", 
			"'*'", "'+'", "'-'", "','", "'.'", "'..'", "':'", "':='", "';'", "'/'", 
			"'//'", "'|'", "'<'", "'>'", "'?'", "'@'", "'$'", "'ancestor'", "'ancestor-or-self'", 
			"'and'", "'as'", "'ascending'", "'at'", "'attribute'", "'base-uri'", 
			"'boundary-space'", "'by'", "'case'", "'cast'", "'castable'", "'child'", 
			"'collation'", "'comment'", "'construction'", "'copy-namespaces'", "'declare'", 
			"'default'", "'descendant'", "'descendant-or-self'", "'descending'", 
			"'div'", "'document'", "'document-node'", "'element'", "'else'", "'empty'", 
			"'empty-sequence'", "'encoding'", "'eq'", "'every'", "'except'", "'external'", 
			"'following'", "'following-sibling'", "'for'", "'function'", "'ge'", 
			"'greatest'", "'gt'", "'idiv'", "'if'", "'import'", "'in'", "'inherit'", 
			"'instance'", "'intersect'", "'is'", "'item'", "'lax'", "'le'", "'least'", 
			"'let'", "'lt'", "'mod'", "'module'", "'namespace'", "'ne'", "'no-inherit'", 
			"'no-preserve'", "'node'", "'of'", "'option'", "'or'", "'order'", "'ordered'", 
			"'ordering'", "'parent'", "'preceding'", "'preceding-sibling'", "'preserve'", 
			"'processing-instruction'", "'return'", "'satisfies'", "'schema'", "'schema-attribute'", 
			"'schema-element'", "'self'", "'some'", "'stable'", "'strict'", "'strip'", 
			"'text'", "'then'", "'to'", "'treat'", "'typeswitch'", "'union'", "'unordered'", 
			"'validate'", "'variable'", "'version'", "'where'", "'xquery'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IntegerLiteral", "DecimalLiteral", "DoubleLiteral", "PredefinedEntityRef", 
			"CharRef", "Quot", "Apos", "COMMENT", "XMLDECL", "PI", "CDATA", "PRAGMA", 
			"WS", "EQUAL", "NOT_EQUAL", "LPAREN", "RPAREN", "LBRACKET", "RBRACKET", 
			"LBRACE", "RBRACE", "STAR", "PLUS", "MINUS", "COMMA", "DOT", "DDOT", 
			"COLON", "COLON_EQ", "SEMICOLON", "SLASH", "DSLASH", "VBAR", "LANGLE", 
			"RANGLE", "QUESTION", "AT", "DOLLAR", "KW_ANCESTOR", "KW_ANCESTOR_OR_SELF", 
			"KW_AND", "KW_AS", "KW_ASCENDING", "KW_AT", "KW_ATTRIBUTE", "KW_BASE_URI", 
			"KW_BOUNDARY_SPACE", "KW_BY", "KW_CASE", "KW_CAST", "KW_CASTABLE", "KW_CHILD", 
			"KW_COLLATION", "KW_COMMENT", "KW_CONSTRUCTION", "KW_COPY_NS", "KW_DECLARE", 
			"KW_DEFAULT", "KW_DESCENDANT", "KW_DESCENDANT_OR_SELF", "KW_DESCENDING", 
			"KW_DIV", "KW_DOCUMENT", "KW_DOCUMENT_NODE", "KW_ELEMENT", "KW_ELSE", 
			"KW_EMPTY", "KW_EMPTY_SEQUENCE", "KW_ENCODING", "KW_EQ", "KW_EVERY", 
			"KW_EXCEPT", "KW_EXTERNAL", "KW_FOLLOWING", "KW_FOLLOWING_SIBLING", "KW_FOR", 
			"KW_FUNCTION", "KW_GE", "KW_GREATEST", "KW_GT", "KW_IDIV", "KW_IF", "KW_IMPORT", 
			"KW_IN", "KW_INHERIT", "KW_INSTANCE", "KW_INTERSECT", "KW_IS", "KW_ITEM", 
			"KW_LAX", "KW_LE", "KW_LEAST", "KW_LET", "KW_LT", "KW_MOD", "KW_MODULE", 
			"KW_NAMESPACE", "KW_NE", "KW_NO_INHERIT", "KW_NO_PRESERVE", "KW_NODE", 
			"KW_OF", "KW_OPTION", "KW_OR", "KW_ORDER", "KW_ORDERED", "KW_ORDERING", 
			"KW_PARENT", "KW_PRECEDING", "KW_PRECEDING_SIBLING", "KW_PRESERVE", "KW_PI", 
			"KW_RETURN", "KW_SATISFIES", "KW_SCHEMA", "KW_SCHEMA_ATTR", "KW_SCHEMA_ELEM", 
			"KW_SELF", "KW_SOME", "KW_STABLE", "KW_STRICT", "KW_STRIP", "KW_TEXT", 
			"KW_THEN", "KW_TO", "KW_TREAT", "KW_TYPESWITCH", "KW_UNION", "KW_UNORDERED", 
			"KW_VALIDATE", "KW_VARIABLE", "KW_VERSION", "KW_WHERE", "KW_XQUERY", 
			"FullQName", "NCNameWithLocalWildcard", "NCNameWithPrefixWildcard", "NCName", 
			"XQComment", "ContentChar"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public XQueryLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "XQueryLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\u008e\u053d\b\1\4"+
		"\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n"+
		"\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t"+
		"=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4"+
		"I\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\t"+
		"T\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_"+
		"\4`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k"+
		"\tk\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv"+
		"\4w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t"+
		"\u0080\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084"+
		"\4\u0085\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089"+
		"\t\u0089\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d"+
		"\4\u008e\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\3\2\3\2\3\3\3\3\3\3\3"+
		"\3\3\3\7\3\u0129\n\3\f\3\16\3\u012c\13\3\5\3\u012e\n\3\3\4\3\4\3\4\3\4"+
		"\3\4\7\4\u0135\n\4\f\4\16\4\u0138\13\4\5\4\u013a\n\4\5\4\u013c\n\4\3\4"+
		"\3\4\5\4\u0140\n\4\3\4\3\4\3\5\6\5\u0145\n\5\r\5\16\5\u0146\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0159\n\6\3"+
		"\6\3\6\3\7\3\7\3\7\3\7\6\7\u0161\n\7\r\7\16\7\u0162\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\6\7\u016b\n\7\r\7\16\7\u016c\3\7\5\7\u0170\n\7\3\b\3\b\3\t\3\t"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u017e\n\n\f\n\16\n\u0181\13\n\3\n"+
		"\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u018f\n\13\f"+
		"\13\16\13\u0192\13\13\5\13\u0194\n\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\7\f\u019f\n\f\f\f\16\f\u01a2\13\f\5\f\u01a4\n\f\3\f\3\f\3\f\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u01b4\n\r\f\r\16\r\u01b7"+
		"\13\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\5\16\u01c1\n\16\3\16\3\16\3"+
		"\16\5\16\u01c6\n\16\3\16\3\16\3\16\7\16\u01cb\n\16\f\16\16\16\u01ce\13"+
		"\16\5\16\u01d0\n\16\3\16\3\16\3\16\3\17\6\17\u01d6\n\17\r\17\16\17\u01d7"+
		"\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25"+
		"\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34"+
		"\3\34\3\35\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3\""+
		"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3*\3"+
		"*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3,\3,\3,\3"+
		"-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3"+
		"\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3"+
		"\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\63\3"+
		"\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3"+
		"\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3"+
		"\67\3\67\3\67\3\67\3\67\3\67\38\38\38\38\38\38\38\38\39\39\39\39\39\3"+
		"9\39\39\39\39\39\39\39\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3"+
		":\3;\3;\3;\3;\3;\3;\3;\3;\3<\3<\3<\3<\3<\3<\3<\3<\3=\3=\3=\3=\3=\3=\3"+
		"=\3=\3=\3=\3=\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3"+
		">\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3@\3@\3@\3@\3A\3A\3A\3A\3A\3A\3A\3"+
		"A\3A\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3C\3C\3C\3C\3C\3C\3C\3"+
		"C\3D\3D\3D\3D\3D\3E\3E\3E\3E\3E\3E\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3"+
		"F\3F\3F\3F\3G\3G\3G\3G\3G\3G\3G\3G\3G\3H\3H\3H\3I\3I\3I\3I\3I\3I\3J\3"+
		"J\3J\3J\3J\3J\3J\3K\3K\3K\3K\3K\3K\3K\3K\3K\3L\3L\3L\3L\3L\3L\3L\3L\3"+
		"L\3L\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3N\3N\3N\3"+
		"N\3O\3O\3O\3O\3O\3O\3O\3O\3O\3P\3P\3P\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3R\3"+
		"R\3R\3S\3S\3S\3S\3S\3T\3T\3T\3U\3U\3U\3U\3U\3U\3U\3V\3V\3V\3W\3W\3W\3"+
		"W\3W\3W\3W\3W\3X\3X\3X\3X\3X\3X\3X\3X\3X\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3"+
		"Y\3Z\3Z\3Z\3[\3[\3[\3[\3[\3\\\3\\\3\\\3\\\3]\3]\3]\3^\3^\3^\3^\3^\3^\3"+
		"_\3_\3_\3_\3`\3`\3`\3a\3a\3a\3a\3b\3b\3b\3b\3b\3b\3b\3c\3c\3c\3c\3c\3"+
		"c\3c\3c\3c\3c\3d\3d\3d\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3f\3f\3f\3f\3"+
		"f\3f\3f\3f\3f\3f\3f\3f\3g\3g\3g\3g\3g\3h\3h\3h\3i\3i\3i\3i\3i\3i\3i\3"+
		"j\3j\3j\3k\3k\3k\3k\3k\3k\3l\3l\3l\3l\3l\3l\3l\3l\3m\3m\3m\3m\3m\3m\3"+
		"m\3m\3m\3n\3n\3n\3n\3n\3n\3n\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3p\3p\3p\3"+
		"p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3q\3q\3q\3q\3q\3q\3q\3q\3"+
		"q\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3"+
		"r\3s\3s\3s\3s\3s\3s\3s\3t\3t\3t\3t\3t\3t\3t\3t\3t\3t\3u\3u\3u\3u\3u\3"+
		"u\3u\3v\3v\3v\3v\3v\3v\3v\3v\3v\3v\3v\3v\3v\3v\3v\3v\3v\3w\3w\3w\3w\3"+
		"w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3x\3x\3x\3x\3x\3y\3y\3y\3y\3y\3z\3z\3"+
		"z\3z\3z\3z\3z\3{\3{\3{\3{\3{\3{\3{\3|\3|\3|\3|\3|\3|\3}\3}\3}\3}\3}\3"+
		"~\3~\3~\3~\3~\3\177\3\177\3\177\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080"+
		"\3\u0080\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081"+
		"\3\u0081\3\u0081\3\u0081\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082"+
		"\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083"+
		"\3\u0083\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084"+
		"\3\u0084\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085"+
		"\3\u0085\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086"+
		"\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0088\3\u0088\3\u0088"+
		"\3\u0088\3\u0088\3\u0088\3\u0088\3\u0089\3\u0089\3\u0089\3\u0089\3\u008a"+
		"\3\u008a\3\u008a\3\u008a\3\u008b\3\u008b\3\u008b\3\u008b\3\u008c\3\u008c"+
		"\7\u008c\u051a\n\u008c\f\u008c\16\u008c\u051d\13\u008c\3\u008d\5\u008d"+
		"\u0520\n\u008d\3\u008e\3\u008e\5\u008e\u0524\n\u008e\3\u008f\3\u008f\3"+
		"\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\7\u008f\u052e\n\u008f\f"+
		"\u008f\16\u008f\u0531\13\u008f\3\u008f\6\u008f\u0534\n\u008f\r\u008f\16"+
		"\u008f\u0535\3\u008f\3\u008f\3\u008f\3\u008f\3\u0090\3\u0090\6\u0190\u01a0"+
		"\u01b5\u01cc\2\u0091\3\3\5\4\7\5\t\2\13\6\r\7\17\b\21\t\23\n\25\13\27"+
		"\f\31\r\33\16\35\17\37\20!\21#\22%\23\'\24)\25+\26-\27/\30\61\31\63\32"+
		"\65\33\67\349\35;\36=\37? A!C\"E#G$I%K&M\'O(Q)S*U+W,Y-[.]/_\60a\61c\62"+
		"e\63g\64i\65k\66m\67o8q9s:u;w<y={>}?\177@\u0081A\u0083B\u0085C\u0087D"+
		"\u0089E\u008bF\u008dG\u008fH\u0091I\u0093J\u0095K\u0097L\u0099M\u009b"+
		"N\u009dO\u009fP\u00a1Q\u00a3R\u00a5S\u00a7T\u00a9U\u00abV\u00adW\u00af"+
		"X\u00b1Y\u00b3Z\u00b5[\u00b7\\\u00b9]\u00bb^\u00bd_\u00bf`\u00c1a\u00c3"+
		"b\u00c5c\u00c7d\u00c9e\u00cbf\u00cdg\u00cfh\u00d1i\u00d3j\u00d5k\u00d7"+
		"l\u00d9m\u00dbn\u00ddo\u00dfp\u00e1q\u00e3r\u00e5s\u00e7t\u00e9u\u00eb"+
		"v\u00edw\u00efx\u00f1y\u00f3z\u00f5{\u00f7|\u00f9}\u00fb~\u00fd\177\u00ff"+
		"\u0080\u0101\u0081\u0103\u0082\u0105\u0083\u0107\u0084\u0109\u0085\u010b"+
		"\u0086\u010d\u0087\u010f\u0088\u0111\u0089\u0113\u008a\u0115\u008b\u0117"+
		"\u008c\u0119\2\u011b\2\u011d\u008d\u011f\u008e\3\2\21\3\2\62;\4\2GGgg"+
		"\4\2--//\5\2\62;CHch\3\2//\4\2ZZzz\4\2OOoo\4\2NNnn\5\2\13\f\17\17\"\""+
		"\20\2C\\aac|\u00c2\u00d8\u00da\u00f8\u00fa\u0301\u0372\u037f\u0381\u2001"+
		"\u200e\u200f\u2072\u2191\u2c02\u2ff1\u3003\ud801\uf902\ufdd1\ufdf2\uffff"+
		"\7\2/\60\62;\u00b9\u00b9\u0302\u0371\u2041\u2042\3\2<<\3\2++\4\2**<<\7"+
		"\2$$()>>}}\177\177\2\u055a\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2"+
		"\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2"+
		"9\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3"+
		"\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2"+
		"\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2"+
		"_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3"+
		"\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2"+
		"\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083"+
		"\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2"+
		"\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095"+
		"\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2"+
		"\2\2\u009f\3\2\2\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7"+
		"\3\2\2\2\2\u00a9\3\2\2\2\2\u00ab\3\2\2\2\2\u00ad\3\2\2\2\2\u00af\3\2\2"+
		"\2\2\u00b1\3\2\2\2\2\u00b3\3\2\2\2\2\u00b5\3\2\2\2\2\u00b7\3\2\2\2\2\u00b9"+
		"\3\2\2\2\2\u00bb\3\2\2\2\2\u00bd\3\2\2\2\2\u00bf\3\2\2\2\2\u00c1\3\2\2"+
		"\2\2\u00c3\3\2\2\2\2\u00c5\3\2\2\2\2\u00c7\3\2\2\2\2\u00c9\3\2\2\2\2\u00cb"+
		"\3\2\2\2\2\u00cd\3\2\2\2\2\u00cf\3\2\2\2\2\u00d1\3\2\2\2\2\u00d3\3\2\2"+
		"\2\2\u00d5\3\2\2\2\2\u00d7\3\2\2\2\2\u00d9\3\2\2\2\2\u00db\3\2\2\2\2\u00dd"+
		"\3\2\2\2\2\u00df\3\2\2\2\2\u00e1\3\2\2\2\2\u00e3\3\2\2\2\2\u00e5\3\2\2"+
		"\2\2\u00e7\3\2\2\2\2\u00e9\3\2\2\2\2\u00eb\3\2\2\2\2\u00ed\3\2\2\2\2\u00ef"+
		"\3\2\2\2\2\u00f1\3\2\2\2\2\u00f3\3\2\2\2\2\u00f5\3\2\2\2\2\u00f7\3\2\2"+
		"\2\2\u00f9\3\2\2\2\2\u00fb\3\2\2\2\2\u00fd\3\2\2\2\2\u00ff\3\2\2\2\2\u0101"+
		"\3\2\2\2\2\u0103\3\2\2\2\2\u0105\3\2\2\2\2\u0107\3\2\2\2\2\u0109\3\2\2"+
		"\2\2\u010b\3\2\2\2\2\u010d\3\2\2\2\2\u010f\3\2\2\2\2\u0111\3\2\2\2\2\u0113"+
		"\3\2\2\2\2\u0115\3\2\2\2\2\u0117\3\2\2\2\2\u011d\3\2\2\2\2\u011f\3\2\2"+
		"\2\3\u0121\3\2\2\2\5\u012d\3\2\2\2\7\u013b\3\2\2\2\t\u0144\3\2\2\2\13"+
		"\u0148\3\2\2\2\r\u016f\3\2\2\2\17\u0171\3\2\2\2\21\u0173\3\2\2\2\23\u0175"+
		"\3\2\2\2\25\u0186\3\2\2\2\27\u0198\3\2\2\2\31\u01a8\3\2\2\2\33\u01bc\3"+
		"\2\2\2\35\u01d5\3\2\2\2\37\u01db\3\2\2\2!\u01dd\3\2\2\2#\u01e0\3\2\2\2"+
		"%\u01e2\3\2\2\2\'\u01e4\3\2\2\2)\u01e6\3\2\2\2+\u01e8\3\2\2\2-\u01ea\3"+
		"\2\2\2/\u01ec\3\2\2\2\61\u01ee\3\2\2\2\63\u01f0\3\2\2\2\65\u01f2\3\2\2"+
		"\2\67\u01f4\3\2\2\29\u01f6\3\2\2\2;\u01f9\3\2\2\2=\u01fb\3\2\2\2?\u01fe"+
		"\3\2\2\2A\u0200\3\2\2\2C\u0202\3\2\2\2E\u0205\3\2\2\2G\u0207\3\2\2\2I"+
		"\u0209\3\2\2\2K\u020b\3\2\2\2M\u020d\3\2\2\2O\u020f\3\2\2\2Q\u0211\3\2"+
		"\2\2S\u021a\3\2\2\2U\u022b\3\2\2\2W\u022f\3\2\2\2Y\u0232\3\2\2\2[\u023c"+
		"\3\2\2\2]\u023f\3\2\2\2_\u0249\3\2\2\2a\u0252\3\2\2\2c\u0261\3\2\2\2e"+
		"\u0264\3\2\2\2g\u0269\3\2\2\2i\u026e\3\2\2\2k\u0277\3\2\2\2m\u027d\3\2"+
		"\2\2o\u0287\3\2\2\2q\u028f\3\2\2\2s\u029c\3\2\2\2u\u02ac\3\2\2\2w\u02b4"+
		"\3\2\2\2y\u02bc\3\2\2\2{\u02c7\3\2\2\2}\u02da\3\2\2\2\177\u02e5\3\2\2"+
		"\2\u0081\u02e9\3\2\2\2\u0083\u02f2\3\2\2\2\u0085\u0300\3\2\2\2\u0087\u0308"+
		"\3\2\2\2\u0089\u030d\3\2\2\2\u008b\u0313\3\2\2\2\u008d\u0322\3\2\2\2\u008f"+
		"\u032b\3\2\2\2\u0091\u032e\3\2\2\2\u0093\u0334\3\2\2\2\u0095\u033b\3\2"+
		"\2\2\u0097\u0344\3\2\2\2\u0099\u034e\3\2\2\2\u009b\u0360\3\2\2\2\u009d"+
		"\u0364\3\2\2\2\u009f\u036d\3\2\2\2\u00a1\u0370\3\2\2\2\u00a3\u0379\3\2"+
		"\2\2\u00a5\u037c\3\2\2\2\u00a7\u0381\3\2\2\2\u00a9\u0384\3\2\2\2\u00ab"+
		"\u038b\3\2\2\2\u00ad\u038e\3\2\2\2\u00af\u0396\3\2\2\2\u00b1\u039f\3\2"+
		"\2\2\u00b3\u03a9\3\2\2\2\u00b5\u03ac\3\2\2\2\u00b7\u03b1\3\2\2\2\u00b9"+
		"\u03b5\3\2\2\2\u00bb\u03b8\3\2\2\2\u00bd\u03be\3\2\2\2\u00bf\u03c2\3\2"+
		"\2\2\u00c1\u03c5\3\2\2\2\u00c3\u03c9\3\2\2\2\u00c5\u03d0\3\2\2\2\u00c7"+
		"\u03da\3\2\2\2\u00c9\u03dd\3\2\2\2\u00cb\u03e8\3\2\2\2\u00cd\u03f4\3\2"+
		"\2\2\u00cf\u03f9\3\2\2\2\u00d1\u03fc\3\2\2\2\u00d3\u0403\3\2\2\2\u00d5"+
		"\u0406\3\2\2\2\u00d7\u040c\3\2\2\2\u00d9\u0414\3\2\2\2\u00db\u041d\3\2"+
		"\2\2\u00dd\u0424\3\2\2\2\u00df\u042e\3\2\2\2\u00e1\u0440\3\2\2\2\u00e3"+
		"\u0449\3\2\2\2\u00e5\u0460\3\2\2\2\u00e7\u0467\3\2\2\2\u00e9\u0471\3\2"+
		"\2\2\u00eb\u0478\3\2\2\2\u00ed\u0489\3\2\2\2\u00ef\u0498\3\2\2\2\u00f1"+
		"\u049d\3\2\2\2\u00f3\u04a2\3\2\2\2\u00f5\u04a9\3\2\2\2\u00f7\u04b0\3\2"+
		"\2\2\u00f9\u04b6\3\2\2\2\u00fb\u04bb\3\2\2\2\u00fd\u04c0\3\2\2\2\u00ff"+
		"\u04c3\3\2\2\2\u0101\u04c9\3\2\2\2\u0103\u04d4\3\2\2\2\u0105\u04da\3\2"+
		"\2\2\u0107\u04e4\3\2\2\2\u0109\u04ed\3\2\2\2\u010b\u04f6\3\2\2\2\u010d"+
		"\u04fe\3\2\2\2\u010f\u0504\3\2\2\2\u0111\u050b\3\2\2\2\u0113\u050f\3\2"+
		"\2\2\u0115\u0513\3\2\2\2\u0117\u0517\3\2\2\2\u0119\u051f\3\2\2\2\u011b"+
		"\u0523\3\2\2\2\u011d\u0525\3\2\2\2\u011f\u053b\3\2\2\2\u0121\u0122\5\t"+
		"\5\2\u0122\4\3\2\2\2\u0123\u0124\7\60\2\2\u0124\u012e\5\t\5\2\u0125\u0126"+
		"\5\t\5\2\u0126\u012a\7\60\2\2\u0127\u0129\t\2\2\2\u0128\u0127\3\2\2\2"+
		"\u0129\u012c\3\2\2\2\u012a\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012e"+
		"\3\2\2\2\u012c\u012a\3\2\2\2\u012d\u0123\3\2\2\2\u012d\u0125\3\2\2\2\u012e"+
		"\6\3\2\2\2\u012f\u0130\7\60\2\2\u0130\u013c\5\t\5\2\u0131\u0139\5\t\5"+
		"\2\u0132\u0136\7\60\2\2\u0133\u0135\t\2\2\2\u0134\u0133\3\2\2\2\u0135"+
		"\u0138\3\2\2\2\u0136\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u013a\3\2"+
		"\2\2\u0138\u0136\3\2\2\2\u0139\u0132\3\2\2\2\u0139\u013a\3\2\2\2\u013a"+
		"\u013c\3\2\2\2\u013b\u012f\3\2\2\2\u013b\u0131\3\2\2\2\u013c\u013d\3\2"+
		"\2\2\u013d\u013f\t\3\2\2\u013e\u0140\t\4\2\2\u013f\u013e\3\2\2\2\u013f"+
		"\u0140\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u0142\5\t\5\2\u0142\b\3\2\2\2"+
		"\u0143\u0145\t\2\2\2\u0144\u0143\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0144"+
		"\3\2\2\2\u0146\u0147\3\2\2\2\u0147\n\3\2\2\2\u0148\u0158\7(\2\2\u0149"+
		"\u014a\7n\2\2\u014a\u0159\7v\2\2\u014b\u014c\7i\2\2\u014c\u0159\7v\2\2"+
		"\u014d\u014e\7c\2\2\u014e\u014f\7o\2\2\u014f\u0159\7r\2\2\u0150\u0151"+
		"\7s\2\2\u0151\u0152\7w\2\2\u0152\u0153\7q\2\2\u0153\u0159\7v\2\2\u0154"+
		"\u0155\7c\2\2\u0155\u0156\7r\2\2\u0156\u0157\7q\2\2\u0157\u0159\7u\2\2"+
		"\u0158\u0149\3\2\2\2\u0158\u014b\3\2\2\2\u0158\u014d\3\2\2\2\u0158\u0150"+
		"\3\2\2\2\u0158\u0154\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015b\7=\2\2\u015b"+
		"\f\3\2\2\2\u015c\u015d\7(\2\2\u015d\u015e\7%\2\2\u015e\u0160\3\2\2\2\u015f"+
		"\u0161\t\2\2\2\u0160\u015f\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0160\3\2"+
		"\2\2\u0162\u0163\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u0170\7=\2\2\u0165"+
		"\u0166\7(\2\2\u0166\u0167\7%\2\2\u0167\u0168\7z\2\2\u0168\u016a\3\2\2"+
		"\2\u0169\u016b\t\5\2\2\u016a\u0169\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u016a"+
		"\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u016e\3\2\2\2\u016e\u0170\7=\2\2\u016f"+
		"\u015c\3\2\2\2\u016f\u0165\3\2\2\2\u0170\16\3\2\2\2\u0171\u0172\7$\2\2"+
		"\u0172\20\3\2\2\2\u0173\u0174\7)\2\2\u0174\22\3\2\2\2\u0175\u0176\7>\2"+
		"\2\u0176\u0177\7#\2\2\u0177\u0178\7/\2\2\u0178\u0179\7/\2\2\u0179\u017f"+
		"\3\2\2\2\u017a\u017b\7/\2\2\u017b\u017e\n\6\2\2\u017c\u017e\n\6\2\2\u017d"+
		"\u017a\3\2\2\2\u017d\u017c\3\2\2\2\u017e\u0181\3\2\2\2\u017f\u017d\3\2"+
		"\2\2\u017f\u0180\3\2\2\2\u0180\u0182\3\2\2\2\u0181\u017f\3\2\2\2\u0182"+
		"\u0183\7/\2\2\u0183\u0184\7/\2\2\u0184\u0185\7@\2\2\u0185\24\3\2\2\2\u0186"+
		"\u0187\7>\2\2\u0187\u0188\7A\2\2\u0188\u0189\3\2\2\2\u0189\u018a\t\7\2"+
		"\2\u018a\u018b\t\b\2\2\u018b\u0193\t\t\2\2\u018c\u0190\t\n\2\2\u018d\u018f"+
		"\13\2\2\2\u018e\u018d\3\2\2\2\u018f\u0192\3\2\2\2\u0190\u0191\3\2\2\2"+
		"\u0190\u018e\3\2\2\2\u0191\u0194\3\2\2\2\u0192\u0190\3\2\2\2\u0193\u018c"+
		"\3\2\2\2\u0193\u0194\3\2\2\2\u0194\u0195\3\2\2\2\u0195\u0196\7A\2\2\u0196"+
		"\u0197\7@\2\2\u0197\26\3\2\2\2\u0198\u0199\7>\2\2\u0199\u019a\7A\2\2\u019a"+
		"\u019b\3\2\2\2\u019b\u01a3\5\u0117\u008c\2\u019c\u01a0\t\n\2\2\u019d\u019f"+
		"\13\2\2\2\u019e\u019d\3\2\2\2\u019f\u01a2\3\2\2\2\u01a0\u01a1\3\2\2\2"+
		"\u01a0\u019e\3\2\2\2\u01a1\u01a4\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a3\u019c"+
		"\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01a6\7A\2\2\u01a6"+
		"\u01a7\7@\2\2\u01a7\30\3\2\2\2\u01a8\u01a9\7>\2\2\u01a9\u01aa\7#\2\2\u01aa"+
		"\u01ab\7]\2\2\u01ab\u01ac\7E\2\2\u01ac\u01ad\7F\2\2\u01ad\u01ae\7C\2\2"+
		"\u01ae\u01af\7V\2\2\u01af\u01b0\7C\2\2\u01b0\u01b1\7]\2\2\u01b1\u01b5"+
		"\3\2\2\2\u01b2\u01b4\13\2\2\2\u01b3\u01b2\3\2\2\2\u01b4\u01b7\3\2\2\2"+
		"\u01b5\u01b6\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b6\u01b8\3\2\2\2\u01b7\u01b5"+
		"\3\2\2\2\u01b8\u01b9\7_\2\2\u01b9\u01ba\7_\2\2\u01ba\u01bb\7@\2\2\u01bb"+
		"\32\3\2\2\2\u01bc\u01bd\7*\2\2\u01bd\u01be\7%\2\2\u01be\u01c0\3\2\2\2"+
		"\u01bf\u01c1\5\35\17\2\u01c0\u01bf\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01c5"+
		"\3\2\2\2\u01c2\u01c3\5\u0117\u008c\2\u01c3\u01c4\7<\2\2\u01c4\u01c6\3"+
		"\2\2\2\u01c5\u01c2\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7"+
		"\u01cf\5\u0117\u008c\2\u01c8\u01cc\5\35\17\2\u01c9\u01cb\13\2\2\2\u01ca"+
		"\u01c9\3\2\2\2\u01cb\u01ce\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cc\u01ca\3\2"+
		"\2\2\u01cd\u01d0\3\2\2\2\u01ce\u01cc\3\2\2\2\u01cf\u01c8\3\2\2\2\u01cf"+
		"\u01d0\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1\u01d2\7%\2\2\u01d2\u01d3\7+\2"+
		"\2\u01d3\34\3\2\2\2\u01d4\u01d6\t\n\2\2\u01d5\u01d4\3\2\2\2\u01d6\u01d7"+
		"\3\2\2\2\u01d7\u01d5\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9"+
		"\u01da\b\17\2\2\u01da\36\3\2\2\2\u01db\u01dc\7?\2\2\u01dc \3\2\2\2\u01dd"+
		"\u01de\7#\2\2\u01de\u01df\7?\2\2\u01df\"\3\2\2\2\u01e0\u01e1\7*\2\2\u01e1"+
		"$\3\2\2\2\u01e2\u01e3\7+\2\2\u01e3&\3\2\2\2\u01e4\u01e5\7]\2\2\u01e5("+
		"\3\2\2\2\u01e6\u01e7\7_\2\2\u01e7*\3\2\2\2\u01e8\u01e9\7}\2\2\u01e9,\3"+
		"\2\2\2\u01ea\u01eb\7\177\2\2\u01eb.\3\2\2\2\u01ec\u01ed\7,\2\2\u01ed\60"+
		"\3\2\2\2\u01ee\u01ef\7-\2\2\u01ef\62\3\2\2\2\u01f0\u01f1\7/\2\2\u01f1"+
		"\64\3\2\2\2\u01f2\u01f3\7.\2\2\u01f3\66\3\2\2\2\u01f4\u01f5\7\60\2\2\u01f5"+
		"8\3\2\2\2\u01f6\u01f7\7\60\2\2\u01f7\u01f8\7\60\2\2\u01f8:\3\2\2\2\u01f9"+
		"\u01fa\7<\2\2\u01fa<\3\2\2\2\u01fb\u01fc\7<\2\2\u01fc\u01fd\7?\2\2\u01fd"+
		">\3\2\2\2\u01fe\u01ff\7=\2\2\u01ff@\3\2\2\2\u0200\u0201\7\61\2\2\u0201"+
		"B\3\2\2\2\u0202\u0203\7\61\2\2\u0203\u0204\7\61\2\2\u0204D\3\2\2\2\u0205"+
		"\u0206\7~\2\2\u0206F\3\2\2\2\u0207\u0208\7>\2\2\u0208H\3\2\2\2\u0209\u020a"+
		"\7@\2\2\u020aJ\3\2\2\2\u020b\u020c\7A\2\2\u020cL\3\2\2\2\u020d\u020e\7"+
		"B\2\2\u020eN\3\2\2\2\u020f\u0210\7&\2\2\u0210P\3\2\2\2\u0211\u0212\7c"+
		"\2\2\u0212\u0213\7p\2\2\u0213\u0214\7e\2\2\u0214\u0215\7g\2\2\u0215\u0216"+
		"\7u\2\2\u0216\u0217\7v\2\2\u0217\u0218\7q\2\2\u0218\u0219\7t\2\2\u0219"+
		"R\3\2\2\2\u021a\u021b\7c\2\2\u021b\u021c\7p\2\2\u021c\u021d\7e\2\2\u021d"+
		"\u021e\7g\2\2\u021e\u021f\7u\2\2\u021f\u0220\7v\2\2\u0220\u0221\7q\2\2"+
		"\u0221\u0222\7t\2\2\u0222\u0223\7/\2\2\u0223\u0224\7q\2\2\u0224\u0225"+
		"\7t\2\2\u0225\u0226\7/\2\2\u0226\u0227\7u\2\2\u0227\u0228\7g\2\2\u0228"+
		"\u0229\7n\2\2\u0229\u022a\7h\2\2\u022aT\3\2\2\2\u022b\u022c\7c\2\2\u022c"+
		"\u022d\7p\2\2\u022d\u022e\7f\2\2\u022eV\3\2\2\2\u022f\u0230\7c\2\2\u0230"+
		"\u0231\7u\2\2\u0231X\3\2\2\2\u0232\u0233\7c\2\2\u0233\u0234\7u\2\2\u0234"+
		"\u0235\7e\2\2\u0235\u0236\7g\2\2\u0236\u0237\7p\2\2\u0237\u0238\7f\2\2"+
		"\u0238\u0239\7k\2\2\u0239\u023a\7p\2\2\u023a\u023b\7i\2\2\u023bZ\3\2\2"+
		"\2\u023c\u023d\7c\2\2\u023d\u023e\7v\2\2\u023e\\\3\2\2\2\u023f\u0240\7"+
		"c\2\2\u0240\u0241\7v\2\2\u0241\u0242\7v\2\2\u0242\u0243\7t\2\2\u0243\u0244"+
		"\7k\2\2\u0244\u0245\7d\2\2\u0245\u0246\7w\2\2\u0246\u0247\7v\2\2\u0247"+
		"\u0248\7g\2\2\u0248^\3\2\2\2\u0249\u024a\7d\2\2\u024a\u024b\7c\2\2\u024b"+
		"\u024c\7u\2\2\u024c\u024d\7g\2\2\u024d\u024e\7/\2\2\u024e\u024f\7w\2\2"+
		"\u024f\u0250\7t\2\2\u0250\u0251\7k\2\2\u0251`\3\2\2\2\u0252\u0253\7d\2"+
		"\2\u0253\u0254\7q\2\2\u0254\u0255\7w\2\2\u0255\u0256\7p\2\2\u0256\u0257"+
		"\7f\2\2\u0257\u0258\7c\2\2\u0258\u0259\7t\2\2\u0259\u025a\7{\2\2\u025a"+
		"\u025b\7/\2\2\u025b\u025c\7u\2\2\u025c\u025d\7r\2\2\u025d\u025e\7c\2\2"+
		"\u025e\u025f\7e\2\2\u025f\u0260\7g\2\2\u0260b\3\2\2\2\u0261\u0262\7d\2"+
		"\2\u0262\u0263\7{\2\2\u0263d\3\2\2\2\u0264\u0265\7e\2\2\u0265\u0266\7"+
		"c\2\2\u0266\u0267\7u\2\2\u0267\u0268\7g\2\2\u0268f\3\2\2\2\u0269\u026a"+
		"\7e\2\2\u026a\u026b\7c\2\2\u026b\u026c\7u\2\2\u026c\u026d\7v\2\2\u026d"+
		"h\3\2\2\2\u026e\u026f\7e\2\2\u026f\u0270\7c\2\2\u0270\u0271\7u\2\2\u0271"+
		"\u0272\7v\2\2\u0272\u0273\7c\2\2\u0273\u0274\7d\2\2\u0274\u0275\7n\2\2"+
		"\u0275\u0276\7g\2\2\u0276j\3\2\2\2\u0277\u0278\7e\2\2\u0278\u0279\7j\2"+
		"\2\u0279\u027a\7k\2\2\u027a\u027b\7n\2\2\u027b\u027c\7f\2\2\u027cl\3\2"+
		"\2\2\u027d\u027e\7e\2\2\u027e\u027f\7q\2\2\u027f\u0280\7n\2\2\u0280\u0281"+
		"\7n\2\2\u0281\u0282\7c\2\2\u0282\u0283\7v\2\2\u0283\u0284\7k\2\2\u0284"+
		"\u0285\7q\2\2\u0285\u0286\7p\2\2\u0286n\3\2\2\2\u0287\u0288\7e\2\2\u0288"+
		"\u0289\7q\2\2\u0289\u028a\7o\2\2\u028a\u028b\7o\2\2\u028b\u028c\7g\2\2"+
		"\u028c\u028d\7p\2\2\u028d\u028e\7v\2\2\u028ep\3\2\2\2\u028f\u0290\7e\2"+
		"\2\u0290\u0291\7q\2\2\u0291\u0292\7p\2\2\u0292\u0293\7u\2\2\u0293\u0294"+
		"\7v\2\2\u0294\u0295\7t\2\2\u0295\u0296\7w\2\2\u0296\u0297\7e\2\2\u0297"+
		"\u0298\7v\2\2\u0298\u0299\7k\2\2\u0299\u029a\7q\2\2\u029a\u029b\7p\2\2"+
		"\u029br\3\2\2\2\u029c\u029d\7e\2\2\u029d\u029e\7q\2\2\u029e\u029f\7r\2"+
		"\2\u029f\u02a0\7{\2\2\u02a0\u02a1\7/\2\2\u02a1\u02a2\7p\2\2\u02a2\u02a3"+
		"\7c\2\2\u02a3\u02a4\7o\2\2\u02a4\u02a5\7g\2\2\u02a5\u02a6\7u\2\2\u02a6"+
		"\u02a7\7r\2\2\u02a7\u02a8\7c\2\2\u02a8\u02a9\7e\2\2\u02a9\u02aa\7g\2\2"+
		"\u02aa\u02ab\7u\2\2\u02abt\3\2\2\2\u02ac\u02ad\7f\2\2\u02ad\u02ae\7g\2"+
		"\2\u02ae\u02af\7e\2\2\u02af\u02b0\7n\2\2\u02b0\u02b1\7c\2\2\u02b1\u02b2"+
		"\7t\2\2\u02b2\u02b3\7g\2\2\u02b3v\3\2\2\2\u02b4\u02b5\7f\2\2\u02b5\u02b6"+
		"\7g\2\2\u02b6\u02b7\7h\2\2\u02b7\u02b8\7c\2\2\u02b8\u02b9\7w\2\2\u02b9"+
		"\u02ba\7n\2\2\u02ba\u02bb\7v\2\2\u02bbx\3\2\2\2\u02bc\u02bd\7f\2\2\u02bd"+
		"\u02be\7g\2\2\u02be\u02bf\7u\2\2\u02bf\u02c0\7e\2\2\u02c0\u02c1\7g\2\2"+
		"\u02c1\u02c2\7p\2\2\u02c2\u02c3\7f\2\2\u02c3\u02c4\7c\2\2\u02c4\u02c5"+
		"\7p\2\2\u02c5\u02c6\7v\2\2\u02c6z\3\2\2\2\u02c7\u02c8\7f\2\2\u02c8\u02c9"+
		"\7g\2\2\u02c9\u02ca\7u\2\2\u02ca\u02cb\7e\2\2\u02cb\u02cc\7g\2\2\u02cc"+
		"\u02cd\7p\2\2\u02cd\u02ce\7f\2\2\u02ce\u02cf\7c\2\2\u02cf\u02d0\7p\2\2"+
		"\u02d0\u02d1\7v\2\2\u02d1\u02d2\7/\2\2\u02d2\u02d3\7q\2\2\u02d3\u02d4"+
		"\7t\2\2\u02d4\u02d5\7/\2\2\u02d5\u02d6\7u\2\2\u02d6\u02d7\7g\2\2\u02d7"+
		"\u02d8\7n\2\2\u02d8\u02d9\7h\2\2\u02d9|\3\2\2\2\u02da\u02db\7f\2\2\u02db"+
		"\u02dc\7g\2\2\u02dc\u02dd\7u\2\2\u02dd\u02de\7e\2\2\u02de\u02df\7g\2\2"+
		"\u02df\u02e0\7p\2\2\u02e0\u02e1\7f\2\2\u02e1\u02e2\7k\2\2\u02e2\u02e3"+
		"\7p\2\2\u02e3\u02e4\7i\2\2\u02e4~\3\2\2\2\u02e5\u02e6\7f\2\2\u02e6\u02e7"+
		"\7k\2\2\u02e7\u02e8\7x\2\2\u02e8\u0080\3\2\2\2\u02e9\u02ea\7f\2\2\u02ea"+
		"\u02eb\7q\2\2\u02eb\u02ec\7e\2\2\u02ec\u02ed\7w\2\2\u02ed\u02ee\7o\2\2"+
		"\u02ee\u02ef\7g\2\2\u02ef\u02f0\7p\2\2\u02f0\u02f1\7v\2\2\u02f1\u0082"+
		"\3\2\2\2\u02f2\u02f3\7f\2\2\u02f3\u02f4\7q\2\2\u02f4\u02f5\7e\2\2\u02f5"+
		"\u02f6\7w\2\2\u02f6\u02f7\7o\2\2\u02f7\u02f8\7g\2\2\u02f8\u02f9\7p\2\2"+
		"\u02f9\u02fa\7v\2\2\u02fa\u02fb\7/\2\2\u02fb\u02fc\7p\2\2\u02fc\u02fd"+
		"\7q\2\2\u02fd\u02fe\7f\2\2\u02fe\u02ff\7g\2\2\u02ff\u0084\3\2\2\2\u0300"+
		"\u0301\7g\2\2\u0301\u0302\7n\2\2\u0302\u0303\7g\2\2\u0303\u0304\7o\2\2"+
		"\u0304\u0305\7g\2\2\u0305\u0306\7p\2\2\u0306\u0307\7v\2\2\u0307\u0086"+
		"\3\2\2\2\u0308\u0309\7g\2\2\u0309\u030a\7n\2\2\u030a\u030b\7u\2\2\u030b"+
		"\u030c\7g\2\2\u030c\u0088\3\2\2\2\u030d\u030e\7g\2\2\u030e\u030f\7o\2"+
		"\2\u030f\u0310\7r\2\2\u0310\u0311\7v\2\2\u0311\u0312\7{\2\2\u0312\u008a"+
		"\3\2\2\2\u0313\u0314\7g\2\2\u0314\u0315\7o\2\2\u0315\u0316\7r\2\2\u0316"+
		"\u0317\7v\2\2\u0317\u0318\7{\2\2\u0318\u0319\7/\2\2\u0319\u031a\7u\2\2"+
		"\u031a\u031b\7g\2\2\u031b\u031c\7s\2\2\u031c\u031d\7w\2\2\u031d\u031e"+
		"\7g\2\2\u031e\u031f\7p\2\2\u031f\u0320\7e\2\2\u0320\u0321\7g\2\2\u0321"+
		"\u008c\3\2\2\2\u0322\u0323\7g\2\2\u0323\u0324\7p\2\2\u0324\u0325\7e\2"+
		"\2\u0325\u0326\7q\2\2\u0326\u0327\7f\2\2\u0327\u0328\7k\2\2\u0328\u0329"+
		"\7p\2\2\u0329\u032a\7i\2\2\u032a\u008e\3\2\2\2\u032b\u032c\7g\2\2\u032c"+
		"\u032d\7s\2\2\u032d\u0090\3\2\2\2\u032e\u032f\7g\2\2\u032f\u0330\7x\2"+
		"\2\u0330\u0331\7g\2\2\u0331\u0332\7t\2\2\u0332\u0333\7{\2\2\u0333\u0092"+
		"\3\2\2\2\u0334\u0335\7g\2\2\u0335\u0336\7z\2\2\u0336\u0337\7e\2\2\u0337"+
		"\u0338\7g\2\2\u0338\u0339\7r\2\2\u0339\u033a\7v\2\2\u033a\u0094\3\2\2"+
		"\2\u033b\u033c\7g\2\2\u033c\u033d\7z\2\2\u033d\u033e\7v\2\2\u033e\u033f"+
		"\7g\2\2\u033f\u0340\7t\2\2\u0340\u0341\7p\2\2\u0341\u0342\7c\2\2\u0342"+
		"\u0343\7n\2\2\u0343\u0096\3\2\2\2\u0344\u0345\7h\2\2\u0345\u0346\7q\2"+
		"\2\u0346\u0347\7n\2\2\u0347\u0348\7n\2\2\u0348\u0349\7q\2\2\u0349\u034a"+
		"\7y\2\2\u034a\u034b\7k\2\2\u034b\u034c\7p\2\2\u034c\u034d\7i\2\2\u034d"+
		"\u0098\3\2\2\2\u034e\u034f\7h\2\2\u034f\u0350\7q\2\2\u0350\u0351\7n\2"+
		"\2\u0351\u0352\7n\2\2\u0352\u0353\7q\2\2\u0353\u0354\7y\2\2\u0354\u0355"+
		"\7k\2\2\u0355\u0356\7p\2\2\u0356\u0357\7i\2\2\u0357\u0358\7/\2\2\u0358"+
		"\u0359\7u\2\2\u0359\u035a\7k\2\2\u035a\u035b\7d\2\2\u035b\u035c\7n\2\2"+
		"\u035c\u035d\7k\2\2\u035d\u035e\7p\2\2\u035e\u035f\7i\2\2\u035f\u009a"+
		"\3\2\2\2\u0360\u0361\7h\2\2\u0361\u0362\7q\2\2\u0362\u0363\7t\2\2\u0363"+
		"\u009c\3\2\2\2\u0364\u0365\7h\2\2\u0365\u0366\7w\2\2\u0366\u0367\7p\2"+
		"\2\u0367\u0368\7e\2\2\u0368\u0369\7v\2\2\u0369\u036a\7k\2\2\u036a\u036b"+
		"\7q\2\2\u036b\u036c\7p\2\2\u036c\u009e\3\2\2\2\u036d\u036e\7i\2\2\u036e"+
		"\u036f\7g\2\2\u036f\u00a0\3\2\2\2\u0370\u0371\7i\2\2\u0371\u0372\7t\2"+
		"\2\u0372\u0373\7g\2\2\u0373\u0374\7c\2\2\u0374\u0375\7v\2\2\u0375\u0376"+
		"\7g\2\2\u0376\u0377\7u\2\2\u0377\u0378\7v\2\2\u0378\u00a2\3\2\2\2\u0379"+
		"\u037a\7i\2\2\u037a\u037b\7v\2\2\u037b\u00a4\3\2\2\2\u037c\u037d\7k\2"+
		"\2\u037d\u037e\7f\2\2\u037e\u037f\7k\2\2\u037f\u0380\7x\2\2\u0380\u00a6"+
		"\3\2\2\2\u0381\u0382\7k\2\2\u0382\u0383\7h\2\2\u0383\u00a8\3\2\2\2\u0384"+
		"\u0385\7k\2\2\u0385\u0386\7o\2\2\u0386\u0387\7r\2\2\u0387\u0388\7q\2\2"+
		"\u0388\u0389\7t\2\2\u0389\u038a\7v\2\2\u038a\u00aa\3\2\2\2\u038b\u038c"+
		"\7k\2\2\u038c\u038d\7p\2\2\u038d\u00ac\3\2\2\2\u038e\u038f\7k\2\2\u038f"+
		"\u0390\7p\2\2\u0390\u0391\7j\2\2\u0391\u0392\7g\2\2\u0392\u0393\7t\2\2"+
		"\u0393\u0394\7k\2\2\u0394\u0395\7v\2\2\u0395\u00ae\3\2\2\2\u0396\u0397"+
		"\7k\2\2\u0397\u0398\7p\2\2\u0398\u0399\7u\2\2\u0399\u039a\7v\2\2\u039a"+
		"\u039b\7c\2\2\u039b\u039c\7p\2\2\u039c\u039d\7e\2\2\u039d\u039e\7g\2\2"+
		"\u039e\u00b0\3\2\2\2\u039f\u03a0\7k\2\2\u03a0\u03a1\7p\2\2\u03a1\u03a2"+
		"\7v\2\2\u03a2\u03a3\7g\2\2\u03a3\u03a4\7t\2\2\u03a4\u03a5\7u\2\2\u03a5"+
		"\u03a6\7g\2\2\u03a6\u03a7\7e\2\2\u03a7\u03a8\7v\2\2\u03a8\u00b2\3\2\2"+
		"\2\u03a9\u03aa\7k\2\2\u03aa\u03ab\7u\2\2\u03ab\u00b4\3\2\2\2\u03ac\u03ad"+
		"\7k\2\2\u03ad\u03ae\7v\2\2\u03ae\u03af\7g\2\2\u03af\u03b0\7o\2\2\u03b0"+
		"\u00b6\3\2\2\2\u03b1\u03b2\7n\2\2\u03b2\u03b3\7c\2\2\u03b3\u03b4\7z\2"+
		"\2\u03b4\u00b8\3\2\2\2\u03b5\u03b6\7n\2\2\u03b6\u03b7\7g\2\2\u03b7\u00ba"+
		"\3\2\2\2\u03b8\u03b9\7n\2\2\u03b9\u03ba\7g\2\2\u03ba\u03bb\7c\2\2\u03bb"+
		"\u03bc\7u\2\2\u03bc\u03bd\7v\2\2\u03bd\u00bc\3\2\2\2\u03be\u03bf\7n\2"+
		"\2\u03bf\u03c0\7g\2\2\u03c0\u03c1\7v\2\2\u03c1\u00be\3\2\2\2\u03c2\u03c3"+
		"\7n\2\2\u03c3\u03c4\7v\2\2\u03c4\u00c0\3\2\2\2\u03c5\u03c6\7o\2\2\u03c6"+
		"\u03c7\7q\2\2\u03c7\u03c8\7f\2\2\u03c8\u00c2\3\2\2\2\u03c9\u03ca\7o\2"+
		"\2\u03ca\u03cb\7q\2\2\u03cb\u03cc\7f\2\2\u03cc\u03cd\7w\2\2\u03cd\u03ce"+
		"\7n\2\2\u03ce\u03cf\7g\2\2\u03cf\u00c4\3\2\2\2\u03d0\u03d1\7p\2\2\u03d1"+
		"\u03d2\7c\2\2\u03d2\u03d3\7o\2\2\u03d3\u03d4\7g\2\2\u03d4\u03d5\7u\2\2"+
		"\u03d5\u03d6\7r\2\2\u03d6\u03d7\7c\2\2\u03d7\u03d8\7e\2\2\u03d8\u03d9"+
		"\7g\2\2\u03d9\u00c6\3\2\2\2\u03da\u03db\7p\2\2\u03db\u03dc\7g\2\2\u03dc"+
		"\u00c8\3\2\2\2\u03dd\u03de\7p\2\2\u03de\u03df\7q\2\2\u03df\u03e0\7/\2"+
		"\2\u03e0\u03e1\7k\2\2\u03e1\u03e2\7p\2\2\u03e2\u03e3\7j\2\2\u03e3\u03e4"+
		"\7g\2\2\u03e4\u03e5\7t\2\2\u03e5\u03e6\7k\2\2\u03e6\u03e7\7v\2\2\u03e7"+
		"\u00ca\3\2\2\2\u03e8\u03e9\7p\2\2\u03e9\u03ea\7q\2\2\u03ea\u03eb\7/\2"+
		"\2\u03eb\u03ec\7r\2\2\u03ec\u03ed\7t\2\2\u03ed\u03ee\7g\2\2\u03ee\u03ef"+
		"\7u\2\2\u03ef\u03f0\7g\2\2\u03f0\u03f1\7t\2\2\u03f1\u03f2\7x\2\2\u03f2"+
		"\u03f3\7g\2\2\u03f3\u00cc\3\2\2\2\u03f4\u03f5\7p\2\2\u03f5\u03f6\7q\2"+
		"\2\u03f6\u03f7\7f\2\2\u03f7\u03f8\7g\2\2\u03f8\u00ce\3\2\2\2\u03f9\u03fa"+
		"\7q\2\2\u03fa\u03fb\7h\2\2\u03fb\u00d0\3\2\2\2\u03fc\u03fd\7q\2\2\u03fd"+
		"\u03fe\7r\2\2\u03fe\u03ff\7v\2\2\u03ff\u0400\7k\2\2\u0400\u0401\7q\2\2"+
		"\u0401\u0402\7p\2\2\u0402\u00d2\3\2\2\2\u0403\u0404\7q\2\2\u0404\u0405"+
		"\7t\2\2\u0405\u00d4\3\2\2\2\u0406\u0407\7q\2\2\u0407\u0408\7t\2\2\u0408"+
		"\u0409\7f\2\2\u0409\u040a\7g\2\2\u040a\u040b\7t\2\2\u040b\u00d6\3\2\2"+
		"\2\u040c\u040d\7q\2\2\u040d\u040e\7t\2\2\u040e\u040f\7f\2\2\u040f\u0410"+
		"\7g\2\2\u0410\u0411\7t\2\2\u0411\u0412\7g\2\2\u0412\u0413\7f\2\2\u0413"+
		"\u00d8\3\2\2\2\u0414\u0415\7q\2\2\u0415\u0416\7t\2\2\u0416\u0417\7f\2"+
		"\2\u0417\u0418\7g\2\2\u0418\u0419\7t\2\2\u0419\u041a\7k\2\2\u041a\u041b"+
		"\7p\2\2\u041b\u041c\7i\2\2\u041c\u00da\3\2\2\2\u041d\u041e\7r\2\2\u041e"+
		"\u041f\7c\2\2\u041f\u0420\7t\2\2\u0420\u0421\7g\2\2\u0421\u0422\7p\2\2"+
		"\u0422\u0423\7v\2\2\u0423\u00dc\3\2\2\2\u0424\u0425\7r\2\2\u0425\u0426"+
		"\7t\2\2\u0426\u0427\7g\2\2\u0427\u0428\7e\2\2\u0428\u0429\7g\2\2\u0429"+
		"\u042a\7f\2\2\u042a\u042b\7k\2\2\u042b\u042c\7p\2\2\u042c\u042d\7i\2\2"+
		"\u042d\u00de\3\2\2\2\u042e\u042f\7r\2\2\u042f\u0430\7t\2\2\u0430\u0431"+
		"\7g\2\2\u0431\u0432\7e\2\2\u0432\u0433\7g\2\2\u0433\u0434\7f\2\2\u0434"+
		"\u0435\7k\2\2\u0435\u0436\7p\2\2\u0436\u0437\7i\2\2\u0437\u0438\7/\2\2"+
		"\u0438\u0439\7u\2\2\u0439\u043a\7k\2\2\u043a\u043b\7d\2\2\u043b\u043c"+
		"\7n\2\2\u043c\u043d\7k\2\2\u043d\u043e\7p\2\2\u043e\u043f\7i\2\2\u043f"+
		"\u00e0\3\2\2\2\u0440\u0441\7r\2\2\u0441\u0442\7t\2\2\u0442\u0443\7g\2"+
		"\2\u0443\u0444\7u\2\2\u0444\u0445\7g\2\2\u0445\u0446\7t\2\2\u0446\u0447"+
		"\7x\2\2\u0447\u0448\7g\2\2\u0448\u00e2\3\2\2\2\u0449\u044a\7r\2\2\u044a"+
		"\u044b\7t\2\2\u044b\u044c\7q\2\2\u044c\u044d\7e\2\2\u044d\u044e\7g\2\2"+
		"\u044e\u044f\7u\2\2\u044f\u0450\7u\2\2\u0450\u0451\7k\2\2\u0451\u0452"+
		"\7p\2\2\u0452\u0453\7i\2\2\u0453\u0454\7/\2\2\u0454\u0455\7k\2\2\u0455"+
		"\u0456\7p\2\2\u0456\u0457\7u\2\2\u0457\u0458\7v\2\2\u0458\u0459\7t\2\2"+
		"\u0459\u045a\7w\2\2\u045a\u045b\7e\2\2\u045b\u045c\7v\2\2\u045c\u045d"+
		"\7k\2\2\u045d\u045e\7q\2\2\u045e\u045f\7p\2\2\u045f\u00e4\3\2\2\2\u0460"+
		"\u0461\7t\2\2\u0461\u0462\7g\2\2\u0462\u0463\7v\2\2\u0463\u0464\7w\2\2"+
		"\u0464\u0465\7t\2\2\u0465\u0466\7p\2\2\u0466\u00e6\3\2\2\2\u0467\u0468"+
		"\7u\2\2\u0468\u0469\7c\2\2\u0469\u046a\7v\2\2\u046a\u046b\7k\2\2\u046b"+
		"\u046c\7u\2\2\u046c\u046d\7h\2\2\u046d\u046e\7k\2\2\u046e\u046f\7g\2\2"+
		"\u046f\u0470\7u\2\2\u0470\u00e8\3\2\2\2\u0471\u0472\7u\2\2\u0472\u0473"+
		"\7e\2\2\u0473\u0474\7j\2\2\u0474\u0475\7g\2\2\u0475\u0476\7o\2\2\u0476"+
		"\u0477\7c\2\2\u0477\u00ea\3\2\2\2\u0478\u0479\7u\2\2\u0479\u047a\7e\2"+
		"\2\u047a\u047b\7j\2\2\u047b\u047c\7g\2\2\u047c\u047d\7o\2\2\u047d\u047e"+
		"\7c\2\2\u047e\u047f\7/\2\2\u047f\u0480\7c\2\2\u0480\u0481\7v\2\2\u0481"+
		"\u0482\7v\2\2\u0482\u0483\7t\2\2\u0483\u0484\7k\2\2\u0484\u0485\7d\2\2"+
		"\u0485\u0486\7w\2\2\u0486\u0487\7v\2\2\u0487\u0488\7g\2\2\u0488\u00ec"+
		"\3\2\2\2\u0489\u048a\7u\2\2\u048a\u048b\7e\2\2\u048b\u048c\7j\2\2\u048c"+
		"\u048d\7g\2\2\u048d\u048e\7o\2\2\u048e\u048f\7c\2\2\u048f\u0490\7/\2\2"+
		"\u0490\u0491\7g\2\2\u0491\u0492\7n\2\2\u0492\u0493\7g\2\2\u0493\u0494"+
		"\7o\2\2\u0494\u0495\7g\2\2\u0495\u0496\7p\2\2\u0496\u0497\7v\2\2\u0497"+
		"\u00ee\3\2\2\2\u0498\u0499\7u\2\2\u0499\u049a\7g\2\2\u049a\u049b\7n\2"+
		"\2\u049b\u049c\7h\2\2\u049c\u00f0\3\2\2\2\u049d\u049e\7u\2\2\u049e\u049f"+
		"\7q\2\2\u049f\u04a0\7o\2\2\u04a0\u04a1\7g\2\2\u04a1\u00f2\3\2\2\2\u04a2"+
		"\u04a3\7u\2\2\u04a3\u04a4\7v\2\2\u04a4\u04a5\7c\2\2\u04a5\u04a6\7d\2\2"+
		"\u04a6\u04a7\7n\2\2\u04a7\u04a8\7g\2\2\u04a8\u00f4\3\2\2\2\u04a9\u04aa"+
		"\7u\2\2\u04aa\u04ab\7v\2\2\u04ab\u04ac\7t\2\2\u04ac\u04ad\7k\2\2\u04ad"+
		"\u04ae\7e\2\2\u04ae\u04af\7v\2\2\u04af\u00f6\3\2\2\2\u04b0\u04b1\7u\2"+
		"\2\u04b1\u04b2\7v\2\2\u04b2\u04b3\7t\2\2\u04b3\u04b4\7k\2\2\u04b4\u04b5"+
		"\7r\2\2\u04b5\u00f8\3\2\2\2\u04b6\u04b7\7v\2\2\u04b7\u04b8\7g\2\2\u04b8"+
		"\u04b9\7z\2\2\u04b9\u04ba\7v\2\2\u04ba\u00fa\3\2\2\2\u04bb\u04bc\7v\2"+
		"\2\u04bc\u04bd\7j\2\2\u04bd\u04be\7g\2\2\u04be\u04bf\7p\2\2\u04bf\u00fc"+
		"\3\2\2\2\u04c0\u04c1\7v\2\2\u04c1\u04c2\7q\2\2\u04c2\u00fe\3\2\2\2\u04c3"+
		"\u04c4\7v\2\2\u04c4\u04c5\7t\2\2\u04c5\u04c6\7g\2\2\u04c6\u04c7\7c\2\2"+
		"\u04c7\u04c8\7v\2\2\u04c8\u0100\3\2\2\2\u04c9\u04ca\7v\2\2\u04ca\u04cb"+
		"\7{\2\2\u04cb\u04cc\7r\2\2\u04cc\u04cd\7g\2\2\u04cd\u04ce\7u\2\2\u04ce"+
		"\u04cf\7y\2\2\u04cf\u04d0\7k\2\2\u04d0\u04d1\7v\2\2\u04d1\u04d2\7e\2\2"+
		"\u04d2\u04d3\7j\2\2\u04d3\u0102\3\2\2\2\u04d4\u04d5\7w\2\2\u04d5\u04d6"+
		"\7p\2\2\u04d6\u04d7\7k\2\2\u04d7\u04d8\7q\2\2\u04d8\u04d9\7p\2\2\u04d9"+
		"\u0104\3\2\2\2\u04da\u04db\7w\2\2\u04db\u04dc\7p\2\2\u04dc\u04dd\7q\2"+
		"\2\u04dd\u04de\7t\2\2\u04de\u04df\7f\2\2\u04df\u04e0\7g\2\2\u04e0\u04e1"+
		"\7t\2\2\u04e1\u04e2\7g\2\2\u04e2\u04e3\7f\2\2\u04e3\u0106\3\2\2\2\u04e4"+
		"\u04e5\7x\2\2\u04e5\u04e6\7c\2\2\u04e6\u04e7\7n\2\2\u04e7\u04e8\7k\2\2"+
		"\u04e8\u04e9\7f\2\2\u04e9\u04ea\7c\2\2\u04ea\u04eb\7v\2\2\u04eb\u04ec"+
		"\7g\2\2\u04ec\u0108\3\2\2\2\u04ed\u04ee\7x\2\2\u04ee\u04ef\7c\2\2\u04ef"+
		"\u04f0\7t\2\2\u04f0\u04f1\7k\2\2\u04f1\u04f2\7c\2\2\u04f2\u04f3\7d\2\2"+
		"\u04f3\u04f4\7n\2\2\u04f4\u04f5\7g\2\2\u04f5\u010a\3\2\2\2\u04f6\u04f7"+
		"\7x\2\2\u04f7\u04f8\7g\2\2\u04f8\u04f9\7t\2\2\u04f9\u04fa\7u\2\2\u04fa"+
		"\u04fb\7k\2\2\u04fb\u04fc\7q\2\2\u04fc\u04fd\7p\2\2\u04fd\u010c\3\2\2"+
		"\2\u04fe\u04ff\7y\2\2\u04ff\u0500\7j\2\2\u0500\u0501\7g\2\2\u0501\u0502"+
		"\7t\2\2\u0502\u0503\7g\2\2\u0503\u010e\3\2\2\2\u0504\u0505\7z\2\2\u0505"+
		"\u0506\7s\2\2\u0506\u0507\7w\2\2\u0507\u0508\7g\2\2\u0508\u0509\7t\2\2"+
		"\u0509\u050a\7{\2\2\u050a\u0110\3\2\2\2\u050b\u050c\5\u0117\u008c\2\u050c"+
		"\u050d\7<\2\2\u050d\u050e\5\u0117\u008c\2\u050e\u0112\3\2\2\2\u050f\u0510"+
		"\5\u0117\u008c\2\u0510\u0511\7<\2\2\u0511\u0512\7,\2\2\u0512\u0114\3\2"+
		"\2\2\u0513\u0514\7,\2\2\u0514\u0515\7<\2\2\u0515\u0516\5\u0117\u008c\2"+
		"\u0516\u0116\3\2\2\2\u0517\u051b\5\u0119\u008d\2\u0518\u051a\5\u011b\u008e"+
		"\2\u0519\u0518\3\2\2\2\u051a\u051d\3\2\2\2\u051b\u0519\3\2\2\2\u051b\u051c"+
		"\3\2\2\2\u051c\u0118\3\2\2\2\u051d\u051b\3\2\2\2\u051e\u0520\t\13\2\2"+
		"\u051f\u051e\3\2\2\2\u0520\u011a\3\2\2\2\u0521\u0524\5\u0119\u008d\2\u0522"+
		"\u0524\t\f\2\2\u0523\u0521\3\2\2\2\u0523\u0522\3\2\2\2\u0524\u011c\3\2"+
		"\2\2\u0525\u0526\7*\2\2\u0526\u052f\7<\2\2\u0527\u052e\5\u011d\u008f\2"+
		"\u0528\u0529\7*\2\2\u0529\u052e\n\r\2\2\u052a\u052b\7<\2\2\u052b\u052e"+
		"\n\16\2\2\u052c\u052e\n\17\2\2\u052d\u0527\3\2\2\2\u052d\u0528\3\2\2\2"+
		"\u052d\u052a\3\2\2\2\u052d\u052c\3\2\2\2\u052e\u0531\3\2\2\2\u052f\u052d"+
		"\3\2\2\2\u052f\u0530\3\2\2\2\u0530\u0533\3\2\2\2\u0531\u052f\3\2\2\2\u0532"+
		"\u0534\7<\2\2\u0533\u0532\3\2\2\2\u0534\u0535\3\2\2\2\u0535\u0533\3\2"+
		"\2\2\u0535\u0536\3\2\2\2\u0536\u0537\3\2\2\2\u0537\u0538\7+\2\2\u0538"+
		"\u0539\3\2\2\2\u0539\u053a\b\u008f\2\2\u053a\u011e\3\2\2\2\u053b\u053c"+
		"\n\20\2\2\u053c\u0120\3\2\2\2 \2\u012a\u012d\u0136\u0139\u013b\u013f\u0146"+
		"\u0158\u0162\u016c\u016f\u017d\u017f\u0190\u0193\u01a0\u01a3\u01b5\u01c0"+
		"\u01c5\u01cc\u01cf\u01d7\u051b\u051f\u0523\u052d\u052f\u0535\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}