/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g2problema27.servicio;

import g2problema27.entidad.Asiento;
import g2problema27.entidad.Expectador;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author chiri
 */
public class CineSrv {
     private int salallena = 72;
     private boolean[][] sala = new boolean[9][8];
     private ArrayList<Asiento> lugares = new ArrayList<Asiento>();

    public  boolean[][] getSala() {
     return sala;
    }

    public void setSala(boolean[][] sala) {
        this.sala = sala;
    }
    
 public void centar(String nombre, int fila, int columna, int edad){
    Asiento a1= new Asiento(fila, columna, nombre,edad);
       this.lugares.add(a1);
       this.salallena = salallena - 1;
    
}
    public ArrayList<Asiento> llenarcine(ArrayList<Expectador> le1, double precio, int pg) {
        int lugar, c, f, n;
        for (Expectador ex : le1) {
            lugar = (int) (Math.random() * 5);
            if (this.salallena >= lugar) {
                if ((lugar * precio) < ex.getDinero()&& pg <= ex.getEdad()) {
                    n = lugar;
                    do {
                        c = (int) ((Math.random() * (8 - lugar)));
                        f = ((int) (Math.random() * 9));
                        if (!sala[f][c] && !sala[f][(c + lugar)]) {
                            for (int i = 0; i < lugar+1; i++) {
                                sala[f][(c + i)] = true;
                                centar(ex.getNombre(), f, c + i,ex.getEdad());
                                ex.setDinero(ex.getDinero() - (lugar * precio));
                                n = n - 1;
                            }
                        }
                    } while (n > 0);

                }
            }

        }
        return this.lugares;
    }
    public void mostrartiket( ArrayList<Asiento> a1){
        int n = 1;
        for (Asiento a : a1) {
            System.out.println("tiket n°"+n );
            System.out.println("Nombre:"+a.getNombre());
            System.out.println("edad: "+a.getEdad());
            System.out.println("fila:"+a.getFila()+" asiento "+a.getColumna());
            n=n+1;
            System.out.println("");
        }
    
    }
}


 
    
    
    

