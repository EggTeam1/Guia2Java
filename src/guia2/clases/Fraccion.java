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
public class Fraccion {
    private int numerador;
    private int denominador;

    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }
    public Fraccion() {
   
    }
    
   public Fraccion simplifica(int denominador){
   Fraccion f1= new Fraccion(this.numerador,this.denominador);
       if (denominador==1) {
           
           return f1;
       } else {
           
               if ((f1.getNumerador()%denominador == 0) && (f1.getDenominador()%denominador == 0)) {
                   f1.setDenominador(f1.getDenominador()/denominador);
                   f1.setNumerador(f1.getNumerador()/denominador); 
                  f1= f1.simplifica((denominador-1));
               }else{
                f1= f1.simplifica((denominador-1));
               } 
              
           
          return f1;
       }
       
   
   } 
   

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
       
        if (denominador == 0 ) {
            System.out.println("el denominador debe ser distinto a 0 ");
        } else {
            this.denominador = denominador;
        }
        
    }
    public Fraccion sumarFraccion(Fraccion f1 ){
    
        Fraccion fraccion = new Fraccion();
        
     fraccion.setDenominador((f1.getDenominador()*denominador));
     fraccion.setNumerador((f1.getDenominador()*numerador)+(f1.getNumerador()*denominador));
     return fraccion;
     
    }
        public Fraccion multiplicarFraccion(Fraccion f1 ){
    
        Fraccion fraccion = new Fraccion();
        
     fraccion.setDenominador((f1.getDenominador()*denominador));
     fraccion.setNumerador((numerador)*(f1.getNumerador()));
     return fraccion;
     
    }
        public Fraccion dividirFraccion(Fraccion f1 ){
    
        Fraccion fraccion = new Fraccion();
        
     fraccion.setDenominador(denominador*f1.getNumerador());
     fraccion.setNumerador((numerador)*(f1.getDenominador()));
     return fraccion;
     
    }
     public Fraccion restarFraccion(Fraccion f1 ){
    
        Fraccion fraccion = new Fraccion();
        
     fraccion.setDenominador((f1.getDenominador()*denominador));
     fraccion.setNumerador((f1.getDenominador()*numerador)-(f1.getNumerador()*denominador));
     return fraccion;
     
    }
    public void mostrarFraccion(){
    
        System.out.println(numerador+"/"+denominador);
    
    
    }

}

