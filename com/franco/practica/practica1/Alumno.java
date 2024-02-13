package com.franco.practica.practica1;

import java.util.ArrayList;

public class Alumno  extends PersonaInstituto{
    private String curso;
    private int[] notas;
    private ArrayList<Materia> materias;

    public Alumno(String nombre, String apellido, int edad, String dni, int legajo, String curso, int[] notas){
        super(nombre, apellido, edad, dni, legajo);
        this.curso = curso;
        this.notas = notas;
        materias = new ArrayList<Materia>();
    }

    public void agregarMateria(Materia materia){
        materias.add(materia);
    }

    public String mensaje(){
        return "Hola, soy el alumno: "+getNombre()+" "+getApellido()+" del curso "+curso;

    }

    


    /**
     * @return String return the curso
     */
    public String getCurso() {
        return curso;
    }

    /**
     * @param curso the curso to set
     */
    public void setCurso(String curso) {
        this.curso = curso;
    }

    /**
     * @return int[] return the notas
     */
    public int[] getNotas() {
        return notas;
    }

    /**
     * @param notas the notas to set
     */
    public void setNotas(int[] notas) {
        this.notas = notas;
    }

    /**
     * @return ArrayList<Materia> return the materias
     */
    public ArrayList<Materia> getMaterias() {
        return materias;
    }

    /**
     * @param materias the materias to set
     */
    public void setMaterias(ArrayList<Materia> materias) {
        this.materias = materias;
    }

}
