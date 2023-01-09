package lesson6task0;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        writeToFile("/Users/mini/files/data.txt", "Kurs\nJava\nLekcja 6\nPliki\nWyjątki\nPliki\nKoniec pliku");
    }

    public static void writeToFile(String pathToFile, String text){
        try {
            Files.writeString(Paths.get(pathToFile), text);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}