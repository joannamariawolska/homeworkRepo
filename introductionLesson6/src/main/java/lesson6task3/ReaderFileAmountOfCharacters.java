package lesson6task3;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ReaderFileAmountOfCharacters {
    public static void getAmountOfCharacters() {
        File file = new File("/Users/mini/files/data.txt");

        try {
            String text = Files.readString(Path.of("/Users/mini/files/data.txt"));
            System.out.println(text.length());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}