/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia2.EntidadControl;

import guia2.clases.Cuenta;
import java.util.Scanner;

/**
 *
 * @author chiri
 */
public class CuentaService {
    
    public Cuenta altaCuenta(){
    
       
        int a;
        String b;
        
        Cuenta cuenta = new Cuenta();
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el nuevo nuero de cuenta");
        cuenta.setNueroDeCuenta(leer.nextInt());
        System.out.println("Ingrese el DNI del cliente sin puntos xxxxxxxx");
        
        do {            
            b=leer.nextLine();
        } while (b.length()>8);
        
        cuenta.setDniCliente(b);
        
        System.out.println("ingrese el saldo del cliente");
        double s;
        do {            
            s=leer.nextDouble();
        } while (s<0);
        
        cuenta.setSaldoActual(s);
        s=0;
        System.out.println("Ingrese el interes anual en porcentaje ej 50 para el 50% anual");
        
        do {            
            s=leer.nextDouble();
        } while (s<0 && s>100);
        
        cuenta.setInteresAnual(s/100);
        
    return cuenta;
    }
    
    public void actualizarSaldo(Cuenta cuenta){
    
        cuenta.setSaldoActual(cuenta.getSaldoActual()+(cuenta.getSaldoActual()*(cuenta.getInteresAnual()/365)));
    
        
    }
    public void ingresar(Cuenta cuenta){
    
        System.out.println("Cunato va a ingresar");
        Scanner leer = new Scanner(System.in);
        double m;
        do {            
            m =leer.nextDouble();
        } while (m<0);
    cuenta.setSaldoActual(cuenta.getSaldoActual()+m);
    }
       public void retirar(Cuenta cuenta){
        System.out.println("Cunato va a retirar");
        Scanner leer = new Scanner(System.in);
        double m;
        do {            
            m =leer.nextDouble();
        } while (m<0);
    cuenta.setSaldoActual(cuenta.getSaldoActual()-m);
    }
    
    public void consultarSaldo(Cuenta cuenta){
    
        System.out.println("el Saldo de la cuenta es "+cuenta.getSaldoActual());
    
    }
    
    public void consultarDatos(Cuenta cuenta){
    
        System.out.println("Numero de cuenta: "+cuenta.getNueroDeCuenta()+" \n"+ 
                            "D.N.I: " +cuenta.getDniCliente()+"\n"+
                            "Saldo: " +cuenta.getSaldoActual()+" \n"+
                            "Interes: "+cuenta.getInteresAnual());
    
    }
    
    
}
