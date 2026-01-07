package module1.lesson25;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class Example1 {
    public static void main(String[] args) {
        String text = "漢字Example text";
        byte[] bytes = text.getBytes();

        // read full byte array
        System.out.println("read full byte array");
        String readText = read(bytes);
        System.out.println(text.equals(readText));


        // read by bytes
        System.out.println("read by bytes");
        try (ByteArrayInputStream bais = new ByteArrayInputStream(bytes)) {
            int available = bais.available();
            byte[] readBytes = new byte[available];
            for (int i = 0; i < readBytes.length; i++) {
                readBytes[i] =(byte) bais.read();
            }
            System.out.println(new String(readBytes));

        } catch (IOException e) {

        }

        String text2 = "abcd";
        byte[] bytes2 = text2.getBytes();
        // example with mark, skip
        System.out.println(" example with mark, skip");
        try (ByteArrayInputStream bais = new ByteArrayInputStream(bytes2)) {


            System.out.println(new String(bais.readAllBytes()));
            bais.reset();
            System.out.println(new String(bais.readAllBytes()));
            bais.reset();
            bais.read();
            bais.read();
            bais.mark(0);
            bais.read();
            bais.mark(0);
            System.out.println(new String(bais.readAllBytes()));
            bais.reset();
            bais.reset();
            System.out.println(new String(bais.readAllBytes()));

        } catch (IOException e) {

        }
    }

    private static String read(byte[] bytes) {
        try (ByteArrayInputStream bais = new ByteArrayInputStream(bytes)) {
            byte[] readAllBytes = bais.readAllBytes();

            return new String(readAllBytes);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
