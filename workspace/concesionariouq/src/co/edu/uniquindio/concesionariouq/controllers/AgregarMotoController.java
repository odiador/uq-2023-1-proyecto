package co.edu.uniquindio.concesionariouq.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;

public class AgregarMotoController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtPlaca;

    @FXML
    private Label lblTipoVehiculo;

    @FXML
    private TextField txtModelo;

    @FXML
    private TextField txtVelMaxima;

    @FXML
    private Button btnCombustible;

    @FXML
    private ComboBox<String> comboCambio;

    @FXML
    private ComboBox<String> comboEstado;

    @FXML
    private TextField txtCilindraje;

    @FXML
    private TextField txtMarca;
    
    @FXML
    private BorderPane root;
    
    @FXML
    private Button btnCerrar;
    
    @FXML
    private Button btnAgregar;

    @FXML
    void agregarAction(ActionEvent event) {

    }

    @FXML
    void cerrarAction(ActionEvent event) {

    }

    @FXML
    void combustibleEvent(ActionEvent event) {

    }

    @FXML
    void initialize() {
    }
}

