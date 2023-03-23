package co.edu.uniquindio.concesionarioCarros.model;

public class Deportivo {
    private Integer numeroCaballosFuerza;
    private Integer tiempoAlcanza100Kmh; // podria ser Double por los segundos

    public Deportivo() {
    }

    public Integer getNumeroCaballosFuerza() {
        return numeroCaballosFuerza;
    }

    public void setNumeroCaballosFuerza(Integer numeroCaballosFuerza) {
        this.numeroCaballosFuerza = numeroCaballosFuerza;
    }

    public Integer getTiempoAlcanza100Kmh() {
        return tiempoAlcanza100Kmh;
    }

    public void setTiempoAlcanza100Kmh(Integer tiempoAlcanza100Kmh) {
        this.tiempoAlcanza100Kmh = tiempoAlcanza100Kmh;
    }

}
