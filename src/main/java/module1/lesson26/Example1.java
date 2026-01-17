package module1.lesson26;

import java.io.File;
import java.nio.file.Path;

public class Example1 {

    private static final String SEPARATION_LINE = "=".repeat(10);

    public static void main(String... args) {

        Path path = Path.of("/Users/andrii_shylin/IdeaProjects/java_university_48/src/main/resources/lesson26/example10.txt");

        System.out.println("Path");
        System.out.println(path.toAbsolutePath());
        System.out.println(path.getFileName());
        System.out.println(path.getRoot());
        System.out.println(path.getNameCount());

        System.out.println(SEPARATION_LINE);
        System.out.println("File");
        File file = path.toFile();
        System.out.println(file.getName());
        System.out.println(file.isDirectory());
        System.out.println(file.isFile());
        System.out.println(file.exists());

    }





}
