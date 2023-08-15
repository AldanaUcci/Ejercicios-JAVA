/*
 * Realice un programa que compruebe si una matriz dada es antisimétrica.
Se dice que una matriz A es antisimétrica cuando ésta es igual a su
propia traspuesta, pero cambiada de signo. Es decir, A es antisimétrica si
A = -AT. La matriz traspuesta de una matriz A se denota por AT y se
obtiene cambiando sus filas por columnas (o viceversa)

 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author AldiLee
 */
public class Ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        int mat[][] = new int[3][3];
        boolean bandera = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Ingrese valor para el lugar [" + i + "]" + "[" + j + "]");
                mat[i][j] = Leer.nextInt();
            }
        }
        //mostrar matriz
        for (int i = 0; i < 3; i++) {
            System.out.println("");
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + mat[i][j] + "]");
            }
        }

        System.out.println("");
        for (int i = 0; i < 3; i++) {
            System.out.println("");
            for (int j = 0; j < 3; j++) {
                if (mat[i][j] != -1 * mat[j][i]) {
                    bandera = false;
                }
            }
        }
        if (bandera == true) {
            System.out.println("La matriz es antisimetrica");
        } else {
            System.out.println("La matriz no es antisimetrica");
        }

    }
}
