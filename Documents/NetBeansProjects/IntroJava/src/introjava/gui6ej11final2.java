/*
Realizar un programa que pida dos números enteros positivos por teclado y muestre por
pantalla el siguiente menú:

MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:


El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla
y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5.
Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa
directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que
desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del
programa, caso contrario se vuelve a mostrar el menú.
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class gui6ej11final2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in); // Creamos el Scanner que es como leer de pseint

        int opc;
        float num1;
        float num2;
        float resultado;

        String exit = "x";
        String respuesta;

        System.out.println("Ingrese primer numero");
        num1 = leer.nextInt();
        System.out.println("Ingrese segundo numero ");
        num2 = leer.nextInt();
        do {
            System.out.println("Elija una opcion");
            System.out.println("1- para Sumar");
            System.out.println("2- para Restar");
            System.out.println("3- para multiplicar");
            System.out.println("4- para Dividir");
            System.out.println("5- para Salir");

            opc = leer.nextInt();

            switch (opc) {

                case 1:
                    resultado = num1 + num2;
                    System.out.println("El resultado es: " + resultado);
                    break;
                case 2:
                    resultado = num1 - num2;
                    System.out.println("El resultado es: " + resultado);
                    break;
                case 3:
                    resultado = num1 * num2;
                    System.out.println("El resultado es: " + resultado);
                    break;
                case 4:
                    resultado = num1 / num2;
                    System.out.println("El resultado es: " + resultado);
                    break;
                case 5:

                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");

                    exit = leer.next();
                    break;

            }

        } while (!exit.equalsIgnoreCase("s"));

    }
}
