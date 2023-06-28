/*
 Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos: 
numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero). Las 
operaciones asociadas a dicha clase son: 
a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
b) Agregar los métodos getters y setters correspondientes 
c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar 
y se la sumara a saldo actual.
e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se la 
restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se pondrá el 
saldo actual en 0. 
f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el 
usuario no saque más del 20%.
g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta. 
h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */
package guia7ej5.cuentabancaria;

import Entidades.cuentaBancariaClass;
import Servicios.cuentaBancariaservicio;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Guia7ej5CuentaBancaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        cuentaBancariaservicio cta = new cuentaBancariaservicio();

        cuentaBancariaClass cuenta1 = cta.creaCuenta();

        int opc;

        cuentaBancariaClass obj = new cuentaBancariaClass();
        do {

            System.out.println("            MENU            ");

            System.out.println("1 - Para ingresar dinero");
            System.out.println("2 - Para retirar dinero");
            System.out.println("3 - Para realizar una extracción rápida");
            System.out.println("4 - Para consultar saldo ");
            System.out.println("5 - Para información de cuenta ");
            System.out.println("6 - Para salir del Menú ");

            opc = leer.nextInt();

            switch (opc) {

                case 1:
                    cta.ingreso(cuenta1);

                    break;

                case 2:

                    cta.retiro(cuenta1);
                    break;

                case 3:

                    cta.extraccionRapida(cuenta1);

                    break;

                case 4:
                    cta.consultarSaldo(cuenta1);
                    break;

                case 5:
                    cta.consultarDatos(cuenta1);

            }
        } while (opc != 6);
        if (opc == 6) {

            System.out.println("Gracias por utilizar nuestros servicios ");

        }
    }

}
