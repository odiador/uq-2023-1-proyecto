package co.edu.uniquindio.concesionariouq.controllers;

import co.edu.uniquindio.concesionariouq.model.Concesionario;

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
	
	
}
