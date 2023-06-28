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
package guia7ej2circunferencia;

import Entidades.circunferenciaClass;
import Servicios.circunferenciaServicio;

/**
 *
 * @author Admin
 */
public class Guia7ej2Circunferencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        circunferenciaServicio Nr1 = new circunferenciaServicio();

        circunferenciaClass R1 = Nr1.rxparametro();
        Nr1.calcArea(R1);
        Nr1.calcPerimetro(R1);

    }

}
