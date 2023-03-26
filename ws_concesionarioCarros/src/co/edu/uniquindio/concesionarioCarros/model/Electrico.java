package co.edu.uniquindio.concesionarioCarros.model;

public class Electrico extends Combustible {
    private Double autonomiaCargaCompleta;
    private Double tiempoDemoraCarga;

    public Electrico(Double autonomiaCargaCompleta, Double tiempoDemoraCarga) {
        this.autonomiaCargaCompleta = autonomiaCargaCompleta;
        this.tiempoDemoraCarga = tiempoDemoraCarga;
    }

    public void setAutonomiaCargaCompleta(Double autonomiaCargaCompleta) {
        this.autonomiaCargaCompleta = autonomiaCargaCompleta;
    }

    public Double getAutonomiaCargaCompleta() {
        return autonomiaCargaCompleta;
    }
    
    public void setTiempoDemoraCarga(Double tiempoDemoraCarga){
        this.tiempoDemoraCarga = tiempoDemoraCarga;
    }
    public Double getTiempoDemoraCarga(){
        return tiempoDemoraCarga;
    }

}