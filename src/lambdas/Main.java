package lambdas;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numeros = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int sumaTotal = reducir(numeros, (a, b) -> a + b, 0);
        int sumaTotal1 = reducir(numeros, (a, b) -> {
            System.out.println(a+b);
           return a + b;
        }, 0);

        System.out.println("La suma total es: " + sumaTotal);
        System.out.println("La suma total es: " + sumaTotal1);

        int multiplicacionTotal = reducir(numeros, (a, b) -> a * b, 1);
        System.out.println("La multiplicacion total es: " + multiplicacionTotal);

        int sumaTotalJava = Arrays.stream(numeros).reduce(0,(a, b) -> a + b);
        System.out.println("La suma total es: " + sumaTotalJava);
    }
    static int  reducir(int[] numeros, OperacionDe2Num operacion, int inicial) {
        int acumulador = inicial;
        for(int numero : numeros) {
            acumulador = operacion.aplicar(numero, acumulador);
        }
        return acumulador;
    }
}
