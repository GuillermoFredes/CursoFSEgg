/*
 Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor, 
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un 
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y 
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el 
numero de páginas
 */
package guia7ej1libro;

import Entidades.LibroClass;
import Servicios.LibroServicio;
/**
 *
 * @author Admin
 */
public class Guia7ej1Libro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       LibroServicio Lib = new LibroServicio();
        //LibroClass L1 = new LibroClass();
     
        
       LibroClass L1 = Lib.crearLibro();

       Lib.mostrarLibro(L1);
       
       
        
        
        
    }
    
}
