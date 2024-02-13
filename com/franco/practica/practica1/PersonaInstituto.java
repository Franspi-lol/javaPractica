package com.franco.practica.practica1;

public abstract class PersonaInstituto extends Persona{
    private int legajo;

    public PersonaInstituto(String nombre, String apellido, int edad, String dni, int legajo){
        super(nombre, apellido, edad, dni);
        this.legajo = legajo;
    }


    /**
     * @return int return the legajo
     */
    public int getLegajo() {
        return legajo;
    }

    /**
     * @param legajo the legajo to set
     */
    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

}
