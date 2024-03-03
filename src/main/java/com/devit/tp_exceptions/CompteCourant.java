package com.devit.tp_exceptions;

public class CompteCourant extends CompteBancaire {
    private final double decouvertAutorise;
    public CompteCourant(int numeroCompte, double solde, String nomTitulaire, double decouvertAutorise) {
        super(numeroCompte, solde, nomTitulaire);
        this.decouvertAutorise = decouvertAutorise;
    }

    @Override
    public void retirerArgent(double montant) throws FondsInsuffisantsException {
        if (montant > (solde + decouvertAutorise)) {
            throw new FondsInsuffisantsException("Fonds insuffisants pour le retrait sur le compte courant " + numeroCompte);
        }
        solde -= montant;
        System.out.println("Retrait de " + montant + " effectué sur le compte courant " + numeroCompte);
    }
}