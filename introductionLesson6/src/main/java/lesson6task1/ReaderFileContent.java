package lesson6task1;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ReaderFileContent {
    public static void getFileContent() {
        File file = new File("/Users/mini/files/data.txt");

        try {
            String text = Files.readString(Path.of("/Users/mini/files/data.txt"));
            System.out.println(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}