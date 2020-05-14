/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia2;

import guia2.EntidadControl.AhorcadoServ;
import guia2.clases.Ahorcado;
import java.util.Scanner;

/**
 *
 * @author chiri
 */
public class Problema13 {
    public static void main(String[] args) {
    
    Ahorcado a1 = new Ahorcado("recursion", 8);
    AhorcadoServ aS =new AhorcadoServ();
    Scanner leer = new Scanner(System.in);
    String a;
//    int b;
//        System.out.println("Ingrese la palabra para jugar");
//        a=leer.next();
//        System.out.println("Cuantos intentos quiere dar?");
//        b=leer.nextInt();
//        a1=aS.empiezaJuego(a, b);
//    for (int i=0; i < 100; i++)
//{
//System.out.println("");
//}
    aS.resultado(a1);
    do{    
    System.out.println("ingrese una letra o arriesgue por el todo");
        System.out.println("son "+aS.longPalabra(a1)+" letras y acertaste "+a1.getAciertos());
        
        
        a=leer.next();
        aS.buscaLetra(a1, a);
        aS.resultado(a1);
        System.out.println("te quedan "+aS.intentosQuedan(a1)+" intentos");
        
    }while (a1.getIntentoAc()!=a1.getIntentos()&&!aS.gano(a1));
    if(aS.gano(a1)){
        System.out.println("Felicidades Ganoooo!!!");
    }else{
        System.out.println("Lo lamento perdio");
    }
            
}
}