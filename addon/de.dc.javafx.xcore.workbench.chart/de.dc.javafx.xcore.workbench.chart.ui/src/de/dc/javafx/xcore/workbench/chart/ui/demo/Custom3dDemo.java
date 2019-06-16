package de.dc.javafx.xcore.workbench.chart.ui.demo;

import java.util.ArrayList;
import java.util.List;

import de.dc.javafx.xcore.workbench.chart.ui.demo.Chart3dDemo.Axis;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.PerspectiveCamera;
import javafx.scene.Scene;
import javafx.scene.input.ScrollEvent;
import javafx.scene.paint.Color;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;

public class Custom3dDemo extends Application {

	int size = 400;
	private final Rotate rotateX = new Rotate(20, Rotate.X_AXIS);
	private final Rotate rotateY = new Rotate(-45, Rotate.Y_AXIS);
	private double mousePosX, mousePosY;
	private double mouseOldX, mouseOldY;

	@Override
	public void start(Stage stage) throws Exception {
		Group cube = new Group();

		// size of the cube
		Color color = Color.LIGHTBLUE;

		List<Axis> cubeFaces = new ArrayList<>();
		Axis r;

		// back face
		r = new Axis(size);
		r.setFill(color.deriveColor(0.0, 1.0, (1 - 0.5 * 1), 1.0));
		r.setTranslateX(-0.5 * size);
		r.setTranslateY(-0.5 * size);
		r.setTranslateZ(0.5 * size);

		cubeFaces.add(r);

		// bottom face
		r = new Axis(size);
		r.setFill(color.deriveColor(0.0, 1.0, (1 - 0.4 * 1), 1.0));
		r.setTranslateX(-0.5 * size);
		r.setTranslateY(0);
		r.setRotationAxis(Rotate.X_AXIS);
		r.setRotate(90);

		cubeFaces.add(r);

		// left face
		r = new Axis(size);
		r.setFill(color.deriveColor(0.0, 1.0, (1 - 0.2 * 1), 1.0));
		r.setTranslateX(0);
		r.setTranslateY(-0.5 * size);
		r.setRotationAxis(Rotate.Y_AXIS);
		r.setRotate(90);

		cubeFaces.add(r);

		cube.getChildren().addAll(cubeFaces);
		cube.getTransforms().addAll(rotateX, rotateY);

		cube.setTranslateX(600);
		cube.setTranslateY(400);
		
		Scene scene = new Scene(cube, 1400, 700);
		scene.setCamera(new PerspectiveCamera());

		scene.setOnMousePressed(me -> {
			mouseOldX = me.getSceneX();
			mouseOldY = me.getSceneY();
		});
		scene.setOnMouseDragged(me -> {
			mousePosX = me.getSceneX();
			mousePosY = me.getSceneY();
			rotateX.setAngle(rotateX.getAngle() - (mousePosY - mouseOldY));
			rotateY.setAngle(rotateY.getAngle() + (mousePosX - mouseOldX));
			mouseOldX = mousePosX;
			mouseOldY = mousePosY;

		});

        final double MAX_SCALE = 20.0;
        final double MIN_SCALE = 0.1;

        cube.addEventFilter(ScrollEvent.ANY, new EventHandler<ScrollEvent>() {

            @Override
            public void handle(ScrollEvent event) {

                double delta = 1.2;

                double scale = cube.getScaleX();

                if (event.getDeltaY() < 0) {
                    scale /= delta;
                } else {
                    scale *= delta;
                }

                scale = clamp(scale, MIN_SCALE, MAX_SCALE);

                cube.setScaleX(scale);
                cube.setScaleY(scale);

                event.consume();

            }

        });
		
		stage.setScene(scene);
		stage.show();
	}

    public static double clamp(double value, double min, double max) {
        if (Double.compare(value, min) < 0)
            return min;
        if (Double.compare(value, max) > 0)
            return max;
        return value;
    } 
	
	public static void main(String[] args) {
		launch(args);
	}

}
