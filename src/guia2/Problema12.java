/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia2;

import guia2.EntidadControl.LetraServ;
import guia2.clases.Letra;
import java.util.Scanner;

/**
 *
 * @author chiri
 */
public class Problema12 {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        Letra l1 = new Letra();
        LetraServ lS = new LetraServ();
        
        System.out.println("Ingrese un dni");
        l1=lS.crearNis(leer.nextLong());
        System.out.println(lS.mostrarNif(l1));
        
    }
    
}
