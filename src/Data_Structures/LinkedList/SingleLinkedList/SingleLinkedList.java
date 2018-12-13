package Data_Structures.LinkedList.SingleLinkedList;

class SingleLinkedList {
    private Node head;

    SingleLinkedList() {
    }

    boolean isEmpty() {
        return head == null;
    }

    void insertNode(int data) {                              // Inserts at Rear position
        if (isEmpty()) {                                            // List is empty
            Node firstNode = new Node(data);
            head = firstNode;
            firstNode.next = null;
        } else {                                                    // List Not Empty
            Node newNode = new Node(data);
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    void displayList() {
        Node current = head;
        while (current != null) {
            System.out.print("(" + current.data + ") -> ");
            current = current.next;
        }
        System.out.print("null");
        System.out.println();
    }

    int findNode(int keyData) {                                //Returns the position, -1 If not found
        Node current = head;
        int position = 0;
        while (current != null) {
            if (current.data == keyData) {
                return position + 1;
            } else {
                position++;
                current = current.next;
            }
        }
        return -1;
    }

    boolean deleteNode(int keyData) {                 // Returns boolean status of delete operation
        Node current = head;
        Node parent;
        if (current != null && current.data == keyData) {
            head = current.next;
            return true;
        } else
            while (current != null) {
                parent = current;
                current = current.next;
                if (current.data == keyData) {
                    parent.next = current.next;
                    return true;
                }
            }
        return false;
    }

    public void insertAtHead(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

}
