/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia2;

import guia2.EntidadControl.CantanteFSrv;
import java.util.Scanner;

/**
 *
 * @author chiri
 */
public class Problema22 {
     public static void main(String[] args) {
         Scanner leer = new Scanner(System.in).useDelimiter("\n");
         CantanteFSrv srv = new CantanteFSrv();
         int a;
         srv.agregarcantante("la mona", "moneria");
         srv.agregarcantante("sting", "star");
         srv.agregarcantante("trulala", "moneda");
         srv.agregarcantante("bretni", "shut");
         srv.agregarcantante("colibritani", "la teta");
         srv.mostrarCantantes();
         srv.aniadirCntantef();
         srv.mostrarCantantes();
         
         do { 
             srv.aniadirCntantef();
             System.out.println("desea agregar mas cantantes 1= si ");
             a=leer.nextInt();
                 
         } while (a==1);
         System.out.println("La lista total quedo");
         srv.mostrarCantantes();
     }
     }
    
