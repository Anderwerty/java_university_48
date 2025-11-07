package module1.lesson7;

public class Example4 {
    public static void main(String[] args) {
        int[] students = new int[10];

        System.out.println(students[0]);

        students[0] = 100;
        students[0] = students[0] + 1;

        System.out.println(students[0]);
    }
}
