/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Raices;
import java.util.Scanner;

/**
 *
 * @author AldiLee
 */
public class servicioRaices {

    private Scanner leer = new Scanner(System.in);
    Raices raiz = new Raices();

    public void darValor() {
        System.out.println("ingrese valor de 'a'");
        raiz.setA(leer.nextDouble());
        System.out.println("ingrese valor de 'b'");
        raiz.setB(leer.nextDouble());
        System.out.println("ingrese valor de 'c'");
        raiz.setC(leer.nextDouble());
    }

    public double getDiscriminante() {
        return (Math.pow(raiz.getB(), 2) - 4 * raiz.getA() * raiz.getC());
    }

    public boolean tieneRaices() {
        return getDiscriminante() > 0;
    }

    public boolean tieneRaiz() {
        return getDiscriminante() == 0;
    }

    public void obtenerRaices() {
        double res1, res2;
        if (tieneRaices()) {
            res1 = (-raiz.getB() + Math.sqrt(Math.pow(raiz.getB(), 2) - (4 * raiz.getA() * raiz.getC())) / 2 * raiz.getA());
            res2 = (-raiz.getB() - Math.sqrt(Math.pow(raiz.getB(), 2) - (4 * raiz.getA() * raiz.getC())) / 2 * raiz.getA());
            System.out.println("raiz 1: " + res1 + " raiz 2: " + res2);
        } 

    }

    public void obtenerRaiz() {
        double res1;
        if (tieneRaiz()) {
            res1 = (-raiz.getB() / (2 * raiz.getA()));
            System.out.println("raiz: " + res1);
        }
    }

    public void Calcular() {
        darValor();
        if (tieneRaices()) {
            obtenerRaices();
        } else if (tieneRaiz()) {
            obtenerRaiz();
        }else {
            System.out.println("No tiene solucion");
        }

    }
}
