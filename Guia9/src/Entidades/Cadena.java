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
public class Cadena {

    private String frase;
    private int longit;

    public Cadena() {
    }

    public Cadena(String frase) {
        this.frase = frase;
        this.longit= frase.length();
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongit() {
        return longit;
    }

    public void setLongit(int longit) {
        this.longit = longit;
    }

}
