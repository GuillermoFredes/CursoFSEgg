/*
 Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
base y un atributo privado altura. La clase incluirá un método para crear el rectángulo con 
los datos del Rectángulo dados por el usuario. También incluirá un método para calcular la 
superficie del rectángulo y un método para calcular el perímetro del rectángulo. Por último,
tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la 
altura. Se deberán además definir los métodos getters, setters y constructores 
correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
package Servicios;

import Entidades.rectanguloClass;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class rectanguloServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public rectanguloClass datos() {

        rectanguloClass obj = new rectanguloClass();
        System.out.println("Ingrese altura");
        obj.setAltura(leer.nextDouble());
        System.out.println("Ingrese base");
        obj.setBase(leer.nextDouble());

        System.out.println("El rectangulo es de : " + obj.getAltura() + " por  : " + obj.getBase());

        return obj;

    }
//También incluirá un método para calcular la 
//superficie del rectángulo
//Superficie = base * altura 

    public void superficie(rectanguloClass obj) {

        double sup = obj.getAltura() + obj.getBase();

        System.out.println("La superficie del rectangulo es: " + sup);

    }

//  un método para calcular el perímetro del rectángulo
//  Perímetro = (base + altura) * 2.
    public void perimetro(rectanguloClass obj) {

        double per = (obj.getAltura() + obj.getBase()) * 2;

        System.out.println("La superficie del rectangulo es: " + per);

    }

//Por último,
//tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la 
//altura
    public void dibujo(rectanguloClass obj) {

        for (int i = 1; i <= obj.getAltura(); i++) {

            for (int j = 1; j <= obj.getBase(); j++) {

                if (i == 1 || i == obj.getAltura() || j == 1 || j == obj.getBase()) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }

}
