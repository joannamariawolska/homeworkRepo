package lesson6task4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileContentReader {
    public static void getSearchWord(String inputFilePath, String searchWord) {

        try {
            String text = Files.readString(Paths.get(inputFilePath));
            if (text.contains(searchWord)) {
                System.out.println("Szukane słowo znaleziono w pliku: " + searchWord + ".");
            } else {
                System.out.println("Nie znaleziono");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}