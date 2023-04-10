package co.edu.uniquindio.concesionariouq.model;

public class Deportivo extends Automovil {

	private Integer numeroCaballosFuerza;
	private Integer tiempoAlcanza100Kmh; // podria ser Double por los segundos

	/**
	 * Es el constructor del Deportivo
	 * 
	 * @param placa
	 * @param marca
	 * @param modelo
	 * @param cilindraje
	 * @param velocidadMaxima
	 * @param combustible
	 * @param estado
	 * @param tipo
	 * @param numeroPasajeros
	 * @param numeroBolsasAire
	 * @param numeroPuertas
	 * @param numeroCaballosFuerza
	 * @param tiempoAlcanza100Kmh
	 */
	public Deportivo(String placa, String marca, String modelo, Double cilindraje, Double velocidadMaxima,
			Combustible combustible, EstadoVehiculo estado, TipoCambio tipo, Integer numeroPasajeros,
			Integer numeroBolsasAire, Integer numeroPuertas, Integer numeroCaballosFuerza,
			Integer tiempoAlcanza100Kmh) {
		super(placa, marca, modelo, cilindraje, velocidadMaxima, combustible, estado, tipo, numeroPasajeros,
				numeroBolsasAire, numeroPuertas);
		this.numeroCaballosFuerza = numeroCaballosFuerza;
		this.tiempoAlcanza100Kmh = tiempoAlcanza100Kmh;
	}

	/**
	 * Obtiene el numero de caballos de fuerza del deportivo 
	 *
	 * @return numeroCaballosFuerza
	 */
	public Integer getNumeroCaballosFuerza() {
		return numeroCaballosFuerza;
	}

	/**
	 * Cambia el numero de caballos de fuerza del deportivo
	 *
	 * @param numeroCaballosFuerza
	 */
	public void setNumeroCaballosFuerza(final Integer numeroCaballosFuerza) {
		this.numeroCaballosFuerza = numeroCaballosFuerza;
	}

	/**
	 * Obtiene el tiempo en el que el deportivo alcanza los 100 Kmh 
	 *
	 * @return
	 */
	public Integer getTiempoAlcanza100Kmh() {
		return tiempoAlcanza100Kmh;
	}

	/**
	 * Cambia el tiempo en el que el deportivo alcanza los 100 Kmh
	 * 
	 * @param tiempoAlcanza100Kmh
	 */
	public void setTiempoAlcanza100Kmh(final Integer tiempoAlcanza100Kmh) {
		this.tiempoAlcanza100Kmh = tiempoAlcanza100Kmh;
	}

}