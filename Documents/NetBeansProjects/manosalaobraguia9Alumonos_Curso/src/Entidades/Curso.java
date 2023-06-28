/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.List;

/**
 *
 * @author Admin
 */
public class Curso {

    private int año;
    private String division;
   
    private List<Alumno> alumnos;

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

  

    public int getAño() {
        return año;
    }

    public String getDivision() {
        return division;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public void setDivision(String division) {
        this.division = division;
    }

        @Override
    public String toString() {
        return "Curso{" + "a\u00f1o=" + año + ", division=" + division + ", alumnos=" + alumnos + '}';
        
        
    }  
    
}
