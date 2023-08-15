/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

//import Entidades.NIF;
import Entidades.NIF;
import java.util.Scanner;

/**
 *
 * @author AldiLee
 */
public class ServicioNIF {

   private Scanner leer = new Scanner(System.in);
   private String[] letras = {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};

    public NIF crearNIF() {
        NIF a = new NIF();
        System.out.println("ingrese numero de DNI");
        a.setDNI(leer.nextLong());
        a.setLetra(letras[(int)a.getDNI()%23]);
        return a;
    }
    public void mostrar(NIF nif){
        System.out.println("Su NIF es: "+ nif.getDNI() + "-" + nif.getLetra());
    }
}
