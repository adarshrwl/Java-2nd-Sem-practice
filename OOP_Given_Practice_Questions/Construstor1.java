class Const1 {
    Const1() {
        System.out.println("This is inside constructor");
        System.out.println("Constructor is Running");
    }

}

public class Construstor1 {
    public static void main(String[] args) {
        Const1 c = new Const1();
        // Constructor will run after this command
        // This will execute will running this program
    }
}
