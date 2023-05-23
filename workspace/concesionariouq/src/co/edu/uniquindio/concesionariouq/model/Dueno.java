package co.edu.uniquindio.concesionariouq.model;

public class Dueno extends Administrador {

	/**
	 * 
	 * @param id
	 * @param nombre
	 * @param contrasena
	 * @param email
	 * @param respuestaDeSeguridad
	 */
	public Dueno(String id, String nombre, String contrasena, String email, String respuestaDeSeguridad) {
		super(id, nombre, contrasena, email, respuestaDeSeguridad);
	}

	@Override
	public TipoUsuario getTipoUsuario() {
		return TipoUsuario.DUENO;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
