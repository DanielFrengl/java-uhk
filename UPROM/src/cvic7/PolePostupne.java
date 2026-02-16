package cvic7;

import java.io.PrintStream;
import java.util.Scanner;


/**
 * Krabicka, ktera uchovava pole spolu s poctem obsazenych prvku
 */
class PoleBox {
    int[] pole;
    int pocet;
}

public class PolePostupne {

    public static Scanner vstup = new Scanner(System.in);
    public static PrintStream vystup = System.out;

    public static void main(String[] args) {


        PoleBox mojePole = vytvorPoleBox(10);
        pridejCislo(mojePole, 128);
        pridejCislo(mojePole, 249);
        pridejCislo(mojePole, 3330);
        vlozNaPozici(mojePole, 1, 15);

        vypis(mojePole);
        vypis(mojePole);
    }

    private static PoleBox vytvorPoleBox(int kapacita) {
        PoleBox p = new PoleBox();
        p.pole = new int[kapacita];
        p.pocet = 0;
        return p;
    }


    /**
     * Pridava prvek na prvni volnou pozici
     *
     * @param p     polebox, kam pridavame
     * @param cislo hodnota,kterou pridavame
     * @return index nove pridane hodnoty, nebo -1, kdyz je kapacita vycerpana
     */

    private static int pridejCislo(PoleBox p, int cislo) {

        if (p.pocet == p.pole.length) {
            return -1;
        }


        p.pole[p.pocet++] = cislo;
        return p.pocet - 1;

    }


    private static void vypis(PoleBox p) {
        for (int i = 0; i < p.pocet; i++) {
            vystup.printf("%d ", p.pole[i]);
            if (i > p.pocet - 1) {
                vystup.println(",");
            }
        }
    }

    private static int vlozNaPozici(PoleBox p, int pozice, int cislo) {
        if (p.pocet == p.pole.length || pozice > p.pocet) { //pokud je plno, nebo index je mimo
            return -1;
        }

        for (int i = p.pocet - 1; i >= pozice; i--) {
            p.pole[i + 1] = p.pole[i];

        }
        p.pole[pozice] = cislo;
        p.pocet++;
        return pozice;
    }


    private static int smazat(PoleBox p, int pozice) {
        if (pozice >= p.pole.length) {
            return -1;
        }
            // sesun pole odzadu o jeden prvek az do "pozice"
            for (int i = pozice; i < p.pocet-1; i++) {
                    p.pole[i] = p.pole[i+1];
                }
            p.pocet--; // zmensi pocet prvku o 1
            return 0;

        }
}



