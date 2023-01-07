import java.util.Scanner;

//Write a program that takes input from the user and gives the sum of all the input values using arrays
public class Arr4 {
    public static void main(String[] args) {
        int[] arr1 = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter your number");
            arr1[i] = sc.nextInt();
        }
        int total = 0;
        for (int i = 0; i < 5; i++) {
            total = arr1[i] + total;
        }
        System.out.println("Your Total Value is :");
        System.out.print(total);
        sc.close();
    }
}
