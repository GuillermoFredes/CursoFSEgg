/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
if (!em.contains(stock)) {
    stock = em.merge(stock);
}
 */
package libreria;

import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import libreria.entidades.Autor;
//import static libreria.entidades.Autor_.libro;
import libreria.entidades.Editorial;
//import libreria.entidades.Libro;
import libreria.servicios.autorServicio;
import libreria.servicios.editorialServicio;
import libreria.servicios.libroServicio;

/**
 *
 * @author Admin
 */
public class Guia14Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Guia14-ej1PU");
        EntityManager em = emf.createEntityManager();

        editorialServicio es = new editorialServicio();
        System.out.println("Ingrese una editorial");
        String nedit = leer.nextLine();
        
        Editorial editorial = es.crearEditorial(nedit);

        autorServicio as = new autorServicio();
        System.out.println("Ingrese un autor");
        String nautor = leer.nextLine();
        
        Autor autor = as.crearAutor(nautor);
        
        
        libroServicio ls = new libroServicio();
        System.out.println("Ingrese titulo Libro");
        String nlibro = leer.nextLine();
        
        ls.crearLibro(autor, editorial);
        
    }

}
