package module1.lesson25;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class Example2 {
    public static void main(String[] args) {
        String textToWrite = "abcd!";
        byte[] bytes = textToWrite.getBytes();

        try(ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
            baos.write(bytes);
            baos.write(bytes);

            byte[] byteArray = baos.toByteArray();
            System.out.println(new String(byteArray));
        }catch (IOException e){

        }


    }
}
