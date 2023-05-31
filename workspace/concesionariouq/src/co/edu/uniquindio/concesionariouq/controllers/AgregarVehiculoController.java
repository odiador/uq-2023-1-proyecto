package co.edu.uniquindio.concesionariouq.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AgregarVehiculoController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;
    
    @FXML
    private BorderPane root;

    @FXML
    private VBox btnDeportivo;

    @FXML
    private VBox btnCamioneta;

    @FXML
    private VBox btnCamion;

    @FXML
    private VBox btnBus;

    @FXML
    private VBox btnVan;

    @FXML
    private VBox btnPickUp;

    @FXML
    private VBox btnMoto;

    @FXML
    private VBox btnSedan;

    @FXML
    void initialize() {
    }
    
    @FXML
    void busEvent(MouseEvent action) {
    	FXMLLoader loader = new FXMLLoader(getClass().getResource("../view/panelAgregarBus.fxml"));
		AgregarVehiculoController controller = new AgregarVehiculoController();
		loader.setController(controller);
		try {
			Stage stage = (Stage) root.getScene().getWindow();
			Scene scene = new Scene(loader.load(), 1280, 720);
			stage.setScene(scene);
			stage.setMinWidth(760);
			stage.setMinHeight(760);
			stage.centerOnScreen();
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
}
