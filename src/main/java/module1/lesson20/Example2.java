package module1.lesson20;

public class Example2 {
    public static void main(String[] args) {
        System.out.println(Color.RED.getNumber());
//        Color.RED.setNumber(12345);
        System.out.println(Color.RED.getNumber());

//        Color color = new Color(123456);

    }
}

enum Color {
    RED(101), YELLOW(1001);

    public static void printInfo(){
        for (Color value : Color.values()) {
            System.out.println(value);
        }
    }

    private final int number;

    private Color(int number){
        this.number = number;
    }

    public int getNumber(){
        return number;
    }

//    public void setNumber(int number){
//        this.number = number;
//    }
}
