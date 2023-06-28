/*
 Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor, 
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un 
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y 
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el 
numero de páginas
 */
package Servicios;

import Entidades.LibroClass;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class LibroServicio {

    Scanner leer = new Scanner(System.in);

    public LibroClass crearLibro() {
        
       LibroClass Lnuevo = new LibroClass();
       
       
       
        Lnuevo.setISBN(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ISBN del Libro:")));
        Lnuevo.setTitulo(JOptionPane.showInputDialog("Ingrese nombre del libro"));
        Lnuevo.setAutor(JOptionPane.showInputDialog("Ingrese nombre del autor"));
        Lnuevo.setPaginas(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de páginas:")));
        
      
        
        return Lnuevo;

     
    }

    public void mostrarLibro(LibroClass Lshow) {
        
        System.out.println(Lshow.toString());     

}
}