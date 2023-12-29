package org.tutorial.tuto;

import static org.tutorial.tuto.Utils.*;

public class Functions {
    public static void main(String[] args) {
        int agePersona = inputInt("Que edad tienes? ");
        if(esMayorDeEdad(49)) {
            println("Si eres mayor de edad");
        } else {
            println("Aun no eres mayor de edad");
        }
    }

    public static boolean esMayorDeEdad(int agePersona) {
        return agePersona >= 21;

    }
}
