public class Constructor3 {
    Constructor3(String lang) {
        String Language = lang;
        System.out.println("Language :" + Language);
    }

    public static void main(String[] args) {
        Constructor3 c1 = new Constructor3("Python");
        Constructor3 C2 = new Constructor3("Java");
        Constructor3 C3 = new Constructor3("JavaScript");
    }
}
