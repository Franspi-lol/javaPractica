package com.franco.arrays;

import java.util.Arrays;

public class MainArrays {
    public static void main(String[] args) {
        int[] arreglo = new int[10];
        //System.out.println(arreglo.length);//length devulve la dimension del arreglo
        /*cargarArreglo(arreglo);
        mostrarArregloForEach(arreglo);
        mostrarArregloValidos(arreglo);

        String[] nombres = {"Franco", "Juan", "Pedro"};
        for (String nombre : nombres) {
            System.out.println("nombre="+ nombre);
        }

        var nombre = "Franco";//var es una variable que se le asigna el tipo de dato automaticamente
        if (nombre instanceof String) {//instanceof devuelve true si el objeto es de la clase que se compara
            System.out.println("Es un string");
            
        }

        String mensaje = nombre instanceof String ? "Es un string" : "No es un string";//operador ternario
        System.out.println(mensaje);
        //operador ternario funciona como un if else, mensaje = condicion ? valor si es verdadero : valor si es falso


        //System.out.println(nombres[0]);*/

        String[] juegos = {"Fornite", "PUBG", "FreeFire", "Call of Duty", "GTA V", "Minecraft", "Among Us", "FIFA 21", "PES 21", "NBA 2K21"};
        mostrarArreglo(juegos);
        
        

        //ordenar arreglo
        Arrays.sort(juegos);//Arrays.sort(arreglo) para ordenar el arreglo, God bless java
        
        
        //iterar el arreglo
        mostrarArreglo(juegos);

        /*for (String string : juegos) {
            
            System.out.println(string);
            
        }*/
        //buscar en el arreglo
        for (int i = 0; i < juegos.length; i++) {
            
        }



    }

    public static void cargarArreglo(int[] arreglo) {
        for (int i = 0; i < arreglo.length-1; i++) {
            arreglo[i] = i;
        }
    }

    public static void mostrarArreglo(String[] arreglo) {//metodo sobrecargado
        for (int i = 0; i < arreglo.length; i++) {//for normal fori
            System.out.println("arreglo="+ arreglo[i]);
        }
        System.out.println("------");
    }

    public static void mostrarArreglo(int[] arreglo) {//metodo sobrecargado
        for (int numero : arreglo) {//for each
            System.out.println("arreglo="+ numero);
        }
    }

    public static void mostrarArregloValidos(int[] arreglo){
        for (int numero : arreglo) {
            if (numero != 0) {
                System.out.println("arregloValid="+ numero);
                
            }
        }
    }



}
