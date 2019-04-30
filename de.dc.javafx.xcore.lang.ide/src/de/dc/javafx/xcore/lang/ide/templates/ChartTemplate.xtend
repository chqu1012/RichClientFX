package de.dc.javafx.xcore.lang.ide.templates

class ChartTemplate {
	
	/**
	 * {"PieChart", "AreaChart", "BarChart", "BubbleChart", "LineChart", "ScatterChart", "StackedAreaChart"}
	 */
	def static getTemplate(int chartType, String chartName, String title, String xAxis, String yAxis){
		switch (chartType) {
			case 0: return getPieChart(chartName, title, xAxis, yAxis)
			case 1: return getAreaChart(chartName, title, xAxis, yAxis)
			case 2: return getBarChart(chartName, title, xAxis, yAxis)
			case 3: return getBubbleChart(chartName, title, xAxis, yAxis)
			case 4: return getLineChart(chartName, title, xAxis, yAxis)
			case 5: return getScatterChart(chartName, title, xAxis, yAxis)
			case 6: return getStackedAreaChart(chartName, title, xAxis, yAxis)
			case 7: return getDoughnutChart(chartName, title, xAxis, yAxis)
			default: {
				return ''
			}
		}
	}
	
	def static String getPieChart(String chartName, String title, String xAxis, String yAxis)''''''
	
	
	def static String getAreaChart(String chartName, String title, String xAxis, String yAxis)''''''
	def static String getBarChart(String chartName, String title, String xAxis, String yAxis)''''''
	def static String getBubbleChart(String chartName, String title, String xAxis, String yAxis)''''''
	def static String getScatterChart(String chartName, String title, String xAxis, String yAxis)''''''
	def static String getStackedAreaChart(String chartName, String title, String xAxis, String yAxis)''''''
	def static String getDoughnutChart(String chartName, String title, String xAxis, String yAxis)''''''
	
	def static String getLineChart(String chartName, String title, String xAxis, String yAxis)'''
	packagePath "packagePath"
	
	charts{
		LineChartFX «chartName»{
			title "«title»"
			xAxisLabel "«xAxis»"
			yAxisLabel "«yAxis»"
		}
	}
	'''
}