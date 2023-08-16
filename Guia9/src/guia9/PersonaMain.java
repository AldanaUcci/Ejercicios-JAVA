package guia9;

import Entidades.Persona;
import Servicios.PersonaService;

public class PersonaMain {

    public static void main(String[] args) {
        
        PersonaService servicio = new PersonaService();
        Persona p = servicio.crearPersona();
        int edad = servicio.calcularEdad(p);
        System.out.println(servicio.menorQue(edad));
        servicio.mostrarPersona(p, edad);
    }

}
