import java.util.ArrayList;

public class ArrList2 {
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
        System.out.println(al.get(4));

    }
}
