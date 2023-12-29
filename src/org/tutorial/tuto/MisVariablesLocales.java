package org.tutorial.tuto;

import static org.tutorial.tuto.Utils.*;

public class MisVariablesLocales {
    public static void main(String[] args) {
        int numero = 123456789;
        String direccion ="alameda 12345";

        llamarNumero(numero);

        enviarCarta(direccion);

        println("Direccion en main " + direccion);



    }
    public static void enviarCarta(String direccion) {
        println("LLamando al numero " + direccion);
        direccion = "Washington 456";
        println("NuevaDireccion en main " + direccion);
    }
    public static void llamarNumero(int whatsapp) {
        println("LLamando al numero " + whatsapp);
    }
}
