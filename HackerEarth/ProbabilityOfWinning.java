package HackerEarth;

import java.math.BigDecimal;
import java.util.Scanner;

public class ProbabilityOfWinning {
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        int T = input.nextInt();

        for (int testCase = 0; testCase < T; testCase++) {
            int S = input.nextInt();
            int N = input.nextInt();
            int M = input.nextInt();
            int K = input.nextInt();

            double probability = 0;

            if (M <= N) {
                probability = 1;
            } else {
                probability = calculateProbability(S, N, M, K);
            }

            System.out.println(truncateDecimal(probability, 6));
        }

    }

    private static double calculateProbability(int s, int n, int m, int k) {
        return calculateCombination(m, k) / calculateCombination(s, n);
    }

    private static double calculateCombination(int n, int r) {
        long numerator = 1, denominator = 1;
        if (r > n - r) {
            r = n - r;
        }
        for (long i = 1L; i <= r; ++i) {
            denominator *= i;
        }
        for (long i = n - r + 1L; i <= n; ++i) {
            numerator *= i;
        }

        if (denominator != 0) {
            return numerator / denominator;
        }

        return 0;

    }

    private static BigDecimal truncateDecimal(double x, int numberOfDecimals) {
        if (x > 0) {
            return new BigDecimal(String.valueOf(x)).setScale(numberOfDecimals, BigDecimal.ROUND_CEILING);
        } else {
            return new BigDecimal(String.valueOf(x)).setScale(numberOfDecimals, BigDecimal.ROUND_CEILING);
        }
    }
}
