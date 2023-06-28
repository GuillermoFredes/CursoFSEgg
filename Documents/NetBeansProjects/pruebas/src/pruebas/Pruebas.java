/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

/**
 *
 * @author Admin
 */
public class Pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
     Persona p1 = new Persona();
     Persona p2 = new Persona();           
        
    p1.setNombre("Albus Dumbledore");
    p2.setNombre(p1.getNombre());
    
        System.out.println(p1.equals(p2));
        System.out.println(p1.getNombre().equals(p2.getNombre()));
     
    }
    
}
