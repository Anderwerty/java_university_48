package module1.lesson27;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Input date using such pattern yyyy/MM/dd, example '2026/01/23'");
        String next = console.next();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate parse = LocalDate.parse(next, formatter);
        System.out.println(parse);
    }
}
