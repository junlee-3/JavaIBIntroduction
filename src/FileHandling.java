import java.io.IOException;
import java.nio.file.*;

public class FileHandling {
     public static void main(String[] args) throws IOException {
        try {
            Path path = Paths.get("src/example.txt");
            for (String line: Files.readAllLines(path)) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new IOException();
        }
        readFile("src/example.txt");


    }

    public static void readFile(String location) throws IOException {
        try {
            Path locationPath = Paths.get(location);
            for (String line: Files.readAllLines(locationPath)) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new IOException();
        }
    }
}

