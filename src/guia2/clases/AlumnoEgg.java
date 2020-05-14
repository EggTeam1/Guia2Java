/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia2.clases;

import java.util.Comparator;

/**
 *
 * @author chiri
 */
public class AlumnoEgg {
    private int posicion;
    private String nombre;
    private String apellido;
    private Integer dni;
    private int votos;

    public AlumnoEgg(String nombre, String apellido, Integer dni, int votos) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.votos = votos;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public AlumnoEgg() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public int getVotos() {
        return votos;
    }

    public void setVotos(int votos) {
        this.votos = votos;
    }
     public static Comparator<AlumnoEgg> ComparatorNotaMay = new Comparator<AlumnoEgg>() {
    @Override
        public int compare(AlumnoEgg e1, AlumnoEgg e2) {
            
            if (e1.getVotos()==e2.getVotos()) {
                return 0;
        } else {
                if (e1.getVotos()<e2.getVotos()) {
                    return 1;
                }else{
                    return -1;
                }
        }
            
        }
    };
}
