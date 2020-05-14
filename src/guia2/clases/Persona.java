/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia2.clases;

import java.util.Calendar;

/**
 *
 * @author chiri
 */
public class Persona {
    
    private String nombre;
    private Calendar fechaNac;

    public Persona(String nombre, Calendar fechaNac) {
        this.nombre = nombre;
        this.fechaNac = fechaNac;
    }
    public Persona() {
        
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Calendar getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Calendar fechaNac) {
        this.fechaNac = fechaNac;
    }
    
      public boolean menorque(Persona p1){
    boolean v;
        if (p1.getFechaNac().getTimeInMillis() > this.fechaNac.getTimeInMillis()) {
            
            v=false;    
            } else {
            v=true;
            }
        
    return v;
      }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", fechaNac=" + fechaNac.getTime() + '}';
    }
    
    }

