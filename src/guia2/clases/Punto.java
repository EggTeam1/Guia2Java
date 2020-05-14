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
public class Punto {
    
    private double x;
    private double y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
     public Punto() {
        this.x = 0;
        this.y = 0;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    public double distanciaPunto(Punto punto){
    double a;
    
    a= Math.sqrt(Math.abs(this.x-punto.getX())+Math.abs(this.y-punto.getY()));
       
    return a;
    } 
}