package co.edu.uniquindio.concesionariouq.controllers;

import co.edu.uniquindio.concesionariouq.model.Combustible;
import co.edu.uniquindio.concesionariouq.model.TipoVehiculo;
import co.edu.uniquindio.concesionariouq.view.agregarVehiculo.PanelAgregarMoto;
import co.edu.uniquindio.concesionariouq.view.menu.PanelAgregarVehiculo;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.input.MouseEvent;

public class ControlVehiculos {

	public static void agregarMoto(String string, String string2, String string3, String string4, String string5,
			String string6, String string7, Combustible combustible) {

		new Alert(AlertType.CONFIRMATION, "Moto Agregada").show();
	}

	public static void irACambiarCombustible(PanelAgregarMoto panelAgregarMoto, Combustible combustible) {

	}

	public static void irAgregarVehiculo(PanelAgregarVehiculo panelAgregarVehiculo, String opcionTipoVehiculo,
			EventHandler<? super MouseEvent> eventoVolver) {
		TipoVehiculo tipoVehiculo = TipoVehiculo.obtenerValorTipo(opcionTipoVehiculo);
		if (tipoVehiculo == null) {
			new Alert(AlertType.WARNING, "No se ha encontrado la opcion").show();
			panelAgregarVehiculo.initComp();
			return;
		}

		switch (tipoVehiculo) {
		case MOTO:
			panelAgregarVehiculo.setBottom(null);
			panelAgregarVehiculo.setCenter(new PanelAgregarMoto(eventoVolver));
			break;
		default:
			new Alert(AlertType.WARNING, "No se ha implementado la opcion " + tipoVehiculo.getTipo()).show();
			break;
		}
	}

}
