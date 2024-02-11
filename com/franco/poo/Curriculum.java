package com.franco.poo;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Curriculum extends Hoja {

    private String nombre;
    private String carrera;
    private ArrayList<String> experiencia;

    public Curriculum(String contenido, String nombre, String carrera) {
        super(contenido);
        this.nombre = nombre;
        this.carrera = carrera;
        this.experiencia = new ArrayList<>();//inicializar el arraylist
    }

    public void agregarExperiencia(String experiencia) {
        this.experiencia.add(experiencia);
    }
    
    public String imprimir() {
        return "Nombre: " + nombre + "\nCarrera: " + carrera + "\nContenido: " + soyHoja()+ "\nExperiencia: " + experiencia.toString();
    }

}
