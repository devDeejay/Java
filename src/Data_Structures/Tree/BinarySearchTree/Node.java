package Data_Structures.Tree.BinarySearchTree;

public class Node {
    private Node leftChild;
    private Node rightChild;
    private Integer data;

    public Node(Integer data) {
        this.data = data;
    }

    Node getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    Node getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node newRightChild) {
        this.rightChild = newRightChild;
    }

    Integer getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public boolean hasRightChild() {
        return this.getRightChild() != null;
    }

    public boolean hasLeftChild() {
        return this.getLeftChild() != null;
    }
}
