package co.edu.uniquindio.concesionariouq.model;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import co.edu.uniquindio.concesionariouq.exceptions.AtributosFaltantesException;
import co.edu.uniquindio.concesionariouq.exceptions.NullException;
import co.edu.uniquindio.concesionariouq.exceptions.VehiculoNoExisteException;
import co.edu.uniquindio.concesionariouq.exceptions.VehiculoYaExisteException;

public class Cliente extends Persona implements GestionableVehiculo {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Set<Vehiculo> listaVehiculos;

	/**
	 * Es el constructor de la clase {@link Cliente}
	 * 
	 * @param id
	 * @param nombre
	 */
	public Cliente(String id, String nombre) {
		super(id, nombre);
		listaVehiculos = new HashSet<>();
	}

	@Override
	public TipoPersona getTipoPersona() {
		return TipoPersona.CLIENTE;
	}

	@Override
	public boolean atributosLlenos() {
		return super.atributosLlenos() && listaVehiculos != null;
	}

	@Override
	public Vehiculo buscarVehiculo(String id) {
		return listaVehiculos.stream().filter(vehiculo -> vehiculo.tieneId(id)).findFirst().orElse(null);
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

		listaVehiculos.add(vehiculo);
	}

	@Override
	public void eliminarVehiculo(String id) throws VehiculoNoExisteException, NullException {
		if (id == null)
			throw new NullException("La identificacion enviada es null");
		Vehiculo vehiculo = buscarVehiculo(id);
		if (vehiculo == null)
			throw new VehiculoNoExisteException("El vehiculo no existe, no se puede eliminar");
		listaVehiculos.remove(vehiculo);
	}

	@Override
	public List<Vehiculo> listarVehiculos() {
		return listaVehiculos.stream().collect(Collectors.toList());
	}

}