package co.edu.uniquindio.concesionariouq.model;

public abstract class Vehiculo {
	
	//ATRIBUTOS
	
	private String placa;
	private String marca;
	private String modelo;
	private Double cilindraje;
	private Double velocidadMaxima;
	private Combustible combustible;
	private EstadoVehiculo estado;
	private TipoCambio tipo;

	/**
	 * Es el constructor de la clase Vehiculo
	 * 
	 * @param placa
	 * @param marca
	 * @param modelo
	 * @param cilindraje
	 * @param velocidadMaxima
	 * @param combustible
	 * @param estado
	 * @param tipo
	 */
	public Vehiculo(String placa, String marca, String modelo, Double cilindraje, Double velocidadMaxima,
			Combustible combustible, EstadoVehiculo estado, TipoCambio tipo) {
		this.placa = placa;
		this.marca = marca;
		this.modelo = modelo;
		this.cilindraje = cilindraje;
		this.velocidadMaxima = velocidadMaxima;
		this.combustible = combustible;
		this.estado = estado;
		this.tipo = tipo;
	}

	/**
	 * Obtiene la placa del vehiculo
	 * 
	 * @return placa
	 */
	public String getPlaca() {
		return placa;
	}

	/**
	 * Cambia la placa del vehiculo
	 * 
	 * @param placa
	 */
	public void setPlaca(String placa) {
		this.placa = placa;
	}

	/**
	 * Obtiene la marca del vehiculo
	 * 
	 * @return marca
	 */
	public String getMarca() {
		return marca;
	}

	/**
	 * Cambia la marca de vehiculo
	 * 
	 * @param marca
	 */
	public void setMarca(final String marca) {
		this.marca = marca;
	}

	/**
	 * Obtiene el modelo del vehiculo
	 * 
	 * @return modelo
	 */
	public String getModelo() {
		return modelo;
	}

	/**
	 *Cambia el modelo del vehiculo
	 * 
	 * @param modelo
	 */
	public void setModelo(final String modelo) {
		this.modelo = modelo;
	}

	/**
	 * Obtiene el cilindraje del vehiculo
	 * 
	 * @return cilindraje
	 */
	public Double getCilindraje() {
		return cilindraje;
	}

	/**
	 * Cambia el cilindraje del vehiculo
	 * 
	 * @param cilindraje
	 */
	public void setCilindraje(final Double cilindraje) {
		this.cilindraje = cilindraje;
	}

	/**
	 * Obtiene la velocidad maxima del vehiclo
	 * 
	 * @return velocidadMaxima
	 */
	public Double getVelocidadMaxima() {
		return velocidadMaxima;
	}

	/**
	 * Cambia la velocidad maxima del vehiculo
	 * 
	 * @param velocidadMaxima
	 */
	public void setVelocidadMaxima(final Double velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}

	/**
	 * Obtiene el combustible del vehiculo
	 * 
	 * @return combustible
	 */
	public Combustible getCombustible() {
		return combustible;
	}

	/**
	 * Cambia el tipo de combustible del vehiculo
	 * 
	 * @param combustible
	 */
	public void setCombustible(final Combustible combustible) {
		this.combustible = combustible;
	}

	/**
	 * Obtiene el estado del vehiculo
	 * 
	 * @return estado
	 */
	public EstadoVehiculo getEstado() {
		return estado;
	}

	/**
	 * Cambia el estado del vehiculo
	 * 
	 * @param estado
	 */
	public void setEstado(final EstadoVehiculo estado) {
		this.estado = estado;
	}

	/**
	 * Obtiene el tipo de vehiculo
	 * 
	 * @return tipo
	 */
	public TipoCambio getTipo() {
		return tipo;
	}

	/**
	 * Cambia el tipo de vehiculo
	 * 
	 * @param tipo
	 */
	public void setTipo(final TipoCambio tipo) {
		this.tipo = tipo;
	}

}