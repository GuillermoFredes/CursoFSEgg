/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

/**
 *
 * @author Admin
 */
public class Guia6ej19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matriz = new int[4][4];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                matriz[i][j] = (int) (Math.random() * 10);

                for (int k = 0; k < 3; k += 2) {
                    for (int l = 0; l < 3; l += 2) {

                        matriz[k][l] = (int) (Math.random() * -10);

                    }

                }
            }

        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("(" + matriz[i][j] + ")" + "\t");

            }
            System.out.println(" ");
        }

        System.out.println("La traspuesta de la matriz es: ");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                System.out.print("(" + (matriz[j][i] * -1) + ")" + "\t");
            }
            System.out.println(" ");
        }

    }

}
