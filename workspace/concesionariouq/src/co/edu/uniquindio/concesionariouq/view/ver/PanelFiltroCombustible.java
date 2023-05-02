package co.edu.uniquindio.concesionariouq.view.ver;

import static co.edu.uniquindio.concesionariouq.util.ProjectUtility.mostrarConfirmacion;
import static co.edu.uniquindio.concesionariouq.view.ver.PanelVerVehiculos.listaVehiculos;

import co.edu.uniquindio.concesionariouq.controllers.ControlFiltroView;
import co.edu.uniquindio.concesionariouq.util.Boton;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

public class PanelFiltroCombustible extends BorderPane {
	public PanelFiltroCombustible() {
		VBox vBox = new VBox(20);

		vBox.getChildren().add(new Boton("Filtrar Diesel", evt -> {
			ControlFiltroView.filtrarDiesel();
		}));
		vBox.getChildren().add(new Boton("Filtrar Electricos", evt -> {
			ControlFiltroView.filtrarElectricos();
		}));
		vBox.getChildren().add(new Boton("Filtrar Gasolina", evt -> {
			ControlFiltroView.filtrarGasolina();
		}));
		vBox.getChildren().add(new Boton("Filtrar Hibridos", evt -> {
			ControlFiltroView.filtrarHibridos();
		}));
		setCenter(vBox);
	}

	public static void confirmacion() {
		mostrarConfirmacion("La lista ha sido filtrada con exito, ahora tiene " + listaVehiculos.size() + " vehiculos");
	}
}
