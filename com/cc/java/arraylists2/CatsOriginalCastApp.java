// package com.cc.java.arraylists2;
// import java.util.ArrayList;
// import java.util.List;

// public class CatsMusicalApp {

//     public static void main(String[] args) {

//         // 1. Eine leere ArrayList für unsere "Cats"-Darsteller
//         List<String> catsCast = new ArrayList<>();

//         // 2. Katzen zum Cast hinzufügen (add)
//         catsCast.add("Old Deuteronomy");
//         catsCast.add("Grizabella");
//         catsCast.add("Rum Tum Tugger");
//         catsCast.add("Mr. Mistoffelees");

//         System.out.println("Aktueller Cats-Cast: " + catsCast);
//         System.out.println("Anzahl der Katzen im Cast: " + catsCast.size());

//         // 3. Zugriff auf einzelne Elemente per Index (get)
//         System.out.println("Star des Abends: " + catsCast.get(1)); // Grizabella

//         // 4. Prüfen, ob eine Katze im Cast ist (contains)
//         String newCat = "Skimbleshanks";
//         if (!catsCast.contains(newCat)) {
//             System.out.println(newCat + " steht noch vor dem Theater und miaut – wir nehmen ihn in den Cast auf!");
//             catsCast.add(newCat);
//         }

//         System.out.println("Neuer Cats-Cast: " + catsCast);

//         // 5. Eine Katze verlässt das Musical (remove)
//         System.out.println("Oh nein, Rum Tum Tugger hat ein besseres Angebot in \"Dogs – Das Musical\" bekommen und geht...");
//         catsCast.remove("Rum Tum Tugger");

//         System.out.println("Aktueller Cats-Cast nach Abgang: " + catsCast);

//         // 6. Iteration über die Liste (for-each)
//         System.out.println("\nAbendliche Vorstellung – Vorhang auf für:");
//         for (String catName : catsCast) {
//             System.out.println("- " + catName);
//         }
//     }
// }

// 2. Iteration mit dem Original Cast
package com.cc.java.arraylists2;
import java.util.ArrayList;
import java.util.List;

public class CatsOriginalCastApp {

    // einfacher Datentyp für eine Rolle im Musical
    static class CatRole {
        private String characterName; // z.B. "Grizabella"
        private String actorName;     // z.B. "Elaine Paige"

        public CatRole(String characterName, String actorName) {
            this.characterName = characterName;
            this.actorName = actorName;
        }

        public String getCharacterName() {
            return characterName;
        }

        public String getActorName() {
            return actorName;
        }

        @Override
        public String toString() {
            return characterName + " (gespielt von " + actorName + ")";
        }
    }

    public static void main(String[] args) {

        // 1. Dynamische Liste für die Cast-Rollen
        List<CatRole> originalLondonCast = new ArrayList<>();

        // 2. Auszug der Londoner Originalbesetzung von 1981
        originalLondonCast.add(new CatRole("Grizabella", "Elaine Paige"));
        originalLondonCast.add(new CatRole("Old Deuteronomy / Bustopher Jones", "Brian Blessed"));
        originalLondonCast.add(new CatRole("Rum Tum Tugger", "Paul Nicholas"));
        originalLondonCast.add(new CatRole("Mr. Mistoffelees", "Wayne Sleep"));
        originalLondonCast.add(new CatRole("Jemima (Sillabub)", "Sarah Brightman"));
        originalLondonCast.add(new CatRole("Munkustrap", "Jeff Shankley"));
        originalLondonCast.add(new CatRole("Jennyanydots", "Bonnie Langford"));
        originalLondonCast.add(new CatRole("Jellylorum / Griddlebone", "Susan Jane Tanner"));
        originalLondonCast.add(new CatRole("Skimbleshanks", "Kenn Wells"));
        originalLondonCast.add(new CatRole("Asparagus (Gus)", "Stephen Tate"));
        originalLondonCast.add(new CatRole("Bombalurina", "Geraldine Gardner"));
        originalLondonCast.add(new CatRole("TomCat", "Peter Schmidt"));
        

        // 3. Übersicht: Wie viele Katzen?
        System.out.println("Auszug der Londoner Originalbesetzung von 1981:");
        System.out.println("Anzahl der Rollen in der Liste: " + originalLondonCast.size());

        // 4. Zugriff auf ein bestimmtes Element per Index
        CatRole starOfTheNight = originalLondonCast.get(0); // Grizabella
        System.out.println("Star des Abends: " + starOfTheNight);

        // 5. Iteration: Vorstellung aller Rollen
        System.out.println("\nVorhang auf für unseren Auszug des Original-Casts:");
        for (CatRole role : originalLondonCast) {
            System.out.println("- " + role);
        }

        // 6. Eine moderne Streaming-Cat versucht, sich reinzumogeln
        CatRole sneakyCat = new CatRole("TikTok-Cat", "Random Influencer");
        System.out.println("\n" + sneakyCat.getCharacterName() +
                " versucht, sich heimlich in die Londoner Uraufführung von 1981 zu schleichen ...");
        System.out.println("Historisch leider nicht belegt, also kein Eintrag in die Original-Cast-ArrayList!");

        // (kein add() für sneakyCat: wir entscheiden bewusst, ob wir ein Element aufnehmen)
    }
}

