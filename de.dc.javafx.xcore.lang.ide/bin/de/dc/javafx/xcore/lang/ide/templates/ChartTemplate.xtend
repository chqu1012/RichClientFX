package de.dc.javafx.xcore.lang.ide.templates

class ChartTemplate {
	
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