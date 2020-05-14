/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia2;

import guia2.clases.Punto;
import java.util.Scanner;

/**
 *
 * @author chiri
 */
public class Problema04 {
    public static void main(String[] args) {
        
        Punto p1 = new Punto();
        
        Punto p2 = new Punto();
        Scanner leer = new Scanner(System.in);        
        System.out.println("Ingrese el primer punto cordenado x y despues y");
        p1.setX(leer.nextDouble());
        p1.setY(leer.nextDouble());
        
        System.out.println("Ingrese el segundo punto coordenado x y despues y");
        p2.setX(leer.nextDouble());
        p2.setY(leer.nextDouble());
        
        
        System.out.println("la distancia entre puntos es "+p1.distanciaPunto(p2));
        
    }
    
    
    
}
