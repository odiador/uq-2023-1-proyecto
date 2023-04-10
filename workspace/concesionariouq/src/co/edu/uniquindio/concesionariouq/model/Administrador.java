package co.edu.uniquindio.concesionariouq.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

import co.edu.uniquindio.concesionariouq.exceptions.ConcesionarioException;
import co.edu.uniquindio.concesionariouq.view.principal.OpcionesMenu;

public class Administrador extends Empleado {

	private HashMap<String, Empleado> listaEmpleados;

	/**
	 * Este es el metodo constructor de la clase Administrador
	 * 
	 * @param id
	 * @param nombre
	 * @param contrasena
	 * @param email
	 */
	public Administrador(String id, String nombre, String contrasena, String email) {
		super(id, nombre, contrasena, email);
		this.listaEmpleados = new HashMap<String, Empleado>();
	}

	/**
	 * Este metodo registra un empleado
	 * 
	 * @throws ConcesionarioException
	 */
	public void registrarEmpleado(Empleado empleado) throws ConcesionarioException {
		if (validarEmpleado(empleado.getId()))
			throw new ConcesionarioException("El empleado ya se encuentra trabajando para el admin");
		listaEmpleados.put(empleado.getId(), empleado);
	}

	private boolean validarEmpleado(String id) {
		return listaEmpleados.containsKey(id);
	}

	/**
	 * Este metodo elimina un empleado
	 */
	public void eliminarEmpleado(String id)throws ConcesionarioException {
		if (!validarEmpleado(id))
			throw new ConcesionarioException("El empleado no se encuentra trabajando para el admin");
		listaEmpleados.remove(id);
	}

	/**
	 * Este metodo actualiza un empleado
	 */
	public void actualizarEmpleado(Empleado empleado) throws ConncesionarioException{
		if(!validarEmpleado(empleado.getId())) throw new ConcesionarioException("El empleado no se encuentra trabajando para el admin");
			
	}

	/**
	 * Este metodo bloquea a un empleado
	 */
	public void bloquearEmpleado() {

	}

	/**
	 * Este metodo genera un reporte
	 */
	public void generarReporte() {

	}

	/**
	 * Este metodo es la que recupera contraseñas
	 */
	public void recuperarContrasena() {

	}

	@Override
	public OpcionesMenu[] obtenerOpcionesDisponibles() {
		ArrayList<OpcionesMenu> listaOpciones = new ArrayList<OpcionesMenu>(
				Arrays.asList(super.obtenerOpcionesDisponibles()));
		listaOpciones.add(OpcionesMenu.ACTUALIZAR_CLIENTE);
		listaOpciones.add(OpcionesMenu.ACTUALIZAR_VEHICULO);
		listaOpciones.add(OpcionesMenu.AGREGAR_CLIENTE);
		listaOpciones.add(OpcionesMenu.ELIMINAR_CLIENTE);
		Collections.sort(listaOpciones, OpcionesMenu::compararPorPrioridad);
		return (OpcionesMenu[]) listaOpciones.toArray(new OpcionesMenu[listaOpciones.size()]);
	}

	public HashMap<String, Empleado> getListaEmpleados() {
		return listaEmpleados;
	}

	public void setListaEmpleados(HashMap<String, Empleado> listaEmpleados) {
		this.listaEmpleados = listaEmpleados;
	}

}
