package co.edu.uniquindio.concesionariouq.controllers;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import co.edu.uniquindio.concesionariouq.exceptions.AtributosFaltantesException;
import co.edu.uniquindio.concesionariouq.exceptions.LoginFailedException;
import co.edu.uniquindio.concesionariouq.exceptions.NullException;
import co.edu.uniquindio.concesionariouq.exceptions.UsuarioEncontradoException;
import co.edu.uniquindio.concesionariouq.exceptions.UsuarioNoEncontradoException;
import co.edu.uniquindio.concesionariouq.model.Cliente;
import co.edu.uniquindio.concesionariouq.model.Concesionario;
import co.edu.uniquindio.concesionariouq.model.Usuario;
import co.edu.uniquindio.concesionariouq.model.Vehiculo;

public class ModelFactoryController {

	private Concesionario concesionario;

	public static class Singleton {
		private final static ModelFactoryController eINSTANCE = new ModelFactoryController();
	}

	public static ModelFactoryController getInstance() {
		return Singleton.eINSTANCE;
	}

	public Concesionario getConcesionario() {
		if (concesionario == null)
			loadData();
		return concesionario;
	}

	public ArrayList<Usuario> hacerLogin(String id, String password) throws LoginFailedException, NullException {
		return getConcesionario().hacerLogin(id, password);
	}

	public void agregarCliente(Cliente cliente)
			throws UsuarioEncontradoException, NullException, AtributosFaltantesException {
		getConcesionario().agregarCliente(cliente);
		saveData();
	}

	public void eliminarCliente(String id) throws NullException, UsuarioNoEncontradoException {
		getConcesionario().eliminarCliente(id);
		saveData();
	}

	public void setConcesionario(Concesionario concesionario) {
		this.concesionario = concesionario;
	}

	public List<Vehiculo> listarVehiculo() {
		return getConcesionario().listarVehiculos();
	}

	/**
	 * Serializa el objeto concesionario convirtiendolo en una serie de bits y lo
	 * guarda en la ruta seleccionada.
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
		try (FileInputStream fileIn = new FileInputStream("src/co/edu/uniquindio/concesionariouq/controllers/data.dat");
				ObjectInputStream obOut = new ObjectInputStream(fileIn);) {
			setConcesionario((Concesionario) obOut.readObject());
		} catch (IOException | ClassNotFoundException e) {
			setConcesionario(new Concesionario("Carro UQ", "Universidad del Quindio"));
			saveData();
		}
	}

	public List<Cliente> listarClientes() {
		return getConcesionario().listarClientes();
	}

}
