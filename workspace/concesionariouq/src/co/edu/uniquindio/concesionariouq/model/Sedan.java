package co.edu.uniquindio.concesionariouq.model;

public class Sedan extends Van {

	// ATRIBUTOS

	private Boolean tieneVelocidadCrucero;
	private Boolean tieneSensorColision;
	private Boolean tieneSensorTrafico;
	private Boolean tieneAsistentePermanencia;

	/**
	 * Es el constructor del Sedan
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
	 * @param tieneAireAcondicionado
	 * @param tieneCamaraReversa
	 * @param tieneABS
	 * @param capacidadMaletero
	 * @param tieneVelocidadCrucero
	 * @param tieneSensorColision
	 * @param tieneSensorTrafico
	 * @param tieneAsistentePermanencia
	 */
	public Sedan(String placa, String marca, String modelo, Double cilindraje, Double velocidadMaxima,
			Combustible combustible, EstadoVehiculo estado, TipoCambio tipo, Integer numeroPasajeros,
			Integer numeroBolsasAire, Integer numeroPuertas, Boolean tieneAireAcondicionado, Boolean tieneCamaraReversa,
			Boolean tieneABS, Double capacidadMaletero, Boolean tieneVelocidadCrucero, Boolean tieneSensorColision,
			Boolean tieneSensorTrafico, Boolean tieneAsistentePermanencia) {
		super(placa, marca, modelo, cilindraje, velocidadMaxima, combustible, estado, tipo, numeroPasajeros,
				numeroBolsasAire, numeroPuertas, tieneAireAcondicionado, tieneCamaraReversa, tieneABS,
				capacidadMaletero);
		this.tieneVelocidadCrucero = tieneVelocidadCrucero;
		this.tieneSensorColision = tieneSensorColision;
		this.tieneSensorTrafico = tieneSensorTrafico;
		this.tieneAsistentePermanencia = tieneAsistentePermanencia;
	}

	/**
	 * Obtiene la velocidad crucero del Sedan
	 * 
	 * @return tieneVelocidadCrucero
	 */
	public Boolean getTieneVelocidadCrucero() {
		return tieneVelocidadCrucero;
	}

	/**
	 * Cambia la velocidad crucero del Sedan
	 * 
	 * @param tieneVelocidadCrucero
	 */
	public void setTieneVelocidadCrucero(final Boolean tieneVelocidadCrucero) {
		this.tieneVelocidadCrucero = tieneVelocidadCrucero;
	}

	/**
	 * Obtiene la opcion si el sedan tiene o no tiene el sensor colision
	 * 
	 * @return tieneSensorColision
	 */
	public Boolean getTieneSensorColision() {
		return tieneSensorColision;
	}

	/**
	 * Cambia la opcion si el sedan tiene o no tiene el sensor colision
	 * 
	 * @param tieneSensorColision
	 */
	public void setTieneSensorColision(final Boolean tieneSensorColision) {
		this.tieneSensorColision = tieneSensorColision;
	}

	/**
	 * Obtiene un booleano si tiene o no tiene sensor de trafico
	 * 
	 * @return tieneSensorTrafico
	 */
	public Boolean getTieneSensorTrafico() {
		return tieneSensorTrafico;
	}

	/**
	 * Cambia la opcion si el sedan tiene o no tiene sensor de trafico
	 * 
	 * @param tieneSensorTrafico
	 */
	public void setTieneSensorTrafico(final Boolean tieneSensorTrafico) {
		this.tieneSensorTrafico = tieneSensorTrafico;
	}

	/**
	 * Obtiene la opcion si el sedan tiene o no tiene asistente de permanencia
	 * 
	 * @return tieneAsistentePermanencia
	 */
	public Boolean getTieneAsistentePermanencia() {
		return tieneAsistentePermanencia;
	}

	/**
	 * Cambia la opcion si el sedan tiene o no tiene asistente de permanencia
	 * 
	 * @param tieneAsistentePermanencia
	 */
	public void setTieneAsistentePermanencia(final Boolean tieneAsistentePermanencia) {
		this.tieneAsistentePermanencia = tieneAsistentePermanencia;
	}

}