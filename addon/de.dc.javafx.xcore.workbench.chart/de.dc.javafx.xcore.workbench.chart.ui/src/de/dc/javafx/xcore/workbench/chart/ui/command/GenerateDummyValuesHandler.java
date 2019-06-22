package de.dc.javafx.xcore.workbench.chart.ui.command;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.fx.emf.edit.ui.AdapterFactoryTreeItem;

import de.dc.javafx.xcore.workbench.chart.CategorySeriesFX;
import de.dc.javafx.xcore.workbench.chart.CategoryValueFX;
import de.dc.javafx.xcore.workbench.chart.ChartFactory;
import de.dc.javafx.xcore.workbench.chart.ChartPackage;
import de.dc.javafx.xcore.workbench.chart.SeriesFX;
import de.dc.javafx.xcore.workbench.chart.XYValueFX;
import de.dc.javafx.xcore.workbench.chart.XYZSeriesFX;
import de.dc.javafx.xcore.workbench.chart.XYZValueFX;
import de.dc.javafx.xcore.workbench.chart.ui.view.ChartFXPreview;
import de.dc.javafx.xcore.workbench.di.DIPlatform;
import de.dc.javafx.xcore.workbench.emf.IEmfManager;
import de.dc.javafx.xcore.workbench.emf.event.IEmfSelectionService;
import de.dc.javafx.xcore.workbench.emf.ui.factory.CommandFactory;
import de.dc.javafx.xcore.workbench.event.EmfCommand;
import de.dc.javafx.xcore.workbench.event.EventContext;
import de.dc.javafx.xcore.workbench.event.EventTopic;
import de.dc.javafx.xcore.workbench.event.IEventBroker;

public class GenerateDummyValuesHandler extends EmfCommand{

	public static final String ID = "de.dc.javafx.xcore.workbench.chart.ui.command.GenerateDummyValuesHandler";
	
	private Random random = new Random();
	private IEmfSelectionService selectionService;
	
	@Override
	public void execute() {
		selectionService = DIPlatform.getInstance(IEmfSelectionService.class);
		Optional<AdapterFactoryTreeItem<EObject>> currentSelection = (Optional<AdapterFactoryTreeItem<EObject>>) selectionService.getSelection();
		currentSelection.ifPresent(selection->generate(selection.getValue()));
	}
	
	public void generate(EObject selection) {
		List<EObject> values = new ArrayList<>();
		EObject series = null;
		if (selection instanceof SeriesFX) {
			series = (SeriesFX) selection;
			for (int i = 0; i < 20; i++) {
				XYValueFX value = ChartFactory.eINSTANCE.createXYValueFX();
				value.setX(i+10);
				value.setY(random.nextDouble());
				values.add(value);
			}
		}else if (selection instanceof CategorySeriesFX) {
			series = (CategorySeriesFX) selection;
			for (int i = 0; i < 20; i++) {
				CategoryValueFX value = ChartFactory.eINSTANCE.createCategoryValueFX();
				value.setName("Test "+i);
				value.setValue(random.nextDouble());
				values.add(value);
			}
		}else if (selection instanceof XYZSeriesFX) {
			series = (XYZSeriesFX) selection;
			for (int i = 0; i < 50; i++) {
				XYZValueFX value = ChartFactory.eINSTANCE.createXYZValueFX();
				value.setX(i+5);
				value.setY(random.nextDouble());
				value.setZ(random.nextDouble());
				values.add(value);
			}
			
		}
		
		if (series!=null) {
			IEmfManager<?> emfManager = selectionService.getEmfManager().get();
			Command command = AddCommand.create(emfManager.getEditingDomain(), series, ChartPackage.XY_VALUE_FX, values);
			emfManager.getCommandStack().execute(command);
			
			DIPlatform.getInstance(IEventBroker.class).post(new EventContext<>(EventTopic.COMMAND_STACK_REFRESH, CommandFactory.create(command)));
			DIPlatform.getInstance(IEventBroker.class).post(new EventContext<>(ChartFXPreview.PEVIEW_UPDATE, series.eContainer()));
		}
	}
}