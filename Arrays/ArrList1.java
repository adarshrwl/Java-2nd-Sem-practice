import java.util.ArrayList;

public class ArrList1 {
    public static void main(String[] args) {
        // Creating The arraylist
        ArrayList<Integer> arr = new ArrayList<>();

        // Adding the elements to the arraylist
        arr.add(10);
        arr.add(20);
        arr.add(30);

        // Printing the arraylist
        System.out.println(arr);
        System.out.println(arr.get(1));
    }
}
