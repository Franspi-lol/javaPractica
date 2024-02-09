package com.franco.arrays.arraysOrden;

import java.util.Arrays;
import java.util.Scanner;

public class MainArraysOrden {
    public static void main(String[] args) {
        String[] palabras = { "Franco", "Juan", "Pedro", "Maria", "Ana", "Lucia", "Carlos", "Fernando", "Miguel",
                "Jose" };
        mostrarArreglo(palabras);
        // ordenar arreglo
        /* Arrays.sort(palabras);// Arrays.sort(arreglo) para ordenar el arreglo, God bless java
        mostrarArreglo(palabras); */

        // buscar en el arreglo
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la palabra a buscar");
        String palabra = scanner.nextLine();

        int posicion = 0;
        for (posicion = 0; posicion < palabras.length && !palabras[posicion].equalsIgnoreCase(palabra); posicion++) {} // el for se encarga de todo
        if (posicion == palabras.length) {
            System.out.println("La palabra no se encuentra en el arreglo");
        } else {
            System.out.println("La palabra " + palabras[posicion] + " se encuentra en la posicion: " + posicion);
        }

        // Modificar el arreglo-borrar
        for (int i = posicion; i < palabras.length-1; i++) {
            palabras[i]=palabras[i+1];
        }
        String [] aux = new String[palabras.length-1];
        System.arraycopy(palabras, 0, aux, 0, aux.length);
        mostrarArreglo(aux);

    }

    public static void mostrarArreglo(String[] arreglo) {// metodo sobrecargado
        for (int i = 0; i < arreglo.length; i++) {// for normal fori
            System.out.println("arreglo=" + arreglo[i]);
        }
        System.out.println("------");
    }

}
