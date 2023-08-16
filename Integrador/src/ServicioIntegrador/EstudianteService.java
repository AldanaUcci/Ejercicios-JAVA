/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServicioIntegrador;

import Entidades.Estudiante;

public class EstudianteService {

    Estudiante e1 = new Estudiante("pepito", 6);
    Estudiante e2 = new Estudiante("maxi", 6);
    Estudiante e3 = new Estudiante("facu", 6);
    Estudiante e4 = new Estudiante("rox", 7);
    Estudiante e5 = new Estudiante("aldana", 6);
    Estudiante e6 = new Estudiante("juan", 9);
    Estudiante e7 = new Estudiante("pedro", 6);
    Estudiante e8 = new Estudiante("carlos", 10);

    Estudiante clase[] = {e1, e2, e3, e4, e5, e6, e7, e8};

    public double calcularPromedioCurso() {
        double suma = 0, promedio;
        for (int i = 0; i < clase.length; i++) {
            suma += clase[i].getNota();
        }
        promedio = suma / 8;
        System.out.println("el promedio del curso es: " + promedio);
        return promedio;
    }
    
public String[] mayorPromedio() {
    double promedio = calcularPromedioCurso();
    int cont = 0;
        for (Estudiante clase1 : clase) {
            if (clase1.getNota() > promedio ){
                cont++;
            }
        }
    String[] promedioMayor = new String[cont];
    int k = 0;
    for (int j = 0; j < clase.length; j++) {
        if (clase[j].getNota() > promedio) {
            promedioMayor[k] = clase[j].getNombre();
            k++;
        }
    }
    return promedioMayor;
}
public void mostrarPromedioMayor (){
    String[] promedioMayor = mayorPromedio();
    for (int i = 0; i < promedioMayor.length; i++) {
        System.out.println(promedioMayor[i]);
    }
}
}
