package cvic10;

import java.io.PrintStream;


public class Matice {

    private int[][] data;

    public Matice() {
        data = new int[3][3];
    }

    public Matice(int pocetRadku, int pocetSloupcu) {
        data = new int[pocetRadku][pocetSloupcu];
    }

    public Matice(int[][] vstupniData) {
        this.data = new int[vstupniData.length][vstupniData[0].length];

        for (int i = 0; i < vstupniData.length; i++) {
            for (int j = 0; j < vstupniData[i].length; j++) {
                this.data[i][j] = vstupniData[i][j];
            }
        }
    }

    public void vypis(PrintStream out) {
        out.println("===============Vypis matice===============");
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + "\t");
            }
            System.out.println();
        }
        out.println("==========================================");
    }

    public void generujObsah(int dolniMez, int horniMez) {

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                data[i][j] = (int) (Math.random() * (horniMez - dolniMez + 1)) + dolniMez;
            }

        }
    }

    public Matice plus(Matice mat) {
        if (data.length != mat.data.length || data[0].length != mat.data[0].length) {
            throw new RuntimeException("PLUS: Nesedi rozmery matic!");
        }

        Matice vysl = new Matice(mat.data.length, mat.data[0].length);
        for (int i = 0; i < mat.data.length; i++) {
            for (int j = 0; j < mat.data[0].length; j++) {
                vysl.data[i][j] += data[i][j] + mat.data[i][j];
            }
        }
        return vysl;
    }


    public Matice multiply(Matice mat) {
        if (data[0].length != mat.data.length || data.length != mat.data[0].length) {
            throw new RuntimeException("MULTIPLY: Nesedi rozmery matic!");
        }
        Matice vysl = new Matice(data.length, mat.data[0].length);

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < mat.data[i].length; j++) {
                vysl.data[i][j] = 0;
                for (int k = 0; k < data[0].length; k++) {
                    vysl.data[i][j] += data[i][k] * mat.data[k][j];
                }
            }
        }

        return vysl;
    }

}
