package co.edu.uniquindio.concesionariouq.model;

import java.io.Serializable;

public abstract class Transaccion implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected String codigo;
	protected Vehiculo vehiculo;
	protected Double valor;

	/**
	 * Este es el constructor principal de la clase {@link Transaccion}
	 * 
	 * @param codigo
	 * @param vehiculo
	 * @param valor
	 */
	public Transaccion(final String codigo, final Vehiculo vehiculo, final Double valor) {
		this.codigo = codigo;
		this.vehiculo = vehiculo;
		this.valor = valor;
	}

	public abstract TipoTransaccion getTipoTransaccion();

	public boolean atributosLlenos() {
		return codigo != null && vehiculo != null && vehiculo.atributosLlenos();
	}

	public boolean tieneCodigo(String codigo) {
		return this.codigo.equals(codigo);
	}

	/**
	 * Obtiene el codigo de la Transaccion
	 * 
	 * @return codigo
	 */
	public String getCodigo() {
		return codigo;
	}

	/**
	 * Cambia el codigo de la Transaccion
	 * 
	 * @param codigo
	 */
	public void setCodigo(final String codigo) {
		this.codigo = codigo;
	}

	/**
	 * @return the vehiculo
	 */
	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	/**
	 * @param vehiculo the vehiculo to set
	 */
	public void setVehiculo(final Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Transaccion other = (Transaccion) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return String.format("Transaccion [codigo=%s, vehiculo=%s, valor=%s]", codigo, vehiculo, valor);
	}

}