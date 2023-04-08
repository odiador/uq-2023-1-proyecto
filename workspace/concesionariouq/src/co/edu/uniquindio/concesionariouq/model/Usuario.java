package co.edu.uniquindio.concesionariouq.model;

import co.edu.uniquindio.concesionariouq.view.principal.OpcionesMenu;

//ATRIBUTOS
public abstract class Usuario {
	private String nombre;
	private String id;
	private String contrasena;
	private String email;

	/**
	 * Este es el metodo constructor de la clase usuario
	 * 
	 * @param nombre
	 * @param id
	 */
	public Usuario(String nombre, String id, String contrasena, String email) {
		this.nombre = nombre;
		this.id = id;
		this.contrasena = contrasena;
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
	 * Este metodo obtiene la identificacion del usuario
	 * 
	 * @return id
	 */
	public String getId() {
		return id;
	}

	/**
	 * Este metodo cambia la identificacion del usuario
	 * 
	 * @param id
	 */
	public void setId(final String id) {
		this.id = id;
	}

	public abstract OpcionesMenu[] obtenerOpcionesDisponibles();

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

}