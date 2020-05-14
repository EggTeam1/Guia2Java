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
public class CantanteFamosos {
    private String cantante;
    private String discoVentas;

    public CantanteFamosos() {
    }

    public CantanteFamosos(String cantante, String discoVentas) {
        this.cantante = cantante;
        this.discoVentas = discoVentas;
    }

    public String getCantante() {
        return cantante;
    }

    public void setCantante(String cantante) {
        this.cantante = cantante;
    }

    public String getDiscoVentas() {
        return discoVentas;
    }

    public void setDiscoVentas(String discoVentas) {
        this.discoVentas = discoVentas;
    }
  
    
    
}
