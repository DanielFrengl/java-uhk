package cvic10;

import java.io.PrintStream;
import java.util.Scanner;

public class Main {


    public static Scanner vstup = new Scanner(System.in);
    public static PrintStream vystup = System.out;

    public static void main(String[] args) {

        int[][] bData = {
                {1,5,4},
                {2,1,8},

        };
        int[][] dData = {
                {1,5},
                {2,3},
                {4,1},
        };



        Matice a = new Matice(5, 4);
        a.generujObsah(10, 1000);
        a.vypis(System.out);

        Matice b = new Matice(bData);
        b.vypis(System.out);

        Matice d = new Matice(dData);

        var c = b.plus(b);
        c.vypis(System.out);


        var e = b.multiply(d);
        e.vypis(System.out);
    }
}
