package co.edu.uniquindio.concesionariouq.tests;

import java.util.ArrayList;
import java.util.List;

import co.edu.uniquindio.concesionariouq.controllers.GestionVehiculoController;
import co.edu.uniquindio.concesionariouq.controllers.LoginPageController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class testGestion extends Application{
	@Override
	public void start(Stage primaryStage) {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(getClass().getResource("../view/gestionVehiculo.fxml"));
			loader.setController(new GestionVehiculoController());
			Scene scene = new Scene(loader.load(), 600, 440);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 
	 * @param args
	 * @author juanp
	 */
	public static void main(String[] args) {
		launch(args);
	}
}
