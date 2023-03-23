package co.edu.uniquindio.concesionarioCarros.model;

import java.util.ArrayList;
import java.util.List;

public class Transaccion {
    private String codigo;
    private List<DetalleTransaccion> listaDetalleTransacciones;

    public Transaccion() {
    }

    public Transaccion(String codigo) {
        this.codigo = codigo;
        this.listaDetalleTransacciones = new ArrayList<DetalleTransaccion>();
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public List<DetalleTransaccion> getListaDetalleTransacciones() {
        return listaDetalleTransacciones;
    }

    public void setListaDetalleTransacciones(List<DetalleTransaccion> listaDetalleTransacciones) {
        this.listaDetalleTransacciones = listaDetalleTransacciones;
    }

    public void agregarDetalleTransaccion(TipoTransaccion tipo) {

    }
}
