package module1.lesson26;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class Example3 {

    private static final int BUFFER_CAPACITY = 16;

    public static void main(String[] args) {
        String filePath = "src/main/resources/lesson26/example3.txt";
        try (RandomAccessFile randomAccessFile = new RandomAccessFile(filePath, "rw");
             FileChannel channel = randomAccessFile.getChannel()) {
            ByteBuffer buffer = ByteBuffer.allocate(BUFFER_CAPACITY);

            int size;
            while ((size = channel.read(buffer)) != -1) {
             // System.out.println("size: " + size);
              buffer.flip();

                while (buffer.hasRemaining()){
                    System.out.print((char)buffer.get()); // is not right to use
                    buffer.mark();

//                    buffer.reset();
                }
                buffer.clear();
            }

        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
