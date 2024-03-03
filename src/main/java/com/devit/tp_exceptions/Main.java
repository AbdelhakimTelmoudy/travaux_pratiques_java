package com.devit.tp_exceptions;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<CompteBancaire> listeComptes = new ArrayList<>();

        listeComptes.add(new CompteCourant(1, 5000, "Alice", 1000));
        listeComptes.add(new CompteEpargne(2, 10000, "Bob", 0.05));

        for (CompteBancaire compte : listeComptes) {
            compte.afficherSolde();
        }

        try {
            listeComptes.get(0).retirerArgent(2000);
            listeComptes.get(0).transfererArgent(listeComptes.get(1), 3000);
        } catch (FondsInsuffisantsException | CompteInexistantException e) {
            System.out.println("Erreur : " + e.getMessage());
        }
    }
}