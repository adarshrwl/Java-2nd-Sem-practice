import java.util.Scanner;

class calculateInterest {
    public double calculateInt(int principle, int time, int Rate) {
        double value = (principle * Rate * time) / 100;
        return value;
    }
}

public class CalcPrinc {
    public static void main(String[] args) {
        System.out.println("Please Enter the asked value to calculate the simple interest:");
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the principle amount :");
        int value = sc.nextInt();
        System.out.println("Enter the Time :");
        int time = sc.nextInt();
        System.out.println("Enter the Rate :");
        int Rate = sc.nextInt();
        calculateInterest CI = new calculateInterest();
        double total = CI.calculateInt(value, time, Rate);
        System.out.println("Your Total Interest is :" + total);

    }
}
