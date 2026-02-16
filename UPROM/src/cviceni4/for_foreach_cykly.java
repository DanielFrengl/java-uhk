package cviceni4;

import java.io.PrintStream;
import java.util.Scanner;

public class for_foreach_cykly {

    public static Scanner vstup = new Scanner(System.in);
    public static PrintStream vystup = System.out;
    static int soucet = 0;

    public static void main(String[] args) {

        vystup.printf("Kolik budeme pocitat cisel?");
        int pocet = vstup.nextInt();


        for (int i = 0; i <= pocet; i++) {
            vystup.printf("Zadej %d. hodnotu: ", i+1);
            int c = vstup.nextInt();
            soucet += c;

        }


        vystup.printf("Soucet cisel je: %d\n", soucet);
        vystup.printf("Prumer cisel je: %f\n", soucet / (double) 10);


    }
}
