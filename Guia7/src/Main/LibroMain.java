/*
 *Crear una clase llamada Libro que contenga los siguientes atributos:
ISBN, Título, Autor, Número de páginas, y un constructor con todos los
atributos pasados por parámetro y un constructor vacío. Crear un
método para cargar un libro pidiendo los datos al usuario y luego
informar mediante otro método el número de ISBN, el título, el autor del
libro y el número de páginas.
 */
package guia7;

/**
 *
 * @author AldiLee
 */
public class Guia7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Libro guia7 = new Libro ();
        guia7.cargarLibro();
        guia7.devolverData();
    }
    }