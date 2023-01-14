package lesson6task5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileContentReader {
    public static void getReversePart(String inputFilePath) {
        try {
            List<String> allLines = Files.readAllLines(Paths.get(inputFilePath));
            printReversePart(allLines);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static void printReversePart(List<String> allLines){
        for (int i = allLines.size() - 1; i > 0; i --){
                System.out.println(allLines.get(i));
        }
    }
}