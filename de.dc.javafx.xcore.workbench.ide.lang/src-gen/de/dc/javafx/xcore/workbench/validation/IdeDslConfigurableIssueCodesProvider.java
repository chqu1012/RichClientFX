/*
 * generated by Xtext 2.17.0
 */
package de.dc.javafx.xcore.workbench.validation;

import org.eclipse.xtext.preferences.PreferenceKey;
import org.eclipse.xtext.util.IAcceptor;
import org.eclipse.xtext.validation.SeverityConverter;
import org.eclipse.xtext.xbase.validation.XbaseConfigurableIssueCodes;

@SuppressWarnings("restriction")
public class IdeDslConfigurableIssueCodesProvider extends XbaseConfigurableIssueCodes {
	protected static final String ISSUE_CODE_PREFIX = "de.dc.javafx.xcore.workbench.";

	public static final String DEPRECATED_MODEL_PART = ISSUE_CODE_PREFIX + "deprecatedModelPart";

	@Override
	protected void initialize(IAcceptor<PreferenceKey> acceptor) {
		super.initialize(acceptor);
		acceptor.accept(create(DEPRECATED_MODEL_PART, SeverityConverter.SEVERITY_WARNING));
	}
}
