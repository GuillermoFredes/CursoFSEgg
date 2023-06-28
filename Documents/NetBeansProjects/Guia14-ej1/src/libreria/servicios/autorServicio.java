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

/**
 *
 * @author Admin
 */
public class autorServicio {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("Guia14-ej1PU");
    EntityManager em = emf.createEntityManager();

    public  Autor crearAutor(String nombre) {
        Autor autor1 = new Autor();
        autor1.setNomnbre(nombre);
        autor1.setAlta(Boolean.TRUE);
 
        em.getTransaction().begin();
        em.persist(autor1);
        em.getTransaction().commit();
 
        return  autor1;
    }

}
