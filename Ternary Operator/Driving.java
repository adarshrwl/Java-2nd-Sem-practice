import java.util.Scanner;

public class Driving {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();
        String value = (age >= 18) ? "You can drive" : "You cannot drive";
        System.out.println(value);
        sc.close();
    }
}
