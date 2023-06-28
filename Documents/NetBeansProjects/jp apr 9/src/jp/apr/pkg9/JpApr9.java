package jp.apr.pkg9;

import java.util.Scanner;

/**
 *
 * @author Camila Astrada 
 */
public class JpApr9 {

    /**
     * Realizar una clase llamada Matemática que tenga como atributos dos números reales con
los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un
constructor vacío, parametrizado y get y set. En el main se creará el objeto y se usará el
Math.random para generar los dos números y se guardaran en el objeto con su
respectivos set. Deberá además implementar los siguientes métodos:

     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        MatematicaService ser= new MatematicaService();
        Matematica mat = new Matematica(Math.random()*10, 10*Math.random());
        
     
        
        ser.devolverMayor(mat);
      ser.calcularPotencia(mat);
       ser.calcularRaiz(mat);
    }

}
