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
public class Rectangulo {
    
    private int[] a = new int[2];
    private int[] b = new int[2];
    private int[] c = new int[2];
    private int[] d = new int[2];

    private Rectangulo(int[] a, int[] b , int[] c , int[] d) {
        
        this.a= a;
        this.b=b;
        this.c=c;
        this.d=d;
    }
        public Rectangulo() {
        
       
    }

    public Rectangulo(int ancho, int alto) {
        
        this.a[0] = 0;
        this.a[1] = 0;
        this.b[0] = ancho;
        this.b[1] = 0;
        this.c[0] = 0;
        this.c[1] = alto;
        this.d[0] = ancho;
        this.d[1] = alto;
    }
       
   public Rectangulo(int a1, int a2,int b1, int c2) {
        
        this.a[0] = a1;
        this.a[1] = a2;
        this.b[0] = b1;
        this.b[1] = a2;
        this.c[0] = a1;
        this.c[1] = c2;
        this.d[0] = b1;
        this.d[1] = c2;
    }

    public int getAx() {
        return a[0];
    }
     public int getAy() {
        return a[1];
    }

    public void setAx(int a) {
        this.a[0] = a;
        this.c[0] = a;
    }
    public void setAy(int a) {
        this.a[1] = a;
        this.b[1] = a;
    }
    public int getBx() {
        return b[0];
    }
    public int getBy() {
        return b[1];
    }

    public void setBx(int b) {
        this.b[0] = b;
        this.d[0] = b;
    }
    public void setBy(int b) {
        this.b[1] = b;
        this.a[1] = b;
    }
    public int getCx() {
        return c[0];
    }
    public int getCy() {
        return c[1];
    }

    public void setCx(int c) {
        this.c[0] = c;
        this.a[0] = c;
    }
    public void setCy(int c) {
        this.c[1] = c;
        this.d[1] = c;
    }

    public int getDy() {
        return d[1];
    }
    public int getDx() {
        return d[0];
    }
    public void setDy(int d) {
        this.d[1] = d;
        this.c[1] = d;
      
    }
    public void setDx(int d) {
        this.d[0] = d;
        this.b[0] = d;
    }

   
    public int superfRectang(){
    
    int sup =Math.abs((this.b[0]-this.a[0])*(this.c[1]-this.a[1]));
    
    return sup;
    }
    
    public Rectangulo dezplazaRec(int lado, int alto){
    
    Rectangulo r1 = new Rectangulo(this.a,this.b,this.c,this.d);
    
    r1.setAx(r1.getAx()+lado);
    r1.setBx(r1.getBx()+lado);
    r1.setAy(r1.getAy()+alto);
    r1.setCy(r1.getCy()+alto);
    
    return r1;
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "a=(" + a[0]+","+a[1] + ") b=(" + b[0] +","+b[1]+"), c=(" + c[0] +","+c[1]+") d=(" + d[0] +","+d[1]+")";
    }
    
}
