/*
 Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
 */
package guia9ej1;

import guia9ej1.entidades.Perro;
import guia9ej1.entidades.Persona;

/**
 *
 * @author Admin
 */
public class Guia9ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Creamos primer  persona
        Persona persona1 = new Persona();
        persona1.setNombre("Luis");
        persona1.setApellido("Correa");
        persona1.setDni(23654789);
        persona1.setEdad(32);

        //Creamos primer perro
        Perro perro1 = new Perro();

        perro1.setNombre("Rocco");
        perro1.setRaza("Caniche");
        perro1.setEdad(1);
        perro1.setTamaño("pequeño");

        persona1.setPerro(perro1);

        //Creamos segunda persona
        Persona persona2 = new Persona();

        persona2.setNombre("Pablo");
        persona2.setApellido("Marmol");
        persona2.setDni(34423789);
        persona2.setEdad(46);

        //Creamos segundo perro
        Perro perro2 = new Perro();

        perro2.setNombre("Kala");
        perro2.setRaza("Golden");
        perro2.setEdad(4);
        perro2.setTamaño("Grande");

        persona2.setPerro(perro2);

        // Salida con valores de persona y perro adoptado 
        System.out.println(persona1.toString());
        System.out.println(persona2.toString());

    }

}
