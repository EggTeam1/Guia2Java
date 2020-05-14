/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia2.EntidadControl;

import guia2.clases.Letra;

/**
 *
 * @author chiri
 */
public class LetraServ {

public String mostrarNif(Letra letra){

    String a = letra.toString();
    
return a;
}
public Letra crearNis(long dni){
Letra l1 = new Letra(dni);

return l1;
}
}