package co.edu.uniquindio.concesionariouq.controllers;

import static co.edu.uniquindio.concesionariouq.controllers.ControlFiltros.filtrarListaVehiculosElectricos;
import static co.edu.uniquindio.concesionariouq.controllers.ControlFiltros.filtrarListaVehiculosEstado;
import static co.edu.uniquindio.concesionariouq.controllers.ControlFiltros.filtrarListaVehiculosGasolina;
import static co.edu.uniquindio.concesionariouq.controllers.ControlFiltros.filtrarListaVehiculosHibridos;
import static co.edu.uniquindio.concesionariouq.util.ProjectUtility.mostrarAdvertencia;
import static co.edu.uniquindio.concesionariouq.util.ProjectUtility.mostrarConfirmacion;
import static co.edu.uniquindio.concesionariouq.view.ver.PanelVerVehiculos.filtros;
import static co.edu.uniquindio.concesionariouq.view.ver.PanelVerVehiculos.listaVehiculos;

import co.edu.uniquindio.concesionariouq.exceptions.FiltroException;
import co.edu.uniquindio.concesionariouq.model.EstadoVehiculo;
import co.edu.uniquindio.concesionariouq.util.Relacion;

public class ControlFiltroView {
	public static void anadirFiltro(Relacion<String, String> filtro) {
		if (!validarFiltro(filtro))
			filtros.add(filtro);
	}

	private static boolean validarFiltro(Relacion<String, String> filtro) {
		return buscarRelacion(filtro) != null;
	}

	private static Relacion<String, String> buscarRelacion(Relacion<String, String> filtro) {
		return filtros.stream().filter(cadaFiltro -> cadaFiltro.equals(filtro)).findFirst().orElse(null);
	}

	public static void filtrarDiesel() {
		try {
			listaVehiculos = ControlFiltros.filtrarListaVehiculosDiesel(listaVehiculos);
			anadirFiltro(new Relacion<String, String>("Combiustible", "Diesel"));
			confirmacion();
		} catch (FiltroException e) {
			mostrarAdvertencia(e.getMessage());
		}
	}

	public static void filtrarElectricos() {
		try {
			listaVehiculos = filtrarListaVehiculosElectricos(listaVehiculos);
			anadirFiltro(new Relacion<String, String>("Tipo Vehiculo", "Electrico"));
			confirmacion();
		} catch (FiltroException e) {
			mostrarAdvertencia(e.getMessage());
		}
	}

	public static void filtrarGasolina() {
		try {
			listaVehiculos = filtrarListaVehiculosGasolina(listaVehiculos);
			anadirFiltro(new Relacion<String, String>("Combustible", "Gasolina"));
			confirmacion();
		} catch (FiltroException e) {
			mostrarAdvertencia(e.getMessage());
		}
	}

	private static void confirmacion() {
		mostrarConfirmacion("La lista ha sido filtrada con exito, ahora tiene " + listaVehiculos.size() + " vehiculos");
	}

	public static void filtrarHibridos() {
		try {
			listaVehiculos = filtrarListaVehiculosHibridos(listaVehiculos);
			anadirFiltro(new Relacion<String, String>("Tipo Vehiculo", "Hibrido"));
			confirmacion();
		} catch (FiltroException e) {
			mostrarAdvertencia(e.getMessage());
		}
	}

	public static void filtrarEstado(String valor) {
		EstadoVehiculo estado = EstadoVehiculo.obtenerEstadoTexto(valor);
		if (estado == null)
			mostrarAdvertencia("Recuerda llenar el estado");
		try {
			listaVehiculos = filtrarListaVehiculosEstado(listaVehiculos, estado);
			anadirFiltro(new Relacion<String, String>("Estado", estado.getText()));
			confirmacion();
		} catch (FiltroException e) {
			mostrarAdvertencia(e.getMessage());
		}
	}

}
