package fr.eni.tp06;

public class Rectangle extends Forme{

    int largeur;
    int longueur;

    public Rectangle(int largeur, int longueur) {
        this.largeur = largeur;
        this.longueur = longueur;
    }

    public int getLargeur() {
        return largeur;
    }

    public void setLargeur(int largeur) {
        this.largeur = largeur;
    }

    public int getLongueur() {
        return longueur;
    }

    public void setLongueur(int longueur) {
        this.longueur = longueur;
    }

    @Override
    public double calculerAire() {
        int aire = longueur * largeur;
        return aire;
    }

    @Override
    public double calculerPerimetre() {
    int perimetre = (longueur + largeur) * 2;
    return perimetre;
    }

    @Override
    public String getText() {
        return "Rectangle de longueur=" + longueur +" et largeur=" + largeur;
    }
}
