/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author AldiLee
 */
public class CuentaBancaria {
    private int numeroDeCuenta, saldoActual;
    private long dni;

    public CuentaBancaria() {
    }

    public CuentaBancaria(int numeroDeCuenta, int saldoActual, long dni) {
        this.numeroDeCuenta = numeroDeCuenta;
        this.saldoActual = saldoActual;
        this.dni = dni;
    }

    public int getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    public void setNumeroDeCuenta(int numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }

    public int getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }
    
    
}