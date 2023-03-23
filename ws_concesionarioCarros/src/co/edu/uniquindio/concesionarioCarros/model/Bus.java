package co.edu.uniquindio.concesionarioCarros.model;

public class Bus extends Van {
    private Integer numeroEjes;
    private Integer numeroSalidasEmergencia;

    public Bus() {
    }

    public Integer getNumeroEjes() {
        return numeroEjes;
    }

    public void setNumeroEjes(Integer numeroEjes) {
        this.numeroEjes = numeroEjes;
    }

    public Integer getNumeroSalidasEmergencia() {
        return numeroSalidasEmergencia;
    }

    public void setNumeroSalidasEmergencia(Integer numeroSalidasEmergencia) {
        this.numeroSalidasEmergencia = numeroSalidasEmergencia;
    }

}
