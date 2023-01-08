import java.util.ArrayList;
import java.util.Scanner;

// 1. Write code that creates an ArrayList that can hold string objects. Add the names of
// three cars to the ArrayList, and then display the contents of the ArrayList

public class Q1 {
    public static void main(String[] args) {
        ArrayList<String> carName = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter your Car name :");
            String carN = sc.next();
            carName.add(i, carN);
        }
        System.out.println(carName);
    }
}
