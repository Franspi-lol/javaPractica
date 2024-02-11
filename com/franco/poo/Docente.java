package com.franco.poo;

public class Docente extends Persona{
    private int legajo;
    private String[] materias;

    public Docente(String nombre, int edad, char sexo, String dni, int legajo, String[] materias){
        super(nombre, edad, sexo, dni);
        this.legajo = legajo;
        this.materias = materias;
    }

    public String toString(){
        return super.toString() + ", Legajo: " + legajo + ", Materias: " + materiasToString();
    }

    public String materiasToString()
    {
        String materiasString = "";
        for (int i = 0; i < materias.length; i++)
        {
            materiasString += materias[i] + ", ";
        }
        return materiasString;
    }

    public String darClase(){
        return "Dando clase";
    }

}
