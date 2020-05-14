/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
//del espectador, nos interesa saber su nombre, edad y el dinero que tiene disponible.
 * and open the template in the editor.
 */
package g2problema27.entidad;

import java.util.List;

/**
 *
 * @author chiri
 */
public class Expectador {
    private String nombre;
    private int edad;
    private double dinero;
   

    public Expectador(String nombre, int edad, double dinero) {
        this.nombre = nombre;
        this.edad = edad;
        this.dinero = dinero;
    }

    public Expectador() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }
    
}
