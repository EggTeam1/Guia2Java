/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia2;

import guia2.EntidadControl.PalabraSrv;
import guia2.EntidadControl.PalabraSrvb;
import java.util.Scanner;

/**
 *
 * @author chiri
 */
public class Problema20b {
         public static void main(String[] args) {
         
         Scanner leer = new Scanner(System.in).useDelimiter("\n");
         
         PalabraSrvb sv = new PalabraSrvb();
         int n=0;
         do {             
             sv.crearPalabra();
             n=n+1;
         } while (n!=4);
         
         sv.mostrarArray();
         System.out.print("Odenada");
         sv.mostrarArray();
         System.out.println("palabra con que cantidad de letras quiere mostrar");
         sv.palabrasLong(leer.nextInt());
         
     }
    
}