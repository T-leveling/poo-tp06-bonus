package fr.eni.tp06;

public abstract class Forme {
    public abstract double calculerAire();

    public abstract double calculerPerimetre();

    public String toString() {
        return System.lineSeparator() +"Aire = " + calculerAire() + System.lineSeparator() +
                "Périmètre = " + calculerPerimetre()
                + System.lineSeparator();
    }
}
