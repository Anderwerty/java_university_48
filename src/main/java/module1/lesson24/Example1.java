package module1.lesson24;

import java.util.List;

public class Example1 {
    public static void main(String[] args) {
        String filePath1 = "/Users/andrii_shylin/IdeaProjects/java_university_48/src/main/resources/example1.txt";
        String filePath2 = "/Users/andrii_shylin/IdeaProjects/java_university_48/src/main/resources/example2.txt";
        String filePath3 = "/Users/andrii_shylin/IdeaProjects/java_university_48/src/main/resources/example3.txt";
        MyFileReader myFileReader = new MyFileReader();
        MyFileWriter myFileWriter = new MyFileWriter();

        List<Character> characters1 = myFileReader.readCharactersFromFile(filePath1);
        System.out.println(characters1);
        System.out.println("=".repeat(100));
        List<Character> characters2 = myFileReader.readCharactersFromFile(filePath2);
        System.out.println(characters2);

        System.out.println("=".repeat(100));
        System.out.println(myFileReader.readCharactersFromFileBatch(filePath2));


        System.out.println("===========");
        myFileWriter.write(filePath3, "Hello Ukraine!!!");

    }

}

