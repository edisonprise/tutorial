package org.tutorial.tuto;

import static org.tutorial.tuto.Utils.*;

public class EjVoid {
    public static void main(String[] args) {
        //saludar(input("Ingresa tu nombre: "), input("Ingresa tu apellido: "));
        pronosticoDelDia();
    }

    public static void saludar(String nombre, String apellido) {
        println("Hola " + nombre + " " + apellido + "! Bienvenid@ a nuestro tutorial de Java");
    }

    public static void pronosticoDelDia() {
        println("Buscando informacion en el servidor...");
        println("La temperatura de hoy es 24 grados.");
        println("Guardando la temperatura en la base de datos local.");
    }
}
