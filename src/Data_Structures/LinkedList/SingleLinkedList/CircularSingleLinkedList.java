package Data_Structures.LinkedList.SingleLinkedList;

class CircularSingleLinkedList {
    private Node head;
    private Node rear;

    CircularSingleLinkedList() {
    }

    boolean isEmpty() {
        return head == null;
    }

    void insertNode(int data) {                              // Inserts at Rear position
        if (isEmpty()) {                                            // List is empty
            Node firstNode = new Node(data);
            head = firstNode;
            rear = firstNode;
            firstNode.next = null;
            rear.next = head;
        } else {                                                    // List Not Empty
            Node newNode = new Node(data);
            rear.next = newNode;
            newNode.next = head;
            rear = newNode;
        }
    }

    void displayList() {
        Node current = head;
        do {
            System.out.print("(" + current.data + ") -> ");
            current = current.next;
        }
        while (current != head);

        System.out.print("...repeated");
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
        Node parent;
        if (current != null && current.data == keyData) {   // Logic for removal at Head
            head = current.next;
            return true;
        } else
            do {
                parent = current;
                current = current.next;
                if (current.data == keyData) {
                    parent.next = current.next;
                    return true;
                }
            }
            while (current != head);

        return false;
    }

    public void insertAtHead(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

}
