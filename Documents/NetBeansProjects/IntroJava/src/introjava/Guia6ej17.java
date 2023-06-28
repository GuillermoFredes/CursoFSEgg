/*
 Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Guia6ej17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
     Scanner leer = new Scanner(System.in);
        int n;
        double j;
        System.out.println("ingrese el tamaño del vector");
        n = leer.nextInt();
        int[] vector = new int[n];
        int i;
        for (i=0 ; i<n ; i++) {
            j= Math.round(Math.random()*10);
            int k = (int) j;
            switch (k) {
                case 0:
                    vector[i]= (int) (Math.round(Math.random()*10));
                    break;
                case 1:
                    vector[i]= (int) (Math.round(Math.random()*10));
                    break;
                case 2:
                    vector[i]= (int) (Math.round(Math.random()*100));
                    break;
                case 3:
                    vector[i]= (int) (Math.round(Math.random()*100));
                    break;
                case 4:
                    vector[i]= (int) (Math.round(Math.random()*1000));
                    break;
                case 5:
                    vector[i]= (int) (Math.round(Math.random()*1000));
                    break;
                case 6:
                    vector[i]= (int) (Math.round(Math.random()*10000));
                    break;
                case 7:
                    vector[i]= (int) (Math.round(Math.random()*10000));
                    break;
                case 8:
                    vector[i]= (int) (Math.round(Math.random()*100000));
                    break;
                case 9:
                    vector[i]= (int) (Math.round(Math.random()*100000));
                    break;
                case 10:
                    vector[i]= (int) (Math.round(Math.random()*100000));
                    break;
            }
            String l = Integer.toString(vector[i]);
            System.out.println("la posicion " + i + " del vector tiene el numero " + vector[i] + " y tienene " + l.length() + " digitos");
        }    
    
    }
    
    
    



    }
    





