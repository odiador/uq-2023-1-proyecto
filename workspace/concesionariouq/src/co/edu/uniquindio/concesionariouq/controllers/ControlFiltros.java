package co.edu.uniquindio.concesionariouq.controllers;

import java.util.List;
import java.util.stream.Collectors;

import co.edu.uniquindio.concesionariouq.exceptions.FiltroException;
import co.edu.uniquindio.concesionariouq.model.EstadoVehiculo;
import co.edu.uniquindio.concesionariouq.model.TipoCambio;
import co.edu.uniquindio.concesionariouq.model.TipoVehiculo;
import co.edu.uniquindio.concesionariouq.model.Vehiculo;

public class ControlFiltros {

	public static List<? extends Vehiculo> filtrarListaVehiculosTipo(List<? extends Vehiculo> listaVehiculos,
			TipoVehiculo tipoVehiculo) throws FiltroException {
		if (tipoVehiculo == null)
			throw new FiltroException();
		return listaVehiculos.stream().filter(vehiculo -> vehiculo.getTipoVehiculo() == tipoVehiculo)
				.collect(Collectors.toList());
	}

	public static List<? extends Vehiculo> filtrarListaVehiculosEstado(List<? extends Vehiculo> listaVehiculos,
			EstadoVehiculo estado) throws FiltroException {
		if (estado == null)
			throw new FiltroException();
		return listaVehiculos.stream().filter(vehiculo -> vehiculo.getEstado() == estado).collect(Collectors.toList());
	}

	public static List<? extends Vehiculo> filtrarListaVehiculosTipoCambio(List<? extends Vehiculo> listaVehiculos,
			TipoCambio tipoCambio) throws FiltroException {
		if (tipoCambio == null)
			throw new FiltroException();
		return listaVehiculos.stream().filter(vehiculo -> vehiculo.getTipo() == tipoCambio)
				.collect(Collectors.toList());
	}

	public static List<? extends Vehiculo> filtrarListaVehiculosPlacaTerminando(List<? extends Vehiculo> listaVehiculos,
			String cadena) throws FiltroException {
		return listaVehiculos.stream().filter(vehiculo -> vehiculo.placaTerminaCon(cadena))
				.collect(Collectors.toList());
	}

	public static List<? extends Vehiculo> filtrarListaVehiculosPlacaEmpezando(List<? extends Vehiculo> listaVehiculos,
			String cadena) throws FiltroException {
		return listaVehiculos.stream().filter(vehiculo -> vehiculo.placaEmpiezaCon(cadena))
				.collect(Collectors.toList());
	}

	public static List<? extends Vehiculo> filtrarListaVehiculosVelMaxMenorQue(List<? extends Vehiculo> listaVehiculos,
			double val) throws FiltroException {
		return listaVehiculos.stream().filter(vehiculo -> vehiculo.velocidadMaximaMenorQue(val))
				.collect(Collectors.toList());
	}

	public static List<? extends Vehiculo> filtrarListaVehiculosVelMaxMayorQue(List<? extends Vehiculo> listaVehiculos,
			double val) throws FiltroException {
		return listaVehiculos.stream().filter(vehiculo -> vehiculo.velocidadMaximaMayorQue(val))
				.collect(Collectors.toList());
	}

	public static List<? extends Vehiculo> filtrarListaVehiculosVelMaxEnRango(List<? extends Vehiculo> listaVehiculos,
			double min, double max) throws FiltroException {
		return listaVehiculos.stream().filter(vehiculo -> vehiculo.velocidadMaximaRango(min, max))
				.collect(Collectors.toList());
	}

	public static List<? extends Vehiculo> filtrarListaVehiculosCilindrajeMenorQue(
			List<? extends Vehiculo> listaVehiculos, double val) throws FiltroException {
		return listaVehiculos.stream().filter(vehiculo -> vehiculo.cilindrajeMenorQue(val))
				.collect(Collectors.toList());
	}

	public static List<? extends Vehiculo> filtrarListaVehiculosCilindrajeMayorQue(
			List<? extends Vehiculo> listaVehiculos, double val) throws FiltroException {
		return listaVehiculos.stream().filter(vehiculo -> vehiculo.cilindrajeMayorQue(val))
				.collect(Collectors.toList());
	}

	public static List<? extends Vehiculo> filtrarListaVehiculosCilindrajeEnRango(
			List<? extends Vehiculo> listaVehiculos, double min, double max) throws FiltroException {
		return listaVehiculos.stream().filter(vehiculo -> vehiculo.cilindrajeEnRango(min, max))
				.collect(Collectors.toList());
	}

	public static List<? extends Vehiculo> filtrarListaVehiculosGasolina(List<? extends Vehiculo> listaVehiculos)
			throws FiltroException {
		return listaVehiculos.stream().filter(Vehiculo::tieneCombustibleGasolina).collect(Collectors.toList());
	}

	public static List<? extends Vehiculo> filtrarListaVehiculosElectricos(List<? extends Vehiculo> listaVehiculos)
			throws FiltroException {
		return listaVehiculos.stream().filter(Vehiculo::tieneCombustibleEletrico).collect(Collectors.toList());
	}

	public static List<? extends Vehiculo> filtrarListaVehiculosDiesel(List<? extends Vehiculo> listaVehiculos)
			throws FiltroException {
		return listaVehiculos.stream().filter(Vehiculo::tieneCombustibleDiesel).collect(Collectors.toList());
	}

	public static List<? extends Vehiculo> filtrarListaVehiculosHibridos(List<? extends Vehiculo> listaVehiculos)
			throws FiltroException {
		return listaVehiculos.stream().filter(Vehiculo::tieneCombustibleHibrido).collect(Collectors.toList());
	}
}
