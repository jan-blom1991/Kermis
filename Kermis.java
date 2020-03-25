import java.util.ArrayList;

public class Kermis {

    public static void printAttractielijst() {
        System.out.println("Hieronder zie je de lijst met attracties:");
        System.out.println("1. Botsauto's");
        System.out.println("2. Spin");
        System.out.println("3. Spiegelauto's");
        System.out.println("4. Spookhuis");
        System.out.println("5. Hawaii");
        System.out.println("6. Ladderklimmen");
    }

    public static ArrayList<Attractie> getAttractieLijst() {
        ArrayList<Attractie> lijst = new ArrayList<>();
        lijst.add(new Botsauto("botsauto", 2.50, 70));
        lijst.add(new Spin("spin", 2.25, 40));
        lijst.add(new Spiegelpaleis("spiegelpaleis", 2.75, 60));
        lijst.add(new Spookhuis("spookhuis", 3.20, 120));
        lijst.add(new Hawaii("hawaii", 2.90, 100));
        lijst.add(new Ladderklimmen("ladderklimmen", 5, 35));
        return lijst;
    }

    public static void printOmzet(ArrayList<Attractie> lijst) {
        System.out.println("Hieronder zie je de omzet:");
        System.out.println(lijst.get(0).naam + "'s: " + lijst.get(0).omzet);
        System.out.println(lijst.get(1).naam + ": " + lijst.get(1).omzet);
        System.out.println(lijst.get(2).naam + ": " + lijst.get(2).omzet);
        System.out.println(lijst.get(3).naam + ": " + lijst.get(3).omzet);
        System.out.println(lijst.get(4).naam + ": " + lijst.get(4).omzet);
        System.out.println(lijst.get(5).naam + ": " + lijst.get(5).omzet);
        System.out.println("-----------------------------------------------------------");
        System.out.println("Totale omzet: " + Kassa.getTotaalOmzet());
        System.out.println("Gereserveerde belasting: " + Kassa.getKansSpelBelasting());
        System.out.println("Betaalde belasting: " + Kassa.betaaldeBelasting());
    }

    public static void printAantalKaartjes(ArrayList<Attractie> lijst) {
        System.out.println("Hieronder zie je het aantal verkochte kaartjes:");
        System.out.println(lijst.get(0).naam + "'s: " + lijst.get(0).kaartjes);
        System.out.println(lijst.get(1).naam + ": " + lijst.get(1).kaartjes);
        System.out.println(lijst.get(2).naam + ": " + lijst.get(2).kaartjes);
        System.out.println(lijst.get(3).naam + ": " + lijst.get(3).kaartjes);
        System.out.println(lijst.get(4).naam + ": " + lijst.get(4).kaartjes);
        System.out.println(lijst.get(5).naam + ": " + lijst.get(5).kaartjes);
        System.out.println("-----------------------------------------------------------");
        System.out.println("Totaal aantal kaartjes: " + Kassa.somVanKaartjes(lijst));
    }
}