package Servicios;

import Entidades.Persona;
import java.util.Date;
import java.util.Scanner;

public class PersonaService {

    private Scanner leer = new Scanner(System.in);

    public Persona crearPersona() {
        int anio, mes, dia;
        String nombre;
        System.out.println("ingrese su nombre");
        nombre = leer.nextLine();
        System.out.println("ingrese dia de nacimiento");
        dia = leer.nextInt();
        System.out.println("ingrese mes de nacimiento");
        mes = leer.nextInt();
        System.out.println("ingrese año de nacimiento");
        anio = leer.nextInt();
        Date fecha = new Date(anio - 1900, mes - 1, dia);

        return new Persona(nombre, fecha);

    }
   
//    long dif = Math.abs(fechaActual().getTime() - p.getFechaNac().getTime());//valor absoluto de la fecha actual y la fecha de nacimiento.
//        
//        long diff = TimeUnit.DAYS.convert(dif, TimeUnit.MILLISECONDS);//transforma tiempo en dias.
//        
//        return diff/365;//transforma dias en años.
    public int calcularEdad (Persona p){
        int anio1,anio2,dif;
        anio1 = p.getFecha().getYear();
        anio2 = new Date().getYear();
        dif = anio2 - anio1;
        if (new Date().before(new Date(anio2, p.getFecha().getMonth(), p.getFecha().getDate()))) {
             dif--;
        }
        return dif;
    }
    
    public boolean menorQue (int edad){
        int edadaux;
        System.out.println("la persona es menor que: ");
        edadaux = leer.nextInt();
        if (edad>=edadaux) {
            return false;
        }
        return true;
    }
    
    public void mostrarPersona (Persona p , int edad){
       System.out.println("el nombre de la persona es: "+p.getNombre()
                + "\nla edad es : "+edad
                + "\nFecha de nacimiento:"
                + "\n----->"+p.getFecha());
    }
    

}
