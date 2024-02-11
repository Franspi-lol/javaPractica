package com.franco.poo;

import java.util.ArrayList;
import java.util.List;

public class MainPoo {

    public static void main(String[] args) {
        String[] materias = {"Matemáticas", "Física", "Química", "Biología"};
        /*Alumno alumno = new Alumno("Franco", 23, 'M', "12345678", 9.5, materias);
        System.out.println(alumno.toString());
        System.out.println(alumno.hablar());
        System.out.println(alumno.estudiar());
        Docente docente = new Docente("Juan", 45, 'M', "87654321", 1234, materias);
        System.out.println(docente.toString());
        System.out.println(docente.hablar());
        System.out.println(docente.darClase());*/

        Persona persona1 = new Alumno("Franco", 23, 'M', "12345678", 9.5, materias);
        Persona persona2 = new Docente("Juan", 45, 'M', "87654321", 1234, materias);
        System.out.println(persona1.toString());
        ((Alumno)persona1).setPromedio(5);//castear para usar las funciones de clase hija
        
        List<Persona> personas = new ArrayList<>();
        personas.add(persona1);
        personas.add(persona2);
        for (Persona persona : personas) {
            System.out.println(persona.toString());
            if (persona instanceof Alumno) {
                System.out.println(((Alumno) persona).estudiar());
            } else if (persona instanceof Docente) {
                System.out.println(((Docente) persona).darClase());
            }
        }

        
    }
}
