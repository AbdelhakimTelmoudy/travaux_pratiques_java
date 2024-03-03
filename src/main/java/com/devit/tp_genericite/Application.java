package com.devit.tp_genericite;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        IMetier<Produit> metierProduit = new MetierProduitImpl();
        metierProduit.add(new Produit(1, "Laptop", "Dell", 1200, "Portable", 10));
        metierProduit.add(new Produit(2, "Smartphone", "Samsung", 800, "Téléphone", 20));

        boolean quitter = false;
        while (!quitter) {
            System.out.println("\nMenu:");
            System.out.println("1. Afficher la liste des produits");
            System.out.println("2. Rechercher un produit par son id");
            System.out.println("3. Ajouter un nouveau produit dans la liste");
            System.out.println("4. Supprimer un produit par id");
            System.out.println("5. Quitter le programme");

            int choix = 1;
            switch (choix) {
                case 1:
                    afficherListeProduits(metierProduit);
                    break;
                case 2:
                    rechercherProduitParId(metierProduit);
                    break;
                case 3:
                    ajouterProduit(metierProduit);
                    break;
                case 4:
                    supprimerProduit(metierProduit);
                    break;
                case 5:
                    quitter = true;
                    System.out.println("Programme terminé.");
                    break;
                default:
                    System.out.println("Choix invalide, veuillez réessayer.");
            }
        }
    }

    private static void afficherListeProduits(IMetier<Produit> metierProduit) {
        List<Produit> produits = metierProduit.getAll();
        System.out.println("Liste des produits :");
        for (Produit produit : produits) {
            System.out.println(produit);
        }
    }

    private static void rechercherProduitParId(IMetier<Produit> metierProduit) {
        long id = 1;
        Produit produit = metierProduit.findById(id);
        if (produit != null) {
            System.out.println("Produit trouvé : " + produit);
        } else {
            System.out.println("Aucun produit trouvé avec l'id " + id);
        }
    }
    private static void ajouterProduit(IMetier<Produit> metierProduit) {
        Produit nouveauProduit = new Produit(3, "Tablet", "Apple", 600, "Tablette", 15);
        metierProduit.add(nouveauProduit);
        System.out.println("Nouveau produit ajouté : " + nouveauProduit);
    }

    private static void supprimerProduit(IMetier<Produit> metierProduit) {
        long id = 2;
        metierProduit.delete(id);
        System.out.println("Produit avec l'id " + id + " supprimé avec succès.");
    }
}