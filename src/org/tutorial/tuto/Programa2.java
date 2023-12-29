package org.tutorial.tuto;

import static org.tutorial.tuto.Utils.*;

public class Programa2 {
    public static void main(String[] args) {
        int age = inputInt("Cual es tu edad? ");
        int limiteEdad = 18;
        int senior = 65;
        int ultraAnciano = 100;
        if(age < limiteEdad) {
            println("No tienes la edad suficiente");
        } else if (age >= limiteEdad && age < senior) {
            println("Puedes pasar a la disco, buen perreo");
        } else if (age < ultraAnciano) {
            println("Te felicito por seguir con tanta energia!");
        } else {
            println("Eres de verdad??");
        }
    }
}
