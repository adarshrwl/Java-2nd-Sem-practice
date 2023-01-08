import java.util.ArrayList;

public class ArrList3 {

    public static void main(String[] args) {
        // Creating the arraylist
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

    }
}
