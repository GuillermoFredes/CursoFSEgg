/*
 Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos 
productos que venderemos y el precio que tendrán. Además, se necesita que la 
aplicación cuente con las funciones básicas. 
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio, 
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar 
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio. 
Realizar un menú para lograr todas las acciones previamente mencionadas.
 */
package guia8ej6;

import Entidades.productoClass;
import Servicios.productoServicio;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Guia8ej6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        productoServicio pro1 = new productoServicio();
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        String opc;
        do {

            System.out.println("");
            System.out.println("A - Agregar producto");
            System.out.println("B - Modificar precio de producto");
            System.out.println("C - Eliminar producto");
            System.out.println("D - Imprimir lista de productos");
            System.out.println("Exit - Para salir del menu de opciones ");

            opc = leer.next().toUpperCase();

            switch (opc) {
                case "A":
                    pro1.addProducto();
                    break;
                case "B":
                   
                    break;
                case "C":
                   
                    break;
                case "D":
                    pro1.mostrarProducto();
                    break;

            }
        } while (!"Exit".equalsIgnoreCase(opc));
    }

}
