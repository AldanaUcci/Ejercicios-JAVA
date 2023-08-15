/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Cafetera;
import java.util.Scanner;

/**
 *
 * @author AldiLee
 */
public class servicioCafetera {

    private Scanner leer = new Scanner(System.in);
    Cafetera c1 = new Cafetera();
    int taza, capacidad;

    public void llenarCafetera() {
        c1.setCapacidadMaxima(1000);
        c1.setCantidadActual(c1.getCapacidadMaxima());
        System.out.println("Cafetera llenada");
    }

    public int servirTaza() {
        System.out.println("Bienvenidos a Egg cafeteria!");
        System.out.println("Ingrese tamaño de la taza a llenar");
        taza = leer.nextInt();
        System.out.println("Sirviendo taza....");
        if (taza > c1.getCantidadActual()) {
            System.out.println("su taza se lleno con: " + c1.getCantidadActual() + "ml.");
            c1.setCantidadActual(0);
        } else {
            System.out.println("Su taza se ha llenado de cafe con  éxito.");
            c1.setCantidadActual(c1.getCantidadActual() - taza);
        }
        System.out.println("En la cafetera queda " + c1.getCantidadActual() + " ml de cafe");
        return c1.getCantidadActual();
    }

    public void vaciarCafetera() {
        c1.setCantidadActual(0);
        System.out.println("Se ha vaciado la cafetera.");
    }

    public int agregarCafe() {
        System.out.println("Cuanto cafe desea agregar?");

        c1.setCantidadActual(c1.getCantidadActual() + leer.nextInt());
        if (c1.getCantidadActual() > c1.getCapacidadMaxima()) {
            System.out.println("Su cafetera se ha llenado de mas.");
            c1.setCantidadActual(c1.getCapacidadMaxima());
        } else {
            System.out.println("La cantidad de cafe actual es de: " + c1.getCantidadActual() + "ml");
        }
        return c1.getCantidadActual();
    }
}
