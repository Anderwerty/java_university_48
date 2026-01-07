package module1.lesson25;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Example4 {
    public static void main(String[] args) {
        String filename = "/Users/andrii_shylin/IdeaProjects/java_university_48/src/main/resources/example4.txt";
        try (FileInputStream fileInputStream = new FileInputStream(filename);
             BufferedInputStream bis = new BufferedInputStream(fileInputStream)) {
            byte[] bytes = new byte[16];
            int numberOfBytes;
            while ((numberOfBytes = bis.read(bytes)) != -1) {
                System.out.print(new String(bytes, 0, numberOfBytes));
            }

        } catch (IOException e) {

        }

        System.out.println("end");
    }
}
