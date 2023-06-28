/*
Se plantea desarrollar un programa que nos permita calcular el área y el perímetro de formas 
geométricas, en este caso un círculo y un rectángulo. Ya que este cálculo se va a repetir en las 
dos formas geométricas, vamos a crear una Interfaz, llamada calculosFormas que tendrá, los 
dos métodos para calcular el área, el perímetro y el valor de PI como constante. 
Desarrollar el ejercicio para que las formas implementen los métodos de la interfaz y se 
calcule el área y el perímetro de los dos. En el main se crearán las formas y se mostrará el 
resultado final. 
Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2.

 */
package guia10.ej4.figuras;

/**
 *
 * @author Admin
 */
public class Rectangulo implements calculosFormas {

    private double base;
    private double altura;

    public Rectangulo(double base) {
        this.base = base;
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {

        double resultadoA = base * altura;
        return resultadoA;

    }

    @Override
    public double calcularPerimetro() {
        double resultadoP = (base + altura) * 2;
        return resultadoP;
    }

}
