/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia2.clases;

import static guia2.clases.AlumnoEgg.ComparatorNotaMay;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author chiri
 */
public class Simulador {
    
    ArrayList<String> listaNombre = new ArrayList();
    HashSet<String> listaApellido = new HashSet();
    HashMap<Integer,AlumnoEgg> listaegg = new HashMap();
    

    public ArrayList<String> getListaNombre() {
        return listaNombre;
    }

    public void setListaNombre(ArrayList<String> listaNombre) {
        this.listaNombre = listaNombre;
    }
    
    public HashSet<String> getListaApellido() {
        return listaApellido;
    }

    public void setListaApellido(HashSet<String> listaApellido) {
        this.listaApellido = listaApellido;
    }

    public HashMap<Integer, AlumnoEgg> getListaegg() {
        return listaegg;
    }

    public void setListaegg(HashMap<Integer, AlumnoEgg> listaegg) {
        this.listaegg = listaegg;
    }
    
    
    
    public void guardarNombre(String nombre){
    
    listaNombre.add(nombre);
    }
    public void guardarApellido(String Apellido){
    
    listaApellido.add(Apellido);
    }
    
    public void mezclaLista(){
    AlumnoEgg ag = new AlumnoEgg();
    Integer dni, n=0;
    Iterator<String> lista = listaApellido.iterator();
    
        while (lista.hasNext()) {
            String next = lista.next();
            dni =(int)(Math.random()*40000000 + 20000000);
            ag.setDni(dni);
            ag.setApellido(next);
            guardaregg(dni,next,listaNombre.get(n),n);
            n=n+1;
        }
        
        
        }
    public void guardaregg(Integer dni, String s,String b,int n){
        AlumnoEgg ae = new AlumnoEgg();
        ae.setDni(dni);
        ae.setApellido(s);
        ae.setNombre(b);
        ae.setPosicion(n);
    listaegg.put(ae.getPosicion(),ae);
    
    }
     public void mostraregg(){
     
         for (AlumnoEgg alumno : listaegg.values()) {
             System.out.println(alumno.getPosicion()+" "+alumno.getApellido()+", "+alumno.getNombre()+" dni:"+alumno.getDni()+", Vtos "+alumno.getVotos());
         }
             
         }
     public void mostrarApellido(){
         for (String string : listaApellido) {
             System.out.println(string);
         }
     }
     public void simulavot(){
     AlumnoEgg eg = new AlumnoEgg();
     int a,b,c;
         for (AlumnoEgg j : listaegg.values()) {
                 do {             
                 a=(int)(Math.random()*listaegg.size());
                 b=(int)(Math.random()*listaegg.size());
                 c=(int)(Math.random()*listaegg.size());
                 } while (a==b || b==c || c==a || j.getPosicion()==a || j.getPosicion()==b || j.getPosicion()==c);
          eg = listaegg.get(a);
          eg.setVotos(eg.getVotos()+1);
          listaegg.put(a, eg);
           eg = listaegg.get(b);
          eg.setVotos(eg.getVotos()+1);
          listaegg.put(b, eg);
           eg = listaegg.get(c);
          eg.setVotos(eg.getVotos()+1);
          listaegg.put(c, eg);
         }
     }
     public void facilitadores(){
         int n= 0;
         List<AlumnoEgg> valore = new ArrayList<>(listaegg.values()); 
         valore.sort(ComparatorNotaMay);
         for (AlumnoEgg j: valore) {
             if (n<5) {
                 System.out.println("Facilitador n° "+(n+1)+ " es "+j.getApellido()+", "+j.getNombre()+ " con "+ j.getVotos() +" votos" );
                 
             } else {
                 if (n<10) {
                     System.out.println("Suplente n° "+(n+1)+ " es "+j.getApellido()+", "+j.getNombre()+ " con "+ j.getVotos() +" votos" );
                 }
             }
         n=n+1;
             
         }
     
     }
 
     }
       
        
    
    
    
    
    

