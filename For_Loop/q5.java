import java.util.Scanner;

// Question 5
// WAP to display multiplication table of a given no.
public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want the multiplication of:");
        int number = sc.nextInt();
        sc.close();
        for (int i = 1; i < 11; i++) {
            System.out.println(number + "*" + i + "=" + number * i);
        }
    }
}
