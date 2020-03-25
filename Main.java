import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean doorgaan = true;
        Scanner scanner = new Scanner(System.in);
        ArrayList<Attractie> attractieLijst = Kermis.getAttractieLijst();

        System.out.println("Welkom bij de kermis!\n");
        Kermis.printAttractielijst();

        while (doorgaan) {
            System.out.println("\nKies een optie:");
            System.out.println("Attractie (1-6) | Lijst (l) | Kaartjes (k) | Omzet (o) | Stoppen (s)");

            String antwoord = scanner.nextLine();
            System.out.println(antwoord + "\n");

            switch (antwoord) {
                case "1":
                    attractieLijst.get(0).draaien(attractieLijst);
                    break;
                case "2":
                    attractieLijst.get(1).draaien(attractieLijst);
                    break;
                case "3":
                    attractieLijst.get(2).draaien(attractieLijst);
                    break;
                case "4":
                    attractieLijst.get(3).draaien(attractieLijst);
                    break;
                case "5":
                    attractieLijst.get(4).draaien(attractieLijst);
                    break;
                case "6":
                    attractieLijst.get(5).draaien(attractieLijst);
                    break;
                case "l":
                    Kermis.printAttractielijst();
                    break;
                case "o":
                    Kermis.printOmzet(attractieLijst);
                    break;
                case "k":
                    Kermis.printAantalKaartjes(attractieLijst);
                    break;
                case "s":
                    doorgaan = false;
                    break;
                default:
                    System.out.println("Input niet herkend");
            }
        }
        System.out.println("Tot ziens!");
    }
}
