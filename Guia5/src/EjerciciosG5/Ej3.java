/*
 * Recorrer un vector de N enteros contabilizando cuántos números son de
1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author AldiLee
 */
public class Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner leer=new Scanner(System.in);
        int n,cont1=0,cont2=0,contvec=0, cont3=0, cont4=0, cont5=0 ; String aux;
        System.out.println("ingrese el tamaño del vector");
        n=leer.nextInt();
        int vec[]=new int[n];
        
        for (int i = 0; i < n; i++) {
            vec[i]=(int)(Math.random()*10000);
            System.out.print("["+vec[i]+"]");
            contvec++;
            if (contvec==10) {
                System.out.println("");
                contvec=0;
            }
            if (String.valueOf(vec[i]).length()==1) {
                cont1++;
            }else if(String.valueOf(vec[i]).length()==2){
                cont2++;
            }else if(String.valueOf(vec[i]).length()==2){
                cont2++;
        }else if(String.valueOf(vec[i]).length()==3){
                cont3++;
        }else if(String.valueOf(vec[i]).length()==4){
                cont4++;
        }else if(String.valueOf(vec[i]).length()==5){
                cont5++;
        }
        }
        System.out.println("");
        System.out.println("se encotraron "+cont1+" números de 1 digito");
        System.out.println("se encotraron "+cont2+" números de 2 digitos");
        System.out.println("se encotraron "+cont3+" números de 3 digitos");
        System.out.println("se encotraron "+cont4+" números de 4 digitos");
        System.out.println("se encotraron "+cont5+" números de 5 digitos");
    }
    }
