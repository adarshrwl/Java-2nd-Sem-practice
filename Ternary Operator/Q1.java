/*
Rewrite the following statements using ternary operator.
if(ch== “C”)
value = 200;
else
value =100; 
*/

public class Q1 {
    public static void main(String[] args) {
        char ch = 'a';
        int value = (ch > 'c') ? 200 : 100;
        System.out.println(value);
    }
}
