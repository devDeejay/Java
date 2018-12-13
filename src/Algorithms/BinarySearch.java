package Algorithms;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        System.out.println(binarySearchElement(array, 8));
    }

    private static int binarySearchElement(int[] array, int i) {
        int start = 0, end = array.length - 1;
        return binarySearchItem(array, start, end, i);
    }

    private static int binarySearchItem(int[] array, int start, int end, int key) {
        int mid = (start + end) / 2;
        if (array[mid] == key) {
            return key;
        } else {
            if (start == end) {
                return -1;
            }else if (key < array[mid]) {
                return binarySearchItem(array, start, mid, key);
            } else if (key > array[mid]){
                return binarySearchItem(array, mid + 1, end, key);
            }
            else {
                return -1;
            }
        }
    }
}
