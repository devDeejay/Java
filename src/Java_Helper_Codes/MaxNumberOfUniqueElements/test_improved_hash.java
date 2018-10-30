package Java_Practice.MaxNumberOfUniqueElements;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class test_improved_hash {
    public static void main(String[] args) {
        int count = 0;

        Scanner in = new Scanner(System.in);
        HashSet<Integer> hashSet = new HashSet<>();

        int n = in.nextInt();
        int m = in.nextInt();

        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }

        long startTime = System.currentTimeMillis();

        for (int i = 0; i <= n - m; i++) {

            for (int j = i; j < (i + m); j++) {
                hashSet.add(array[j]);

                System.out.println(".");
            }

            int uniqueElements = hashSet.size();

            if (uniqueElements > count) {
                count = uniqueElements;
            }

            hashSet.clear();
            System.out.println("*");
        }

        System.out.println(count);

        long endTime = System.currentTimeMillis();
        System.out.println((double)(endTime - startTime)/1000 + " seconds");
    }
}
