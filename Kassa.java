import java.util.stream.IntStream;

public class Kassa {
    private double totaalOmzet;
    private int[] teller = new int[6];

    public double getTotaalOmzet() {
        return totaalOmzet;
    }

    public int getTeller(int index) {
        return teller[index];
    }

    public void berekenen(int index, double prijs) {
        teller[index] += 1;
        totaalOmzet += prijs;
    }

    public void lijst() {
        System.out.println("Hieronder zie je de lijst met attracties:");
        System.out.println("1. Botsauto's");
        System.out.println("2. Spin");
        System.out.println("3. Spiegelauto's");
        System.out.println("4. Spookhuis");
        System.out.println("5. Hawaii");
        System.out.println("6. Ladderklimmen");
    }

    public int somVanKaartjes() {
        return IntStream.of(teller).sum();
    }
}
