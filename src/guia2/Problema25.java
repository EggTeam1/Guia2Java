/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia2;

import guia2.EntidadControl.ArticuloSrv;
import java.util.Scanner;

/**
 *
 * @author chiri
 */
public class Problema25 {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArticuloSrv sr = new ArticuloSrv();
        sr.nuevoArticulo("GOMA", 1.5);
        sr.nuevoArticulo("TORNILLOS", 0.5);
        sr.nuevoArticulo("JUNTA", 3.7);
        sr.nuevoArticulo("PERCHAS", 3);
        sr.nuevoArticulo("ESCOBA", 25);
        sr.nuevoArticulo("BALDE", 150);
        sr.nuevoArticulo("AEROSOL", 250.5);
        sr.nuevoArticulo("PASTA", 280);
        
        int a;
             do {      
                 System.out.println("1- Muestra los Articulos\n" +
                                    "2– Agregar artciulo\n" +
                                    "3- Cambiar el precio de un articulo\n" +
                                    "4- Eliminar un articulo\n" +
                                    "5– Salir");
                a = leer.nextInt();
                 switch (a){
                         
                     case 1:
                         sr.mostrarArt();
                         break;
                     case 2:
                         System.out.println("Cual es el nombre del articulo");
                         String n = leer.next().toUpperCase();
                         System.out.println("Cual es el precio del articulo");
                         double b = leer.nextInt();
                         sr.nuevoArticulo(n, b);
                         break;
                     case 3:
                         System.out.println("que articulo desea cambiar el precio?");
                         String devuelve = leer.next().toUpperCase();
                         System.out.println("cual es el nuevo precio?");
                         double precio = leer.nextDouble();
                         sr.modificaprecio(devuelve, precio);
                         break;
                     case 4:
                          System.out.println("Que producto va eliminar");
                         String retira = leer.next().toUpperCase();
                         sr.eliminarprod(retira);
                         break;
                     default:
                         break;
                 
                 
                 
                 }
                 
             } while (a!=5);
        
        
    }
    
}
