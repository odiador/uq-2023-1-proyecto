package co.edu.uniquindio.concesionariouq.model;

import java.time.LocalDate;

public class Alquiler extends Transaccion {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private LocalDate fechaAlquiler;
	private LocalDate fechaLimite;

	/**
	 * Constructor con parametros.
	 * @param codigo
	 * @param vehiculo
	 * @param fechaAlquiler
	 * @param fechaLimite
	 */
	public Alquiler(String codigo, Vehiculo vehiculo, LocalDate fechaLimite) {
		super(codigo, vehiculo);
		this.fechaAlquiler = LocalDate.now();
		this.fechaLimite = fechaLimite;
	}

	@Override
	public TipoTransaccion getTipoTransaccion() {
		return TipoTransaccion.ALQUILER;
	}

	public LocalDate getFechaAlquiler() {
		return fechaAlquiler;
	}

	public void setFechaAlquiler(LocalDate fechaAlquiler) {
		this.fechaAlquiler = fechaAlquiler;
	}

	public LocalDate getFechaLimite() {
		return fechaLimite;
	}

	public void setFechaLimite(LocalDate fechaLimite) {
		this.fechaLimite = fechaLimite;
	}

}
