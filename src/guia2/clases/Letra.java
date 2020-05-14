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
public class Letra {
    private long dni;
    private String l;

    public Letra() {
        this.dni = 0;
        this.l = "U";
    }
        public Letra(long dni) {
         int a;
        a=(int) (dni%23);
        switch (a){
        case 0:
                this.l = "T";
                break;
            
        case 1:
                this.l = "R";
                break;
        case 2:
                this.l = "W";
                break;
        case 3:
                this.l = "A";
                break;
        case 4:
                this.l = "G";
                break;
         case 5:
                this.l = "M";
                break;       
        case 6:
                this.l = "Y";
                break;
        case 7:
                this.l = "F";
                break;
        case 8:
                this.l = "P";
                break;
        case 9:
                this.l = "D";
                break;
        case 10:
                this.l = "X";
                break;
        case 11:
                this.l = "B";
                break;
        case 12:
                this.l = "N";
                break;
        case 13:
                this.l = "J";
                break;
        case 14:
                this.l = "Z";
                break;
        case 15:
                this.l = "S";
                break;
        case 16:
                this.l = "Q";
                break;
        case 17:
                this.l = "V";
                break;
        case 18:
                this.l = "H";
                break;
        case 19:
                this.l = "L";
                break;
        case 20:
                this.l = "C";
                break;
        case 21:
                this.l = "K";
                break;
         case 22:
                this.l = "E";
                break;
             }
   
    this.dni = dni;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        int a;
        a=(int) (dni%23);
        switch (a){
        case 0:
                this.l = "T";
                break;
            
        case 1:
                this.l = "R";
                break;
        case 2:
                this.l = "W";
                break;
        case 3:
                this.l = "A";
                break;
        case 4:
                this.l = "G";
                break;
         case 5:
                this.l = "M";
                break;       
        case 6:
                this.l = "Y";
                break;
        case 7:
                this.l = "F";
                break;
        case 8:
                this.l = "P";
                break;
        case 9:
                this.l = "D";
                break;
        case 10:
                this.l = "X";
                break;
        case 11:
                this.l = "B";
                break;
        case 12:
                this.l = "N";
                break;
        case 13:
                this.l = "J";
                break;
        case 14:
                this.l = "Z";
                break;
        case 15:
                this.l = "S";
                break;
        case 16:
                this.l = "Q";
                break;
        case 17:
                this.l = "V";
                break;
        case 18:
                this.l = "H";
                break;
        case 19:
                this.l = "L";
                break;
        case 20:
                this.l = "C";
                break;
        case 21:
                this.l = "K";
                break;
         case 22:
                this.l = "E";
                break;
             }
   
    this.dni = dni;
    }
    
    
                
    public String getL() {
        return l;
    }

    @Override
    public String toString() {
        return  dni + "-" + l;
    }

    
    
    
    
}
