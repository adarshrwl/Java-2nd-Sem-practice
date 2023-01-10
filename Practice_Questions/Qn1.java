import java.util.Scanner;

/*In Yakutia, Russia the surrounding temperature goes down up to -83.9°Fahrenheit which is very 
cold. So, the government has issued a notice that when the surrounding temperature goes down from 
32°Farenheit, the time to remain outside is reduced to 45 minutes which is decreased by every 5
minutes with respect to decrease in temperature by 10°Farenheit till -62°Farenheit. And when the 
temperature goes down from -62°Farenheit then each individual is restricted from being outside. 
Write a program that accepts the surrounding temperature and display whether an individual can 
remain outside.
Consider that the highest temperature recorded is 101.1°Farenheit
*/

public class Qn1 {
    public static void main(String[] args) {
        double hTemp = 101.1;
        double lTemp = -83.9;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature :");
        double oTemp = sc.nextInt();

        if (oTemp >= 32.0 && oTemp <= hTemp) {
            System.out.println("You can remain outside");
        } else if (oTemp < 32 && oTemp > -62) {
            if (oTemp <= -52) {
                System.out.println("You can onlu remain outside for 5 minutes");
            } else if (oTemp < -42) {
                System.out.println("You can only remain outside ofr 10 minutes");
            } else if (oTemp < -32) {
                System.out.println("You can only remain outside ofr 15 minutes");
            } else if (oTemp < -22) {
                System.out.println("You can only remain outside ofr 20 minutes");
            } else if (oTemp < -12) {
                System.out.println("You can only remain outside ofr 25 minutes");
            } else if (oTemp < -2) {
                System.out.println("You can only remain outside ofr 30 minutes");
            } else if (oTemp < 2) {
                System.out.println("You can only remain outside ofr 35 minutes");
            } else if (oTemp < 22) {
                System.out.println("You can only remain outside of 40 minutes");
            } else if (oTemp < 32) {
                System.out.println("You can only remain outside ofr 45 minutes");
            }
        } else {
            System.out.println("This does not Happens in Russia");
        }

    }

}
