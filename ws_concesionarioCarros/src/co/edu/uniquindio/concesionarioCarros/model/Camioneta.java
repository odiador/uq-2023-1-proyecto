package co.edu.uniquindio.concesionarioCarros.model;

public class Camioneta extends Sedan {
    
    //ATRIBUTOS
    private Boolean es4x4;

    /** 
     * Cntr etodo constructor de la clase
     */
    public Camioneta() {
    }     
    
    /**
     * Obtiene si la camioneta es 4x4 o no
     * 
     * @return
     */
    public Boolean getEs4x4() {
        return es4x4;
    }

    /**
     * Obtiene si la camioneta es 4x4 o no
     * 
     * @param
     */
    public void setEs4x4(Boolean es4x4) {
        this.es4x4 = es4x4;
    }

}
