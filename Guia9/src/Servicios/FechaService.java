
package Servicios;

import java.util.Date;
import java.util.Scanner;

public class FechaService {
    
    private Scanner leer = new Scanner(System.in);
    
    public Date fechaNacimiento(){
       
        int dia, mes, anio;
        System.out.println("ingrese dia de su nacimiento");
        dia = leer.nextInt();
        System.out.println("ingrese mes de su nacimiento");
        mes = leer.nextInt();
        System.out.println("ingrese año de su nacimiento");
        anio = leer.nextInt();
        return new Date (anio-1900,mes-1,dia);
        
    }
    public Date fechaActual(){
        return new Date();
    }
    public void diferencia (Date a, Date b){
        System.out.println("su edad es: "+ (a.getYear()-b.getYear()));
    }
//    public int diferencia(Date f1, Date f2) {
//        int anio1,anio2,dif;
//        anio1 = f1.getYear();anio2 = f2.getYear();dif = anio2 - anio1;
//        if (f2.before(new Date((int) anio2, f1.getMonth(), f1.getDate())))  {
//            dif--;
//        }
//        return dif;
}

