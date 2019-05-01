package de.dc.javafx.xcore.lang.ide.templates

import de.dc.javafx.xcore.lang.ide.wizards.ChartModel

class ChartTemplate {
	
	/**
	 * {"PieChart", "AreaChart", "BarChart", "BubbleChart", "LineChart", "ScatterChart", "StackedAreaChart"}
	 */
	def static getTemplate(ChartModel model){
		val chartName = model.chartName
		val title = model.title
		val xAxis = model.getxAxis
		val yAxis = model.getyAxis
		val packagePath = model.packagePath
		switch (model.chartType) {
			case 0: return getPieChart(packagePath, chartName, title, xAxis, yAxis)
			case 1: return getAreaChart(packagePath, chartName, title, xAxis, yAxis)
			case 2: return getBarChart(packagePath, chartName, title, xAxis, yAxis)
			case 3: return getBubbleChart(packagePath, chartName, title, xAxis, yAxis)
			case 4: return getLineChart(packagePath, chartName, title, xAxis, yAxis)
			case 5: return getScatterChart(packagePath, chartName, title, xAxis, yAxis)
			case 6: return getStackedAreaChart(packagePath, chartName, title, xAxis, yAxis)
			case 7: return getDoughnutChart(packagePath, chartName, title, xAxis, yAxis)
			default: {
				return ''
			}
		}
	}
	
	def static String getPieChart(String packagePath, String chartName, String title, String xAxis, String yAxis)'''
	packagePath "«packagePath»"
	
	charts{
		PieChartFX «chartName»{
			title "«title»"
			xAxisLabel "«xAxis»"
			yAxisLabel "«yAxis»"
		}
	}
	'''
	
	def static String getAreaChart(String packagePath, String chartName, String title, String xAxis, String yAxis)'''
	packagePath "«packagePath»"
	
	charts{
		AreaChartFX «chartName»{
			title "«title»"
			xAxisLabel "«xAxis»"
			yAxisLabel "«yAxis»"
		}
	}
	'''
	
	def static String getBarChart(String packagePath, String chartName, String title, String xAxis, String yAxis)'''
	packagePath "«packagePath»"
	
	charts{
		BarChartFX «chartName»{
			title "«title»"
			xAxisLabel "«xAxis»"
			yAxisLabel "«yAxis»"
		}
	}
	'''
	
	def static String getBubbleChart(String packagePath, String chartName, String title, String xAxis, String yAxis)'''
	packagePath "«packagePath»"
	
	charts{
		BubbleChartFX «chartName»{
			title "«title»"
			xAxisLabel "«xAxis»"
			yAxisLabel "«yAxis»"
		}
	}
	'''
	
	def static String getScatterChart(String packagePath, String chartName, String title, String xAxis, String yAxis)'''
	packagePath "«packagePath»"
	
	charts{
		ScatterChartFX «chartName»{
			title "«title»"
			xAxisLabel "«xAxis»"
			yAxisLabel "«yAxis»"
		}
	}
	'''
	
	def static String getStackedAreaChart(String packagePath, String chartName, String title, String xAxis, String yAxis)''''''
	
	def static String getDoughnutChart(String packagePath, String chartName, String title, String xAxis, String yAxis)'''
	packagePath "«packagePath»"
	
	charts{
		DoughnutChartFX «chartName»{
			title "«title»"
			xAxisLabel "«xAxis»"
			yAxisLabel "«yAxis»"
		}
	}
	'''
	
	def static String getLineChart(String packagePath, String chartName, String title, String xAxis, String yAxis)'''
	packagePath "«packagePath»"
	
	charts{
		LineChartFX «chartName»{
			title "«title»"
			xAxisLabel "«xAxis»"
			yAxisLabel "«yAxis»"
		}
	}
	'''
}