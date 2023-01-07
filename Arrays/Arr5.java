import java.util.Scanner;

// Write a Java program to calculate the average value of array element.
public class Arr5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array you want to create");
        int len = sc.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            System.out.println("Enter your  Value ");
            int val = sc.nextInt();
            arr[i] = val;
        }
        sc.close();
        int total = 0;
        for (int i = 0; i < len; i++) {
            total = total + arr[i];
        }
        double avg = total / len;
        System.out.println("Your average value of the input data is :" + avg);
    }
}
