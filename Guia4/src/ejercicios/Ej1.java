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
public class Ej1 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        double num, num1;
        int opc;
        String conf = "N";
        System.out.println("Ingrese dos numeros positivos");
        num = leer.nextDouble();
        num1 = leer.nextDouble();
        do {
            System.out.println("Seleccione una opcion");
            System.out.println("MENU");
            System.out.println("1: SUMAR");
            System.out.println("2: RESTAR");
            System.out.println("3: MULTIPLICAR");
            System.out.println("4: DIVIDIR");
            System.out.println("5: SALIR");
            opc = leer.nextInt();
            switch (opc){
                case 1 : 
                    System.out.println("El resultado de la suma es "+ Suma(num,num1) );
                    break;
                case 2:
                    System.out.println("El resultado de la resta es "+ Resta(num,num1));
                    break;
                case 3:
                    System.out.println("El resultado de la multiplicacion es: "+ Multiplicacion(num,num1));
                    break;
                case 4:
                    System.out.println("El resultado de la division es: "+ Division(num,num1));
                    break;
                case 5:
                    System.out.println("Esta seguro que desea salir del programa? S/N");
                    conf = leer.next().toUpperCase();
                    if (conf.equals("S")){
                        System.out.println("Saliendo...");
                        break;
                            }
            }
            
        } while (!"S".equals(conf));
  }
     public static double Suma (double num, double num1){
         double resultado;
         resultado=(num+num1);
         return resultado;
     }
     public static double Resta (double num, double num1){
         double resultado;
         resultado=(num-num1);
         return resultado;
     }
     public static double Multiplicacion (double num, double num1){
         double resultado;
         resultado=(num*num1);
         return resultado;
     }
     public static double Division (double num, double num1){
         double resultado;
         resultado=(num/num1);
         return resultado;
     }
}

