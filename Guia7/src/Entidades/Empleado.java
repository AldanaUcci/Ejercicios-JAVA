/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author AldiLee
 */
public class Empleado {

    public String Empleado;
    public int Edad;
    public double Salario;
    Scanner leer = new Scanner(System.in);

    public Empleado(int Edad, double Salario) {
        this.Edad = Edad;
        this.Salario = Salario;
    }

    public Empleado() {
    }

    public void setEmpleado() {
        System.out.println("Ingrese el nombre del empleado");
        Empleado = leer.nextLine();
        System.out.println("Ingrese la edad del empleado");
        Edad = leer.nextInt();
        System.out.println("Ingrese su salario");
        Salario = leer.nextDouble();
    }

    public void calcular_aumento() {
        if (Edad >= 30) {
            System.out.println("El aumento de su salario es de 10%");
            System.out.println("Su salario actualizado seria de: $" + Salario * 1.1);
        } else {
            System.out.println("El aumento de su salario es de 5%");
            System.out.println("Su salario actualizado seria de: $" + Salario * 1.05);
        }
    }

}