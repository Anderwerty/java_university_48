package module1.lesson18;

public class Example2 {
    public static void main(String[] args) {
        A a = new A(1);
        a.setValue(200);
    }
}

class A {
   private int value;

   public A(int value){
       this.value = value;
   }

   public void setValue(int value){
       this.value = value;
   }

   public int getValue(){
       return this.value;
   }
}
