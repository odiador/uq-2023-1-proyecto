package co.edu.uniquindio.concesionariouq.util;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

import javax.mail.MessagingException;
import javax.mail.Transport;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class ProjectUtility {

	public static void mostrarAdvertencia(String msg) {
		new Alert(AlertType.WARNING, msg).show();
	}

	public static void mostrarConfirmacion(String msg) {
		new Alert(AlertType.CONFIRMATION, msg).show();
	}

	public static void enviarCorreoRecuperacion(final String toMail, final String nombre, final String codigo)
			throws MessagingException, IOException {
		Properties prop = new Properties();
		MailUtility.agregarPropiedadesCorreo(prop);
		CorreoRecuperacion mensajeCorreo = new CorreoRecuperacion(
				MailUtility.generarSesion(MailUtility.MAILFROM, MailUtility.PASSWORD, prop), MailUtility.MAILFROM,
				toMail, nombre, codigo);
		Transport.send(mensajeCorreo);
	}

	public static void enviarCorreoReporte(final String toMail, final String nombre, final String reporte,
			final String info, final File archivo) throws MessagingException, IOException {
		Properties prop = new Properties();
		MailUtility.agregarPropiedadesCorreo(prop);

		CorreoReporte mensajeCorreo = new CorreoReporte(
				MailUtility.generarSesion(MailUtility.MAILFROM, MailUtility.PASSWORD, prop), MailUtility.MAILFROM,
				toMail, nombre, reporte, info, archivo);
		Transport.send(mensajeCorreo);
	}

}
