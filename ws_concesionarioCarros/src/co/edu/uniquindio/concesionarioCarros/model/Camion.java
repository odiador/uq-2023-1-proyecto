package co.edu.uniquindio.concesionarioCarros.model;

public class Camion extends Vehiculo {

    //ATRIBUTOS

    private Double capacidadCarga;
    private Boolean tieneAireAcondicionado;
    private Boolean tieneFrenosAire;
    private Boolean tieneABS;
    private Integer numeroEjes;
    private String tipoCamion; // El tipo de tipoCamion es provicional. Deberia ser un Enum

    /**
     * Constructor de la clase
     */
    public Camion() {
    }

    /**
     * Obtiene la capacidad de carga
     * 
     * @return capacidadCarga
     */
    public Double getCapacidadCarga() {
        return capacidadCarga;
    }

    /**
     * Cambia la capacidad de carga
     * 
     * @param capacidadCarga
     */
    public void setCapacidadCarga(Double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    /**
     * Obtiene la opcion que si el camion tiene aire acondicionado o no
     * 
     * @return tieneAireAcondicionado
     */
    public Boolean getTieneAireAcondicionado() {
        return tieneAireAcondicionado;
    }

    /**
     * Cambia la opcion que si el camion tiene aire acondicionado o no
     * 
     * @param tieneAireAcondicionado
     */
    public void setTieneAireAcondicionado(Boolean tieneAireAcondicionado) {
        this.tieneAireAcondicionado = tieneAireAcondicionado;
    }

    /**
     * Obtiene la opcion que si el camion tiene frenos o no
     * 
     * @return tieneFrenosAire
     */
    public Boolean getTieneFrenosAire() {
        return tieneFrenosAire;
    }

    /**
     * Cambia la opcion que si el camion tiene frenos o no
     * 
     * @param tieneFrenosAire
     */
    public void setTieneFrenosAire(Boolean tieneFrenosAire) {
        this.tieneFrenosAire = tieneFrenosAire;
    }

    /**
     * Obtiene la opcion que si el camion tiene ABS o no
     * 
     * @return tieneABS
     */
    public Boolean getTieneABS() {
        return tieneABS;
    }

    /**
     * Cambia la opcion que si el camion tiene ABS o no
     * 
     * @param tieneABS
     */
    public void setTieneABS(Boolean tieneABS) {
        this.tieneABS = tieneABS;
    }

    /**
     * Obtiene el numero de ejes
     * 
     * @return numeroEjes
     */
    public Integer getNumeroEjes() {
        return numeroEjes;
    }

    /**
     * Cambia el numero de ejes
     * 
     * @param numeroEjes
     */
    public void setNumeroEjes(Integer numeroEjes) {
        this.numeroEjes = numeroEjes;
    }

    /**
     * Obtiene el tipo de camion
     * 
     * @return tipoCamion
     */
    public String getTipoCamion() {
        return tipoCamion;
    }

    /**
     * Cambia el tipo de camion
     * 
     * @param tipoCamion
     */
    public void setTipoCamion(String tipoCamion) {
        this.tipoCamion = tipoCamion;
    }

}
