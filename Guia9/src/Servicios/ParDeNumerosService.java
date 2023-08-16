/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.ParDeNumeros;
import java.util.Scanner;

public class ParDeNumerosService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ParDeNumeros n = new ParDeNumeros();

    public void mostrarValores() {
        System.out.println("el numero 1 es igual a: " + n.getNum1());
        System.out.println("el numero 2 es igual a: " + n.getNum2());
    }

    public Integer devolverMayor() {
        if (n.getNum1().compareTo(n.getNum2()) > 0) {
            System.out.println("el primer numero es mayor");
            return n.getNum1();
        } else if (n.getNum1().compareTo(n.getNum2()) < 0) {
            System.out.println("el segundo numero es mayor");
            return n.getNum2();
        }
        return 0;
    }

    public void calcularPotencia() {
        int n1 = Math.round(n.getNum1());
        int n2 = Math.round(n.getNum2());
        if (n.getNum1() > n.getNum2()) {
            System.out.println("la potencia es igual a: " + Math.pow(n1, n2));
        } else {
            System.out.println("la potencia es igual a: " + Math.pow(n2, n1));
        }
    }

    public void calcularRaiz() {
        int n1 = Math.abs(n.getNum1());
        int n2 = Math.abs(n.getNum2());
        if (n1 > n2) {
            System.out.println("la raiz cuadrada es igual a : " + Math.sqrt(n2));
        } else {
            System.out.println("la raiz cuadrada es igual a : " + Math.sqrt(n1));
        }
    }

}