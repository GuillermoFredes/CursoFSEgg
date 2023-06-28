package jp.apr.pkg9;

// @author Camila Astrada 
public class MatematicaService {

    /*
    a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase elevado
al menor número. Previamente se deben redondear ambos valores.
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
     */
    public void devolverMayor(Matematica mat) {

        if (mat.getNuno() < mat.getNdos()) {
            System.out.println("el segundo número es mayor. " + mat.getNdos());
        } else {
            System.out.println("el primer número es mayor. " + mat.getNuno());
        }

    }

    public void calcularPotencia(Matematica mat) {

        if (mat.getNuno() < mat.getNdos()) {
            System.out.println(mat.getNdos() + " elevado a " + mat.getNuno() + " es: ");
            System.out.println(Math.pow(mat.getNdos(), mat.getNuno()));
        } else {
  System.out.println(mat.getNuno() + " elevado a " + mat.getNdos() + " es: ");
        System.out.println(Math.pow(mat.getNuno(), mat.getNdos()));
        }

      

    }

    public void calcularRaiz(Matematica mat) {

          if (mat.getNuno() < mat.getNdos()) {
              System.out.println("El menor numero es: "+ mat.getNuno());
              System.out.println("Su raiz cuadrada es: " + Math.sqrt(mat.getNuno()));
        } else {
              System.out.println("El menor numero es: "+ mat.getNdos());
              System.out.println("Su raiz cuadrada es: " + Math.sqrt(mat.getNdos()));
        }

    }
    
    
    
}
