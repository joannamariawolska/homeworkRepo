package lesson11task5;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class UniqueLetters {
    public static Set<Character> getLetters(){

        List<String> words = Arrays.asList("FutureCollars", "java", "homework", "HelloWorld");

        Set<Character> uniqueLetters = words.stream()
                .map(word -> word.toUpperCase())
                .flatMap(word -> word.chars().mapToObj(c -> (char) c))
                .collect(Collectors.toSet());
        return uniqueLetters;
    }

    public static void main(String[] args) {
        System.out.println(UniqueLetters.getLetters());
    }
}