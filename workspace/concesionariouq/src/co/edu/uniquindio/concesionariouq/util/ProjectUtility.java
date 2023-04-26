package co.edu.uniquindio.concesionariouq.util;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class ProjectUtility {

	public static void mostrarAdvertencia(String msg) {
		new Alert(AlertType.WARNING, msg).show();
	}
	public static void mostrarConfirmacion(String msg) {
		new Alert(AlertType.CONFIRMATION, msg).show();
	}

}
