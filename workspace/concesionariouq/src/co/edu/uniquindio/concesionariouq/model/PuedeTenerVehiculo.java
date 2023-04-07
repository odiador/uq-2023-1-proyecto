package co.edu.uniquindio.concesionariouq.model;

public interface PuedeTenerVehiculo {

	/**
	 * Permite verder un vehiculo
	 */
	public void venderVehiculo(String placa);

	/**
	 * Permite comprar un vehiculo
	 */
	public void comprarVehiculo(Vehiculo vehiculo);

}
