import java.util.ArrayList;
import java.util.Collections;

public class ArrList4 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        // adding elements to the arraylists
        al.add("A");
        al.add("B");
        al.add("C");
        al.add("D");

        // adding the elements between the arrylist
        al.add(1, "a");
        System.out.println(al);

        // Getting the elements in between

        System.out.println(al.get(1));

        // Chaning the elements of the arraylist
        al.set(1, "Adarsh");
        System.out.println(al);

        // Getting the arraylist Size
        int Size = al.size();
        System.out.println(Size);

        // adding more elements into the arraylist
        al.add("Hello");
        al.add(0, "Rawal");

        // Sorting
        Collections.sort(al);
        System.out.println(al);

    }
}
