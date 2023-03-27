package co.edu.uniquindio.concesionarioCarros.model;

public class PickUp extends Familiar {

    private Boolean es4x4;
    private Double capacidadCajaCarga;

    /**
     * Es el constructor de la PickUp
     * 
     * @param placa
     * @param marca
     * @param modelo
     * @param cilindraje
     * @param velocidadMaxima
     * @param estado
     * @param tipo
     * @param tieneAireAcondicionado
     * @param tieneCamaraReversa
     * @param tieneABS
     * @param es4x4
     * @param capacidadCajaCarga
     */
    public PickUp(String placa, String marca, String modelo, Double cilindraje, Double velocidadMaxima,
            EstadoVehiculo estado, TipoCambio tipo, Boolean tieneAireAcondicionado, Boolean tieneCamaraReversa,
            Boolean tieneABS, Boolean es4x4, Double capacidadCajaCarga) {
        super(placa, marca, modelo, cilindraje, velocidadMaxima, estado, tipo, tieneAireAcondicionado,
                tieneCamaraReversa,
                tieneABS);
        this.es4x4 = es4x4;
        this.capacidadCajaCarga = capacidadCajaCarga;
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
