/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia2.clases;

/**
 *
 * @author chiri
 */
public class Cafetera {
    private int capacidadMaxima;
    private int capacidadActual;

    public Cafetera() {
        this.capacidadMaxima = 1000;
        this.capacidadActual = 0;
    }

    public Cafetera(int capacidadMaxima) {
        this.capacidadMaxima =  capacidadMaxima;
        this.capacidadActual = capacidadMaxima;
    }

    public Cafetera(int capacidadMaxima, int capacidadActual) {
        
        if (capacidadActual>capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
        this.capacidadActual = capacidadMaxima;
            
        }else{
        this.capacidadMaxima = capacidadMaxima;
        this.capacidadActual = capacidadActual;
    }
}

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCapacidadActual() {
        return capacidadActual;
    }

    public void setCapacidadActual(int capacidadActual) {
        
         if (capacidadActual>this.capacidadMaxima) {
        
        this.capacidadActual = this.capacidadMaxima;
            
        }else{
        
        this.capacidadActual = capacidadActual;
    
    }
    }

    @Override
    public String toString() {
        return "Cafetera{" + "capacidadMaxima=" + capacidadMaxima + ", capacidadActual=" + capacidadActual + '}';
    }
    
   
    
    
    
}
