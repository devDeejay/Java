package HackerEarth.NormalizingImages;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] array1 = new int[size];
        int[] array2 = new int[size];

        // Taking input size of the array from the user
        // Randomly populating the two arrays with values between 0 to 255 ( This takes time)
        // Averaging and Normalising the arrays

        // This takes time
        populateArraysWithRandomValues(array1, array2);
        System.out.println("Data ready for execution");

        // Printing the Randomly Populated Arrays
        System.out.println("Image Arrays:");
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));

        // Averaging the arrays
        averageArrays(array1, array2);

        System.out.println("Averaged Arrays: ");
        System.out.println(Arrays.toString(array1));
        array2 = null; // Don't need array2 anymore

        // Normalise the averaged Array
        normaliseArray(array1);

        // All done, Print the output
        System.out.println("Answer:");
        System.out.println(Arrays.toString(array1));
        System.out.println("Execution done");
    }

    // Populate the 2 Arrays with random data between 0-255
    private static void populateArraysWithRandomValues(int[] array1, int[] array2) {
        Random random = new Random();
        for (int i = 0; i < array1.length; i++) {
            array1[i] = random.nextInt(255);
            array2[i] = random.nextInt(255);
        }
    }

    // Average the array method
    private static int[] averageArrays(int[] array1, int[] array2) {
        for (int i = 0; i < array1.length; i++) {
            array1[i] = (array1[i] + array2[i]) / 2;
        }
        return array1;
    }

    // Normalise Array
    private static int[] normaliseArray(int[] array) {
        int max = findMax(array);
        for (int i = 0; i < array.length; i++) {
            array[i] = normaliseValue(array[i], max);
        }
        return array;
    }

    // Normalize Each Value with respect to Max
    private static int normaliseValue(int i, int max) {
        return (255 * i) / max;
    }

    // Find Max Amongst the array
    private static int findMax(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int n : array) {
            if (n > max) max = n;
        }
        return max;
    }
}
