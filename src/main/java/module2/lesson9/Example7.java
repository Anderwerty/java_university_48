package module2.lesson9;

public class Example7 {
    public static void main(String[] args) {
        GenericClass<Integer> gInt = new GenericClass<>(10); // 10 wrapped into Integer using Integer.valueOf
        GenericClass<Integer> clonedInt = gInt.clone();
        System.out.println(clonedInt.getT());
        GenericClass<Object> d = new GenericClass<>(null);

    }
}

class GenericClass<T> implements Cloneable {
    private final T t;


    GenericClass(T t) {
        System.out.println("....... Constructor");
        this.t = t;
    }

    public T getT(){
        return t;
    }

    @Override
    public GenericClass<T> clone() {

//        return new GenericClass<>(this.t);
        try {
           return (GenericClass<T>) super.clone();

        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
