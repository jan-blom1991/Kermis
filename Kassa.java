import java.util.ArrayList;

public class Kassa {
    private static double totaalOmzet;
    private static double kansSpelBelasting;
    private static int aantalInspecties;

    public static double getTotaalOmzet() {
        return totaalOmzet;
    }

    public static void setTotaalOmzet(double totaalOmzet) {
        Kassa.totaalOmzet = totaalOmzet;
    }

    public static void setKansSpelBelasting(double kansSpelBelasting) {
        Kassa.kansSpelBelasting = kansSpelBelasting;
    }

    public static double getKansSpelBelasting() {
        return kansSpelBelasting;
    }

    public static int getAantalInspecties() {
        return aantalInspecties;
    }

    public static void setAantalInspecties(int aantalInspecties) {
        Kassa.aantalInspecties = aantalInspecties;
    }

    public static void berekenenTotaalOmzet(int index, ArrayList<Attractie> lijst) {
        totaalOmzet += lijst.get(index).prijs;
    }

    public static int somVanKaartjes(ArrayList<Attractie> lijst) {
        int som = 0;
        for(Attractie attractie : lijst) {
            som += attractie.kaartjes;
        }
        return som;
    }

    public static void opstellingsKeuring(int grens, int index, ArrayList<Attractie> lijst) {
        if (lijst.get(index).kaartjes % grens == 0) {
            System.out.println("\nEr wordt een onderhoudsbeurt voor deze attractie uitgevoerd!");
        }
    }

    public static double betaaldeBelasting() {
        ArrayList<Double> boekhouding = Belastinginspecteur.getBoekhoudingBelasting();
        double som = 0;
        for(double belasting : boekhouding) {
            som += belasting;
        }
        return som;
    }
}
