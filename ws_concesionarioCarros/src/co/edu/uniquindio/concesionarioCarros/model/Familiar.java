package co.edu.uniquindio.concesionarioCarros.model;

public abstract class Familiar {
    private Boolean tieneAireAcondicionado;
    private Boolean tieneCamaraReversa;
    private Boolean tieneABS;

    /**
     * 
     */
    public Familiar() {
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
