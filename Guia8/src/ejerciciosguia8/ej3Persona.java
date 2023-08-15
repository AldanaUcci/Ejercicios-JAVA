/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosguia8;

import Servicios.servicioPersona;

/**
 *
 * @author AldiLee
 */
public class ej3Persona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       boolean[] pEdad = new boolean [4];
        int[] pIMC = new int [4];
        
        System.out.println("Primer persona:");
        servicioPersona sp1 = new servicioPersona();
        sp1.crearPersona();
        pEdad[0]=sp1.esMayorDeEdad();
        pIMC[0]=sp1.calcularIMC();
        sp1.traducir();
        
        System.out.println("Segunda persona:");
        servicioPersona sp2 = new servicioPersona();
        sp2.crearPersona();
        pEdad[1]=sp2.esMayorDeEdad();
        pIMC[1]=sp2.calcularIMC();
        sp2.traducir();

        System.out.println("Tercer persona:");
        servicioPersona sp3 = new servicioPersona();
        sp3.crearPersona();
        pEdad[2]=sp3.esMayorDeEdad();
        pIMC[2]=sp3.calcularIMC();
        sp3.traducir();

        System.out.println("Cuarta persona:");
        servicioPersona sp4 = new servicioPersona();
        sp4.crearPersona();
        pEdad[3]=sp4.esMayorDeEdad();
        pIMC[3]=sp4.calcularIMC();
        sp4.traducir();
        
    porcentajeEdad(pEdad);
    porcentajeIMC(pIMC);
    
    }

    public static void porcentajeEdad(boolean[] pEdad){
        double con=0;
        for (int i = 0; i < 4; i++) {
            if (pEdad[i]==true){
                con++;
            }
        }
        
        System.out.println("Porcentaje de mayores de edad: " + (con*100/4));
        System.out.println("Porcentaje de menores de edad: " + ((4-con)*100/4));
    }
    
    public static void porcentajeIMC(int[] pIMC){
        double con1=0,con0=0;
        for (int i = 0; i < 4; i++) {
            if (pIMC[i]==1){
                con1++;
            } else if (pIMC[i]==0) {
                con0++;
            }
        }
        
        System.out.println("Porcentaje por debajo IMC: " + (con1*100/4));
        System.out.println("Porcentaje con IMC ideal: " + (con0*100/4));
        System.out.println("Porcentaje por encima IMC: " + ((4-con1-con0)*100/4));
    }
    }
    

