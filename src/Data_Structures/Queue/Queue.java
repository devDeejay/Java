package Data_Structures.Queue;

public class Queue {
    private int maxSize;
    private long[] queArray;
    private int front;
    private int rear;
    private int numberOfItems;

    public Queue(int size) {
        this.maxSize = size;
        this.queArray = new long[size];
        front = 0;
        rear = -1;
        numberOfItems = 0;
    }

    public void insert(long newItem) {
        if (rear == maxSize - 1) {
           remove();
           rear = -1;
        }

        if (rear > 0 && rear <= front) {
            queArray[++rear] = newItem;
        } else {
            queArray[++rear] = newItem;
            numberOfItems++;
        }
    }

    public long remove() {
        if (!isEmpty()) {
            numberOfItems--;
            return queArray[front++];
        } else return -1;
    }

    public long peekFront() {
        return queArray[front];
    }

    public boolean isEmpty() {
        return (front > rear);
    }

    public boolean isFull() {
        return (numberOfItems == maxSize);
    }

    public void view() {
        System.out.print("[ ");
        for (int i = 0; i < queArray.length; i++) {
            System.out.print(queArray[i] + " ");
        }
        System.out.print("]");
    }

    public void size(){
        System.out.println(numberOfItems);
    }
}
