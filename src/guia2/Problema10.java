/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia2;

import guia2.EntidadControl.FechaServ;
import guia2.clases.Fecha;
import java.util.Scanner;

/**
 *
 * @author chiri
 */
public class Problema10 {
      public static void main(String[] args) {
          int d,m,a;
          long r;
          Scanner leer = new Scanner(System.in);
          FechaServ sF = new FechaServ();
          Fecha f1 = sF.crearFecha();
          
          r=sF.diasTrans(f1);
          System.out.println(r);
          System.out.println("ingrese el dia mes y año");
          d=leer.nextInt();
          m=leer.nextInt();
          a=leer.nextInt();
          r=sF.diasEntre(f1, d, m, a);
          
          System.out.println("Hay "+r+" dias entre las fechas");
          System.out.println("la siguiente fecha es "+sF.siguiente(f1).toString());
          System.out.println("la anterior fecha es "+sF.anterior(f1).toString());
          
          
      }
}
