import java.util.Scanner;

//9. Write a JAVA program to input any character and check whether it is alphabet, digit or special
//character.
public class I {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your character alphabet or digit");
        char ch = sc.next().charAt(0);
        if (Character.isAlphabetic(ch)) {
            System.out.println("It is alphabet");
        } else if (Character.isDigit(ch)) {
            System.out.println("It is Digit");
        } else {
            System.out.println("It is Special CHaracter");
        }
        sc.close();
    }

}
