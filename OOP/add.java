class num {
    public int addnumbers(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public int subtractnumbers(int a, int b) {
        int diff = a - b;
        return diff;
    }

    public int product(int a, int b) {
        int product = a * b;
        return product;
    }
}

public class add {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        num n = new num();
        int total = n.addnumbers(a, b);
        System.out.println("Sum is " + total);
        int diff = n.subtractnumbers(a, b);
        System.out.println("Difference of the number is " + diff);
        int product = n.product(a, b);
        System.out.println("Product of the number is " + product);
    }
}
