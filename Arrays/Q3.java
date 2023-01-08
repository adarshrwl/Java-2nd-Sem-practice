import java.util.ArrayList;
import java.util.Collections;

// WAP to sort the integer elements of array of size 10 in ascending and descending
// order.

public class Q3 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arr.add(i);
        }
        System.out.println(arr);
        Collections.sort(arr);
        Collections.reverse(arr);
        System.out.println(arr);

    }
}
