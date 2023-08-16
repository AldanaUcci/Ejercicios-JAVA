/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Ahorcado;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author AldiLee
 */
public class AhorcadoService {

    private int encontradas = 0;
    String aux[];
    private Scanner leer = new Scanner(System.in);
    Ahorcado juego;

    /**
     * seteamos en palabra lo ingresado por el usuario, seteamos en vidas la
     * cantidad ingresada por el usuario
     */
    public void crearJuego() {

        System.out.println("ingrese una palabra");
        juego.setPalabra(leer.nextLine().toCharArray());
        System.out.println("ingrese cantidad de vidas");
        juego.setVidas(leer.nextInt());
        juego = new Ahorcado();
    }

    /**
     * mostramos con un get y el atributo "letras" la longitud de la palabra.
     */
    public void longitud() {
        System.out.println("Longitud de la palabra: " + juego.getLetras());
    }

    /**
     * Método buscar(letra): este método recibe una letra dada por el usuario y
     * busca si la letra ingresada es parte de la palabra o no. También
     * informará si la letra estaba o no.
     */
    public void buscar(char letra) {
        boolean bandera = false;
        for (int i = 0; i < juego.getLetras(); i++) {
            if (letra == juego.getPalabra()[i]) {
                bandera = true;
                break;
            }
        }
        if (bandera) {
            System.out.println("Mensaje: La letra pertenece a la palabra");
        } else {
            System.out.println("Mensaje: La letra no pertenece a la palabra");
        }
    }

    /**
     * Método encontradas(letra): que reciba una letra ingresada por el usuario
     * y muestre cuantas letras han sido encontradas y cuántas le faltan. Este
     * método además deberá devolver true si la letra estaba y false si la letra
     * no estaba, ya que, cada vez que se busque una letra que no esté, se le
     * restará uno a sus oportunidades.
     */
    public boolean encontradas(char letra) {
        boolean bandera = false;
        for (int i = 0; i < juego.getLetras(); i++) {
            if (letra == juego.getPalabra()[i]) {
                encontradas++;
                bandera = true;
            }
        }
        System.out.println("Numero de letras encontradas: " + encontradas + "\n"
                + "Numero de letras faltantes: " + (juego.getLetras() - encontradas));
        return bandera;
    }

    /**
     * Método intentos(): para mostrar cuántas oportunidades le queda al
     * jugador.
     */
    public void intentos() {
        System.out.println("Numero de oportunidades restantes: " + juego.getVidas());
    }

    /**
     * Método juego(): el método juego se encargará de llamar todos los métodos
     * previamente mencionados e informará cuando el usuario descubra toda la
     * palabra o se quede sin intentos. Este método se llamará en el main.
     */
    public void fillAux() {
        aux = new String[juego.getLetras()];
        for (int i = 0; i < aux.length; i++) {
            aux[i] = " _ ";

        }
    }

    public void mostrar(char letra) {

        for (int i = 0; i < juego.getLetras(); i++) {
            if (juego.getPalabra()[i] == letra) {
                aux[i] = String.valueOf(letra);
            }
        }
        System.out.println("Estado actual: " + Arrays.toString(aux));
    }

    public void juego() {
        crearJuego();
        longitud();
        fillAux();
        do {
            System.out.println("ingrese una letra ");
            char letra = leer.next().charAt(0);
            buscar(letra);
            if (!encontradas(letra)) {
                juego.setVidas(juego.getVidas() - 1);
            }
            intentos();
            mostrar(letra);
        } while (juego.getVidas() != 0 && encontradas != juego.getLetras());
        if (juego.getVidas() == 0) {
            System.out.println("Te quedaste sin intentos");
        } else {
            System.out.println("GANASTE!");
        }

    }
}
