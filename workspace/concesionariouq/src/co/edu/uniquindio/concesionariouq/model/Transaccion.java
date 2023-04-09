package co.edu.uniquindio.concesionariouq.model;

import java.util.ArrayList;
import java.util.List;

public class Transaccion {
	
	//ATRIBUTOS
	private String codigo;
	private List<DetalleTransaccion> listaDetalleTransacciones;

	/**
	 * Este es el constructor vacio de la clase
	 * 
	 */
	public Transaccion() {
	}

	/**
	 * Este es el constructor principal de la clase
	 * 
	 * @param codigo
	 */
	public Transaccion(final String codigo) {
		this.codigo = codigo;
		this.listaDetalleTransacciones = new ArrayList<DetalleTransaccion>();
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
	 * Obtiene la lista de los detalles de las transacciones
	 * 
	 * @return listaDetalleTransacciones
	 */
	public List<DetalleTransaccion> getListaDetalleTransacciones() {
		return listaDetalleTransacciones;
	}

	/**
	 * Cambia la lista de los detalles de las transacciones
	 * 
	 * @param listaDetalleTransacciones
	 */
	public void setListaDetalleTransacciones(final List<DetalleTransaccion> listaDetalleTransacciones) {
		this.listaDetalleTransacciones = listaDetalleTransacciones;
	}

	/**
	 *  Agrega un detalle a la transaccion
	 * 
	 * @param tipo
	 */
	public void agregarDetalleTransaccion(final TipoTransaccion tipo) {

	}
}