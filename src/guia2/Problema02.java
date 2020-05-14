/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia2;

import guia2.clases.Libro;
import java.util.Scanner;

/**
 *
 * @author chiri
 */
public class Problema02 {
       public static void main(String[] args) {
        // TODO code application logic here
       
      Libro libro = new Libro();
       Scanner leer = new Scanner(System.in);
           System.out.println("¿Cual es el ISBN del libro?");
           libro.setIsbn(leer.nextInt());
           System.out.println("Cual es el nombre del autor");
           libro.setAutor(leer.nextLine());
           System.out.println("Cual es nombre del libro");
           libro.setTitulo(leer.nextLine());
           System.out.println("Cuantas paginas tiene el libro");
           libro.setNumeroPaginas(leer.nextInt());
           
           
      System.out.println(" el libro que cargo es "+ libro.datosLibro());
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       }
    
}
