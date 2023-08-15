/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author AldiLee
 */
public class ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        double n;
        System.out.println("Ingrese un numero para saber si es primo");
        n= Leer.nextDouble();
        System.out.println(Primo (n));
    }
    public static boolean Primo (double n){
        boolean res=true;
        for (int i = 2; i < n; i++) {
         if (n%i==0){
            res= false;
            break;
        }
         }
        return res;
        }
}
