/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia2.EntidadControl;

import guia2.clases.Alumno;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author chiri
 */
public class AlumnoSrv {
    private ArrayList<Alumno> cursoProgramacionEgg = new ArrayList(); 

    public AlumnoSrv() {
    }

    
    
    public void argarAlumno(String nombre, String apellido, int numLeg, String sexo, String Condicion, int notafinal) {
        Alumno alumno = new Alumno(nombre,apellido, numLeg,sexo,Condicion,notafinal);
        agregarAlumno(alumno);
    }
    
    private void agregarAlumno(Alumno a1){
    
    cursoProgramacionEgg.add(a1);
    }
    
    public void cargarAlumanos(){
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Alumno a1 = new Alumno();
        System.out.println("cuantos alumnos va a cargar?");
        int a = leer.nextInt();
        
        for (int i = 0; i < a; i++) {
            System.out.println("Indique el nombre del alumno "+(i+1));
            a1.setNombre(leer.nextLine().toUpperCase());
            System.out.println("Ingrese el apellido del alumno "+(i+1));
            a1.setApellido(leer.nextLine().toUpperCase());
            System.out.println("Ingrese el numero de legajo del alumno "+(i+1));
            a1.setNumLeg(leer.nextInt());
            System.out.println("Ingrese el sexo M o F del alumno "+(i+1));
            a1.setSexo(leer.nextLine().toUpperCase());
            System.out.println("Ingrese la condicion regular o condicional del alumno "+(i+1));
            a1.setCondicion(leer.nextLine().toUpperCase());
            System.out.println("Ingrese la nota final del alumno "+(i+1));
            a1.setNotafinal(leer.nextInt());
           
            agregarAlumno(a1);
            a1.blaqueoAlumno();
        }
    }
    public void mostrarAlumnos(){
    
        for (Alumno alumno : cursoProgramacionEgg) {
            System.out.println(alumno.toString());
        }
    }
    
    public void mostrarAlumCondicionales(){
    int sum = 0;
        for (Alumno alumno : cursoProgramacionEgg) {
            if (alumno.getCondicion().equals("CONDICIONAL")) {
                System.out.println(alumno.getApellido()+", "+alumno.getNombre());
                sum=sum+1;
            }
        }
        System.out.println("La cantidad de alumnos Condicionales son "+sum);
    }
    
    public void ordenarNotaMay(){
    cursoProgramacionEgg.sort(Alumno.ComparatorNotaMay);
        for (Alumno alumno : cursoProgramacionEgg) {
            System.out.print(alumno.getNotafinal()+", ");
            System.out.print(alumno.getNombre()+", ");
            System.out.print(alumno.getApellido());
            System.out.println("");
        }
    }
        public void ordenarNotaMen(){
    cursoProgramacionEgg.sort(Alumno.ComparatorNotaMen);
        for (Alumno alumno : cursoProgramacionEgg) {
            System.out.print(alumno.getNotafinal()+", ");
            System.out.print(alumno.getNombre()+", ");
            System.out.print(alumno.getApellido());
            System.out.println("");
        }
        }
        public void ordenarNombreApe(){
    cursoProgramacionEgg.sort(Alumno.ComparatorDescNombre);
        for (Alumno alumno : cursoProgramacionEgg) {
            System.out.print(alumno.getNombre()+", ");
            System.out.print(alumno.getApellido());
            System.out.println("");
        }
    }
    
    }
    
    

