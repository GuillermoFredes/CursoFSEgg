/*
 8. Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de String) 
y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese una frase 
que puede ser una palabra o varias palabras separadas por un espacio en blanco y a 
través de los métodos set, se guardará la frase y la longitud de manera automática según 
la longitud de la frase ingresada. Deberá además implementar los siguientes métodos: 
a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase 
ingresada. 
b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por 
ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
contabilizar cuántas veces se repite el carácter en la frase, por ejemplo: 
d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que 
compone la clase con otra nueva frase ingresada por el usuario.
f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con 
una nueva frase ingresada por el usuario y mostrar la frase resultante.
g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se 
encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar la 
frase resultante.
h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que 
ingresa el usuario y devuelve verdadero si la contiene y falso si no.
 */
package guia7ej8.cadena;

import Entidades.CadenaClass;
import Servicios.cadenaSerivicio;
import com.sun.xml.internal.bind.v2.schemagen.Util;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Guia7ej8Cadena {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//        En el main se creará el objeto y se le pedirá al usuario que ingrese una frase 
//que puede ser una palabra o varias palabras separadas por un espacio en blanco y a 
//través de los métodos set, se guardará la frase y la longitud de manera automática según 
//la longitud de la frase ingresada.  
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        cadenaSerivicio frN = new cadenaSerivicio();

        CadenaClass fr = new CadenaClass();
        int longfr;
        System.out.println("Ingrese palabra o frase ");
        fr.setFrase(leer.nextLine());

        fr.setLongitud(fr.getFrase().length());
        longfr = fr.getLongitud();
        String opc;

        do {

            System.out.println("");
            System.out.println("A - Para mostrar las vocales que contiene la palabra o frase");
            System.out.println("B - Para invertir la palabra o frase ingresada");
            System.out.println("C - Para saber cuantas veces se repite un caracter en una palabra o frase");
            System.out.println("D - Para comparar longitud de frases ");
            System.out.println("E - Para unir dos frases o palabras");
            System.out.println("F - Para reemplazar todas las a por un @");
            System.out.println("G - Para comprobora si existe una determinada letra en la palabra o frase");
            System.out.println("Exit - Para salir del menu de opciones ");

            opc = leer.next().toUpperCase();

            switch (opc) {
                case "A":
                    System.out.println("La cantidad de vocales encontradas es : " + frN.mostrarVocales(fr));
                    break;
                case "B":
                    System.out.print("La palabra o frase escrita al reves : ");
                    frN.invertirFrase(fr);
                    break;
                case "C":
                    frN.vecesRepetido(fr);
                    break;
                case "D":
                    frN.compararLongitud(fr);
                    break;
                case "E":
                    frN.unirFrases(fr);
                    break;
                case "F":
                    frN.reemplazar(fr);
                    break;
                case "G":
                    frN.contiene(fr);
                    break;
            }
        } while (!"Exit".equalsIgnoreCase(opc));
    }
}
