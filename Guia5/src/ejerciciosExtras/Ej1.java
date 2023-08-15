/*
 * Realizar un algoritmo que calcule la suma de todos los elementos de un
vector de tamaño N, con los valores ingresados por el usuario
 */
package ejerciciosExtras;

import java.util.Scanner;

/**
 *
 * @author AldiLee
 */
public class Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        int n,x,acum=0;
        System.out.println("Ingrese tamaño del vector");
        n=Leer.nextInt();
        int vec[] = new int[n];
        System.out.println("Ingrese valores del vector");
        for (int i = 0; i < n; i++) {
            x = Leer.nextInt();
           vec[i]=x;       
           acum=acum+x;
        }
        System.out.println("La suma de los digitos de su vector es: "+acum);
    }
    
    
    
}
