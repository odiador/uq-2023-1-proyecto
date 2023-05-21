package co.edu.uniquindio.concesionariouq.controllers;

import co.edu.uniquindio.concesionariouq.model.Administrador;
import co.edu.uniquindio.concesionariouq.model.Dueno;
import co.edu.uniquindio.concesionariouq.model.Empleado;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;

public class EliminarGeneralController {
	@FXML
	private Button btnEmpleado;

	@FXML
	private Button btnVehiculo;

	@FXML
	private Label lblTipoTexto;

	@FXML
	private Button btnCliente;

	@FXML
	private Label labelTipoMenu;

	@FXML
	private Button btnAdmin;

	@FXML
	void accionVehiculoEvent(ActionEvent event) {
		
	}

	@FXML
	void accionEmpleadoEvent(ActionEvent event) {

	}

	@FXML
	void accionClienteEvent(ActionEvent event) {

	}

	@FXML
	void accionAdminEvent(ActionEvent event) {

	}

	@FXML
	void initialize() {
		lblTipoTexto.setText("eliminar");
		labelTipoMenu.setText("ELIMINAR");
		aplicarRestriccionesEmpleado();
	}

	private Empleado empleado;

	private BorderPane contentPane;

	public EliminarGeneralController(BorderPane contentPane, Empleado empleado) {
		this.contentPane = contentPane;
		this.empleado = empleado;
	}

	public void aplicarRestriccionesEmpleado() {
		if (empleado instanceof Dueno)
			return;
		GridPane.setColumnSpan(btnEmpleado, 2);
		btnAdmin.setVisible(false);
		if (empleado instanceof Administrador)
			return;
		btnEmpleado.setVisible(false);
	}
}
