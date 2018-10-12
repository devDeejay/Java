package Java_Helper_Codes.CalculateCombination;

import java.util.Scanner;

public class Combination_Long {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();

        long start = System.currentTimeMillis();
        System.out.println(combination(a, b));
        long end = System.currentTimeMillis();

        System.out.println("Time Taken : " + (end - start) / 1000 + " seconds");
    }

    private static long combination(int n, int r) {

        int max;

        if ((n - r) >= r) {
            max = n - r;
            return (calculateNumerator(n, max) / (factorial(r)));

        } else {
            max = r;
            return (calculateNumerator(n, max) / (factorial(n - r)));
        }

    }

    private static long calculateNumerator(int n, int max) {
        long ans = 1;
        for (int i = n; i > max; i--) {
            ans = ans * i;
        }
        return ans;
    }

    private static long factorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            long factorial = 1;
            for (int i = 1; i <= n; i++) {
                factorial = factorial * i;
            }
            return factorial;
        }
    }
}
