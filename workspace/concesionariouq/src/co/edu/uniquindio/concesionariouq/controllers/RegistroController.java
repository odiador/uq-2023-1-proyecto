package co.edu.uniquindio.concesionariouq.controllers;

import java.io.IOException;

import co.edu.uniquindio.concesionariouq.exceptions.AtributosFaltantesException;
import co.edu.uniquindio.concesionariouq.exceptions.NullException;
import co.edu.uniquindio.concesionariouq.exceptions.UsuarioEncontradoException;
import co.edu.uniquindio.concesionariouq.model.Cliente;
import co.edu.uniquindio.concesionariouq.util.FxUtility;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
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
		registrarAction();
	}

	@FXML
	void irIniciarSesionEvent(ActionEvent event) {
		irIniciarSesionAction();
	}

	private void registrarAction() {
		try {
			ModelFactoryController.getInstance().agregarCliente(new Cliente(txtId.getText(), txtNombre.getText(),
					txtContrasena.getText(), txtEmail.getText(), txtRespuesta.getText()));
			FxUtility.mostrarMensaje("Confirmacion", "Has sido registrad@ con exito", "Has sido registrad@ con exito",
					AlertType.CONFIRMATION);
		} catch (UsuarioEncontradoException | NullException | AtributosFaltantesException e) {
			FxUtility.mostrarMensaje("Advertencia", "No te has podido registrar", e.getMessage(), AlertType.ERROR);
		}
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

}
