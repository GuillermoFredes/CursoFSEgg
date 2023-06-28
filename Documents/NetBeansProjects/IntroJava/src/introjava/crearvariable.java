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
public class crearvariable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in); // Creamos el Scanner que es como leer de pseint
        
        System.out.println("Ingrese su nombre y apellido ");
        
        String nom = read.nextLine();
        
       
        System.out.println("muestra nombre y paellido " + nom);
        
        System.out.println("Ingrese 1° numero");
        int num1 = read.nextInt();
        System.out.println("Ingrese 2° numero"); //como escribir de pseint
         
        
        int num2 = read.nextInt() ; 
        
        int suma = num1 + num2; //como entero de pseint
        double resta = num2 - num1; //como real de pseint
        boolean comparativa = num2 < num1; //como logico de pseint
        int inc = ++num1;
        int dec = --num2;
        String resultado = "" + comparativa;
        
        if (num1 > num2) {
            System.out.println("El primer numero ingresado es el mayor"); 
        }else{
            System.out.println("El segundo numero ingresado es el mayor ");
        }        
        
        
        System.out.println(" ");
        System.out.println("A continuación se mostraran todos los resultados de los valores ingresados por " + nom);
        System.out.println(" ");
   
        System.out.println( +suma );
        System.out.println(""+resta );
        System.out.println(""+comparativa);
        System.out.println(""+inc);
        System.out.println(""+dec);
        System.out.println("el resultado de la comparativa fue : " +resultado);
    }
    
}
