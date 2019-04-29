package de.dc.javafx.xcore.lang.lib.plotter;
import javafx.animation.*;
import javafx.application.Application;
import javafx.beans.property.DoubleProperty;
import javafx.collections.*;
import javafx.event.*;
import javafx.scene.*;
import javafx.scene.control.ToggleButton;
import javafx.scene.effect.Glow;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 * Example of drawing text along a cubic curve.
 * Drag the anchors around to change the curve.
 */
public class BezierTextPlotter extends Application {
    private static final String CURVED_TEXT = "Bézier Curve";

    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(final Stage stage) throws Exception {
        final CubicCurve curve = createStartingCurve();

        Line controlLine1 = new BoundLine(curve.controlX1Property(), curve.controlY1Property(), curve.startXProperty(), curve.startYProperty());
        Line controlLine2 = new BoundLine(curve.controlX2Property(), curve.controlY2Property(), curve.endXProperty(), curve.endYProperty());

        Anchor start = new Anchor(Color.PALEGREEN, curve.startXProperty(), curve.startYProperty());
        Anchor control1 = new Anchor(Color.GOLD, curve.controlX1Property(), curve.controlY1Property());
        Anchor control2 = new Anchor(Color.GOLDENROD, curve.controlX2Property(), curve.controlY2Property());
        Anchor end = new Anchor(Color.TOMATO, curve.endXProperty(), curve.endYProperty());

        final Text text = new Text(CURVED_TEXT);
        text.setStyle("-fx-font-size: 40px");
        text.setEffect(new Glow());
        final ObservableList<Text> parts = FXCollections.observableArrayList();
        final ObservableList<PathTransition> transitions = FXCollections.observableArrayList();
        for (char character : text.textProperty().get().toCharArray()) {
            Text part = new Text(character + "");
            part.setEffect(text.getEffect());
            part.setStyle(text.getStyle());
            parts.add(part);
            part.setVisible(false);

            transitions.add(createPathTransition(curve, part));
        }

        final ObservableList<Node> controls = FXCollections.observableArrayList();
        controls.setAll(controlLine1, controlLine2, curve, start, control1, control2, end);

        final ToggleButton plot = new ToggleButton("Plot Text");
        plot.setOnAction(new PlotHandler(plot, parts, transitions, controls));

        Group content = new Group(controlLine1, controlLine2, curve, start, control1, control2, end, plot);
        content.getChildren().addAll(parts);

        stage.setTitle("Cubic Curve Manipulation Sample");
        stage.setScene(new Scene(content, 400, 400, Color.ALICEBLUE));
        stage.show();
    }

    private PathTransition createPathTransition(CubicCurve curve, Text text) {
        final PathTransition transition = new PathTransition(Duration.seconds(10), curve, text);

        transition.setAutoReverse(false);
        transition.setCycleCount(PathTransition.INDEFINITE);
        transition.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        transition.setInterpolator(Interpolator.LINEAR);

        return transition;
    }

    private CubicCurve createStartingCurve() {
        CubicCurve curve = new CubicCurve();
        curve.setStartX(50);
        curve.setStartY(200);
        curve.setControlX1(150);
        curve.setControlY1(300);
        curve.setControlX2(250);
        curve.setControlY2(50);
        curve.setEndX(350);
        curve.setEndY(150);
        curve.setStroke(Color.FORESTGREEN);
        curve.setStrokeWidth(4);
        curve.setStrokeLineCap(StrokeLineCap.ROUND);
        curve.setFill(Color.CORNSILK.deriveColor(0, 1.2, 1, 0.6));
        return curve;
    }

    class BoundLine extends Line {
        BoundLine(DoubleProperty startX, DoubleProperty startY, DoubleProperty endX, DoubleProperty endY) {
            startXProperty().bind(startX);
            startYProperty().bind(startY);
            endXProperty().bind(endX);
            endYProperty().bind(endY);
            setStrokeWidth(2);
            setStroke(Color.GRAY.deriveColor(0, 1, 1, 0.5));
            setStrokeLineCap(StrokeLineCap.BUTT);
            getStrokeDashArray().setAll(10.0, 5.0);
        }
    }

    // a draggable anchor displayed around a point.
    class Anchor extends Circle {
        Anchor(Color color, DoubleProperty x, DoubleProperty y) {
            super(x.get(), y.get(), 10);
            setFill(color.deriveColor(1, 1, 1, 0.5));
            setStroke(color);
            setStrokeWidth(2);
            setStrokeType(StrokeType.OUTSIDE);

            x.bind(centerXProperty());
            y.bind(centerYProperty());
            enableDrag();
        }

        // make a node movable by dragging it around with the mouse.
        private void enableDrag() {
            final Delta dragDelta = new Delta();
            setOnMousePressed(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent mouseEvent) {
                    // record a delta distance for the drag and drop operation.
                    dragDelta.x = getCenterX() - mouseEvent.getX();
                    dragDelta.y = getCenterY() - mouseEvent.getY();
                    getScene().setCursor(Cursor.MOVE);
                }
            });
            setOnMouseReleased(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent mouseEvent) {
                    getScene().setCursor(Cursor.HAND);
                }
            });
            setOnMouseDragged(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent mouseEvent) {
                    double newX = mouseEvent.getX() + dragDelta.x;
                    if (newX > 0 && newX < getScene().getWidth()) {
                        setCenterX(newX);
                    }
                    double newY = mouseEvent.getY() + dragDelta.y;
                    if (newY > 0 && newY < getScene().getHeight()) {
                        setCenterY(newY);
                    }
                }
            });
            setOnMouseEntered(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent mouseEvent) {
                    if (!mouseEvent.isPrimaryButtonDown()) {
                        getScene().setCursor(Cursor.HAND);
                    }
                }
            });
            setOnMouseExited(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent mouseEvent) {
                    if (!mouseEvent.isPrimaryButtonDown()) {
                        getScene().setCursor(Cursor.DEFAULT);
                    }
                }
            });
        }

        // records relative x and y co-ordinates.
        private class Delta {
            double x, y;
        }
    }

    // plots text along a path defined by provided bezier control points.
    private static class PlotHandler implements EventHandler<ActionEvent> {
        private final ToggleButton plot;
        private final ObservableList<Text> parts;
        private final ObservableList<PathTransition> transitions;
        private final ObservableList<Node> controls;

        public PlotHandler(ToggleButton plot, ObservableList<Text> parts, ObservableList<PathTransition> transitions, ObservableList<Node> controls) {
            this.plot = plot;
            this.parts = parts;
            this.transitions = transitions;
            this.controls = controls;
        }

        @Override
        public void handle(ActionEvent actionEvent) {
            if (plot.isSelected()) {
                for (int i = 0; i < parts.size(); i++) {
                    parts.get(i).setVisible(true);
                    final Transition transition = transitions.get(i);
                    transition.stop();
                    transition.jumpTo(Duration.seconds(10).multiply((i + 0.5) * 1.0 / parts.size()));
                    // just play a single animation frame to display the curved text, then stop
                    AnimationTimer timer = new AnimationTimer() {
                        int frameCounter = 0;

                        @Override
                        public void handle(long l) {
                            frameCounter++;
                            if (frameCounter == 1) {
                                transition.stop();
                                stop();
                            }
                        }
                    };
                    timer.start();
                    transition.play();
                }
                plot.setText("Show Controls");
            } else {
                plot.setText("Plot Text");
            }

            for (Node control : controls) {
                control.setVisible(!plot.isSelected());
            }

            for (Node part : parts) {
                part.setVisible(plot.isSelected());
            }
        }
    }
}