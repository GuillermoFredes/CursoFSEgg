/*
Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El 
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla. 
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números 
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor 
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de 
20.

 */
package Servicios;

import Entidades.arrayClass;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class arraysServicio {

    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");

    arraysServicio[] arrA = new arraysServicio[50];
    arraysServicio[] arrB = new arraysServicio[20];

    public arrayClass llenarArr(arrayClass arr1) {

        double arrAux[] = new double[50];

        for (int i = 0; i < 50; i++) {

            arrAux[i] = (int) Math.round(Math.random() * 99 );

        }

        arr1.setArregloA(arrAux);

        return arr1;

    }

    public void ordenar(arrayClass arr1) {
        double arrAux[] = arr1.getArregloA();

        Arrays.sort(arrAux);

        arr1.setArregloA(arrAux);

        for (int i = 0; i < 50; i++) {
            //System.out.println("Vector A");
            System.out.print("[" + arr1.getArregloA()[i] + "]");

        }

    }

    public void llenarArrB1(arrayClass arr1) {

        double arrAux[] = new double[20];

        for (int i = 0; i < 20; i++) {
            if (i < 10) {
                arrAux[i] = arr1.getArregloA()[i];

            } else {

                arrAux[i] = 0.5;
            }
        }

        arr1.setArregloB(arrAux);

        for (int i = 0; i < 20; i++) {
            //System.out.println("Vector B");
            System.out.print("[" + arr1.getArregloB()[i] + "]");

        }
        System.out.println("");
    }
      
}
