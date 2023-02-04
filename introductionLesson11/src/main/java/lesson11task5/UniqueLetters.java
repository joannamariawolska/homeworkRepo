package lesson11task5;

import java.util.*;
import java.util.stream.Collectors;

public class UniqueLetters {

    public static Set<Character> getUniqueLetters(List<String> input){

        return input.stream()
                .map(word -> word.toUpperCase())
                .flatMap(word -> word.chars().mapToObj(c -> (char) c))
                .collect(Collectors.toSet());
    }

    public static void main(String[] args) {
        System.out.println(getUniqueLetters(List.of("java", "FutureCollars", "OOP", "programowanie")));
    }
}