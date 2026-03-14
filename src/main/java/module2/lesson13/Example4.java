package module2.lesson13;

public class Example4 {
    public static void main(String[] args) {

    }

    public static Object createObject() {
        return new Object();
    }

    public static Object createObject(int count){
        if(count == 1){
            return new Integer(1);
        } else if(count ==2){
            return new String();
        } else {
            return new Object();
        }
    }
}
