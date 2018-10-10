package Data_Structures.LinkedList;

public class Node {
    private int data;
    private Node nextNode;

    public Node () {

    }

    public Node(int data) {
        this.data = data;
        this.nextNode = null;
    }

    public int getData() {
        return this.data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNextNode() {
        return this.nextNode;
    }

}
