

package servicios;

import entidades.Persona;
import java.util.Date;
import java.util.Scanner;


 // @author Camila Astrada 
 /*
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
anterior.
*/
public class PersonaService {
   Scanner leer =  new Scanner(System.in).useDelimiter("\n");
    public Persona crearP(){ 
        Persona p = new Persona();
        System.out.println("ingrese el nombre");
        p.setNombre(leer.next());
        
            System.out.println("fECHA DE NACIMIENTO:");
        System.out.println("ingrese el día");
     int dia = leer.nextInt();
           System.out.println("ingrese el mes");
    int mes =leer.nextInt();
           System.out.println("ingrese el año");
      int anio = leer.nextInt();
         
      Date fecha = new Date(anio-1900,mes-1,dia);
      
      p.setNacimiento(fecha); 
      
        
        return p;
        
    }
    
    
    
   public long calcularEdad( Persona p){
       
        Date fa= new Date();
        long edad; 
        
     long diferencia = fa.getTime() - p.getNacimiento().getTime();
     edad=  diferencia/1000/60/60/24/365;
     p.setEdad(edad);
       return edad;
   }
   
   
   public void menorQue(long edad){
       
       System.out.println("ingrese una edad para comparar");
       int edad2 = leer.nextInt();
      boolean menor = edad < edad2; 
      
      if (menor){ 
          System.out.println(edad2 + " es mayor a la edad de la primer persona.");
      } else {
            System.out.println(edad2 + " es menor a la edad de la primer persona.");
      }
   }
   
   
   public void mostrarP(Persona p){
       System.out.println("Datos de la persona: ");
       System.out.println("Nombre: "+ p.getNombre());
       System.out.println("Fecha de nacimiento: "+ p.getNacimiento());
       System.out.println("Edad: "+ p.getEdad());
       
       
   }
}
