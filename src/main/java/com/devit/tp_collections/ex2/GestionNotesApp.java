package com.devit.tp_collections.ex2;

import java.util.HashMap;
import java.util.Map;

public class GestionNotesApp {
    public static void main(String[] args) {
        Map<String, Double> notesEtudiants = new HashMap<>();

        notesEtudiants.put("Alice", 15.5);
        notesEtudiants.put("Bob", 18.0);
        notesEtudiants.put("Charlie", 16.5);

        System.out.println("Liste des étudiants et leurs notes :");
        afficherMap(notesEtudiants);
        notesEtudiants.put("Alice", notesEtudiants.get("Alice") + 1.0);
        System.out.println("\nListe des étudiants et leurs notes après augmentation de la note d'Alice :");
        afficherMap(notesEtudiants);

        notesEtudiants.remove("Charlie");
        System.out.println("\nListe des étudiants et leurs notes après suppression de la note de Charlie :");
        afficherMap(notesEtudiants);

        System.out.println("\nTaille du map : " + notesEtudiants.size());

        double somme = 0;
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;
        for (double note : notesEtudiants.values()) {
            somme += note;
            if (note > max) {
                max = note;
            }
            if (note < min) {
                min = note;
            }
        }
        double moyenne = somme / notesEtudiants.size();
        System.out.println("Note moyenne : " + moyenne);
        System.out.println("Note maximale : " + max);
        System.out.println("Note minimale : " + min);

        boolean note20 = false;
        for (double note : notesEtudiants.values()) {
            if (note == 20.0) {
                note20 = true;
                break;
            }
        }
        if (note20) {
            System.out.println("Il y a une note égale à 20.");
        } else {
            System.out.println("Il n'y a pas de note égale à 20.");
        }
    }

    private static void afficherMap(Map<String, Double> map) {
        map.forEach((key, value) -> System.out.println(key + " : " + value));
    }
}