package de.dc.javafx.xcore.workbench.barcode.ui.renderer;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import de.dc.javafx.xcore.workbench.barcode.QRCodeFX;
import de.dc.javafx.xcore.workbench.barcode.util.BarcodeSwitch;
import javafx.embed.swing.SwingFXUtils;
import javafx.scene.image.ImageView;
import uk.org.okapibarcode.backend.Code128;
import uk.org.okapibarcode.backend.HumanReadableLocation;
import uk.org.okapibarcode.backend.QrCode;
import uk.org.okapibarcode.output.Java2DRenderer;

@SuppressWarnings("all")
public class BarcodeRenderer extends BarcodeSwitch {
	
	@Override
	public Object caseQRCodeFX(QRCodeFX object) {
		QrCode barcode = new QrCode();
		barcode.setFontName("Monospaced");
		barcode.setFontSize(16);
		barcode.setModuleWidth(2);
		barcode.setBarHeight(100);
		barcode.setHumanReadableLocation(HumanReadableLocation.BOTTOM);
		barcode.setContent("123456789");

		int width = barcode.getWidth();
		int height = barcode.getHeight();

		BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_BYTE_GRAY);
		
		Graphics2D g2d = image.createGraphics();
		Java2DRenderer renderer = new Java2DRenderer(g2d, 1, Color.WHITE, Color.BLACK);
		renderer.render(barcode);

		ImageView imageView = new ImageView(SwingFXUtils.toFXImage(image, null));
		imageView.minHeight(200);
		imageView.minWidth(200);
		imageView.maxWidth(Double.MAX_VALUE);
		imageView.maxHeight(Double.MAX_VALUE);
		return imageView;
	}
}
