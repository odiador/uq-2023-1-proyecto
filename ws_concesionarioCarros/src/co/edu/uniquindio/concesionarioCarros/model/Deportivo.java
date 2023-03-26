package co.edu.uniquindio.concesionarioCarros.model;

public class Deportivo {
    private Integer numeroCaballosFuerza;
    private Integer tiempoAlcanza100Kmh; // podria ser Double por los segundos

    /**
     * 
     */
    public Deportivo() {
    }

    /**
     * 
     * @return
     */
    public Integer getNumeroCaballosFuerza() {
        return numeroCaballosFuerza;
    }

    /**
     * 
     * @param numeroCaballosFuerza
     */
    public void setNumeroCaballosFuerza(final Integer numeroCaballosFuerza) {
        this.numeroCaballosFuerza = numeroCaballosFuerza;
    }

    /**
     * 
     * @return
     */
    public Integer getTiempoAlcanza100Kmh() {
        return tiempoAlcanza100Kmh;
    }

    /**
     * 
     * @param tiempoAlcanza100Kmh
     */
    public void setTiempoAlcanza100Kmh(final Integer tiempoAlcanza100Kmh) {
        this.tiempoAlcanza100Kmh = tiempoAlcanza100Kmh;
    }

}
