package module2.lesson5;

import module1.lesson14.A;

import java.util.ArrayList;
import java.util.List;

public class Example3 {
    public static void main(String[] args) {
        ArrayList<MyClass> list1 = new ArrayList<>();
        list1.add(new MyClass());
        list1.add(new MyClass2());
        ArrayList<MyClass2> list2 = new ArrayList<>();
        doSomething(list1);
        doSomething(list2);

        doSomething3(list1);
        doSomething3(list2);
        doSomething3(new ArrayList());
    }

    public static void doSomething(List<? extends MyClass> list) {
        for (MyClass object : list) {
            System.out.println(object.getState());
        }
    }

    public static void doSomething2(List<? extends MyClass> list) {
       //list.add(new MyClass());
    }

    public static void doSomething3(List<? super MyClass2> list) {
        list.add(new MyClass2());
    }
}

class MyClass {
    public String getState() {
        return "";
    }
}

class MyClass2 extends MyClass{

}
