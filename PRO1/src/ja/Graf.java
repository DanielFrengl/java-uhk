package ja;

public class Graf {

    private int[] skore;


    public Graf(int[] skore) {
        this.skore = skore;
    }


    public int sectiSkore(int[] skore) {
        int sum = 0;
        for (int i = 0; i < skore.length; i++) {
            sum += skore[i];
        }
        return sum;
    }


    static void main(String[] args) {
        Graf g = new Graf(new int[]{1, 2, 3})
    }

}
