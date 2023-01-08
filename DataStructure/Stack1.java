public class Stack1 {
    int size;
    int arr[];
    int top;

    Stack1(int size) {
        this.size = size;
        this.arr = new int[this.size];
        this.top = -1;
    }

    public Boolean isEmpty() {
        if (top == -1) {
            return (true);
        } else {
            return (false);
        }
    }

    public boolean isFull() {
        if (top == size - 1) {
            return (true);
        } else {
            return (false);
        }
    }

    public int pop() {
        if (isEmpty() == true) {
            System.out.println("It is Empty");
            return -1;
        } else {
            System.out.println("Poped Item :" + arr[top]);
            top--;
            return arr[top + 1];
        }
    }

    public int peek() {
        if (isEmpty() == true) {
            System.out.println("Stack is Empty");
            return -1;
        } else {
            System.out.println(arr[top]);
            return (arr[top]);
        }
    }

    public void push(int val) {
        if (isFull() == true) {
            System.out.println("Stack is Full");
        } else {
            top++;
            arr[top] = val;
            System.out.println("Number is added to the stack :" + arr[top]);
        }
    }

    public static void main(String[] args) {
        Stack1 s = new Stack1(4);
        s.isEmpty();
        s.isFull();
        s.pop();
        s.push(10);
        s.peek();
        s.pop();
        s.push(20);
        s.push(30);
        s.push(3);
        s.push(34);
        s.push(321);

        s.peek();
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        s.pop();
    }
}
