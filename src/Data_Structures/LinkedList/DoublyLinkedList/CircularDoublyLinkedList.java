package Data_Structures.LinkedList.DoublyLinkedList;

class CircularDoublyLinkedList {
    private Node head;
    private Node rear;

    CircularDoublyLinkedList() {
    }

    boolean isEmpty() {
        return head == null;
    }

    void insertNode(int data) {                                     // Inserts at Rear position
        if (isEmpty()) {                                            // List is empty
            insertAtHead(data);
        } else {                                                    // List Not Empty
            insertAtRear(data);
        }
    }

    public void insertAtHead(int data) {
        Node newNode = new Node(data);
        head = newNode;
        rear = newNode;
        newNode.next = newNode;
        newNode.previous = newNode;
    }

    private void insertAtRear(int data) {
        Node newNode = new Node(data);
        rear.next.previous = newNode;
        newNode.next = rear.next;
        rear.next = newNode;
        newNode.previous = rear;

        rear = newNode;
    }

    void displayListForward() {
        Node current = head;
        do {
            System.out.print("(" + current.data + ") -> ");
            current = current.next;
        }
        while (current != head);
        System.out.println();
    }

    void displayListReverse() {
        Node current = rear;
        do {
            System.out.print("(" + current.data + ") <- ");
            current = current.previous;
        }
        while (current != rear);
        System.out.println();
    }

    int findNode(int keyData) {                                //Returns the position, -1 If not found
        Node current = head;
        int position = 0;
        do {
            if (current.data == keyData) {
                return position + 1;
            } else {
                position++;
                current = current.next;
            }
        }
        while (current != head);

        return -1;
    }

    boolean deleteNode(int keyData) {                       // Returns boolean status of delete operation
        Node current = head;
        do {
            if (current.data == keyData) {
                current.next.previous = current.previous;
                current.previous.next = current.next;
                return true;
            }
            current = current.next;
        }
        while (current != head);
        return false;
    }

}
