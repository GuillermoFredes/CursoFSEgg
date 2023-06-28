/*
 Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de 
tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del 
objeto.
d) Método area(): para calcular el área de la circunferencia (���� = � ∗ ������).
e) Método perimetro(): para calcular el perímetro (��������� = � ∗ � ∗ �����).
 */
package Servicios;

import Entidades.circunferenciaClass;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class circunferenciaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public circunferenciaClass rxparametro() {

        circunferenciaClass nradio = new circunferenciaClass();

        System.out.println("Ingrese Radio");
        nradio.setRadio(leer.nextDouble());

        System.out.println("El radio ingresado es: " + nradio.getRadio());
        return nradio;

    }

    public  void calcArea(circunferenciaClass Obj) {
       
             
        double narea = Math.PI * Math.pow(Obj.getRadio(), 2) ;
        
        System.out.println("El area de la circunferencia es: " +narea);
       

    }
    
    public  void calcPerimetro(circunferenciaClass Obj) {
       
             
        double nperimetro = 2 * Math.PI * Obj.getRadio() ;
        
        System.out.println("El area de la circunferencia es: " +nperimetro);

        
        
}
}