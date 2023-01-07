import java.util.Scanner;

//Storing USing Loop
public class Arr3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array1 = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter your value for position " + i);
            int val = sc.nextInt();
            array1[i] = val;
        }

        System.out.println("Your input values are :");
        for (int j = 0; j < 10; j++) {
            System.out.println(array1[j]);
            sc.close();
        }
    }
}
