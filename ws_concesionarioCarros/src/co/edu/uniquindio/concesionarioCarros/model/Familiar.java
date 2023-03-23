package co.edu.uniquindio.concesionarioCarros.model;

public abstract class Familiar {
    private Boolean tieneAireAcondicionado;
    private Boolean tieneCamaraReversa;
    private Boolean tieneABS;

    public Familiar() {
    }

    public Boolean getTieneAireAcondicionado() {
        return tieneAireAcondicionado;
    }

    public void setTieneAireAcondicionado(Boolean tieneAireAcondicionado) {
        this.tieneAireAcondicionado = tieneAireAcondicionado;
    }

    public Boolean getTieneCamaraReversa() {
        return tieneCamaraReversa;
    }

    public void setTieneCamaraReversa(Boolean tieneCamaraReversa) {
        this.tieneCamaraReversa = tieneCamaraReversa;
    }

    public Boolean getTieneABS() {
        return tieneABS;
    }

    public void setTieneABS(Boolean tieneABS) {
        this.tieneABS = tieneABS;
    }

}
