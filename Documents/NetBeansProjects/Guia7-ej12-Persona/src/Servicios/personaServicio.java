/*
 12. Implemente la clase Persona. Una persona tiene un nombre y una fecha de nacimiento
(Tipo Date), constructor vacío, constructor parametrizado, get y set. Y los siguientes 
métodos: 
• Agregar un método de creación del objeto que respete la siguiente firma: 
crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al 
usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la 
fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
• Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener 
en cuenta que para conocer la edad de la persona también se debe conocer la fecha 
actual.
• Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
edad y retorna true en caso de que el receptor tenga menor edad que la persona que 
se recibe como parámetro, o false en caso contrario.
• Metodo mostrarPersona(): este método muestra la persona creada en el método 
anter
 */
package Servicios;

import Entidades.personaClass;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class personaServicio {

    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");

//• Agregar un método de creación del objeto que respete la siguiente firma: 
//crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al 
//usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la 
//fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
//   personaServicio nombre = new  personaServicio();
//   personaServicio nacimineto = new personaServicio();
    public void crearPersona(personaClass nac, personaClass nom) {

        String nombre;
        int anio, mes, dia;

        System.out.println("Ingrese nombre de la persona ");
        nom.setNombre(leer.next());

        System.out.println("A coontinuacion solicitaremos fecha de nacimiento");

        System.out.println("Ingrese un año");
        anio = leer.nextInt();
        System.out.println("Ingrese un mes en numero");
        mes = leer.nextInt();
        System.out.println("Ingrese dia, en numero");
        dia = leer.nextInt();

        Date fechaNac = new Date(anio - 1900, mes - 1, dia);

        nac.setNacimiento(fechaNac);

     
    }

//• Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener 
//en cuenta que para conocer la edad de la persona también se debe conocer la fecha 
//actual. 
    public int calcularEdad(personaClass nac) {

        Date fechaActual = new Date();
        Date fechaN = nac.getNacimiento();

        int diferenciaA = fechaActual.getYear() - fechaN.getYear();

        System.out.println("Su edad a la fecha es: " + diferenciaA + " Años");
        return diferenciaA;

    }

//• Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
//edad y retorna true en caso de que el receptor tenga menor edad que la persona que 
//se recibe como parámetro, o false en caso contrario.
    //after(Date fecha2) - before(Date fecha2)
    public boolean menorQue(int nac , int dif ) {
       
       
        
        

        return nac < dif;

    }

    
   public void mostrarPersona(personaClass nom , personaClass nac){
   
      System.out.println("Nombre: " + nom.getNombre());
        System.out.println("Fecha de nacimiento: " + nac.getNacimiento());
   
   }
}
