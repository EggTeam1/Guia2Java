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
public class Ahorcado {
    
    private int cantidadLetras;
    private int intentoAc;
    private int intentos;
    private String[] palabra ;
    private String[] palabraJ;
    private int aciertos;
   

    public Ahorcado() {
//        this.cantidadLetras = 1;
//        this.intentoAc = 0;
//        this.intentos = 9;
//        this.palabra[0]="j";
//        this.palabra[0]="_";
//        this.aciertos =0;
    }

    public Ahorcado(String palabra, int intentos) {
        this.cantidadLetras = palabra.length();
        this.intentoAc = 0;
        this.aciertos=0;
        this.intentos = intentos;
        this.palabra = new String[cantidadLetras];
        this.palabraJ = new String[cantidadLetras];
        for (int i = 0; i < palabra.length(); i++) {
            this.palabra[i]=palabra.substring(i, i+1);
            this.palabraJ[i]=" _ ";
        }
    }

    public int getAciertos() {
        return aciertos;
    }

    public void setAciertos(int aciertos) {
        this.aciertos = aciertos;
    }

    public int getIntentoAc() {
        return intentoAc;
    }

    public void setIntentoAc(int intentoAc) {
        this.intentoAc =intentoAc;
    }

    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        if(intentos>1){
        this.intentos = intentos;
        }else{
        this.intentos = 1;
        }
        
        
    }

    public int getCantidadLetras() {
        return cantidadLetras;
    }

    public void setPalabraJ(String letra, int posicion ) {
        this.palabraJ[posicion] = letra;
    }

    public String getPalabra(int posicion) {
        return palabra[posicion];
    }

    public String getPalabraJ(int posicion) {
        return " "+palabraJ[posicion]+" ";
    }
    
  
}
