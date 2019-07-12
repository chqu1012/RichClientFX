package de.dc.javafx.xcore.workbench.mesh.ui.renderer;

import java.util.ArrayList;
import java.util.List;

import de.dc.javafx.xcore.workbench.chart.ui.demo.Chart3dDemo.Axis;
import de.dc.javafx.xcore.workbench.mesh.BoxFX;
import de.dc.javafx.xcore.workbench.mesh.CameraFX;
import de.dc.javafx.xcore.workbench.mesh.CoordinateSystem;
import de.dc.javafx.xcore.workbench.mesh.CylinderFX;
import de.dc.javafx.xcore.workbench.mesh.MeshNode;
import de.dc.javafx.xcore.workbench.mesh.PointLightFX;
import de.dc.javafx.xcore.workbench.mesh.SphereFX;
import de.dc.javafx.xcore.workbench.mesh.util.MeshSwitch;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.PerspectiveCamera;
import javafx.scene.PointLight;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.ScrollEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Box;
import javafx.scene.shape.Cylinder;
import javafx.scene.shape.Sphere;
import javafx.scene.transform.Rotate;

public class MeshRenderer extends MeshSwitch<Node> {

	int size = 400;
	private final Rotate rotateX = new Rotate(20, Rotate.X_AXIS);
	private final Rotate rotateY = new Rotate(-45, Rotate.Y_AXIS);
	private double mousePosX, mousePosY;
	private double mouseOldX, mouseOldY;

	private final double MAX_SCALE = 20.0;
	private final double MIN_SCALE = 0.1;

	@Override
	public Node caseCameraFX(CameraFX object) {
		PerspectiveCamera camera = new PerspectiveCamera(false);
		camera.setTranslateX(object.getTranslateX());
		camera.setTranslateY(object.getTranslateY());
		camera.setTranslateZ(object.getTranslateZ());
		return camera;
	}

	@Override
	public Node casePointLightFX(PointLightFX object) {
		PointLight light = new PointLight();
		light.setTranslateX(object.getTranslateX());
		light.setTranslateY(object.getTranslateY());
		light.setTranslateZ(object.getTranslateZ());
		return light;
	}

	@Override
	public Node caseCylinderFX(CylinderFX object) {
		Group group = createGroup(object);
		Cylinder cylinder = new Cylinder(object.getRadius(), object.getHeight());
		cylinder.setTranslateX(object.getTranslateX());
		cylinder.setTranslateY(object.getTranslateY());
		cylinder.setTranslateZ(object.getTranslateZ());
		group.getChildren().add(cylinder);
		return group;
	}

	@Override
	public Node caseSphereFX(SphereFX object) {
		Group group = createGroup(object);
		Sphere sphere = new Sphere(object.getRadius());
		sphere.setTranslateX(object.getTranslateX());
		sphere.setTranslateY(object.getTranslateY());
		sphere.setTranslateZ(object.getTranslateZ());
		group.getChildren().add(sphere);
		return group;
	}

	@Override
	public Node caseBoxFX(BoxFX object) {
		Group group = createGroup(object);
		Box box = new Box(object.getWidth(), object.getHeight(), object.getDepth());
		box.setTranslateX(object.getTranslateX());
		box.setTranslateY(object.getTranslateY());
		box.setTranslateZ(object.getTranslateZ());
		group.getChildren().add(box);
		return group;
	}

	public Group createGroup(MeshNode node) {
		Group group = new Group();
		group.getTransforms().addAll(rotateX, rotateY);
		group.setOnMousePressed(me -> {
			mouseOldX = me.getSceneX();
			mouseOldY = me.getSceneY();
		});
		group.setOnMouseDragged(me -> {
			if (node.isUseRotation()) {
				mousePosX = me.getSceneX();
				mousePosY = me.getSceneY();
				rotateX.setAngle(rotateX.getAngle() + (mousePosY - mouseOldY));
				rotateY.setAngle(rotateY.getAngle() - (mousePosX - mouseOldX));
				mouseOldX = mousePosX;
				mouseOldY = mousePosY;
			}
		});

		enableZooming(group);
		return group;
	}

	private Axis createAxis(double width, double translateX, double translateY, double translateZ) {
		Axis a = new Axis(width);
		a.setTranslateX(translateX * width);
		a.setTranslateY(translateY * width);
		a.setTranslateZ(translateZ * width);
		return a;
	}

	@Override
	public Node caseCoordinateSystem(CoordinateSystem object) {
		Group group = createGroup(object);

		Color color = Color.BLUE;
		List<Axis> cubeFaces = new ArrayList<>();

		// Back
		Axis zAxis = createAxis(object.getZAxisWidth(), -0.5, -0.5, 0.5);
		zAxis.setFill(color.deriveColor(0.0, 1.0, (1 - 0.5 * 1), 1.0));
		cubeFaces.add(zAxis);
		// Bottom
		Axis xAxis = createAxis(object.getXAxisWidth(), -0.5, 0, 0);
		color = Color.RED;
		xAxis.setFill(color.deriveColor(0.0, 1.0, (1 - 0.4 * 1), 1.0));
		xAxis.setRotationAxis(Rotate.X_AXIS);
		xAxis.setRotate(90);
		cubeFaces.add(xAxis);
		// Left
		Axis yAxis = createAxis(object.getYAxisWidth(), 0, -0.5, 0);
		color = Color.GREEN;
		yAxis.setFill(color.deriveColor(0.0, 1.0, (1 - 0.4 * 1), 1.0));
		yAxis.setRotationAxis(Rotate.Y_AXIS);
		yAxis.setRotate(90);
		cubeFaces.add(yAxis);

		group.getChildren().addAll(cubeFaces);
		group.getTransforms().addAll(rotateX, rotateY);

		group.setTranslateX(object.getTranslateX());
		group.setTranslateY(object.getTranslateY());
		group.setTranslateZ(object.getTranslateZ());

		object.getShapes().forEach(e -> group.getChildren().add(doSwitch(e)));
		return group;
	}

	private void enableZooming(Group group) {
		group.addEventFilter(ScrollEvent.ANY, event -> {
			double delta = 1.2;
			double scale = group.getScaleX();
			if (event.getDeltaY() < 0) {
				scale /= delta;
			} else {
				scale *= delta;
			}
			scale = clamp(scale, MIN_SCALE, MAX_SCALE);
			group.setScaleX(scale);
			group.setScaleY(scale);
			event.consume();
		});
	}

	public double clamp(double value, double min, double max) {
		if (Double.compare(value, min) < 0)
			return min;
		if (Double.compare(value, max) > 0)
			return max;
		return value;
	}
}
