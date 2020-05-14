/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g2problema27;

import g2problema27.entidad.Asiento;
import g2problema27.entidad.Expectador;
import g2problema27.servicio.CineSrv;
import g2problema27.servicio.ExpectadorSrv;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author chiri
 */
public class G2Problema27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Expectador> e1;
        ArrayList<Asiento> a1;
        ExpectadorSrv ex = new ExpectadorSrv();
        CineSrv cx = new CineSrv();
        boolean[][] s1= new boolean[9][8];
        //System.out.println(" cuantos clientes desea venderles entradas de cine (pueden comprar hasta 4 cada uno");
        Scanner leer = new Scanner(System.in);
        //int a = leer.nextInt();
         int a = 50;
        //System.out.println("cual es el preio de la entrada");
        //double b = leer.nextDouble();
         int b = 150;
        //System.out.println("cual es la restriccion de la pelicula");
        //int c = leer.nextInt();
         int c = 50;
        e1=ex.agregarclientes(a);
        a1=cx.llenarcine(e1, b,c);
        s1=cx.getSala();
        
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 8; j++) {
                if (s1[i][j]) {
                    
                    System.out.print("[1]");
                }else{
                System.out.print("[0]");
            }
            }
            System.out.println("");
        }
        cx.mostrartiket(a1);
    }
   
    }
