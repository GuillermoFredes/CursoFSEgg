/*
Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El 
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla. 
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números 
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor 
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de 20.

 */
package Entidades;

/**
 *
 * @author Admin
 */
public class arrayClass {
    
    
    private double arregloA[], arregloB[];

    public arrayClass() {
    }

    public arrayClass(double[] arregloA, double[] arregloB) {
        this.arregloA = arregloA;
        this.arregloB = arregloB;
    }

    public double[] getArregloA() {
        return arregloA;
    }

    public double[] getArregloB() {
        return arregloB;
    }

    public void setArregloA(double[] arregloA) {
        this.arregloA = arregloA;
    }

    public void setArregloB(double[] arregloB) {
        this.arregloB = arregloB;
    }

   

 
    
    
    
    
    
    
    
    
}
