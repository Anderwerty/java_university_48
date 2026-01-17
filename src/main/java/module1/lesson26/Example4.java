package module1.lesson26;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class Example4 {
    public static void main(String[] args) {
        Path root = Path.of("src/main/resources").toAbsolutePath();
        try(DirectoryStream<Path> paths = Files.newDirectoryStream(root)){
            for (Path path : paths) {
                System.out.println(path);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
