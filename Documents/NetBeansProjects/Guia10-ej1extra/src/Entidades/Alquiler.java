/*
 1. En un puerto se alquilan amarres para barcos de distinto tipo. Para cada Alquiler se guarda: el 
nombre, documento del cliente, la fecha de alquiler, fecha de devolución, la posición del 
amarre y el barco que lo ocupará.
Un Barco se caracteriza por: su matrícula, su eslora en metros y año de fabricación.
Sin embargo, se pretende diferenciar la información de algunos tipos de barcos especiales:
• Número de mástiles para veleros.
• Potencia en CV para barcos a motor.
• Potencia en CV y número de camarotes para yates de lujo.
Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de 
alquiler y devolución), por un valor módulo de cada barco (obtenido simplemente 
multiplicando por 10 los metros de eslora).
En los barcos de tipo especial el módulo de cada barco se calcula sacando el módulo normal y 
sumándole el atributo particular de cada barco. En los veleros se suma el número de mástiles, 
en los barcos a motor se le suma la potencia en CV y en los yates se suma la potencia en CV y 
el número de camarotes.
Utilizando la herencia de forma apropiada, deberemos programar en Java, las clases y los 
métodos necesarios que permitan al usuario elegir el barco que quiera alquilar y mostrarle el 
precio final de su alquiler
 */
package Entidades;

import java.time.LocalDate;
import static java.time.temporal.ChronoUnit.DAYS;
/**
 *
 * @author Admin
 */
public class Alquiler {
    
    protected String nombre;
    protected int dni;
    protected LocalDate fechaAlq;
    protected LocalDate fechaDev;
    protected int posAmarre;
    protected String tipoBarco;
    protected long difDias;

    public Alquiler() {
    }

    public Alquiler(String nombre, int dni, LocalDate fechaAlq, LocalDate fechaDev, int posAmarre, String tipoBarco, long difDias) {
        this.nombre = nombre;
        this.dni = dni;
        this.fechaAlq = fechaAlq;
        this.fechaDev = fechaDev;
        this.posAmarre = posAmarre;
        this.tipoBarco = tipoBarco;
        this.difDias = difDias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public LocalDate getFechaAlq() {
        return fechaAlq;
    }

    public void setFechaAlq(LocalDate fechaAlq) {
        this.fechaAlq = fechaAlq;
    }

    public LocalDate getFechaDev() {
        return fechaDev;
    }

    public void setFechaDev(LocalDate fechaDev) {
        this.fechaDev = fechaDev;
    }

    public int getPosAmarre() {
        return posAmarre;
    }

    public void setPosAmarre(int posAmarre) {
        this.posAmarre = posAmarre;
    }

    public String getTipoBarco() {
        return tipoBarco;
    }

    public void setTipoBarco(String tipoBarco) {
        this.tipoBarco = tipoBarco;
    }

    public long getDifDias() {
        return difDias;
    }

    public void setDifDias(long difDias) {
        this.difDias = difDias;
    }



    
//    Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de 
//alquiler y devolución), por un valor módulo de cada barco (obtenido simplemente 
//multiplicando por 10 los metros de eslora).
    
    
    public void calculoAlquiler(){

   difDias = DAYS.between(fechaAlq, fechaDev);
           
   
   
   
}
    
    
}
