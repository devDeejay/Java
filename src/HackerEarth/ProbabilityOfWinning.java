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
        return calculateFactorial(n) / ( (calculateFactorial(n - r)) * (calculateFactorial(r)));
    }

    private static double calculateFactorial(int n) {
        if (n == 0) {
            return 1;
        }
        else {
            int factorial = 1;
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }
            return factorial;
        }
    }

    private static BigDecimal truncateDecimal(double x, int numberOfDecimals) {
        if (x > 0) {
            return new BigDecimal(String.valueOf(x)).setScale(numberOfDecimals, BigDecimal.ROUND_CEILING);
        } else {
            return new BigDecimal(String.valueOf(x)).setScale(numberOfDecimals, BigDecimal.ROUND_CEILING);
        }
    }
}
