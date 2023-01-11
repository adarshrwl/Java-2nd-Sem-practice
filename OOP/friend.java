public class friend {
    String friends;
    static int number_friends;

    friend(String friends) {
        this.friends = friends;
        number_friends++;
    }

    static void num() {
        System.out.println("You have " + number_friends + " friends");
    }

    public void dance() {
        System.out.println(this.friends + " is dancing");
    }

    static void sleep() {
        System.out.println("He is sleeping");
    }

}
