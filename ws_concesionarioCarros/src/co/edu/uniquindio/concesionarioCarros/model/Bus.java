package co.edu.uniquindio.concesionarioCarros.model;

public class Bus extends Van {
    // ATRIBUTOS
    private Integer numeroEjes;
    private Integer numeroSalidasEmergencia;

    /**
     * Es el constructor del Bus
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
     * @param capacidadMaletero
     * @param numeroEjes
     * @param numeroSalidasEmergencia
     */
    public Bus(String placa, String marca, String modelo, Double cilindraje, Double velocidadMaxima,
            EstadoVehiculo estado, TipoCambio tipo, Boolean tieneAireAcondicionado, Boolean tieneCamaraReversa,
            Boolean tieneABS, Double capacidadMaletero, Integer numeroEjes, Integer numeroSalidasEmergencia) {
        super(placa, marca, modelo, cilindraje, velocidadMaxima, estado, tipo, tieneAireAcondicionado,
                tieneCamaraReversa,
                tieneABS, capacidadMaletero);
        this.numeroEjes = numeroEjes;
        this.numeroSalidasEmergencia = numeroSalidasEmergencia;
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
