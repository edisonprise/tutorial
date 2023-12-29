package org.tutorial.tuto;

import static org.tutorial.tuto.Utils.*;

public class SwitchCase {
    public static void main(String[] args) {
        /*String elDiadeHoy = input("Que dia es hoy? ");
        switch (elDiadeHoy) {
            case "Lunes": {
                println("Hoy toca lavar ropa.");
                break;
            }
            case "Martes": {
                println("Hoy toca ver series");
                break;
            }
            case "Miercoles": {
                println("Hoy toca ver subir video al canal");
                break;
            }
            case "Jueves": {
                println("Hoy toca ir al Cine");
                break;
            }
            case "Viernes": {
                println("Hoy se sale a la discoteca");
                break;
            }
            case "Sabado": {
                println("Hoy se modea");
                break;
            }
            case "Domingo": {
                println("Hoy toca ir a la playa");
                break;
            }
            default: {
                println("No escribiste un dia de la semana, intenta de nuevo");
            }
        }*/

        int numero = inputInt("Escribe un digito del 1 al 10:  ");
        switch (numero) {
            case 2:
            case 4:
            case 6:
            case 8:
            case 10:{
                println("Es un numero Par");
                break;
            }
            case 1:
            case 3:
            case 5:
            case 7:
            case 9: {
                println("Es un numero Impar");
                break;
            }
            default: {
                println("No escribiste un numero valido, intenta de nuevo");
            }
        }
    }
}
