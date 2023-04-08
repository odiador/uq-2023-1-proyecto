package application;

import co.edu.uniquindio.concesionariouq.model.Cliente;
import co.edu.uniquindio.concesionariouq.view.principal.EscenaPrincipal;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
//			Scene scene = new EscenaLogin(primaryStage, 440, 440);
			Scene scene = new EscenaPrincipal(primaryStage, new Cliente("", "", "", ""));
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
