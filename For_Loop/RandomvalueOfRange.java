import java.util.Random;

public class RandomvalueOfRange {
    public static void main(String[] args) {
        Random rm = new Random();
        int x = rm.nextInt(100);
        System.out.println(x);
    }
}
