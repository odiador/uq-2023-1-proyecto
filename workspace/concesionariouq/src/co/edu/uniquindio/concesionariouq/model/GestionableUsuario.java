package co.edu.uniquindio.concesionariouq.model;

import java.util.List;

import co.edu.uniquindio.concesionariouq.exceptions.AtributosFaltantesException;
import co.edu.uniquindio.concesionariouq.exceptions.NullException;
import co.edu.uniquindio.concesionariouq.exceptions.UsuarioEncontradoException;
import co.edu.uniquindio.concesionariouq.exceptions.UsuarioNoEncontradoException;

public interface GestionableUsuario {

	public void agregarUsuario(Usuario usuario)
			throws UsuarioEncontradoException, AtributosFaltantesException, NullException;

	public void eliminarUsuario(String id)
			throws UsuarioNoEncontradoException, AtributosFaltantesException, NullException;

	public Usuario buscarUsuario(String id);

	public boolean validarUsuario(String id);

	public List<Usuario> listarUsuarios();
}
