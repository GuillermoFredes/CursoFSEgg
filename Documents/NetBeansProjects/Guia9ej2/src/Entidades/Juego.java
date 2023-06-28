/*
 Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto de Jugadores) y
Revolver
Métodos:
• llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores
y el revolver para guardarlos en los atributos del juego.

10
• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
mojar. Al final del juego, se debe mostrar que jugador se mojó.
Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.
 */
package Entidades;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class Juego {
    
    
    private ArrayList jugadores;
    private revolverdeAgua revolver;

    public Juego() {
    }

    public Juego(ArrayList jugadores, revolverdeAgua revolver) {
        this.jugadores = jugadores;
        this.revolver = revolver;
    }

    public ArrayList getJugadores() {
        return jugadores;
    }

    public revolverdeAgua getRevolver() {
        return revolver;
    }

    public void setJugadores(ArrayList jugadores) {
        this.jugadores = jugadores;
    }

    public void setRevolver(revolverdeAgua revolver) {
        this.revolver = revolver;
    }
    
    
    
    
    
    
    
    
}
