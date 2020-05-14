/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia2.clases;

/**
 *
 * @author chiri
 */
public class Tiempo {
   private Integer hora;
   private Integer minutos;
   private Integer segundos;

    public Tiempo(Integer hora, Integer minutos, Integer segundos) {
        this.hora = hora;
        this.minutos = minutos;
        this.segundos = segundos;
    }
       public Tiempo() {
        this.hora = 0;
        this.minutos = 0;
        this.segundos = 0;
    }

    public Integer getHora() {
        return hora;
    }

    public void setHora(Integer hora) {
        this.hora = hora;
    }

    public Integer getMinutos() {
        return minutos;
    }

    public void setMinutos(Integer minutos) {
        
        if (minutos<=60) {
            this.minutos = minutos;
        }else{
        
        this.minutos= minutos % 60;
        this.hora= this.hora + (minutos/60);
            
        }
        
    }

    public Integer getSegundos() {
        return segundos;
    }

    public void setSegundos(Integer segundos) {
         if (segundos<=60) {
            this.segundos = segundos;
        }else{
        
        this.segundos= segundos % 60;
        this.minutos= this.minutos + (segundos/60);
    }
              if (this.minutos>=60) {
                  this.hora= this.hora + (minutos/60);
                  this.minutos= this.minutos % 60;
        
            
        }

    }
    public String mstrarHoraCompleta() {
        return  hora + ":" + minutos + ":" + segundos + '}';
    }

    
    
    
    
    
   
   
   
    
}
