package co.edu.uniquindio.concesionarioCarros.model;

public class Automovil extends Vehiculo {

    //ATRIBUTOS
    private Integer numeroPasajeros;
    private Integer numeroBolsasAire;
    private Integer numeroPuertas;

    /**
     * El constructor de la clase 
     */
    public Automovil() {
    }

    /**
     * Obtiene el numero de pasajeros
     * 
     * @return numeroPasajeros
     */
    public Integer getNumeroPasajeros() {
        return numeroPasajeros;
    }

    /**
     * Cambia el numero de pasajeros
     * 
     * @param numeroPasajeros
     */
    public void setNumeroPasajeros(Integer numeroPasajeros) {
        this.numeroPasajeros = numeroPasajeros;
    }

    /**
     * Obiene el numero de bolsas de aire
     * 
     * @return numeroBolsasAire
     */
    public Integer getNumeroBolsasAire() {
        return numeroBolsasAire;
    }

    /**
     * Cambia el numero de bolsas de aire
     * 
     * @param numeroBolsasAire
     */
    public void setNumeroBolsasAire(Integer numeroBolsasAire) {
        this.numeroBolsasAire = numeroBolsasAire;
    }

    /**
     * Obtiene el numero de puertas
     * 
     * @return numeroPuertas
     */
    public Integer getNumeroPuertas() {
        return numeroPuertas;
    }

    /**
     * Cambia el numero de puertas
     * 
     * @param numeroPuertas
     */
    public void setNumeroPuertas(Integer numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

}
