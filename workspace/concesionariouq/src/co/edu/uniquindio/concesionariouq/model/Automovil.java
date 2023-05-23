package co.edu.uniquindio.concesionariouq.model;

public abstract class Automovil extends Vehiculo {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// ATRIBUTOS
	protected Integer numeroPasajeros;
	protected Integer numeroBolsasAire;
	protected Integer numeroPuertas;

	/**
	 * Es el constructor del automovil
	 *
	 * @param marca
	 * @param modelo
	 * @param cilindraje
	 * @param velocidadMaxima
	 * @param combustible
	 * @param estado
	 * @param tipo
	 */
	public Automovil(String marca, String modelo, Double cilindraje, Double velocidadMaxima, Combustible combustible,
			EstadoVehiculo estado, TipoCambio tipo, Integer numeroPasajeros, Integer numeroBolsasAire,
			Integer numeroPuertas) {
		super(marca, modelo, cilindraje, velocidadMaxima, combustible, estado, tipo);
		this.numeroPasajeros = numeroPasajeros;
		this.numeroBolsasAire = numeroBolsasAire;
		this.numeroPuertas = numeroPuertas;
	}

	@Override
	public boolean atributosLlenos() {
		return super.atributosLlenos() && numeroPasajeros != null && numeroBolsasAire != null && numeroPuertas != null;
	}

	/**
	 * Obtiene el numero de pasajeros
	 *
	 * @return numeroPasajeros
	 */
	public Integer getNumeroPasajeros() {
		return numeroPasajeros;
	}

	/**
	 * Cambia el numero de pasajeros
	 *
	 * @param numeroPasajeros
	 */
	public void setNumeroPasajeros(final Integer numeroPasajeros) {
		this.numeroPasajeros = numeroPasajeros;
	}

	/**
	 * Obiene el numero de bolsas de aire
	 *
	 * @return numeroBolsasAire
	 */
	public Integer getNumeroBolsasAire() {
		return numeroBolsasAire;
	}

	/**
	 * Cambia el numero de bolsas de aire
	 *
	 * @param numeroBolsasAire
	 */
	public void setNumeroBolsasAire(final Integer numeroBolsasAire) {
		this.numeroBolsasAire = numeroBolsasAire;
	}

	/**
	 * Obtiene el numero de puertas
	 *
	 * @return numeroPuertas
	 */
	public Integer getNumeroPuertas() {
		return numeroPuertas;
	}

	/**
	 * Cambia el numero de puertas
	 *
	 * @param numeroPuertas
	 */
	public void setNumeroPuertas(final Integer numeroPuertas) {
		this.numeroPuertas = numeroPuertas;
	}

	@Override
	public String toString() {
		return String.format(
				"Automovil [marca=%s, modelo=%s, cilindraje=%s, velocidadMaxima=%s, combustible=%s, estado=%s, tipo=%s, numeroPasajeros=%s, numeroBolsasAire=%s, numeroPuertas=%s]",
				marca, modelo, cilindraje, velocidadMaxima, combustible, estado, tipo, numeroPasajeros,
				numeroBolsasAire, numeroPuertas);
	}

}