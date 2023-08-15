/*
 Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular".
Luego, crea un método "retirar_dinero" que permita retirar una cantidad
de dinero del saldo de la cuenta. Asegúrate de que el saldo nunca sea
negativo después de realizar una transacción de retiro
 */
package ej5extras;

import Entidades.Cuenta;

/**
 * Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular". Luego,
 * crea un método "retirar_dinero" que permita retirar una cantidad de dinero
 * del saldo de la cuenta. Asegúrate de que el saldo nunca sea negativo después
 * de realizar una transacción de retiro.
 *
 */
public class Cuenta_Ej5Extra {

    public static void main(String[] args) {
        
        
        Cuenta miCuenta = new Cuenta();
        miCuenta.retirar_dinero();
        
    }

}