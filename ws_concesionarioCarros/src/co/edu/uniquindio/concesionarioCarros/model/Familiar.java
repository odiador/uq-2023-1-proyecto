package co.edu.uniquindio.concesionarioCarros.model;

public abstract class Familiar extends Automovil {

    private Boolean tieneAireAcondicionado;
    private Boolean tieneCamaraReversa;
    private Boolean tieneABS;

    /**
     * Es el constructor del automovil familiar
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
     */
    public Familiar(String placa, String marca, String modelo, Double cilindraje, Double velocidadMaxima,
            EstadoVehiculo estado, TipoCambio tipo, Boolean tieneAireAcondicionado, Boolean tieneCamaraReversa,
            Boolean tieneABS) {
        super(placa, marca, modelo, cilindraje, velocidadMaxima, estado, tipo);
        this.tieneAireAcondicionado = tieneAireAcondicionado;
        this.tieneCamaraReversa = tieneCamaraReversa;
        this.tieneABS = tieneABS;
    }

    /**
     * 
     * @return
     */
    public Boolean getTieneAireAcondicionado() {
        return tieneAireAcondicionado;
    }

    /**
     * 
     * @param tieneAireAcondicionado
     */
    public void setTieneAireAcondicionado(final Boolean tieneAireAcondicionado) {
        this.tieneAireAcondicionado = tieneAireAcondicionado;
    }

    /**
     * 
     * @return
     */
    public Boolean getTieneCamaraReversa() {
        return tieneCamaraReversa;
    }

    /**
     * 
     * @param tieneCamaraReversa
     */
    public void setTieneCamaraReversa(final Boolean tieneCamaraReversa) {
        this.tieneCamaraReversa = tieneCamaraReversa;
    }

    /**
     * 
     * @return
     */
    public Boolean getTieneABS() {
        return tieneABS;
    }

    /**
     * 
     * @param tieneABS
     */
    public void setTieneABS(final Boolean tieneABS) {
        this.tieneABS = tieneABS;
    }

}
