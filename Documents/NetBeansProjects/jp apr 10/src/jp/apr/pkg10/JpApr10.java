package jp.apr.pkg10;

import java.util.Arrays;

/**
 *
 * @author Camila Astrada 
 */
public class JpApr10 {

    /**Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
20.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      double a[] = new double[50];
       double ao[] = new double[50];
      double b[]= new double[20];
              
       //llenar a
      
        for (int i = 0; i < 50; i++) {
            a[i]=Math.round(10*Math.random());
            
        }
        
        // mostrar a
        System.out.println("Vector a: ");
        for (int i = 0; i < 50; i++) {
            System.out.print(" ["+ a[i]+ "] ");
            
        }
        System.out.println(" ");
        
        
        // ordenar A
        
       Arrays.sort(a);
       
        // mostrar a
        System.out.println("Vector a ordenado: ");
        for (int i = 0; i < 50; i++) {
            System.out.print(" ["+ a[i]+ "] ");
            
        }
        System.out.println(" ");
        
       // llenar  mostrar b
           
        for (int i = 0; i < 20; i++) {
           if(i<10){
               b[i]= a[i];
           } else { 
               b[i] = 0.5;
           }
        }
        
        // mostrar b
        System.out.println("Vector b: ");
        for (int i = 0; i < 20; i++) {
            System.out.print(" ["+ b[i]+ "] ");
            
        }
        System.out.println(" ");
    }

}
