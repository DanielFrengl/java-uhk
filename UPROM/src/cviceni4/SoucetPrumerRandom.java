package cviceni4;

import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;

public class SoucetPrumerRandom {

    public static Scanner vstup = new Scanner(System.in);
    public static PrintStream vystup = System.out;
    static Random random = new Random();
    static int soucet = 0;

    public static void main(String[] args) {



        vystup.printf("Kolik budeme pocitat cisel?");
        int pocet = vstup.nextInt();


        for (int i = 0; i <= pocet; i++) {
            int c = random.nextInt(100)+1;
            vystup.printf("%d, ", c);
            soucet += c;

        }


        vystup.printf("Soucet cisel je: %d\n", soucet);
        vystup.printf("Prumer cisel je: %f\n", soucet / (double) 10);


    }
}
