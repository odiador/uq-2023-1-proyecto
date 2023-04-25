package co.edu.uniquindio.concesionariouq.view.agregarVehiculo;

import static co.edu.uniquindio.concesionariouq.util.Utility.generarHBox;

import co.edu.uniquindio.concesionariouq.controllers.ControlVehiculos;
import co.edu.uniquindio.concesionariouq.model.Combustible;
import co.edu.uniquindio.concesionariouq.model.EstadoVehiculo;
import co.edu.uniquindio.concesionariouq.model.TipoCambio;
import co.edu.uniquindio.concesionariouq.util.Boton;
import javafx.collections.FXCollections;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Spinner;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;

public class PanelAgregarPickUp extends PanelConVolver {
	private EventHandler<? super MouseEvent> eventoVolver;
	private Combustible combustible;

	public PanelAgregarPickUp(EventHandler<? super MouseEvent> eventoVolver) {
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
		ComboBox<String> cbEstadoVechiculo = new ComboBox<String>();
		ComboBox<String> cbTipoCambio = new ComboBox<String>();
		Boton botonCombustible = new Boton("Combustible", e -> {
			ControlVehiculos.irACambiarCombustible(this, combustible);
		});
		Spinner<Integer> tfNPasajeros = new Spinner<Integer>();
		Spinner<Integer> tfNBolsasAire = new Spinner<Integer>();
		Spinner<Integer> tfNPuertas = new Spinner<Integer>();
		CheckBox cbTieneAire = new CheckBox();
		CheckBox cbTieneCamara = new CheckBox();
		CheckBox cbTieneABS = new CheckBox();
		CheckBox cbEs4x4 = new CheckBox();
		TextField tfCCarga = new TextField();

		box.getChildren().add(generarHBox("Ingresa la placa del vehiculo", tfPlaca));
		box.getChildren().add(generarHBox("Ingresa la marca del vehiculo", tfMarca));
		box.getChildren().add(generarHBox("Ingresa el modelo del vehiculo", tfModelo));
		box.getChildren().add(generarHBox("Ingresa el cilindraje del vehiculo", tfCilindraje));
		box.getChildren().add(generarHBox("Ingresa la velocidad maxima del vehiculo", tfVelocidadMax));
		box.getChildren().add(generarHBox("Selecciona el estado del vehiculo", cbEstadoVechiculo));
		box.getChildren().add(generarHBox("Selecciona el tipo de caja de cambios", cbTipoCambio));
		box.getChildren().add(generarHBox("Seleccione el tipo de combustible", botonCombustible));
		box.getChildren().add(generarHBox("Ingresa el numero de pasajeros", tfNPasajeros));
		box.getChildren().add(generarHBox("Ingresa el numero de bolsas de aire", tfNBolsasAire));
		box.getChildren().add(generarHBox("Ingresa el numero de puertas", tfNPuertas));
		box.getChildren().add(generarHBox("El vehiculo tiene aire acondicionado ?", cbTieneAire));
		box.getChildren().add(generarHBox("El vehiculo tiene camara de reversa ?", cbTieneCamara));
		box.getChildren().add(generarHBox("El vehiculo tiene frenos ABS ?", cbTieneABS));
		box.getChildren().add(generarHBox("El vehiculo es 4x4 ?", cbEs4x4));
		box.getChildren().add(generarHBox("Ingrese la capacidad de carga", tfCCarga));

		cbEstadoVechiculo.setItems(FXCollections.observableArrayList(EstadoVehiculo.getTextValues()));
		cbTipoCambio.setItems(FXCollections.observableArrayList(TipoCambio.getTextValues()));

		setCenter(box);
		box.setId("centered-box");
		HBox hbox = new HBox();
		Boton botonVolver = new Boton("Volver", eventoVolver);
		Boton botonAgregar = new Boton("Aceptar", e -> {
			ControlVehiculos.agregarPickUp(tfPlaca.getText().trim(), tfMarca.getText().trim(),
					tfModelo.getText().trim(), tfCilindraje.getText().trim(), tfVelocidadMax.getText().trim(),
					combustible, cbEstadoVechiculo.getValue(), cbTipoCambio.getValue(), tfNPasajeros.getValue().toString(),
					tfNBolsasAire.getValue().toString(), tfNPuertas.getValue().toString(), cbTieneAire.isSelected(),
					cbTieneCamara.isSelected(), cbTieneABS.isSelected(), cbEs4x4.isSelected(),
					tfCCarga.getText().trim());
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
