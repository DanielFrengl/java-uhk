package cviceni8;



import java.io.PrintStream;


public class PoleObjektove {

    private int[] pole;
    private int pocet;

    /**
     * Kontruktor
     * @param kapacita
     */

    public PoleObjektove(int kapacita) {
        pole = new int[kapacita];
        pocet = 0;
    }


    /**
     * Pridava prvek na prvni volnou pozici
     *
     * @param cislo hodnota,kterou pridavame
     * @return index nove pridane hodnoty, nebo -1, kdyz je kapacita vycerpana
     */
    public int pridejCislo(int cislo) {

        if (pocet == pole.length) {
            realokuj(5);
        }


        pole[pocet++] = cislo;
        return pocet - 1;

    }


    public void vypis(PrintStream out) {
        for (int i = 0; i < pocet; i++) {
            out.printf("%d ", pole[i]);
            if (i > pocet - 1) {
                out.println(",");
            }
        }
    }

    public int vlozNaPozici(int pozice, int cislo) {
        if (pozice > pocet) { //pokud je plno, nebo index je mimo
            return -1;
        }

        if (pocet == pole.length) {
            realokuj(5);
        }

        for (int i = pocet - 1; i >= pozice; i--) {
            pole[i + 1] = pole[i];

        }
        pole[pozice] = cislo;
        pocet++;
        return pozice;
    }


    public int smazat(int pozice) {
        if (pozice >= pocet) {
            return -1;
        }
            // sesun pole odzadu o jeden prvek az do "pozice"
            for (int i = pozice; i < pocet-1; i++) {
                    pole[i] = pole[i+1];
                }
            pocet--; // zmensi pocet prvku o 1
            return 0;

        }

    /**
     * Zvetsi pole o zadany prirustek
     * @param prirustek
     */

    protected void realokuj(int prirustek) {
        //vyrobime nove - vetsi pole
            int[] nove = new int[pole.length+prirustek];
            //prekopirujeme data ze "stareho pole"
        for (int i = 0; i < pocet; i++) {
            nove[i] = pole[i];
        }
            pole = nove;
        }


        public  int najdiMinimum() {
            int min = pole[0];

            for (int i = 1; i < pocet; i++) {
                if (min > pole[i]) {
                    min = pole[i];
                }
            }
            return min;
        }


        public int najdiIndexMinima() {
            int imin = 0;

            for (int i = 1; i < pocet; i++) {
                if (pole[imin] > pole[i]) {
                    imin = i;
                }
            }
            return imin;
        }


        /** Ukol **/
    public void seradPoleSelectSort() {
        for (int i = 0; i < pocet - 1; i++) {
            int imin = i;
            for (int j = i + 1; j < pocet; j++) {
                if (pole[imin] > pole[j]) {
                    imin = j;
                }
            }

            if (imin != i) {
                int temp = pole[imin];
                pole[imin] = pole[i];
                pole[i] = temp;
            }
        }
    }

    public void seradPoleBubbleSort() {
        boolean bylaVymena = true;
        for (int i = 0; i < pocet && bylaVymena; i++) {
            bylaVymena = false;
           for  (int j = 0; j < pocet - 1; j++) {
               if (pole[j] > pole[j+1]) {
                   int temp = pole[j];
                   pole[j] = pole[j+1];
                   pole[j+1] = temp;
               }
           }

        }
    }

    public int binarniVyhledavani(int hodnota) {
        int levy = 0;
        int pravy = pocet - 1;
        int prostredni;

        do {
            prostredni = (levy + pravy) / 2;
            if (pole[prostredni] == hodnota) {
                return prostredni;
            }
            else if  (pole[prostredni] < hodnota) {
                levy = prostredni + 1;
            }
            else {
                pravy = prostredni - 1;
            }
        } while (levy <= pravy);
        return -1;
    }

}










