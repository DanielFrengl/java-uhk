package cvic6;

import java.io.PrintStream;
import java.util.Scanner;

public class Fibonnaci {
    public static Scanner vstup = new Scanner(System.in);
    public static PrintStream vystup = System.out;


    public int fibonnaci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonnaci(n - 1) + fibonnaci(n - 2);
    }

    public static void main(String[] args) {
        vystup.println("Zadejte cislo:");
        int cislo = vstup.nextInt();


        Fibonnaci calculator = new Fibonnaci();

        int vysledek = calculator.fibonnaci(cislo);

        vystup.println("Vysledek: " + vysledek);

    }
}