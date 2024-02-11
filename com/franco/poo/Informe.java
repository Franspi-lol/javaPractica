package com.franco.poo;

public class Informe extends Hoja {
    private String titulo;
    private String autor;

    public Informe(String contenido, String titulo, String autor) {
        super(contenido);
        this.titulo = titulo;
        this.autor = autor;
    }

    public String imprimir() {
        return "Titulo: " + titulo + "\nAutor: " + autor + "\nContenido: " + soyHoja();
    }

}
