package cvic7;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class pripravaZapocet2 {

    public static Scanner vstup = new Scanner(System.in);
    public static PrintStream vystup = System.out;

    public static void mocniny(int n) {
        for (int i = 0; i <= n; i++) {
            int vysledek = (int)(Math.pow(i, 2));
            vystup.println(vysledek);
        }

    }

    public static float pocetVyher(float[] mojeSkore, float[] ciziSkore, float minRozdil) {
        if (mojeSkore.length != ciziSkore.length) {
            return -1;
        }

        float vysledek = 0;

        for (int i = 0; i < mojeSkore.length; i++) {
            if (mojeSkore[i] - ciziSkore[i] >= minRozdil) {
                vysledek++;
            }
        }
        return vysledek;
    }

    public static void pocetVelkychObrazku(int[] px){
        int vysledek = 0;
        for (int i = 0; i <= px.length-1; i+=2) {
            if (px[i] * px[i+1] >= 1000000) {
                vysledek++;
            }
        }
        System.out.println(vysledek);
    }

    public static int ovladlAdamek(int[] adamek, int[] barta, int[] cibulka) {
        int vysledek = 0;
        if (adamek.length != barta.length || cibulka.length != barta.length) {
            return -1;
        }

        for (int i = 0; i < adamek.length; i++) {
            if (adamek[i] > ((adamek[i] + barta[i]) + cibulka[i])/2) {
                vysledek++;
            }
        }
        System.out.println(vysledek);
        return vysledek;
    }

    public static void swap(int[] pole, int pozize1, int pozize2) {
        if (pozize1 > pole.length - 1 || pozize2 > pole.length - 1) {
            return;
        }
        int tmp = pole[pozize1];
        pole[pozize1] = pole[pozize2];
        pole[pozize2] = tmp;
    }

    public static int[] swap2(int[] pole, int pozize1, int pozize2) {
        if (pozize1 > pole.length - 1 || pozize2 > pole.length - 1) {
            return pole;
        }
        int tmp = pole[pozize1];
        pole[pozize1] = pole[pozize2];
        pole[pozize2] = tmp;
        return pole;
    }

    public static void najdi(int h) {

        int x = 0;

        do {
            int i = x++;
            Math.pow(i, 2);
        }

        while  (i >= h);

    }


    public static void main(String[] args) {
        {
            mocniny(11);

            int[]px = new int[]{1000,2000,1000,2000,1000,3000};
            pocetVelkychObrazku(px);

            int[]poleCisel = new int[]{1,2,3,4,5};
            swap(poleCisel,0,6);
            vystup.printf(Arrays.toString(poleCisel));

        }
    }
}
