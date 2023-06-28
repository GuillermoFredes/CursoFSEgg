package jp.apr.pkg12;

import entidades.Persona;
import servicios.PersonaService;

/**
 *
 * @author Camila Astrada 
 */
public class JpApr12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
          PersonaService ser = new PersonaService();
      
        Persona p = ser.crearP();
       
    ser.calcularEdad(p); 
    ser.menorQue(p.getEdad());
    ser.mostrarP(p);
    
      
            
    }

}
