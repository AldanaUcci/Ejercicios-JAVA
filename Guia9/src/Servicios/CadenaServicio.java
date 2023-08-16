package Servicios;

import Entidades.Cadena;
import java.util.Scanner;

public class CadenaServicio {

    private Scanner leer = new Scanner(System.in);
    Cadena frac = new Cadena();
    
    

    public void mostrarVocales(Cadena frac) {

        int vocal = 0;
        for (int i = 0; i < frac.getLongit(); i++) {

            switch (frac.getFrase().toLowerCase().substring(i, i + 1)) {
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                    vocal += 1;
                    break;
            }
        }
        System.out.println(vocal);
    }

}
