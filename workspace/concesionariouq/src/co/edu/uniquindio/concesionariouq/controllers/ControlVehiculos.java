package co.edu.uniquindio.concesionariouq.controllers;

import co.edu.uniquindio.concesionariouq.model.Combustible;
import co.edu.uniquindio.concesionariouq.model.EstadoVehiculo;
import co.edu.uniquindio.concesionariouq.model.TipoCambio;
import co.edu.uniquindio.concesionariouq.model.TipoVehiculo;
import co.edu.uniquindio.concesionariouq.view.agregarVehiculo.PanelAgregarBus;
import co.edu.uniquindio.concesionariouq.view.agregarVehiculo.PanelAgregarCamion;
import co.edu.uniquindio.concesionariouq.view.agregarVehiculo.PanelAgregarCamioneta;
import co.edu.uniquindio.concesionariouq.view.agregarVehiculo.PanelAgregarDeportivo;
import co.edu.uniquindio.concesionariouq.view.agregarVehiculo.PanelAgregarMoto;
import co.edu.uniquindio.concesionariouq.view.agregarVehiculo.PanelAgregarPickUp;
import co.edu.uniquindio.concesionariouq.view.agregarVehiculo.PanelAgregarSedan;
import co.edu.uniquindio.concesionariouq.view.agregarVehiculo.PanelAgregarVan;
import co.edu.uniquindio.concesionariouq.view.agregarVehiculo.PanelConVolver;
import co.edu.uniquindio.concesionariouq.view.menu.PanelAgregarVehiculo;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.input.MouseEvent;

public class ControlVehiculos {

	public static void agregarMoto(String string, String string2, String string3, String string4, String string5,
			String string6, String string7, Combustible combustible) {

		new Alert(AlertType.CONFIRMATION, "Moto Agregada").show();
	}

	public static void irACambiarCombustible(PanelConVolver panel, Combustible combustible) {

	}

	public static void irAgregarVehiculo(PanelAgregarVehiculo panelAgregarVehiculo, String opcionTipoVehiculo,
			EventHandler<? super MouseEvent> eventoVolver) {
		TipoVehiculo tipoVehiculo = TipoVehiculo.obtenerValorTipo(opcionTipoVehiculo);
		if (tipoVehiculo == null) {
			new Alert(AlertType.WARNING, "No se ha encontrado la opcion").show();
			panelAgregarVehiculo.initComp();
			return;
		}

		switch (tipoVehiculo) {
		case MOTO:
			panelAgregarVehiculo.setBottom(null);
			panelAgregarVehiculo.setCenter(new PanelAgregarMoto(eventoVolver));
			break;
		case BUS:
			panelAgregarVehiculo.setBottom(null);
			panelAgregarVehiculo.setCenter(new PanelAgregarBus(eventoVolver));
			break;
		case CAMION:
			panelAgregarVehiculo.setBottom(null);
			panelAgregarVehiculo.setCenter(new PanelAgregarCamion(eventoVolver));
			break;
		case CAMIONETA:
			panelAgregarVehiculo.setBottom(null);
			panelAgregarVehiculo.setCenter(new PanelAgregarCamioneta(eventoVolver));
			break;
		case DEPORTIVO:
			panelAgregarVehiculo.setBottom(null);
			panelAgregarVehiculo.setCenter(new PanelAgregarDeportivo(eventoVolver));
			break;
		case PICKUP:
			panelAgregarVehiculo.setBottom(null);
			panelAgregarVehiculo.setCenter(new PanelAgregarPickUp(eventoVolver));
			break;
		case SEDAN:
			panelAgregarVehiculo.setBottom(null);
			panelAgregarVehiculo.setCenter(new PanelAgregarSedan(eventoVolver));
			break;
		case VAN:
			panelAgregarVehiculo.setBottom(null);
			panelAgregarVehiculo.setCenter(new PanelAgregarVan(eventoVolver));
			break;

		default:
			new Alert(AlertType.WARNING, "No se ha implementado la opcion " + tipoVehiculo.getTipo()).show();
			break;
		}
	}

	public static void agregarBus(String placa, String marca, String modelo, String cilindraje, String velocidadMaxima,
			Combustible combustible, String estado, String tipo, String numeroPasajeros, String numeroBolsasAire,
			String numeroPuertas, Boolean tieneAireAcondicionado, Boolean tieneCamaraReversa, Boolean tieneABS,
			String capacidadMaletero, String numeroEjes, String numeroSalidasEmergencia) {

	}

	public static void agregarPickUp(String placa, String marca, String modelo, String cilindraje,
			String velocidadMaxima, Combustible combustible, String estado, String tipo, String numeroPasajeros,
			String numeroBolsasAire, String numeroPuertas, Boolean tieneAireAcondicionado, Boolean tieneCamaraReversa,
			Boolean tieneABS, Boolean es4x4, String capacidadCajaCarga) {

	}

	public static void agregarCamioneta(String placa, String marca, String modelo, String cilindraje,
			String velocidadMaxima, Combustible combustible, String estado, String tipo, String numeroPasajeros,
			String numeroBolsasAire, String numeroPuertas, Boolean tieneAireAcondicionado, Boolean tieneCamaraReversa,
			Boolean tieneABS, String capacidadMaletero, Boolean tieneVelocidadCrucero, Boolean tieneSensorColision,
			Boolean tieneSensorTrafico, Boolean tieneAsistentePermanencia, Boolean es4x4) {

	}

	public static void agregarDeportivo(String placa, String marca, String modelo, String cilindraje,
			String velocidadMaxima, Combustible combustible, String estado, String tipo, String numeroPasajeros,
			String numeroBolsasAire, String numeroPuertas, String numeroCaballosFuerza, String tiempoAlcanza100Kmh) {

	}

	public static void agregarSedan(String placa, String marca, String modelo, String cilindraje,
			String velocidadMaxima, Combustible combustible, String estado, String tipo, String numeroPasajeros,
			String numeroBolsasAire, String numeroPuertas, Boolean tieneAireAcondicionado, Boolean tieneCamaraReversa,
			Boolean tieneABS, String capacidadMaletero, Boolean tieneVelocidadCrucero, Boolean tieneSensorColision,
			Boolean tieneSensorTrafico, Boolean tieneAsistentePermanencia) {

	}

	public static void agregarVan(String placa, String marca, String modelo, String cilindraje, String velocidadMaxima,
			Combustible combustible, String estado, String tipo, String numeroPasajeros, String numeroBolsasAire,
			String numeroPuertas, Boolean tieneAireAcondicionado, Boolean tieneCamaraReversa, Boolean tieneABS,
			String capacidadMaletero) {

	}

	public static void agregarCamion(String placa, String marca, String modelo, String cilindraje,
			String velocidadMaxima, Combustible combustible, String estado, String tipo, String capacidadCarga,
			Boolean tieneAireAcondicionado, Boolean tieneFrenosAire, String numeroEjes, Boolean tieneABS,
			String tipoCamion) {

	}

}
