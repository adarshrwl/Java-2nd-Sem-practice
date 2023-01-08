import java.util.ArrayList;

// 2. WAP to create a function which accepts the arraylist of integer of size 10 as
// parameter and return the sum of prime numbers present in it

public class Q2 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(10);
        arr.add(1);
        arr.add(4);
        arr.add(7);
        arr.add(8);
        arr.add(2);
        arr.add(1);
        arr.add(5);
        arr.add(6);
        arr.add(9);
        arr.add(10);
        System.out.println(arr);
        System.out.println(arr.size());
        int total = 0;
        for (int i = 0; i < 10; i++) {
            total = (arr.get(i)) + total;
        }
        System.out.println(total);
    }
}
