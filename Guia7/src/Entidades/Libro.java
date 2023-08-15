/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7;

import java.util.Scanner;

/**
 *
 * @author AldiLee
 */
public class Libro {
    
    public int ISBN;
    public String titulo;
    public String autor;
    public int numPag;

    public Libro() {
    }

    public Libro(int ISBN, String titulo, String autor, int numPag) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numPag = numPag;
    }
    
    public void cargarLibro() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el número de ISBN: ");
        this.ISBN = scanner.nextInt();
        
        System.out.println("Ingrese el título del libro: ");
        scanner.nextLine();
        this.titulo = scanner.nextLine();
        
      
        System.out.println("Ingrese el autor del libro: ");
        this.autor = scanner.nextLine();
        
        System.out.println("Ingrese el número de páginas del libro: ");
        this.numPag = scanner.nextInt();
    }
     public void devolverData() {   
        System.out.println("ISBN: "+ ISBN);
        System.out.println("titulo: " + titulo);
        System.out.println("autor: " + autor);
        System.out.println("cantidad de paginas: " + numPag);

    }
}

    


    

