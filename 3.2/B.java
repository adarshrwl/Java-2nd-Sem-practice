// Write First JAVA program to find maximum between three numbers.
public class B {
    public static void main(String[] args) {
        int num1=10;
        int num2=30;
        int num3=25;
        int max=num1;

        if (num2>max){
            max=num2;
        }
        if(num3>max){
        max=num3;
        }
        System.out.println("Maximum of three numbers is: " + max);

    }
}
