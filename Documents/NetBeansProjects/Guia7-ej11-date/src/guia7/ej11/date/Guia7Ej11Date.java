/*
 Clase Date
11. Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la 
clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase 
Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al 
usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date, 
deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que se 
puede conseguir instanciando un objeto Date con constructor vacío. 
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();
 */
package guia7.ej11.date;

import Entidades.dateClass;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author Admin
 */
public class Guia7Ej11Date {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");

        int anio, mes, dia;

        System.out.println("Ingrese un año");
        anio = leer.nextInt();

        System.out.println("Ingrese un mes en numero");
        mes = leer.nextInt();
        System.out.println("Ingrese dia, en numero");
        dia = leer.nextInt();

        Date fecha = new Date(anio-1900, mes-1, dia);
        Date fechaActual = new Date();

        SimpleDateFormat formato = new SimpleDateFormat("yyyy - MM - dd  ");
        String fechaS = formato.format(fecha);
        System.out.println(fechaS);
        String fechaAS = formato.format(fechaActual);
        System.out.println(fechaAS);

        int diferenciaA = fechaActual.getYear()- fecha.getYear() ;
        int diferenciaM = fechaActual.getMonth()-fecha.getMonth() ;
        int diferenciaD = fechaActual.getDay()-fecha.getDay();
        
                
        System.out.println(" "+diferenciaA + "-" +  diferenciaM + "-" +diferenciaD);

    }

}
