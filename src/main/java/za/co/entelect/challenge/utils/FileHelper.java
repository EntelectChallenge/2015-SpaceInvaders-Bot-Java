package za.co.entelect.challenge.utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileHelper {

    private final static Charset ENCODING = StandardCharsets.UTF_8;

    public static File getFile(String outputFolder, String fileName) {
        File file = Paths.get(outputFolder, fileName).toFile();

        return file;
    }

    public static StringBuilder readFile(String folder, String aFileName) throws IOException {
        Path path = Paths.get(folder, aFileName);
        try (Scanner scanner = new Scanner(path, ENCODING.name())) {
            StringBuilder textData = new StringBuilder();
            while (scanner.hasNextLine()) {
                textData.append(scanner.nextLine() + "\n");
            }
            return textData;
        }
    }

    public static void writeFile(String folder, String aFileName, String aItem) throws IOException {
        Path path = Paths.get(folder, aFileName);
        try (BufferedWriter writer = Files.newBufferedWriter(path, ENCODING)) {
            writer.write(aItem);
            writer.newLine();
        }
    }
}
