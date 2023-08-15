/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5;

import java.util.Scanner;

/**
 *
 * @author AldiLee
 */
public class Guia5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        String Equipo[] = new String [5];
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese nombre del integrante del equipo");
            Equipo[i] = Leer.next();
            
        }
        for (int i = 0; i < 5; i++) {
            System.out.print("[" + Equipo[i]+ "]");
            
            
        }
    }
    
}
