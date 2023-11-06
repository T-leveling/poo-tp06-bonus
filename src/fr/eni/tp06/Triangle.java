package fr.eni.tp06;

public class Triangle extends Forme {
    private int longueur, largeur, hyp;

    public Triangle(int longueur, int largeur, int hyp) {
        this.longueur = longueur;
        this.largeur = largeur;
        this.hyp = hyp;
    }

    public int getLongueur() {
        return longueur;
    }

    public void setLongueur(int longueur) {
        this.longueur = longueur;
    }

    public int getLargeur() {
        return largeur;
    }

    public void setLargeur(int largeur) {
        this.largeur = largeur;
    }

    public int getHyp() {
        return hyp;
    }

    public void setHyp(int hyp) {
        this.hyp = hyp;
    }

    @Override
    public double calculerAire() {
        double s = calculerPerimetre() / 2;
        double aire = Math.sqrt(s * (s - longueur) * (s - largeur) * (s - hyp));
        return aire;
    }

    @Override
    public double calculerPerimetre() {
        int perimetre = longueur + largeur + hyp;
        return perimetre;
    }

    @Override
    public String toString() {
        return "Triangle de côté A=" + longueur + ", B=" + largeur + ", C=" + hyp + super.toString();
    }



}
