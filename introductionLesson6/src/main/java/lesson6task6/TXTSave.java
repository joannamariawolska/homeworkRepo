package lesson6task6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class  TXTSave{

    public static void writeToFile(String pathToFile, String upperCaseText) {
        try {
            Files.writeString(Paths.get(pathToFile), upperCaseText);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}