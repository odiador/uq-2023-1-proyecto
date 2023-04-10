package co.edu.uniquindio.concesionariouq.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

import co.edu.uniquindio.concesionariouq.exceptions.ConcesionarioException;
import co.edu.uniquindio.concesionariouq.view.principal.OpcionesMenu;

public class Cliente extends Usuario {
	private HashMap<String, Vehiculo> listaVehiculos;

	/**
	 * Este el constructor de la clase Cliente
	 * 
	 * @param id
	 * @param nombre
	 * @param contrasena
	 * @param email
	 */
	public Cliente(String id, String nombre, String contrasena, String email) {
		super(id, nombre, contrasena, email);
		this.listaVehiculos = new HashMap<String, Vehiculo>();
	}

	/**
	 * Alquila un vehiculo por medio de la placa
	 */
	public void alquilarVehiculo(String placa) {
	}

	@Override
	public OpcionesMenu[] obtenerOpcionesDisponibles() {
		ArrayList<OpcionesMenu> listaAux = new ArrayList<OpcionesMenu>();
		listaAux.add(OpcionesMenu.COMPRAR_VEHICULO);
		listaAux.add(OpcionesMenu.VENDER_VEHICULO);
		listaAux.add(OpcionesMenu.CAMBIAR_CONTRASENA);
		listaAux.add(OpcionesMenu.ACTUALIZAR_INFO);
		listaAux.add(OpcionesMenu.ACERCA_DE);
		Collections.sort(listaAux, OpcionesMenu::compararPorPrioridad);
		return (OpcionesMenu[]) listaAux.toArray(new OpcionesMenu[listaAux.size()]);
	}

	public void agregarVehiculo(String placa, Vehiculo vehiculo) throws ConcesionarioException {
		throwIfVehiculoExist(placa);
		listaVehiculos.put(placa, vehiculo);
	}

	/**
	 * Automatiza la verificacion de vehiculos
	 * 
	 * @param placa
	 * @throws ConcesionarioException
	 */
	public void throwIfVehiculoExist(String placa) throws ConcesionarioException {
		if (validarVehiculo(placa))
			throw new ConcesionarioException("El vehiculo con la placa " + placa + " ya existe");
	}

	private boolean validarVehiculo(String placa) {
		return listaVehiculos.containsKey(placa);
	}

	public Vehiculo buscarVehiculo(String placa) {
		return listaVehiculos.getOrDefault(placa, null);
	}

	public void eliminarVehiculo(String placa) throws ConcesionarioException {
		if (listaVehiculos.remove(placa) == null)
			throw new ConcesionarioException("No se pudo encontrar el vehiculo en el cliente");
	}

}