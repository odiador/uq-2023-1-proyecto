package co.edu.uniquindio.concesionarioCarros.model;

public class Camion extends Vehiculo {
    private Double capacidadCarga;
    private Boolean tieneAireAcondicionado;
    private Boolean tieneFrenosAire;
    private Boolean tieneABS;
    private Integer numeroEjes;
    private String tipoCamion; // El tipo de tipoCamion es provicional. Deberia ser un Enum

    public Camion() {
    }

    public Double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(Double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public Boolean getTieneAireAcondicionado() {
        return tieneAireAcondicionado;
    }

    public void setTieneAireAcondicionado(Boolean tieneAireAcondicionado) {
        this.tieneAireAcondicionado = tieneAireAcondicionado;
    }

    public Boolean getTieneFrenosAire() {
        return tieneFrenosAire;
    }

    public void setTieneFrenosAire(Boolean tieneFrenosAire) {
        this.tieneFrenosAire = tieneFrenosAire;
    }

    public Boolean getTieneABS() {
        return tieneABS;
    }

    public void setTieneABS(Boolean tieneABS) {
        this.tieneABS = tieneABS;
    }

    public Integer getNumeroEjes() {
        return numeroEjes;
    }

    public void setNumeroEjes(Integer numeroEjes) {
        this.numeroEjes = numeroEjes;
    }

    public String getTipoCamion() {
        return tipoCamion;
    }

    public void setTipoCamion(String tipoCamion) {
        this.tipoCamion = tipoCamion;
    }

}
