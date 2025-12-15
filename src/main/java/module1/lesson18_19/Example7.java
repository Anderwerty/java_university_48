package module1.lesson18_19;

import java.util.Comparator;
import java.util.TreeMap;

public class Example7 {
    public static void main(String[] args) {
        Comparator<Student> comparator = new Comparator<>() {
            @Override
            public int compare(Student o1, Student o2) {
                int gradeFirst = o1.desing + o1.english + o1.math;
                int gradeSecond = o2.desing + o2.english + o2.math;
                return Integer.compare(gradeFirst, gradeSecond);
            }
        };

        TreeMap<Student, Boolean> students = new TreeMap<>(comparator);

        students.put(new Student(), true);
    }
}

class Student implements Comparable<Student> {
    int desing;
    int math;
    int english;

    @Override
    public int compareTo(Student o) {
        return 0;
    }
}


