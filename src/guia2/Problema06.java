/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia2;

import guia2.clases.Cancion;
import java.util.Scanner;

/**
 *
 * @author chiri
 */
public class Problema06 {
         public static void main(String[] args) {
             
             System.out.println("Escriba el nombre de la cancion");
             Scanner leer = new Scanner(System.in);
             Cancion c1 = new Cancion();
             
             c1.setTitulo(leer.nextLine());
             System.out.println("Escriba el nmbre del autor");
             c1.setAutor(leer.nextLine());
             
             
             System.out.println("la cancion que ingreso fue -"+c1.getTitulo()+ "- y su autor es: "+c1.getAutor());
             
                     
             
         }
    
}
