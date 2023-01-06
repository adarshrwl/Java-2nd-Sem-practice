// Question 4
// WAP to display no. of even and no. of odd number between 10 and 30
public class q4 {
    public static void main(String[] args) {
        int even = 0;
        int odd = 0;
        for (int i = 9; i < 30; i++) {
            if (i % 2 == 0) {
                even++;
            } else if (i % 2 != 0) {
                odd++;
            }
        }
        System.out.println("Number of odd numbers: " + odd);
        System.out.println("Number of even numbers: " + even);
    }
}