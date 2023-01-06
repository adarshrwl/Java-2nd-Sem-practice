import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base number");
        int base = sc.nextInt();
        System.out.println("Enter the exponent value");
        int exponent = sc.nextInt();

        int total = 1;
        for (int i = 1; i <= exponent; i++) {
            total *= base;
        }
        System.out.println(total);
    }
}
// Two numbers are entered through the keyboard. Write a program to find the
// value
// of one number raised to the power of another. (Do not use Java built-in
// method)
