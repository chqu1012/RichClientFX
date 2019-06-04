package de.dc.javafx.xcore.code.preview.ui;

import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.layout.BorderPane;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

public class FXPreview extends BorderPane implements ChangeListener<Object> {

	private WebEngine engine;

	public FXPreview() {
		Platform.runLater(() -> initWebView());
	}

	private void initWebView() {
		WebView webView = new WebView();
		engine = webView.getEngine();
		engine.setJavaScriptEnabled(true);
		setCenter(webView);

		StringBuilder sb = getCodeContent();
		engine.loadContent(sb.toString(), "text/html");
	}

	private StringBuilder getCodeContent() {
		String code = "public class Person{\n\n public static final String name = \"Hello World\";\n\n}";

		StringBuilder sb = new StringBuilder();
		sb.append("<html>");
		sb.append("<head>");
		sb.append("<link rel=\"stylesheet\" href=\"" + getClass().getResource("styles/default.css") + "\">");
		sb.append("<script src=\"" + getClass().getResource("highlight.pack.js") + "\"></script>");
		sb.append("<script>hljs.initHighlightingOnLoad();</script>");
		sb.append("</head>");
		sb.append("<body>");
		sb.append("<pre><code>" + code + "</code></pre>");
		sb.append("</body>");
		sb.append("</html>");
		return sb;
	}

	@Override
	public void changed(ObservableValue<? extends Object> obs, Object oldValue, Object newValue) {
		StringBuilder sb = getCodeContent();
		engine.loadContent(sb.toString(), "text/html");
	}
}