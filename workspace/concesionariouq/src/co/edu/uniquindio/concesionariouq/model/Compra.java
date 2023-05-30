package co.edu.uniquindio.concesionariouq.model;

public class Compra extends Transaccion{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public TipoTransaccion getTipoTransaccion() {
		return TipoTransaccion.COMPRA;
	}
}
