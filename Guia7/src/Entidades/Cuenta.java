/*
Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular".
Luego, crea un método "retirar_dinero" que permita retirar una cantidad
de dinero del saldo de la cuenta. Asegúrate de que el saldo nunca sea
negativo después de realizar una transacción de retiro
 */
package Entidades;

import java.util.Scanner;

/**
 * Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular". Luego,
 * crea un método "retirar_dinero" que permita retirar una cantidad de dinero
 * del saldo de la cuenta. Asegúrate de que el saldo nunca sea negativo después
 * de realizar una transacción de retiro.
 */

public class Cuenta {
    private double saldo = 10000;
    private String titular = "Aldana Ucci";
    Scanner leer = new Scanner(System.in);

    
    
    public Cuenta() {
    }
    
    public Cuenta(double saldoInicial, String titular) {
        this.saldo = saldoInicial;
        this.titular = titular;
    }

    public void retirar_dinero() {
       
        double cantidad = 0;
        
        do {
            System.out.println("Ingrese la cantidad de dinero que quiera retirar.");
            System.out.print("$");
            
            cantidad = leer.nextDouble();  
            if (cantidad <= saldo) {
            saldo -= cantidad; 
            System.out.println("El saldo de la cuenta de " + titular + " es " + saldo);
            break;
        } else {
            System.out.println("No hay suficiente saldo para realizar la transacción.");
                System.out.println("Su dinero en la cuenta es de: $" + saldo);
        }
            
        } while (cantidad > saldo);
        
               
              
        
    }

    public double obtener_saldo() {
        return saldo;
    }

    public String obtener_titular() {
        return titular;
    }
}