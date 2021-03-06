/*
 * generated by Xtext 2.17.0
 */
package de.dc.javafx.xcore.lang.serializer;

import com.google.inject.Inject;
import de.dc.emf.javafx.model.javafx.AreaChartFX;
import de.dc.emf.javafx.model.javafx.AttributeFX;
import de.dc.emf.javafx.model.javafx.BarChartFX;
import de.dc.emf.javafx.model.javafx.Bean;
import de.dc.emf.javafx.model.javafx.Binding;
import de.dc.emf.javafx.model.javafx.BindingProperty;
import de.dc.emf.javafx.model.javafx.BubbleChartFX;
import de.dc.emf.javafx.model.javafx.ChartFXData;
import de.dc.emf.javafx.model.javafx.ChartSeries;
import de.dc.emf.javafx.model.javafx.DerivedBean;
import de.dc.emf.javafx.model.javafx.JavafxPackage;
import de.dc.emf.javafx.model.javafx.KeyValueTileFX;
import de.dc.emf.javafx.model.javafx.LineChartFX;
import de.dc.emf.javafx.model.javafx.ListViewFX;
import de.dc.emf.javafx.model.javafx.PieChartFX;
import de.dc.emf.javafx.model.javafx.ProjectFX;
import de.dc.emf.javafx.model.javafx.ScatterChartFX;
import de.dc.emf.javafx.model.javafx.TableColumnFX;
import de.dc.emf.javafx.model.javafx.TableViewFX;
import de.dc.emf.javafx.model.javafx.TileBarFX;
import de.dc.emf.javafx.model.javafx.TreeViewFX;
import de.dc.javafx.xcore.lang.services.JavaFXDslGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmGenericArrayTypeReference;
import org.eclipse.xtext.common.types.JvmInnerTypeReference;
import org.eclipse.xtext.common.types.JvmLowerBound;
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;
import org.eclipse.xtext.common.types.JvmTypeParameter;
import org.eclipse.xtext.common.types.JvmUpperBound;
import org.eclipse.xtext.common.types.JvmWildcardTypeReference;
import org.eclipse.xtext.common.types.TypesPackage;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.eclipse.xtext.xbase.XAssignment;
import org.eclipse.xtext.xbase.XBasicForLoopExpression;
import org.eclipse.xtext.xbase.XBinaryOperation;
import org.eclipse.xtext.xbase.XBlockExpression;
import org.eclipse.xtext.xbase.XBooleanLiteral;
import org.eclipse.xtext.xbase.XCasePart;
import org.eclipse.xtext.xbase.XCastedExpression;
import org.eclipse.xtext.xbase.XCatchClause;
import org.eclipse.xtext.xbase.XClosure;
import org.eclipse.xtext.xbase.XConstructorCall;
import org.eclipse.xtext.xbase.XDoWhileExpression;
import org.eclipse.xtext.xbase.XFeatureCall;
import org.eclipse.xtext.xbase.XForLoopExpression;
import org.eclipse.xtext.xbase.XIfExpression;
import org.eclipse.xtext.xbase.XInstanceOfExpression;
import org.eclipse.xtext.xbase.XListLiteral;
import org.eclipse.xtext.xbase.XMemberFeatureCall;
import org.eclipse.xtext.xbase.XNullLiteral;
import org.eclipse.xtext.xbase.XNumberLiteral;
import org.eclipse.xtext.xbase.XPostfixOperation;
import org.eclipse.xtext.xbase.XReturnExpression;
import org.eclipse.xtext.xbase.XSetLiteral;
import org.eclipse.xtext.xbase.XStringLiteral;
import org.eclipse.xtext.xbase.XSwitchExpression;
import org.eclipse.xtext.xbase.XSynchronizedExpression;
import org.eclipse.xtext.xbase.XThrowExpression;
import org.eclipse.xtext.xbase.XTryCatchFinallyExpression;
import org.eclipse.xtext.xbase.XTypeLiteral;
import org.eclipse.xtext.xbase.XUnaryOperation;
import org.eclipse.xtext.xbase.XVariableDeclaration;
import org.eclipse.xtext.xbase.XWhileExpression;
import org.eclipse.xtext.xbase.XbasePackage;
import org.eclipse.xtext.xbase.annotations.serializer.XbaseWithAnnotationsSemanticSequencer;
import org.eclipse.xtext.xbase.annotations.xAnnotations.XAnnotation;
import org.eclipse.xtext.xbase.annotations.xAnnotations.XAnnotationElementValuePair;
import org.eclipse.xtext.xbase.annotations.xAnnotations.XAnnotationsPackage;
import org.eclipse.xtext.xtype.XFunctionTypeRef;
import org.eclipse.xtext.xtype.XImportDeclaration;
import org.eclipse.xtext.xtype.XImportSection;
import org.eclipse.xtext.xtype.XtypePackage;

@SuppressWarnings("all")
public class JavaFXDslSemanticSequencer extends XbaseWithAnnotationsSemanticSequencer {

	@Inject
	private JavaFXDslGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == JavafxPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case JavafxPackage.AREA_CHART_FX:
				sequence_AreaChartFX(context, (AreaChartFX) semanticObject); 
				return; 
			case JavafxPackage.ATTRIBUTE_FX:
				sequence_AttributeFX(context, (AttributeFX) semanticObject); 
				return; 
			case JavafxPackage.BAR_CHART_FX:
				sequence_BarChartFX(context, (BarChartFX) semanticObject); 
				return; 
			case JavafxPackage.BEAN:
				sequence_Bean(context, (Bean) semanticObject); 
				return; 
			case JavafxPackage.BINDING:
				sequence_Binding(context, (Binding) semanticObject); 
				return; 
			case JavafxPackage.BINDING_PROPERTY:
				sequence_BindingProperty(context, (BindingProperty) semanticObject); 
				return; 
			case JavafxPackage.BUBBLE_CHART_FX:
				sequence_BubbleChartFX(context, (BubbleChartFX) semanticObject); 
				return; 
			case JavafxPackage.CHART_FX_DATA:
				sequence_ChartFXData(context, (ChartFXData) semanticObject); 
				return; 
			case JavafxPackage.CHART_SERIES:
				sequence_ChartSeries(context, (ChartSeries) semanticObject); 
				return; 
			case JavafxPackage.DERIVED_BEAN:
				sequence_DerivedBean(context, (DerivedBean) semanticObject); 
				return; 
			case JavafxPackage.KEY_VALUE_TILE_FX:
				sequence_KeyValueTileFX(context, (KeyValueTileFX) semanticObject); 
				return; 
			case JavafxPackage.LINE_CHART_FX:
				sequence_LineChartFX(context, (LineChartFX) semanticObject); 
				return; 
			case JavafxPackage.LIST_VIEW_FX:
				sequence_ListViewFX(context, (ListViewFX) semanticObject); 
				return; 
			case JavafxPackage.PIE_CHART_FX:
				sequence_PieChartFX(context, (PieChartFX) semanticObject); 
				return; 
			case JavafxPackage.PROJECT_FX:
				sequence_ProjectFX(context, (ProjectFX) semanticObject); 
				return; 
			case JavafxPackage.SCATTER_CHART_FX:
				sequence_ScatterChartFX(context, (ScatterChartFX) semanticObject); 
				return; 
			case JavafxPackage.TABLE_COLUMN_FX:
				sequence_TableColumnFX(context, (TableColumnFX) semanticObject); 
				return; 
			case JavafxPackage.TABLE_VIEW_FX:
				sequence_TableViewFX(context, (TableViewFX) semanticObject); 
				return; 
			case JavafxPackage.TILE_BAR_FX:
				sequence_TileBarFX(context, (TileBarFX) semanticObject); 
				return; 
			case JavafxPackage.TREE_VIEW_FX:
				sequence_TreeViewFX(context, (TreeViewFX) semanticObject); 
				return; 
			}
		else if (epackage == TypesPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case TypesPackage.JVM_FORMAL_PARAMETER:
				if (rule == grammarAccess.getFullJvmFormalParameterRule()) {
					sequence_FullJvmFormalParameter(context, (JvmFormalParameter) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getJvmFormalParameterRule()) {
					sequence_JvmFormalParameter(context, (JvmFormalParameter) semanticObject); 
					return; 
				}
				else break;
			case TypesPackage.JVM_GENERIC_ARRAY_TYPE_REFERENCE:
				sequence_JvmTypeReference(context, (JvmGenericArrayTypeReference) semanticObject); 
				return; 
			case TypesPackage.JVM_INNER_TYPE_REFERENCE:
				sequence_JvmParameterizedTypeReference(context, (JvmInnerTypeReference) semanticObject); 
				return; 
			case TypesPackage.JVM_LOWER_BOUND:
				if (rule == grammarAccess.getJvmLowerBoundAndedRule()) {
					sequence_JvmLowerBoundAnded(context, (JvmLowerBound) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getJvmLowerBoundRule()) {
					sequence_JvmLowerBound(context, (JvmLowerBound) semanticObject); 
					return; 
				}
				else break;
			case TypesPackage.JVM_PARAMETERIZED_TYPE_REFERENCE:
				if (action == grammarAccess.getJvmParameterizedTypeReferenceAccess().getJvmInnerTypeReferenceOuterAction_1_4_0_0_0()) {
					sequence_JvmParameterizedTypeReference_JvmInnerTypeReference_1_4_0_0_0(context, (JvmParameterizedTypeReference) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getJvmTypeReferenceRule()
						|| action == grammarAccess.getJvmTypeReferenceAccess().getJvmGenericArrayTypeReferenceComponentTypeAction_0_1_0_0()
						|| rule == grammarAccess.getJvmParameterizedTypeReferenceRule()
						|| rule == grammarAccess.getJvmArgumentTypeReferenceRule()) {
					sequence_JvmParameterizedTypeReference(context, (JvmParameterizedTypeReference) semanticObject); 
					return; 
				}
				else break;
			case TypesPackage.JVM_TYPE_PARAMETER:
				sequence_JvmTypeParameter(context, (JvmTypeParameter) semanticObject); 
				return; 
			case TypesPackage.JVM_UPPER_BOUND:
				if (rule == grammarAccess.getJvmUpperBoundAndedRule()) {
					sequence_JvmUpperBoundAnded(context, (JvmUpperBound) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getJvmUpperBoundRule()) {
					sequence_JvmUpperBound(context, (JvmUpperBound) semanticObject); 
					return; 
				}
				else break;
			case TypesPackage.JVM_WILDCARD_TYPE_REFERENCE:
				sequence_JvmWildcardTypeReference(context, (JvmWildcardTypeReference) semanticObject); 
				return; 
			}
		else if (epackage == XAnnotationsPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case XAnnotationsPackage.XANNOTATION:
				sequence_XAnnotation(context, (XAnnotation) semanticObject); 
				return; 
			case XAnnotationsPackage.XANNOTATION_ELEMENT_VALUE_PAIR:
				sequence_XAnnotationElementValuePair(context, (XAnnotationElementValuePair) semanticObject); 
				return; 
			}
		else if (epackage == XbasePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case XbasePackage.XASSIGNMENT:
				sequence_XAssignment_XMemberFeatureCall(context, (XAssignment) semanticObject); 
				return; 
			case XbasePackage.XBASIC_FOR_LOOP_EXPRESSION:
				sequence_XBasicForLoopExpression(context, (XBasicForLoopExpression) semanticObject); 
				return; 
			case XbasePackage.XBINARY_OPERATION:
				sequence_XAdditiveExpression_XAndExpression_XAssignment_XEqualityExpression_XMultiplicativeExpression_XOrExpression_XOtherOperatorExpression_XRelationalExpression(context, (XBinaryOperation) semanticObject); 
				return; 
			case XbasePackage.XBLOCK_EXPRESSION:
				if (rule == grammarAccess.getXAnnotationElementValueOrCommaListRule()
						|| action == grammarAccess.getXAnnotationElementValueOrCommaListAccess().getXListLiteralElementsAction_1_1_0()
						|| rule == grammarAccess.getXAnnotationElementValueRule()
						|| rule == grammarAccess.getXAnnotationOrExpressionRule()
						|| rule == grammarAccess.getXExpressionRule()
						|| rule == grammarAccess.getXAssignmentRule()
						|| action == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0()
						|| rule == grammarAccess.getXOrExpressionRule()
						|| action == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0()
						|| rule == grammarAccess.getXAndExpressionRule()
						|| action == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0()
						|| rule == grammarAccess.getXEqualityExpressionRule()
						|| action == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0()
						|| rule == grammarAccess.getXRelationalExpressionRule()
						|| action == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0()
						|| action == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0()
						|| rule == grammarAccess.getXOtherOperatorExpressionRule()
						|| action == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0()
						|| rule == grammarAccess.getXAdditiveExpressionRule()
						|| action == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0()
						|| rule == grammarAccess.getXMultiplicativeExpressionRule()
						|| action == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0()
						|| rule == grammarAccess.getXUnaryOperationRule()
						|| rule == grammarAccess.getXCastedExpressionRule()
						|| action == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0()
						|| rule == grammarAccess.getXPostfixOperationRule()
						|| action == grammarAccess.getXPostfixOperationAccess().getXPostfixOperationOperandAction_1_0_0()
						|| rule == grammarAccess.getXMemberFeatureCallRule()
						|| action == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0()
						|| action == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0()
						|| rule == grammarAccess.getXPrimaryExpressionRule()
						|| rule == grammarAccess.getXParenthesizedExpressionRule()
						|| rule == grammarAccess.getXBlockExpressionRule()
						|| rule == grammarAccess.getXExpressionOrVarDeclarationRule()) {
					sequence_XBlockExpression(context, (XBlockExpression) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getXExpressionInClosureRule()) {
					sequence_XExpressionInClosure(context, (XBlockExpression) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XBOOLEAN_LITERAL:
				sequence_XBooleanLiteral(context, (XBooleanLiteral) semanticObject); 
				return; 
			case XbasePackage.XCASE_PART:
				sequence_XCasePart(context, (XCasePart) semanticObject); 
				return; 
			case XbasePackage.XCASTED_EXPRESSION:
				sequence_XCastedExpression(context, (XCastedExpression) semanticObject); 
				return; 
			case XbasePackage.XCATCH_CLAUSE:
				sequence_XCatchClause(context, (XCatchClause) semanticObject); 
				return; 
			case XbasePackage.XCLOSURE:
				if (rule == grammarAccess.getXAnnotationElementValueOrCommaListRule()
						|| action == grammarAccess.getXAnnotationElementValueOrCommaListAccess().getXListLiteralElementsAction_1_1_0()
						|| rule == grammarAccess.getXAnnotationElementValueRule()
						|| rule == grammarAccess.getXAnnotationOrExpressionRule()
						|| rule == grammarAccess.getXExpressionRule()
						|| rule == grammarAccess.getXAssignmentRule()
						|| action == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0()
						|| rule == grammarAccess.getXOrExpressionRule()
						|| action == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0()
						|| rule == grammarAccess.getXAndExpressionRule()
						|| action == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0()
						|| rule == grammarAccess.getXEqualityExpressionRule()
						|| action == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0()
						|| rule == grammarAccess.getXRelationalExpressionRule()
						|| action == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0()
						|| action == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0()
						|| rule == grammarAccess.getXOtherOperatorExpressionRule()
						|| action == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0()
						|| rule == grammarAccess.getXAdditiveExpressionRule()
						|| action == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0()
						|| rule == grammarAccess.getXMultiplicativeExpressionRule()
						|| action == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0()
						|| rule == grammarAccess.getXUnaryOperationRule()
						|| rule == grammarAccess.getXCastedExpressionRule()
						|| action == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0()
						|| rule == grammarAccess.getXPostfixOperationRule()
						|| action == grammarAccess.getXPostfixOperationAccess().getXPostfixOperationOperandAction_1_0_0()
						|| rule == grammarAccess.getXMemberFeatureCallRule()
						|| action == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0()
						|| action == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0()
						|| rule == grammarAccess.getXPrimaryExpressionRule()
						|| rule == grammarAccess.getXLiteralRule()
						|| rule == grammarAccess.getXClosureRule()
						|| rule == grammarAccess.getXParenthesizedExpressionRule()
						|| rule == grammarAccess.getXExpressionOrVarDeclarationRule()) {
					sequence_XClosure(context, (XClosure) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getXShortClosureRule()) {
					sequence_XShortClosure(context, (XClosure) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XCONSTRUCTOR_CALL:
				sequence_XConstructorCall(context, (XConstructorCall) semanticObject); 
				return; 
			case XbasePackage.XDO_WHILE_EXPRESSION:
				sequence_XDoWhileExpression(context, (XDoWhileExpression) semanticObject); 
				return; 
			case XbasePackage.XFEATURE_CALL:
				sequence_XFeatureCall(context, (XFeatureCall) semanticObject); 
				return; 
			case XbasePackage.XFOR_LOOP_EXPRESSION:
				sequence_XForLoopExpression(context, (XForLoopExpression) semanticObject); 
				return; 
			case XbasePackage.XIF_EXPRESSION:
				sequence_XIfExpression(context, (XIfExpression) semanticObject); 
				return; 
			case XbasePackage.XINSTANCE_OF_EXPRESSION:
				sequence_XRelationalExpression(context, (XInstanceOfExpression) semanticObject); 
				return; 
			case XbasePackage.XLIST_LITERAL:
				if (rule == grammarAccess.getXAnnotationElementValueOrCommaListRule()) {
					sequence_XAnnotationElementValueOrCommaList_XListLiteral(context, (XListLiteral) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getXAnnotationElementValueRule()) {
					sequence_XAnnotationElementValue_XListLiteral(context, (XListLiteral) semanticObject); 
					return; 
				}
				else if (action == grammarAccess.getXAnnotationElementValueOrCommaListAccess().getXListLiteralElementsAction_1_1_0()
						|| rule == grammarAccess.getXAnnotationOrExpressionRule()
						|| rule == grammarAccess.getXExpressionRule()
						|| rule == grammarAccess.getXAssignmentRule()
						|| action == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0()
						|| rule == grammarAccess.getXOrExpressionRule()
						|| action == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0()
						|| rule == grammarAccess.getXAndExpressionRule()
						|| action == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0()
						|| rule == grammarAccess.getXEqualityExpressionRule()
						|| action == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0()
						|| rule == grammarAccess.getXRelationalExpressionRule()
						|| action == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0()
						|| action == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0()
						|| rule == grammarAccess.getXOtherOperatorExpressionRule()
						|| action == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0()
						|| rule == grammarAccess.getXAdditiveExpressionRule()
						|| action == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0()
						|| rule == grammarAccess.getXMultiplicativeExpressionRule()
						|| action == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0()
						|| rule == grammarAccess.getXUnaryOperationRule()
						|| rule == grammarAccess.getXCastedExpressionRule()
						|| action == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0()
						|| rule == grammarAccess.getXPostfixOperationRule()
						|| action == grammarAccess.getXPostfixOperationAccess().getXPostfixOperationOperandAction_1_0_0()
						|| rule == grammarAccess.getXMemberFeatureCallRule()
						|| action == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0()
						|| action == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0()
						|| rule == grammarAccess.getXPrimaryExpressionRule()
						|| rule == grammarAccess.getXLiteralRule()
						|| rule == grammarAccess.getXCollectionLiteralRule()
						|| rule == grammarAccess.getXListLiteralRule()
						|| rule == grammarAccess.getXParenthesizedExpressionRule()
						|| rule == grammarAccess.getXExpressionOrVarDeclarationRule()) {
					sequence_XListLiteral(context, (XListLiteral) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XMEMBER_FEATURE_CALL:
				sequence_XMemberFeatureCall(context, (XMemberFeatureCall) semanticObject); 
				return; 
			case XbasePackage.XNULL_LITERAL:
				sequence_XNullLiteral(context, (XNullLiteral) semanticObject); 
				return; 
			case XbasePackage.XNUMBER_LITERAL:
				sequence_XNumberLiteral(context, (XNumberLiteral) semanticObject); 
				return; 
			case XbasePackage.XPOSTFIX_OPERATION:
				sequence_XPostfixOperation(context, (XPostfixOperation) semanticObject); 
				return; 
			case XbasePackage.XRETURN_EXPRESSION:
				sequence_XReturnExpression(context, (XReturnExpression) semanticObject); 
				return; 
			case XbasePackage.XSET_LITERAL:
				sequence_XSetLiteral(context, (XSetLiteral) semanticObject); 
				return; 
			case XbasePackage.XSTRING_LITERAL:
				sequence_XStringLiteral(context, (XStringLiteral) semanticObject); 
				return; 
			case XbasePackage.XSWITCH_EXPRESSION:
				sequence_XSwitchExpression(context, (XSwitchExpression) semanticObject); 
				return; 
			case XbasePackage.XSYNCHRONIZED_EXPRESSION:
				sequence_XSynchronizedExpression(context, (XSynchronizedExpression) semanticObject); 
				return; 
			case XbasePackage.XTHROW_EXPRESSION:
				sequence_XThrowExpression(context, (XThrowExpression) semanticObject); 
				return; 
			case XbasePackage.XTRY_CATCH_FINALLY_EXPRESSION:
				sequence_XTryCatchFinallyExpression(context, (XTryCatchFinallyExpression) semanticObject); 
				return; 
			case XbasePackage.XTYPE_LITERAL:
				sequence_XTypeLiteral(context, (XTypeLiteral) semanticObject); 
				return; 
			case XbasePackage.XUNARY_OPERATION:
				sequence_XUnaryOperation(context, (XUnaryOperation) semanticObject); 
				return; 
			case XbasePackage.XVARIABLE_DECLARATION:
				sequence_XVariableDeclaration(context, (XVariableDeclaration) semanticObject); 
				return; 
			case XbasePackage.XWHILE_EXPRESSION:
				sequence_XWhileExpression(context, (XWhileExpression) semanticObject); 
				return; 
			}
		else if (epackage == XtypePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case XtypePackage.XFUNCTION_TYPE_REF:
				sequence_XFunctionTypeRef(context, (XFunctionTypeRef) semanticObject); 
				return; 
			case XtypePackage.XIMPORT_DECLARATION:
				sequence_XImportDeclaration(context, (XImportDeclaration) semanticObject); 
				return; 
			case XtypePackage.XIMPORT_SECTION:
				sequence_XImportSection(context, (XImportSection) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     ChartFX returns AreaChartFX
	 *     AreaChartFX returns AreaChartFX
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         title=EString? 
	 *         titleSide=Orientation? 
	 *         showLegend=EBoolean? 
	 *         legendSide=Orientation? 
	 *         xAxisType=AxisType? 
	 *         yAxisType=AxisType? 
	 *         xAxisLabel=EString? 
	 *         yAxisLabel=EString? 
	 *         (series+=ChartSeries series+=ChartSeries*)?
	 *     )
	 */
	protected void sequence_AreaChartFX(ISerializationContext context, AreaChartFX semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AttributeFX returns AttributeFX
	 *
	 * Constraint:
	 *     (type=EString name=EString)
	 */
	protected void sequence_AttributeFX(ISerializationContext context, AttributeFX semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, JavafxPackage.Literals.ATTRIBUTE_FX__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JavafxPackage.Literals.ATTRIBUTE_FX__TYPE));
			if (transientValues.isValueTransient(semanticObject, JavafxPackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JavafxPackage.Literals.NAMED_ELEMENT__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAttributeFXAccess().getTypeEStringParserRuleCall_1_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getAttributeFXAccess().getNameEStringParserRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ChartFX returns BarChartFX
	 *     BarChartFX returns BarChartFX
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         title=EString? 
	 *         titleSide=Orientation? 
	 *         showLegend=EBoolean? 
	 *         legendSide=Orientation? 
	 *         (series+=ChartSeries series+=ChartSeries*)?
	 *     )
	 */
	protected void sequence_BarChartFX(ISerializationContext context, BarChartFX semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ModelFX returns Bean
	 *     Bean returns Bean
	 *
	 * Constraint:
	 *     (name=EString (attributes+=AttributeFX attributes+=AttributeFX*)?)
	 */
	protected void sequence_Bean(ISerializationContext context, Bean semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     BindingProperty returns BindingProperty
	 *
	 * Constraint:
	 *     (type=BindingType name=EString)
	 */
	protected void sequence_BindingProperty(ISerializationContext context, BindingProperty semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, JavafxPackage.Literals.BINDING_PROPERTY__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JavafxPackage.Literals.BINDING_PROPERTY__TYPE));
			if (transientValues.isValueTransient(semanticObject, JavafxPackage.Literals.BINDING_PROPERTY__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JavafxPackage.Literals.BINDING_PROPERTY__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getBindingPropertyAccess().getTypeBindingTypeEnumRuleCall_1_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getBindingPropertyAccess().getNameEStringParserRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Binding returns Binding
	 *
	 * Constraint:
	 *     (name=EString (property+=BindingProperty property+=BindingProperty*)?)
	 */
	protected void sequence_Binding(ISerializationContext context, Binding semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ChartFX returns BubbleChartFX
	 *     BubbleChartFX returns BubbleChartFX
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         title=EString? 
	 *         titleSide=Orientation? 
	 *         showLegend=EBoolean? 
	 *         legendSide=Orientation? 
	 *         xAxisType=AxisType? 
	 *         yAxisType=AxisType? 
	 *         xAxisLabel=EString? 
	 *         yAxisLabel=EString? 
	 *         (series+=ChartSeries series+=ChartSeries*)?
	 *     )
	 */
	protected void sequence_BubbleChartFX(ISerializationContext context, BubbleChartFX semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ChartFXData returns ChartFXData
	 *
	 * Constraint:
	 *     (xValue=EString? yValue=EString?)
	 */
	protected void sequence_ChartFXData(ISerializationContext context, ChartFXData semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ChartSeries returns ChartSeries
	 *
	 * Constraint:
	 *     (name=EString (dataList+=ChartFXData dataList+=ChartFXData*)?)
	 */
	protected void sequence_ChartSeries(ISerializationContext context, ChartSeries semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ModelFX returns DerivedBean
	 *     DerivedBean returns DerivedBean
	 *
	 * Constraint:
	 *     (name=EString instanceType=EString (attributes+=AttributeFX attributes+=AttributeFX*)?)
	 */
	protected void sequence_DerivedBean(ISerializationContext context, DerivedBean semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TileFX returns KeyValueTileFX
	 *     KeyValueTileFX returns KeyValueTileFX
	 *
	 * Constraint:
	 *     (name=ID key=EString value=EString)
	 */
	protected void sequence_KeyValueTileFX(ISerializationContext context, KeyValueTileFX semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, JavafxPackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JavafxPackage.Literals.NAMED_ELEMENT__NAME));
			if (transientValues.isValueTransient(semanticObject, JavafxPackage.Literals.KEY_VALUE_TILE_FX__KEY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JavafxPackage.Literals.KEY_VALUE_TILE_FX__KEY));
			if (transientValues.isValueTransient(semanticObject, JavafxPackage.Literals.KEY_VALUE_TILE_FX__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JavafxPackage.Literals.KEY_VALUE_TILE_FX__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getKeyValueTileFXAccess().getNameIDTerminalRuleCall_3_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getKeyValueTileFXAccess().getKeyEStringParserRuleCall_4_1_0(), semanticObject.getKey());
		feeder.accept(grammarAccess.getKeyValueTileFXAccess().getValueEStringParserRuleCall_5_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ChartFX returns LineChartFX
	 *     LineChartFX returns LineChartFX
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         title=EString? 
	 *         titleSide=Orientation? 
	 *         showLegend=EBoolean? 
	 *         legendSide=Orientation? 
	 *         xAxisType=AxisType? 
	 *         yAxisType=AxisType? 
	 *         xAxisLabel=EString? 
	 *         yAxisLabel=EString? 
	 *         (series+=ChartSeries series+=ChartSeries*)?
	 *     )
	 */
	protected void sequence_LineChartFX(ISerializationContext context, LineChartFX semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ControlFX returns ListViewFX
	 *     ListViewFX returns ListViewFX
	 *
	 * Constraint:
	 *     (
	 *         name=EString? 
	 *         usedModel=JvmTypeReference? 
	 *         cellFactory=JvmTypeReference? 
	 *         showPropertyView=EBoolean? 
	 *         showToolbar=EBoolean? 
	 *         orientation=Orientation? 
	 *         generateDemo=EBoolean?
	 *     )
	 */
	protected void sequence_ListViewFX(ISerializationContext context, ListViewFX semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ChartFX returns PieChartFX
	 *     PieChartFX returns PieChartFX
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         title=EString? 
	 *         titleSide=Orientation? 
	 *         showLegend=EBoolean? 
	 *         legendSide=Orientation? 
	 *         (series+=ChartSeries series+=ChartSeries*)?
	 *     )
	 */
	protected void sequence_PieChartFX(ISerializationContext context, PieChartFX semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ProjectFX returns ProjectFX
	 *
	 * Constraint:
	 *     (
	 *         packagePath=EString | 
	 *         (packagePath=EString (charts+=ChartFX charts+=ChartFX*)) | 
	 *         (
	 *             packagePath=EString 
	 *             controls+=ControlFX 
	 *             controls+=ControlFX* 
	 *             (((models+=ModelFX models+=ModelFX*)? (charts+=ChartFX charts+=ChartFX*)) | (charts+=ChartFX charts+=ChartFX*))?
	 *         ) | 
	 *         (packagePath=EString models+=ModelFX models+=ModelFX* (charts+=ChartFX charts+=ChartFX*)) | 
	 *         (
	 *             (
	 *                 packagePath=EString | 
	 *                 (packagePath=EString controls+=ControlFX controls+=ControlFX* (models+=ModelFX models+=ModelFX*)?) | 
	 *                 (packagePath=EString models+=ModelFX models+=ModelFX*)
	 *             ) 
	 *             bindings+=Binding 
	 *             bindings+=Binding* 
	 *             (charts+=ChartFX charts+=ChartFX*)
	 *         )
	 *     )?
	 */
	protected void sequence_ProjectFX(ISerializationContext context, ProjectFX semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ChartFX returns ScatterChartFX
	 *     ScatterChartFX returns ScatterChartFX
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         title=EString? 
	 *         titleSide=Orientation? 
	 *         showLegend=EBoolean? 
	 *         legendSide=Orientation? 
	 *         xAxisType=AxisType? 
	 *         yAxisType=AxisType? 
	 *         xAxisLabel=EString? 
	 *         yAxisLabel=EString? 
	 *         (series+=ChartSeries series+=ChartSeries*)?
	 *     )
	 */
	protected void sequence_ScatterChartFX(ISerializationContext context, ScatterChartFX semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TableColumnFX returns TableColumnFX
	 *
	 * Constraint:
	 *     (name=EString width=EInt? usedAttribute=[AttributeFX|EString]? cellValueFactory=JvmTypeReference? useFilter?='useFilter'?)
	 */
	protected void sequence_TableColumnFX(ISerializationContext context, TableColumnFX semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ControlFX returns TableViewFX
	 *     TableViewFX returns TableViewFX
	 *
	 * Constraint:
	 *     (
	 *         name=EString? 
	 *         usedModel=JvmTypeReference? 
	 *         (columns+=TableColumnFX columns+=TableColumnFX*)? 
	 *         showPropertyView=EBoolean? 
	 *         showToolbar=EBoolean? 
	 *         generateDemo=EBoolean?
	 *     )
	 */
	protected void sequence_TableViewFX(ISerializationContext context, TableViewFX semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ControlFX returns TileBarFX
	 *     TileBarFX returns TileBarFX
	 *
	 * Constraint:
	 *     (name=EString tiles+=TileFX*)
	 */
	protected void sequence_TileBarFX(ISerializationContext context, TileBarFX semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ControlFX returns TreeViewFX
	 *     TreeViewFX returns TreeViewFX
	 *
	 * Constraint:
	 *     (name=EString? usedModel=JvmTypeReference? showPropertyView=EBoolean? showToolbar=EBoolean? generateDemo=EBoolean?)
	 */
	protected void sequence_TreeViewFX(ISerializationContext context, TreeViewFX semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
