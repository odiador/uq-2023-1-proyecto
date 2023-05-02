package co.edu.uniquindio.concesionariouq.view.menu;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import co.edu.uniquindio.concesionariouq.controllers.ControlCombustible;
import co.edu.uniquindio.concesionariouq.util.Utility;
import co.edu.uniquindio.concesionariouq.view.agregarVehiculo.PanelConVolver;
import javafx.beans.value.ChangeListener;
import javafx.collections.FXCollections;
import javafx.scene.control.ComboBox;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;

public class PanelCombustible extends PanelConVolver {

	@Override
	public void handle(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void initComponents() {
		VBox box = new VBox(20);
		ComboBox<String> cbCombustible = new ComboBox<String>();
		cbCombustible.setItems(FXCollections.observableList(Arrays.asList(TipoCombustible.getTextValues())));
		box.getChildren().add(Utility.generarHBox("Selecciona el tipo de combustible:", cbCombustible));
		cbCombustible.valueProperty().addListener((valorObservable, valorAnterior, valorNuevo) -> {
			ControlCombustible.actualizarValor(this, valorNuevo);
		});

		this.setCenter(box);

	}

}
