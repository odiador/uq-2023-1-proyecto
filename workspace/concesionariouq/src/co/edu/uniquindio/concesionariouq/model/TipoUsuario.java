package co.edu.uniquindio.concesionariouq.model;

public enum TipoUsuario {
	CLIENTE("Cliente"), EMPLEADO("Empleado"), ADMIN("Administrador"), DUENO("Dueño");

	private final String text;

	/**
	 * Es el constructor de {@link TipoUsuario}
	 * 
	 * @param text
	 */
	private TipoUsuario(String text) {
		this.text = text;
	}

	/**
	 * Obtiene el texto correspondiente al tipo de usuario
	 * 
	 * @return
	 */
	public String getText() {
		return text;
	}

	/**
	 * Obtiene los valores de los tipos de usuarios
	 * 
	 * @return
	 */
	public static String[] textValues() {
		TipoUsuario[] values = values();
		String[] textValues = new String[values.length];
		for (int i = 0; i < values.length; i++)
			textValues[i] = values[i].getText();
		return textValues;
	}

	public static TipoUsuario of(String text) {
		TipoUsuario[] values = values();
		for (TipoUsuario tipoUsuario : values)
			if (tipoUsuario.getText().equals(text))
				return tipoUsuario;
		return null;
	}
}
