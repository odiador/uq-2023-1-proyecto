package co.edu.uniquindio.concesionariouq.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import co.edu.uniquindio.concesionariouq.exceptions.AtributosFaltantesException;
import co.edu.uniquindio.concesionariouq.exceptions.ConcesionarioException;
import co.edu.uniquindio.concesionariouq.exceptions.LoginFailedException;
import co.edu.uniquindio.concesionariouq.exceptions.NullException;
import co.edu.uniquindio.concesionariouq.exceptions.TransaccionNoExisteException;
import co.edu.uniquindio.concesionariouq.exceptions.TransaccionYaExisteException;
import co.edu.uniquindio.concesionariouq.exceptions.UsuarioEncontradoException;
import co.edu.uniquindio.concesionariouq.exceptions.UsuarioNoEncontradoException;
import co.edu.uniquindio.concesionariouq.exceptions.VehiculoNoExisteException;
import co.edu.uniquindio.concesionariouq.exceptions.VehiculoYaExisteException;

public class Concesionario
		implements GestionableVehiculo, GestionableCliente, GestionableEmpleado, GestionableTransaccion, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nombre;
	private String direccion;
	private Set<Vehiculo> listaVehiculos;
	private Set<Cliente> listaClientes;
	private Set<Empleado> listaEmpleados;
	private Set<Transaccion> listaTransacciones;

	/**
	 * Es el metodo constructor vacio de la clase
	 */
	public Concesionario() {
	}

	/**
	 * Es el metodo constructor de la clase
	 */
	public Concesionario(final String nombre, final String direccion) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.listaVehiculos = new HashSet<>();
		this.listaClientes = new HashSet<>();
		this.listaEmpleados = new HashSet<>();
		this.listaTransacciones = new HashSet<>();
	}

	@Override
	public Vehiculo buscarVehiculo(String id) {
		return listaVehiculos.stream().filter(vehiculo -> vehiculo.tieneId(id)).findFirst().orElse(null);
	}

	@Override
	public boolean validarVehiculo(String id) {
		return buscarVehiculo(id) != null;
	}

	@Override
	public void agregarVehiculo(String id, Vehiculo vehiculo)
			throws NullException, AtributosFaltantesException, VehiculoYaExisteException {
		if (id == null)
			throw new NullException("La identificacion enviada es null");
		if (vehiculo == null)
			throw new NullException("El vehiculo enviado es null");
		if (!vehiculo.atributosLlenos())
			throw new AtributosFaltantesException("Al vehiculo le hacen falta atributos por llenar");
		if (validarVehiculo(id))
			throw new VehiculoYaExisteException("El vehiculo con la identificacion " + id + " ya existe");
		listaVehiculos.add(vehiculo);
	}

	/**
	 * Elimina un vehiculo por medio de la identificacion, si no se encuentra se
	 * muestra una excepcion
	 * 
	 * @param id
	 * @throws NullException
	 * @throws ConcesionarioException
	 */
	@Override
	public void eliminarVehiculo(String id) throws VehiculoNoExisteException, NullException {
		if (id == null)
			throw new NullException("La identificacion enviade es null");
		Vehiculo vehiculo = buscarVehiculo(id);
		if (vehiculo == null)
			throw new VehiculoNoExisteException("El vehiculo con la placa " + id + " no existe");
		listaVehiculos.remove(vehiculo);
	}

	/**
	 * Lista los vehiculos del concesionario, como es un set se pasa directamente a
	 * una lista usando un stream
	 * 
	 * @return
	 */
	@Override
	public List<Vehiculo> listarVehiculos() {
		return listaVehiculos.stream().collect(Collectors.toList());
	}

	/**
	 * Busca un usuario basandose en su identificacion
	 *
	 * @param identificacion
	 * @return
	 */
	@Override
	public Cliente buscarCliente(String identificacion) {
		return listaClientes.stream().filter(cliente -> cliente.tieneId(identificacion)).findFirst().orElse(null);
	}

	@Override
	public void agregarCliente(Cliente cliente)
			throws UsuarioEncontradoException, NullException, AtributosFaltantesException {
		if (cliente == null)
			throw new NullException("El cliente enviado es null");
		if (!cliente.atributosLlenos())
			throw new AtributosFaltantesException("Al cliente le hacen falta atributos");
		if (validarCliente(cliente.getId()))
			throw new UsuarioEncontradoException("El cliente ya se encuentra agregado");
		listaClientes.add(cliente);

	}

	@Override
	public void eliminarCliente(String id) throws UsuarioNoEncontradoException, NullException {
		if (id == null)
			throw new NullException("La identificacion enviada es null");
		Cliente cliente = buscarCliente(id);
		if (cliente == null)
			throw new UsuarioNoEncontradoException("El usuario no fue encontrado, no se puede eliminar");
		listaClientes.remove(cliente);
	}

	@Override
	public List<Cliente> listarClientes() {
		return listaClientes.stream().collect(Collectors.toList());
	}

	@Override
	public void agregarEmpleado(Empleado empleado)
			throws UsuarioEncontradoException, AtributosFaltantesException, NullException {
		if (empleado == null)
			throw new NullException("El empleado enviado es null");
		if (!empleado.atributosLlenos())
			throw new AtributosFaltantesException("Al empleado le hacen falta atributos");
		if (validarEmpleado(empleado.getId()))
			throw new UsuarioEncontradoException("El empleado ya se encuentra agregado");
		listaEmpleados.add(empleado);
	}

	@Override
	public void eliminarEmpleado(String id) throws UsuarioNoEncontradoException, NullException {
		if (id == null)
			throw new NullException("La identificacion enviada es null");
		Empleado empleado = buscarEmpleado(id);
		if (empleado == null)
			throw new UsuarioNoEncontradoException("El usuario no fue encontrado, no se puede eliminar");
		listaEmpleados.remove(empleado);
	}

	@Override
	public Empleado buscarEmpleado(String id) {
		return listaEmpleados.stream().filter(empleado -> empleado.tieneId(id)).findFirst().orElse(null);
	}

	@Override
	public List<Empleado> listarEmpleados() {
		return listaEmpleados.stream().collect(Collectors.toList());
	}

	/**
	 * Busca un usuario a partir de su identificacion y contraseña
	 *
	 * @param identificacion
	 * @param contrasena
	 * @return
	 */
	public Cliente buscarClienteLogin(String identificacion, String contrasena) {
		Cliente usuario = buscarCliente(identificacion);
		if (usuario != null && usuario.getContrasena().equals(contrasena))
			return usuario;
		return null;
	}

	private Empleado buscarEmpleadoLogin(String identificacion, String contrasena) {
		Empleado empleado = buscarEmpleado(identificacion);
		if (empleado != null && empleado.getContrasena().equals(contrasena))
			return empleado;
		return null;
	}

	/**
	 * Intenta hacer login al usuario, si no se puede marca una excepcion
	 * 
	 * @param identificacion
	 * @param contrasena
	 * @return
	 * @throws LoginFailedException
	 * @throws NullException
	 */
	public ArrayList<Usuario> hacerLogin(String identificacion, String contrasena)
			throws LoginFailedException, NullException {
		if (identificacion == null)
			throw new NullException("La identificacion enviada es null");
		if (contrasena == null)
			throw new NullException("La contrasena enviada es null");
		Empleado empleado = buscarEmpleadoLogin(identificacion, contrasena);
		Cliente cliente = buscarClienteLogin(identificacion, contrasena);
		if (empleado == null && cliente == null)
			throw new LoginFailedException(
					"La id o contraseña especificada no coinciden con tus datos, intenta nuevamente");
		ArrayList<Usuario> listaUsuarios = new ArrayList<>();
		if (empleado != null)
			listaUsuarios.add(empleado);
		if (cliente != null)
			listaUsuarios.add(cliente);
		return listaUsuarios;
	}

	@Override
	public Transaccion buscarTransaccion(String id) {
		return listaTransacciones.stream().filter(transaccion -> transaccion.tieneCodigo(id)).findFirst().orElse(null);
	}

	/**
	 * Valida si una transaccion existe o no a partir de su código
	 * 
	 * @param id
	 * @return
	 */
	@Override
	public boolean validarTransaccion(String id) {
		return buscarTransaccion(id) != null;
	}

	@Override
	public void agregarTransaccion(Transaccion transaccion)
			throws TransaccionYaExisteException, NullException, AtributosFaltantesException {
		if (transaccion == null)
			throw new NullException("La transaccion enviada es null");
		if (!transaccion.atributosLlenos())
			throw new AtributosFaltantesException("A la transaccion le hacen falta atributos");
		if (validarTransaccion(transaccion.getCodigo()))
			throw new TransaccionYaExisteException("La transaccion ya existe");
		listaTransacciones.add(transaccion);
	}

	/**
	 * Elimina una transaccion, muestra un error si no se encuentra
	 * 
	 * @param codigo
	 * @throws NullException
	 * @throws ConcesionarioException
	 */
	@Override
	public void eliminarTransaccion(String codigo) throws TransaccionNoExisteException, NullException {
		if (codigo == null)
			throw new NullException("El codigo enviado es null");
		Transaccion transaccion = buscarTransaccion(codigo);
		if (transaccion == null)
			throw new TransaccionNoExisteException("La transaccion no existe, no se puede eliminar");
		listaTransacciones.remove(transaccion);
	}

	@Override
	public List<Transaccion> listarTransacciones() {
		return listaTransacciones.stream().collect(Collectors.toList());
	}

	/**
	 * Obtiene el nombre del concesionario
	 *
	 * @return nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Cambia el nombre del concesionario
	 *
	 * @param nombre
	 */
	public void setNombre(final String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Obtiene la direccion del concesionario
	 *
	 * @return direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * Cambia la direccion del concesionario
	 *
	 * @param direccion
	 */
	public void setDireccion(final String direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return String.format(
				"Concesionario [nombre=%s, direccion=%s, listaVehiculos=%s, listaEmpleados=%s, listaTransacciones=%s]",
				nombre, direccion, listaVehiculos, listaEmpleados, listaTransacciones);
	}

}
