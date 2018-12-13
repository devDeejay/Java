package Data_Structures.LinkedList.DoublyLinkedList;

public class CircularDoublyLinkedListApp {
    public static void main(String[] args) {
        CircularDoublyLinkedList doublyLinkedList = new CircularDoublyLinkedList();
        doublyLinkedList.insertNode(5);
        doublyLinkedList.insertNode(6);
        doublyLinkedList.insertNode(7);
        doublyLinkedList.insertNode(8);
        doublyLinkedList.insertNode(9);

        doublyLinkedList.deleteNode(9);
        doublyLinkedList.deleteNode(7);

        // doublyLinkedList.displayListReverse();
        doublyLinkedList.displayListForward();

    }
}
