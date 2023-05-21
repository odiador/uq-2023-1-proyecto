package co.edu.uniquindio.concesionariouq.model;

import java.io.Serializable;

//ATRIBUTOS
public abstract class Usuario implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final String id;
	private String nombre;
	private String contrasena;
	private String email;
	private String respuestaDeSeguridad;
	private TipoUsuario tipoUsuario;

	/**
	 * Este es el metodo constructor de la clase usuario
	 * 
	 * @param id
	 * @param nombre
	 * @param contrasena
	 * @param email
	 * @param tipo
	 */
	public Usuario(String id,String nombre, String contrasena, String email) {
		this.id = id;
		this.nombre = nombre;
		this.contrasena = contrasena;
		this.setEmail(email);
		this.setTipoUsuario(TipoUsuario.CLIENTE);
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

	public TipoUsuario getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(TipoUsuario tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

}