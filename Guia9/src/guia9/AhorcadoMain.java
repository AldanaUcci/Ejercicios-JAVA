/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9;

import Servicios.AhorcadoService;

/**
 *
 * @author AldiLee
 */
public class AhorcadoMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AhorcadoService ahorcado = new AhorcadoService();
        ahorcado.juego();
    }
    
}
