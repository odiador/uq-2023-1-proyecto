package co.edu.uniquindio.concesionariouq.model;

import java.util.ArrayList;

import co.edu.uniquindio.concesionariouq.view.principal.OpcionesMenu;

public class Empleado extends Usuario {

	private boolean estaActivo = true;

	/**
	 * Este es el constructor principal de la clase
	 * 
	 * @param nombre
	 * @param contrasena
	 * @param email
	 */
	public Empleado(String id, String nombre, String contrasena, String email) {
		super(id, nombre, contrasena, email);
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

	public boolean isActivo() {
		return estaActivo;
	}

	public void setIsActivo(boolean estaActivo) {
		this.estaActivo = estaActivo;
	}
}