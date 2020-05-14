/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g2problema27.entidad;

/**
 *
 * @author chiri
 */
public class Asiento {
    private int fila ;
    private String columna;
    private String nombre;
    private String[] lfila = {"A","B","C","D","E","F","G","H","I"};
    private int edad;

    public Asiento(int fila, int columna, String nombre, int edad) {
        this.fila = fila;
        this.columna = lfila[columna];
        this.nombre = nombre;
        this.edad = edad;
    }

    public Asiento() {
    }

    public String[] getLfila() {
        return lfila;
    }

    public void setLfila(String[] lfila) {
        this.lfila = lfila;
    }



    public void setFila(int fila) {
        this.fila = fila;
    }

    public String getColumna() {
        return columna;
    }

    public void setColumna(String columna) {
        this.columna = columna;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFila() {
        return fila;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}
