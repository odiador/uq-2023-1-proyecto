package co.edu.uniquindio.concesionariouq.controllers;

import java.io.IOException;

import co.edu.uniquindio.concesionariouq.model.Empleado;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class LoginPageController {
	@FXML
	private PasswordField txtContrasena;

	@FXML
	private VBox mainPane;

	@FXML
	private TextField txtIdentificacion;

	@FXML
	void contrasenaOlvidadaEvent(ActionEvent event) {

	}

	@FXML
	void registrarEvent(ActionEvent event) {
		registrarAction();
	}

	private void registrarAction() {
		FXMLLoader loader = new FXMLLoader();
		RegistroController controller = new RegistroController();
		loader.setController(controller);
		loader.setLocation(getClass().getResource("../view/register.fxml"));
		Stage stage = (Stage) mainPane.getScene().getWindow();
		try {
			Scene scene = new Scene(loader.load(), 600, 420);
			controller.getTxtId().setText(getTxtIdentificacion().getText());
			stage.setScene(scene);
			stage.centerOnScreen();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@FXML
	void loginEvent(ActionEvent event) {
		loginAction();
	}

	private void loginAction() {
		FXMLLoader loader = new FXMLLoader();
		MenuPrincipalController controller = new MenuPrincipalController(
				new Empleado("10", "Juan", "1234", "juanm.amadorr@uqvirtual.edu.co"));
		loader.setController(controller);
		loader.setLocation(getClass().getResource("../view/panelPrincipal.fxml"));
		try {
			Stage stage = (Stage) mainPane.getScene().getWindow();
			Scene scene = new Scene(loader.load(), 1280, 720);
			controller.updateNameField();
			stage.setScene(scene);
			stage.setMinWidth(760);
			stage.setMinHeight(500);
			stage.centerOnScreen();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@FXML
	void cerrarEvent(ActionEvent event) {
		cerrarAction();
	}

	private void cerrarAction() {
		((Stage) mainPane.getScene().getWindow()).close();
	}

	@FXML
	void initialize() {

	}

	/**
	 * @return the txtIdentificacion
	 */
	public TextField getTxtIdentificacion() {
		return txtIdentificacion;
	}
}
