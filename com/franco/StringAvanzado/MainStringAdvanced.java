package com.franco.StringAvanzado;

public class MainStringAdvanced {
    public static void main(String[] args) {
        /* String nombre = "Franco";
        String nombre2 = new String("Franco");
        String nombre3 = "Franco";

        boolean comparar = nombre==nombre2;//va  a ser falso, debido a que compara la referencia de memoria, uno creado como instancia de objeto y el otro como un objeto normal
        System.out.println(comparar);
        comparar = nombre.equals(nombre2);//va a ser verdadero, para comparar strings o arreglos usar equals. Con equals ve contenido
        System.out.println(comparar);
        comparar = nombre==nombre3;//va a ser verdadero, debido a que compara la referencia de memoria, ambos son creados como objetos normales
        System.out.println(comparar); */
        

        String curso = "Programacion Java";
        String docente = "Franco Bernardele";
        String mensaje = "Bienvenidos al curso de " + curso + " por " + docente;//concatenar
        System.out.println(mensaje);

        int numero = 10;
        int numero2 = 5;
        System.out.println("La suma de " + numero + " + " + numero2 + " es " + (numero+numero2));//concatenar con operaciones

        String mensaje2 = String.format("La suma de %d + %d es %d", numero, numero2, (numero+numero2));//concatenar con operaciones como c con printf
        System.out.println(mensaje2);

        String mensaje3 = curso.concat(" ").concat(docente);//concatenar con concat
        System.out.println(mensaje3);

        curso.concat(docente);//no se guarda en memoria, no se modifica el valor de curso
        System.out.println(curso);
        curso = curso.concat(docente);//se guarda en memoria, se modifica el valor de curso
        System.out.println(curso);


    }

}
