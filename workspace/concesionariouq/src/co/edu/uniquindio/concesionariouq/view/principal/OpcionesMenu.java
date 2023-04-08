package co.edu.uniquindio.concesionariouq.view.principal;

public enum OpcionesMenu {
	AGREGAR_VEHICULO("Agregar Vehiculo"), 
	AGREGAR_CLIENTE("Agregar Cliente"), 
	COMPRAR_VEHICULO("Comprar Vehiculo"),
	ALQUILAR_VEHICULO("Alquilar Vehiculo"), 
	ELIMINAR_CLIENTE("Eliminar cliente"), 
	ELIMINAR_VEHICULO("Eliminar Vehiculo"), 
	ACTUALIZAR_VEHICULO("Actualizar Vehiculo"),
	ACTUALIZAR_CLIENTE("Actualizar Vliente"), 
	VENDER_VEHICULO("Vender Vehiculo"), 
	GENERAR_REPORTE("Generar Reporte"), 
	ACTUALIZAR_INFO("Actualizar Info"),
	CAMBIAR_CONTRASENA("Cambiar Contraseña"), 
	ACERCA_DE("Acerca de");

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

	public static OpcionesMenu obtenerValorOpcion(String text) {
		OpcionesMenu[] arr = OpcionesMenu.values();
		for (OpcionesMenu opcionesMenu : arr)
			if (opcionesMenu.getText().equals(text))
				return opcionesMenu;

		return null;
	}
}
