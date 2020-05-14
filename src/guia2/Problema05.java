/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia2;

import guia2.clases.Tiempo;
import java.util.Scanner;

/**
 *
 * @author chiri
 */
public class Problema05 {
     public static void main(String[] args) {
         
         Tiempo t1 = new Tiempo();
         Scanner leer = new Scanner(System.in);
         
         
         System.out.println("Ingrese las horas");
         
         t1.setHora(leer.nextInt());
         
         System.out.println("Ingrese los minutos");
         
         t1.setMinutos(leer.nextInt());
         
         System.out.println("Ingrese los segundos");
         
         t1.setSegundos(leer.nextInt());
         
         
         System.out.println("La hora ingresada es "+t1.mstrarHoraCompleta());
         
         
         
         
         
     }
    
}
