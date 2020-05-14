/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia2.EntidadControl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author chiri
 */
public class IntegerSrv {
    
    private ArrayList<Integer> listaInteger= new ArrayList();
    
    public ArrayList<Integer> getListaInteger( ){
    return this.listaInteger;
    }
    
    public void setListaInteger(ArrayList<Integer> listaInteger ){
    this.listaInteger = listaInteger;
    
    }
     
    private void guardarInteger(Integer a){
    listaInteger.add(a);
    } 
    public void eliminarInteger(Integer a){
    listaInteger.remove(a);
    }
    public ArrayList<Integer> leerInteger(){
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese valores sale con -99");
        Integer a;
        do {            
            a = leer.nextInt();
            guardarInteger(a);
        } while (a!=-99);
        eliminarInteger(a);
    return this.listaInteger;
    }
    
    public Integer calcularSuma(ArrayList<Integer> listaInteger){
    Integer sum=0;
        for (Integer integer : listaInteger) {
            sum=sum+integer;
        }
    return sum;
    }
    
    public Integer calcularMedia(ArrayList<Integer> listaInteger){
    
    Integer a = calcularSuma(listaInteger)/listaInteger.size();
    return a;
    }
    
    public void mostrarResultads(ArrayList<Integer> listaInteger, Integer suma, Integer media){
    
        for (Integer integer : listaInteger) {
            System.out.print(integer+", ");
        }
        System.out.println("");
        
        System.out.println("la suma de tods ls numeros es "+ suma);
        System.out.println("La media de todos los numeros es "+ media);
        System.out.println("los numeros que superan la media son");
        
        for (Integer integer : listaInteger) {
            if (integer>media) {
                System.out.print(integer+", ");
            }
        }
        System.out.println("");
    }
    
    public Integer sumait(Iterator<Integer> i){
     Integer a = 0;  
     
        while (i.hasNext()) {
            Integer next = i.next();
            a= a+next;
        }
     return a;
    }
        
        
        
 
    
}
