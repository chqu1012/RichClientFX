/*
 * generated by Xtext 2.14.0
 */
package de.dc.emf.javafx.xtext.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import de.dc.emf.javafx.xtext.ide.contentassist.antlr.internal.InternalJavaFXLangParser;
import de.dc.emf.javafx.xtext.services.JavaFXLangGrammarAccess;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class JavaFXLangParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(JavaFXLangGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, JavaFXLangGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getChartFXAccess().getAlternatives(), "rule__ChartFX__Alternatives");
			builder.put(grammarAccess.getControlFXAccess().getAlternatives(), "rule__ControlFX__Alternatives");
			builder.put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
			builder.put(grammarAccess.getModelFXAccess().getAlternatives(), "rule__ModelFX__Alternatives");
			builder.put(grammarAccess.getEBooleanAccess().getAlternatives(), "rule__EBoolean__Alternatives");
			builder.put(grammarAccess.getAxisTypeAccess().getAlternatives(), "rule__AxisType__Alternatives");
			builder.put(grammarAccess.getOrientationAccess().getAlternatives(), "rule__Orientation__Alternatives");
			builder.put(grammarAccess.getBindinTypeAccess().getAlternatives(), "rule__BindinType__Alternatives");
			builder.put(grammarAccess.getProjectFXAccess().getGroup(), "rule__ProjectFX__Group__0");
			builder.put(grammarAccess.getProjectFXAccess().getGroup_4(), "rule__ProjectFX__Group_4__0");
			builder.put(grammarAccess.getProjectFXAccess().getGroup_5(), "rule__ProjectFX__Group_5__0");
			builder.put(grammarAccess.getProjectFXAccess().getGroup_6(), "rule__ProjectFX__Group_6__0");
			builder.put(grammarAccess.getProjectFXAccess().getGroup_7(), "rule__ProjectFX__Group_7__0");
			builder.put(grammarAccess.getProjectFXAccess().getGroup_8(), "rule__ProjectFX__Group_8__0");
			builder.put(grammarAccess.getBarChartFXAccess().getGroup(), "rule__BarChartFX__Group__0");
			builder.put(grammarAccess.getBarChartFXAccess().getGroup_5(), "rule__BarChartFX__Group_5__0");
			builder.put(grammarAccess.getBarChartFXAccess().getGroup_6(), "rule__BarChartFX__Group_6__0");
			builder.put(grammarAccess.getBarChartFXAccess().getGroup_7(), "rule__BarChartFX__Group_7__0");
			builder.put(grammarAccess.getBarChartFXAccess().getGroup_8(), "rule__BarChartFX__Group_8__0");
			builder.put(grammarAccess.getBarChartFXAccess().getGroup_9(), "rule__BarChartFX__Group_9__0");
			builder.put(grammarAccess.getBarChartFXAccess().getGroup_10(), "rule__BarChartFX__Group_10__0");
			builder.put(grammarAccess.getBarChartFXAccess().getGroup_11(), "rule__BarChartFX__Group_11__0");
			builder.put(grammarAccess.getBarChartFXAccess().getGroup_12(), "rule__BarChartFX__Group_12__0");
			builder.put(grammarAccess.getScatterChartFXAccess().getGroup(), "rule__ScatterChartFX__Group__0");
			builder.put(grammarAccess.getScatterChartFXAccess().getGroup_5(), "rule__ScatterChartFX__Group_5__0");
			builder.put(grammarAccess.getScatterChartFXAccess().getGroup_6(), "rule__ScatterChartFX__Group_6__0");
			builder.put(grammarAccess.getScatterChartFXAccess().getGroup_7(), "rule__ScatterChartFX__Group_7__0");
			builder.put(grammarAccess.getScatterChartFXAccess().getGroup_8(), "rule__ScatterChartFX__Group_8__0");
			builder.put(grammarAccess.getScatterChartFXAccess().getGroup_9(), "rule__ScatterChartFX__Group_9__0");
			builder.put(grammarAccess.getScatterChartFXAccess().getGroup_10(), "rule__ScatterChartFX__Group_10__0");
			builder.put(grammarAccess.getScatterChartFXAccess().getGroup_11(), "rule__ScatterChartFX__Group_11__0");
			builder.put(grammarAccess.getScatterChartFXAccess().getGroup_12(), "rule__ScatterChartFX__Group_12__0");
			builder.put(grammarAccess.getBubbleChartFXAccess().getGroup(), "rule__BubbleChartFX__Group__0");
			builder.put(grammarAccess.getBubbleChartFXAccess().getGroup_5(), "rule__BubbleChartFX__Group_5__0");
			builder.put(grammarAccess.getBubbleChartFXAccess().getGroup_6(), "rule__BubbleChartFX__Group_6__0");
			builder.put(grammarAccess.getBubbleChartFXAccess().getGroup_7(), "rule__BubbleChartFX__Group_7__0");
			builder.put(grammarAccess.getBubbleChartFXAccess().getGroup_8(), "rule__BubbleChartFX__Group_8__0");
			builder.put(grammarAccess.getBubbleChartFXAccess().getGroup_9(), "rule__BubbleChartFX__Group_9__0");
			builder.put(grammarAccess.getBubbleChartFXAccess().getGroup_10(), "rule__BubbleChartFX__Group_10__0");
			builder.put(grammarAccess.getBubbleChartFXAccess().getGroup_11(), "rule__BubbleChartFX__Group_11__0");
			builder.put(grammarAccess.getBubbleChartFXAccess().getGroup_12(), "rule__BubbleChartFX__Group_12__0");
			builder.put(grammarAccess.getAreaChartFXAccess().getGroup(), "rule__AreaChartFX__Group__0");
			builder.put(grammarAccess.getAreaChartFXAccess().getGroup_5(), "rule__AreaChartFX__Group_5__0");
			builder.put(grammarAccess.getAreaChartFXAccess().getGroup_6(), "rule__AreaChartFX__Group_6__0");
			builder.put(grammarAccess.getAreaChartFXAccess().getGroup_7(), "rule__AreaChartFX__Group_7__0");
			builder.put(grammarAccess.getAreaChartFXAccess().getGroup_8(), "rule__AreaChartFX__Group_8__0");
			builder.put(grammarAccess.getAreaChartFXAccess().getGroup_9(), "rule__AreaChartFX__Group_9__0");
			builder.put(grammarAccess.getAreaChartFXAccess().getGroup_10(), "rule__AreaChartFX__Group_10__0");
			builder.put(grammarAccess.getAreaChartFXAccess().getGroup_11(), "rule__AreaChartFX__Group_11__0");
			builder.put(grammarAccess.getAreaChartFXAccess().getGroup_12(), "rule__AreaChartFX__Group_12__0");
			builder.put(grammarAccess.getPieChartFXAccess().getGroup(), "rule__PieChartFX__Group__0");
			builder.put(grammarAccess.getPieChartFXAccess().getGroup_5(), "rule__PieChartFX__Group_5__0");
			builder.put(grammarAccess.getPieChartFXAccess().getGroup_6(), "rule__PieChartFX__Group_6__0");
			builder.put(grammarAccess.getPieChartFXAccess().getGroup_7(), "rule__PieChartFX__Group_7__0");
			builder.put(grammarAccess.getPieChartFXAccess().getGroup_8(), "rule__PieChartFX__Group_8__0");
			builder.put(grammarAccess.getLineChartFXAccess().getGroup(), "rule__LineChartFX__Group__0");
			builder.put(grammarAccess.getLineChartFXAccess().getGroup_5(), "rule__LineChartFX__Group_5__0");
			builder.put(grammarAccess.getLineChartFXAccess().getGroup_6(), "rule__LineChartFX__Group_6__0");
			builder.put(grammarAccess.getLineChartFXAccess().getGroup_7(), "rule__LineChartFX__Group_7__0");
			builder.put(grammarAccess.getLineChartFXAccess().getGroup_8(), "rule__LineChartFX__Group_8__0");
			builder.put(grammarAccess.getLineChartFXAccess().getGroup_9(), "rule__LineChartFX__Group_9__0");
			builder.put(grammarAccess.getLineChartFXAccess().getGroup_10(), "rule__LineChartFX__Group_10__0");
			builder.put(grammarAccess.getLineChartFXAccess().getGroup_11(), "rule__LineChartFX__Group_11__0");
			builder.put(grammarAccess.getLineChartFXAccess().getGroup_12(), "rule__LineChartFX__Group_12__0");
			builder.put(grammarAccess.getLineChartFXAccess().getGroup_13(), "rule__LineChartFX__Group_13__0");
			builder.put(grammarAccess.getChartSeriesAccess().getGroup(), "rule__ChartSeries__Group__0");
			builder.put(grammarAccess.getChartSeriesAccess().getGroup_5(), "rule__ChartSeries__Group_5__0");
			builder.put(grammarAccess.getChartSeriesAccess().getGroup_5_2(), "rule__ChartSeries__Group_5_2__0");
			builder.put(grammarAccess.getChartFXDataAccess().getGroup(), "rule__ChartFXData__Group__0");
			builder.put(grammarAccess.getBindingAccess().getGroup(), "rule__Binding__Group__0");
			builder.put(grammarAccess.getBindingAccess().getGroup_4(), "rule__Binding__Group_4__0");
			builder.put(grammarAccess.getBindingPropertyAccess().getGroup(), "rule__BindingProperty__Group__0");
			builder.put(grammarAccess.getFilteredTableViewFXAccess().getGroup(), "rule__FilteredTableViewFX__Group__0");
			builder.put(grammarAccess.getFilteredTableViewFXAccess().getGroup_3(), "rule__FilteredTableViewFX__Group_3__0");
			builder.put(grammarAccess.getFilteredTableViewFXAccess().getGroup_4(), "rule__FilteredTableViewFX__Group_4__0");
			builder.put(grammarAccess.getFilteredTableViewFXAccess().getGroup_5(), "rule__FilteredTableViewFX__Group_5__0");
			builder.put(grammarAccess.getFilteredTableViewFXAccess().getGroup_6(), "rule__FilteredTableViewFX__Group_6__0");
			builder.put(grammarAccess.getDerivedBeanAccess().getGroup(), "rule__DerivedBean__Group__0");
			builder.put(grammarAccess.getDerivedBeanAccess().getGroup_4(), "rule__DerivedBean__Group_4__0");
			builder.put(grammarAccess.getDerivedBeanAccess().getGroup_5(), "rule__DerivedBean__Group_5__0");
			builder.put(grammarAccess.getBeanAccess().getGroup(), "rule__Bean__Group__0");
			builder.put(grammarAccess.getBeanAccess().getGroup_4(), "rule__Bean__Group_4__0");
			builder.put(grammarAccess.getTableViewFXAccess().getGroup(), "rule__TableViewFX__Group__0");
			builder.put(grammarAccess.getTableViewFXAccess().getGroup_3(), "rule__TableViewFX__Group_3__0");
			builder.put(grammarAccess.getTableViewFXAccess().getGroup_4(), "rule__TableViewFX__Group_4__0");
			builder.put(grammarAccess.getTableViewFXAccess().getGroup_5(), "rule__TableViewFX__Group_5__0");
			builder.put(grammarAccess.getTableColumnFXAccess().getGroup(), "rule__TableColumnFX__Group__0");
			builder.put(grammarAccess.getTableColumnFXAccess().getGroup_3(), "rule__TableColumnFX__Group_3__0");
			builder.put(grammarAccess.getTableColumnFXAccess().getGroup_4(), "rule__TableColumnFX__Group_4__0");
			builder.put(grammarAccess.getTableColumnFXAccess().getGroup_5(), "rule__TableColumnFX__Group_5__0");
			builder.put(grammarAccess.getTableColumnFXAccess().getGroup_6(), "rule__TableColumnFX__Group_6__0");
			builder.put(grammarAccess.getEIntAccess().getGroup(), "rule__EInt__Group__0");
			builder.put(grammarAccess.getAttributeFXAccess().getGroup(), "rule__AttributeFX__Group__0");
			builder.put(grammarAccess.getProjectFXAccess().getNameAssignment_2(), "rule__ProjectFX__NameAssignment_2");
			builder.put(grammarAccess.getProjectFXAccess().getPackagePathAssignment_4_1(), "rule__ProjectFX__PackagePathAssignment_4_1");
			builder.put(grammarAccess.getProjectFXAccess().getControlsAssignment_5_2(), "rule__ProjectFX__ControlsAssignment_5_2");
			builder.put(grammarAccess.getProjectFXAccess().getControlsAssignment_5_3(), "rule__ProjectFX__ControlsAssignment_5_3");
			builder.put(grammarAccess.getProjectFXAccess().getModelsAssignment_6_2(), "rule__ProjectFX__ModelsAssignment_6_2");
			builder.put(grammarAccess.getProjectFXAccess().getModelsAssignment_6_3(), "rule__ProjectFX__ModelsAssignment_6_3");
			builder.put(grammarAccess.getProjectFXAccess().getBindingsAssignment_7_2(), "rule__ProjectFX__BindingsAssignment_7_2");
			builder.put(grammarAccess.getProjectFXAccess().getBindingsAssignment_7_3(), "rule__ProjectFX__BindingsAssignment_7_3");
			builder.put(grammarAccess.getProjectFXAccess().getChartsAssignment_8_2(), "rule__ProjectFX__ChartsAssignment_8_2");
			builder.put(grammarAccess.getProjectFXAccess().getChartsAssignment_8_3(), "rule__ProjectFX__ChartsAssignment_8_3");
			builder.put(grammarAccess.getBarChartFXAccess().getNameAssignment_4(), "rule__BarChartFX__NameAssignment_4");
			builder.put(grammarAccess.getBarChartFXAccess().getLegendSideAssignment_5_1(), "rule__BarChartFX__LegendSideAssignment_5_1");
			builder.put(grammarAccess.getBarChartFXAccess().getShowLegendAssignment_6_1(), "rule__BarChartFX__ShowLegendAssignment_6_1");
			builder.put(grammarAccess.getBarChartFXAccess().getTitleAssignment_7_1(), "rule__BarChartFX__TitleAssignment_7_1");
			builder.put(grammarAccess.getBarChartFXAccess().getTitleSideAssignment_8_1(), "rule__BarChartFX__TitleSideAssignment_8_1");
			builder.put(grammarAccess.getBarChartFXAccess().getXAxisLabelAssignment_9_1(), "rule__BarChartFX__XAxisLabelAssignment_9_1");
			builder.put(grammarAccess.getBarChartFXAccess().getXAxisTypeAssignment_10_1(), "rule__BarChartFX__XAxisTypeAssignment_10_1");
			builder.put(grammarAccess.getBarChartFXAccess().getYAxisLabelAssignment_11_1(), "rule__BarChartFX__YAxisLabelAssignment_11_1");
			builder.put(grammarAccess.getBarChartFXAccess().getYAxisTypeAssignment_12_1(), "rule__BarChartFX__YAxisTypeAssignment_12_1");
			builder.put(grammarAccess.getScatterChartFXAccess().getNameAssignment_4(), "rule__ScatterChartFX__NameAssignment_4");
			builder.put(grammarAccess.getScatterChartFXAccess().getLegendSideAssignment_5_1(), "rule__ScatterChartFX__LegendSideAssignment_5_1");
			builder.put(grammarAccess.getScatterChartFXAccess().getShowLegendAssignment_6_1(), "rule__ScatterChartFX__ShowLegendAssignment_6_1");
			builder.put(grammarAccess.getScatterChartFXAccess().getTitleAssignment_7_1(), "rule__ScatterChartFX__TitleAssignment_7_1");
			builder.put(grammarAccess.getScatterChartFXAccess().getTitleSideAssignment_8_1(), "rule__ScatterChartFX__TitleSideAssignment_8_1");
			builder.put(grammarAccess.getScatterChartFXAccess().getXAxisLabelAssignment_9_1(), "rule__ScatterChartFX__XAxisLabelAssignment_9_1");
			builder.put(grammarAccess.getScatterChartFXAccess().getXAxisTypeAssignment_10_1(), "rule__ScatterChartFX__XAxisTypeAssignment_10_1");
			builder.put(grammarAccess.getScatterChartFXAccess().getYAxisLabelAssignment_11_1(), "rule__ScatterChartFX__YAxisLabelAssignment_11_1");
			builder.put(grammarAccess.getScatterChartFXAccess().getYAxisTypeAssignment_12_1(), "rule__ScatterChartFX__YAxisTypeAssignment_12_1");
			builder.put(grammarAccess.getBubbleChartFXAccess().getNameAssignment_4(), "rule__BubbleChartFX__NameAssignment_4");
			builder.put(grammarAccess.getBubbleChartFXAccess().getLegendSideAssignment_5_1(), "rule__BubbleChartFX__LegendSideAssignment_5_1");
			builder.put(grammarAccess.getBubbleChartFXAccess().getShowLegendAssignment_6_1(), "rule__BubbleChartFX__ShowLegendAssignment_6_1");
			builder.put(grammarAccess.getBubbleChartFXAccess().getTitleAssignment_7_1(), "rule__BubbleChartFX__TitleAssignment_7_1");
			builder.put(grammarAccess.getBubbleChartFXAccess().getTitleSideAssignment_8_1(), "rule__BubbleChartFX__TitleSideAssignment_8_1");
			builder.put(grammarAccess.getBubbleChartFXAccess().getXAxisLabelAssignment_9_1(), "rule__BubbleChartFX__XAxisLabelAssignment_9_1");
			builder.put(grammarAccess.getBubbleChartFXAccess().getXAxisTypeAssignment_10_1(), "rule__BubbleChartFX__XAxisTypeAssignment_10_1");
			builder.put(grammarAccess.getBubbleChartFXAccess().getYAxisLabelAssignment_11_1(), "rule__BubbleChartFX__YAxisLabelAssignment_11_1");
			builder.put(grammarAccess.getBubbleChartFXAccess().getYAxisTypeAssignment_12_1(), "rule__BubbleChartFX__YAxisTypeAssignment_12_1");
			builder.put(grammarAccess.getAreaChartFXAccess().getNameAssignment_4(), "rule__AreaChartFX__NameAssignment_4");
			builder.put(grammarAccess.getAreaChartFXAccess().getLegendSideAssignment_5_1(), "rule__AreaChartFX__LegendSideAssignment_5_1");
			builder.put(grammarAccess.getAreaChartFXAccess().getShowLegendAssignment_6_1(), "rule__AreaChartFX__ShowLegendAssignment_6_1");
			builder.put(grammarAccess.getAreaChartFXAccess().getTitleAssignment_7_1(), "rule__AreaChartFX__TitleAssignment_7_1");
			builder.put(grammarAccess.getAreaChartFXAccess().getTitleSideAssignment_8_1(), "rule__AreaChartFX__TitleSideAssignment_8_1");
			builder.put(grammarAccess.getAreaChartFXAccess().getXAxisLabelAssignment_9_1(), "rule__AreaChartFX__XAxisLabelAssignment_9_1");
			builder.put(grammarAccess.getAreaChartFXAccess().getXAxisTypeAssignment_10_1(), "rule__AreaChartFX__XAxisTypeAssignment_10_1");
			builder.put(grammarAccess.getAreaChartFXAccess().getYAxisLabelAssignment_11_1(), "rule__AreaChartFX__YAxisLabelAssignment_11_1");
			builder.put(grammarAccess.getAreaChartFXAccess().getYAxisTypeAssignment_12_1(), "rule__AreaChartFX__YAxisTypeAssignment_12_1");
			builder.put(grammarAccess.getPieChartFXAccess().getNameAssignment_4(), "rule__PieChartFX__NameAssignment_4");
			builder.put(grammarAccess.getPieChartFXAccess().getLegendSideAssignment_5_1(), "rule__PieChartFX__LegendSideAssignment_5_1");
			builder.put(grammarAccess.getPieChartFXAccess().getShowLegendAssignment_6_1(), "rule__PieChartFX__ShowLegendAssignment_6_1");
			builder.put(grammarAccess.getPieChartFXAccess().getTitleAssignment_7_1(), "rule__PieChartFX__TitleAssignment_7_1");
			builder.put(grammarAccess.getPieChartFXAccess().getTitleSideAssignment_8_1(), "rule__PieChartFX__TitleSideAssignment_8_1");
			builder.put(grammarAccess.getLineChartFXAccess().getNameAssignment_4(), "rule__LineChartFX__NameAssignment_4");
			builder.put(grammarAccess.getLineChartFXAccess().getLegendSideAssignment_5_1(), "rule__LineChartFX__LegendSideAssignment_5_1");
			builder.put(grammarAccess.getLineChartFXAccess().getShowLegendAssignment_6_1(), "rule__LineChartFX__ShowLegendAssignment_6_1");
			builder.put(grammarAccess.getLineChartFXAccess().getTitleAssignment_7_1(), "rule__LineChartFX__TitleAssignment_7_1");
			builder.put(grammarAccess.getLineChartFXAccess().getTitleSideAssignment_8_1(), "rule__LineChartFX__TitleSideAssignment_8_1");
			builder.put(grammarAccess.getLineChartFXAccess().getXAxisLabelAssignment_9_1(), "rule__LineChartFX__XAxisLabelAssignment_9_1");
			builder.put(grammarAccess.getLineChartFXAccess().getXAxisTypeAssignment_10_1(), "rule__LineChartFX__XAxisTypeAssignment_10_1");
			builder.put(grammarAccess.getLineChartFXAccess().getYAxisLabelAssignment_11_1(), "rule__LineChartFX__YAxisLabelAssignment_11_1");
			builder.put(grammarAccess.getLineChartFXAccess().getYAxisTypeAssignment_12_1(), "rule__LineChartFX__YAxisTypeAssignment_12_1");
			builder.put(grammarAccess.getLineChartFXAccess().getSeriesAssignment_13_0(), "rule__LineChartFX__SeriesAssignment_13_0");
			builder.put(grammarAccess.getLineChartFXAccess().getSeriesAssignment_13_1(), "rule__LineChartFX__SeriesAssignment_13_1");
			builder.put(grammarAccess.getChartSeriesAccess().getNameAssignment_4(), "rule__ChartSeries__NameAssignment_4");
			builder.put(grammarAccess.getChartSeriesAccess().getDataListAssignment_5_2_0(), "rule__ChartSeries__DataListAssignment_5_2_0");
			builder.put(grammarAccess.getChartSeriesAccess().getDataListAssignment_5_2_1(), "rule__ChartSeries__DataListAssignment_5_2_1");
			builder.put(grammarAccess.getChartFXDataAccess().getXValueAssignment_3(), "rule__ChartFXData__XValueAssignment_3");
			builder.put(grammarAccess.getChartFXDataAccess().getYValueAssignment_5(), "rule__ChartFXData__YValueAssignment_5");
			builder.put(grammarAccess.getBindingAccess().getNameAssignment_2(), "rule__Binding__NameAssignment_2");
			builder.put(grammarAccess.getBindingAccess().getPropertyAssignment_4_0(), "rule__Binding__PropertyAssignment_4_0");
			builder.put(grammarAccess.getBindingAccess().getPropertyAssignment_4_1(), "rule__Binding__PropertyAssignment_4_1");
			builder.put(grammarAccess.getBindingPropertyAccess().getTypeAssignment_1(), "rule__BindingProperty__TypeAssignment_1");
			builder.put(grammarAccess.getBindingPropertyAccess().getNameAssignment_2(), "rule__BindingProperty__NameAssignment_2");
			builder.put(grammarAccess.getFilteredTableViewFXAccess().getNameAssignment_3_1(), "rule__FilteredTableViewFX__NameAssignment_3_1");
			builder.put(grammarAccess.getFilteredTableViewFXAccess().getUsedModelAssignment_4_1(), "rule__FilteredTableViewFX__UsedModelAssignment_4_1");
			builder.put(grammarAccess.getFilteredTableViewFXAccess().getUseFilterAssignment_5_1(), "rule__FilteredTableViewFX__UseFilterAssignment_5_1");
			builder.put(grammarAccess.getFilteredTableViewFXAccess().getColumnsAssignment_6_0(), "rule__FilteredTableViewFX__ColumnsAssignment_6_0");
			builder.put(grammarAccess.getFilteredTableViewFXAccess().getColumnsAssignment_6_1(), "rule__FilteredTableViewFX__ColumnsAssignment_6_1");
			builder.put(grammarAccess.getDerivedBeanAccess().getNameAssignment_2(), "rule__DerivedBean__NameAssignment_2");
			builder.put(grammarAccess.getDerivedBeanAccess().getInstanceTypeAssignment_4_1(), "rule__DerivedBean__InstanceTypeAssignment_4_1");
			builder.put(grammarAccess.getDerivedBeanAccess().getAttributesAssignment_5_0(), "rule__DerivedBean__AttributesAssignment_5_0");
			builder.put(grammarAccess.getDerivedBeanAccess().getAttributesAssignment_5_1(), "rule__DerivedBean__AttributesAssignment_5_1");
			builder.put(grammarAccess.getBeanAccess().getNameAssignment_2(), "rule__Bean__NameAssignment_2");
			builder.put(grammarAccess.getBeanAccess().getAttributesAssignment_4_0(), "rule__Bean__AttributesAssignment_4_0");
			builder.put(grammarAccess.getBeanAccess().getAttributesAssignment_4_1(), "rule__Bean__AttributesAssignment_4_1");
			builder.put(grammarAccess.getTableViewFXAccess().getNameAssignment_3_1(), "rule__TableViewFX__NameAssignment_3_1");
			builder.put(grammarAccess.getTableViewFXAccess().getUsedModelAssignment_4_1(), "rule__TableViewFX__UsedModelAssignment_4_1");
			builder.put(grammarAccess.getTableViewFXAccess().getColumnsAssignment_5_0(), "rule__TableViewFX__ColumnsAssignment_5_0");
			builder.put(grammarAccess.getTableViewFXAccess().getColumnsAssignment_5_1(), "rule__TableViewFX__ColumnsAssignment_5_1");
			builder.put(grammarAccess.getTableColumnFXAccess().getNameAssignment_3_1(), "rule__TableColumnFX__NameAssignment_3_1");
			builder.put(grammarAccess.getTableColumnFXAccess().getWidthAssignment_4_1(), "rule__TableColumnFX__WidthAssignment_4_1");
			builder.put(grammarAccess.getTableColumnFXAccess().getUsedAttributeAssignment_5_1(), "rule__TableColumnFX__UsedAttributeAssignment_5_1");
			builder.put(grammarAccess.getTableColumnFXAccess().getUseFilterAssignment_6_1(), "rule__TableColumnFX__UseFilterAssignment_6_1");
			builder.put(grammarAccess.getAttributeFXAccess().getTypeAssignment_1(), "rule__AttributeFX__TypeAssignment_1");
			builder.put(grammarAccess.getAttributeFXAccess().getNameAssignment_2(), "rule__AttributeFX__NameAssignment_2");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private JavaFXLangGrammarAccess grammarAccess;

	@Override
	protected InternalJavaFXLangParser createParser() {
		InternalJavaFXLangParser result = new InternalJavaFXLangParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public JavaFXLangGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(JavaFXLangGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
