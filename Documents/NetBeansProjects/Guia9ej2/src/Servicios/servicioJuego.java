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
package Servicios;

import Entidades.Juego;
import Entidades.Jugador;
import Entidades.revolverdeAgua;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class servicioJuego {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Juego Juego1 = new Juego();
    
    public Juego cantidadJugadores(ArrayList<Jugador> jugadores) {
        
        int cantJugadores;
        int contJugadores = 1;
        String nombre;
        
        System.out.println("Ingrese la cantidad de jugadores, entre 2 y 7");
        
        cantJugadores = leer.nextInt();
        
        if (cantJugadores < 1 || cantJugadores > 6) {
            cantJugadores = 6;
        }
        
        for (int i = 0; i < cantJugadores; i++) {
            
            Jugador P1 = new Jugador();
            P1.setId(contJugadores++);
            System.out.println("Ingrese nombre para " + P1.getId());
            nombre = leer.next();
            P1.setNombre(nombre);
            jugadores.add(P1);
            
        }
        
        System.out.println("La cantidad de jugadores fue definida en: " + jugadores.size());
        Juego1.setJugadores(jugadores);
        
        for (Jugador aux : jugadores) {
            System.out.println(aux);
        }
        
        return null;
        
    }

//llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores
//y el revolver para guardarlos en los atributos del juego.
    public void ronda(ArrayList<Jugador> jugadores, revolverdeAgua revolver, revolverdeaguaServicio revolverSRV) {
        
        do {
            
            for (Jugador aux : jugadores) {
                System.out.println(revolver.toString());
                System.out.println("El " + aux + "dispara el revolver");
                
                if (revolverSRV.mojar(revolver) == false) {
                    
                    System.out.println("El" + aux + "no se mojó");
                    revolverSRV.siguienteChorro(revolver);
                    
                } else if (revolverSRV.mojar(revolver) == true) {
                    
                    System.out.println("El" + aux + "se  mojó");
                    aux.setMojado(true);
                    System.out.println("FIN DEL JUEGO XD");
                    
                }
                
            }
        } while (revolverSRV.mojar(revolver) == false);
        
    }
    
     public Juego iniciarRevolverDeAgua(revolverdeAgua revolver) {
        
         
     
        return Juego1;
    
    public revolverdeAgua llenarJuego(ArrayList<Jugador> jugadores, revolverdeAgua revolver) {
        
        cantidadJugadores(jugadores);
        
        
        
        return null;
         
             
        
    }
    
}
