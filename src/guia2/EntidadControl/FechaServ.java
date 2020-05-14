/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia2.EntidadControl;

import guia2.clases.Fecha;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;

/**
 *
 * @author chiri
 */
public class FechaServ {

public Fecha crearFecha(int dia, int mes , int ano){

Fecha fecha = new Fecha();

fecha.setAno(ano);
fecha.setDia(dia);
fecha.setMes(mes);
return fecha;
}

public Fecha crearFecha(){

  Fecha fecha = new Fecha();
  Scanner leer = new Scanner(System.in);
  int d,m,a;
    System.out.println("Ingrese el Dia");
  
    do {        
        d=leer.nextInt();
    } while (d<1||d>31);
  
    System.out.println("Ingrese el Mes");
    
    do {        
        m=leer.nextInt();
    } while (m<1 || m>12);
    
    
    System.out.println("Ingrese el Año");
    do {        
        a=leer.nextInt();
    } while (a<1900 || a>2050);
    
   fecha.setDia(d);
   fecha.setMes(m);
   fecha.setAno(a);
    
   return fecha;
}

public boolean esBiciesto(Fecha f1){

   boolean v;
    
    if (f1.getAno()%4 == 0) {
        if (f1.getAno()%100 == 0) {
            if (f1.getAno()%400 == 0) {
                return v=true;
            } else {
                return v=false;
            }
        } else {
            return v=true;
        }
        
    } else {
        return v=false;
    }

    }
   public int diaMes(int n,int a){
      int d; 
    if (n==1||n==3||n==5||n==7||n==8||n==10||n==12){
        return d=31;
    }else{
        if (n==4||n==6||n==9||n==11){
         return d=30;   
        }else{
            if (n==2) {
                if (a%4 == 0) {
                  if (a%100 == 0) {
                       if (a%400 == 0) {
                        return d=29;
                    } else {
                      return d=28;
                     }
                } else {
                  return d=29;
                }
        
            } else {
              return d=28;
            }
                
            } else {
              return d=-999;
            }
           
        }
       
   }
    
    
    
    
    
}
    
  public void validar(Fecha f1){
      FechaServ ser = new FechaServ();
      
  
      if (f1.getMes()<0 && f1.getMes()>12){
          f1.setMes(1);
      }
      if (f1.getDia()>ser.diaMes(f1.getMes(),f1.getAno())|| f1.getDia()>0) {
          System.out.println("Fecha invalida");
          f1.setDia(1);
      }    
      if (f1.getAno()<1900 || f1.getAno()>2050){
          f1.setAno(1900);
      }
      System.out.println(f1.toString());
  }
  public long diasTrans(Fecha f1){
     
     Calendar fecha1 = Calendar.getInstance();
     Calendar fecha2 = Calendar.getInstance();
     fecha1.set(f1.getAno(),f1.getMes()-1,f1.getDia());
     fecha2.set(1900, 0, 1);
     long a=(fecha1.getTimeInMillis()-fecha2.getTimeInMillis())/(1000*60*60*24);
   
   return a;  
  }
public long diasEntre(Fecha f1, int dia,int mes,int ano){
 Calendar fecha1 = Calendar.getInstance();
     Calendar fecha2 = Calendar.getInstance();
     fecha1.set(f1.getAno(),f1.getMes(),f1.getDia());
     fecha2.set(ano, mes, dia);
     long a=Math.abs(fecha1.getTimeInMillis()-fecha2.getTimeInMillis())/(1000*60*60*24);

return a;
}
public Fecha siguiente(Fecha f1){
    Calendar fecha1 = Calendar.getInstance();
    fecha1.set(f1.getAno(),f1.getMes()-1,f1.getDia());
    fecha1.add(Calendar.DAY_OF_YEAR, 1);
    f1.setAno(fecha1.get(Calendar.YEAR));
    f1.setMes(fecha1.get(Calendar.MONTH)+1);
    f1.setDia(fecha1.get(Calendar.DATE));
    
    
 return f1;   
}
public Fecha anterior(Fecha f1){
    
    Calendar fecha1 = Calendar.getInstance();
    fecha1.set(f1.getAno(),f1.getMes()-1,f1.getDia());
    fecha1.add(Calendar.DAY_OF_YEAR, -2);
    f1.setAno(fecha1.get(Calendar.YEAR));
    f1.setMes(fecha1.get(Calendar.MONTH)+1);
    f1.setDia(fecha1.get(Calendar.DATE));
    
    
 return f1;   
}
}

    

