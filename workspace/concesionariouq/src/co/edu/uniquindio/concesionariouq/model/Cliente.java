package co.edu.uniquindio.concesionariouq.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import co.edu.uniquindio.concesionariouq.exceptions.AtributosFaltantesException;
import co.edu.uniquindio.concesionariouq.exceptions.NullException;
import co.edu.uniquindio.concesionariouq.exceptions.VehiculoNoExisteException;
import co.edu.uniquindio.concesionariouq.exceptions.VehiculoYaExisteException;

public class Cliente extends Usuario implements GestionableVehiculo {
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
	 * @param respuestaDeSeguridad
	 */
	public Cliente(String id, String nombre, String contrasena, String email, String respuestaDeSeguridad) {
		super(id, nombre, contrasena, email, respuestaDeSeguridad);

		this.listaVehiculos = new HashMap<String, Vehiculo>();
	}

	public boolean validarVehiculo(String id) {
		return listaVehiculos.containsKey(id);
	}

	public Vehiculo buscarVehiculo(String id) {
		return listaVehiculos.getOrDefault(id, null);
	}

	@Override
	public void agregarVehiculo(String id, Vehiculo vehiculo)
			throws VehiculoYaExisteException, AtributosFaltantesException, NullException {
		if (id == null)
			throw new NullException("La identificacion enviada es null");
		if (vehiculo == null)
			throw new NullException("El vehiculo enviado es null");
		if (!vehiculo.atributosLlenos())
			throw new AtributosFaltantesException("El vehiculo enviado es null");
		if (validarVehiculo(id))
			throw new VehiculoYaExisteException("El vehiculo ya existe, no se puede agregar");

		listaVehiculos.put(id, vehiculo);
	}

	@Override
	public void eliminarVehiculo(String id) throws VehiculoNoExisteException, NullException {
		if (id == null)
			throw new NullException("La identificacion enviada es null");
		if (!validarVehiculo(id))
			throw new VehiculoNoExisteException("El vehiculo no existe, no se puede eliminar");
		listaVehiculos.remove(id);
	}

	@Override
	public List<Vehiculo> listarVehiculos() {
		return listaVehiculos.entrySet().stream().map(Entry<String, Vehiculo>::getValue).collect(Collectors.toList());
	}

	@Override
	public TipoUsuario getTipoUsuario() {
		return TipoUsuario.CLIENTE;
	}

}