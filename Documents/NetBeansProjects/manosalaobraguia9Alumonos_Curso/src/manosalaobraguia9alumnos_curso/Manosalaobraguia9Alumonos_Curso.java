/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manosalaobraguia9alumnos_curso;

import Entidades.Alumno;
import Entidades.Curso;

import java.util.ArrayList;



/**
 *
 * @author Admin
 */
public class Manosalaobraguia9Alumonos_Curso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Alumno alumno1 = new Alumno();
        Alumno alumno2 = new Alumno();
        Alumno alumno3 = new Alumno();
        Alumno alumno4 = new Alumno();

        alumno1.setNombre("Guillermo");
        alumno1.setApellido("Fredes");
        alumno2.setNombre("Valeria");
        alumno2.setApellido("Cañizare");
        alumno3.setNombre("Facundo");
        alumno3.setApellido("Fredes");
        alumno4.setNombre("Leonel");
        alumno4.setApellido("Fredes");

        ArrayList<Alumno> alumnos = new ArrayList();

        alumnos.add(alumno1);
        alumnos.add(alumno2);
        alumnos.add(alumno3);
        alumnos.add(alumno4);

        Curso curso = new Curso();
        curso.setAño(3);
        curso.setDivision("A");

        curso.setAlumnos(alumnos);

        Curso curso2 = new Curso();
        curso2.setAño(4);
        curso2.setDivision("B");

        curso.setAlumnos(alumnos);
        curso2.setAlumnos(alumnos);

        System.out.println(curso.toString());
        System.out.println(curso2.toString());

    }
}
