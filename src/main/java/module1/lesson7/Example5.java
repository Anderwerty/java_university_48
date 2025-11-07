package module1.lesson7;

public class Example5 {
    public static void main(String[] args) {
//        int length = 200;
        int[] students = new int[200];

        for (int i = 0; i < students.length; i++) {
            students[i] = 170 + i * 2;
        }

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
    }
}
