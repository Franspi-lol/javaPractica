package com.franco.poo;

public abstract class Persona {
    private String nombre;
    private int edad;
    private char sexo;    
    private String dni;

    public Persona (String nombre, int edad, char sexo, String dni){
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.dni = dni;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getEdad(){
        return edad;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public char getSexo(){
        return sexo;
    }

    public void setSexo(char sexo){
        this.sexo = sexo;
    }

    public String getDni(){
        return dni;
    }

    public void setDni(String dni){
        this.dni = dni;
    }

    public String toString(){
        return "Nombre: " + nombre + ", Edad: " + edad + ", Sexo: " + sexo + ", DNI: " + dni;
    }

    public String hablar(){
        return "Hablando";
    }


}
