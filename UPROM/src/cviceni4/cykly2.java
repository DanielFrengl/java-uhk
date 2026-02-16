package cviceni4;


import java.io.PrintStream;
import java.util.Scanner;

public class cykly2 {

    public static Scanner vstup = new Scanner(System.in);
    public static PrintStream vystup = System.out;
    static int soucet = 0;

    public static void main(String[] args) {

        int c;
        int cislo;
        int pocet = 0;
        do {
            vystup.printf("Zadej %d. hodnotu: ", pocet + 1);
            c = vstup.nextInt();
            if (c != 0) {
                soucet += c;
                pocet++;
            }

        } while (c != 0);

        vystup.printf("Soucet cisel je: %d\n", soucet);
        vystup.printf("Prumer cisel je: %f\n", soucet / (double) 10);


    }
}
