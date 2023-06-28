

package entidades;

import java.util.Date;


 // @author Camila Astrada 
 
public class Persona {
private Date nacimiento; 
private String nombre;
private long edad; 
    public Persona() {
    }

    public Persona(Date nacimiento, String nombre) {
        this.nacimiento = nacimiento;
        this.nombre = nombre;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getEdad() {
        return edad;
    }

    public void setEdad(long edad) {
        this.edad = edad;
    }




}
