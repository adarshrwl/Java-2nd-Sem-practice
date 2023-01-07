import java.util.Scanner;

//Write a Java program to find the maximum and minimum value of an array

public class Arr6 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter the Value :");
            int val = sc.nextInt();
            arr[i] = val;
        }
        int max = arr[1];
        int min = arr[1];
        for (int i = 0; i < 10; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("Maximum value among input number is " + max);
        System.out.println("Minimum value among input number is " + min);

    }
}
