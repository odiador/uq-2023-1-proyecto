package co.edu.uniquindio.concesionariouq.model;

import java.util.ArrayList;

import co.edu.uniquindio.concesionariouq.view.principal.OpcionesMenu;

public class Empleado extends Usuario {

	/**
	 * Este es el constructor principal de la clase
	 * 
	 * @param nombre
	 * @param id
	 * @param contrasena
	 */
	public Empleado(String nombre, String id, String contrasena, String email) {
		super(nombre, id, contrasena, email);
	}

	@Override
	public OpcionesMenu[] obtenerOpcionesDisponibles() {
		ArrayList<OpcionesMenu> listaAux = new ArrayList<OpcionesMenu>();
		listaAux.add(OpcionesMenu.COMPRAR_VEHICULO);
		listaAux.add(OpcionesMenu.VENDER_VEHICULO);
		listaAux.add(OpcionesMenu.CAMBIAR_CONTRASENA);
		listaAux.add(OpcionesMenu.ACTUALIZAR_INFO);
		listaAux.add(OpcionesMenu.ACERCA_DE);
		return (OpcionesMenu[]) listaAux.toArray(new OpcionesMenu[listaAux.size()]);
	}
}