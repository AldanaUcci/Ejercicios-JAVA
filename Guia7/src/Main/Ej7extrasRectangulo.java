/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej7extras;

import Entidades.Rectangulo1;

/**
 *
 * @author AldiLee
 */
public class Ej7extras {

    /**
     * @param args the command line arguments
     */
  public static void main(String[] args) {
        Rectangulo1 rectangulo1 = new Rectangulo1(4, 6);
        System.out.println("El area del rectangulo es: " + rectangulo1.calcular_area());
    }
}