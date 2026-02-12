package module2.lesson2;

import java.util.ArrayList;
import java.util.List;

public class Example1 {
    public static void main(String[] args) {
        //Figure figure = new Figure("");
        Figure circle = new Circle(1);

        Square square = new Square(1);


        System.out.println(circle.getName());
        System.out.println(circle.calculateArea());
        System.out.println(circle.calculatePerimeter());


        System.out.println("=========");
        System.out.println(square.getName());
        System.out.println(square.calculateArea());
        System.out.println(square.calculatePerimeter());


        List<Figure> figures = new ArrayList<>();
        figures.add(circle);
        figures.add(new Circle(10));
        figures.add(square);

        double result = 0;

        for (Figure figure : figures) {
            result += figure.calculateArea();
        }

        System.out.println("total area: " + result);

        System.out.println("========================");
        Circle circle1 = new Circle(11);
        Figure circle2 = new Circle(12);

        //circle2 = circle1;
        //circle1 = circle2;

        circle1.method();
        ((Circle) circle2).method();

    }
}

abstract class Figure {
    private final String name;

    Figure(String name) {
        super();
        this.name = name;
    }

    protected String getName() {
        return name;
    }

    public abstract double calculateArea();

    public abstract double calculatePerimeter();
}

class Circle extends Figure {

    private final double radius;

    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String getName() {
        return super.getName() + "!";
    }

    public String getName(String message){
        return message;
    }


     //@Override
    public void method() {
        System.out.println("Method from square");
    }
}

class Square extends Figure {

    private final double side;

    Square(double side) {
        super("Square");
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * side;
    }
}

class A extends Object {
    public A() {
        super();
    }
}
