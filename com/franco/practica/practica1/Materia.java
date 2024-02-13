package com.franco.practica.practica1;

public class Materia {
    private String nombre;
    private int horasSemanales;
    private int horasTotales;
    private String[] temas;
    private Profesor profesor;

    public Materia(String nombre, int horasSemanales, int horasTotales, String[] temas){
        this.nombre = nombre;
        this.horasSemanales = horasSemanales;
        this.horasTotales = horasTotales;
        this.temas = temas;
    }
    
    


    /**
     * @return String return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return int return the horasSemanales
     */
    public int getHorasSemanales() {
        return horasSemanales;
    }

    /**
     * @param horasSemanales the horasSemanales to set
     */
    public void setHorasSemanales(int horasSemanales) {
        this.horasSemanales = horasSemanales;
    }

    /**
     * @return int return the horasTotales
     */
    public int getHorasTotales() {
        return horasTotales;
    }

    /**
     * @param horasTotales the horasTotales to set
     */
    public void setHorasTotales(int horasTotales) {
        this.horasTotales = horasTotales;
    }

    /**
     * @return String[] return the temas
     */
    public String[] getTemas() {
        return temas;
    }

    /**
     * @param temas the temas to set
     */
    public void setTemas(String[] temas) {
        this.temas = temas;
    }


    /**
     * @return Profesor return the profesor
     */
    public Profesor getProfesor() {
        return profesor;
    }

    /**
     * @param profesor the profesor to set
     */
    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

}
