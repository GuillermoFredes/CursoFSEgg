/*
 3. Crear una clase llamada Alumno que mantenga información sobre las notas de distintos 
alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer 
con sus 3 notas. 
En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide 
toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le 
pregunta al usuario si quiere crear otro Alumno o no.
Después de ese bucle tendremos el siguiente método en el servicio de Alumno: 
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota 
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro 
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este 
promedio final, devuelto por el método y mostrado en el main.
 */
package Servicios;

import Entidades.alumnoClass;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class alumnoServicio {

    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    //  alumnoClass nom1 = new alumnoClass();
    ArrayList<alumnoClass> listalumnos = new ArrayList<>();
// En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide 
//toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le 
//pregunta al usuario si quiere crear otro Alumno o no.

    public void crearAlumno() {
        ArrayList<Integer> not = new ArrayList();

        System.out.println("Ingrese nombre del alumno");

        String nombre = leer.next();

        alumnoClass nom1 = new alumnoClass(nombre);

        for (int i = 0; i < 3; i++) {

            System.out.println("Ingrese nota " + (i + 1));
            not.add(leer.nextInt());

        }

        nom1.setNota(not);

        listalumnos.add(nom1);

        for (alumnoClass aux : listalumnos) {
            System.out.println(aux);

        }

    }

    public void cantidadAlumnos() {

        String opc;

        do {
            crearAlumno();
            System.out.println("Desea agregar otro alumno? S/N");
            opc = leer.next();
        } while (!opc.equalsIgnoreCase("n"));

    }

//Después de ese bucle tendremos el siguiente método en el servicio de Alumno: 
//Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota 
//final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro 
//del método se usará la lista notas para calcular el promedio final de alumno. Siendo este 
//promedio final, devuelto por el método y mostrado en el main.
    public void notaFinal() {

        double prom = 0;
        int cont = 0;

        System.out.println("De que alumno desea calcular el promedio de notas?");
        String nom2 = leer.next();

        for (int i = 0; i < listalumnos.size(); i++) {

            alumnoClass aux2 = listalumnos.get(i);

            if (nom2.equalsIgnoreCase(aux2.getNombre())) {

                prom = (aux2.getNota().get(0) + aux2.getNota().get(1) + aux2.getNota().get(2)) / 3;

            } else {

                cont++;

            }
        }
        if (cont != listalumnos.size()) {

            System.out.println("El promedio del alumno: " + nom2 + " es igual a " + prom);

        } else if (cont == listalumnos.size()) {
            System.out.println("No existe el alumno");

        }
    }

}
