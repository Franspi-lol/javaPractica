package com.franco.poo;

public class Pagina extends Hoja{
    public Pagina(String contenido) {
        super(contenido);
    }

    @Override
    public String imprimir() {
        return "Contenido: " + getContenido();
    }

}
