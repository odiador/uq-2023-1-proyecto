package co.edu.uniquindio.concesionarioCarros.model;

public class Automovil extends Vehiculo {
    private Integer numeroPasajeros;
    private Integer numeroBolsasAire;
    private Integer numeroPuertas;

    public Automovil() {
    }

    public Integer getNumeroPasajeros() {
        return numeroPasajeros;
    }

    public void setNumeroPasajeros(Integer numeroPasajeros) {
        this.numeroPasajeros = numeroPasajeros;
    }

    public Integer getNumeroBolsasAire() {
        return numeroBolsasAire;
    }

    public void setNumeroBolsasAire(Integer numeroBolsasAire) {
        this.numeroBolsasAire = numeroBolsasAire;
    }

    public Integer getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(Integer numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

}
