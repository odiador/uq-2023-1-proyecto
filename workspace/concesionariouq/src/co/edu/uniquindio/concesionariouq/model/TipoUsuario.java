package co.edu.uniquindio.concesionariouq.model;

public enum TipoUsuario {
	CLIENTE("Cliente"), EMPLEADO("Empleado"), ADMIN("Administrador");
	
	private final String tipo;
	
	private TipoUsuario(String tipo) {
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}
}
