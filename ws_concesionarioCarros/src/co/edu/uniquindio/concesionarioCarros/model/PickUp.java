package co.edu.uniquindio.concesionarioCarros.model;

public class PickUp extends Familiar {
    private Boolean es4x4;
    private Double capacidadCajaCarga;

    public PickUp() {
    }

    public Boolean getEs4x4() {
        return es4x4;
    }

    public void setEs4x4(Boolean es4x4) {
        this.es4x4 = es4x4;
    }

    public Double getCapacidadCajaCarga() {
        return capacidadCajaCarga;
    }

    public void setCapacidadCajaCarga(Double capacidadCajaCarga) {
        this.capacidadCajaCarga = capacidadCajaCarga;
    }

}
