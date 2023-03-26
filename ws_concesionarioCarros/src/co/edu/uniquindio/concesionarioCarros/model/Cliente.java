package co.edu.uniquindio.concesionarioCarros.model;

public class Cliente extends Usuario implements PuedeTenerVehiculo {

    /**
     * Este el constructor de la clase
     */
    public Cliente() {
    }

    @Override
    public void comprarVehiculo(Vehiculo vehiculo) {
    }

    /**
     * Alquila un vehiculo por medio de la placa
     */
    public void alquilarVehiculo(String placa) {

    }

    @Override
    public void venderVehiculo(String placa) {
    }

}
