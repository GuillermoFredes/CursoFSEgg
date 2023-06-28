/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej01;

import Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class POOEJ01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Scanner leer = new Scanner(System.in);
        //Constructor vacio
     
        
         
            
      
                
        Persona p1 =  new Persona( leer.nextLine(), leer.nextInt() , leer.nextInt(), leer.nextDouble(), leer.nextDouble());
        

//        System.out.println("Su nombre completo es: " + p1.nombre + " y el DNI ingresado es:  " + p1.DNI);
//        System.out.println("Su edad es : " + p1.edad + " Años");
//        System.out.println("Su peso y estatura son: "+p1.peso+ " Kilos y "  + p1.estatura + " metros"  );

        System.out.println(p1);
    
    }

}
