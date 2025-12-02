package org.example;

public class Rectangle implements IForme {
    private double longueur;
    private double largeur;

    public Rectangle(double longueur, double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }

    @Override
    public double aire() {
        return this.longueur * this.largeur;
    }
}

