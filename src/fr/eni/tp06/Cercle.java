package fr.eni.tp06;

public class Cercle extends Forme {

    private int rayon;
    public Cercle(int rayon) {
        this.rayon = rayon;
    }

    public int getRayon() {
        return rayon;
    }

    public void setRayon(int rayon) {
        this.rayon = rayon;
    }

    @Override
    public double calculerAire() {
        double aire = Math.PI * Math.pow(this.rayon, 2);
        return aire;
    }

    @Override
    public double calculerPerimetre() {
        double perimetre = 2 * this.rayon * Math.PI;
        return perimetre;
    }


    @Override
    public String toString() {
        return "Cercle de rayon " + rayon +super.toString();
    }
}
