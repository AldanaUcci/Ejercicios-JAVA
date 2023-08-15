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
/**Diseñe una función que pida el nombre y la edad de N personas
 * e imprima los datos de las personas ingresadas por teclado e 
 * indique si son mayores o menores de edad.
 * Después de cada persona, el programa debe preguntarle al usuario
 * si quiere seguir mostrando personas y frenar cuando el usuario 
 * ingrese la palabra “No”.
 */
public class Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
      Mom ();
        
    }
    public static void Mom (){
        
        Scanner Leer = new Scanner(System.in);
        String conf, nombre;
        int edad;
        do {
            System.out.println("Ingrese nombre de la persona");
             nombre = Leer.nextLine();
            System.out.println("ingrese edad de la persona");
             edad = Leer.nextInt();
             Leer.nextLine();
             if (edad<18){
                 System.out.println(nombre + " es menor de edad.");
             }else {
                 System.out.println(nombre +" es mayor de edad");
             }
             System.out.println("Quiere seguir mostrando personas? S/N");
             conf = Leer.nextLine();
             conf = conf.toUpperCase();
             if (conf.equals("N")){
                 System.out.println("Hasta luego");
                 break;
             }
        } while (!conf.equals("N"));
        
      
    }
}
