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
public class GUIA6EJ10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int limite;
        int suma;
        int aux= 0 ;
        int numero;
        Scanner leer=new Scanner(System.in);
        System.out.println("ingrese un limite");
        limite = leer.nextInt();
        do {            
            System.out.println(" ingrese un numero ");
            numero=leer.nextInt();
            suma=aux + numero;
            aux=suma;
        } while (suma<limite);

    }
    
}
