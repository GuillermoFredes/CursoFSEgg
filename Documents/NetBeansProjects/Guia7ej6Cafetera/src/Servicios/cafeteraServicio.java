/*
 Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la cantidad 
actual de café que hay en la cafetera). Implemente, al menos, los siguientes métodos: 
• Constructor predeterminado o vacío
• Constructor con la capacidad máxima y la cantidad actual 
• Métodos getters y setters.
• Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima. 
• Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el 
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la 
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El 
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en 
cuanto quedó la taza.
• Método vaciarCafetera(): pone la cantidad de café actual en cero. 
• Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo 
recibe y se añade a la cafetera la cantidad de café indicada
 */
package Servicios;

import Entidades.cafeteraClass;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class cafeteraServicio {

    cafeteraClass objCafetera = new cafeteraClass();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

//    public cafeteraClass tamCafetera(cafeteraClass objCafetera) {
//
//        cafeteraClass tipoCafetera = new cafeteraClass();
//        
//        tipoCafetera.setCantMax(1000);
//
//        return tipoCafetera;
//
//    }
    //• Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima.
    public void llenarCafetera(cafeteraClass objCafetera) {
        objCafetera.setCantMax(1000);
        objCafetera.setCantaAct(objCafetera.getCantMax());

        System.out.println("La cantidad Maxima de cafe es : " + objCafetera.getCantMax() + "ml");
        System.out.println("La cantidad actual de cafe es : " + objCafetera.getCantaAct() + "ml");

    }

//   • Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el 
//tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la 
//cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El 
//método le informará al usuario si se llenó o no la taza, y de no haberse llenado en 
//cuanto quedó la taza. 
//    
    public void servirTaza(cafeteraClass objCafetera) {

        System.out.println("De que capacidad es taza que desea llenar ? ");
        int taza = leer.nextInt();

        if (taza > objCafetera.getCantaAct()) {

            System.out.println("La cantidad actual de cafe es insuficiente para llenar la taza, se serviran  " + objCafetera.getCantaAct() + " ml de cafe ");

        }
        System.out.println("Su taza esta llena, ya puede retirarla ");
        objCafetera.setCantaAct(objCafetera.getCantaAct() - taza);
    }

    //• Método vaciarCafetera(): pone la cantidad de café actual en cero. 
    public void vaciarCafetera(cafeteraClass objCafetera) {

        objCafetera.setCantaAct(0);

        System.out.println("La cantidad actual de cafe esc : " + objCafetera.getCantaAct() + " la cafetera se vació correctamente");

    }

//• Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo 
//recibe y se añade a la cafetera la cantidad de café indicada
    public void agregarCafe(cafeteraClass objCafetera) {

        int difcafe = objCafetera.getCantMax() - objCafetera.getCantaAct();

        System.out.println(" Ingrese " + difcafe + " ml de cafe para conseguir la carga máxima ");

        objCafetera.setCantMax(difcafe + objCafetera.getCantaAct());

        if (objCafetera.getCantMax() == objCafetera.getCantaAct()) {

            System.out.println("La cafetera esta en su capacidad máxima ");

        }

    }
}
