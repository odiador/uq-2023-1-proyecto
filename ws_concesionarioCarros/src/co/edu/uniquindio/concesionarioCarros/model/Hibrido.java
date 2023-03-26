package co.edu.uniquindio.concesionarioCarros.model;

public class Hibrido extends Combustible {

    private Boolean esEnchufable;
    private Boolean esHibridoLigero;

    public Hibrido(Boolean esEnchufable, Boolean esHibridoLigero){
        this.esHibridoLigero = esHibridoLigero;
        this.esEnchufable = esEnchufable;
    }

    public Boolean getEsHibridoLigero() {
        return esHibridoLigero;
    }
    public void setHibridoLigero(Boolean esHibridoLigero){
        this.esHibridoLigero = esHibridoLigero;
    }

    public Boolean getEsEnchufable(){
        return esEnchufable;
    }
    public void setEsEnchufable(Boolean esEnchufable){
        this.esEnchufable = esEnchufable;
    }
}