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
public class ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        double euros;
        String cambio,a;
        System.out.println("ingrese cantidad de euros que quiera convertir");
        euros = Leer.nextInt();
        System.out.println("a que moneda desea cambiarlo?");
        System.out.println("LIBRA");
        System.out.println("DOLAR");
        System.out.println("YEN");
        a=Leer.nextLine();
        cambio = Leer.nextLine();
        cambio = cambio.toUpperCase();
        Libra(euros, cambio);
        
    }
    public static void Libra (double euros, String cambio){
        double resultado;
        switch (cambio){
            case "LIBRA":
                resultado = euros*0.86;
                System.out.println("La cantidad de libras es: " + resultado);
                break;
            case "DOLAR":
                resultado = euros*1.28611;
                System.out.println("La cantidad de dolares es: " + resultado);
                break;
            case "YEN":    
                resultado= euros*129.852;
                System.out.println("La cantidad de yenes es: " + resultado);
                break;
        }
    }
}
