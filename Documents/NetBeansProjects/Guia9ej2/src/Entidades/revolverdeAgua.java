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
package Entidades;

/**
 *
 * @author Admin
 */
public class revolverdeAgua {
    
    private int posicionActual;
    private int posicionAgua;
    
    

    public revolverdeAgua() {
    }

    public revolverdeAgua(int posicioActual, int posicionAgua) {
        this.posicionActual = posicioActual;
        this.posicionAgua = posicionAgua;
    }

    public int getPosicionActual() {
        return posicionActual;
    }

    public int getPosicionAgua() {
        return posicionAgua;
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    public void setPosicionAgua(int posicionAgua) {
        this.posicionAgua = posicionAgua;
    }

    @Override
    public String toString() {
        return "revolverdeAgua{" + "posicioActual=" + posicionActual + ", posicionAgua=" + posicionAgua + '}';
    }
    
    
    
}
