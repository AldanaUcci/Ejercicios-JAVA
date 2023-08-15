/*
 * Crear una función rellene un vector con números aleatorios, pasándole
un arreglo por parámetro. Después haremos otra función o
procedimiento que imprima el vector
 */
package ejerciciosExtras;

/**
 *
 * @author AldiLee
 */
public class Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int n=3;
        int vec []=new int [n];
      
        llenar(vec,n);
        mostrar(vec,n);
    }
    public static void llenar (int[] vec, int n){
        for (int i = 0; i < n; i++) {
            vec[i]=(int)(Math.random()*10);     
        }
        
}
      public static void mostrar (int[]vec, int n){
        for (int i = 0; i < n; i++) {
            System.out.print(vec[i]);
        }
          System.out.println("");
}
}
