package co.edu.uniquindio.concesionariouq.model;

import java.util.ArrayList;
import java.util.List;

import co.edu.uniquindio.concesionariouq.exceptions.ConcesionarioException;

public class Concesionario implements PuedeTenerVehiculo {

	// ATRIBUTOS
	private String nombre;
	private String direccion;
	private List<Vehiculo> listaVehiculos;
	private List<Usuario> listaUsuarios;
	private List<Cliente> listaClientes;
	private List<Transaccion> listaTransacciones;

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
		this.listaVehiculos = new ArrayList<Vehiculo>();
		this.listaUsuarios = new ArrayList<Usuario>();
		this.listaClientes = new ArrayList<Cliente>();
		this.listaTransacciones = new ArrayList<Transaccion>();
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

	/**
	 * Obtiene la lista de vehiculos del concesionario
	 *
	 * @return listaVehiculos
	 */
	public List<Vehiculo> getListaVehiculos() {
		return listaVehiculos;
	}

	/**
	 * Cambia la lista de vehiculos del concesionario
	 *
	 * @param listaVehiculos
	 */
	public void setListaVehiculos(final List<Vehiculo> listaVehiculos) {
		this.listaVehiculos = listaVehiculos;
	}

	/**
	 * Obtiene la lista de usuarios del concesionario
	 *
	 * @return
	 */
	public List<Usuario> getListaUsuarios() {
		return listaUsuarios;
	}

	/**
	 * Cambia la lista de usuarios del concesionario
	 *
	 * @param listaUsuarios
	 */
	public void setListaUsuarios(final List<Usuario> listaUsuarios) {
		this.listaUsuarios = listaUsuarios;
	}

	/**
	 * Obtiene la lista de clientes del concesionario
	 *
	 * @return
	 */
	public List<Cliente> getListaClientes() {
		return listaClientes;
	}

	/**
	 * Cambia la lista de usuarios del concesionario
	 *
	 * @param listaClientes
	 */
	public void setListaClientes(final List<Cliente> listaClientes) {
		this.listaClientes = listaClientes;
	}

	/**
	 * Obtiene la lista de transacciones del concesionario
	 *
	 * @return
	 */
	public List<Transaccion> getListaTransacciones() {
		return listaTransacciones;
	}

	/**
	 * Cambia la lista de transacciones del concesionario
	 *
	 * @param listaTransacciones
	 */
	public void setListaTransacciones(final List<Transaccion> listaTransacciones) {
		this.listaTransacciones = listaTransacciones;
	}

	public Vehiculo buscarVehiculo(String placa) {
		int i = 0;
		while (i < listaVehiculos.size() && !listaVehiculos.get(i).getPlaca().equals(placa))
			i++;
		return i < listaVehiculos.size() ? listaVehiculos.get(i) : null;
	}

	/**
	 * Agrega una transaccion al concesionario
	 *
	 */
	public void agregarTransaccion(String codigo) throws ConcesionarioException {
		throwIfTransaccionExist(codigo);
		listaTransacciones.add(new Transaccion(codigo));
	}

	/**
	 * Valida si una transaccion existe o no a partir de su código
	 * 
	 * @param codigo
	 * @return 
	 */
	private boolean validarTransaccion(String codigo) {
		return buscarTransaccion(codigo) != null;
	}

	/**
	 * Muestra un error en caso de que la transaccion ya exista
	 * 
	 * @param codigo
	 * @throws ConcesionarioException
	 */
	private void throwIfTransaccionExist(String codigo) throws ConcesionarioException {
		if (validarTransaccion(codigo))
			throw new ConcesionarioException("La transaccion ya existe");
	}

	/**
	 * Elimina una transaccion, muestra un error si no se encuentra
	 * 
	 * @param codigo
	 * @throws ConcesionarioException
	 */
	public void eliminarTransaccion(String codigo) throws ConcesionarioException {
		throwIfTransaccionExist(codigo);
		listaTransacciones.remove(buscarTransaccion(codigo));
	}

	/**
	 * Agrega detalle a una transaccion del concesionario
	 * 
	 * @throws ConcesionarioException
	 *
	 */
	public void agregarDetalleTransaccion(String codigoTransaccion, String codigoDetalle, Vehiculo vehiculo,
			TipoTransaccion tipo) throws ConcesionarioException {
		Transaccion transaccion = buscarTransaccion(codigoTransaccion);
		if (transaccion == null)
			throw new ConcesionarioException("El detalle de la transaccion no fue encontrado");

		transaccion.agregarDetalleTransaccion(vehiculo, codigoTransaccion, tipo);
	}

	public Transaccion buscarTransaccion(String codigoTransaccion) {
		for (Transaccion transaccion : listaTransacciones)
			if (transaccion.getCodigo().equals(codigoTransaccion))
				return transaccion;

		return null;
	}

	/**
	 * Generar reporte al concesionario
	 *
	 */
	public void generarReporte() {

	}

	/**
	 * Agrega foto al concesionario
	 *
	 */
	public void agregarFoto() {

	}

	/**
	 * Envia email de recuperacion al usuario para restablecer su contrasena
	 *
	 */
	public void enviarEmailRecuperacion() {

	}

	@Override
	public void venderVehiculo(String placa) {
	}

	@Override
	public void comprarVehiculo(Vehiculo vehiculo) {
	}

	/**
	 * Este metodo agrega un bus al concesionario
	 *
	 * @param placa
	 * @param marca
	 * @param modelo
	 * @param cilindraje
	 * @param velocidadMaxima
	 * @param combustible
	 * @param estado
	 * @param tipo
	 * @param numeroPasajeros
	 * @param numeroBolsasAire
	 * @param numeroPuertas
	 * @param tieneAireAcondicionado
	 * @param tieneCamaraReversa
	 * @param tieneABS
	 * @param capacidadMaletero
	 * @param numeroEjes
	 * @param numeroSalidasEmergencia
	 * @throws ConcesionarioException
	 */
	public void agregarBus(String placa, String marca, String modelo, Double cilindraje, Double velocidadMaxima,
			Combustible combustible, EstadoVehiculo estado, TipoCambio tipo, Integer numeroPasajeros,
			Integer numeroBolsasAire, Integer numeroPuertas, Boolean tieneAireAcondicionado, Boolean tieneCamaraReversa,
			Boolean tieneABS, Double capacidadMaletero, Integer numeroEjes, Integer numeroSalidasEmergencia)
			throws ConcesionarioException {
		throwIfVehiculoExist(placa);
		Bus bus = new Bus(placa, marca, modelo, cilindraje, velocidadMaxima, combustible, estado, tipo, numeroPasajeros,
				numeroBolsasAire, numeroPuertas, tieneAireAcondicionado, tieneCamaraReversa, tieneABS,
				capacidadMaletero, numeroEjes, numeroSalidasEmergencia);
		listaVehiculos.add(bus);
	}

	private boolean validarVehiculo(String placa) {
		return buscarVehiculo(placa) != null;
	}

	/**
	 * Busca un usuario basandose en su identificacion
	 *
	 * @param identificacion
	 * @return
	 */
	public Usuario buscarUsuario(String identificacion) {
		for (Usuario usuario : listaUsuarios) {
			if (usuario.getId().equals(identificacion))
				return usuario;
		}
		return null;
	}

	/**
	 * Busca un usuario a partir de su identificacion y contraseña
	 *
	 * @param identificacion
	 * @param contrasena
	 * @return
	 */
	public Usuario buscarUsuario(String identificacion, String contrasena) {
		for (Usuario usuario : listaUsuarios) {
			if (usuario.getId().equals(identificacion) && usuario.getContrasena().equals(contrasena))
				return usuario;
		}
		return null;
	}

	/**
	 * 
	 * @param identificacion
	 * @return
	 */
	public boolean validarUsuario(String identificacion) {
		return buscarUsuario(identificacion) != null;
	}

	/**
	 * Valida si un usuario existe, verificando su identificacion y contraseña
	 *
	 * @param identificacion
	 * @param contrasena
	 * @return
	 */
	public boolean validarUsuario(String identificacion, String contrasena) {
		return buscarUsuario(identificacion, contrasena) != null;
	}

	/**
	 * Agrega un usuario administrador al concesionario, muestra un error en caso de
	 * que ya esté agregado
	 *
	 * @param nombre
	 * @param id
	 * @param contrasena
	 * @param email
	 * @throws ConcesionarioException
	 */
	public void agregarAdmin(String nombre, String id, String contrasena, String email) throws ConcesionarioException {
		if (validarUsuario(id))
			throw new ConcesionarioException("El administrador ya se encuentra agregado");
		listaUsuarios.add(new Administrador(nombre, id, contrasena, email));
	}

	/**
	 * Agregar un nuevo Camtaion al la lista de vehiculos
	 * 
	 * @param placa
	 * @param marca
	 * @param modelo
	 * @param cilindraje
	 * @param velocidadMaxima
	 * @param combustible
	 * @param estado
	 * @param tipo
	 * @param capacidadCarga
	 * @param tieneAireAcondicionado
	 * @param tieneFrenosAire
	 * @param numeroEjes
	 * @param tieneABS
	 * @param tipoCamion
	 * @throws ConcesionarioException
	 */
	public void agregarCamion(String placa, String marca, String modelo, Double cilindraje, Double velocidadMaxima,
			Combustible combustible, EstadoVehiculo estado, TipoCambio tipo, Double capacidadCarga,
			Boolean tieneAireAcondicionado, Boolean tieneFrenosAire, Integer numeroEjes, Boolean tieneABS,
			String tipoCamion) throws ConcesionarioException {
		throwIfVehiculoExist(placa);
		Camion camion = new Camion(placa, marca, modelo, cilindraje, velocidadMaxima, combustible, estado, tipo,
				capacidadCarga, tieneAireAcondicionado, tieneFrenosAire, numeroEjes, tieneABS, tipoCamion);
		listaVehiculos.add(camion);

	}

	/**
	 * Automatiza la verificacion de vehiculos
	 * 
	 * @param placa
	 * @throws ConcesionarioException
	 */
	private void throwIfVehiculoExist(String placa) throws ConcesionarioException {
		if (validarVehiculo(placa))
			throw new ConcesionarioException("El vehiculo con la placa " + placa + " ya existe");
	}

	/**
	 * Agregar un nuevo Camion a la lista de vehiculos
	 * 
	 * @param placa
	 * @param marca
	 * @param modelo
	 * @param cilindraje
	 * @param velocidadMaxima
	 * @param combustible
	 * @param estado
	 * @param tipo
	 * @param numeroPasajeros
	 * @param numeroBolsasAire
	 * @param numeroPuertas
	 * @param tieneAireAcondicionado
	 * @param tieneCamaraReversa
	 * @param tieneABS
	 * @param capacidadMaletero
	 * @param tieneVelocidadCrucero
	 * @param tieneSensorColision
	 * @param tieneSensorTrafico
	 * @param tieneAsistentePermanencia
	 * @param es4x4
	 * @throws ConcesionarioException
	 */
	public void agregarCamioneta(String placa, String marca, String modelo, Double cilindraje, Double velocidadMaxima,
			Combustible combustible, EstadoVehiculo estado, TipoCambio tipo, Integer numeroPasajeros,
			Integer numeroBolsasAire, Integer numeroPuertas, Boolean tieneAireAcondicionado, Boolean tieneCamaraReversa,
			Boolean tieneABS, Double capacidadMaletero, Boolean tieneVelocidadCrucero, Boolean tieneSensorColision,
			Boolean tieneSensorTrafico, Boolean tieneAsistentePermanencia, Boolean es4x4)
			throws ConcesionarioException {
		throwIfVehiculoExist(placa);
		listaVehiculos.add(new Camioneta(placa, marca, modelo, cilindraje, velocidadMaxima, combustible, estado, tipo,
				numeroPasajeros, numeroBolsasAire, numeroPuertas, tieneAireAcondicionado, tieneCamaraReversa, tieneABS,
				capacidadMaletero, tieneVelocidadCrucero, tieneSensorColision, tieneSensorTrafico,
				tieneAsistentePermanencia, es4x4));
	}

	/**
	 * Agregar un nuevo Deportivo a la lista de vehiculos
	 * 
	 * @param placa
	 * @param marca
	 * @param modelo
	 * @param cilindraje
	 * @param velocidadMaxima
	 * @param combustible
	 * @param estado
	 * @param tipo
	 * @param numeroPasajeros
	 * @param numeroBolsasAire
	 * @param numeroPuertas
	 * @param numeroCaballosFuerza
	 * @param tiempoAlcanza100Kmh
	 * @throws ConcesionarioException
	 */
	public void agregarDeportivo(String placa, String marca, String modelo, Double cilindraje, Double velocidadMaxima,
			Combustible combustible, EstadoVehiculo estado, TipoCambio tipo, Integer numeroPasajeros,
			Integer numeroBolsasAire, Integer numeroPuertas, Integer numeroCaballosFuerza, Integer tiempoAlcanza100Kmh)
			throws ConcesionarioException {
		throwIfVehiculoExist(placa);
		listaVehiculos.add(new Deportivo(placa, marca, modelo, cilindraje, velocidadMaxima, combustible, estado, tipo,
				numeroPasajeros, numeroBolsasAire, numeroPuertas, numeroCaballosFuerza, tiempoAlcanza100Kmh));
	}

	/**
	 * Agregar una nueva Moto a la lista de vehiculos
	 * 
	 * @param placa
	 * @param marca
	 * @param modelo
	 * @param cilindraje
	 * @param velocidadMaxima
	 * @param combustible
	 * @param estado
	 * @param tipo
	 * @throws ConcesionarioException
	 */
	public void agregarMoto(String placa, String marca, String modelo, Double cilindraje, Double velocidadMaxima,
			Combustible combustible, EstadoVehiculo estado, TipoCambio tipo) throws ConcesionarioException {
		throwIfVehiculoExist(placa);
		listaVehiculos.add(new Moto(placa, marca, modelo, cilindraje, velocidadMaxima, combustible, estado, tipo));
	}

	/**
	 * Agregar un nuevo PickUp a la lista de vehiculos
	 * 
	 * @param placa
	 * @param marca
	 * @param modelo
	 * @param cilindraje
	 * @param velocidadMaxima
	 * @param combustible
	 * @param estado
	 * @param tipo
	 * @param numeroPasajeros
	 * @param numeroBolsasAire
	 * @param numeroPuertas
	 * @param tieneAireAcondicionado
	 * @param tieneCamaraReversa
	 * @param tieneABS
	 * @param es4x4
	 * @param capacidadCajaCarga
	 * @throws ConcesionarioException
	 */
	public void agregarPickUp(String placa, String marca, String modelo, Double cilindraje, Double velocidadMaxima,
			Combustible combustible, EstadoVehiculo estado, TipoCambio tipo, Integer numeroPasajeros,
			Integer numeroBolsasAire, Integer numeroPuertas, Boolean tieneAireAcondicionado, Boolean tieneCamaraReversa,
			Boolean tieneABS, Boolean es4x4, Double capacidadCajaCarga) throws ConcesionarioException {
		throwIfVehiculoExist(placa);
		listaVehiculos.add(new PickUp(placa, marca, modelo, cilindraje, velocidadMaxima, combustible, estado, tipo,
				numeroPasajeros, numeroBolsasAire, numeroPuertas, tieneAireAcondicionado, tieneCamaraReversa, tieneABS,
				es4x4, capacidadCajaCarga));
	}

	/**
	 * Agregar un nuevo Sedan a la lista de vehiculos
	 * 
	 * @param placa
	 * @param marca
	 * @param modelo
	 * @param cilindraje
	 * @param velocidadMaxima
	 * @param combustible
	 * @param estado
	 * @param tipo
	 * @param numeroPasajeros
	 * @param numeroBolsasAire
	 * @param numeroPuertas
	 * @param tieneAireAcondicionado
	 * @param tieneCamaraReversa
	 * @param tieneABS
	 * @param capacidadMaletero
	 * @param tieneVelocidadCrucero
	 * @param tieneSensorColision
	 * @param tieneSensorTrafico
	 * @param tieneAsistentePermanencia
	 * @throws ConcesionarioException
	 */
	public void agregarSedan(String placa, String marca, String modelo, Double cilindraje, Double velocidadMaxima,
			Combustible combustible, EstadoVehiculo estado, TipoCambio tipo, Integer numeroPasajeros,
			Integer numeroBolsasAire, Integer numeroPuertas, Boolean tieneAireAcondicionado, Boolean tieneCamaraReversa,
			Boolean tieneABS, Double capacidadMaletero, Boolean tieneVelocidadCrucero, Boolean tieneSensorColision,
			Boolean tieneSensorTrafico, Boolean tieneAsistentePermanencia) throws ConcesionarioException {
		throwIfVehiculoExist(placa);
		listaVehiculos.add(new Sedan(placa, marca, modelo, cilindraje, velocidadMaxima, combustible, estado, tipo,
				numeroPasajeros, numeroBolsasAire, numeroPuertas, tieneAireAcondicionado, tieneCamaraReversa, tieneABS,
				capacidadMaletero, tieneVelocidadCrucero, tieneSensorColision, tieneSensorTrafico,
				tieneAsistentePermanencia));
	}

	/**
	 * Agregar una nueva Van a la lista de vehiculos
	 * 
	 * @param placa
	 * @param marca
	 * @param modelo
	 * @param cilindraje
	 * @param velocidadMaxima
	 * @param combustible
	 * @param estado
	 * @param tipo
	 * @param numeroPasajeros
	 * @param numeroBolsasAire
	 * @param numeroPuertas
	 * @param tieneAireAcondicionado
	 * @param tieneCamaraReversa
	 * @param tieneABS
	 * @param capacidadMaletero
	 * @throws ConcesionarioException
	 */
	public void agregarVan(String placa, String marca, String modelo, Double cilindraje, Double velocidadMaxima,
			Combustible combustible, EstadoVehiculo estado, TipoCambio tipo, Integer numeroPasajeros,
			Integer numeroBolsasAire, Integer numeroPuertas, Boolean tieneAireAcondicionado, Boolean tieneCamaraReversa,
			Boolean tieneABS, Double capacidadMaletero) throws ConcesionarioException {
		throwIfVehiculoExist(placa);
		listaVehiculos.add(new Van(placa, marca, modelo, cilindraje, velocidadMaxima, combustible, estado, tipo,
				numeroPasajeros, numeroBolsasAire, numeroPuertas, tieneAireAcondicionado, tieneCamaraReversa, tieneABS,
				capacidadMaletero));
	}

	/**
	 * Elimina un vehículo por medio de la placa, si no se encuentra se muestra una
	 * excepcion
	 * 
	 * @param placa
	 * @throws ConcesionarioException
	 */
	public void eliminarVehiculo(String placa) throws ConcesionarioException {
		Vehiculo vehiculoEncontrado = buscarVehiculo(placa);
		if (vehiculoEncontrado == null)
			throw new ConcesionarioException("El vehiculo con la placa " + placa + " no existe");
		listaVehiculos.remove(vehiculoEncontrado);
	}
}
