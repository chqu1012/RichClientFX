/*
 * generated by Xtext 2.17.0
 */
package de.dc.javafx.xcore.workbench.parser.antlr;

import com.google.inject.Inject;
import de.dc.javafx.xcore.workbench.parser.antlr.internal.InternalIdeDslParser;
import de.dc.javafx.xcore.workbench.services.IdeDslGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class IdeDslParser extends AbstractAntlrParser {

	@Inject
	private IdeDslGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalIdeDslParser createParser(XtextTokenStream stream) {
		return new InternalIdeDslParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "IdeContainer";
	}

	public IdeDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(IdeDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
