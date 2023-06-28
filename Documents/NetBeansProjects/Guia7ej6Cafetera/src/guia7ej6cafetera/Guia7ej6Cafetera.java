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
package guia7ej6cafetera;

import Entidades.cafeteraClass;
import Servicios.cafeteraServicio;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Guia7ej6Cafetera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        cafeteraServicio nC1 = new cafeteraServicio();
        cafeteraClass c1 = new cafeteraClass();
        int opc ;
        do {
            System.out.println("1 - Llenar cafetera");
            System.out.println("2 - ServirTaza ");
            System.out.println("3 - vaciarCafetera()");
            System.out.println("4 - AgregarCafe");
            
             opc = leer.nextInt();

            switch (opc) {
                case 1:
                    nC1.llenarCafetera(c1);
                    break;
                case 2:
                    nC1.servirTaza(c1);
                    break;
                case 3:
                    nC1.vaciarCafetera(c1);
                            
                    break;
                case 4:
                    nC1.agregarCafe(c1);

                    break;
//            default:
//                throw new AssertionError();
            }

        } while (opc != 5);

    }

}
