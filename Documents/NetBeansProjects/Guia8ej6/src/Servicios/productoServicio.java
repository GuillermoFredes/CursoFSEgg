/*
 Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos 
productos que venderemos y el precio que tendrán. Además, se necesita que la 
aplicación cuente con las funciones básicas. 
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio, 
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar 
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio. 
Realizar un menú para lograr todas las acciones previamente mencionadas.
 */
package Servicios;

import Entidades.productoClass;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Admin
 */
public class productoServicio {

    HashMap<productoClass, Double> productList = new HashMap();
    // Set<productoClass> productoList = new HashSet<>();
    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");

    public void addProducto() {

        productoClass producto = new productoClass();

        System.out.println("Ingrese un producto");
        String nom = leer.next();
        System.out.println("Ingrese precio del prducto");
        Double pre = leer.nextDouble();
     
           productList.put(producto, pre);
           
           
              for (Map.Entry<productoClass, Double> aux : productList.entrySet()) {
            productoClass key = aux.getKey();
            Double value = aux.getValue();
            
        }
      

    }

    public void mostrarProducto() {

        for (Map.Entry<productoClass, Double> aux : productList.entrySet()) {
            productoClass key = aux.getKey();
            Double value = aux.getValue();
            
        }

        }

    }


