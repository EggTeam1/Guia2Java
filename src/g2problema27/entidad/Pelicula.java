/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
//de las películas nos interesa saber el título, duración, edad mínima y director,
 */
package g2problema27.entidad;

/**
 *
 * @author chiri
 */
public class Pelicula {
   private String titulo;
   private Integer duracion;
   private Integer pg;
   private String director;

    public Pelicula(String titulo, Integer duracion, Integer pg, String director) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.pg = pg;
        this.director = director;
    }

    public Pelicula() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    public Integer getPg() {
        return pg;
    }

    public void setPg(Integer pg) {
        this.pg = pg;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
   
   
    
}
