/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7ej10;

import Entidades.arrayClass;
import Servicios.arraysServicio;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Guia7ej10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
         Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
       arraysServicio arrAn = new arraysServicio();

        arrayClass arr1  = new arrayClass();
        
        arrAn.llenarArr(arr1);
        
        System.out.println("");
        
        arrAn.ordenar(arr1);
        
        System.out.println("");
        
        arrAn.llenarArrB1(arr1);
    }
    
}
