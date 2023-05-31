package co.edu.uniquindio.concesionariouq.model;

public class Venta extends Transaccion {

	public Venta(String codigo, Vehiculo vehiculo, Double valor) {
		super(codigo, vehiculo, valor);
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public TipoTransaccion getTipoTransaccion() {
		return TipoTransaccion.VENTA;
	}
}
