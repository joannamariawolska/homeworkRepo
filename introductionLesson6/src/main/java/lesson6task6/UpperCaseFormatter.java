package lesson6task6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static lesson6task6.TXTSaver.writeToFile;

public class UpperCaseFormatter {
    public static void formatAndWriteToFile(String inputFilePath, String outputFilePath) {
        try {
            String text = Files.readString(Path.of(inputFilePath));
            writeToFile(outputFilePath, text.toUpperCase());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}