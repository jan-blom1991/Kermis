import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Belastinginspecteur {
    static double belastingPerAttractie;
    static double belastingPerInspectie;
    static ArrayList<Double> boekhoudingBelasting = new ArrayList<>();

    public static ArrayList<Double> getBoekhoudingBelasting() {
        return boekhoudingBelasting;
    }

    static void inspectie(ArrayList<Attractie> lijst) {
        int kans = ThreadLocalRandom.current().nextInt(0, 3);

        if (kans == 0) {
            belastingPerInspectie = 0;

            for (Attractie attractie : lijst) {
                if (attractie instanceof GokAttractie) {
                    belastingPerAttractie = 0;
                    belastingPerAttractie = ((attractie.kaartjes - attractie.geinspecteerdeKaartjes) * attractie.prijs * 0.3);
                    belastingPerInspectie += belastingPerAttractie;
                    attractie.geinspecteerdeKaartjes = attractie.kaartjes;
                }
            }

            boekhoudingBelasting.add(belastingPerInspectie);
            System.out.println("\nDe belastinginspecteur is langs gekomen.");
            System.out.println("Een bedrag van " + Kassa.getKansSpelBelasting() + " is ingeleverd.");
            Kassa.setKansSpelBelasting(0);
            Kassa.setAantalInspecties(Kassa.getAantalInspecties() + 1);
        }
    }
}
