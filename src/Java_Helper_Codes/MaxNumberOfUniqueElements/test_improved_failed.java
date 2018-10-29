package Java_Practice.MaxNumberOfUniqueElements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class test_improved_failed {
    public static void main(String[] args) {

        int count = 0;

        Scanner in = new Scanner(System.in);
        ArrayList<Integer> listStart = new ArrayList();
        ArrayList listEnd = new ArrayList();

        int n = in.nextInt();
        int m = in.nextInt();

        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }

        long startTime = System.currentTimeMillis();

        int startCount = 0;
        int endCount = 0;

        for (int i = 0; i < n / 2 - 1; i++) {
            for (int j = i, k = n - i - 1; (j < i + m) && (k >= n - i - m); j++, k--) {

                if (listStart.contains(array[j])) {
                    startCount++;
                } else {
                    listStart.add(array[j]);
                }

                if (listStart.contains(array[k])) {
                    endCount++;
                } else {
                    listStart.add(array[k]);
                }
            }

            if ((m - startCount) > count) {
                count = (m - startCount);
            }

            if ((m - endCount) > count) {
                count = (m - endCount);
            }

            listStart.clear();
            listEnd.clear();

        }

        System.out.println(count);
        long endTime = System.currentTimeMillis();
        System.out.println((double) (endTime - startTime) / 1000 + " seconds");
    }
}
