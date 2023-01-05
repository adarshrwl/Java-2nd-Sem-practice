//8. Write a JAVA program to input any alphabet and check whether it is vowel or consonant.
public class H {
    public static void main(String[] args) {
        char c = 'c';
        if (Character.isAlphabetic(c)) {
            c = Character.toLowerCase(c);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                System.out.println("It is vovel letter");
            } else {
                System.out.println("It is consonant letter");
            }
        } else {
            System.out.println("It is not alphabet");
        }
    }
}
