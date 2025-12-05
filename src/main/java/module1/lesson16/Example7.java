package module1.lesson16;

import java.util.ArrayList;

public class Example7 {
    public static void main(String[] args) {
        Integer[] sourceInts = new Integer[10];

        String[] sourceStrings = new String[10];
        String[] target = new String[200];


        ArrayList<String> list = new ArrayList<>();

        copy2(sourceStrings, target);

//        System.arraycopy();


    }

    public static void copy(int[] source, int[] target){
        // source and target not null
        // target.length >= source.length
        for (int i = 0; i < source.length; i++) {
            target[i]= source[i];
        }
    }


    public static <T> void copy2(T[] source, T[] target){
        // source and target not null
        // target.length >= source.length
        for (int i = 0; i < source.length; i++) {
            target[i]= source[i];
        }
    }
}
