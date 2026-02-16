package sablona;

import java.io.PrintStream;
import java.util.Scanner;


public class SablonaPole {

    public static Scanner vstup = new Scanner(System.in);
    public static PrintStream vystup = System.out;


    private static void vypisPole(int[] pole) {
        for (int i = 0; i < pole.length; i++) {
            vystup.print(pole[i]);
            if (i != pole.length - 1) {
                vystup.print(", ");
            }
        }
    }

    public static int[] vytvorNahodnePole(int pocet, int min, int max) {

        int[] p = new int[pocet];

        for (int i = 0; i < pocet; i++) {
            p[i] = (int) (Math.random() * (max - min + 1) + min);

        }
        return p;

    }

    public static int[] vytvorPoleZKlavesnice(int pocet) {
        int[] p = new int[pocet];
        for (int i = 0; i < p.length; i++) {
            vystup.printf("Zadejte cislo v pozici %s\n", i + 1);
            p[i] = vstup.nextInt();
        }
        return p;
    }


    public static int[] sectiSudePozice(int[] pole) {
        int soucet = 0;
        for (int i = 0; i < pole.length; i++) {
            if (pole[i] % 2 == 0) {
                soucet+=pole[i];
            }
        }
        return new int[]{soucet, soucet};
    }


    public static void main(String[] args) {


        int[] pole = vytvorPoleZKlavesnice(6);
        vypisPole(pole);

    }


}


