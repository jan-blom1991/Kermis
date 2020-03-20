abstract public class Attractie {
    String naam;
    double prijs;
    int oppervlakte;
    double omzet;

    public Attractie(String naam, double prijs, int oppervlakte) {
        this.naam = naam;
        this.prijs = prijs;
        this.oppervlakte = oppervlakte;
    }

    abstract void draaien();
}

class Botsauto extends Attractie {

    public Botsauto(String naam, double prijs, int oppervlakte) {
        super(naam, prijs, oppervlakte);
    }

    @Override
    void draaien() {
        System.out.println("Deze attractie kost: " + this.prijs);
        System.out.println("De attractie " + this.naam + " gaat starten.");
        this.omzet += this.prijs;
    }
}

class Spin extends Attractie {

    public Spin(String naam, double prijs, int oppervlakte) {
        super(naam, prijs, oppervlakte);
    }

    @Override
    void draaien() {
        System.out.println("De kosten voor deze attractie bedraagt: " + this.prijs);
        System.out.println("De attractie " + this.naam + " gaat starten.");
        this.omzet += this.prijs;
    }
}

class Spiegelpaleis extends Attractie {

    public Spiegelpaleis(String naam, double prijs, int oppervlakte) {
        super(naam, prijs, oppervlakte);
    }

    @Override
    void draaien() {
        System.out.println("De kosten voor deze attractie bedraagt: " + this.prijs);
        System.out.println("De attractie " + this.naam + " gaat starten.");
        this.omzet += this.prijs;
    }
}

class Spookhuis extends Attractie {

    public Spookhuis(String naam, double prijs, int oppervlakte) {
        super(naam, prijs, oppervlakte);
    }

    @Override
    void draaien() {
        System.out.println("De kosten voor deze attractie bedraagt: " + this.prijs);
        System.out.println("De attractie " + this.naam + " gaat starten.");
        this.omzet += this.prijs;
    }
}

class Hawaii extends Attractie {

    public Hawaii(String naam, double prijs, int oppervlakte) {
        super(naam, prijs, oppervlakte);
    }

    @Override
    void draaien() {
        System.out.println("De kosten voor deze attractie bedraagt: " + this.prijs);
        System.out.println("De attractie " + this.naam + " gaat starten.");
        this.omzet += this.prijs;
    }
}

class Ladderklimmen extends Attractie {

    public Ladderklimmen(String naam, double prijs, int oppervlakte) {
        super(naam, prijs, oppervlakte);
    }

    @Override
    void draaien() {
        System.out.println("De kosten voor deze attractie bedraagt: " + this.prijs);
        System.out.println("De attractie " + this.naam + " gaat starten.");
        this.omzet += this.prijs;
    }
}

