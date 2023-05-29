package co.edu.uniquindio.concesionariouq.model;

import java.io.Serializable;

/**
 * Es la clase usuario, la cual tiene un nombre, email, contraseña, id y
 * respuesta a una pregunta de seguridad
 *
 */
public abstract class Usuario implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected final String id;
	protected String nombre;
	protected String contrasena;
	protected String email;
	protected String respuestaDeSeguridad;

	/**
	 * Este es el metodo constructor de la clase {@link Usuario}
	 * 
	 * @param id
	 * @param nombre
	 * @param contrasena
	 * @param email
	 * @param respuestaDeSeguridad
	 */
	public Usuario(String id, String nombre, String contrasena, String email, String respuestaDeSeguridad) {
		this.id = id;
		this.nombre = nombre;
		this.contrasena = contrasena;
		this.email = email;
		this.respuestaDeSeguridad = respuestaDeSeguridad;
	}

	public abstract TipoUsuario getTipoUsuario();

	public boolean atributosLlenos() {
		return id != null && nombre != null && contrasena != null && email != null && respuestaDeSeguridad != null
				&& !id.isEmpty() && !nombre.isEmpty() && !contrasena.isEmpty() && !email.isEmpty()
				&& !respuestaDeSeguridad.isEmpty();
	}

	public boolean tieneId(String id) {
		return this.id.equals(id);
	}

	/**
	 * Este metodo obtiene el nombre del usuario
	 * 
	 * @return nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Este metodo cambia el nombre del usuario
	 * 
	 * @param nombre
	 */
	public void setNombre(final String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Obtiene la contraseña del usuario
	 * 
	 * @return contrasena
	 */
	public String getContrasena() {
		return contrasena;
	}

	/**
	 * Cambia la contraseña del usuario
	 * 
	 * @param contrasena
	 */
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getId() {
		return id;
	}

	public String getRespuestaDeSeguridad() {
		return respuestaDeSeguridad;
	}

	public void setRespuestaDeSeguridad(String respuestaDeSeguridad) {
		this.respuestaDeSeguridad = respuestaDeSeguridad;
	}

	@Override
	public String toString() {
		return String.format("Usuario [id=%s, nombre=%s, contrasena=%s, email=%s, respuestaDeSeguridad=%s]", id, nombre,
				contrasena, email, respuestaDeSeguridad);
	}

}