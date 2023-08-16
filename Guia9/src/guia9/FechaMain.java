/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9;

import Servicios.FechaService;
import java.util.Date;


public class FechaMain {

  
    public static void main(String[] args) {

        FechaService fecha = new FechaService();
        Date fechaNacimiento = fecha.fechaNacimiento();
        Date fechaActual = fecha.fechaActual();
        System.out.println(fechaNacimiento);
        System.out.println(fechaActual);
        fecha.diferencia(fechaActual, fechaNacimiento);

    }

}
