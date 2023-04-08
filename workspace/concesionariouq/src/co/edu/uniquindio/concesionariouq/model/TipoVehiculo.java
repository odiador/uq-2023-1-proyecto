package co.edu.uniquindio.concesionariouq.model;

import co.edu.uniquindio.concesionariouq.view.principal.OpcionesMenu;

public enum TipoVehiculo {
	BUS("Bus"), CAMION("Camion"), CAMIONETA("Camioneta"), DEPORTIVO("Deportivo"), FAMILIAR("Familiar"), MOTO("Moto"),
	PICKUP("PickUp"), SEDAN("Sendan"), VAN("Van");

	private final String tipo;

	private TipoVehiculo(String tipo) {
		this.tipo = tipo;
	}

	public static String[] tipoValues() {
		TipoVehiculo[] arr = TipoVehiculo.values();
		String[] tipos = new String[arr.length];
		for (int i = 0; i < arr.length; i++)
			tipos[i] = arr[i].getTipo();
		return tipos;
	}

	public String getTipo() {
		return tipo;
	}

	public static TipoVehiculo obtenerValorTipo(String tipo) {
		TipoVehiculo[] arr = TipoVehiculo.values();
		for (TipoVehiculo tipoVehiculo : arr)
			if (tipoVehiculo.getTipo().equals(tipo))
				return tipoVehiculo;

		return null;
	}

}
