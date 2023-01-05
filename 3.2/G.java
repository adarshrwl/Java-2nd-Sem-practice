//7. Write a JAVA program to check whether a character is alphabet or not.

public class G {
    public static void main(String[] args) {
        char ch = 'a';
        if (Character.isLetter(ch)) {
            System.out.println("It is a character");
        } else {
            System.out.println("It is not a character");
        }
    }
}
