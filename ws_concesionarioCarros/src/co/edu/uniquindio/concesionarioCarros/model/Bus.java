package co.edu.uniquindio.concesionarioCarros.model;

public class Bus extends Van {
    // ATRIBUTOS
    private Integer numeroEjes;
    private Integer numeroSalidasEmergencia;

    /**
     * Este es el constructor de la clase
     * 
     */
    public Bus() {
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
    public void setNumeroEjes(final Integer numeroEjes) {
        this.numeroEjes = numeroEjes;
    }

    /**
     * Obtiene el numero de salidas de emergencia
     * 
     * @return numeroSalidasEmergencia
     */
    public Integer getNumeroSalidasEmergencia() {
        return numeroSalidasEmergencia;
    }

    /**
     * Cambia el numero de salidas de emergencia
     * 
     * @param numeroSalidasEmergencia
     */
    public void setNumeroSalidasEmergencia(final Integer numeroSalidasEmergencia) {
        this.numeroSalidasEmergencia = numeroSalidasEmergencia;
    }

}
