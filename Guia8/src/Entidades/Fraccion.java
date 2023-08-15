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
public class Fraccion {

    private int numerador1;
    private int denominador1;
    private int numerdor2;
    private int denomindor2;

    public Fraccion() {
    }

    public Fraccion(int numerador1, int denominador1, int numerdor2, int denomindor2) {
        this.numerador1 = numerador1;
        this.denominador1 = denominador1;
        this.numerdor2 = numerdor2;
        this.denomindor2 = denomindor2;
    }

    public int getNumerador1() {
        return numerador1;
    }

    public void setNumerador1(int numerador1) {
        this.numerador1 = numerador1;
    }

    public int getDenominador1() {
        return denominador1;
    }

    public void setDenominador1(int denominador1) {
        this.denominador1 = denominador1;
    }

    public int getNumerdor2() {
        return numerdor2;
    }

    public void setNumerdor2(int numerdor2) {
        this.numerdor2 = numerdor2;
    }

    public int getDenomindor2() {
        return denomindor2;
    }

    public void setDenomindor2(int denomindor2) {
        this.denomindor2 = denomindor2;
    }

    @Override
    public String toString() {
        return "Fraccion{" + "numerador=" + numerador1 + ", denominador=" + denominador1 + '}';
    }

}