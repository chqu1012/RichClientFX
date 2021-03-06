/*
 * generated by Xtext 2.17.0
 */
package de.dc.javafx.xcore.lang.edit.serializer;

import com.google.inject.Inject;
import de.dc.javafx.xcore.lang.edit.services.EmfSupportDslGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class EmfSupportDslSyntacticSequencer extends AbstractSyntacticSequencer {

	protected EmfSupportDslGrammarAccess grammarAccess;
	protected AbstractElementAlias match_AddContextMenu_CommaKeyword_10_q;
	protected AbstractElementAlias match_AddContextMenu_CommaKeyword_4_q;
	protected AbstractElementAlias match_AddContextMenu_CommaKeyword_7_q;
	protected AbstractElementAlias match_CopyContextMenu_CommaKeyword_4_q;
	protected AbstractElementAlias match_Ecore_CommaKeyword_12_q;
	protected AbstractElementAlias match_Ecore_CommaKeyword_15_q;
	protected AbstractElementAlias match_Ecore_CommaKeyword_18_q;
	protected AbstractElementAlias match_Ecore_CommaKeyword_21_q;
	protected AbstractElementAlias match_Ecore_CommaKeyword_24_q;
	protected AbstractElementAlias match_Ecore_CommaKeyword_27_q;
	protected AbstractElementAlias match_Ecore_CommaKeyword_30_q;
	protected AbstractElementAlias match_Ecore_CommaKeyword_31_3_q;
	protected AbstractElementAlias match_Ecore_CommaKeyword_32_3_q;
	protected AbstractElementAlias match_Ecore_CommaKeyword_33_3_q;
	protected AbstractElementAlias match_Ecore_CommaKeyword_6_q;
	protected AbstractElementAlias match_Ecore_CommaKeyword_9_q;
	protected AbstractElementAlias match_ListViewFX_CommaKeyword_4_q;
	protected AbstractElementAlias match_TableViewFX_CommaKeyword_4_q;
	protected AbstractElementAlias match_TreeViewFX_CommaKeyword_4_q;
	protected AbstractElementAlias match_XAnnotation___LeftParenthesisKeyword_3_0_RightParenthesisKeyword_3_2__q;
	protected AbstractElementAlias match_XBlockExpression_SemicolonKeyword_2_1_q;
	protected AbstractElementAlias match_XExpressionInClosure_SemicolonKeyword_1_1_q;
	protected AbstractElementAlias match_XFunctionTypeRef___LeftParenthesisKeyword_0_0_RightParenthesisKeyword_0_2__q;
	protected AbstractElementAlias match_XImportDeclaration_SemicolonKeyword_2_q;
	protected AbstractElementAlias match_XParenthesizedExpression_LeftParenthesisKeyword_0_a;
	protected AbstractElementAlias match_XParenthesizedExpression_LeftParenthesisKeyword_0_p;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (EmfSupportDslGrammarAccess) access;
		match_AddContextMenu_CommaKeyword_10_q = new TokenAlias(false, true, grammarAccess.getAddContextMenuAccess().getCommaKeyword_10());
		match_AddContextMenu_CommaKeyword_4_q = new TokenAlias(false, true, grammarAccess.getAddContextMenuAccess().getCommaKeyword_4());
		match_AddContextMenu_CommaKeyword_7_q = new TokenAlias(false, true, grammarAccess.getAddContextMenuAccess().getCommaKeyword_7());
		match_CopyContextMenu_CommaKeyword_4_q = new TokenAlias(false, true, grammarAccess.getCopyContextMenuAccess().getCommaKeyword_4());
		match_Ecore_CommaKeyword_12_q = new TokenAlias(false, true, grammarAccess.getEcoreAccess().getCommaKeyword_12());
		match_Ecore_CommaKeyword_15_q = new TokenAlias(false, true, grammarAccess.getEcoreAccess().getCommaKeyword_15());
		match_Ecore_CommaKeyword_18_q = new TokenAlias(false, true, grammarAccess.getEcoreAccess().getCommaKeyword_18());
		match_Ecore_CommaKeyword_21_q = new TokenAlias(false, true, grammarAccess.getEcoreAccess().getCommaKeyword_21());
		match_Ecore_CommaKeyword_24_q = new TokenAlias(false, true, grammarAccess.getEcoreAccess().getCommaKeyword_24());
		match_Ecore_CommaKeyword_27_q = new TokenAlias(false, true, grammarAccess.getEcoreAccess().getCommaKeyword_27());
		match_Ecore_CommaKeyword_30_q = new TokenAlias(false, true, grammarAccess.getEcoreAccess().getCommaKeyword_30());
		match_Ecore_CommaKeyword_31_3_q = new TokenAlias(false, true, grammarAccess.getEcoreAccess().getCommaKeyword_31_3());
		match_Ecore_CommaKeyword_32_3_q = new TokenAlias(false, true, grammarAccess.getEcoreAccess().getCommaKeyword_32_3());
		match_Ecore_CommaKeyword_33_3_q = new TokenAlias(false, true, grammarAccess.getEcoreAccess().getCommaKeyword_33_3());
		match_Ecore_CommaKeyword_6_q = new TokenAlias(false, true, grammarAccess.getEcoreAccess().getCommaKeyword_6());
		match_Ecore_CommaKeyword_9_q = new TokenAlias(false, true, grammarAccess.getEcoreAccess().getCommaKeyword_9());
		match_ListViewFX_CommaKeyword_4_q = new TokenAlias(false, true, grammarAccess.getListViewFXAccess().getCommaKeyword_4());
		match_TableViewFX_CommaKeyword_4_q = new TokenAlias(false, true, grammarAccess.getTableViewFXAccess().getCommaKeyword_4());
		match_TreeViewFX_CommaKeyword_4_q = new TokenAlias(false, true, grammarAccess.getTreeViewFXAccess().getCommaKeyword_4());
		match_XAnnotation___LeftParenthesisKeyword_3_0_RightParenthesisKeyword_3_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getXAnnotationAccess().getLeftParenthesisKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getXAnnotationAccess().getRightParenthesisKeyword_3_2()));
		match_XBlockExpression_SemicolonKeyword_2_1_q = new TokenAlias(false, true, grammarAccess.getXBlockExpressionAccess().getSemicolonKeyword_2_1());
		match_XExpressionInClosure_SemicolonKeyword_1_1_q = new TokenAlias(false, true, grammarAccess.getXExpressionInClosureAccess().getSemicolonKeyword_1_1());
		match_XFunctionTypeRef___LeftParenthesisKeyword_0_0_RightParenthesisKeyword_0_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getXFunctionTypeRefAccess().getLeftParenthesisKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getXFunctionTypeRefAccess().getRightParenthesisKeyword_0_2()));
		match_XImportDeclaration_SemicolonKeyword_2_q = new TokenAlias(false, true, grammarAccess.getXImportDeclarationAccess().getSemicolonKeyword_2());
		match_XParenthesizedExpression_LeftParenthesisKeyword_0_a = new TokenAlias(true, true, grammarAccess.getXParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
		match_XParenthesizedExpression_LeftParenthesisKeyword_0_p = new TokenAlias(true, false, grammarAccess.getXParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getArrayBracketsRule())
			return getArrayBracketsToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getOpSingleAssignRule())
			return getOpSingleAssignToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * ArrayBrackets :
	 * 	'[' ']'
	 * ;
	 */
	protected String getArrayBracketsToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "[]";
	}
	
	/**
	 * OpSingleAssign:
	 * 	'='
	 * ;
	 */
	protected String getOpSingleAssignToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "=";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_AddContextMenu_CommaKeyword_10_q.equals(syntax))
				emit_AddContextMenu_CommaKeyword_10_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_AddContextMenu_CommaKeyword_4_q.equals(syntax))
				emit_AddContextMenu_CommaKeyword_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_AddContextMenu_CommaKeyword_7_q.equals(syntax))
				emit_AddContextMenu_CommaKeyword_7_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_CopyContextMenu_CommaKeyword_4_q.equals(syntax))
				emit_CopyContextMenu_CommaKeyword_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Ecore_CommaKeyword_12_q.equals(syntax))
				emit_Ecore_CommaKeyword_12_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Ecore_CommaKeyword_15_q.equals(syntax))
				emit_Ecore_CommaKeyword_15_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Ecore_CommaKeyword_18_q.equals(syntax))
				emit_Ecore_CommaKeyword_18_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Ecore_CommaKeyword_21_q.equals(syntax))
				emit_Ecore_CommaKeyword_21_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Ecore_CommaKeyword_24_q.equals(syntax))
				emit_Ecore_CommaKeyword_24_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Ecore_CommaKeyword_27_q.equals(syntax))
				emit_Ecore_CommaKeyword_27_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Ecore_CommaKeyword_30_q.equals(syntax))
				emit_Ecore_CommaKeyword_30_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Ecore_CommaKeyword_31_3_q.equals(syntax))
				emit_Ecore_CommaKeyword_31_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Ecore_CommaKeyword_32_3_q.equals(syntax))
				emit_Ecore_CommaKeyword_32_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Ecore_CommaKeyword_33_3_q.equals(syntax))
				emit_Ecore_CommaKeyword_33_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Ecore_CommaKeyword_6_q.equals(syntax))
				emit_Ecore_CommaKeyword_6_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Ecore_CommaKeyword_9_q.equals(syntax))
				emit_Ecore_CommaKeyword_9_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_ListViewFX_CommaKeyword_4_q.equals(syntax))
				emit_ListViewFX_CommaKeyword_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_TableViewFX_CommaKeyword_4_q.equals(syntax))
				emit_TableViewFX_CommaKeyword_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_TreeViewFX_CommaKeyword_4_q.equals(syntax))
				emit_TreeViewFX_CommaKeyword_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_XAnnotation___LeftParenthesisKeyword_3_0_RightParenthesisKeyword_3_2__q.equals(syntax))
				emit_XAnnotation___LeftParenthesisKeyword_3_0_RightParenthesisKeyword_3_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_XBlockExpression_SemicolonKeyword_2_1_q.equals(syntax))
				emit_XBlockExpression_SemicolonKeyword_2_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_XExpressionInClosure_SemicolonKeyword_1_1_q.equals(syntax))
				emit_XExpressionInClosure_SemicolonKeyword_1_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_XFunctionTypeRef___LeftParenthesisKeyword_0_0_RightParenthesisKeyword_0_2__q.equals(syntax))
				emit_XFunctionTypeRef___LeftParenthesisKeyword_0_0_RightParenthesisKeyword_0_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_XImportDeclaration_SemicolonKeyword_2_q.equals(syntax))
				emit_XImportDeclaration_SemicolonKeyword_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_XParenthesizedExpression_LeftParenthesisKeyword_0_a.equals(syntax))
				emit_XParenthesizedExpression_LeftParenthesisKeyword_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_XParenthesizedExpression_LeftParenthesisKeyword_0_p.equals(syntax))
				emit_XParenthesizedExpression_LeftParenthesisKeyword_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     createType=JvmTypeReference (ambiguity) ')' (rule end)
	 */
	protected void emit_AddContextMenu_CommaKeyword_10_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     id=EString (ambiguity) 'parentType:' parentType=JvmTypeReference
	 */
	protected void emit_AddContextMenu_CommaKeyword_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     parentType=JvmTypeReference (ambiguity) 'createType:' createType=JvmTypeReference
	 */
	protected void emit_AddContextMenu_CommaKeyword_7_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     id=EString (ambiguity) ')' (rule end)
	 */
	protected void emit_CopyContextMenu_CommaKeyword_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     modelPackage=JvmTypeReference (ambiguity) 'modelFactory:' modelFactory=JvmTypeReference
	 */
	protected void emit_Ecore_CommaKeyword_12_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     modelFactory=JvmTypeReference (ambiguity) 'rootType:' rootType=JvmTypeReference
	 */
	protected void emit_Ecore_CommaKeyword_15_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     rootType=JvmTypeReference (ambiguity) 'useUndoRedo:' useUndoRedo=EBoolean
	 */
	protected void emit_Ecore_CommaKeyword_18_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     useUndoRedo=EBoolean (ambiguity) 'showCommandStack:' showCommandStack=EBoolean
	 */
	protected void emit_Ecore_CommaKeyword_21_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     showCommandStack=EBoolean (ambiguity) 'showPropertyView:' showPropertyView=EBoolean
	 */
	protected void emit_Ecore_CommaKeyword_24_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     showPropertyView=EBoolean (ambiguity) 'generateDemo:' generateDemo=EBoolean
	 */
	protected void emit_Ecore_CommaKeyword_27_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     generateDemo=EBoolean (ambiguity) 'contextMenus' '+=' contextMenus+=ContextMenu
	 *     generateDemo=EBoolean (ambiguity) 'controls' '+=' supportedControls+=SupportedControl
	 *     generateDemo=EBoolean (ambiguity) 'editables' '+=' editables+=EditableEAttributes
	 *     generateDemo=EBoolean (ambiguity) '}' (rule end)
	 */
	protected void emit_Ecore_CommaKeyword_30_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     editables+=EditableEAttributes (ambiguity) 'contextMenus' '+=' contextMenus+=ContextMenu
	 *     editables+=EditableEAttributes (ambiguity) 'controls' '+=' supportedControls+=SupportedControl
	 *     editables+=EditableEAttributes (ambiguity) 'editables' '+=' editables+=EditableEAttributes
	 *     editables+=EditableEAttributes (ambiguity) '}' (rule end)
	 */
	protected void emit_Ecore_CommaKeyword_31_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     contextMenus+=ContextMenu (ambiguity) 'contextMenus' '+=' contextMenus+=ContextMenu
	 *     contextMenus+=ContextMenu (ambiguity) 'controls' '+=' supportedControls+=SupportedControl
	 *     contextMenus+=ContextMenu (ambiguity) '}' (rule end)
	 */
	protected void emit_Ecore_CommaKeyword_32_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     supportedControls+=SupportedControl (ambiguity) 'controls' '+=' supportedControls+=SupportedControl
	 *     supportedControls+=SupportedControl (ambiguity) '}' (rule end)
	 */
	protected void emit_Ecore_CommaKeyword_33_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     packagePath=EString (ambiguity) 'modelItemProviderAdapterFactory:' modelItemProviderAdapterFactory=JvmTypeReference
	 */
	protected void emit_Ecore_CommaKeyword_6_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     modelItemProviderAdapterFactory=JvmTypeReference (ambiguity) 'modelPackage:' modelPackage=JvmTypeReference
	 */
	protected void emit_Ecore_CommaKeyword_9_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     name=EString (ambiguity) 'model:' model=JvmTypeReference
	 */
	protected void emit_ListViewFX_CommaKeyword_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     name=EString (ambiguity) 'model:' model=JvmTypeReference
	 */
	protected void emit_TableViewFX_CommaKeyword_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     name=EString (ambiguity) 'model:' model=JvmTypeReference
	 */
	protected void emit_TreeViewFX_CommaKeyword_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('(' ')')?
	 *
	 * This ambiguous syntax occurs at:
	 *     annotationType=[JvmAnnotationType|QualifiedName] (ambiguity) (rule end)
	 */
	protected void emit_XAnnotation___LeftParenthesisKeyword_3_0_RightParenthesisKeyword_3_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     expressions+=XExpressionOrVarDeclaration (ambiguity) '}' ')' (rule end)
	 *     expressions+=XExpressionOrVarDeclaration (ambiguity) '}' (rule end)
	 *     expressions+=XExpressionOrVarDeclaration (ambiguity) expressions+=XExpressionOrVarDeclaration
	 */
	protected void emit_XBlockExpression_SemicolonKeyword_2_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     expressions+=XExpressionOrVarDeclaration (ambiguity) (rule end)
	 *     expressions+=XExpressionOrVarDeclaration (ambiguity) expressions+=XExpressionOrVarDeclaration
	 */
	protected void emit_XExpressionInClosure_SemicolonKeyword_1_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('(' ')')?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) '=>' returnType=JvmTypeReference
	 */
	protected void emit_XFunctionTypeRef___LeftParenthesisKeyword_0_0_RightParenthesisKeyword_0_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     importedNamespace=QualifiedNameWithWildcard (ambiguity) (rule end)
	 *     importedType=[JvmDeclaredType|QualifiedName] (ambiguity) (rule end)
	 *     memberName=ValidID (ambiguity) (rule end)
	 *     wildcard?='*' (ambiguity) (rule end)
	 */
	protected void emit_XImportDeclaration_SemicolonKeyword_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '('*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) '#' '[' ']' (rule start)
	 *     (rule start) (ambiguity) '#' '[' elements+=XExpression
	 *     (rule start) (ambiguity) '#' '{' '}' (rule start)
	 *     (rule start) (ambiguity) '#' '{' elements+=XExpression
	 *     (rule start) (ambiguity) '<' typeArguments+=JvmArgumentTypeReference
	 *     (rule start) (ambiguity) '[' declaredFormalParameters+=JvmFormalParameter
	 *     (rule start) (ambiguity) '[' explicitSyntax?='|'
	 *     (rule start) (ambiguity) '[' expression=XExpressionInClosure
	 *     (rule start) (ambiguity) 'do' body=XExpression
	 *     (rule start) (ambiguity) 'false' (rule start)
	 *     (rule start) (ambiguity) 'for' '(' ';' ';' ')' eachExpression=XExpression
	 *     (rule start) (ambiguity) 'for' '(' ';' ';' updateExpressions+=XExpression
	 *     (rule start) (ambiguity) 'for' '(' ';' expression=XExpression
	 *     (rule start) (ambiguity) 'for' '(' declaredParam=JvmFormalParameter
	 *     (rule start) (ambiguity) 'for' '(' initExpressions+=XExpressionOrVarDeclaration
	 *     (rule start) (ambiguity) 'if' '(' if=XExpression
	 *     (rule start) (ambiguity) 'new' constructor=[JvmConstructor|QualifiedName]
	 *     (rule start) (ambiguity) 'null' (rule start)
	 *     (rule start) (ambiguity) 'return' (rule start)
	 *     (rule start) (ambiguity) 'return' expression=XExpression
	 *     (rule start) (ambiguity) 'switch' '(' declaredParam=JvmFormalParameter
	 *     (rule start) (ambiguity) 'switch' declaredParam=JvmFormalParameter
	 *     (rule start) (ambiguity) 'switch' switch=XExpression
	 *     (rule start) (ambiguity) 'synchronized' '(' param=XExpression
	 *     (rule start) (ambiguity) 'throw' expression=XExpression
	 *     (rule start) (ambiguity) 'try' expression=XExpression
	 *     (rule start) (ambiguity) 'typeof' '(' type=[JvmType|QualifiedName]
	 *     (rule start) (ambiguity) 'while' '(' predicate=XExpression
	 *     (rule start) (ambiguity) '{' '}' (rule start)
	 *     (rule start) (ambiguity) '{' expressions+=XExpressionOrVarDeclaration
	 *     (rule start) (ambiguity) feature=[JvmIdentifiableElement|FeatureCallID]
	 *     (rule start) (ambiguity) feature=[JvmIdentifiableElement|IdOrSuper]
	 *     (rule start) (ambiguity) feature=[JvmIdentifiableElement|OpUnary]
	 *     (rule start) (ambiguity) isTrue?='true'
	 *     (rule start) (ambiguity) value=Number
	 *     (rule start) (ambiguity) value=STRING
	 *     (rule start) (ambiguity) {XAssignment.assignable=}
	 *     (rule start) (ambiguity) {XBinaryOperation.leftOperand=}
	 *     (rule start) (ambiguity) {XCastedExpression.target=}
	 *     (rule start) (ambiguity) {XInstanceOfExpression.expression=}
	 *     (rule start) (ambiguity) {XMemberFeatureCall.memberCallTarget=}
	 *     (rule start) (ambiguity) {XPostfixOperation.operand=}
	 */
	protected void emit_XParenthesizedExpression_LeftParenthesisKeyword_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '('+
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) '#' '[' ']' ')' (rule start)
	 *     (rule start) (ambiguity) '#' '[' elements+=XExpression
	 *     (rule start) (ambiguity) '#' '{' '}' ')' (rule start)
	 *     (rule start) (ambiguity) '#' '{' elements+=XExpression
	 *     (rule start) (ambiguity) '<' typeArguments+=JvmArgumentTypeReference
	 *     (rule start) (ambiguity) '[' declaredFormalParameters+=JvmFormalParameter
	 *     (rule start) (ambiguity) '[' explicitSyntax?='|'
	 *     (rule start) (ambiguity) '[' expression=XExpressionInClosure
	 *     (rule start) (ambiguity) 'do' body=XExpression
	 *     (rule start) (ambiguity) 'false' ')' (rule start)
	 *     (rule start) (ambiguity) 'for' '(' ';' ';' ')' eachExpression=XExpression
	 *     (rule start) (ambiguity) 'for' '(' ';' ';' updateExpressions+=XExpression
	 *     (rule start) (ambiguity) 'for' '(' ';' expression=XExpression
	 *     (rule start) (ambiguity) 'for' '(' declaredParam=JvmFormalParameter
	 *     (rule start) (ambiguity) 'for' '(' initExpressions+=XExpressionOrVarDeclaration
	 *     (rule start) (ambiguity) 'if' '(' if=XExpression
	 *     (rule start) (ambiguity) 'new' constructor=[JvmConstructor|QualifiedName]
	 *     (rule start) (ambiguity) 'null' ')' (rule start)
	 *     (rule start) (ambiguity) 'return' ')' (rule start)
	 *     (rule start) (ambiguity) 'return' expression=XExpression
	 *     (rule start) (ambiguity) 'switch' '(' declaredParam=JvmFormalParameter
	 *     (rule start) (ambiguity) 'switch' declaredParam=JvmFormalParameter
	 *     (rule start) (ambiguity) 'switch' switch=XExpression
	 *     (rule start) (ambiguity) 'synchronized' '(' param=XExpression
	 *     (rule start) (ambiguity) 'throw' expression=XExpression
	 *     (rule start) (ambiguity) 'try' expression=XExpression
	 *     (rule start) (ambiguity) 'typeof' '(' type=[JvmType|QualifiedName]
	 *     (rule start) (ambiguity) 'while' '(' predicate=XExpression
	 *     (rule start) (ambiguity) '{' '}' ')' (rule start)
	 *     (rule start) (ambiguity) '{' expressions+=XExpressionOrVarDeclaration
	 *     (rule start) (ambiguity) feature=[JvmIdentifiableElement|FeatureCallID]
	 *     (rule start) (ambiguity) feature=[JvmIdentifiableElement|IdOrSuper]
	 *     (rule start) (ambiguity) feature=[JvmIdentifiableElement|OpUnary]
	 *     (rule start) (ambiguity) isTrue?='true'
	 *     (rule start) (ambiguity) value=Number
	 *     (rule start) (ambiguity) value=STRING
	 *     (rule start) (ambiguity) {XAssignment.assignable=}
	 *     (rule start) (ambiguity) {XBinaryOperation.leftOperand=}
	 *     (rule start) (ambiguity) {XCastedExpression.target=}
	 *     (rule start) (ambiguity) {XInstanceOfExpression.expression=}
	 *     (rule start) (ambiguity) {XMemberFeatureCall.memberCallTarget=}
	 *     (rule start) (ambiguity) {XPostfixOperation.operand=}
	 */
	protected void emit_XParenthesizedExpression_LeftParenthesisKeyword_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
