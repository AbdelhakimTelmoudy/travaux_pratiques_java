package com.devit.tp_exceptions;

public class CompteEpargne extends CompteBancaire {
    private final double tauxInteret;

    public CompteEpargne(int numeroCompte, double solde, String nomTitulaire, double tauxInteret) {
        super(numeroCompte, solde, nomTitulaire);
        this.tauxInteret = tauxInteret;
    }

    public double calculerInterets() {
        return solde * tauxInteret;
    }

    public void ajouterInterets() {
        double interets = calculerInterets();
        solde += interets;
        System.out.println("Intérêts de " + interets + " ajoutés au compte épargne " + numeroCompte);
    }
}
