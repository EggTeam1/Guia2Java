/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia2.EntidadControl;

import guia2.clases.Cafetera;

/**
 *
 * @author chiri
 */
public class CafeServ {
    
    
    public void llenarCafetera(Cafetera c1){
    
      c1.setCapacidadActual(c1.getCapacidadMaxima());
    }
    
    public Cafetera llenarTaza(Cafetera c1 , int cantidad){
    
    if(c1.getCapacidadActual()< cantidad ){
       c1.setCapacidadActual(0);
    }else{
    c1.setCapacidadActual(c1.getCapacidadActual()-cantidad);
    }
    return c1;
    }
    public Cafetera vaciarCafetera(Cafetera c1){
    
    c1.setCapacidadActual(0);
    
    return c1;
    
    }
    public Cafetera llenarCafetera(Cafetera c1,int cantidad){
    
        if (c1.getCapacidadMaxima()<c1.getCapacidadActual()+cantidad){
            c1.setCapacidadActual(c1.getCapacidadMaxima());
    } else{
        c1.setCapacidadActual(cantidad+c1.getCapacidadActual());
}
    return c1;
    }
    
}
