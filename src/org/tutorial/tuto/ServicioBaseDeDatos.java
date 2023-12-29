package org.tutorial.tuto;

import static org.tutorial.tuto.DatabaseConexion.DATABASE_URL;
import static org.tutorial.tuto.Utils.*;

public class ServicioBaseDeDatos {
    public static void main(String[] args) {
        String resultado = buscarInformacionEnBD();
        println("Busqueda terminada " + resultado);
    }

    public static String buscarInformacionEnBD(){
        println("Buscando la informacion en la base de datos con url: " + DATABASE_URL);
        return "Informacion 123456789";
    }
}
