package Data_Structures.LinkedList.SingleLinkedList;

public class LinkedListApp {
    public static void main(String[] args) {
        CircularSingleLinkedList singleLinkedList = new CircularSingleLinkedList();
        singleLinkedList.insertNode(5);
        singleLinkedList.insertNode(6);
        singleLinkedList.insertNode(7);
        singleLinkedList.insertNode(8);
        singleLinkedList.insertNode(9);
        singleLinkedList.deleteNode(9);
        singleLinkedList.deleteNode(5);
        singleLinkedList.deleteNode(1);
/*        singleLinkedList.deleteNode(7);
        singleLinkedList.insertAtHead(1);
        singleLinkedList.insertAtHead(0);
        System.out.println(singleLinkedList.findNode(0));
        System.out.println(singleLinkedList.findNode(6));
        System.out.println(singleLinkedList.findNode(9));*/

        singleLinkedList.displayList();

    }
}
