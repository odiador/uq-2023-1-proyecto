package co.edu.uniquindio.concesionarioCarros.model;

public class PickUp extends Familiar {
    private Boolean es4x4;
    private Double capacidadCajaCarga;

    /**
     * 
     */
    public PickUp() {
    }

    /**
     * 
     * @return
     */
    public Boolean getEs4x4() {
        return es4x4;
    }

    /**
     * 
     * @param es4x4
     */
    public void setEs4x4(final Boolean es4x4) {
        this.es4x4 = es4x4;
    }

    /**
     * 
     * @return
     */
    public Double getCapacidadCajaCarga() {
        return capacidadCajaCarga;
    }

    /**
     * 
     * @param capacidadCajaCarga
     */
    public void setCapacidadCajaCarga(final Double capacidadCajaCarga) {
        this.capacidadCajaCarga = capacidadCajaCarga;
    }

}
