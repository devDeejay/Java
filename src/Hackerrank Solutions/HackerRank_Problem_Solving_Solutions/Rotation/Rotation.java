package Hackerreank_Problem_Solving.Rotation;

import java.util.ArrayList;
import java.util.Scanner;

public class Rotation {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int n, temp, d;
        n = input.nextInt();
        d = input.nextInt();

        int array[] = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = input.nextInt();
        }

        array = rotate(array, d);

        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    private static int[] rotate(int[] array, int d) {

        ArrayList<Integer> list = new ArrayList<>();

        int[] rotatedArray = new int[array.length];

        for (int i = d; i < array.length; i++) {
            list.add(array[i]);
        }
        for (int i = 0; i < d; i++) {
            list.add(array[i]);
        }

        for (int i = 0; i < list.size(); i++) {
            rotatedArray[i] = list.get(i);
        }

        return rotatedArray;
    }

}
