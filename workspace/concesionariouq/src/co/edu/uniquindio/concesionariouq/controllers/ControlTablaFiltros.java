package co.edu.uniquindio.concesionariouq.controllers;

import co.edu.uniquindio.concesionariouq.util.Relacion;
import javafx.beans.property.ReadOnlyStringWrapper;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.TableColumn.CellDataFeatures;
import javafx.util.Callback;

public class ControlTablaFiltros {

	public static Callback<CellDataFeatures<Relacion<String, String>, String>, ObservableValue<String>> obtenerCallbackTipo() {
		return data -> new ReadOnlyStringWrapper(data.getValue().getValor1());
	}

	public static Callback<CellDataFeatures<Relacion<String, String>, String>, ObservableValue<String>> obtenerCallbackFiltro() {
		return data -> new ReadOnlyStringWrapper(data.getValue().getValor2());
	}

}
