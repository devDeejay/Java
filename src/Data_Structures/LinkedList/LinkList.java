package Java.Data_Structures.LinkedList;

public class LinkList {
    Node currentNode;
    Node head;
    Node tail;

    public LinkList () {
        if (this.head == null) {
            this.head = new Node();
        }
    }
}
