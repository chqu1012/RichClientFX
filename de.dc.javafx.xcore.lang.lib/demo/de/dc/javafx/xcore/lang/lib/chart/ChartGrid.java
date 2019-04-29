package de.dc.javafx.xcore.lang.lib.chart;
import javafx.animation.*;
import javafx.application.Application;
import javafx.beans.property.*;
import javafx.event.*;
import javafx.geometry.Pos;
import javafx.scene.*;
import javafx.scene.chart.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.util.Duration;
 
/* 
 * Displays a 4x4 grid of charts.  
 * Clicking on a chart will explode it to fill the grid.
 * Clicking on the same chart again will implode it to return to it's original position.
 */
public class ChartGrid extends Application {
  @Override public void start(Stage stage) {
    stage.setScene(new Scene(createChartGrid(800, 600)));
    stage.show();
  }

  public static void main(String[] args) { launch(args); }
  
  private Pane createChartGrid(double width, double height) {
    GridPane grid = new GridPane();
    grid.setStyle("-fx-background-color: ivory;");

    grid.addRow(0, 
        setChartGridPos(Pos.TOP_LEFT,     createChart()), 
        setChartGridPos(Pos.TOP_RIGHT,    createChart())
    );
    grid.addRow(1, 
        setChartGridPos(Pos.BOTTOM_LEFT,  createChart()), 
        setChartGridPos(Pos.BOTTOM_RIGHT, createChart())
    );
    
    grid.setMinHeight(Pane.USE_PREF_SIZE);
    grid.setPrefSize(width, height);
    grid.setMaxHeight(Pane.USE_PREF_SIZE);
    
    for (final Node node: grid.getChildren()) {
        final Chart chart = (Chart) node;
        chart.setMinHeight(Pane.USE_PREF_SIZE);
        chart.setPrefSize(width / 2, height / 2);
        chart.setMaxHeight(Pane.USE_PREF_SIZE);
    }
    
    return grid;
  }    
  
  private Chart setChartGridPos(final Pos pos, final Chart chart) {
      final BooleanProperty enlarged = new SimpleBooleanProperty(false);

      final TranslateTransition toCenter = new TranslateTransition(Duration.millis(250));
      final ScaleTransition grow = new ScaleTransition(Duration.millis(250), chart);
      grow.setFromX(1); grow.setFromY(1);
      grow.setToX(2);   grow.setToY(2);

      final SequentialTransition explode = new SequentialTransition(chart, toCenter, grow);
      explode.setOnFinished(new EventHandler<ActionEvent>() {
          @Override public void handle(ActionEvent t) {
              chart.getParent().setMouseTransparent(false);
          }
      });

      final TranslateTransition fromCenter = new TranslateTransition(Duration.millis(250));
      final ScaleTransition shrink = new ScaleTransition(Duration.millis(250), chart);
      shrink.setFromX(2); shrink.setFromY(2);
      shrink.setToX(1);   shrink.setToY(1);

      final SequentialTransition implode = new SequentialTransition(chart, shrink, fromCenter);
      implode.setOnFinished(new EventHandler<ActionEvent>() {
          @Override public void handle(ActionEvent t) {
              chart.getParent().setMouseTransparent(false);
          }
      });
      
      chart.setOnMouseClicked(new EventHandler<MouseEvent>() {
          @Override public void handle(MouseEvent t) {
              chart.getParent().setMouseTransparent(true);
              chart.toFront();
              
              if (!enlarged.get()) {
                  toCenter.setByX(
                      chart.getWidth()  / 2 * 
                      ((pos == Pos.TOP_RIGHT   || pos == Pos.BOTTOM_RIGHT) ? -1 : 1)
                  );
                  toCenter.setByY(
                      chart.getHeight()  / 2 * 
                      ((pos == Pos.BOTTOM_LEFT || pos == Pos.BOTTOM_RIGHT) ? -1 : 1)
                  );
                  explode.play();
              } else {
                  fromCenter.setByX(
                      chart.getWidth()  / 2 * 
                      ((pos == Pos.TOP_RIGHT   || pos == Pos.BOTTOM_RIGHT) ? 1 : -1)
                  );
                  fromCenter.setByY(
                      chart.getHeight()  / 2 * 
                      ((pos == Pos.BOTTOM_LEFT || pos == Pos.BOTTOM_RIGHT) ? 1 : -1)
                  );
                  implode.play();
              }
              
              enlarged.set(!enlarged.get());
          }
      });
      
      switch (pos) {
          case TOP_LEFT:     chart.setStyle("-fx-background-color: lemonchiffon"); break;
          case TOP_RIGHT:    chart.setStyle("-fx-background-color: aliceblue");    break;
          case BOTTOM_LEFT:  chart.setStyle("-fx-background-color: aliceblue");    break;
          case BOTTOM_RIGHT: chart.setStyle("-fx-background-color: lemonchiffon"); break;
      }
      
      return chart;
  }

  private LineChart<Number, Number> createChart() {
    final NumberAxis xAxis = new NumberAxis();
    final NumberAxis yAxis = new NumberAxis();
    xAxis.setLabel("Number of Month");
    final LineChart<Number,Number> lineChart = new LineChart<>(xAxis,yAxis);
    lineChart.setTitle("Stock Monitoring, 2010");
    XYChart.Series series = new XYChart.Series();
    series.setName("My portfolio");
    series.getData().addAll(
        new XYChart.Data(1, 23),
        new XYChart.Data(2, 14),
        new XYChart.Data(3, 15),
        new XYChart.Data(4, 24),
        new XYChart.Data(5, 34),
        new XYChart.Data(6, 36),
        new XYChart.Data(7, 22),
        new XYChart.Data(8, 45),
        new XYChart.Data(9, 43),
        new XYChart.Data(10, 17),
        new XYChart.Data(11, 29),
        new XYChart.Data(12, 25)
    );
    lineChart.getData().add(series);
    
    return lineChart;
  }
}