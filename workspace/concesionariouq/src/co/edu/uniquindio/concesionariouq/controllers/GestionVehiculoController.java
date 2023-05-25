package co.edu.uniquindio.concesionariouq.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.concesionariouq.model.EstadoVehiculo;
import co.edu.uniquindio.concesionariouq.model.TipoCambio;
import co.edu.uniquindio.concesionariouq.model.TipoCombustible;
import co.edu.uniquindio.concesionariouq.model.Vehiculo;
import javafx.beans.property.ReadOnlyStringWrapper;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class GestionVehiculoController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableColumn<Vehiculo, String> colMarca;

    @FXML
    private TextField txtVelocidad;

    @FXML
    private TextField txtModelo;

    @FXML
    private TableColumn<Vehiculo, String> colEstado;

    @FXML
    private ComboBox<TipoCambio> cajaCambios;

    @FXML
    private TableView<Vehiculo> tablaVehiculos;

    @FXML
    private TableColumn<Vehiculo, String> colModelo;

    @FXML
    private ComboBox<EstadoVehiculo> cajaEstado;

    @FXML
    private TableColumn<Vehiculo, String> colId;

    @FXML
    private TableColumn<Vehiculo, String> colCaja;

    @FXML
    private TextField txtId;

    @FXML
    private TableColumn<Vehiculo, String> colCilindraje;

    @FXML
    private TableColumn<Vehiculo, String> colVelocidad;

    @FXML
    private ComboBox<TipoCombustible> cajaCombustible;

    @FXML
    private Button btnFiltrar;

    @FXML
    private Button btnEliminar;

    @FXML
    private TextField txtCilindraje;

    @FXML
    private TableColumn<Vehiculo, String> colCombustible;

    @FXML
    private TextField txtMarca;
    
    @FXML
    void initialize() {
    	cajaCambios.setItems(FXCollections.observableList(TipoCambio.getValues()));
    	cajaCombustible.setItems(FXCollections.observableList(TipoCombustible.getValues()));
    	cajaEstado.setItems(FXCollections.observableList(EstadoVehiculo.getValues()));
    	
    	//colId.setCellValueFactory(e -> ReadOnlyStringWrapper(e.getValue().getI));
    	colMarca.setCellValueFactory(e ->new ReadOnlyStringWrapper(e.getValue().getMarca()));
    	colModelo.setCellValueFactory(e ->new ReadOnlyStringWrapper(e.getValue().getModelo()));
    	colCilindraje.setCellValueFactory(e ->new ReadOnlyStringWrapper(String.format("%.2f", e.getValue().getCilindraje())));
    	//colCombustible.setCellValueFactory(e ->new ReadOnlyStringWrapper(e.getValue().getCombustible()));
    	colEstado.setCellValueFactory(e ->new ReadOnlyStringWrapper(e.getValue().getEstado().getText()));
    	colCaja.setCellValueFactory(e ->new ReadOnlyStringWrapper(e.getValue().getTipo().getText()));
    	colVelocidad.setCellValueFactory(e ->new ReadOnlyStringWrapper(String.format("%.2f", e.getValue().getVelocidadMaxima())));
    	actualizarTabla();
    }
    
    private void actualizarTabla() {
		tablaVehiculos.setItems(FXCollections.observableArrayList(ModelFactoryController.getInstance().listarVehiculo()));
		tablaVehiculos.refresh();
	}
}

