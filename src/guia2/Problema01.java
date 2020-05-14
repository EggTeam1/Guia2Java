/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia2;

import guia2.clases.Fraccion;

/**
 *
 * @author chiri
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    Fraccion f1 = new Fraccion(10,20);
 
    Fraccion f3 = new Fraccion();
        System.out.println("Fraccion A");
   
    f1.mostrarFraccion();
   
    
    f3=f1.simplifica(f1.getDenominador());
    
    f3.mostrarFraccion();
    
    }
    
    
}
