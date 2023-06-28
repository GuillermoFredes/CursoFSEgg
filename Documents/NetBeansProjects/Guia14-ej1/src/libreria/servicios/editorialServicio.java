/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.servicios;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import libreria.entidades.Editorial;

/**
 *
 * @author Admin
 */
public class editorialServicio {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("Guia14-ej1PU");
    EntityManager em = emf.createEntityManager();

    public Editorial crearEditorial(String nombre) {
        Editorial editorial1 = new Editorial();
        editorial1.setNombre(nombre);
        editorial1.setAlta(Boolean.TRUE);

        em.getTransaction().begin();
        em.persist(editorial1);
        em.getTransaction().commit();

        return editorial1;
    }

}
