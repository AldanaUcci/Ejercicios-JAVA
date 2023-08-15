/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosguia8;

import Servicios.servicioCafetera;
import java.util.Scanner;

/**
 *
 * @author AldiLee
 */
public class ej2Cafetera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        servicioCafetera aldana = new servicioCafetera();
        Scanner leer = new Scanner(System.in);
        int num;
        System.out.println("BIENVENIDOS A LA CAFETERA DE ALDANA!");
        do {
            System.out.println("1 = Llenar cafetera." + "\n"
                    + "2 = Servir taza" + "\n"
                    + "3 = Vaciar cafetera" + "\n"
                    + "4 = Agregar cafe" + "\n"
                    + "5 = Salir");
            num = leer.nextInt();
            switch (num) {
                case 1:
                    aldana.llenarCafetera();
                    break;
                case 2:
                    aldana.servirTaza();
                    break;
                case 3:
                    aldana.vaciarCafetera();
                    break;
                case 4:
                    aldana.agregarCafe();
                    break;
                default:
                    System.out.println("Gracias por utilizar el servicio de Aldana Cafeteras. Nos vemos pronto :).");

            }
        } while (num > 0 && num < 5);

    }

}
