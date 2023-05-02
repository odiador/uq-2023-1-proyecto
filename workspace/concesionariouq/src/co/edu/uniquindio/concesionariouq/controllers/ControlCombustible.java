package co.edu.uniquindio.concesionariouq.controllers;

import co.edu.uniquindio.concesionariouq.exceptions.CampoException;
import co.edu.uniquindio.concesionariouq.model.Combustible;
import co.edu.uniquindio.concesionariouq.util.Utility;
import co.edu.uniquindio.concesionariouq.view.agregarVehiculo.PanelConVolver;
import co.edu.uniquindio.concesionariouq.view.menu.PanelCombustible;
import co.edu.uniquindio.concesionariouq.view.menu.TipoCombustible;
import javafx.event.EventHandler;
import javafx.scene.input.*;

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

	}

	public static void actualizarValor(PanelCombustible panelCombustible, String valorNuevo) {
		try {
			actualizarValorThrows(panelCombustible, valorNuevo);
		} catch (CampoException e) {
			 
		}
	}
}
