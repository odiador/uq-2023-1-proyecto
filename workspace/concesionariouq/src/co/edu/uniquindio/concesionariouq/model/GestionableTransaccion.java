package co.edu.uniquindio.concesionariouq.model;

import java.util.List;

import co.edu.uniquindio.concesionariouq.exceptions.AtributosFaltantesException;
import co.edu.uniquindio.concesionariouq.exceptions.NullException;
import co.edu.uniquindio.concesionariouq.exceptions.TransaccionNoExisteException;
import co.edu.uniquindio.concesionariouq.exceptions.TransaccionYaExisteException;

public interface GestionableTransaccion {

	public void agregarTransaccion(Transaccion transaccion)
			throws TransaccionYaExisteException, AtributosFaltantesException, NullException;

	public void eliminarTransaccion(String id)
			throws TransaccionNoExisteException, AtributosFaltantesException, NullException;

	public Transaccion buscarTransaccion(String id);

	public default boolean validarTransaccion(String id) {
		return buscarTransaccion(id) != null;
	}

	public List<Transaccion> listarTransacciones();
}
