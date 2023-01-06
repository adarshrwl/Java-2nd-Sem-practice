public class Bicycle {
    int gear = 5;

    void braking() {
        System.out.println("Breaking the bicycle");
    }

    public static void main(String[] args) {
        Bicycle bc = new Bicycle();
        System.out.println(bc.gear);
        bc.braking();

    }
}
