/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia2.EntidadControl;

import guia2.clases.Palabra;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


/**
 *
 * @author chiri
 */
public class PalabraSrv {
   private ArrayList<Palabra> listaPalabra = new ArrayList(); 

    public ArrayList<Palabra> getListaPalabra(){
    
    return listaPalabra;
    }
    
    public  void setListaPalabra(ArrayList<Palabra> listaPalabra){
    
    this.listaPalabra = listaPalabra;
    
    }

    private void guradarPalabra(Palabra p1){
    
    listaPalabra.add(p1);
    
    }
  public void palabrasLong( int n){
  
 
       for (Palabra palabra : listaPalabra) {
           
           if (palabra.getPalabra().length()==n) {
               
               System.out.println(palabra.getPalabra());
               
           }
          
      }
  }

public void ordenaArray(){

Collections.sort(listaPalabra);

}
public void mostrarArray(){
    System.out.println("La lista es");
    for (Palabra palabra : listaPalabra) {
        System.out.println(palabra.getPalabra());
    }



}
public void crearPalabra(){
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Palabra p1 = new Palabra();
    System.out.println("Ingrese una palabra");
    p1.setPalabra(leer.nextLine());
    guradarPalabra(p1);

}
}
