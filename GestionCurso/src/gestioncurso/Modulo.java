/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestioncurso;

import gestionMenus.Menu;

/**
 *
 * @author Profesor
 */
public class Modulo {
    private String nombre;
    private int horas;
    private String profesor;

    public Modulo() {
    }

    public Modulo(String nombre, int horas, String profesor) {
        this.nombre = nombre;
        this.horas = horas;
        this.profesor = profesor;
    }

    public int getHoras() {
        return horas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    @Override
    public String toString() {
        return "Nombre: " + this.getNombre() + 
                "\nHoras: " + this.getHoras() +
                "\nProfesor: "+ this.getProfesor(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
}
