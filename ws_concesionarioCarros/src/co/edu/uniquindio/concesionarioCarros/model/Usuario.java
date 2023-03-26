package co.edu.uniquindio.concesionarioCarros.model;

// ATRIBUTOS
public abstract class Usuario {
    private String nombre;
    private String id;

    /**
     * Este es el metodo constructor de la clase usuario
     */
    public Usuario() {
    }

    
    /**
     * Este metodo obtiene el nombre del usuario
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Este metodo cambia el nombre del usuario 
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Este metodo obtiene la identificacion del usuario
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * Este metodo cambia la identificacion del usuario 
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

}
