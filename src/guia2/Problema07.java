/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia2;

import guia2.clases.Rectangulo;

/**
 *
 * @author chiri
 */
public class Problema07 { 
    public static void main(String[] args) {
    
        Rectangulo c1 = new Rectangulo(10,10);
        
        System.out.println(c1.toString());
        System.out.println("El area es "+c1.superfRectang());
        
        c1=c1.dezplazaRec(5, 3);
        
        System.out.println(c1.toString());
        System.out.println("El area es "+c1.superfRectang());
    
        c1.setBy(14);
    System.out.println(c1.toString());
        System.out.println("El area es "+c1.superfRectang());
}
    
}
