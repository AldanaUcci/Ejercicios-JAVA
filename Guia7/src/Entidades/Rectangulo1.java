/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author AldiLee
 */
public class Rectangulo1 {
    public double lado1;
    public double lado2;

        public Rectangulo1(int lado1, int lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public double calcular_area() {
        double area;
        area = lado1 * lado2;
        return area;
    }
}
