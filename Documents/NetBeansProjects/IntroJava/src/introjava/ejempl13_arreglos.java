/*
 EJERCICIO 13
Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros de equipo y
define su tipo de dato de tal manera que te permita alojar sus nombres más adelante.
 */
package introjava;

import com.sun.corba.se.impl.orbutil.ORBUtility;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class ejempl13_arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String name;
        Scanner leer = new Scanner(System.in);
        int n ;
        
        
        System.out.println("Ingrese tamaño del equipo" );
        n=leer.nextInt();
        String[] equipo = new String[n];
        
        
        for (int i = 0 ; i<n ; i++) {

            System.out.println("Ingrese nombre del integrante: " + (i + 1));
            name = leer.next();

            equipo[i] = name;

        }
         System.out.println("los integrantes del equipo son: " );
            
        for (int i = 0; i < n ; i++) {
            System.out.print("[" + equipo[i] + "]");
           
        }
         System.out.println(" ");
    }
         
}
