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
public class Alumno {
    private String nombre;
    private String apellido;
    private int numLeg;
    private String sexo;
    private String Condicion;
    private int notafinal;

    public Alumno(String nombre, String apellido, int numLeg, String sexo, String Condicion, int notafinal) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numLeg = numLeg;
        this.sexo = sexo;
        this.Condicion = Condicion;
        this.notafinal = notafinal;
    }

    public Alumno() {
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

    public int getNumLeg() {
        return numLeg;
    }

    public void setNumLeg(int numLeg) {
        this.numLeg = numLeg;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCondicion() {
        return Condicion;
    }

    public void setCondicion(String condicion) { 
       
      this.Condicion = condicion;
        
    }

    public int getNotafinal() {
        return notafinal;
    }

    public void setNotafinal(int notafinal) {
        this.notafinal = notafinal;
    }
    public void blaqueoAlumno(){
    
        
        this.nombre = "";
        this.apellido = "";
        this.numLeg = 0;
        this.sexo = "";
        this.Condicion ="";
        this.notafinal = 0;
    }

    @Override
    public String toString() {
        return "Nombre=" + nombre + ", Apellido=" + apellido + ", numLeg=" + numLeg + ", sexo=" + sexo + ", Condicion=" + Condicion + ", notafinal=" + notafinal + '}';
    }
        

    public static Comparator<Alumno> ComparatorDescNombre = new Comparator<Alumno>() {
    @Override
        public int compare(Alumno e1, Alumno e2) {
            return e1.getNombre().compareTo(e2.getNombre());
        }
    };
    public static Comparator<Alumno> ComparatorNotaMay = new Comparator<Alumno>() {
    @Override
        public int compare(Alumno e1, Alumno e2) {
            
            if (e1.getNotafinal()==e2.getNotafinal()) {
                return 0;
        } else {
                if (e1.notafinal<e2.notafinal) {
                    return 1;
                }else{
                    return -1;
                }
        }
            
        }
    };
  public static Comparator<Alumno> ComparatorNotaMen = new Comparator<Alumno>() {
    @Override
        public int compare(Alumno e1, Alumno e2) {
            
            if (e1.getNotafinal()==e2.getNotafinal()) {
                return 0;
        } else {
                if (e1.notafinal>e2.notafinal) {
                    return 1;
                }else{
                    return -1;
                }
        }
            
        }
    };

    }

