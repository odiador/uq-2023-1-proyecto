package co.edu.uniquindio.concesionariouq.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.concesionariouq.exceptions.AtributosFaltantesException;
import co.edu.uniquindio.concesionariouq.exceptions.NullException;
import co.edu.uniquindio.concesionariouq.exceptions.VehiculoYaExisteException;
import co.edu.uniquindio.concesionariouq.model.Combustible;
import co.edu.uniquindio.concesionariouq.model.EstadoVehiculo;
import co.edu.uniquindio.concesionariouq.model.Sedan;
import co.edu.uniquindio.concesionariouq.model.TipoCambio;
import co.edu.uniquindio.concesionariouq.util.FxUtility;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;

public class AgregarSedanController {

	@FXML
	private ResourceBundle resources;

	@FXML
	private URL location;

	@FXML
	private Label lblTipoVehiculo;

	@FXML
	private TextField txtModelo;

	@FXML
	private TextField txtVelMaxima;

	@FXML
	private Button btnCombustible;

	@FXML
	private CheckBox checkReversa;

	@FXML
	private ComboBox<String> comboEstado;

	@FXML
	private TextField txtNumBolsas;

	@FXML
	private CheckBox checkABS;

	@FXML
	private CheckBox checkAsistPermanencia;

	@FXML
	private CheckBox checkSensorColision;

	@FXML
	private TextField txtPlaca;

	@FXML
	private CheckBox checkVelCrucero;

	@FXML
	private TextField txtNumPuertas;

	@FXML
	private ComboBox<String> comboCambio;

	@FXML
	private CheckBox checkAireAcondicionado;

	@FXML
	private BorderPane root;

	@FXML
	private CheckBox checkSensorTrafico;

	@FXML
	private TextField txtCapacidadMaletero;

	@FXML
	private TextField txtCilindraje;

	@FXML
	private TextField txtMarca;

	@FXML
	private TextField txtNumPasajeros;

	@FXML
	private Button btnAgregar;

	@FXML
	private Button btnCerrar;

	private Combustible combustible;

	private Runnable actualizarTabla;

	@FXML
	void agregarAction(ActionEvent event) {
		agregarSedan();
	}

	private void agregarSedan() {
		try {
			Image imagen = new Image("/resources/images/vehiculos&/camioneta.png");
			ModelFactoryController.getInstance().agregarVehiculo(new Sedan(txtPlaca.getText().trim(),
					txtMarca.getText().trim(), txtModelo.getText(), Double.parseDouble(txtCilindraje.getText()),
					Double.parseDouble(txtVelMaxima.getText()), combustible,
					EstadoVehiculo.obtenerEstadoTexto(comboEstado.getValue()),
					TipoCambio.obtenerEstadoTexto(comboCambio.getValue()), Integer.parseInt(txtNumPasajeros.getText()),
					Integer.parseInt(txtNumBolsas.getText()), Integer.parseInt(txtNumPuertas.getText()),
					checkAireAcondicionado.isSelected(), checkReversa.isSelected(), checkABS.isSelected(),
					Double.parseDouble(txtCapacidadMaletero.getText()), checkVelCrucero.isSelected(),
					checkSensorColision.isSelected(), checkSensorTrafico.isSelected(),
					checkAsistPermanencia.isSelected(), imagen));
			actualizarTabla.run();
			FxUtility.mostrarMensaje("Informacion", "La camioneta ha sido agregada con exito",
					"La camioneta ha sido agregada con exito", AlertType.CONFIRMATION);
		} catch (NumberFormatException | NullException | AtributosFaltantesException | VehiculoYaExisteException e) {
			FxUtility.mostrarMensaje("Advertencia", "No se pudo agregar la camioneta", e.getMessage(), AlertType.ERROR);
		}
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

	public AgregarSedanController(Combustible combustible, Runnable actualizarTabla) {
		this.combustible = combustible;
		this.actualizarTabla = actualizarTabla;
	}
}
