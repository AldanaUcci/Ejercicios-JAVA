
package guia9;

import Servicios.ArrayService;

public class Arrays {


    public static void main(String[] args) {
        double a [] = new double [50];
        double b [] = new double [20];
        ArrayService c = new ArrayService();
        c.inicializarA(a);
        c.mostrar(a);
        c.ordenar(a);
        c.inicializarB(a, b);
        c.mostrar(a);
        c.mostrar(b);
    }
    
}
