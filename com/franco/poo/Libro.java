package com.franco.poo;

import java.util.ArrayList;

public class Libro  implements Imprimible{//libro clase envoltorio

    private String titulo;
    private String autor;
    private Genero genero;
    private ArrayList<Pagina> paginas;

    public Libro (String titutlo, String autor, Genero genero)
    {
        this.titulo=titutlo;
        this.autor=autor;
        this.genero=genero;
        this.paginas=new ArrayList<>();
    }

    public void agregarPagina(Pagina pagina)
    {
        this.paginas.add(pagina);
    }

    public String imprimir()
    {
        String resultado="Titulo: "+titulo+"\nAutor: "+autor+"\nGenero: "+genero+"\n";
        for (Pagina pagina:paginas)
        {
            resultado+=pagina.imprimir()+"\n";
        }
        return resultado;
    }


}
