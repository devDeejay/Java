package Java_Practice.MaxNumberOfUniqueElements;

import java.util.*;

public class test {
    public static void main(String[] args) {
        int count = 0;

        Scanner in = new Scanner(System.in);
        ArrayList list = new ArrayList();

        int n = in.nextInt();
        int m = in.nextInt();

        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }

        long startTime = System.currentTimeMillis();

        for (int i = 0; i <= n - m; i++) {

            int currentCount = 0;

            for (int j = i; j < (i + m); j++) {
                if (list.contains(array[j])) {
                    currentCount++;
                } else {
                    list.add(array[j]);
                }
            }

            if ((m - currentCount) > count) {
                count = (m - currentCount);
            }

            list.clear();
        }

        System.out.println(count);


        long endTime = System.currentTimeMillis();
        System.out.println((double)(endTime - startTime)/1000 + " seconds");
    }

}
