public class StackTrying {
    int size;
    int arr[];
    int top;

    StackTrying(int size) {
        this.size = size;
        this.arr = new int[this.size];
        this.top = -1;
    }

    public boolean isEmpty() {
        if (top == -1) {
            System.out.println("Stack is Empty");
            return (true);
        } else {
            System.out.println("Stack is not Empty");
            return (false);
        }
    }

    public boolean isFull() {
        if (top == size - 1) {
            System.out.println("Stack is Full");
            return (true);
        } else {
            System.out.println("Stack is not Full");
            return (false);
        }
    }

    public int peek() {
        if (isEmpty() == true) {
            return -1;
        } else {
            System.out.println("Your top value is " + arr[top]);
            return (arr[top]);
        }
    }

    public int pop() {
        if (isEmpty() == true) {
            return -1;
        } else {
            top--;
            System.out.println("Your poped item is " + arr[top + 1]);
            return (arr[top + 1]);
        }

    }

    public void push(int val) {
        if (isFull() != true) {
            System.out.println("Pushed item:" + val);
            top++;
            arr[top] = val;
        }
    }

    public static void main(String[] args) {
        StackTrying st = new StackTrying(5);
        st.pop();
        st.peek();
        st.isEmpty();
        st.isFull();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(04);
        st.push(50);
        st.push(06);
        st.push(06);

    }
}
