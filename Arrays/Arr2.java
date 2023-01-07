//Storing Data in Arrays
public class Arr2 {
    public static void main(String[] args) {
        int[] array = new int[5];
        array[0] = 000;
        array[1] = 100;
        array[2] = 200;
        array[3] = 300;
        array[4] = 400;
        // Multiple data passed will overwrite the data
        array[0] = 001;
        array[1] = 002;
        array[2] = 004;
        array[3] = 003;
        for (int i = 0; i < 5; i++) {
            System.out.println(array[i]);
        }
    }
}
