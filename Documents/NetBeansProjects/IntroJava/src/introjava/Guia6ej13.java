/*
Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*     *
*     *
* * * *
 Definir i, s, num Como Entero
	
	Escribir "Escriba el tamaño de la figura :"
	leer num
	
	para i=1 Hasta num Hacer
		si i=1 o i=num Entonces
			para s=1 Hasta num-1 Hacer
				escribir Sin Saltar "*  "
			FinPara
			escribir "*"
		SiNo
     		Escribir sin saltar "*  "
			para s=2 Hasta num-1 Hacer
				Escribir Sin Saltar "   "
			FinPara
			escribir "*"
		FinSi
	FinPara


 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Guia6ej13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in); // Creamos el Scanner que es como leer de pseint
        int tamanio;

        //int s;
        System.out.println("Ingrese el tamaño de la figura");

        tamanio = leer.nextInt();

        for(int i = 0 ; i < tamanio -1 ; i++) {

            System.out.println("*");
        }
         for(int s = 0 ; s < tamanio ; s++){
             System.out.print("*  ");
         }
        for(int s = 0 ; s < tamanio ; s++){
             System.out.print("*");
         }
         System.out.println("");
        
        }
 
      
    }



