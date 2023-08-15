/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosguia8;

import Entidades.NIF;
import Servicios.ServicioNIF;

/**
 *
 * @author AldiLee
 */
public class Ej2extraNIF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioNIF servicio = new ServicioNIF();
        NIF b = servicio.crearNIF();
        servicio.mostrar(b);

    }

}
