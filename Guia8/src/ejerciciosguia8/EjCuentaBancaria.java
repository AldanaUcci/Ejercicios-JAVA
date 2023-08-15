/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosguia8;

import Servicios.ServicioCuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author AldiLee
 */
public class EjCuentaBancaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
        int num = 0;
        ServicioCuentaBancaria c1 = new ServicioCuentaBancaria();
        System.out.println("ingrese una opcion para comenzar:");
        
        do {
             System.out.println("opcion 1 = crear una cuenta");
             System.out.println("opcion 2 = ingresar dinero");
             System.out.println("opcion 3 = retirar dinero");
             System.out.println("opcion 4 = extraccion rapida ");
             System.out.println("opcion 5 = consultar saldo ");
             System.out.println("opcion 6 = consultar los datos de la cuenta");
             System.out.println("opcion 7 = salir");
             num = leer.nextInt();
        switch(num){
           case 1: 
               c1.crearCuenta();
               break;
           case 2:
               c1.ingresar();
               break;
           case 3:
               c1.retirar();
               break;
           case 4:
               c1.extraccionRapida();
               break;
           case 5:
               c1.consultarSaldo();
               break;
           case 6:
               c1.consultarDatos();
               break;
           default :
               System.out.println("hasta luego");
               break;
               
       } 
        } while (num>0&&num<7);
        
 
    }
    
    }
    
