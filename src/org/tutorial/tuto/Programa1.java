package org.tutorial.tuto;

import static org.tutorial.tuto.Utils.*;

public class Programa1 {
    public static void main(String[] args) {
        String nameUser = input("Hola, Ingresa tu nombre: ");
        int age = inputInt("Ingresa tu edad: ");

        println("Hola " + nameUser + "!" + "," + "Tu edad es " + age);
    }
}
