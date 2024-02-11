package com.franco.poo;
public abstract class Hoja implements Imprimible{//clase abstracta, no se puede instanciar
    private String contenido;

    public Hoja(String contenido) {
        this.contenido = contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getContenido(){
        return contenido;
    
    }

    public String soyHoja() {//metodo con cuerpo
        return "Soy una hoja";
    }

    abstract public String imprimir();//no tiene cuerpo

    

}
