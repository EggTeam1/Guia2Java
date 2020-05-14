/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia2;

import guia2.EntidadControl.MatematicaService;
import guia2.clases.Raices;

/**
 *
 * @author chiri
 */
public class Problema09 {
        public static void main(String[] args) {
            
            MatematicaService matematicaService = new MatematicaService();
            Raices r1;
            
            r1=matematicaService.nuevaFunCuadratica();
            matematicaService.obtenerRaices(r1);
            System.out.println("el discriminate es"+matematicaService.getDiscriminante(r1));
            matematicaService.calcular(r1);
            matematicaService.obtenerRaiz(r1);
            matematicaService.tieneRaiz(r1);
            matematicaService.tienerRaices(r1);
        }
    
}
