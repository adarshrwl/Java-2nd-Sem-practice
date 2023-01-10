public class Descending {

    void desc(int[] a) {
        int len = a.length;
        int temp;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len - 1; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public static void main(String[] args) {
        Descending d = new Descending();
        int[] arr = { 1, 34, 1431, 12, 21 };
        d.desc(arr);
    }
}
