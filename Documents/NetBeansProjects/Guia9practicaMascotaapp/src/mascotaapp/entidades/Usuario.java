/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascotaapp.entidades;

import java.util.Date;
import java.util.List;
import mascotaapp.enumeraciones.SexoHumano;


/**
 *
 * @author Admin
 */
public class Usuario {
    
    private String nombre;
    private String apellido;
    private Integer dni;
    private Date nacimiento;
    private String pais;
    private SexoHumano sexo;
    
    private Mascota mascota;
    
    //private List<Mascota> mascotas;
    
    
    public Usuario(){
    }
           
}
