package co.edu.uniquindio.concesionariouq.view.agregarVehiculo;

import static co.edu.uniquindio.concesionariouq.util.Utility.generarHBox;

import co.edu.uniquindio.concesionariouq.controllers.ControlVehiculos;
import co.edu.uniquindio.concesionariouq.model.Combustible;
import co.edu.uniquindio.concesionariouq.model.EstadoVehiculo;
import co.edu.uniquindio.concesionariouq.model.TipoCambio;
import co.edu.uniquindio.concesionariouq.util.Boton;
import co.edu.uniquindio.concesionariouq.util.Utility;
import javafx.collections.FXCollections;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;

public class PanelAgregarCamion extends PanelConVolver {
	private EventHandler<? super MouseEvent> eventoVolver;
	private Combustible combustible;

	public PanelAgregarCamion(EventHandler<? super MouseEvent> eventoVolver) {
		this.eventoVolver = eventoVolver;
		initComponents();
	}

	@Override
	public void initComponents() {

		VBox box = new VBox(20);
		TextField tfPlaca = new TextField();
		TextField tfMarca = new TextField();
		TextField tfModelo = new TextField();
		TextField tfCilindraje = new TextField();
		TextField tfVelocidadMax = new TextField();
		Boton botonCombustible = new Boton("Combustible", e -> {
			ControlVehiculos.irACambiarCombustible(this, combustible);
		});
		ComboBox<String> cbEstadoVechiculo = new ComboBox<String>();
		ComboBox<String> cbTipoCambio = new ComboBox<String>();
		TextField tfCCarga = new TextField();
		CheckBox cbTieneAire = new CheckBox();
		CheckBox cbTieneFrenosAire = new CheckBox();
		TextField tfNEjes = new TextField();
		CheckBox cbTieneABS = new CheckBox();
		TextField tfTipoCamion = new TextField();

		box.getChildren().add(generarHBox("Ingresa la placa del vehiculo", tfPlaca));
		box.getChildren().add(generarHBox("Ingresa la marca del vehiculo", tfMarca));
		box.getChildren().add(generarHBox("Ingresa el modelo del vehiculo", tfModelo));
		box.getChildren().add(generarHBox("Ingresa el cilindraje del vehiculo", tfCilindraje));
		box.getChildren().add(generarHBox("Ingresa la velocidad maxima del vehiculo", tfVelocidadMax));
		box.getChildren().add(generarHBox("Seleccione el tipo de combustible", botonCombustible));
		box.getChildren().add(generarHBox("Seleccione el estado del vehiculo", cbEstadoVechiculo));
		box.getChildren().add(generarHBox("Seleccione el tipo de caja de cambios", cbTipoCambio));
		box.getChildren().add(generarHBox("Ingresa capacidad de carga", tfCCarga));
		box.getChildren().add(generarHBox("El vehiculo tiene aire acondicionado ?", cbTieneAire));
		box.getChildren().add(generarHBox("El vehiculo tiene frenos de aire ?", cbTieneFrenosAire));
		box.getChildren().add(generarHBox("Ingrese el numero de ejes del vehiculo", tfNEjes));
		box.getChildren().add(generarHBox("El vehiculo tiene frenos ABS ?", cbTieneABS));
		box.getChildren().add(generarHBox("Ingrese el tipo de camion", tfTipoCamion));

		Utility.setMaximumTextLength(tfPlaca, 6);
		Utility.setAsNumberTextfield(tfModelo);
		Utility.setAsNumberTextfield(tfCilindraje);
		Utility.setAsNumberTextfield(tfVelocidadMax);
		Utility.setAsNumberTextfield(tfCCarga);
		Utility.setAsNumberTextfield(tfNEjes);
		cbEstadoVechiculo.setItems(FXCollections.observableArrayList(EstadoVehiculo.getTextValues()));
		cbTipoCambio.setItems(FXCollections.observableArrayList(TipoCambio.getTextValues()));

		setCenter(box);
		box.setId("centered-box");
		HBox hbox = new HBox();
		Boton botonVolver = new Boton("Volver", eventoVolver);
		Boton botonAgregar = new Boton("Aceptar", e -> {
			ControlVehiculos.agregarCamion(tfPlaca.getText().trim().toUpperCase(), tfMarca.getText().trim(),
					tfModelo.getText().trim(), tfCilindraje.getText().trim(), tfVelocidadMax.getText().trim(),
					combustible, cbEstadoVechiculo.getValue(), cbTipoCambio.getValue(), tfCCarga.getText().trim(),
					cbTieneAire.isSelected(), cbTieneFrenosAire.isSelected(), tfNEjes.getText().trim(),
					cbTieneABS.isSelected(), tfTipoCamion.getText().trim());
		});
		hbox.getChildren().add(botonVolver);
		hbox.getChildren().add(botonAgregar);

		HBox.setMargin(botonAgregar, new Insets(0, 20, 20, 0));
		HBox.setMargin(botonVolver, new Insets(0, 20, 20, 20));

		HBox.setHgrow(botonVolver, Priority.ALWAYS);
		HBox.setHgrow(botonAgregar, Priority.ALWAYS);
		setBottom(hbox);
	}

}
