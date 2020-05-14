/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia2.clases;

/**
 *
 * @author chiri
 */
public class Libros {
    private String nombre;
    private String autor;
    private int cantidadlibros;
    private int canitdadejemplaresP;

    public Libros(String nombre, String autor, int cantidadlibros, int canitdadejemplaresP) {
        this.nombre = nombre;
        this.autor = autor;
        this.cantidadlibros = cantidadlibros;
        this.canitdadejemplaresP = canitdadejemplaresP;
    }

    public Libros() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getCantidadlibros() {
        return cantidadlibros;
    }

    public void setCantidadlibros(int cantidadlibros) {
        this.cantidadlibros = cantidadlibros;
    }

    public int getCanitdadejemplaresP() {
        return canitdadejemplaresP;
    }

    public void setCanitdadejemplaresP(int canitdadejemplares) {
        this.canitdadejemplaresP = canitdadejemplares;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre + ", autor=" + autor + ", cantidadlibros=" + cantidadlibros + ", canitdadejemplaresP=" + canitdadejemplaresP ;
    }
    
    
}
