/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia2.EntidadControl;

import guia2.clases.Raices;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author chiri
 */
public class MatematicaService {
    
    public Raices nuevaFunCuadratica(){
    
        Scanner leer = new Scanner(System.in);
        Raices raices = new Raices();
        
        System.out.println("ingrese el termino cuadratico");
     double a=0;
    try{    
       a=leer.nextDouble();
    }catch (InputMismatchException ime){
    System.out.println("¡Cuidado! Solo puedes insertar números. se asignara 0 ");
    leer.next();
    }
    raices.setA(a);
    
           System.out.println("ingrese el termino lineal");
     a =0;
    try{    
       a=leer.nextDouble();
    }catch (InputMismatchException ime){
    System.out.println("¡Cuidado! Solo puedes insertar números. se asignara 0");
    leer.next();
    }
    raices.setB(a);
    
           System.out.println("ingrese el termino Constante");
     a=0;
    try{    
       a=leer.nextDouble();
    }catch (InputMismatchException ime){
    System.out.println("¡Cuidado! Solo puedes insertar números. Se asignara 0 ");
    leer.next();
    }
    raices.setC(a);

    return raices;
    }
    
    public void obtenerRaices(Raices r1){
    
        if ((Math.pow(r1.getB(), 2)-(4*r1.getA()*r1.getC()))<0) {
            
            System.out.println("la ecuacion tiene racices imaginarias");
            
            
        } else {
            double a = Math.sqrt(Math.pow(r1.getB(), 2)-(4*r1.getA()*r1.getC()));
            double x1=((-1*r1.getB())-(a/(2*r1.getA())));
            double x2=(-1*r1.getB())-(a/(2*r1.getA()));
            System.out.println("x1 = "+x1);
            System.out.println("x2 = "+x2);
            
        }
            
    
    }
        public void obtenerRaiz(Raices r1){
            MatematicaService m1 = new MatematicaService();
       
            
            if ((Math.pow(r1.getB(), 2)-(4*r1.getA()*r1.getC()))<0) {
            
            System.out.println("la ecuacion tiene racices imaginarias");
        } else {
            if (m1.tieneRaiz(r1)){
                double x2=(-1*r1.getB())/(2*r1.getA());
                System.out.println("Las racies son reales y coincidentes en "+x2);
            }else
                System.out.println("Las raices son reales y distintas");
 
        }
        }
    
        public double getDiscriminante(Raices r1){
        
        double a = Math.sqrt(Math.pow(r1.getB(), 2)-(4*r1.getA()*r1.getC()));
        
        return a;
        }
        
    public boolean tienerRaices(Raices r1){
        
        boolean v;
        
        if (Math.sqrt(Math.pow(r1.getB(), 2)-(4*r1.getA()*r1.getC()))>0) {
            v=true;
        }else{
        v=false;
        }
    
    return v;
    }
    
    
    
    public boolean tieneRaiz(Raices r1){
    boolean v;
        if ((Math.pow(r1.getB(), 2)-(4*r1.getA()*r1.getC()))<0) {
            
            v=false;
            
        } else {
            double a = Math.sqrt(Math.pow(r1.getB(), 2)-(4*r1.getA()*r1.getC()));
            
            if (a==0){
                v=true;
            }else
                v=false;
        }
    return v;
    }
    public void calcular(Raices r1){
    
    MatematicaService m1 = new MatematicaService();
    
    m1.obtenerRaices(r1);
    System.out.println("El Discriminador es "+m1.getDiscriminante(r1));
        
    
    
    
    
    
    }
    
    
    
    
}
