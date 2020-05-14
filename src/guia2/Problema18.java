/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia2;

import guia2.EntidadControl.LongSrv;

/**
 *
 * @author chiri
 */
public class Problema18 {
    public static void main(String[] args) {
        
        double[] a =new double[50];
        double[] b =new double[20];
        
        LongSrv.asignaNum(a);
        LongSrv.asignaNum(b);
        LongSrv.mostrarvec(a);
        LongSrv.mostrarvec(b);
        LongSrv.ordenara(a);
        LongSrv.mostrarvec(a);
        b=LongSrv.cambiavec(b, a);
        LongSrv.mostrarvec(b);
    }
    
}
