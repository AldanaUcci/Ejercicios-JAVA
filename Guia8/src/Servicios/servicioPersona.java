/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author AldiLee
 */
public class servicioPersona {

    Persona p1 = new Persona();
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public int num;

    public void crearPersona() {
        System.out.println("Ingrese el nombre de la persona:");
        p1.setNombre(leer.nextLine());
        do {
            System.out.println("Ingrese la edad de la persona:");
            p1.setEdad(leer.nextInt());
        } while (p1.getEdad() < 0);

        do {
            System.out.println("Ingrese el sexo de la persona:");
            p1.setSexo(leer.next().toUpperCase());

            if (!p1.getSexo().equals("H") && !p1.getSexo().equals("M") && !p1.getSexo().equals("O")) {
                System.out.println("Sexo no reconocido.");
            }
        } while (!p1.getSexo().equals("H") && !p1.getSexo().equals("M") && !p1.getSexo().equals("O"));

        do {
            System.out.println("Ingrese la altura de la persona:");
            p1.setAltura(leer.nextDouble());
        } while (p1.getAltura() < 0);

        do {
            System.out.println("Ingrese el peso de la persona:");
            p1.setPeso(leer.nextDouble());
        } while (p1.getPeso() < 0);
    }

    public boolean esMayorDeEdad() {
        return p1.getEdad() >= 18;
    }

    public int calcularIMC() {

        double IMC = p1.getPeso() / Math.pow(p1.getAltura(), 2);
        if (IMC < 20) {
            num = -1;
            return num;
        } else if (IMC >= 20 && IMC <= 25) {
            num = 0;
            return num;
        } else {
             num = 1;
            return num;
        }
    }

    public void traducir() {
        if (p1.getEdad() >= 18) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }

        switch (num) {
            case 1:
                System.out.println("Está por encima de su peso ideal.");
                break;
            case -1:
                System.out.println("Está por debajo de su peso ideal.");
                break;
            case 0:
                System.out.println("Está en su peso ideal.");
                break;
        }

    }
}
