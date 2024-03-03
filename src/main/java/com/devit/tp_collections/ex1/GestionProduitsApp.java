package com.devit.tp_collections.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class GestionProduitsApp {
    public static void main(String[] args) {
        ArrayList<Produit> listeProduits = new ArrayList<>();

        listeProduits.add(new Produit(1, "Produit 1", 10.0));
        listeProduits.add(new Produit(2, "Produit 2", 20.0));

        System.out.println("Liste des produits :");
        afficherListeProduits(listeProduits);

        listeProduits.remove(0);
        System.out.println("\nListe des produits après suppression du premier produit :");
        afficherListeProduits(listeProduits);

        listeProduits.get(0).setNom("Nouveau nom");
        System.out.println("\nListe des produits après modification du nom du premier produit :");
        afficherListeProduits(listeProduits);

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEntrez le nom du produit à rechercher :");
        String nomRecherche = scanner.nextLine();
        boolean produitTrouve = false;
        for (Produit produit : listeProduits) {
            if (produit.getNom().equals(nomRecherche)) {
                produitTrouve = true;
                System.out.println("Produit trouvé : " + produit);
                break;
            }
        }
        if (!produitTrouve) {
            System.out.println("Aucun produit trouvé avec le nom " + nomRecherche);
        }
    }
    private static void afficherListeProduits(ArrayList<Produit> listeProduits) {
        for (Produit produit : listeProduits) {
            System.out.println(produit);
        }
    }
}