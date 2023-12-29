package org.tutorial.tuto;

import static org.tutorial.tuto.Utils.*;

public class Comparaciones {
    public static void main(String[] args) {
        int precioPanPanaderia1 = 2000;
        int precioPanPanaderia2 = 2600;

        println((precioPanPanaderia1 > precioPanPanaderia2) + "");
        println((precioPanPanaderia1 < precioPanPanaderia2) + "");
        println((precioPanPanaderia1 == precioPanPanaderia2) + "");
        println((precioPanPanaderia1 <= precioPanPanaderia2) + "");
        println((precioPanPanaderia1 >= precioPanPanaderia2) + "");
        int a = 10;
        int b = 15;
        int c = 10;
        println((a == c) + "");
        println((b >= c) + "");
        println((a <= c) + "");
        println((b <= c) + "");
        println((2.6 >= 1.4) + "");
        println(("Edinson" == "Emilio") + "");
        println(("Edinson" == "Edinson") + "");
        println(("Edinson".equals("Edinson")) + "");



    }
}
