/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia2;

import guia2.EntidadControl.CuentaService;
import guia2.clases.Cuenta;

/**
 *
 * @author chiri
 */
public class Problema08 {
      public static void main(String[] args) {
          
          CuentaService cuentaService = new CuentaService();
          Cuenta cuenta;
          
          cuenta = cuentaService.altaCuenta();
          
          cuentaService.consultarDatos(cuenta);
          
          cuentaService.ingresar(cuenta);
          cuentaService.consultarSaldo(cuenta);
          cuentaService.retirar(cuenta);
          cuentaService.consultarSaldo(cuenta);
          cuentaService.actualizarSaldo(cuenta);
          cuentaService.consultarDatos(cuenta);
          
          
          
      }
    
}
