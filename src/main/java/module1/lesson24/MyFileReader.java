package module1.lesson24;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MyFileReader {

    private static final int DEFAULT_BUFFER_SIZE = 16;

    public List<Character> readCharactersFromFile(String filePath) {
        List<Character> symbols = new ArrayList<>();
        try (Reader reader = new FileReader(filePath)) {
            int symbol;

            while ((symbol = reader.read()) != -1) {
                symbols.add((char) symbol);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return symbols;
    }

    public List<Character> readCharactersFromFileBatch(String filePath) {
        List<Character> symbols = new ArrayList<>();
        try (Reader reader = new FileReader(filePath)) {
            char[] buffer = new char[DEFAULT_BUFFER_SIZE];

            //12345678
            //____
            int numberOfReadChars = reader.read(buffer, 0, buffer.length);
            while (numberOfReadChars != -1) {
//                String textFromBuffer = new String(buffer, 0, numberOfReadChars);
//                System.out.println(textFromBuffer);
                for (int i = 0; i < numberOfReadChars; i++) {
                    symbols.add(buffer[i]);
                }
                numberOfReadChars = reader.read(buffer, 0, buffer.length);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return symbols;
    }

    public void readFromFile(String filePath){
        try(InputStream inputStream = new FileInputStream(filePath)){
            int read = inputStream.read();
        } catch (IOException e){
            throw new IORuntimeException(e);
        }
    }
}
