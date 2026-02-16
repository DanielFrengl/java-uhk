package cviceni3;

import java.io.PrintStream;
import java.util.Scanner;

public class KvadrRov {

    public static Scanner vstup = new Scanner(System.in);
    public static PrintStream vystup = System.out;
    static double pom;


    static void diskriminant(double a, double b, double c) {
        double d = Math.pow(b, 2) - 4 * a * c;

        vystup.printf("Diskriminant D = %.2f\n", d);

        if (d > 0) {
            double x1 = (-b + Math.sqrt(d)) / (2 * a);
            double x2 = (-b - Math.sqrt(d)) / (2 * a);
            vystup.printf("Rovnice má 2 reálná řešení:\n");
            vystup.printf("x1 = %.2f\nx2 = %.2f\n", x1, x2);
        } else if (d == 0) {
            double x = -b / (2 * a);
            vystup.printf("Rovnice má 1 reálné řešení:\n");
            vystup.printf("x = %.2f\n", x);
        } else {
            vystup.printf("Rovnice nemá reálné řešení (D < 0).\n");
        }
    }


    public static void main(String[] args) {

        vystup.printf("Zadejte číslo a:");
        double a = vstup.nextInt();
        vystup.printf("Zadejte číslo b:");
        double b = vstup.nextInt();
        vystup.printf("Zadejte číslo c:");
        double c = vstup.nextInt();

        if (a > b) {
            pom = a;
            a = b;
            b = pom;
        }

        if (b > c) {
            pom = b;
            b = c;
            c = pom;
        }

        if (a > b) {
            pom = a;
            a = b;
            b = pom;
        }

        diskriminant(a, b, c);
    }


}
