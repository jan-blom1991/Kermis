import java.util.ArrayList;

abstract public class Attractie {
    String naam;
    double prijs;
    int oppervlakte;
    double omzet;
    int kaartjes;
    int geinspecteerdeKaartjes;

    public Attractie(String naam, double prijs, int oppervlakte) {
        this.naam = naam;
        this.prijs = prijs;
        this.oppervlakte = oppervlakte;
    }

    abstract void draaien(ArrayList<Attractie> lijst);
}

class Botsauto extends Attractie {

    public Botsauto(String naam, double prijs, int oppervlakte) {
        super(naam, prijs, oppervlakte);
    }

    @Override
    void draaien(ArrayList<Attractie> lijst) {
        System.out.println("De kosten voor deze attractie bedraagt: " + this.prijs);
        System.out.println("De attractie " + this.naam + " gaat starten.");
        this.kaartjes += 1;
        this.omzet += this.prijs;
        Kassa.berekenenTotaalOmzet(0, lijst);
        Belastinginspecteur.inspectie(lijst);
    }
}

class Spin extends Attractie {

    public Spin(String naam, double prijs, int oppervlakte) {
        super(naam, prijs, oppervlakte);
    }

    @Override
    void draaien(ArrayList<Attractie> lijst) {
        System.out.println("De kosten voor deze attractie bedraagt: " + this.prijs);
        System.out.println("De attractie " + this.naam + " gaat starten.");
        this.kaartjes += 1;
        this.omzet += this.prijs;
        Kassa.berekenenTotaalOmzet(1, lijst);
        Kassa.opstellingsKeuring(5, 1, lijst);
        Belastinginspecteur.inspectie(lijst);
    }
}

class Spiegelpaleis extends Attractie {

    public Spiegelpaleis(String naam, double prijs, int oppervlakte) {
        super(naam, prijs, oppervlakte);
    }

    @Override
    void draaien(ArrayList<Attractie> lijst) {
        System.out.println("De kosten voor deze attractie bedraagt: " + this.prijs);
        System.out.println("De attractie " + this.naam + " gaat starten.");
        this.kaartjes += 1;
        this.omzet += this.prijs;
        Kassa.berekenenTotaalOmzet(2, lijst);
        Belastinginspecteur.inspectie(lijst);
    }
}

class Spookhuis extends Attractie {

    public Spookhuis(String naam, double prijs, int oppervlakte) {
        super(naam, prijs, oppervlakte);
    }

    @Override
    void draaien(ArrayList<Attractie> lijst) {
        System.out.println("De kosten voor deze attractie bedraagt: " + this.prijs);
        System.out.println("De attractie " + this.naam + " gaat starten.");
        this.kaartjes += 1;
        this.omzet += this.prijs;
        Kassa.berekenenTotaalOmzet(3, lijst);
        Belastinginspecteur.inspectie(lijst);
    }
}

class Hawaii extends Attractie {

    public Hawaii(String naam, double prijs, int oppervlakte) {
        super(naam, prijs, oppervlakte);
    }

    @Override
    void draaien(ArrayList<Attractie> lijst) {
        System.out.println("De kosten voor deze attractie bedraagt: " + this.prijs);
        System.out.println("De attractie " + this.naam + " gaat starten.");
        this.kaartjes += 1;
        this.omzet += this.prijs;
        Kassa.berekenenTotaalOmzet(4, lijst);
        Kassa.opstellingsKeuring(10, 4, lijst);
        Belastinginspecteur.inspectie(lijst);
    }
}

class Ladderklimmen extends Attractie implements GokAttractie {

    public Ladderklimmen(String naam, double prijs, int oppervlakte) {
        super(naam, prijs, oppervlakte);
    }

    @Override
    void draaien(ArrayList<Attractie> lijst) {
        System.out.println("De kosten voor deze attractie bedraagd: " + this.prijs);
        System.out.println("De attractie " + this.naam + " gaat starten.");
        this.kaartjes += 1;
        this.omzet += this.prijs;
        Kassa.berekenenTotaalOmzet(5, lijst);
        belastingBerekenen();
        Belastinginspecteur.inspectie(lijst);
    }

    @Override
    public void belastingBerekenen() {
        double belastingPerKaartje = this.prijs * 0.3;
        System.out.println("\nOver een kansspel wordt belasting gereserveerd");
        Kassa.setKansSpelBelasting(Kassa.getKansSpelBelasting() + belastingPerKaartje);
        this.omzet -= belastingPerKaartje;
        Kassa.setTotaalOmzet(Kassa.getTotaalOmzet() - belastingPerKaartje);
    }
}

interface GokAttractie {

    void belastingBerekenen();
}

