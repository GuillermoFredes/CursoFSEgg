/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.servicios;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import libreria.entidades.Autor;
import libreria.entidades.Editorial;
import libreria.entidades.Libro;

/**
 *
 * @author Admin
 */
public class libroServicio {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("Guia14-ej1PU");
    EntityManager em = emf.createEntityManager();

    public Libro crearLibro(Autor autor, Editorial editorial) {
                
        Libro libro1 = new Libro();
        libro1.setNombre("libropepe");
        libro1.setAlta(Boolean.TRUE);
        libro1.setAnio(Integer.SIZE);
        libro1.setAutor(autor);
        libro1.setEditorial(editorial);
        libro1.setEjemplares(Integer.BYTES);
        libro1.setEjemplaresPrestadosInteger(Integer.MAX_VALUE);
        libro1.setEjemplaresRestantes(Integer.MAX_VALUE);
        libro1.setIsbn(Long.MIN_VALUE);
      
        
        
        em.getTransaction().begin();
        em.persist(libro1);
        em.getTransaction().commit();
        
        return libro1;

    }

}
