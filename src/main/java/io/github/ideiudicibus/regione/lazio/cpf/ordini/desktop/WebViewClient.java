package io.github.ideiudicibus.regione.lazio.cpf.ordini.desktop;


import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.web.WebEvent;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

import io.github.ideiudicibus.regione.lazio.cpf.ordini.service.*;
/**
 * 
 * @author ignazio de iudicibus i.deiudicibus@gmail.com
 *
 */
public class WebViewClient extends Application {

	private final String PAGE = "/index.html";

	@Override
	public void start(Stage primaryStage) {
		createWebView(primaryStage, PAGE);
	}

	private void createWebView(Stage primaryStage, String page) {
		
		// create the JavaFX webview
		final WebView webView = new WebView();
       //TODO fetch username and password from properties file Todo grab u,p from a login form, this needs a OrdiniService refactor
        
		String u,p;
		u="F08062";
		p="password";
		// connect the FruitsService instance as "ordiniService" 
		// javascript variable
		Java2JavascriptUtils.connectBackendObject(
				webView.getEngine(),
				"ordiniService", new OrdiniWebServiceWrapperImpl(u,p));
		
		
		
		
		
		// show "alert" Javascript messages in stdout (useful to debug)	
		webView.getEngine().setOnAlert(new EventHandler<WebEvent<String>>(){
			@Override
			public void handle(WebEvent<String> arg0) {
				System.err.println("alertwb1: " + arg0.getData());
			}
		});
		
		// load index.html
		webView.getEngine().load(
				getClass().getResource(page).
				toExternalForm());

		primaryStage.setScene(new Scene(webView));
		primaryStage.setTitle("Client Ordini Regione Lazio Destkop");		
		primaryStage.show();
	}
	
	public static void main(String[] args) {		
		System.setProperty("prism.lcdtext", "false"); // enhance fonts		
		launch(args);
	}
}

