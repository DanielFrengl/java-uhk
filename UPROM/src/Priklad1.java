import java.util.Scanner;

public class Priklad1 {
    static String jmeno = "Dane";
    public static void main(String[] args) {

        System.out.println("Zadejte jmeno...");

        //druhy pokus se zadani jmena

        Scanner sc = new Scanner(System.in);
        jmeno = sc.nextLine();
        System.out.println("Hello "+jmeno+"!");

    }
}

