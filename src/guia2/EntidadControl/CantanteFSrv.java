/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia2.EntidadControl;

import guia2.clases.CantanteFamosos;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author chiri
 */
public class CantanteFSrv {
    
    private ArrayList<CantanteFamosos> listaCantanteF = new ArrayList();

    public CantanteFSrv(String nombre, String discoFamoso) {
        CantanteFamosos cf = new CantanteFamosos();
        cf.setCantante(nombre);
        cf.setDiscoVentas(discoFamoso);
        agregarcantante(cf);
    }

    public CantanteFSrv() {
    }
    
    

    public ArrayList<CantanteFamosos> getListaCantanteF() {
        return listaCantanteF;
    }

    public void setListaCantanteF(ArrayList<CantanteFamosos> listaCantanteF) {
        this.listaCantanteF = listaCantanteF;
    }
    
    public void agregarcantante(String nombre, String disco){
    
     CantanteFamosos cf = new CantanteFamosos();
        cf.setCantante(nombre);
        cf.setDiscoVentas(disco);
        agregarcantante(cf);
    
    }
    
private void agregarcantante(CantanteFamosos c1){
 
    listaCantanteF.add(c1);

}    
public void aniadirCntantef(){
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    CantanteFamosos cf = new CantanteFamosos();
    System.out.println("cuall es el nombre del cantante");
    cf.setCantante(leer.nextLine());
    System.out.println("Cual es el disco con mas ventas");
    cf.setDiscoVentas(leer.nextLine());
    agregarcantante(cf);
}
public void mostrarCantantes(){

    for (CantanteFamosos obj : listaCantanteF) {
        System.out.println(obj.getCantante()+" "+obj.getDiscoVentas());
    }


}
}





    
    
    
    
