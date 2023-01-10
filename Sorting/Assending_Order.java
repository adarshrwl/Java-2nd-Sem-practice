
class Sorting {
    void me1(int[] a) {
        int temp;
        int len = a.length;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len - 1; j++) {
                if (a[i] < a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for (int i = 0; i < len; i++) {
            System.out.println(a[i]);
        }
    }

}

public class Assending_Order {
    public static void main(String[] args) {
        Sorting sc = new Sorting();
        int[] a = { 1, 2, 4325, 53, 21 };
        sc.me1(a);
    }
}
