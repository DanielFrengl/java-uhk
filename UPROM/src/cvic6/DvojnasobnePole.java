package cvic6;

import java.io.PrintStream;
import java.util.Scanner;

public class DvojnasobnePole {

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


        private static void vynasobPrvkyPole(int[] pole, int nasobek) {
            for (int i = 0; i < pole.length; i++) {
                pole[i] *= nasobek;
            }
        }


        public static void main(String[] args) {


            int[] pole = vytvorPoleZKlavesnice(5);

            vynasobPrvkyPole(pole, vstup.nextInt());
            vypisPole(pole);

        }


    }





