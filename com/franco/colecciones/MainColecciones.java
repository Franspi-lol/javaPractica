package com.franco.colecciones;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class MainColecciones {
    public static void main(String[] args) {
         LinkedList<String> lista = new LinkedList<>();
        lista.add("Franco");
        lista.add("Juan");
        lista.add("Pedro");
        lista.add("Maria");
        System.out.println(lista);
        lista.remove("Franco");
        System.out.println(lista);

        

        ListIterator<String> it = lista.listIterator();//Iterador de lista

        while (it.hasNext()) {//Mientras tenga un siguiente
            System.out.println(it.next());//Imprime el siguiente
        }
         

        //List/*Definir por el tipo de interfaz*/<String> lista = new ArrayList<>();//podes cambiar ArrayListy por LinkedList y igual funcionaria 
        /* lista.add("Franco");
        lista.add("Juan");
        lista.add("Pedro");
        lista.add("Maria");
        System.out.println(lista);
        lista.remove(1);//Recibe o un entero o un objeto
        lista.set(0, "nulo");
        for (String string : lista) {
            System.out.println(string);
        }
        Boolean existe = lista.contains("Maria");
        System.out.println(existe);
        Collections.sort(lista);//llamar a la interfaz Collections
        System.out.println(lista);
        ((ArrayList<String>) lista).trimToSize();//Casteo de lista a ArrayList
        //Si definis la lista como ArrayList, podes usar los metodos de ArrayList, si la definis como List, solo podes usar los metodos de List, deberia castear.
         */
        
        
    }

}
//List almacena objetos en secuencia determinada
//Set almacena objetos sin repetir, no mantiene orden
//Map almacena objetos en pares clave-valor

//interface Collection, tiene la jerarquia de List, Set, Queue
//interface List, tiene la jerarquia de ArrayList, LinkedList, Vector
//interface Set, tiene la jerarquia de HashSet, LinkedHashSet, TreeSet

//ArrayList es un arreglo de 10 posiciones por defecto, si se llena se duplica su tamaño. Es dinamico. Permite acceder a los datos por posiciones. El costo de la eliminacion es caro.
//LinkedList es una lista doblemente enlazada. Permite acceder a los datos por posiciones. El costo de la eliminacion es barato. Como lo realizado en C. Lista.add y lista.remove
//Vector es un arreglo de 10 posiciones por defecto, si se llena se duplica su tamaño. Es dinamico. Permite acceder a los datos por posiciones. El costo de la eliminacion es caro. |Es sincronizado.|

