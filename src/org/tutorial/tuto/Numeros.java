package org.tutorial.tuto;

import static org.tutorial.tuto.Utils.println;

public class Numeros {
    public static void main(String[] args) {
        println(2);
        println(2 + 2);
        println("2 + 2");
        println("2" + "2");
        println(3 * 2);
        println(10 - 5 );
        println(10 / 3 );
        println(10 / 200 );
        println(20.5 + 2.1);
        println(20.5 + 10);
        println(10 / 3.0);

        int numero = 3;
        double conDecimales = 10.5;
        float esOtroDecimal = 10.5f;
        double resultado = numero + conDecimales;
        println(resultado);
        println("El resultado es: " + resultado);
        String resultadoConTexto = "El resultado es: " + resultado;
        println(resultadoConTexto);

    }
}
