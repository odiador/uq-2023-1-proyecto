package co.edu.uniquindio.concesionariouq.view.principal;

import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class MenuOpcionesIzq extends VBox {

	private MenuComunicationListener comunicacion;

	public MenuOpcionesIzq(MenuComunicationListener comunicacion) {
		this.comunicacion = comunicacion;
		initComp();
	}

	private void initComp() {
		OpcionesMenu[] opciones = OpcionesMenu.values();
		for (int i = 0; i < opciones.length; i++) {
			Label boton = new Label(opciones[i].getText());
			boton.setId("boton-menu");
			this.getChildren().add(boton);
			boton.setOnMouseReleased(evento -> {
				comunicacion.botonIzqPresionado(((Label) evento.getSource()).getText());
			});
		}
	}

}
