/*
Clase Revolver de agua: esta clase posee los siguientes atributos: posición actual (posición
del tambor que se dispara, puede que esté el agua o no) y posición agua (la posición del
tambor donde se encuentra el agua). Estas dos posiciones, se generarán aleatoriamente.
Métodos:
• llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los valores
deben ser aleatorios.
• mojar(): devuelve true si la posición del agua coincide con la posición actual
• siguienteChorro(): cambia a la siguiente posición del tambor
• toString(): muestra información del revolver (posición actual y donde está el agua)
 */
package Servicios;

import Entidades.revolverdeAgua;

/**
 *
 * @author Admin
 */
public class revolverdeaguaServicio {

    //• llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los valores deben ser aleatorios.
    revolverdeAgua revolver = new revolverdeAgua();

    public revolverdeAgua llenarRevolver(revolverdeAgua revolver1) {

        revolver1.setPosicionActual(1);
        revolver1.setPosicionAgua((int) (Math.random() * (6 - 1 + 1) + 1)); 

        return revolver1;

    }

    //• mojar(): devuelve true si la posición del agua coincide con la posición actual
    public boolean mojar(revolverdeAgua revolver1) {
        boolean coincidencia = false;
        if (revolver1.getPosicionAgua() == revolver1.getPosicionActual()) {

            coincidencia = true;

        }
        return coincidencia;

    }

    //• siguienteChorro(): cambia a la siguiente posición del tambor
    public int siguienteChorro(revolverdeAgua revolver1) {

        if (revolver1.getPosicionActual() == 6) {

            revolver1.setPosicionActual(1);

        } else {

            revolver1.setPosicionActual(revolver1.getPosicionActual() + 1);

        }
        return revolver1.getPosicionActual();

    }

    //toString(): muestra información del revolver (posición actual y donde está el agua)
    public revolverdeAgua infoRevolver(revolverdeAgua revolver1) {

        System.out.println(revolver1);
        return null;

    }

}
