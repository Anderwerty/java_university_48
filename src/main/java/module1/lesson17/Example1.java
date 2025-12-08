package module1.lesson17;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Example1 {
    public static void main(String[] args) {
        List<String> items = new ArrayList<>();

        String s = items.get(20);


        LinkedList<String> strings = new LinkedList<>();
        strings.add("One");
        strings.add("Two");
        int n = 10000000;
        String s1 = strings.get(20);


        //O(2n+1)=O(2n)=O(n)
        // O(100)=O(1)
        // O(2n*n-n+10)= O(2n*n-n)=O(2*n*n)=O(n*n)
        // n --> infinity
        for (int i = 0; i < 2 * n + 2; i++) {
            // some calculation
        }

        //

        for(int i = 0; i< n-1; i++){
            for (int j = 0; j < 2*n+3; j++) {
                // some calculation
            }
        }

        //(n-1)(2n+3)= 2n*n +n-3
        // O(2n^2+n-3)= O(2n^2)=O(n^2)

    }
}
