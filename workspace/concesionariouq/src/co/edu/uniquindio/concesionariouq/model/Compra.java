package co.edu.uniquindio.concesionariouq.model;

public class Compra extends Transaccion {

	private Proveedor proveedor;

	/**
	 * Es el constructor de la clase {@link Compra}
	 * 
	 * @param codigo
	 * @param vehiculo
	 * @param valor
	 */
	public Compra(String codigo, Vehiculo vehiculo, Double valor, Proveedor proveedor) {
		super(codigo, vehiculo, valor);
		this.proveedor = proveedor;
	}

	@Override
	public boolean atributosLlenos() {
		return super.atributosLlenos();
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public TipoTransaccion getTipoTransaccion() {
		return TipoTransaccion.COMPRA;
	}

	public Proveedor getProveedor() {
		return proveedor;
	}

	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}
}
