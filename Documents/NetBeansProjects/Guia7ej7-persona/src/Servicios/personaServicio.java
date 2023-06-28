/*
Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad, sexo 
('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún otro 
atributo, puede hacerlo. Los métodos que se implementarán son:
• Un constructor por defecto.
• Un constructor con todos los atributos como parámetro.
• Métodos getters y setters de cada atributo.
• Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al 
usuario y después se le asignan a sus respectivos atributos para llenar el objeto 
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o O. 
Si no es correcto se deberá mostrar un mensaje
• Método calcularIMC(): calculara si la persona está en su peso ideal (peso en 
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, significa 
que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la 
fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona 
está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la 
fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la 
función devuelve un 1. 
• Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve 
un booleano.
A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos 
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal, tiene 
sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la persona es 
mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en 
distintas variables, para después en el main, calcular un porcentaje de esas 4 personas
cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y 
también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores
 */
package Servicios;

import Entidades.personaClass;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class personaServicio {

//    
//    Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al 
//usuario y después se le asignan a sus respectivos atributos para llenar el objeto 
//Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o O. 
//Si no es correcto se deberá mostrar un mensaje
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    int opc;
    double imc;
    boolean adulto;
    int countsp = 1, countpi = 1, countbp = 1, me = 1, ma = 1;

    public personaClass[] crearPersona() {
        //aca instancio objeto

        personaClass p1 = new personaClass();
        personaClass arr[] = new personaClass[2];

        for (int i = 0; i < arr.length; i++) {
            // lleno atributos
            System.out.println("Ingrese nombre de la persona");
            p1.setNombre(leer.next());
            System.out.println("Ingrese edad ");
            p1.setEdad(leer.nextInt());

            boolean sexo = true;
            do {

                System.out.println("Ingrese sexo 'H' hombre, 'M' mujer, 'O' otro ");
                p1.setSexo(leer.next());

                if (!"H".equals(p1.getSexo()) && !"M".equals(p1.getSexo()) && !"O".equals(p1.getSexo())) {

                    System.out.println("genero no valido");
                    sexo = false;

                }

            } while (sexo = false);

            System.out.println("Ingrese altura");
            p1.setAltura(leer.nextDouble());
            System.out.println("Ingrese peso");
            p1.setPeso(leer.nextDouble());

            System.out.println(p1.toString());
            
            arr[i]= p1;

        }
            return arr;
    }

//    Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
    //kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, significa
    //que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la
    //fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona
    //está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la
    //fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
    //función devuelve un 1. 
    public void calcularIMC(personaClass arr[]) {
        imc = arr[i].getPeso() / (p1.getAltura() * p1.getAltura());
        System.out.println("Su IMC Es de : " + imc);

        if (imc < 20) {
            opc = -1;

        } else if (imc >= 20 && imc <= 25) {
            opc = 0;

        } else {

            opc = 1;

        }

    }
    //    Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve 
    //un booleano.

    public void esMayorDeEdad(personaClass p1) {
        if (p1.getEdad() > 17) {
            adulto = true;
            System.out.println("Mayor de Edad");
            ma++;
        } else {
            adulto = false;
            System.out.println("Menor de Edad");

            me++;

        }
    }
//        deberá comprobar si la persona está en su peso ideal, tiene 
//sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la persona es 
//mayor de edad.
    switch (opc

    
    
    ) {
                case 1:
                    System.out.println(" Sobre peso ");
                    countsp = countsp + 1;
                    break;
                case 0:
                    System.out.println(" Peso ideal");
                    countpi  = countpi + 1 ;
                    break;
                case -1:
                    System.out.println(" Bajo peso");
                    countbp = countbp + 1;
                    break;

            }
            
  

        



}

//       Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en 
//distintas variables, para después en el main, calcular un porcentaje de esas 4 personas
//cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y 
//también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores
public void porcentajes(  ) {

        System.out.println(" % de personas con sobre peso " + ((countsp -1* 4) / 100));
        System.out.println(" % de personas con peso ideal " + ((countpi -1* 4) / 100));
        System.out.println(" % de personas con bajo peso " + ((countbp -1* 4) / 100));

        System.out.println(" % de personas mayores de edad " + ((ma-1 * 4) / 100));
        System.out.println(" % de personas menores de edad " + ((me -1* 4) / 100));
       

    }
   
}
