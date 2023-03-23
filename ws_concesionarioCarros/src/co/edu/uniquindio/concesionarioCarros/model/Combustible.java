package co.edu.uniquindio.concesionarioCarros.model;

public abstract class Combustible {
    private Double autonomiaCargaCompleta;
    private Double tiempoDemoraCarga;
    private Boolean esEnchufable;
    private Boolean esHibridoLigero;
    private TipoCombustible tipo;

    public Combustible() {

    }

    public Combustible(TipoCombustible tipo) {
        this.tipo = tipo;
    }

    public Combustible(TipoCombustible tipo, Boolean esEnchufable, Boolean esHibridoLigero) {
        this.tipo = tipo;
        this.esEnchufable = esEnchufable;
        this.esHibridoLigero = esHibridoLigero;
    }

    public Combustible(TipoCombustible tipo, Double autonomiaCargaCompleta, Double tiempoDemoraCarga) {
        this.tipo = tipo;
        this.autonomiaCargaCompleta = autonomiaCargaCompleta;
        this.tiempoDemoraCarga = tiempoDemoraCarga;
    }

    public boolean esElectrico() {
        if (!autonomiaCargaCompleta.equals(null))
            if (!tiempoDemoraCarga.equals(null))
                return true;
        return false;
    }

    public boolean esHibrido() {
        if (!esEnchufable.equals(null))
            if (!esHibridoLigero.equals(null))
                return true;
        return false;
    }

    public Double getAutonomiaCargaCompleta() {
        return autonomiaCargaCompleta;
    }

    public void setAutonomiaCargaCompleta(Double autonomiaCargaCompleta) {
        this.autonomiaCargaCompleta = autonomiaCargaCompleta;
    }

    public Double getTiempoDemoraCarga() {
        return tiempoDemoraCarga;
    }

    public void setTiempoDemoraCarga(Double tiempoDemoraCarga) {
        this.tiempoDemoraCarga = tiempoDemoraCarga;
    }

    public Boolean getEsEnchufable() {
        return esEnchufable;
    }

    public void setEsEnchufable(Boolean esEnchufable) {
        this.esEnchufable = esEnchufable;
    }

    public Boolean getEsHibridoLigero() {
        return esHibridoLigero;
    }

    public void setEsHibridoLigero(Boolean esHibridoLigero) {
        this.esHibridoLigero = esHibridoLigero;
    }

    public TipoCombustible getTipo() {
        return tipo;
    }

    public void setTipo(TipoCombustible tipo) {
        this.tipo = tipo;
    }

}
