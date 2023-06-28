/*
 Crear una clase llamada Operacion que tenga como atributos privados numero1 y 
numero2. A continuación, se deben crear los siguientes métodos:
a) Método constructor con todos los atributos pasados por parámetro.
b) Metodo constructor sin los atributos pasados por parámetro.
c) Métodos get y set.
d) Método para crearOperacion(): que le pide al usuario los dos números y los guarda en 
los atributos del objeto.
e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
f) Método restar(): calcular la resta de los números y devolver el resultado al main
g) Método multiplicar(): primero valida que no se haga una multiplicación por cero, si 
fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error. Si 
no, se hace la multiplicación y se devuelve el resultado al main
h) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar 
una división por cero, el método devuelve 0 y se le informa al usuario el error se le 
informa al usuario. Si no, se hace la división y se devuelve el resultado al main.

 */
package Servicios;

import Entidades.operacionesClass;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class operacionesServicios {

//    d) Método para crearOperacion(): que le pide al usuario los dos números y los guarda en 
//los atributos del objeto.
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public operacionesClass crearOperacion() {

        operacionesClass obj = new operacionesClass();

        System.out.println("Ingrese el 1° número");
        obj.setNumero1(leer.nextDouble());

        System.out.println("Ingrese el 2° número");
        obj.setNumero2(leer.nextDouble());

        System.out.println("El primer numero es: " + obj.getNumero1());
        System.out.println("El segundo numero es: " + obj.getNumero2());

        return obj;

    }

//    Método sumar(): calcular la suma de los números y devolver el resultado al main.
    public void sumar(operacionesClass obj) {

        double suma = obj.getNumero1() + obj.getNumero2();

        System.out.println("La suma de los número ingresados es: " + suma);

    }
// Método restar(): calcular la resta de los números y devolver el resultado al main

    public void restar(operacionesClass obj) {

        double resta = obj.getNumero1() - obj.getNumero2();

        System.out.println("La suma de los número ingresados es: " + resta);

    }

//Método multiplicar(): primero valida que no se haga una multiplicación por cero, si 
//fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error. Si 
//no, se hace la multiplicación y se devuelve el resultado al main
    public void producto(operacionesClass obj) {

        if (obj.getNumero1() > 0 && obj.getNumero2() > 0) {

            double multiplicar = obj.getNumero1() * obj.getNumero2();

            System.out.println("La suma de los número ingresados es: " + multiplicar);

        } else {
            System.out.println("todo numero multplicado por 0 es 0 ");
        }

    }
//Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar 
//una división por cero, el método devuelve 0 y se le informa al usuario el error se le 
//informa al usuario. Si no, se hace la división y se devuelve el resultado al main.

    public void division(operacionesClass obj) {

        if (obj.getNumero1() > 0 && obj.getNumero2() > 0) {

            double dividir = (obj.getNumero1() / obj.getNumero2());

            System.out.println("La suma de los número ingresados es: " + dividir);

        } else {
            System.out.println("Indefinido ");
        }

    }

}
