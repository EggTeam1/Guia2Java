/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia2;

import guia2.clases.AlumnoEgg;
import guia2.clases.Simulador;
import java.util.Iterator;

/**
 *
 * @author chiri
 */
public class Problema26 {
    
    
      public static void main(String[] args) {
          
        
          Simulador simul = new Simulador();
          simul.guardarApellido("Chirino");simul.guardarApellido("Perez");simul.guardarApellido("Diaz");simul.guardarApellido("Rodriguez");simul.guardarApellido("Estebez");
          simul.guardarApellido("Dionisio");simul.guardarApellido("Injuk");simul.guardarApellido("Paezz");simul.guardarApellido("Beyon");simul.guardarApellido("Lara");
          simul.guardarApellido("Aguj");simul.guardarApellido("Gutierrez");simul.guardarApellido("Bollati");simul.guardarApellido("kiuh");simul.guardarApellido("Perle");
          simul.guardarApellido("Asel");simul.guardarApellido("Domark");simul.guardarApellido("Lapuk");simul.guardarApellido("Piparo");simul.guardarApellido("Laras");
          simul.guardarNombre("Emiliano");simul.guardarNombre("Andres");simul.guardarNombre("Luis");simul.guardarNombre("Adrian");simul.guardarNombre("Pepe");
          simul.guardarNombre("Estefan");simul.guardarNombre("Laura");simul.guardarNombre("Andrea");simul.guardarNombre("Vivian");simul.guardarNombre("Juñia");
          simul.guardarNombre("Jolse");simul.guardarNombre("Jose");simul.guardarNombre("Nestor");simul.guardarNombre("Andres");simul.guardarNombre("Rauk");
          simul.guardarNombre("Raul");simul.guardarNombre("Fabricio");simul.guardarNombre("Jonatan");simul.guardarNombre("Jeni");simul.guardarNombre("Brayan");
          simul.mezclaLista();
          System.out.println("");
          System.out.println("Los alumnos son ");
          System.out.println("");
          simul.mostraregg();
          simul.simulavot();
          System.out.println("Los alumnos al votrar ");
          System.out.println("");
          simul.mostraregg();
          System.out.println("");
          System.out.println("Los facilitadores son");
          System.out.println("");
          simul.facilitadores();
      }
    
}
