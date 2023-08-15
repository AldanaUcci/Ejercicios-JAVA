/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej2guia7;

import java.util.Scanner;

/**
 *
 * @author AldiLee
 */
public class Circunferencia {
    Scanner Leer = new Scanner(System.in);
    private double radio;
    private double area;
    private double perimetro;
    
    public Circunferencia() {
    }

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    public void CrearCircunferencia(){
        System.out.println("ingrese radio de la circunferencia");
        radio = Leer.nextDouble();
    }
    public void CalcularArea(){
        area = Math.PI*(radio*radio);
        System.out.println("area del circulo: " + area);
    }
    public void CalcularPerimetro(){
        perimetro = 2*Math.PI*radio;
        System.out.println("perimetro de la circunferencia: " + perimetro);
    }
    
}
