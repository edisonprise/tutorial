package org.tutorial.tuto;

import static org.tutorial.tuto.Utils.*;

public class OperadoresBooleanos {
    public static void main(String[] args) {
        boolean estaSoleado = false;
        int temperaturaHoy = 22;
        boolean esMayora25LaTemp = temperaturaHoy >= 25;

        boolean puedoIrALaPlaya = estaSoleado && esMayora25LaTemp;
        println("puedoIrALaPlaya? " + puedoIrALaPlaya);

        boolean estaAbiertaPanaderiaCarlitos = false;
        boolean estaAbiertaPanaderiaMaria = true;

        boolean hayAlgunaPanaderiaAbierta = estaAbiertaPanaderiaCarlitos || estaAbiertaPanaderiaMaria;
        println("hayAlgunaPanaderiaAbierta? " + hayAlgunaPanaderiaAbierta);

        println(!false + "");
    }
}
