package co.edu.uniquindio.concesionariouq.controllers;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
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
		if (concesionario == null)
			this.concesionario = new Concesionario("CarroUQ", "Universidad del Quindio");
		return concesionario;
	}

	public void setConcesionario(Concesionario concesionario) {
		this.concesionario = concesionario;
	}

	public List<Vehiculo> listarVehiculo() {
		return getConcesionario().listarVehiculos();
	}

	/**
	 * Serializa el objeto concesionario convirtiendolo en una serie de bits y lo guarda en la ruta seleccionada. 
	 */
	public void saveData() {

		try (FileOutputStream fileOut = new FileOutputStream(
				"src/co/edu/uniquindio/concesionariouq/controllers/data.dat");
				ObjectOutputStream obOut = new ObjectOutputStream(fileOut);) {
			obOut.writeObject(getConcesionario());

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 
	 */
	public void loadData() {
		try (FileInputStream fileIn = new FileInputStream(
				"src/co/edu/uniquindio/concesionariouq/controllers/data.dat");
				ObjectInputStream obOut = new ObjectInputStream(fileIn);) {
			setConcesionario((Concesionario)obOut.readObject());
		} catch (IOException | ClassNotFoundException e) {
			saveData();
		}
	}

}
