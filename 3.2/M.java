import java.util.Scanner;

// 13. Write a JAVA program to count total number of notes in given amount.
public class M {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount of the money:");
        int number = sc.nextInt();

        int number1 = (number - (number % 1000)) / 1000;
        System.out.println("Number of 1000 notes required:" + number1);
        number = number - 1000 * (number1);
        int number2 = (number - (number % 500)) / 500;
        System.out.println("Number of 500 notes required:" + number2);
        number = number - 500 * number2;

        int number3 = (number - (number % 100)) / 100;
        System.out.println("Number of 100 notes required:" + number3);
        number = number - 100 * number3;

        int number4 = (number - (number % 50)) / 50;
        System.out.println("Number of 50 notes required:" + number4);
        number = number - 50 * number4;

        int number5 = (number - (number % 20)) / 20;
        System.out.println("Number of 200 notes required:" + number5);
        number = number - 20 * number5;

        int number6 = (number - (number % 10)) / 10;
        System.out.println("Number of 10 notes required:" + number6);
        number = number - 10 * number6;

        int number7 = (number - (number % 5)) / 5;
        System.out.println("Number of 5 notes required:" + number7);
        number = number - 5 * number7;

        int number8 = (number - (number % 2)) / 2;
        System.out.println("Number of 5 notes required:" + number8);
        number = number - 2 * number8;

        int number9 = (number - (number % 1)) / 1;
        System.out.println("Number of 5 notes required:" + number9);
        sc.close();
    }
}
