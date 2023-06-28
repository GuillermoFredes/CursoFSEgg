package jp.apr.pkg8;

import java.util.Scanner;
import entidades.Cadena;
import Servicios.CadenaService;


/**
 *
 * @author Camila Astrada 
 */
public class JpApr8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Scanner leer = new Scanner(System.in).useDelimiter("\n");
       CadenaService ser=  new CadenaService();
       Cadena cad = new Cadena();
       
        System.out.println("ingrese una frase");
       cad.setFrase(leer.next());
       cad.setLongitud(cad.getFrase().length());
       int op; 
     
       
       
        System.out.println("Bienvenido");
  do{ 
        System.out.println("1. Mostrar vocales.");
        System.out.println("2. Invertir frase.");
        System.out.println("3. Veces Repetido.");
        System.out.println("4. Comparar longitud. ");
        System.out.println("5. Unir frases");      
        System.out.println("6. Reemplazar letra");
        System.out.println("7. ¿contiene la letra...");
        System.out.println(". salir");
        System.out.println("ingrese la opción deseada.");
            op = leer.nextInt();
        /*
Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase
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
h) Método contiene(String letra), deberá comprobar si la frase contiene una letra

*/     
       switch(op) {
            case 1: 
                     System.out.println(ser.mostrarVocales(cad));       
                break; 
                
            case 2: 
                ser.invertirFrase(cad);
               
                 break; 
            case 3: 
                ser.vecesRepetido(cad);
                 break; 
            case 4:
               ser.compararLongitud(cad);
                break; 
            case 5: 
               ser.unirFrases(cad);
               
                       break; 
             case 6:
                 ser.reemplazar(cad);
                break;
             case 7:
               ser.contiene(cad);
                break; 
            
            default: 
                System.out.println("Opcion incorrecta.");
             

        }
               
        
        
  } while (op != 8);
    }
    }


