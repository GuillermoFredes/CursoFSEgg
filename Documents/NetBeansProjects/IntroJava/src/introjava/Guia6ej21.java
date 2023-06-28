/*
 Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de
3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida
dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3 que
se pueden formar en la matriz M, desplazándose por filas o columnas, existe al menos una
que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la columna de
la matriz M en la cual empieza el primer elemento de la submatriz P.
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Guia6ej21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        
        Scanner leer = new Scanner(System.in);
        
        
        int[][] matrizM = new int[10][10];
        int[][] matrizP = new int[3][3];
    
        
//############################################# llenado de matriz 10 x 10    
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                
                matrizM[i][j] = (int) (Math.random() * 89) + 10;

     
                
            }
            
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print( " " + matrizM [i][j] + " "  );
            }
            System.out.println(" ");
        }
        
//########################################## llenado matriz 3x3
        int  num, cont=0 ;
        
        System.out.println("Ingrese los valores para la matriz M 3x3");
              

                
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                matrizP[i][j] = leer.nextInt();

            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                //System.out.print(matriz[i][j]+ " \t ");

                System.out.print(matrizP[i][j]+  " \t ");
            }
            System.out.println(" ");
        } 
      //####################################### Recorriendo matrizM para coincidencia de 0:0 de matrizP
        boolean compara = false ;
        int a, b, c, d ;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (matrizM[i][j] == matrizP[0][0]) {
                    compara=true;
                    a=i ; b=j ; 
                    c=i ; d=j ;
                   
                  
                    for (int k = 0; k < 3; k++) {
                     
                        for (int l = 0; l < 3; l++) {
                           
                            if (matrizM[a][b] != matrizP[k][l]) {
                               compara=false;
                                                           
                            }
                           b++;                     
                        } 
                      a++ ; b=j ;
                    }  
   
                }
            }
            
        }
      
        if (compara=true) {
            System.out.println("La matriz P se encuentra dentro de la matriz M en " );

        }
        
    }
    
}



        