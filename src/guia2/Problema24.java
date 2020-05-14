/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia2;

import guia2.EntidadControl.LibrosSrv;
import java.util.Scanner;

/**
 *
 * @author chiri
 */
public class Problema24 {
         public static void main(String[] args) {
             
             LibrosSrv sr = new LibrosSrv();
             
             sr.nuevoLibro("SULTAN", "PEPE", 5, 4);
             sr.nuevoLibro("CIEN AÑOS DE SOLEDAD", "GARCIA MARQUEZ", 10, 10);
             sr.nuevoLibro("PLATERO Y YO", "jUAN RAMS GUIMENEZ", 10, 0);
             sr.nuevoLibro("PESTE", "KAMUS", 10, 3);
             Scanner leer = new Scanner(System.in).useDelimiter("\n");
             int a;
             do {      
                 System.out.println("1 - Muestra los libros\n" +
                                    "2 – Agrega un libro\n" +
                                    "3- Devuelve un libro\n" +
                                    "4- Saca un libro\n" +
                                    "5 – Salir");
                a = leer.nextInt();
                 switch (a){
                         
                     case 1:
                         sr.mostrarlibros();
                         break;
                     case 2:
                         System.out.println("Cual es el nombre del libro");
                         String n = leer.next();
                         System.out.println("Cual es el autor del libro");
                         String m=leer.next();
                         System.out.println("Cuantas libros hay");
                         int b = leer.nextInt();
                         sr.nuevoLibro(n, m, a, 0);
                         break;
                     case 3:
                         System.out.println("Que libro va devolver");
                         String devuelve = leer.next();
                         System.out.println("estado del libro devuelto "+sr.devolucion(devuelve));
                         break;
                     case 4:
                          System.out.println("Que libro va retirar");
                         String retira = leer.next();
                         System.out.println("estado del libro retirado "+sr.prestamo(retira));
                         break;
                     default:
                         break;
                 
                 
                 
                 }
                 
             } while (a!=5);
                 
             
             
         }
    
}
