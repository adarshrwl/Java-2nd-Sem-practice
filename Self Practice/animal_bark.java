public class animal_bark {
    public static void main(String[] args) {
        Animal al = new Animal("Dog");
        task t = new task();
        t.bark(al);
        t.stop(al);
        Animal al1 = new Animal("Cat");
        t.sleep(al1);
        t.bark(al1);
    }
}
