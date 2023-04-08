package co.edu.uniquindio.concesionariouq.view.menu;

import co.edu.uniquindio.concesionariouq.model.TipoVehiculo;
import co.edu.uniquindio.concesionariouq.view.login.UtilPane;
import javafx.collections.FXCollections;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

public class PanelAgregarVehiculo extends BorderPane {

	public PanelAgregarVehiculo() {
		initComp();
	}

	private void initComp() {
		VBox box = new VBox(20);
		ComboBox<String> comboTipoVehiculo = new ComboBox<String>();
		comboTipoVehiculo.setItems((FXCollections.observableArrayList(TipoVehiculo.tipoValues())));
		box.getChildren().add(UtilPane.generarHBox("Elige el tipo de Vehiculo", comboTipoVehiculo));
		this.setCenter(box);
	}

}
