package module2.lesson15;

public class Example5 {
    public static void main(String[] args) {
        Object o = new Object() {
            @Override
            public String toString(){
                return "anonimus";
            }

        };
        System.out.println(o);

        new MyClass("10") {

            private int value;

            public MyClass setValue(int value){
                this.value = value;
                return this;
            }

            public int getValue(){
                return value;
            }
        }.setValue(10);




    }
}

class MyClass {
    public MyClass(String name){

    }
}
