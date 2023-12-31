package preguntas;

class Panda {
    int edad;
    static {
        System.out.println("Hello");
    }
    Panda() {
        System.out.println(edad);
        edad = 10;
    }
    {
        System.out.println(edad);
        edad = 4;
    }
}

public class Pregunta3 {
    static {
        System.out.println("La pregunta 3");
    }

    public static void main(String[] args) {
        //Funciona este programa? Que va a pasar si lo ejecuto?

        System.out.println("Aca empieza el main");
        Panda unPanda = new Panda();
        System.out.println(unPanda.edad);
    }
}
