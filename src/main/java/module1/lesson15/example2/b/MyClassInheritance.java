package module1.lesson15.example2.b;

import module1.lesson15.example2.a.MyClass2;

public class MyClassInheritance extends MyClass2 {

    public void newMethod(){
        System.out.println(this.protectedValue);
    }
}
