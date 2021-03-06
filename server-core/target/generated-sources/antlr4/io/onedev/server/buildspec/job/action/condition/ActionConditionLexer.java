// Generated from io/onedev/server/buildspec/job/action/condition/ActionCondition.g4 by ANTLR 4.7.2
package io.onedev.server.buildspec.job.action.condition;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ActionConditionLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Always=1, Successful=2, Failed=3, Cancelled=4, TimedOut=5, PreviousIsSuccessful=6, 
		PreviousIsFailed=7, PreviousIsCancelled=8, PreviousIsTimedOut=9, OnBranch=10, 
		Contains=11, Is=12, IsEmpty=13, And=14, Or=15, Not=16, LParens=17, RParens=18, 
		Quoted=19, WS=20, Identifier=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"Always", "Successful", "Failed", "Cancelled", "TimedOut", "PreviousIsSuccessful", 
			"PreviousIsFailed", "PreviousIsCancelled", "PreviousIsTimedOut", "OnBranch", 
			"Contains", "Is", "IsEmpty", "And", "Or", "Not", "LParens", "RParens", 
			"Quoted", "WS", "Identifier"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'always'", "'successful'", "'failed'", "'cancelled'", null, null, 
			null, null, null, null, "'contains'", "'is'", null, "'and'", "'or'", 
			"'not'", "'('", "')'", null, "' '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Always", "Successful", "Failed", "Cancelled", "TimedOut", "PreviousIsSuccessful", 
			"PreviousIsFailed", "PreviousIsCancelled", "PreviousIsTimedOut", "OnBranch", 
			"Contains", "Is", "IsEmpty", "And", "Or", "Not", "LParens", "RParens", 
			"Quoted", "WS", "Identifier"
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


	public ActionConditionLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ActionCondition.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\27\u012b\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\6\6X\n\6\r\6\16\6Y\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\6\7j\n\7\r\7\16\7k\3\7\3\7\3\7\3\7\6\7r\n\7\r\7\16\7s\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\6\b\u008b\n\b\r\b\16\b\u008c\3\b\3\b\3\b\3\b\6\b\u0093\n\b\r"+
		"\b\16\b\u0094\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\6\t\u00a8\n\t\r\t\16\t\u00a9\3\t\3\t\3\t\3\t\6\t\u00b0\n"+
		"\t\r\t\16\t\u00b1\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\6\n\u00c8\n\n\r\n\16\n\u00c9\3\n\3\n\3\n"+
		"\3\n\6\n\u00d0\n\n\r\n\16\n\u00d1\3\n\3\n\3\n\3\n\3\n\3\n\3\n\6\n\u00db"+
		"\n\n\r\n\16\n\u00dc\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\6\13\u00e7\n\13"+
		"\r\13\16\13\u00e8\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\6\16\u0102\n\16\r\16"+
		"\16\16\u0103\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3"+
		"\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\24\6"+
		"\24\u011f\n\24\r\24\16\24\u0120\3\24\3\24\3\25\3\25\3\26\6\26\u0128\n"+
		"\26\r\26\16\26\u0129\3\u0120\2\27\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27\3\2\4\4"+
		"\2$$^^\t\2--//\61=C\\^^aac|\2\u0139\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
		"\2\2\2+\3\2\2\2\3-\3\2\2\2\5\64\3\2\2\2\7?\3\2\2\2\tF\3\2\2\2\13P\3\2"+
		"\2\2\r_\3\2\2\2\17\u0080\3\2\2\2\21\u009d\3\2\2\2\23\u00bd\3\2\2\2\25"+
		"\u00e2\3\2\2\2\27\u00f1\3\2\2\2\31\u00fa\3\2\2\2\33\u00fd\3\2\2\2\35\u010b"+
		"\3\2\2\2\37\u010f\3\2\2\2!\u0112\3\2\2\2#\u0116\3\2\2\2%\u0118\3\2\2\2"+
		"\'\u011a\3\2\2\2)\u0124\3\2\2\2+\u0127\3\2\2\2-.\7c\2\2./\7n\2\2/\60\7"+
		"y\2\2\60\61\7c\2\2\61\62\7{\2\2\62\63\7u\2\2\63\4\3\2\2\2\64\65\7u\2\2"+
		"\65\66\7w\2\2\66\67\7e\2\2\678\7e\2\289\7g\2\29:\7u\2\2:;\7u\2\2;<\7h"+
		"\2\2<=\7w\2\2=>\7n\2\2>\6\3\2\2\2?@\7h\2\2@A\7c\2\2AB\7k\2\2BC\7n\2\2"+
		"CD\7g\2\2DE\7f\2\2E\b\3\2\2\2FG\7e\2\2GH\7c\2\2HI\7p\2\2IJ\7e\2\2JK\7"+
		"g\2\2KL\7n\2\2LM\7n\2\2MN\7g\2\2NO\7f\2\2O\n\3\2\2\2PQ\7v\2\2QR\7k\2\2"+
		"RS\7o\2\2ST\7g\2\2TU\7f\2\2UW\3\2\2\2VX\5)\25\2WV\3\2\2\2XY\3\2\2\2YW"+
		"\3\2\2\2YZ\3\2\2\2Z[\3\2\2\2[\\\7q\2\2\\]\7w\2\2]^\7v\2\2^\f\3\2\2\2_"+
		"`\7r\2\2`a\7t\2\2ab\7g\2\2bc\7x\2\2cd\7k\2\2de\7q\2\2ef\7w\2\2fg\7u\2"+
		"\2gi\3\2\2\2hj\5)\25\2ih\3\2\2\2jk\3\2\2\2ki\3\2\2\2kl\3\2\2\2lm\3\2\2"+
		"\2mn\7k\2\2no\7u\2\2oq\3\2\2\2pr\5)\25\2qp\3\2\2\2rs\3\2\2\2sq\3\2\2\2"+
		"st\3\2\2\2tu\3\2\2\2uv\7u\2\2vw\7w\2\2wx\7e\2\2xy\7e\2\2yz\7g\2\2z{\7"+
		"u\2\2{|\7u\2\2|}\7h\2\2}~\7w\2\2~\177\7n\2\2\177\16\3\2\2\2\u0080\u0081"+
		"\7r\2\2\u0081\u0082\7t\2\2\u0082\u0083\7g\2\2\u0083\u0084\7x\2\2\u0084"+
		"\u0085\7k\2\2\u0085\u0086\7q\2\2\u0086\u0087\7w\2\2\u0087\u0088\7u\2\2"+
		"\u0088\u008a\3\2\2\2\u0089\u008b\5)\25\2\u008a\u0089\3\2\2\2\u008b\u008c"+
		"\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008e\3\2\2\2\u008e"+
		"\u008f\7k\2\2\u008f\u0090\7u\2\2\u0090\u0092\3\2\2\2\u0091\u0093\5)\25"+
		"\2\u0092\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095"+
		"\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0097\7h\2\2\u0097\u0098\7c\2\2\u0098"+
		"\u0099\7k\2\2\u0099\u009a\7n\2\2\u009a\u009b\7g\2\2\u009b\u009c\7f\2\2"+
		"\u009c\20\3\2\2\2\u009d\u009e\7r\2\2\u009e\u009f\7t\2\2\u009f\u00a0\7"+
		"g\2\2\u00a0\u00a1\7x\2\2\u00a1\u00a2\7k\2\2\u00a2\u00a3\7q\2\2\u00a3\u00a4"+
		"\7w\2\2\u00a4\u00a5\7u\2\2\u00a5\u00a7\3\2\2\2\u00a6\u00a8\5)\25\2\u00a7"+
		"\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2"+
		"\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac\7k\2\2\u00ac\u00ad\7u\2\2\u00ad\u00af"+
		"\3\2\2\2\u00ae\u00b0\5)\25\2\u00af\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1"+
		"\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4\7e"+
		"\2\2\u00b4\u00b5\7c\2\2\u00b5\u00b6\7p\2\2\u00b6\u00b7\7e\2\2\u00b7\u00b8"+
		"\7g\2\2\u00b8\u00b9\7n\2\2\u00b9\u00ba\7n\2\2\u00ba\u00bb\7g\2\2\u00bb"+
		"\u00bc\7f\2\2\u00bc\22\3\2\2\2\u00bd\u00be\7r\2\2\u00be\u00bf\7t\2\2\u00bf"+
		"\u00c0\7g\2\2\u00c0\u00c1\7x\2\2\u00c1\u00c2\7k\2\2\u00c2\u00c3\7q\2\2"+
		"\u00c3\u00c4\7w\2\2\u00c4\u00c5\7u\2\2\u00c5\u00c7\3\2\2\2\u00c6\u00c8"+
		"\5)\25\2\u00c7\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9"+
		"\u00ca\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cc\7k\2\2\u00cc\u00cd\7u\2"+
		"\2\u00cd\u00cf\3\2\2\2\u00ce\u00d0\5)\25\2\u00cf\u00ce\3\2\2\2\u00d0\u00d1"+
		"\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3"+
		"\u00d4\7v\2\2\u00d4\u00d5\7k\2\2\u00d5\u00d6\7o\2\2\u00d6\u00d7\7g\2\2"+
		"\u00d7\u00d8\7f\2\2\u00d8\u00da\3\2\2\2\u00d9\u00db\5)\25\2\u00da\u00d9"+
		"\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd"+
		"\u00de\3\2\2\2\u00de\u00df\7q\2\2\u00df\u00e0\7w\2\2\u00e0\u00e1\7v\2"+
		"\2\u00e1\24\3\2\2\2\u00e2\u00e3\7q\2\2\u00e3\u00e4\7p\2\2\u00e4\u00e6"+
		"\3\2\2\2\u00e5\u00e7\5)\25\2\u00e6\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8"+
		"\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00eb\7d"+
		"\2\2\u00eb\u00ec\7t\2\2\u00ec\u00ed\7c\2\2\u00ed\u00ee\7p\2\2\u00ee\u00ef"+
		"\7e\2\2\u00ef\u00f0\7j\2\2\u00f0\26\3\2\2\2\u00f1\u00f2\7e\2\2\u00f2\u00f3"+
		"\7q\2\2\u00f3\u00f4\7p\2\2\u00f4\u00f5\7v\2\2\u00f5\u00f6\7c\2\2\u00f6"+
		"\u00f7\7k\2\2\u00f7\u00f8\7p\2\2\u00f8\u00f9\7u\2\2\u00f9\30\3\2\2\2\u00fa"+
		"\u00fb\7k\2\2\u00fb\u00fc\7u\2\2\u00fc\32\3\2\2\2\u00fd\u00fe\7k\2\2\u00fe"+
		"\u00ff\7u\2\2\u00ff\u0101\3\2\2\2\u0100\u0102\5)\25\2\u0101\u0100\3\2"+
		"\2\2\u0102\u0103\3\2\2\2\u0103\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104"+
		"\u0105\3\2\2\2\u0105\u0106\7g\2\2\u0106\u0107\7o\2\2\u0107\u0108\7r\2"+
		"\2\u0108\u0109\7v\2\2\u0109\u010a\7{\2\2\u010a\34\3\2\2\2\u010b\u010c"+
		"\7c\2\2\u010c\u010d\7p\2\2\u010d\u010e\7f\2\2\u010e\36\3\2\2\2\u010f\u0110"+
		"\7q\2\2\u0110\u0111\7t\2\2\u0111 \3\2\2\2\u0112\u0113\7p\2\2\u0113\u0114"+
		"\7q\2\2\u0114\u0115\7v\2\2\u0115\"\3\2\2\2\u0116\u0117\7*\2\2\u0117$\3"+
		"\2\2\2\u0118\u0119\7+\2\2\u0119&\3\2\2\2\u011a\u011e\7$\2\2\u011b\u011c"+
		"\7^\2\2\u011c\u011f\13\2\2\2\u011d\u011f\n\2\2\2\u011e\u011b\3\2\2\2\u011e"+
		"\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0121\3\2\2\2\u0120\u011e\3\2"+
		"\2\2\u0121\u0122\3\2\2\2\u0122\u0123\7$\2\2\u0123(\3\2\2\2\u0124\u0125"+
		"\7\"\2\2\u0125*\3\2\2\2\u0126\u0128\t\3\2\2\u0127\u0126\3\2\2\2\u0128"+
		"\u0129\3\2\2\2\u0129\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a,\3\2\2\2"+
		"\22\2Yks\u008c\u0094\u00a9\u00b1\u00c9\u00d1\u00dc\u00e8\u0103\u011e\u0120"+
		"\u0129\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}