package Data_Structures.Tree.BinarySearchTree;

public class BinarySearchTreeMain {

    public static void main(String[] args) {

        BinarySearchTree binarySearchTree = new BinarySearchTree();
        Integer[] array = {25,36,26,38,12,18,19,20,21,6,5};
        binarySearchTree.insertAll(array);

        System.out.println(binarySearchTree.getHeight());
    }

}
