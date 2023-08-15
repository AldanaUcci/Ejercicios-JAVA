/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia4;

import java.util.Scanner;

/**
 *
 * @author AldiLee
 */
public class Guia4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        String frase;
        System.out.println("Ingrese frase");
        frase = Leer.nextLine();
        String codificada=Codificar (frase);
        System.out.println("La secuencia codificada es: " + codificada);
    }
    public static String Codificar(String cadena){
        String codificada = "";
        cadena = cadena.toLowerCase();
        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);
            switch (c){
                case 'a':     
                   codificada = codificada.concat("@");
                   break;
                case 'e':   
                   codificada = codificada.concat("#");
                   break;
                case 'i':    
                   codificada = codificada.concat("$");
                   break;
                case 'o':    
                   codificada = codificada.concat("%");
                   break;
                 case 'u':
                   codificada = codificada.concat("*");
                   break;
                 default: 
                     codificada = codificada.concat(String.valueOf(c));
            } 
        }
        return codificada;
}
}
  