/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author AldiLee
 */
public class ServicioCuentaBancaria {

    private Scanner leer = new Scanner(System.in);
    double saldo = 0;
    double retiro = 0;
    double retiror = 0;
    CuentaBancaria c1 = new CuentaBancaria();

    public void crearCuenta() {
        System.out.println("ingrese su numero de cuenta");
        c1.setNumeroDeCuenta(leer.nextInt());
        System.out.println("ingrese su dni");
        c1.setDni(leer.nextLong());
    }

    public double ingresar() {

        System.out.println("cuanto dinero va a ingresar?");
        c1.setSaldoActual(leer.nextInt());
        saldo = saldo + c1.getSaldoActual();
        System.out.println("su saldo actualizado es: " + saldo);
        return saldo;
    }

    public double retirar() {
        System.out.println("cuanto dinero va a retirar?");
        retiro = leer.nextDouble();
        if (retiro > saldo) {
            System.out.println("el monto a retirar es mayor a su saldo actual");
            System.out.println("su retiro sera: " + saldo);
            saldo = 0;
            System.out.println("su saldo actual es de 0");

        } else {
            System.out.println("su retiro es de: " + retiro);
            saldo -= retiro;
            System.out.println("su saldo actual es de: " + saldo);

        }
        return saldo;
    }

    public double extraccionRapida() {
        System.out.println("esto es una extraccion rapida");
        System.out.println("no se debe retirar mas del 20% del saldo");
        System.out.println("el retiro no debe ser mayor de: " + (saldo * 0.2));

        do {
            System.out.println("cuanto desea retirar?");

            retiror = leer.nextDouble();

        } while (retiror > (saldo * 0.2));
        saldo -= retiror;
        System.out.println("su saldo actual es de: " + (saldo));

        return saldo;

    }

    public void consultarSaldo() {
        System.out.println("su saldo actual es: " + saldo);
    }

    public void consultarDatos() {
        System.out.println("el dni de esta cuenta es: " + c1.getDni());
        System.out.println("el numero de cuenta es: " + c1.getNumeroDeCuenta());

    }

}
