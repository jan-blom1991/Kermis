import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean doorgaan = true;
        Kassa kassa = new Kassa();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welkom bij de kermis!\n");
        kassa.lijst();

        Attractie botsauto = new Botsauto("botsauto", 2.50, 70);
        Attractie spin = new Spin("spin", 2.25, 40);
        Attractie spiegelpaleis = new Spiegelpaleis("spiegelpaleis", 2.75, 60);
        Attractie spookhuis = new Spookhuis("spookhuis", 3.20, 120);
        Attractie hawaii = new Hawaii("hawaii", 2.90, 100);
        Attractie ladderklimmen = new Ladderklimmen("ladderklimmen", 5, 35);

        while (doorgaan) {
            System.out.println("\nKies een getal uit de lijst om daar in te kunnen.");
            System.out.println("Je kan ook de lijst, omzet of het aantal kaartjes bekijken. (l/o/k)");
            System.out.println("Je kan ook altijd stoppen als je wilt. (s)");

            String antwoord = scanner.nextLine();
            System.out.println(antwoord + "\n");

            switch (antwoord) {
                case "1":
                    botsauto.draaien();
                    kassa.berekenen(0, botsauto.prijs);
                    break;
                case "2":
                    spin.draaien();
                    kassa.berekenen(1, spin.prijs);
                    break;
                case "3":
                    spiegelpaleis.draaien();
                    kassa.berekenen(2, spiegelpaleis.prijs);
                    break;
                case "4":
                    spookhuis.draaien();
                    kassa.berekenen(3, spookhuis.prijs);
                    break;
                case "5":
                    hawaii.draaien();
                    kassa.berekenen(4, hawaii.prijs);
                    break;
                case "6":
                    ladderklimmen.draaien();
                    kassa.berekenen(5, ladderklimmen.prijs);
                    break;
                case "l":
                    kassa.lijst();
                    break;
                case "o":
                    System.out.println("Hieronder zie je de omzet:");
                    System.out.println(botsauto.naam + "'s: " + botsauto.omzet);
                    System.out.println(spin.naam + ": " + spin.omzet);
                    System.out.println(spiegelpaleis.naam + ": " + spiegelpaleis.omzet);
                    System.out.println(spookhuis.naam + ": " + spookhuis.omzet);
                    System.out.println(hawaii.naam + ": " + hawaii.omzet);
                    System.out.println(ladderklimmen.naam + ": " + ladderklimmen.omzet);
                    System.out.println("-----------------------------------------------------------");
                    System.out.println("De totale omzet is: " + kassa.getTotaalOmzet());
                    break;
                case "k":
                    System.out.println("Hieronder zie je het aantal verkochte kaartjes:");
                    System.out.println(botsauto.naam + "'s: " + kassa.getTeller(0));
                    System.out.println(spin.naam + ": " + kassa.getTeller(1));
                    System.out.println(spiegelpaleis.naam + ": " + kassa.getTeller(2));
                    System.out.println(spookhuis.naam + ": " + kassa.getTeller(3));
                    System.out.println(hawaii.naam + ": " + kassa.getTeller(4));
                    System.out.println(ladderklimmen.naam + ": " + kassa.getTeller(5));
                    System.out.println("-----------------------------------------------------------");
                    System.out.println("Het totaal aantal kaartjes is: " + kassa.somVanKaartjes());
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
