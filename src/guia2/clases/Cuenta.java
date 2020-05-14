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
public class Cuenta {
    private int nueroDeCuenta;
    private String dniCliente;
    private double saldoActual;
    private double interesAnual;


    public Cuenta(int nueroDeCuenta, String dniCliente, double saldoActual, double interesAnual) {
        this.nueroDeCuenta = nueroDeCuenta;
        this.dniCliente = dniCliente;
        this.saldoActual = saldoActual;
        this.interesAnual = interesAnual;
    }
        public Cuenta() {
        }

    public int getNueroDeCuenta() {
        return nueroDeCuenta;
    }

    public void setNueroDeCuenta(int nueroDeCuenta) {
        this.nueroDeCuenta = nueroDeCuenta;
    }

    public String getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(String dniCliente) {
        this.dniCliente = dniCliente;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public double getInteresAnual() {
        return interesAnual;
    }

    public void setInteresAnual(double interesAnual) {
        this.interesAnual = interesAnual;
    }
    
    
}
