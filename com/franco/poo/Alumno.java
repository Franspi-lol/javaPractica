package com.franco.poo;

public class Alumno extends Persona{
    private double promedio;
    private String[] materias;

    public Alumno(String nombre, int edad, char sexo, String dni, double promedio, String[] materias){
        super(nombre, edad, sexo, dni);
        this.promedio = promedio;
        this.materias = materias;
    }

    public double getPromedio(){
        return promedio;
    }

    public void setPromedio(double promedio){
        this.promedio = promedio;
    }

    public String[] getMaterias(){
        return materias;
    }

    public void setMaterias(String[] materias){
        this.materias = materias;
    }

    @Override
    public String toString(){
        return super.toString() + ", Promedio: " + promedio + ", Materias: " + materiasToString();
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

    public String estudiar(){
        return "Estudiando";
    }


}
