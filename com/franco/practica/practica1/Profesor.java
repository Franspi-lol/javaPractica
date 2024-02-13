package com.franco.practica.practica1;

import java.util.ArrayList;


public class Profesor extends PersonaInstituto{
    private ArrayList<Materia> materias;

    public Profesor(String nombre, String apellido, int edad, String dni, int legajo){
        super(nombre, apellido, edad, dni, legajo);
       materias = new ArrayList<Materia>();
    }


    public String mensaje(){
        return "Hola, soy el profesor: "+getNombre()+" "+getApellido()+" y doy la materia: "+getMaterias();
    }

    public void agregarMateria(Materia materia){
        materias.add(materia);
    }

    public  ArrayList<Materia> getMaterias() {
        return materias;
    }

}
