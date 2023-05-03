package co.edu.uniquindio.concesionariouq.controllers;

import co.edu.uniquindio.concesionariouq.exceptions.CampoException;
import co.edu.uniquindio.concesionariouq.model.Combustible;
import co.edu.uniquindio.concesionariouq.util.PanelConVolver;
import co.edu.uniquindio.concesionariouq.model.Diesel;
import co.edu.uniquindio.concesionariouq.model.Electrico;
import co.edu.uniquindio.concesionariouq.model.Gasolina;
import co.edu.uniquindio.concesionariouq.model.Hibrido;
import co.edu.uniquindio.concesionariouq.util.Boton;
import co.edu.uniquindio.concesionariouq.view.menu.PanelCombustible;
import co.edu.uniquindio.concesionariouq.view.menu.PanelElectrico;
import co.edu.uniquindio.concesionariouq.view.menu.PanelHibrido;
import co.edu.uniquindio.concesionariouq.view.menu.TipoCombustible;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.geometry.Insets;
import javafx.scene.control.ScrollPane;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.stage.Stage;

public class ControlCombustible {
	public static void irACambiarCombustible(PanelConVolver panel, Combustible combustible,
			EventHandler<? super MouseEvent> event) {
		PanelConVolver panelConVolver = new PanelCombustible();
		panel.setCenter(panelConVolver);
	}

	public static void actualizarValorThrows(PanelCombustible panelCombustible, String valorNuevo)
			throws CampoException {
		TipoCombustible tipoCombustible = TipoCombustible.getTipo(valorNuevo);
		if (tipoCombustible == null) {
			throw new CampoException("Recuerda llenar todos los campos");
		}
		switch (tipoCombustible) {
		case ELECTRICO:
			panelCombustible.mostrarCamposElectricos();
			break;
		case HIBRIDO:
			panelCombustible.mostrarCamposHibridos();
			break;
		default:
			panelCombustible.comboInicial();
			break;
		}

	}

	public static void actualizarValor(PanelCombustible panelCombustible, String valorNuevo) {
		try {
			actualizarValorThrows(panelCombustible, valorNuevo);
		} catch (CampoException e) {

		}
	}

	public static void irCombustibles(PanelConVolver panel, String valorCombustible,
			EventHandler<? super MouseEvent> eventoVolver) {
		TipoCombustible tipoCombustible = TipoCombustible.getTipo(valorCombustible);
		PanelConVolver panelConVolver = null;

		switch (tipoCombustible) {
		case ELECTRICO:
			panelConVolver = new PanelElectrico();
			panel.setCenter(panelConVolver);
			break;
		case HIBRIDO:
			panelConVolver = new PanelHibrido();
			break;
		case DIESEL:

			break;
		case GASOLINA:

			break;

		default:
			break;
		}

		((Stage) panel.getScene().getWindow()).setTitle("Agregar " + valorCombustible + " | Concesionario UQ");

		HBox hbox = new HBox();
		ScrollPane scrollPane = new ScrollPane(panelConVolver);
		scrollPane.setId("centered-box");
		scrollPane.setBorder(null);
		scrollPane.setFitToHeight(true);
		scrollPane.setFitToWidth(true);

		Boton botonVolver = new Boton("Volver", eventoVolver);
		Boton botonAgregar = new Boton("Agregar", panelConVolver);

		hbox.getChildren().add(botonVolver);
		hbox.getChildren().add(botonAgregar);

		Insets insets = new Insets(10, 10, 10, 10);
		HBox.setMargin(botonAgregar, insets);
		HBox.setMargin(botonVolver, insets);

		HBox.setHgrow(botonVolver, Priority.ALWAYS);
		HBox.setHgrow(botonAgregar, Priority.ALWAYS);

		panel.setCenter(scrollPane);
		panel.setBottom(hbox);
	}

	public static Combustible obtenerCombustible(String tipoCombustibleString, String autonomiaElectricoString,
			String tiempoElectricoString, boolean esHibridoEnchufable, boolean esHibridoLigero) {
		TipoCombustible tipoCombustible = TipoCombustible.getTipo(tipoCombustibleString);
		if (tipoCombustible == null)
			return null;
		switch (tipoCombustible) {
		case DIESEL:
			return new Diesel();
		case ELECTRICO:
			double autonomia = Double.parseDouble(autonomiaElectricoString);
			double tiempo = Double.parseDouble(tiempoElectricoString);
			return new Electrico(autonomia, tiempo);
		case GASOLINA:
			return new Gasolina();
		case HIBRIDO:
			return new Hibrido(esHibridoEnchufable, esHibridoLigero);
		}
		return null;
	}
}
