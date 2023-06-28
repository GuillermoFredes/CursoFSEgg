package jp.apr.pkg11;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Camila Astrada 
 */
public class JpApr11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
      
        System.out.println("ingrese el día");
       int dia= leer.nextInt();
        System.out.println("ingrese el mes");
        int mes= leer.nextInt();
        System.out.println("¿De Qué Año?");
        int anio = leer.nextInt(); 
        
        
        Date fecha = new Date(anio-1900,mes-1,dia);
        
        Date fa= new Date();
        
        
     long diferencia = fa.getTime() - fecha.getTime();
     
     
        System.out.println(fecha);
       System.out.println(fa);
        System.out.println("pasaron "+diferencia/1000/60/60/24+ " día/s.");
        
       
     
       
       }

}
