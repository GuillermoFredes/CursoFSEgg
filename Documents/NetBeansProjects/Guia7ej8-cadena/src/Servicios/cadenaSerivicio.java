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
package Servicios;

import Entidades.CadenaClass;
import com.sun.xml.internal.bind.v2.schemagen.Util;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class cadenaSerivicio {

    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");

//    a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase 
//ingresada.
    //cadenaSerivicio fr1 = new cadenaSerivicio();
    public int mostrarVocales(CadenaClass fr1) {
        int contvocal = 0;

        for (int i = 0; i < fr1.getLongitud(); i++) {

            if (fr1.getFrase().substring(i, i + 1).equalsIgnoreCase("a")
                    || fr1.getFrase().substring(i, i + 1).equalsIgnoreCase("e")
                    || fr1.getFrase().substring(i, i + 1).equalsIgnoreCase("i")
                    || fr1.getFrase().substring(i, i + 1).equalsIgnoreCase("o")
                    || fr1.getFrase().substring(i, i + 1).equalsIgnoreCase("u")) {

                contvocal = contvocal + 1;

            }

        }

        return contvocal;

    }
//b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por 
//ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".

    public void invertirFrase(CadenaClass fr1) {
        String cadena = "";

        for (int i = fr1.getLongitud() - 1; i >= 0; i--) {

            System.out.print(cadena = (fr1.getFrase().substring(i, i + 1)));

        }

    }

//c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
//contabilizar cuántas veces se repite el carácter en la frase, por ejemplo: 
//d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
    public void vecesRepetido(CadenaClass fr1) {
        String caracter;
        int count = 0;
        System.out.println("Ingrese el caracter que desea buscar en la palabra o frase");

        caracter = leer.next();
        caracter = caracter.substring(0, 1);

        System.out.println("El caracter ingresado es : " + caracter);

        for (int i = 0; i < fr1.getLongitud(); i++) {

            if (fr1.getFrase().substring(i, i + 1).equalsIgnoreCase(caracter)) {

                count++;

            }

        }
        if (count == 0) {

            System.out.println("El caracter ingresado no se encuntra en la palabra o frase ");
        } else if (count > 0) {
            System.out.println("La cantidad de veces que aparece el caracter en la palabra o freses es de : " + count);
        }
    }
    
    

// e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que 
//compone la clase con otra nueva frase ingresada por el usuario.
   
    
    public void  compararLongitud(CadenaClass fr1) {

        int longfr2;
        String pof2;
        System.out.println("Ingrese una nueva palabra o frase ");
        pof2 = leer.next();

        longfr2 = pof2.length();
        
        if ( fr1.getLongitud() > longfr2){
                
            System.out.println("La primer palabra o frase es mayor que la segunda");
        
        }else{
            
            System.out.println("La segunda palabra o frase ingresada es mayor que la primera");
        }
 

    }
    
    
    //f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con 
//una nueva frase ingresada por el usuario y mostrar la frase resultante.
    
    public void unirFrases(CadenaClass fr1) {
    
       String pof2 , cadena;
        System.out.println("Ingrese una nueva palabra o frase para unirla a la anterior ");
        pof2 = leer.next();
        
        System.out.println( "La concatenacion de las palabras es:  " + fr1.getFrase()+ " " + pof2 );
  
    
    }

//   g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se 
//encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar la 
//frase resultante.
    
    public void reemplazar(CadenaClass fr1){
        
        System.out.println("Se reemplazaran las letras a de la palabra o frase con un @ : " + fr1.getFrase().toLowerCase().replace("a", "@"));
        
    
    }
    
    
//    h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que 
//ingresa el usuario y devuelve verdadero si la contiene y falso si no.
    public boolean contiene(CadenaClass fr1) {
        boolean encontro;
        int count = 0;
        String caracter;

        System.out.println("Ingrese la letra que desea buscar en la palabra o frase");

        caracter = leer.next();
        caracter = caracter.substring(0, 1);

        System.out.println("El caracter ingresado es : " + caracter);

        for (int i = 0; i < fr1.getLongitud(); i++) {

            if (fr1.getFrase().substring(i, i + 1).equalsIgnoreCase(caracter)) {

                count++;

            }
        }

        if (count == 0) {

            System.out.println(encontro = false);

        } else {
            System.out.println(encontro = true);
        }

        return encontro;

    }

}
