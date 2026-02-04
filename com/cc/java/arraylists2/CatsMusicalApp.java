package com.cc.java.arraylists2;
import java.util.ArrayList;
import java.util.List;

public class CatsMusicalApp {

    public static void main(String[] args) {

        // 1. Eine leere ArrayList für unsere "Cats"-Darsteller
        List<String> catsCast = new ArrayList<>();

        // 2. Katzen zum Cast hinzufügen (add)
        catsCast.add("Old Deuteronomy");
        catsCast.add("Grizabella");
        catsCast.add("Rum Tum Tugger");
        catsCast.add("Mr. Mistoffelees");

        System.out.println("Aktueller Cats-Cast: " + catsCast);
        System.out.println("Anzahl der Katzen im Cast: " + catsCast.size());

        // 3. Zugriff auf einzelne Elemente per Index (get)
        System.out.println("Star des Abends: " + catsCast.get(1)); // Grizabella

        // 4. Prüfen, ob eine Katze im Cast ist (contains)
        String newCat = "Skimbleshanks";
        if (!catsCast.contains(newCat)) {
            System.out.println(newCat + " steht noch vor dem Theater und miaut – wir nehmen ihn in den Cast auf!");
            catsCast.add(newCat);
        }

        System.out.println("Neuer Cats-Cast: " + catsCast);

        // 5. Eine Katze verlässt das Musical (remove)
        System.out.println("Oh nein, Rum Tum Tugger hat ein besseres Angebot in \"Dogs – Das Musical\" bekommen und geht...");
        catsCast.remove("Rum Tum Tugger");

        System.out.println("Aktueller Cats-Cast nach Abgang: " + catsCast);

        // 6. Iteration über die Liste (for-each)
        System.out.println("\nAbendliche Vorstellung – Vorhang auf für:");
        for (String catName : catsCast) {
            System.out.println("- " + catName);
        }
    }
}
