
package Servicios;

import java.util.Arrays;


public class ArrayService {

    //Método inicializarA recibe un arreglo por parámetro y lo inicializa con números aleatorios.
    public void inicializarA(double[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = Math.random() * (50) - 25;
        }
    }

    public void mostrar(double[] a) {
        for (double i : a) {
            System.out.print("[ " + i + "] ");
        }
        System.out.println("");
    }

//    public void ordenar(double[] a) {
//        double c [] = new double [a.length];
//        Arrays.sort(a);
//        for (int i = 0; i < a.length; i++) {
//            c[i] = a [a.length -i -1];
//        }
//        for (int i = 0; i < a.length; i++) {
//            
//        }
//    }
   //* Arrays.sort(arr, Comparator.reverseOrder()); --> lo da vuelta
    
    public void ordenar(double[] a) {
        Arrays.sort(a);
        double aux;
        for (int i = 0; i < a.length / 2; i++) {
            aux = a[i];
            a[i] = a[a.length - i - 1];
            a[a.length - i - 1] = aux;
        }
    }

    public void inicializarB(double[] a, double[] b) {
        Arrays.fill(b, 0.5);
        for (int i = 0; i < 10; i++) {
            b[i] = a[i];
        }

        //forma de copiar y rellenar arrays.
//         public void IncializarB(double[] a, double[] b) {
//        double num = 0.5;
//        System.arraycopy(a, 0, b, 0, b.length);
//        Arrays.fill(b, 10, b.length, num);
//        
//    }
    }
    //forma de clonar arrays:

//    public void ordenar(double[] a) {
//        int num = 0;
//        double[] c = a.clone();
//        Arrays.sort(c);
//        for (int i = c.length - 1; i >= 0; i--) {
//            a[num] = c[i];
//            num++;
//     }
//    }
}
