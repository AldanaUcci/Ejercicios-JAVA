/*
 * Crea una clase "Juego" que tenga un método "iniciar_juego" que permita
a dos jugadores jugar un juego de adivinanza de números. El primer
jugador elige un número y el segundo jugador intenta adivinarlo. El
segundo jugador tiene un número limitado de intentos y recibe una pista
de "más alto" o "más bajo" después de cada intento. El juego termina
cuando el segundo jugador adivina el número o se queda sin intentos.
Registra el número de intentos necesarios para adivinar el número y el
número de veces que cada jugador ha ganado.

 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author AldiLee
 */
public class Juego {

    private int num;
    private int num1;
    Scanner leer = new Scanner(System.in);

    public Juego() {
    }

    public Juego(int num, int num1) {
        this.num = num;
        this.num1 = num1;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void iniciarJuego() {
        System.out.println("PRIMER JUGADOR: Ingrese un numero -> ");
        num = leer.nextInt();
        System.out.println("SEGUNDO JUGADOR: Tiene 3 intentos par adivinar el numero que ingreso el jugador 1");
        for (int i = 3; i > 0; i--) {
            System.out.println("SEGUNDO JUGADOR: Ingrese un numero ->");
            num1 = leer.nextInt();
            if (num == num1) {
                System.out.println("GANASTE");
                break;
            }  else if (i == 1) {
                    System.out.println("PERDISTE");
            }else if (num != num1 && num > num1) {
                System.out.println("INCORRECTO, es mas alto, te quedan " + (i - 1) + " intentos");
            } else if (num != num1 && num < num1) {
                System.out.println("INCORRECTO, es mas bajo, te quedan " + (i - 1) + " intentos");
               
                }
            }

        }

    public String getContG() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getContP() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }

