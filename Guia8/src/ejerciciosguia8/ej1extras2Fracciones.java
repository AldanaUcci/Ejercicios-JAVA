/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosguia8;

import Entidades.Fraccion;
import Servicios.FraccionServicio;
import java.util.Scanner;

/**
 *
 * @author AldiLee
 */
public class ej1extras2Fracciones {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FraccionServicio fs = new FraccionServicio();
        int op, a, b, c, d;
        System.out.println("Ingrese el numerador 1");
        a = sc.nextInt();
        System.out.println("Ingrese el denominador 1");
        b = sc.nextInt();
        System.out.println("Ingrese el numerador 2");
        c = sc.nextInt();
        System.out.println("Ingrese el denominador 2");
        d = sc.nextInt();

        Fraccion f = new Fraccion(a, b, c, d);
        do {
            System.out.println("Elija opcion \n"
                    + "1-Sumar fraccion \n"
                    + "2-Restar \n"
                    + "3-Multiplicar \n"
                    + "4-Dividir \n"
                    + "5-Salir");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    fs.sumar(f);
                    break;
                case 2:
                    fs.restar(f);
                    break;
                case 3:
                    fs.multiplicar(f);
                    break;
                case 4:
                    fs.dividir(f);
                    break;
                case 5:
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("Opicon erronea");
            }
        } while (op != 5);
    }
}