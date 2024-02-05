package com.franco.arrays;

public class MainArrays {
    public static void main(String[] args) {
        int[] arreglo = new int[10];
        //System.out.println(arreglo.length);//length devulve la dimension del arreglo
        cargarArreglo(arreglo);
        mostrarArregloForEach(arreglo);
        mostrarArregloValidos(arreglo);

        String[] nombres = {"Franco", "Juan", "Pedro"};
        for (String nombre : nombres) {
            System.out.println("nombre="+ nombre);
        }
        //System.out.println(nombres[0]);
    }

    public static void cargarArreglo(int[] arreglo) {
        for (int i = 0; i < arreglo.length-1; i++) {
            arreglo[i] = i;
        }
    }

    public static void mostrarArreglo(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {//for normal fori
            System.out.println("arreglo="+ arreglo[i]);
        }
    }

    public static void mostrarArregloForEach(int[] arreglo) {
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
