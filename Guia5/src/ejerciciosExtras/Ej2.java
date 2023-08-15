/*
 * Escriba un programa que averigüe si dos vectores de N enteros son
iguales (la comparación deberá detenerse en cuanto se detecte alguna
diferencia entre los elementos)

 */
package ejerciciosExtras;

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
        Scanner Leer = new Scanner(System.in);
        int n;
        System.out.println("ingrese tamaño del vector");
        n= Leer.nextInt();
        int vec[]=new int[n];
        int vec1[]=new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("ingrese valor para la posicion ["+i+"]");
            System.out.println("vector 1");
            vec[i]= Leer.nextInt();
            System.out.println("vector 2");
            vec1[i]=Leer.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (vec[i]==vec1[i]){
                System.out.println("El valor de la posicion ["+i+"] del primer vector es igual al del segundo vector.");
            }else{
                System.out.println("El valor de la posicion ["+i+"] del primer vector es diferente a la del segundo vector");
                break;
            }
            
        }
     }
    
}
