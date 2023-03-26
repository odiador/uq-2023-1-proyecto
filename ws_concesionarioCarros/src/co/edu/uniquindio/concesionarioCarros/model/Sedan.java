package co.edu.uniquindio.concesionarioCarros.model;

public class Sedan extends Van {
    private Boolean tieneVelocidadCrucero;
    private Boolean tieneSensorColision;
    private Boolean tieneSensorTrafico;
    private Boolean tieneAsistentePermanencia;

    /**
     * 
     */
    public Sedan() {
    }

    /**
     * 
     * @return
     */
    public Boolean getTieneVelocidadCrucero() {
        return tieneVelocidadCrucero;
    }

    /**
     * 
     * @param tieneVelocidadCrucero
     */
    public void setTieneVelocidadCrucero(final Boolean tieneVelocidadCrucero) {
        this.tieneVelocidadCrucero = tieneVelocidadCrucero;
    }

    /**
     * 
     * @return
     */
    public Boolean getTieneSensorColision() {
        return tieneSensorColision;
    }

    /**
     * 
     * @param tieneSensorColision
     */
    public void setTieneSensorColision(final Boolean tieneSensorColision) {
        this.tieneSensorColision = tieneSensorColision;
    }

    /**
     * 
     * @return
     */
    public Boolean getTieneSensorTrafico() {
        return tieneSensorTrafico;
    }

    /**
     * 
     * @param tieneSensorTrafico
     */
    public void setTieneSensorTrafico(final Boolean tieneSensorTrafico) {
        this.tieneSensorTrafico = tieneSensorTrafico;
    }

    /**
     * 
     * @return
     */
    public Boolean getTieneAsistentePermanencia() {
        return tieneAsistentePermanencia;
    }

    /**
     * 
     * @param tieneAsistentePermanencia
     */
    public void setTieneAsistentePermanencia(final Boolean tieneAsistentePermanencia) {
        this.tieneAsistentePermanencia = tieneAsistentePermanencia;
    }

}
