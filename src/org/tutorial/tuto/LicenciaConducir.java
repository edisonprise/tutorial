package org.tutorial.tuto;

import static org.tutorial.tuto.Functions.esMayorDeEdad;
import static org.tutorial.tuto.Utils.*;

public class LicenciaConducir {
    public static void main(String[] args) {
        int edad = inputInt("Enter your age: ");
        if(esMayorDeEdad(edad)) {
            println("You are allowed to drive");
        } else {
            println("You are not allowed to drive");
        }
    }
}
