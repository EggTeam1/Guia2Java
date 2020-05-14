/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia2.EntidadControl;

import guia2.clases.Articulo;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author chiri
 */
public class ArticuloSrv {
    HashMap<String, Articulo> listaArticulo = new HashMap();

    public ArticuloSrv() {
    }

    public HashMap<String, Articulo> getListaArticulo() {
        return listaArticulo;
    }

    public void setListaArticulo(HashMap<String, Articulo> listaArticulo) {
        this.listaArticulo = listaArticulo;
    }
    public void guardarArt(Articulo a1){
    
    listaArticulo.put(a1.getNombre(), a1);
    }
    public void nuevoArticulo(String nombre, double precio){
    Articulo a1 = new Articulo();
    a1.setNombre(nombre);
    a1.setPrecio(precio);
    guardarArt(a1);
    }
    public void mostrarArt(){
            System.out.println("Lista Completa de articulos");
        for (Articulo value : listaArticulo.values()) {
            System.out.println(value.toString());
        }
    }
    
    public void nuevoArticulo(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Escriba el nombre del articulo");
        Articulo a1 = new Articulo();
        
        a1.setNombre(leer.next());
        System.out.println("escriba el precio del articulo");
        a1.setPrecio(leer.nextDouble());
        guardarArt(a1);
    }
    public void modificaprecio(String nombre, double precio){
    Articulo a1 = new Articulo();
    a1= listaArticulo.get(nombre);
    a1.setPrecio(precio);
    guardarArt(a1);
    }
    public void eliminarprod(String nombre){
    listaArticulo.remove(nombre);
    }
    
}
