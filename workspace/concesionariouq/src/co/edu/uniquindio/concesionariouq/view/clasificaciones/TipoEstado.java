package co.edu.uniquindio.concesionariouq.view.clasificaciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum TipoEstado {
	NUEVO("Nuevo"), USADO("Usado");
	
	private final String tipo;
	
	private TipoEstado(String tipo) {
		this.tipo = tipo;
	}

	/**
	 * Retorna el valor String del valor del Enum.
	 * @return
	 */
	public String getTipo() {
		return tipo;
	}
	
	/**
	 * Retorna una lista con los valores String de cada tipo de estado.
	 * @return
	 */
	public static List<String> getTipos(){
		List<String> tipos = new ArrayList<>();
		for (TipoEstado tipo : getValues()) {
			tipos.add(tipo.getTipo());
		}
		return tipos;
	}
	
	/**
	 * Retorna una lista con cada uno de los tipos de estado.
	 * @return
	 */
	public static List<TipoEstado> getValues(){
		List<TipoEstado> lista = Arrays.asList(values());
		return lista;
	}
}
