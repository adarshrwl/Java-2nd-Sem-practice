//6. Write a JAVA program to check whether a year is leap year or not.

public class F {
    public static void main(String[] args) {
        int year = 4010;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("It is leap Year");
                }
            }
        } else {
            System.out.println("It is not a leap Year");
        }
    }
}
