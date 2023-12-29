package org.tutorial.tuto;

import static org.tutorial.tuto.Utils.*;

public class MisVariablesEstaticas {

    public static String nombre = "Edinson";

    public static void main(String[] args) {

        saludarEnCastellano();
        saludarEnIngles();
    }

    public static void saludarEnCastellano() {
        println("Feliz Cumpleaños " + nombre);
    }

    public static void saludarEnIngles() {
        println("Happy Brirthday " + nombre);
    }
}
