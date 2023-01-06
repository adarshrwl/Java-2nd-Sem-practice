import java.util.Scanner;

// Write a program to enter the numbers till the user wants and at the end it should
// display the count of positive, negative and zeros entered.
public class q11 {
    public static void main(String[] args) {
        char val = 'n';
        Scanner sc = new Scanner(System.in);
        int positive = 0, negative = 0, zero = 0;
        do {
            System.out.println("Enter the number");
            int number = sc.nextInt();
            if (number < 0) {
                negative++;
            } else if (number > 0) {
                positive++;
            } else {
                zero++;
            }
            System.out.println("Do you want to Enter New values(y/n)");
            val = sc.next().charAt(0);
        } while (val == 'y');
        System.out.println("Positive numbers Entered :" + positive);
        System.out.println("Negeative numbers Entered :" + negative);
        System.out.println("Zero numbers Entered :" + zero);

    }
}
