package de.dc.javafx.xcore.workbench.barcode.ui.renderer;

import java.awt.image.BufferedImage;

import de.dc.javafx.xcore.workbench.barcode.QRCodeFX;
import de.dc.javafx.xcore.workbench.barcode.util.BarcodeSwitch;
import javafx.embed.swing.SwingFXUtils;
import javafx.scene.image.ImageView;
import uk.org.okapibarcode.backend.Code128;
import uk.org.okapibarcode.backend.HumanReadableLocation;
import uk.org.okapibarcode.backend.QrCode;

@SuppressWarnings("all")
public class BarcodeRenderer extends BarcodeSwitch {
	
	@Override
	public Object caseQRCodeFX(QRCodeFX object) {
		Code128 barcode = new Code128();
		barcode.setFontName("Monospaced");
		barcode.setFontSize(16);
		barcode.setModuleWidth(2);
		barcode.setBarHeight(50);
		barcode.setHumanReadableLocation(HumanReadableLocation.BOTTOM);
		barcode.setContent("123456789");

		int width = barcode.getWidth();
		int height = barcode.getHeight();

		BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_BYTE_GRAY);
		ImageView imageView = new ImageView(SwingFXUtils.toFXImage(image, null));
		imageView.minHeight(200);
		imageView.minWidth(200);
		return imageView;
	}
}
