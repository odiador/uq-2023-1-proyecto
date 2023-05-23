package co.edu.uniquindio.concesionariouq.controllers;

import java.io.IOException;

import co.edu.uniquindio.concesionariouq.model.Usuario;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class CambioContrasenaController {
	@FXML
	private PasswordField txtContrasena;

	@FXML
	private PasswordField txtConfirmContrasena;

	@FXML
	private BorderPane mainPane;

	private Usuario usuario;

	public CambioContrasenaController(Usuario usuario) {
		this.usuario = usuario;
	}

	@FXML
	void cancelarEvent(ActionEvent event) {
		volverAction();
	}

	@FXML
	void cambiarContrasenaEvent(ActionEvent event) {

	}

	private void volverAction() {
		FXMLLoader loader = new FXMLLoader();
		loader.setController(new LoginPageController(usuario.getId()));
		loader.setLocation(getClass().getResource("../view/login.fxml"));
		try {
			Stage stage = (Stage) mainPane.getScene().getWindow();
			stage.setScene(new Scene(loader.load()));
			stage.centerOnScreen();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
