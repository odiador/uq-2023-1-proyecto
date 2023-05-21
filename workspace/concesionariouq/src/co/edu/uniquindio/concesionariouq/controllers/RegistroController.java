package co.edu.uniquindio.concesionariouq.controllers;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class RegistroController {

	@FXML
	private BorderPane mainPane;

	@FXML
	private TextField txtId;

	@FXML
	private TextField txtNombre;

	@FXML
	private PasswordField txtContrasena;

	@FXML
	private Hyperlink link;

	@FXML
	private TextField txtRespuesta;

	@FXML
	private TextField txtEmail;

	private String id;

	public RegistroController(String id) {
		this.id = id;
	}

	@FXML
	void initialize() {
		txtId.setText(id == null ? "" : id);
	}

	@FXML
	void volverEvent(ActionEvent event) {
		irIniciarSesionAction();
	}

	@FXML
	void registrarEvent(ActionEvent event) {

	}

	@FXML
	void irIniciarSesionEvent(ActionEvent event) {
		irIniciarSesionAction();
	}

	private void irIniciarSesionAction() {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(getClass().getResource("../view/login.fxml"));
		LoginPageController controller = new LoginPageController(txtId.getText());
		loader.setController(controller);
		try {
			Stage stage = (Stage) mainPane.getScene().getWindow();
			stage.setScene(new Scene(loader.load(), 600, 440));
			stage.centerOnScreen();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @return the txtId
	 */
	public TextField getTxtId() {
		return txtId;
	}

}
