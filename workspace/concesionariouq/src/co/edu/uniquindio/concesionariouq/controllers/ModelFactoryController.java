package co.edu.uniquindio.concesionariouq.controllers;

import java.util.List;

import co.edu.uniquindio.concesionariouq.model.Concesionario;
import co.edu.uniquindio.concesionariouq.model.Vehiculo;

public class ModelFactoryController {
	
	private Concesionario concesionario;
	
	private ModelFactoryController() {
	}
	
	public static class Singleton {
		private final static ModelFactoryController eINSTANCE = new ModelFactoryController();
	}
	
	public static ModelFactoryController getInstance() {
		return Singleton.eINSTANCE;
	}

	public Concesionario getConcesionario() {
		if(concesionario == null) this.concesionario = new Concesionario("CarroUQ", "Universidad del Quindio");
		return concesionario;
	}

	public void setConcesionario(Concesionario concesionario) {
		this.concesionario = concesionario;
	}
	
	public List<Vehiculo> listarVehiculo(){
		return getConcesionario().listarVehiculos();
	}
	
	
}
