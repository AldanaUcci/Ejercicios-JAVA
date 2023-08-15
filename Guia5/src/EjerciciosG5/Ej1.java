/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

/**
 *
 * @author AldiLee
 */
public class Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int Enteros[] = new int[100];
        for (int i = 0; i < 100; i++) {
            Enteros [i] = i+1;
        }
        for (int i = 99; i >=0 ; i--) {
            System.out.print("["+ Enteros[i]+"]");
        }
    }
    
}
