package co.edu.uniquindio.concesionariouq.controllers;

import co.edu.uniquindio.concesionariouq.model.Cliente;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class AccionesClienteController {
	@FXML
	void volverEvent(ActionEvent event) {
		volverAction();
	}

	@FXML
	void comprarVehiculoEvent(ActionEvent event) {
	}

	@FXML
	void venderVehiculoEvent(ActionEvent event) {

	}

	@FXML
	void alquilarVehiculoEvent(ActionEvent event) {

	}

	@FXML
	void devolverVehiculoEvent(ActionEvent event) {

	}

	@FXML
	void enviarReporteEvent(ActionEvent event) {

	}

	@FXML
	void verVehiculosEvent(ActionEvent event) {

	}

	private Cliente cliente;
	private Runnable runnableVolver;

	public AccionesClienteController(Cliente cliente, Runnable runnableVolver) {
		this.cliente = cliente;
		this.runnableVolver = runnableVolver;
	}

	private void volverAction() {
		runnableVolver.run();
	}

}
