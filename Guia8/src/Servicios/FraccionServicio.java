/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Fraccion;

/**
 *
 * @author AldiLee
 */
public class FraccionServicio {
//    private Fraccion frac = new Fraccion();

    public void sumar(Fraccion f) {
        int comunDenominador, valsup;
        comunDenominador = f.getDenominador1() * f.getDenomindor2();
        valsup = ((comunDenominador / f.getDenominador1()) * f.getNumerador1()) +
                ((comunDenominador / f.getDenomindor2()) * f.getNumerdor2());
        System.out.println(valsup + "\n"
                + "----- \n"
                + comunDenominador);
    }

    public void restar(Fraccion f) {
        int comunDenominador, valsup;
        comunDenominador = f.getDenominador1() * f.getDenomindor2();
        valsup = ((comunDenominador / f.getDenominador1()) * f.getNumerador1())
                - ((comunDenominador / f.getDenomindor2()) * f.getNumerdor2());

        System.out.println(valsup + "\n"
                + "-----\n"
                + comunDenominador);
    }

    public void multiplicar(Fraccion f) {
        System.out.println(f.getNumerador1() * f.getNumerdor2() + "\n"
                + "------"
                + "\n" + f.getDenominador1() * f.getDenomindor2());
    }

    public void dividir(Fraccion f) {
        System.out.println(f.getNumerador1() * f.getDenomindor2() + "\n"
                + "------"
                + "\n" + f.getNumerdor2() * f.getDenominador1());
    }
}