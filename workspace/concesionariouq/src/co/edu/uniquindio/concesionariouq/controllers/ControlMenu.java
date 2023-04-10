package co.edu.uniquindio.concesionariouq.controllers;

import co.edu.uniquindio.concesionariouq.model.OpcionMenu;
import co.edu.uniquindio.concesionariouq.model.Usuario;
import co.edu.uniquindio.concesionariouq.view.menu.PanelAgregarCliente;
import co.edu.uniquindio.concesionariouq.view.menu.PanelAgregarVehiculo;
import co.edu.uniquindio.concesionariouq.view.principal.MenuPrincipal;

public class ControlMenu {

	public static void actualizarVista(MenuPrincipal menuPrincipal, Usuario usuario, String msg) {
		OpcionMenu valorOpcion = OpcionMenu.obtenerValorOpcion(msg);
		if (valorOpcion == null)
			return;
		System.out.println(valorOpcion.getText());
		switch (valorOpcion) {
		case AGREGAR_CLIENTE:
			menuPrincipal.setCenter(new PanelAgregarCliente(menuPrincipal.getStage()));
			break;
		case AGREGAR_VEHICULO:
			menuPrincipal.setCenter(new PanelAgregarVehiculo());
			break;
		case ACERCA_DE:
			break;
		case ACTUALIZAR_CLIENTE:
			break;
		case ACTUALIZAR_INFO:
			break;
		case ACTUALIZAR_VEHICULO:
			break;
		case ALQUILAR_VEHICULO:
			break;
		case CAMBIAR_CONTRASENA:
			break;
		case COMPRAR_VEHICULO:
			break;
		case ELIMINAR_CLIENTE:
			break;
		case ELIMINAR_VEHICULO:
			break;
		case GENERAR_REPORTE:
			break;
		case VENDER_VEHICULO:
			break;
		default:
			break;
		}
	}

}
