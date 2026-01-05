package module1.lesson24;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class MyFileWriter {
    public void write(String filePath, String text) {
        try (Writer writer = new FileWriter(filePath, true)) {
            writer.write(text);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
