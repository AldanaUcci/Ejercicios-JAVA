/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author AldiLee
 */
public class Ahorcado {
    private char palabra[];
    private int letras, vidas;

    public Ahorcado() {
        this.letras = palabra.length;
    }

    public Ahorcado(char[] palabra, int letras, int vidas) {
        this.palabra = palabra;
        this.letras = letras;
        this.vidas = vidas;
        
    }

    public char[] getPalabra() {
        return palabra;
    }

    public void setPalabra(char[] palabra) {
        this.palabra = palabra;
    }

    public int getLetras() {
        return letras;
    }

    public void setLetras(int letras) {
        this.letras = letras;
    }

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }
    
    
}
