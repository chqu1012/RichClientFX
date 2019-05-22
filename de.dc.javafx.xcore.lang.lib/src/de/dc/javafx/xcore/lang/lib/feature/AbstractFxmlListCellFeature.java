package de.dc.javafx.xcore.lang.lib.feature;

import java.io.IOException;

import org.apache.log4j.Logger;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.ListCell;

/**
 * Call this class on ListView#setCellFactory(view -> new AbstractFxmlListCellFeature());
 *  
 * @author Dim
 *
 * @param <T>
 */
public abstract class AbstractFxmlListCellFeature<T> extends ListCell<T> {

	private Logger log = Logger.getLogger(AbstractFxmlListCellFeature.class);
    protected FXMLLoader mLLoader;

    @Override
    protected void updateItem(T item, boolean empty) {
        super.updateItem(item, empty);

        if(empty || item == null) {
            setText(null);
            setGraphic(null);

        } else {
            if (mLLoader == null) {
                mLLoader = new FXMLLoader(getClass().getResource(getFxmlPath()));
                mLLoader.setController(this);

                try {
                    mLLoader.load();
                } catch (IOException e) {
                	log.error("Error on loading fxml", e);
                }

            }

            setText(getValue(item));
            setGraphic(getGraphic(item));
        }

    }

	protected abstract String getFxmlPath();

	protected abstract Node getGraphic(T item);

	protected abstract String getValue(T item);
}