/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia2;

import guia2.EntidadControl.CafeServ;
import guia2.clases.Cafetera;
import java.util.Scanner;

/**
 *
 * @author chiri
 */
public class Problema11 {
     public static void main(String[] args) {
         
         int a;
         Scanner leer = new Scanner(System.in);
         System.out.println("se crea la cafetera");
         CafeServ cF = new CafeServ();
         
         Cafetera c1 = new Cafetera();
         System.out.println(c1.toString());
         System.out.println("Ahora se llenara la cafetera con 50 cm");
         cF.llenarCafetera(c1, 500);
          System.out.println(c1.toString());
         System.out.println("cuanto quiere servir");
         
         a=leer.nextInt();
         c1=cF.llenarTaza(c1, a);
         System.out.println("luego de servir asi esta la cafetera quiere llerla con cuanto??");
         System.out.println(c1.toString());
         a=leer.nextInt();
         cF.llenarCafetera(c1, a);
         System.out.println(c1.toString());
         
         System.out.println("se llenara por completo la cafetera");
         cF.llenarCafetera(c1);
         System.out.println(c1.toString());
     }
    
}
