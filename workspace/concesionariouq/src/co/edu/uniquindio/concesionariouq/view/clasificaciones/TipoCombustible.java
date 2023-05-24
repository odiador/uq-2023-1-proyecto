package co.edu.uniquindio.concesionariouq.view.clasificaciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum TipoCombustible {
	GASOLINA("Gasolina"), DIESEL("Diesel"), ELECTRICO("Electrico"), HIBRIDO("Hibrido");
	
	private final String tipo;
	
	private TipoCombustible(String tipo) {
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
	 * Retorna una lista con los valores String de cada tipo de combustible.
	 * @return
	 */
	public static List<String> getTipos(){
		List<String> tipos = new ArrayList<>();
		for (TipoCombustible tipo : getValues()) {
			tipos.add(tipo.getTipo());
		}
		return tipos;
	}
	
	/**
	 * Retorna una lista con cada uno de los tipos de combustible.
	 * @return
	 */
	public static List<TipoCombustible> getValues(){
		List<TipoCombustible> lista = Arrays.asList(values());
		return lista;
	}
	
	
	
}
