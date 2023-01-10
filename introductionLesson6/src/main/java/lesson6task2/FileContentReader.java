package lesson6task2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileContentReader {
    public static void readEverySecondLine(String inputFilePath) {
        try {
            List<String> allLines = Files.readAllLines(Paths.get(inputFilePath));
            printEverySecondLine(allLines);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void printEverySecondLine(List<String> allLines){
        for (int i = 0; i < allLines.size(); i ++){
            if (i % 2 == 0){
                System.out.println(allLines.get(i));
            }
        }
    }
}