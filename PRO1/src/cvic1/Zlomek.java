package cvic1;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Zlomek implements Comparable {

    private int cit;
    private int jmen;

    /**
     *
     * @param cit citatel zlomku
     * @param jmen jmenovatel zlomku
     */

    public Zlomek(int cit, int jmen) {
            this.cit = cit;
            this.jmen = jmen;
            vyresZnamenko();
        }

    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Zlomek z = (Zlomek) o;

        return this.cit * z.jmen == z.cit * this.jmen;

    }

    public int compareTo(Object other) {
        Zlomek z = (Zlomek) other;
                if (this.equals(other))
                    return 0;
                else if (this.cit * z.jmen < z.cit *this.jmen)
                    return -1;
                else
                    return 1;
    }

        public String toString() {
            return "(" + cit +
                    ")/(" + jmen + ")";
        }

        private void vyresZnamenko(){
            if (jmen < 0) {
                cit = -cit;
                jmen = -jmen;
            }
        }


        public Zlomek opacny(){
            return new Zlomek(-cit, jmen);
        }

        private Zlomek secti(Zlomek other) {
            Zlomek z = new Zlomek(this.cit * other.jmen + other.cit * this.jmen, this.jmen * other.jmen);
            return z;
        }
        private Zlomek odecti(Zlomek other) {
            return secti(other.opacny());
        }

        private Zlomek nasob(Zlomek other) {
        Zlomek z = new Zlomek(this.cit * other.cit, this.jmen * other.jmen);
        zkrat();
        return z;
        }

        private void zkrat() {
            int d = nsd(this.cit, this.jmen);
            this.cit /=  d;
            this.jmen /= d;

        }

        private static int nsd(int a, int b) {
            while (b != 0) {
                int mod = a % b;
                a = b;
                b = mod;
            }
            return a;

        }

        static void main(String[] args) {
            Zlomek z1 = new Zlomek(8,4);
            Zlomek z2 = new Zlomek(16,4);
            System.out.println(z1 + "+" + z2 + "=" + z1.secti((z2)));
            System.out.println(z1 + "-" + z2 + "=" + z1.odecti((z2)));
            System.out.println(z1 + "*" + z2 + "=" + z1.nasob((z2)));



            ArrayList<Zlomek> seznamZlomku = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                seznamZlomku.add(new Zlomek(i+2, i+1));
            }

            Zlomek z3 = new Zlomek(4,6);
            Zlomek z4 = seznamZlomku.get(2);
            System.out.println("Porovnani: " + z3.equals(z4));
            System.out.println("Seznam zlomku" + seznamZlomku);
            Collections.sort(seznamZlomku);
            System.out.println("Seznam zlomku" + seznamZlomku);
            System.out.println("Prvek s indexem: " + seznamZlomku.get(4));
            System.out.println("Pocet prvku: " + seznamZlomku.size());
            System.out.println("Posledni prvek: " + seznamZlomku.getLast());
        }
}
