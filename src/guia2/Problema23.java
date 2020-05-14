/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia2;

import guia2.EntidadControl.AlumnoSrv;

/**
 *
 * @author chiri
 */
public class Problema23 {
     public static void main(String[] args) {
         
         AlumnoSrv sr = new AlumnoSrv();
         
         //sr.cargarAlumanos();
         sr.argarAlumno("EMILIANO", "CHIRINO", 456, "M", "REGULAR", 90);
         sr.argarAlumno("ARIEL", "DIAZ", 45, "M", "REGULAR", 80);
         sr.argarAlumno("PEPE", "ALBERTOSE", 20, "M", "CONDICIONAL", 15);
         sr.argarAlumno("JUAN", "MINUJUN", 700, "M", "CONDICIONAL", 10);
         sr.mostrarAlumnos();
         System.out.println("");
         System.out.println("Las notas de mayor a menor son");
         sr.ordenarNotaMay();
         System.out.println("");
         System.out.println("Los ntas de menor a mayor son ");
         sr.ordenarNotaMen();
         System.out.println("");
                 
         System.out.println("Los nombres de mayor a menor son");
         sr.ordenarNombreApe();
         System.out.println("");
         System.out.println("Los alumnos condicionales son ");
         sr.mostrarAlumCondicionales();
     }
    
}
