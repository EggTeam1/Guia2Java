/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia2.EntidadControl;

import guia2.clases.Ahorcado;

/**
 *
 * @author chiri
 */
public class AhorcadoServ {
    public Ahorcado empiezaJuego(String palabra,int intentos){

          Ahorcado a1 = new Ahorcado(palabra, intentos);
        
        return a1;
}
    public int longPalabra(Ahorcado a1){
    
    int a = a1.getCantidadLetras();
    return a;
    }
    
    public boolean buscaLetra(Ahorcado a1, String b){
    boolean v=false;
        Ahorcado as = new Ahorcado();
        if (b.length()==a1.getCantidadLetras()) {
            v=true;
              for (int i = 0; i < a1.getCantidadLetras(); i++) {
                    if (!b.substring(i, i+1).equals(a1.getPalabra(i))){
                    v=false;
                    a1.setIntentoAc(a1.getIntentos());
                    }else{
                    a1.setPalabraJ(b.substring(i, i+1), i);
                     }
                }
              if (v) {
                a1.setAciertos(a1.getCantidadLetras());
              }
            
        } else {
              for (int i = 0; i < a1.getCantidadLetras(); i++) {
            if (b.equals(a1.getPalabra(i))){
            v=true;
            a1.setPalabraJ(b, i);
            a1.setAciertos(a1.getAciertos()+1);
            }
        }
        a1.setIntentoAc(a1.getIntentoAc()+1);
        return v;
            
        }
      return v;
      }
    
    public int intentosQuedan(Ahorcado a1){
    
     int a = a1.getIntentos()-a1.getIntentoAc();
    return a;
    }
    public boolean gano(Ahorcado a1){
    boolean v=false;
    
        if (a1.getAciertos()==a1.getCantidadLetras()) {
            v=true;
        }
    return v;
    }
    public void resultado(Ahorcado a1){
    
        for (int i = 0; i < a1.getCantidadLetras(); i++) {
            
            System.out.print(a1.getPalabraJ(i));
        }
        System.out.println("");
    }
}
