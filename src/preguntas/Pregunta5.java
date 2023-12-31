package preguntas;
import java.util.ArrayList;
import java.util.List;

public class Pregunta5 {
    public static void main(String[] args) {
        //Que lineas compilan correctamente?

        List<Rana> anfibios = crearRanas();
        //List<Anfibio> anfibios2 = crearRanas();
        List<? extends Rana> anfibios3 = crearRanas();
        List<? extends Anfibio> anfibios4 = crearRanas();
        //List<? extends RanaDeDarwin> anfibios5 = crearRanas();
        //List<? extends Sapobledore> anfibios6 = crearRanas();

        anfibios.forEach(anfibio -> {
            anfibio.nadar();
            anfibio.saltar();
        });
    }

    static List<Rana> crearRanas() {
        RanaDeDarwin rana1 = new RanaDeDarwin();
        Sapobledore rana2 = new Sapobledore();
        return new ArrayList<Rana>() {{add(rana1); add(rana2);}};
    }
}

interface Anfibio {
    default void nadar() {}
}

abstract class Rana implements Anfibio {
    void saltar() {}
}

class RanaDeDarwin extends Rana {}
class Sapobledore extends Rana {}