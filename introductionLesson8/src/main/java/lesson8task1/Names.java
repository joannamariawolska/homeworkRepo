package lesson8task1;

import java.util.*;

public class Names {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Anna");
        names.add("Katarzyna");
        names.add("Tymon");
        names.add("Tadeusz");
        names.add("Anna");
        names.add("Karolina");
        names.add("Dorota");
        names.add("Piotr");

        List<String> uniqueNames = new ArrayList<>();
        for (String name : names) {
            if (!uniqueNames.contains(name)){
                uniqueNames.add(name);
            }
        }
        System.out.println("Lista bez powtarzających się imion: " + uniqueNames);


        List<String> reverseNames = new ArrayList<>();
        for (int i = uniqueNames.size() - 1; i >= 0; i--) {
            reverseNames.add(uniqueNames.get(i));
        }
        System.out.println("Lista wyświetlana w odwrotnej kolejności: " + reverseNames);


        String original = "Anna";
        String changed = "Joanna";
        for (int i = 0; i < reverseNames.size(); i++) {
            if (reverseNames.get(i).equals(original)) {
                reverseNames.set(i, changed);
            }
        }
        System.out.println("Lista po zmianie imienia: " + reverseNames);
    }
}