package co.edu.uniquindio.concesionarioCarros.model;

public class Moto extends Vehiculo {

    public Moto(String placa, String marca, String modelo, Double cilindraje, Double velocidadMaxima,
            Combustible combustible,
            EstadoVehiculo estado, TipoCambio tipo) {
        super(placa, marca, modelo, cilindraje, velocidadMaxima, combustible, estado, tipo);
    }

}
