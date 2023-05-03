package co.edu.uniquindio.concesionariouq.view.ver;

import co.edu.uniquindio.concesionariouq.controllers.ControlTablaFiltros;
import co.edu.uniquindio.concesionariouq.util.Relacion;
import javafx.collections.FXCollections;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.BorderPane;

public class PanelVerFiltros extends BorderPane {
	public PanelVerFiltros() {
		TableView<Relacion<String, String>> tablaFiltros = new TableView<>();
		TableColumn<Relacion<String, String>, String> colTipo = new TableColumn<Relacion<String, String>, String>(
				"Tipo de Filtro");
		TableColumn<Relacion<String, String>, String> colFiltro = new TableColumn<Relacion<String, String>, String>(
				"Filtro");

		tablaFiltros.getColumns().add(colTipo);
		tablaFiltros.getColumns().add(colFiltro);

		colTipo.setCellValueFactory(ControlTablaFiltros.obtenerCallbackTipo());
		colFiltro.setCellValueFactory(ControlTablaFiltros.obtenerCallbackFiltro());
		tablaFiltros.setItems(FXCollections.observableArrayList(PanelVerVehiculos.filtros));
		setCenter(tablaFiltros);
	}
}
