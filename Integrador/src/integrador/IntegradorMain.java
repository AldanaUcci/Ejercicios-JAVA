
package integrador;

import ServicioIntegrador.EstudianteService;

/**
 *
 * @author AldiLee
 */
public class IntegradorMain {


    public static void main(String[] args) {
        EstudianteService curso = new EstudianteService();
        curso.mostrarPromedioMayor();
    }
}
