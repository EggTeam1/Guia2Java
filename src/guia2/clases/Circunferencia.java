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
public class Circunferencia {
    private double radio;

    public Circunferencia(double radio) {
        this.radio = radio;
    }
    public Circunferencia() {
        this.radio = 0;
    }


    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    



public double areaCirculo(){

double a;

a= Math.pow(this.radio, 2) * Math.PI;
        
        
return a;
}


public double perimCirculo(){

double a;

a= this.radio * 2 * Math.PI;
        
        
return a;
}



}
