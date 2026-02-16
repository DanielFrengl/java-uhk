package cvic1;



public class Zlomek {

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
        }
}
