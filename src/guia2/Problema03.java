/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia2;

import guia2.clases.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author chiri
 */
public class Problema03 {
       public static void main(String[] args) {
           
           
           System.out.println("Escriba el radio de la circunferencia");
           Scanner leer = new Scanner(System.in);
           
           Circunferencia c1 = new Circunferencia();
           
           c1.setRadio(leer.nextDouble());
           
           System.out.println("el area del circulo es "+c1.areaCirculo());
           System.out.println("El perimetro del circulo es "+c1.perimCirculo());
           
           
           
           
       }
    
    
    
    
    
    
}
