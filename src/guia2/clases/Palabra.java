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
public class Palabra implements Comparable<Palabra>  {
    private String palabra;

    public Palabra(String palabra) {
        this.palabra = palabra;
    }

    public Palabra() {
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }
    
@Override
     public int compareTo(Palabra o) {
        String a=this.palabra.toUpperCase();
        String b=o.getPalabra().toUpperCase();
        return a.compareTo(b);
    }
     
     
     
}
