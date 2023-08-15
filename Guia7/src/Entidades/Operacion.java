/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operacion;

import java.util.Scanner;

/**
 *
 * @author AldiLee
 */
public class Operacion {

    Scanner leer = new Scanner(System.in);
    private double numero1;
    private double numero2;

    public Operacion() {
    }

    public Operacion(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    public void crearOperacion() {
        System.out.println("Ingrese dos numeros");
        numero1 = leer.nextDouble();
        numero2 = leer.nextDouble();
    }

    public void sumar() {
        double suma;
        suma = numero1 + numero2;
        System.out.println("El resultado de la suma es : " + suma);

    }

    public void resta() {
        double resta = numero1 - numero2;
        System.out.println("El resultado de la resta es : " + resta);
    }

    public void multiplicar() {
        double multiplicar;
        if (numero1 == 0 || numero2 == 0) {
            multiplicar = 0;
            System.out.println("Error Burrito");
        } else {
            multiplicar = numero1 * numero2;
            System.out.println("El resultado de la multiplicacion es : " + multiplicar);
        }

    }

    public void dividir() {
        double dividir;
        if (numero1 == 0 || numero2 == 0) {
            dividir = 0;
            System.out.println("Error Burrito");
        } else {
            dividir = numero1 / numero2;
            System.out.println("El resultado de la division es : " + dividir);
            
        }

    }
}
    

