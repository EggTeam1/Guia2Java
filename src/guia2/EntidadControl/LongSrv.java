/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia2.EntidadControl;

/**
 *
 * @author chiri
 */
public class LongSrv {
    
    public static double[] asignaNum(double[] a){
    
        for (int i = 0; i < a.length; i++) {
             a[i]=(double)Math.round(Math.random( )*100);
            
        }
    return a;
    }
    
   public static void mostrarvec(double[] a){
       System.out.println("Arreglo de "+a.length);
        for (int i = 0; i < a.length; i++) {
            System.out.print("{"+a[i]+"]");   
        }
        System.out.println("");
          System.out.println("fin de arreglo de  "+a.length);
   }
   public static double[] ordenara(double[] a){
   double c;
   int n = a.length;
       for (int i = 0; i < n; i++) {
           for (int j = i; j < n; j++) {
                if (a[i]>a[(j)]) {
                   c=a[i];
                   a[i]=a[j];
                   a[j]=c;
               } 
               
               
           }
           
       }
   
   return a;
   }
   public static double[] cambiavec(double[] a, double[] b ){
   
       for (int i = 0; i < 10; i++) {
           a[i]=b[i];
           
           }
       for (int i = 10; i < 20; i++) {
           a[i]=0.5;
           }
   return a;
   } 
   
}
