package Data_Structures.Queue;

public class QueueApp {

    public static void main(String[] args) {
        Queue queue = new Queue(4);
        queue.insert(4);
        queue.insert(3);
        queue.insert(2);
        queue.insert(1);
        queue.insert(5);
        queue.insert(6);
        queue.insert(7);
        queue.insert(4);
        queue.insert(3);
        queue.insert(2);
        queue.insert(1);
        queue.view();


    }

}
