package org.tutorial.tuto;

import static org.tutorial.tuto.Utils.*;

public class IndiceMasaCorporal {
    public static void main(String[] args) {
        print("Cual es tu altura (en metros): ");
        double alturaMetros = inputDouble();
        int pesoKg = inputInt("Cual es tu peso ( en Kg): ");

        double indiceMasaCorporal = indiceMasaCorporal(alturaMetros, pesoKg);
        println("Tu indice de masa corporal es: " + indiceMasaCorporal);

    }

    public static double indiceMasaCorporal(double alturaMetros, int pesoKg) {
        return pesoKg / (Math.pow(alturaMetros, 2));
    }
}
