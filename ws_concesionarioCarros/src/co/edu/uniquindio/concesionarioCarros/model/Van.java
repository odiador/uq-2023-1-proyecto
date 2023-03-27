package co.edu.uniquindio.concesionarioCarros.model;

public class Van extends Familiar {

    private Double capacidadMaletero;

    /**
     * Es el constructor de la Van
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
     */
    public Van(String placa, String marca, String modelo, Double cilindraje, Double velocidadMaxima,
            EstadoVehiculo estado, TipoCambio tipo, Boolean tieneAireAcondicionado, Boolean tieneCamaraReversa,
            Boolean tieneABS, Double capacidadMaletero) {
        super(placa, marca, modelo, cilindraje, velocidadMaxima, estado, tipo, tieneAireAcondicionado,
                tieneCamaraReversa,
                tieneABS);
        this.capacidadMaletero = capacidadMaletero;
    }

    /**
     * 
     * @return
     */
    public Double getCapacidadMaletero() {
        return capacidadMaletero;
    }

    /**
     * 
     * @param capacidadMaletero
     */
    public void setCapacidadMaletero(final Double capacidadMaletero) {
        this.capacidadMaletero = capacidadMaletero;
    }

}
