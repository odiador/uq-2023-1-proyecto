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
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;

public class PanelAgregarMoto extends PanelConVolver {

	private EventHandler<? super MouseEvent> eventoVolver;
	private Combustible combustible;

	public PanelAgregarMoto(EventHandler<? super MouseEvent> eventoVolver) {
		this.eventoVolver = eventoVolver;
		initComponents();

	}
	
	@Override
	public void initComponents() {
		VBox vBox = new VBox(20);
		TextField tfPlaca = new TextField();
		TextField tfMarca = new TextField();
		TextField tfModelo = new TextField();
		TextField tfCilindraje = new TextField();
		TextField tfVelMaxima = new TextField();
		ComboBox<String> cbEstadoVechiculo = new ComboBox<String>();
		ComboBox<String> cbTipoCambio = new ComboBox<String>();
		Boton botonCombustible = new Boton("Combustible", e -> {
			ControlVehiculos.irACambiarCombustible(this, combustible);
		});
		botonCombustible.setStyle("-fx-pref-width: 400;");

		vBox.getChildren().add(generarHBox("Ingresa la placa de la moto", tfPlaca));
		vBox.getChildren().add(generarHBox("Ingresa la marca", tfMarca));
		vBox.getChildren().add(generarHBox("Ingresa el modelo", tfModelo));
		vBox.getChildren().add(generarHBox("Ingresa el cilindraje", tfCilindraje));
		vBox.getChildren().add(generarHBox("Ingresa la velocidad maxima", tfVelMaxima));
		vBox.getChildren().add(generarHBox("Elige el estado", cbEstadoVechiculo));
		vBox.getChildren().add(generarHBox("Elige el tipo de cambio", cbTipoCambio));
		vBox.getChildren().add(generarHBox("Elige el combustible", botonCombustible));

		Utility.setMaximumTextLength(tfPlaca, 6);
		Utility.setAsNumberTextfield(tfModelo);
		Utility.setAsNumberTextfield(tfCilindraje);
		Utility.setAsNumberTextfield(tfVelMaxima);
		cbEstadoVechiculo.setItems(FXCollections.observableArrayList(EstadoVehiculo.getTextValues()));
		cbTipoCambio.setItems(FXCollections.observableArrayList(TipoCambio.getTextValues()));

		setCenter(vBox);
		vBox.setId("centered-box");
		HBox hbox = new HBox();
		Boton botonVolver = new Boton("Volver", eventoVolver);
		Boton botonAgregar = new Boton("Aceptar", e -> {
			ControlVehiculos.agregarMoto(tfPlaca.getText().trim().toUpperCase(), tfMarca.getText().trim(), tfModelo.getText().trim(),
					tfCilindraje.getText().trim(), tfVelMaxima.getText().trim(), cbEstadoVechiculo.getValue(),
					cbTipoCambio.getValue(), combustible);
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
