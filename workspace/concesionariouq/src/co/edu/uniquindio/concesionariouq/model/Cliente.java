package co.edu.uniquindio.concesionariouq.model;

import java.util.HashMap;

import co.edu.uniquindio.concesionariouq.exceptions.ConcesionarioException;
import co.edu.uniquindio.concesionariouq.exceptions.VehiculoNoExisteException;
import co.edu.uniquindio.concesionariouq.exceptions.VehiculoYaExisteException;

public class Cliente extends Usuario implements Negociable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
	 * Automatiza la verificacion de vehiculos
	 * 
	 * @param placa
	 * @throws VehiculoYaExisteException
	 */
	public void throwIfVehiculoExist(String placa) throws VehiculoYaExisteException {
		if (validarVehiculo(placa))
			throw new VehiculoYaExisteException("El vehiculo con la placa " + placa + " ya existe");
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

	@Override
	public void agregarVehiculo(Vehiculo vehiculo) throws VehiculoYaExisteException {
		throwIfVehiculoExist(vehiculo.getPlaca());
		listaVehiculos.put(vehiculo.getPlaca(), vehiculo);
	}

	@Override
	public void eliminarVehiculo(Vehiculo vehiculo) throws VehiculoNoExisteException {
		if (listaVehiculos.remove(vehiculo.getPlaca()) == null)
			throw new VehiculoNoExisteException("No se pudo encontrar el vehiculo en el cliente");
	}

}