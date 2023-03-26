package co.edu.uniquindio.concesionarioCarros.model;

import java.util.ArrayList;
import java.util.List;

public class Concesionario {

    //ATRIBUTOS
    private String nombre;
    private String direccion;
    private List<Vehiculo> listaVehiculos;
    private List<Usuario> listaUsuarios;
    private List<Cliente> listaClientes;
    private List<Transaccion> listaTransacciones;

    /**
     * Es el metodo constructor vacio de la clase
     */
    public Concesionario() {
    }

    /**
     * Es el metodo constructor de la clase
     */
    public Concesionario(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.listaVehiculos = new ArrayList<Vehiculo>();
        this.listaUsuarios = new ArrayList<Usuario>();
        this.listaClientes = new ArrayList<Cliente>();
        this.listaTransacciones = new ArrayList<Transaccion>();
    }

    /**
     * 
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * 
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * 
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * 
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * 
     */
    public List<Vehiculo> getListaVehiculos() {
        return listaVehiculos;
    }

    
    public void setListaVehiculos(List<Vehiculo> listaVehiculos) {
        this.listaVehiculos = listaVehiculos;
    }

    public List<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(List<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    public List<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(List<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public List<Transaccion> getListaTransacciones() {
        return listaTransacciones;
    }

    public void setListaTransacciones(List<Transaccion> listaTransacciones) {
        this.listaTransacciones = listaTransacciones;
    }

    public void registrarVehiculo() {

    }

    public void venderVehiculo() {

    }

    public void agregarTransaccion() {

    }

    public void agregarDetalleTransaccion() {

    }

    public void generarReporte() {

    }

    public void agregarFoto() {

    }

    public void enviarEmailRecuperacion() {

    }

}
