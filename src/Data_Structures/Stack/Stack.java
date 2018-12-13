package Data_Structures.Stack;

public class Stack {
    private int maxSize;
    private long[] stackArray;
    private int top;

    public Stack(int size) {
        this.maxSize = size;
        this.stackArray = new long[maxSize];
        this.top = -1;                          // Pointer we will use to keep track of Stack
    }

    public void push (long item) {
        if (isFull()) {
            System.out.println("Stack is full");
        }
        else {
            stackArray[++top] = item;
        }
    }

    public long pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        else {
            return stackArray[top--];
        }
    }

    public long peak() {
        return stackArray[top];
    }

    private boolean isFull() {
        return top == maxSize - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }
}
