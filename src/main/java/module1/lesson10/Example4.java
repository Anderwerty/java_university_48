package module1.lesson10;

public class Example4 {
    public static void main(String[] args) {

    }
}

class Solution {
    public int count = 0;
    public int sum = 0;
    public void add(int data) {
        sum = sum + data;
        int sum = data * 2 + this.sum;
        System.out.println(sum);
        System.out.println(this.sum);
        count++;
    }

    public void method(){
        System.out.println(sum);
    }
}
