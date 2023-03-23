package co.edu.uniquindio.concesionarioCarros.model;

public abstract class Vehiculo {
    private String marca;
    private String modelo;
    private Double cilindraje;
    private Double velocidadMaxima;
    private Combustible combustible;
    private EstadoVehiculo estado;
    private TipoCambio tipo;

    public Vehiculo() {

    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Double getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(Double cilindraje) {
        this.cilindraje = cilindraje;
    }

    public Double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(Double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public Combustible getCombustible() {
        return combustible;
    }

    public void setCombustible(Combustible combustible) {
        this.combustible = combustible;
    }

    public EstadoVehiculo getEstado() {
        return estado;
    }

    public void setEstado(EstadoVehiculo estado) {
        this.estado = estado;
    }

    public TipoCambio getTipo() {
        return tipo;
    }

    public void setTipo(TipoCambio tipo) {
        this.tipo = tipo;
    }

}
