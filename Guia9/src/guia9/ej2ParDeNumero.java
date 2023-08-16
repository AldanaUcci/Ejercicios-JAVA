/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9;

import Servicios.ParDeNumerosService;

/**
 *
 * @author AldiLee
 */
public class ej2ParDeNumero {


    public static void main(String[] args) {
        ParDeNumerosService n1 = new ParDeNumerosService();
        n1.mostrarValores();
        n1.devolverMayor();
        n1.calcularPotencia();
        n1.calcularRaiz();
    }
    
}