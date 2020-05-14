/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia2;

import guia2.EntidadControl.IntegerSrv;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author chiri
 */
public class Problema21 {
      public static void main(String[] args) {
          
         IntegerSrv sr = new IntegerSrv();
         ArrayList<Integer> lInt = new ArrayList();
        lInt= sr.leerInteger();
        Integer a = sr.calcularSuma(lInt);
        Integer b = sr.calcularMedia(lInt);
        sr.mostrarResultads(lInt,a,b);
         
        Iterator<Integer> suma = lInt.iterator();
         System.out.println("suma iteradora es "+sr.sumait(suma));
      }
    
}
