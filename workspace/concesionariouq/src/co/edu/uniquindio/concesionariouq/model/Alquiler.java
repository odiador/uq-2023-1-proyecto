package co.edu.uniquindio.concesionariouq.model;

public class Alquiler extends Transaccion{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	public TipoTransaccion getTipoTransaccion() {
		return TipoTransaccion.ALQUILER;
	}

}
