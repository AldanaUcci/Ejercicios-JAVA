package Entidades;

import java.util.Scanner;

public class Curso {

    private String NombreCurso;
    private double cantidadHorasPorDia, precioPorHora;
    private int cantidadDiasPorSemana;
    private String turno;
    private String alumnos[] = new String[5];

    public Curso() {
    }

    public Curso(String NombreCurso, double cantidadHorasPorDia, double precioPorHora, int cantidadDiasPorSemana, String turno) {
        this.NombreCurso = NombreCurso;
        this.cantidadHorasPorDia = cantidadHorasPorDia;
        this.precioPorHora = precioPorHora;
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
        this.turno = turno;
    }

    public String getNombreCurso() {
        return NombreCurso;
    }

    public void setNombreCurso(String NombreCurso) {
        this.NombreCurso = NombreCurso;
    }

    public double getCantidadHorasPorDia() {
        return cantidadHorasPorDia;
    }

    public void setCantidadHorasPorDia(double cantidadHorasPorDia) {
        this.cantidadHorasPorDia = cantidadHorasPorDia;
    }

    public double getPrecioPorHora() {
        return precioPorHora;
    }

    public void setPrecioPorHora(double precioPorHora) {
        this.precioPorHora = precioPorHora;
    }

    public int getCantidadDiasPorSemana() {
        return cantidadDiasPorSemana;
    }

    public void setCantidadDiasPorSemana(int cantidadDiasPorSemana) {
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }

    public void cargarAlumnos() {
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < alumnos.length; i++) {
            System.out.println("ingrese el nombre del " + (i + 1) + " alumno");
            alumnos[i] = leer.nextLine();
        }
    }
//    Método crearCurso(): el método crear curso, le pide los valores de los atributos al usuario y después se le asignan
    //a sus respectivos atributos para llenar el objeto Curso. En este método invocamos al método cargarAlumnos() 
    //para asignarle valor al atributo alumnos
//

    public void crearCurso() {

        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese nombre del curso");
        NombreCurso = leer.nextLine();
        System.out.println("ingrese cantidad de horas por dia");
        cantidadHorasPorDia = leer.nextDouble();
        System.out.println("ingrese cantidad de dias por semana");
        cantidadDiasPorSemana = leer.nextInt();
        System.out.println("ingrese precio por hora");
        precioPorHora = leer.nextDouble();
        System.out.println("ingrese turno");
        leer.next();
        turno = leer.nextLine();
        cargarAlumnos();

    }
//    Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia en una semana por curso. 
//            Para ello, se deben multiplicar la cantidad de horas por día, el precio por hora, la cantidad de alumnos y 
//            la cantidad de días a la semana que se repite el encuentro.

    public void calcularGananciaSemanal() {
        double ganancia = cantidadHorasPorDia * precioPorHora * cantidadDiasPorSemana * alumnos.length;
        System.out.println("su ganancia semanal es de: ARS$" + ganancia);
    }
}
