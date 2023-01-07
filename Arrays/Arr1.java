//Creating an array

public class Arr1 {
    public static void main(String[] args) {
        int myArray[];// Declearing an array
        myArray = new int[5];// Memory allocation for an array
        // 1st method of creating an arry

        // 2nd method of creating an array
        int myArray1[] = new int[5];

        // 3rd Method
        int myArray3[] = { 1, 2, 3, 4, 5, 6, 7, 8, 0 };
        for (int i = 0; i < 10; i++) {
            System.out.println(myArray3[i]);
        }
    }
}
