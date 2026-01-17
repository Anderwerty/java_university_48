package module1.lesson27;

import java.util.Comparator;
import java.util.TreeSet;

public class Answer {
    public static void main(String[] args) {
        TreeSet<Color> colors = new TreeSet<>(new ColorComparator());
        int value = 10;
        if (value < 10) {
            System.out.println("Hello");
        }
        int counterWhile = 0;
        while (counterWhile < 100) {
            counterWhile++;
        }
    }
}

class Color implements Comparable<Color> {
    private String name;

    public Color(String name) {
        this.name = name;
    }

    @Override
    // compare this and that
    public int compareTo(Color that) {
        return 0;
    }
}

class ColorComparator implements Comparator<Color> {
    @Override
    public int compare(Color o1, Color o2) {
        return 0;
    }
}
