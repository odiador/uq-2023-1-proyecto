package co.edu.uniquindio.concesionariouq.view.principal;

import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MenuPrincipalIzq extends BorderPane {
	private MenuComunicationListener comunicacion;

	public MenuPrincipalIzq(Stage stage, MenuComunicationListener comunicacion) {
		this.comunicacion = comunicacion;
		initComp();
	}

	private void initComp() {
		MenuOpcionesIzq menuOpcionesIzq = new MenuOpcionesIzq(comunicacion);
		setBottom(menuOpcionesIzq);
	}

}
