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

        Hoja hoja2 = new Informe("Contenido del informe", "Título del informe", "Franco");
        Hoja hoja = new Curriculum("Contenido del curriculum", "Franco", "Ingeniería en Sistemas");
        ((Curriculum)hoja).agregarExperiencia("Desarrollador Java");
        ((Curriculum)hoja).agregarExperiencia("Desarrollador Python");
        imprimirAbs(hoja);
        SaltoLinea();
        imprimirAbs(hoja2);
        SaltoLinea();
        Libro libro = new Libro("El principito", "Antoine de Saint-Exupéry", Genero.NARRATIVA);
        Hoja pagina = new Pagina("Contenido de la página 1");
        Hoja pagina2 = new Pagina("Contenido de la página 2");
        libro.agregarPagina((Pagina) pagina);
        libro.agregarPagina((Pagina) pagina2);//castear para usar las funciones de clase hija
        imprimirAbs(libro);
        SaltoLinea();

    }

    public static void imprimirAbs(Imprimible hoja) {//polimorfismo con interfaz Imprimible 
        System.out.println(hoja.imprimir());
    }
    public static void SaltoLinea() {
        System.out.println("-------------------------------------------------");
        
    }
}
