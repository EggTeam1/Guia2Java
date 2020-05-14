/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia2.EntidadControl;

import guia2.clases.Persona;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author chiri
 */
public  class PersonaSrv {
    public static int edad(Persona p1){
    
        Calendar c2 = Calendar.getInstance();
        int anio = c2.get(Calendar.YEAR) - p1.getFechaNac().get(Calendar.YEAR);
        int mes = c2.get(Calendar.MONTH) - p1.getFechaNac().get(Calendar.MONTH);
        int dia = c2.get(Calendar.DATE) - p1.getFechaNac().get(Calendar.DATE);
        
      if(mes < 0 // Aún no es el mes de su cumpleaños
           || (mes==0 && dia < 0)) { // o es el mes pero no ha llegado el día.
            anio--;
        }


//long edad=Math.abs(c2.getTimeInMillis()-p1.getFechaNac().getTimeInMillis())/(1000*60*60*24)/365;
    return anio;
    }
  
    public static Persona crear(){
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Escriba el nombre de la persona");
        String name = leer.nextLine();
        System.out.println("Escriba el dia de nacieminto");
        int dia = leer.nextInt();
        System.out.println("Escriba el mes de nacimiento");
        int mes= leer.nextInt();
        System.out.println("Escriba el año de nacieminto");
        int anio=leer.nextInt();
        Calendar f1 = Calendar.getInstance();
        f1.set(anio, mes-1, dia);
        Persona p1= new Persona(name,f1);

    return p1;    
    }
}
