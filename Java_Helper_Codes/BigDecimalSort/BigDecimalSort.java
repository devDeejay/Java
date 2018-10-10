package Java_Practice.BigDecimalSort;

import java.math.BigDecimal;
import java.util.*;

class Solution {

    public static void main(String[] args) {
        //Input

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n + 2];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }

        //Code To Write

        BigDecimal[] decimalArray = new BigDecimal[n];
        for (int i = 0; i < n; i++) {
            decimalArray[i] = new BigDecimal(s[i]);
        }

        Arrays.sort(decimalArray);

        for (int i = 0; i < n; i++) {
            int index = s.length - 1 - i - 2;
            s[index] = decimalArray[i].toString();
        }
        // End of Writing Part

        sc.close();

        //Output
        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }

}