/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g2problema27.servicio;

import g2problema27.entidad.Expectador;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author chiri
 */
public class ExpectadorSrv {
    static private ArrayList<Expectador> expecadores = new ArrayList<Expectador>();
    
    
    
    private void agregar(Expectador e1){
    
    expecadores.add(e1);
    
    }
    public  ArrayList<Expectador> agregarclientes(int n){
      
        if (n<72) {
              for (int i = 0; i < n; i++) {
             Expectador e1 = new Expectador();
             e1.setDinero(Math.random()*5000);
             e1.setEdad((int)(Math.random()*90));
             String z= String.valueOf((int)(Math.random()*200));
             e1.setNombre("pepe "+z);
                  agregar(e1);
          
        }
    
            
        }
      
    
    return this.expecadores;
    }
}
