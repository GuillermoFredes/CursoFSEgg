/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class funciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        int num, cont=0 ;
        int[][] matriz = new int[3][3];

             
         System.out.println("Ingrese los valores para la matriz, solo pueden ser del 1 al 9");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
              
         num = leer.nextInt();
                
            

                    matriz[i][j] = num;
                    
                    cont++;
              
                
            }
        }
    }
    
}
