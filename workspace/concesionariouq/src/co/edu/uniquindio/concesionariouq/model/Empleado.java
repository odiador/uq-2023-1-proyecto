package co.edu.uniquindio.concesionariouq.model;

public class Empleado extends Usuario {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private boolean estaActivo = true;

	/**
	 * Este es el constructor principal de la clase
	 * 
	 * @param nombre
	 * @param contrasena
	 * @param email
	 */
	public Empleado(String id, String nombre, String contrasena, String email) {
		super(id, nombre, contrasena, email);
	}

	public boolean isActivo() {
		return estaActivo;
	}

	public void setIsActivo(boolean estaActivo) {
		this.estaActivo = estaActivo;
	}
}