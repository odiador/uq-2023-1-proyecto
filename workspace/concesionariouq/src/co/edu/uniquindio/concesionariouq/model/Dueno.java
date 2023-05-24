package co.edu.uniquindio.concesionariouq.model;

public class Dueno extends Administrador {

	/**
	 * 
	 * @param id
	 * @param nombre
	 * @param contrasena
	 * @param email
	 * @param respuestaDeSeguridad
	 * @param estaActivo
	 */
	public Dueno(String id, String nombre, String contrasena, String email, String respuestaDeSeguridad,
			Boolean estaActivo) {
		super(id, nombre, contrasena, email, respuestaDeSeguridad, estaActivo);
	}

	@Override
	public TipoUsuario getTipoUsuario() {
		return TipoUsuario.DUENO;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String toString() {
		return String.format(
				"Dueno [id=%s, nombre=%s, contrasena=%s, email=%s, respuestaDeSeguridad=%s, estaActivo=%s, listaEmpleados=%s]",
				id, nombre, contrasena, email, respuestaDeSeguridad, estaActivo, listaEmpleados);
	}

}
