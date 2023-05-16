package co.edu.uniquindio.concesionariouq.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class RegistroController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtId;

    @FXML
    private TextField txtNombre;

    @FXML
    private Button btnVolver;

    @FXML
    private PasswordField txtContrasena;

    @FXML
    private Hyperlink link;

    @FXML
    private TextField txtRespuesta;

    @FXML
    private TextField txtEmail;

    @FXML
    private Button btnRegistrar;

    @FXML
    void initialize() {
    }
}
