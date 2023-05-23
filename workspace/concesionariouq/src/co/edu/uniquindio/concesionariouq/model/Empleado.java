package co.edu.uniquindio.concesionariouq.model;

/**
 * Es la clase empleado, hereda de Usuario y tiene un atributo extra que es si
 * está activo o no <br>
 * Tiene como constructor:
 * <li>{@link Empleado#Empleado(String, String, String, String, String)}
 * 
 */
public class Empleado extends Usuario {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private boolean estaActivo = true;

	/**
	 * Este es el constructor principal de la clase {@link Empleado}
	 * 
	 * @param nombre
	 * @param contrasena
	 * @param contrasena
	 * @param email
	 * @param respuestaDeSeguridad
	 */
	public Empleado(String id, String nombre, String contrasena, String email, String respuestaDeSeguridad) {
		super(id, nombre, contrasena, email, respuestaDeSeguridad);
	}

	/**
	 * Determina si el emplado está activo o no
	 * 
	 * @return
	 */
	public boolean isActivo() {
		return estaActivo;
	}

	public void setIsActivo(boolean estaActivo) {
		this.estaActivo = estaActivo;
	}

	@Override
	public TipoUsuario getTipoUsuario() {
		return TipoUsuario.EMPLEADO;
	}
}