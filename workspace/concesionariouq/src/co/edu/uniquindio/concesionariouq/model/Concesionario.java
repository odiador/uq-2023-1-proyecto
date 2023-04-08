package co.edu.uniquindio.concesionariouq.model;

import java.util.ArrayList;
import java.util.List;

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
	 *  Obtiene el nombre del concesionario
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
	 *  Obtiene la lista de clientes del concesionario
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
	 *  Obtiene la lista de transacciones del concesionario
	 *
	 * @return
	 */
	public List<Transaccion> getListaTransacciones() {
		return listaTransacciones;
	}

	/**
	 *  Cambia la lista de transacciones del concesionario
	 *
	 * @param listaTransacciones
	 */
	public void setListaTransacciones(final List<Transaccion> listaTransacciones) {
		this.listaTransacciones = listaTransacciones;
	}

	/**
	 *  Registra un vehiculo al concesionario
	 *
	 */
	public void registrarVehiculo() {

	}

	/**
	 * Agrega una transaccion al concesionario
	 *
	 */
	public void agregarTransaccion() {

	}

	/**
	 *  Agrega detalle a una transaccion del concesionario
	 *
	 */
	public void agregarDetalleTransaccion() {

	}

	/**
	 *  Generar reporte al concesionario
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
	 *  Envia email de recuperacion al concesionario
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

}
