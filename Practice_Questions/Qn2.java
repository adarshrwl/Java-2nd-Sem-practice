import java.util.Scanner;

/*Consider and take a number as input and count all the numbers that are the factors of 3 which is less
than that of the number considered. If there are no factors or the number is less than 0 then the 
output must be 0.  */

public class Qn2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int val = sc.nextInt();
        int count = 0;
        if (val < 0) {
            System.out.println("The factors for this number are :" + val);

        } else {
            for (int i = 1; i < val; i++) {
                if (i % 3 == 0) {
                    count++;
                }
            }
        }
        System.out.println("The numbers of the factors of the given numbers are :" + count);
    }
}
