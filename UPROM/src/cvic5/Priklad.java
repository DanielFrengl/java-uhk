package cvic5;

import java.io.PrintStream;
import java.util.Scanner;

public class Priklad {

    public static Scanner vstup = new Scanner(System.in);
    public static PrintStream vystup = System.out;

    public static void main(String[] args) {
        var jmeno = vstup.nextLine();
        vystup.printf("Ahoj %s\n", jmeno);
    }
}
