package Java_Practice.BufferedReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class KMaxSum {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int k = input.nextInt();

        int[] A = new int[n];
        int[] B = new int[n];

        for (int i = 0; i < n; i++) {
            A[i] = input.nextInt();
        }

        for (int i = 0; i < n; i++) {
            B[i] = input.nextInt();
        }

        Arrays.sort(A);
        Arrays.sort(B);

        reverseArray(A);
        reverseArray(B);

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                list.add(A[i] + B[j]);
            }
        }

        Collections.sort(list);

        int[] C = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            C[i] = list.get(list.size() - 1 - i);
        }

        for (int i = 0; i < k; i++) {
            System.out.print(C[i] + " ");
        }

    }

    static int[] reverseArray(int[] a) {
        int r[] = new int[a.length];
        int i = 0;
        int j = a.length - 1;
        for (i = 0, j = a.length - 1; i < j; i++, j--) {

            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;

        }

        return a;
    }


}
