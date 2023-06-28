/*
5. Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos 
usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el 
conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir, 
si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer 
los servicios en la clase correspondiente)
Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar 
cómo se ordena un conjunto.
Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se 
buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el 
usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará 
al usuario.
 */
package Servicios;

import Entidades.paisClass;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Admin
 */
public class paisServicio {

    Set<paisClass> lisPais = new TreeSet();
    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");

    public void addPais() {

        System.out.println("Ingrese un pais");
        String nom = leer.next();
        paisClass pais = new paisClass(nom);
        lisPais.add(pais);

    }

    public void cantidadPais() {

        String opc;

        do {
            addPais();
            System.out.println("Desea agregar otro pais? S/N");
            opc = leer.next();
        } while (!opc.equalsIgnoreCase("n"));

        for (paisClass aux : lisPais) {
            System.out.println(aux);

        }

    }

    public void eliminarPais() {
        int eliminado = 0;

        ArrayList<paisClass> paisesLista = new ArrayList(lisPais);

        Iterator<paisClass> it = paisesLista.iterator();
        System.out.println("Ingrese un pais a eliminar");
        String paisDel = leer.next();
        while (it.hasNext()) {

            if (it.next().getNombre().equalsIgnoreCase(paisDel)) {
                it.remove();
                eliminado++;

                paisesLista.forEach((aux) -> {
                    System.out.println(aux);
                });

            }  
        }
        if (eliminado == 0) {
                System.out.println("El pais ingresado no esta en la lista ");

            }
    }
}
