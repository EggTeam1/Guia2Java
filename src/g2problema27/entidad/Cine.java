/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
//Cine (solo de una sala) que tiene un conjunto de asientos (8 filas por 9 columnas). 
//Del cine nos interesa conocer la película que se está reproduciendo y el precio de la entrada.
 */
package g2problema27.entidad;

import java.util.List;

/**
 *
 * @author chiri
 */
public class Cine {
    private Pelicula cartelera;
    private double precio;
    private List<Expectador> clientes;

    public Cine(Pelicula cartelera, double precio) {
        this.cartelera = cartelera;
        this.precio = precio;
    }

    public Cine() {
    }

   

    public Pelicula getCartelera() {
        return cartelera;
    }

    public void setCartelera(Pelicula cartelera) {
        this.cartelera = cartelera;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
}
