package co.edu.uniquindio.concesionariouq.model;

public class Venta extends Transaccion {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Venta() {
	}

	@Override
	public TipoTransaccion getTipoTransaccion() {
		return TipoTransaccion.VENTA;
	}
}
