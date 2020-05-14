/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia2.clases;

import java.util.Scanner;

/**
 *
 * @author chiri
 */
public class Libro {
    
    private int isbn;
    private String titulo;

   
    private String autor;
    private int numeroPaginas;

 public Libro(int isbn, String titulo, String autor, int numeroPaginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }
 public Libro() {
        this.isbn = 0;
        this.titulo = "";
        this.autor = "";
        this.numeroPaginas = 0;
    }



public String datosLibro(){

    String datosLibro;
    
    datosLibro = "ISBN:"+ Integer.toString(this.isbn)+" Titulo : "+ this.titulo+" Autor: " + this.autor;
    

return datosLibro;

}



    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        
        
        this.isbn = isbn; 
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

     
}
