package com.devit.tp_exceptions;

public class CompteBancaire {
    protected int numeroCompte;
    protected double solde;
    protected String nomTitulaire;

    public CompteBancaire(int numeroCompte, double solde, String nomTitulaire) {
        this.numeroCompte = numeroCompte;
        this.solde = solde;
        this.nomTitulaire = nomTitulaire;
    }

    public void deposerArgent(double montant) {
        solde += montant;
        System.out.println("Dépôt de " + montant + " effectué sur le compte " + numeroCompte);
    }

    public void retirerArgent(double montant) throws FondsInsuffisantsException {
        if (montant > solde) {
            throw new FondsInsuffisantsException("Fonds insuffisants pour le retrait sur le compte " + numeroCompte);
        }
        solde -= montant;
        System.out.println("Retrait de " + montant + " effectué sur le compte " + numeroCompte);
    }

    public void afficherSolde() {
        System.out.println("Solde du compte " + numeroCompte + " : " + solde);
    }

   public void transfererArgent(CompteBancaire destinataire, double montant) throws FondsInsuffisantsException, CompteInexistantException {
        if (montant > solde) {
            throw new FondsInsuffisantsException("Fonds insuffisants pour le transfert depuis le compte " + numeroCompte);
        }
        if (destinataire == null) {
            throw new CompteInexistantException("Le compte destinataire n'existe pas");
        }
        retirerArgent(montant);
        destinataire.deposerArgent(montant);
        System.out.println("Transfert de " + montant + " effectué depuis le compte " + numeroCompte + " vers le compte " + destinataire.numeroCompte);
    }
}
