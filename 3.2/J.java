//10. Write a JAVA program to check whether a character is uppercase or lowercase alphabet.

public class J {
    public static void main(String[] args) {
        char c = 'a';
        if (Character.isLowerCase(c)) {
            System.out.println("It is Lower Case");
        } else if (Character.isUpperCase(c)) {
            System.out.println("It is Upper Case");
        }
    }
}
