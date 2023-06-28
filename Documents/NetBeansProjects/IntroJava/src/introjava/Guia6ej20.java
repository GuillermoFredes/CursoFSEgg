/*
 Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
El programa deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Guia6ej20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int num;
        int[][] matriz = new int[3][3];

        //################################################# llenado de matriz y comprobacion de numeros 
        System.out.println("Ingrese los 9 valores para la matriz, solo pueden ser del 1 al 9");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                do {

                    num = leer.nextInt();
                    matriz[i][j] = num;

                    if (num > 9 || num < 1) {

                        System.out.println("Solo puede ingresar numero del 1 al 9");

                    }

                } while (num > 9 || num < 1);

            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matriz[i][j] + "]" + "\t");
            }
            System.out.println(" ");
        }
        //#######################################################################################################   
        int sumafil = 0, sumacol = 0, resultado, aux;
        boolean magica = true;

        for (int j = 0; j < 3; j++) {

            sumafil = sumafil + matriz[0][j];

        }

        for (int i = 1; i < 3; i++) {
            int aux1 = 0;
            for (int j = 0; j < 3; j++) {

                aux1 = aux1 + matriz[i][j];
                

            }
            if (aux1 != sumafil) {
                magica = false;

            }
        }
        if (magica==true) {
            
        
//        for (int i = 0; i < 3; i++) {
//
//            sumacol = sumacol + matriz[i][0];

        

        for (int i = 0; i < 3; i++) {
            int aux2 = 0;
            for (int j = 0; j < 3; j++) {

                aux2 = aux2 + matriz[j][i];
              

            }
            if (aux2 != sumafil) {
                magica = false;
            }
        }
        }
    
        int sumadiag1 = 0, sumadiag2 = 0;

        if (magica == true) {

            sumadiag1 = (matriz[0][0] + matriz[1][1]) + matriz[2][2];
            sumadiag2 = (matriz[0][2] + matriz[1][1]) + matriz[2][0];
            if (sumadiag1 != sumadiag2 ) {
                magica = false;
            }
        }

        if (magica == true) {

            System.out.println("La matriz es MAGICA");

        } else {
            System.out.println("La matriz NO es MAGICA");
        }
        
           
           
  System.out.println("Fila " + sumafil + " Columna " + sumacol + " diagonal principal "+ sumadiag1 + " diagonal secundaria " + sumadiag2 + " " + magica); 
    
    }
    
}
