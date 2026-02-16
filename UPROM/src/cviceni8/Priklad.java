package cviceni8;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Priklad {

    public static Scanner vstup = new Scanner(System.in);
    public static PrintStream vystup = System.out;

    public static void main(String[] args) {
        PoleObjektove pole1 = new PoleObjektove(4);
        pole1.pridejCislo(1220);
        pole1.pridejCislo(303);
        pole1.pridejCislo(40);
        pole1.pridejCislo(504);
        pole1.vlozNaPozici(2,3);


        pole1.seradPoleBubbleSort();
        pole1.vypis(vystup);


        try (var out = new PrintStream(new FileOutputStream("pole1.txt"))) {
            pole1.vypis(out);
        }

        catch (FileNotFoundException e) {

        }

    }
}
