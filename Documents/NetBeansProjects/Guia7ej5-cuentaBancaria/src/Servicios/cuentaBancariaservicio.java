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
package Servicios;

import Entidades.cuentaBancariaClass;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class cuentaBancariaservicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    //Menu
    // Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
    public cuentaBancariaClass creaCuenta() {

        cuentaBancariaClass newcta = new cuentaBancariaClass();
        System.out.println("Ingrese los datos de la cuenta a crear:");
        System.out.println("N° de cuenta");
        newcta.setNumeroCuenta(leer.nextInt());
        System.out.println("Ingrese DNI del titular ");
        newcta.setDNI(leer.nextLong());
        System.out.println("Saldo inicial de cuenta");
        newcta.setSaldo(leer.nextInt());
        System.out.println("Cuenta creada con exito");

        System.out.println("Información de cuenta bancaria : " + newcta);

        return newcta;

    }

//Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar 
//y se la sumara a saldo actual.
    public void ingreso(cuentaBancariaClass obj) {

        System.out.println("Que monto desea ingresar? ");
        double monto = leer.nextDouble();

        obj.setSaldo(obj.getSaldo() + (int) monto);

    }

//Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se la 
//restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se pondrá el 
//saldo actual en 0.
    public void retiro(cuentaBancariaClass obj) {

        System.out.println("Que monto desea retirar? ");
        double monto = leer.nextDouble();
        if (monto < obj.getSaldo()) {

            obj.setSaldo(obj.getSaldo() - (int) monto);

        } else {
            System.out.println("Saldo insuficiente, su disponible para esta operación es de: " + obj.getSaldo());
        }

    }

    // le permitirá sacar solo un 20% de su saldo. Validar que el 
//usuario no saque más del 20%.Método extraccionRapida()

    public void extraccionRapida(cuentaBancariaClass obj) {

        System.out.println("Que monto desea retirar? ");
        int monto = leer.nextInt();
       
        if (( obj.getSaldo() * .2) < monto) {

            System.out.println("Su solicitud a exedido el 20% de su saldo, monto maximo para esta operación : " + ( obj.getSaldo() * .2));

        } else {
            obj.setSaldo(obj.getSaldo() -  monto);
        }
    }



    
    
    //Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
    public void consultarSaldo(cuentaBancariaClass obj) {

        System.out.println("Su saldo actual es de: $ " + obj.getSaldo());

    }

//Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
    public void consultarDatos(cuentaBancariaClass obj) {

        System.out.println("Información de cuenta bancaria : " + obj.toString());

    }

}
