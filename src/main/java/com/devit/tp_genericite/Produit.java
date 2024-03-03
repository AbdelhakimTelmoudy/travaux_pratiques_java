package com.devit.tp_genericite;


class Produit {
    private final long id;
    private final String nom;
    private final String marque;
    private final double prix;
    private final String description;
    private final int nombreEnStock;

    public Produit(long id, String nom, String marque, double prix, String description, int nombreEnStock) {
        this.id = id;
        this.nom = nom;
        this.marque = marque;
        this.prix = prix;
        this.description = description;
        this.nombreEnStock = nombreEnStock;
    }

    public long getId() {
        return id;
    }


}
