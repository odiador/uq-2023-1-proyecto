package co.edu.uniquindio.concesionariouq.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import co.edu.uniquindio.concesionariouq.view.principal.OpcionesMenu;

public class Administrador extends Empleado {

	/**
	 * Este es el metodo constructor de la clase Administrador
	 * 
	 * @param nombre
	 * @param id
	 */
	public Administrador(String nombre, String id, String contrasena, String email) {
		super(nombre, id, contrasena, email);

	}

	/**
	 * Este metodo registra un empleado
	 */
	public void registrarEmpleado() {

	}

	/**
	 * Este metodo elimina un empleado
	 */
	public void eliminarEmpleado() {

	}

	/**
	 * Este metodo actualiza un empleado
	 */
	public void actualizarEmpleado() {

	}

	/**
	 * Este metodo bloquea aun empleado
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

}
