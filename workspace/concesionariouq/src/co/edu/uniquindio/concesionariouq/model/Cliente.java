package co.edu.uniquindio.concesionariouq.model;

import java.util.ArrayList;
import java.util.Collections;

import co.edu.uniquindio.concesionariouq.view.principal.OpcionesMenu;

public class Cliente extends Usuario implements PuedeTenerVehiculo {

	/**
	 * Este el constructor de la clase Cliente
	 * 
	 * @param nombre
	 * @param id
	 */
	public Cliente(String nombre, String id, String contrasena, String email) {
		super(nombre, id, contrasena, email);
	}

	@Override
	public void comprarVehiculo(Vehiculo vehiculo) {
	}

	/**
	 * Alquila un vehiculo por medio de la placa
	 */
	public void alquilarVehiculo(String placa) {

	}

	@Override
	public void venderVehiculo(String placa) {
	}

	@Override
	public OpcionesMenu[] obtenerOpcionesDisponibles() {
		ArrayList<OpcionesMenu> listaAux = new ArrayList<OpcionesMenu>();
		listaAux.add(OpcionesMenu.COMPRAR_VEHICULO);
		listaAux.add(OpcionesMenu.VENDER_VEHICULO);
		listaAux.add(OpcionesMenu.CAMBIAR_CONTRASENA);
		listaAux.add(OpcionesMenu.ACTUALIZAR_INFO);
		listaAux.add(OpcionesMenu.ACERCA_DE);
		Collections.sort(listaAux, OpcionesMenu::compararPorPrioridad);
		return (OpcionesMenu[]) listaAux.toArray(new OpcionesMenu[listaAux.size()]);
	}

}