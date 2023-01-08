public class Stack1 {
    int size;
    int arr[];
    int top;

    Stack1(int size) {
        this.size = size;
        this.arr = new int[this.size];
        this.top = -1;
    }

    public Boolean isEmpty(int top) {
        if (top == -1) {
            return (true);
        } else {
            return (false);
        }
    }

    public boolean isFull(int top, int size) {
        if (top == size) {
            return (true);
        } else {
            return (false);
        }
    }

    public int top(int top) {
        if (isEmpty(top) == true) {
            System.out.println("Stack is Empty");
        } else {
            return arr[top];
        }
    }

}
