/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia2.EntidadControl;

import guia2.clases.Libros;
import java.util.HashSet;

/**
 *
 * @author chiri
 */
public class LibrosSrv {
    HashSet<Libros> libreria = new HashSet();

    public LibrosSrv() {
    }
    
    public void nuevoLibro(String nombre, String autor, int cantidadlibros, int canitdadejemplaresP) {
        
        Libros l1 = new Libros();
        l1.setAutor(autor);
        l1.setCanitdadejemplaresP(canitdadejemplaresP);
        l1.setCantidadlibros(cantidadlibros);
        l1.setNombre(nombre);
        guardar(l1);
        
    }
    private void guardar(Libros l1){
    
    libreria.add(l1);
    }
    public boolean prestamo(String nombre){
    boolean v = false;
    
        for (Libros l : libreria) {
            if ( l.getNombre().equals(nombre)) {
                if (l.getCanitdadejemplaresP()<l.getCantidadlibros()) {
                    l.setCanitdadejemplaresP(l.getCanitdadejemplaresP()+1);
                    guardar(l);
                    v=true;
                }
            }

        }
    return v;
    }
        public boolean devolucion(String nombre){
    boolean v = false;
    
        for (Libros l : libreria) {
            if ( l.getNombre().equals(nombre)) {
                if (l.getCanitdadejemplaresP()>0) {
                    l.setCanitdadejemplaresP(l.getCanitdadejemplaresP()-1);
                    guardar(l);
                    v=true;
                }
            }

        }
    return v;
    }
   public void mostrarlibros(){
   
       for (Libros libros : libreria) {
           System.out.println(libros.toString());
       }
   
   }     
}
