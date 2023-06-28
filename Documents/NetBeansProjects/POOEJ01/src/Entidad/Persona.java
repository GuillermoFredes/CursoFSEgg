/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Admin
 */
public class Persona {
  
    

    public String nombre;
    public int DNI;
    public int edad;
    public double estatura;
    public double peso;

     public Persona() {
    } 
    
 public Persona(String nombre, int DNI, int edad, double estatura, double peso) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.edad = edad;
        this.estatura = estatura;
        this.peso = peso;
    }
 
    

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", DNI=" + DNI + ", edad=" + edad + ", estatura=" + estatura + ", peso=" + peso + '}';
    }



}


