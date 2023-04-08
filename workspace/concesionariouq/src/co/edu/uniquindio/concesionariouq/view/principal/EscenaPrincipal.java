package co.edu.uniquindio.concesionariouq.view.principal;

import javafx.scene.Scene;
import javafx.stage.Stage;

public class EscenaPrincipal extends Scene {

	public EscenaPrincipal(Stage stage) {
		super(new MenuPrincipal(stage), 1000, 800);

	}

}
