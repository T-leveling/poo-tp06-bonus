package fr.eni.tp06;

public class Carre extends Forme {

    int cote;

    public Carre(int cote) {
        this.cote = cote;
    }

    @Override
    public double calculerAire() {
        int aire = cote * cote;
        return aire;
    }

    @Override
    public double calculerPerimetre() {
        int perimetre = cote * 4;
        return perimetre;
    }

    @Override
    public String getText() {
        return "Carré de coté " + this.cote;
    }
}
