package co.edu.uniquindio.concesionariouq.controllers;

import co.edu.uniquindio.concesionariouq.model.Cliente;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class DetalleClienteController {

	@FXML
	private BorderPane mainPane;
	@FXML
	private TextField txtNombre;

	@FXML
	private TextField txtIdentificacion;

	@FXML
	private TextField txtCorreo;

	private Cliente cliente;

	@FXML
	void cerrarEvent(ActionEvent event) {
		cerrarAction();
	}

	@FXML
	void verVehiculosEvent(ActionEvent event) {
		System.out.println(cliente.listarVehiculos()); // TODO cambiar
	}

	@FXML
	void initialize() {
		txtIdentificacion.setText(cliente.getId());
		txtCorreo.setText(cliente.getEmail());
		txtNombre.setText(cliente.getNombre());
	}

	private void cerrarAction() {
		((Stage) mainPane.getScene().getWindow()).close();
	}

	public DetalleClienteController(Cliente cliente) {
		this.cliente = cliente;
	}
}
