//4. Write a JAVA program to check whether a number is divisible by 5 and 11 or not.
public class D {
    public static void main(String[] args) {
        int num1 = 10;
        if (num1 % 5 == 0 && num1 % 11 == 0) {
            System.out.println("It is divisible by 5 and 11");
        } else {
            System.out.println("It is not divisible by 5 and 11");
        }
    }
}
