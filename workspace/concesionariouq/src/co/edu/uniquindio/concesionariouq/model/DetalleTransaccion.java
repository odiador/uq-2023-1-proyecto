package co.edu.uniquindio.concesionariouq.model;

import java.io.Serializable;

public class DetalleTransaccion implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// ATRIBUTOS
	private Vehiculo vehiculo;
	private String codigoTransaccion;

	/**
	 * Este es el contructor vacio de la clase
	 */
	public DetalleTransaccion() {
	}

	/**
	 * Es el constructor de la clase DetalleTransaccion
	 * 
	 * @param vehiculo
	 * @param codigoTransaccion
	 * @param tipo
	 */
	public DetalleTransaccion(Vehiculo vehiculo, String codigoTransaccion) {
		super();
		this.vehiculo = vehiculo;
		this.codigoTransaccion = codigoTransaccion;
	}

	/**
	 * Obtiene el vehiculo del detalle de transaccion
	 * 
	 * @return vehiculo
	 */
	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	/**
	 * Cambia el vehiculo del detalle de transaccion
	 * 
	 * @param vehiculo
	 */
	public void setVehiculo(final Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

	/**
	 * Obtiene el codigo de transaccion
	 * 
	 * @return codigoTransaccion
	 */
	public String getCodigoTransaccion() {
		return codigoTransaccion;
	}

	/**
	 * Cambia el codigo de transaccion
	 * 
	 * @param codigoTransaccion
	 */
	public void setCodigoTransaccion(final String codigoTransaccion) {
		this.codigoTransaccion = codigoTransaccion;
	}

}