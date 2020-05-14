/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia2;

import guia2.EntidadControl.PersonaSrv;
import guia2.clases.Persona;

/**
 *
 * @author chiri
 */
public class Problema19 {
        public static void main(String[] args) {
            Persona p1=new Persona();
            Persona p2= new Persona();
    
            
            p1=PersonaSrv.crear();
            p2=PersonaSrv.crear();
            System.out.println("la edad de "+p1.getNombre()+" es "+PersonaSrv.edad(p1));
            System.out.println("la edad de "+p2.getNombre()+" es "+PersonaSrv.edad(p2));
            System.out.println(p1.toString());
            System.out.println(p2.toString());
            System.out.println("la persona 1 es menor que la persona 2"+p1.menorque(p2));
                    
        }
    
}
