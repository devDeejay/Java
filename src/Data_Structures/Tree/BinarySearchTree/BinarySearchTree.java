package Data_Structures.Tree.BinarySearchTree;

public class BinarySearchTree {
    private Node root = null;
    private int height;
    private int maxHeight;

    BinarySearchTree() {
        root = null;
    }

    public Node find(int keyData) {
        Node current = root;
        while (current.getData() != keyData) {
            if (keyData < current.getData()) {
                // We need to traverse the Left sub tree
                current = current.getLeftChild();
            } else {
                // We need to traverse the Right sub tree
                current = current.getRightChild();
            }

            if (current == null) {
                // Checking if we are pointing to null now, that means data is not in the tree
                return null;
                // Else we will continue the above iteration
            }
        }
        // The loop will break when our keydata is found in the current node and hence we can return it
        return current;
    }

    public void insertAll(Integer[] array) {
        for (Integer i : array) {
            insert(i);
            System.out.println("Inserted " + i + " successfully");
        }
    }

    public void insert(Integer data) {
        Node newNode = new Node(data);

        if (root == null) {                                     // Simplest case
            root = newNode;                                     // Just set the root node as new node
        } else {
            Node current = root;                                // Two references are required, current may go to null hence we will use the parent
            Node parent;

            while (true) {
                parent = current;
                if (current.getData() == data) {                // We don't have to insert this node as this data already exists
                    return;
                } else {
                    if (data > current.getData()) {             // Insert in Right Subtree ?
                        current = current.getRightChild();
                        if (current == null) {                  // If there is no right child
                            parent.setRightChild(newNode);          // Insert here
                            return;                                    // Else, current is updated to rightChild
                        }
                    } else {                                    // Insert in Left subtree ?
                        current = current.getLeftChild();
                        if (current == null) {                  // If there is no left child
                            parent.setLeftChild(newNode);           // Insert here
                            return;                                    // Else, current is updated to leftChild
                        }
                    }
                }
            } // End of while loop
        }
    }

    public Node getSecondLargestElement() {

        // We need to return the second last element
        // If we keep traversing the Right Sub Tree it will lead us to the maximum element

        Node current = root;
        Node secondLargest = null;

        while (current.hasRightChild()) {   // If it has a right child, it's not the largest.
            secondLargest = current;
            current = current.getRightChild();
        }

        return secondLargest;
    }

    public void printInOrderTraversal() {
        InOrderTraversal(root);
    }

    public void printPostOrderTraversal() {
        PostOrderTraversal(root);
    }

    public void printPreOrderTraversal() {
        PreOrderTraversal(root);
    }

    private void InOrderTraversal(Node localRoot) {
        if (localRoot != null) {
            InOrderTraversal(localRoot.getLeftChild());
            System.out.print(localRoot.getData() + " ");
            InOrderTraversal(localRoot.getRightChild());
        }
        System.out.println();
    }

    private void PreOrderTraversal(Node localRoot) {
        if (localRoot != null) {
            System.out.print(localRoot.getData() + " ");
            PreOrderTraversal(localRoot.getLeftChild());
            PreOrderTraversal(localRoot.getRightChild());
        }
        System.out.println();
    }

    private void PostOrderTraversal(Node localRoot) {
        if (localRoot != null) {
            PostOrderTraversal(localRoot.getLeftChild());
            PostOrderTraversal(localRoot.getRightChild());
            System.out.print(localRoot.getData() + " ");
        }
        System.out.println();
    }

    public void heightOfBinaryTree(Node localRoot) {
        if (localRoot != null) {
            increaseTheHeight();    // Before going for LeftChild, lets increase the height by 1
            heightOfBinaryTree(localRoot.getLeftChild());
            decreaseHeight();       // The height will be decreased by 1 as it has hit the null child and came back so increased height must be compensated by 1
            increaseTheHeight();    // Now, going for Right Subtree hence increase height by 1
            heightOfBinaryTree(localRoot.getRightChild());
            decreaseHeight();       // Came back since we hit right null child hence returned
        }
    }

    private int decreaseHeight() {
        return height--;
    }

    private void increaseTheHeight() {
        height++;
        if (height > maxHeight) {
            maxHeight = height;
        }
    }

    public int getHeight() {
        heightOfBinaryTree(root);
        return maxHeight;
    }
}
