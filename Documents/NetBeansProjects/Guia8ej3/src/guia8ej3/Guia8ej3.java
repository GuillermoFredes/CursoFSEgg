/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8ej3;

import Entidades.alumnoClass;
import Servicios.alumnoServicio;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Guia8ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     
     Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
     
        alumnoServicio al1 = new alumnoServicio();
        alumnoClass A1 = new alumnoClass();
                
       //al1.crearAlumno();
       al1.cantidadAlumnos();
       
      al1.notaFinal();
    }
    
}
