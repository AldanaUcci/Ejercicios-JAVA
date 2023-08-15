/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author AldiLee
 */
public class Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("ingrese el tamaño del vector");
        int cont=0;
        Scanner leer = new Scanner(System.in);
        int aux = leer.nextInt();

        int vector[] = new int[aux];

        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 10);

        }
        System.out.println("ingrese un numero para buscar");

        int buscar = leer.nextInt();
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == buscar) {
                System.out.println("el numero que ingresaste esta en la posicion " + i + " del vector");
                cont++;
            }

        }
        if (cont>1) {
            System.out.println("el numero se repite "  + cont +" veces");
            
        }
        for (int elemento : vector) {

            System.out.println(elemento);
        }
    }
}