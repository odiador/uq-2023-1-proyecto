package co.edu.uniquindio.concesionarioCarros.model;

public class Sedan extends Van {
    private Boolean tieneVelocidadCrucero;
    private Boolean tieneSensorColision;
    private Boolean tieneSensorTrafico;
    private Boolean tieneAsistentePermanencia;

    public Sedan() {
    }

    public Boolean getTieneVelocidadCrucero() {
        return tieneVelocidadCrucero;
    }

    public void setTieneVelocidadCrucero(Boolean tieneVelocidadCrucero) {
        this.tieneVelocidadCrucero = tieneVelocidadCrucero;
    }

    public Boolean getTieneSensorColision() {
        return tieneSensorColision;
    }

    public void setTieneSensorColision(Boolean tieneSensorColision) {
        this.tieneSensorColision = tieneSensorColision;
    }

    public Boolean getTieneSensorTrafico() {
        return tieneSensorTrafico;
    }

    public void setTieneSensorTrafico(Boolean tieneSensorTrafico) {
        this.tieneSensorTrafico = tieneSensorTrafico;
    }

    public Boolean getTieneAsistentePermanencia() {
        return tieneAsistentePermanencia;
    }

    public void setTieneAsistentePermanencia(Boolean tieneAsistentePermanencia) {
        this.tieneAsistentePermanencia = tieneAsistentePermanencia;
    }

}
