package co.edu.uniquindio.concesionariouq.view.principal;

public enum OpcionesMenu {
	AGREGAR_VEHICULO("Agregar Vehiculo"), AGREGAR_CLIENTE("Agregar Cliente");
	private String text;

	private OpcionesMenu(String text) {
		this.text = text;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
}
