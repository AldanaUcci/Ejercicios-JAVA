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
public class Meses {

    private String meses[] = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
    private String mesOculto = meses[7];

    Scanner leer = new Scanner(System.in);

    public Meses() {
    }

    public Meses(String meses[], String mesOculto) {
        this.meses = meses;
        this.mesOculto = mesOculto;
    }

    public void adivinarMes() {
        String mes;
        do {
            System.out.println("adivine el mes oculto");
            mes = leer.nextLine().toLowerCase();
            if (mes == mesOculto) {
                System.out.println("Adivinaste!");
            } else {
                System.out.println("Incorrecto");
            }
        } while (!mes.equals(mesOculto));

    }
  
}
