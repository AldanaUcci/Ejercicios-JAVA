/*
 * Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del
1 al 9 donde la suma de sus filas, sus columnas y sus diagonales son
idénticas. Crear un programa que permita introducir un cuadrado por
teclado y determine si este cuadrado es mágico o no. El programa
deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author AldiLee
 */
public class Ej6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        int mat[][] = new int[3][3];
        int vectorFila[] = new int[3];
        int vectorColumna[] = new int[3];
        int n, sumaFila, sumaColumna, diagonal1 , diagonal2;
        boolean bandera = true;
        System.out.println("Ingrese numeros del 1 al 9");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                n = Leer.nextInt();
                if (n > 0 && n < 10) {
                    mat[i][j] = n;
                } else {
                    System.out.println("El numero esta fuera de rango");
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("");
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + mat[i][j] + "]");
            }
        }
        System.out.println("");

        for (int i = 0; i < 3; i++) {
            sumaFila = 0;
            sumaColumna = 0;
            for (int j = 0; j < 3; j++) {
                sumaFila = sumaFila + mat[i][j];
                sumaColumna = sumaColumna + mat[j][i];
            }
            vectorFila[i] = sumaFila;
            vectorColumna[i]= sumaColumna;
        }
        diagonal1=mat[0][0]+mat[1][1]+mat[2][2];
        diagonal2=mat[0][2]+mat[1][1]+mat[2][0];
        for (int i = 0; i < 3; i++) {
            if (vectorFila[i]!=vectorColumna[i] || vectorFila[i]!=diagonal1 || vectorColumna[i]!=diagonal2||diagonal1!=diagonal2){
                bandera=false;
                break;
            }
        }
            System.out.println("La matriz es magica? "+ bandera);
      
    }
}
