/*
 * Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios
y muestre la traspuesta de la matriz. La matriz traspuesta de una matriz
A se denota por B y se obtiene cambiando sus filas por columnas (o
viceversa).
 */
package Ejercicios;

/**
 *
 * @author AldiLee
 */
public class Ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //llenar matriz
        int mat[][]=new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                mat[i][j] = (int) (Math.random()*10+1);
            }
        }
        //mostrar matriz
        for (int i = 0; i < 4; i++) {
             System.out.println("");
            for (int j = 0; j < 4; j++) {
                System.out.print("["+mat[i][j]+"]");
            }
        }
        //mostrar traspuesta
        System.out.println("");
             for (int i = 0; i < 4; i++) {
             System.out.println("");
            for (int j = 0; j < 4; j++) {
                System.out.print("["+mat[j][i]+"]");
            }      
        }
             System.out.println("");
    }
} 

