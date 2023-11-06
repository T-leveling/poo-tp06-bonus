package fr.eni.tp06;

public abstract class Forme {
    public abstract double calculerAire();

    public abstract double calculerPerimetre();

    public abstract String getText();
    public String toString() {

        return this.getText() +
                "\nAire = " + calculerAire() +
                "\nPérimètre = " + calculerPerimetre()
                + "\n\r";
    }
}
