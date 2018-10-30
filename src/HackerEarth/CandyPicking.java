package HackerEarth;

import java.math.BigInteger;
import java.util.Scanner;

public class CandyPicking {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int N = input.nextInt();

        BigInteger answer = new BigInteger("0");

        for (int i = N - 1; i > 1; i--) {

            answer = answer.add(combination(i, 2));

        }

        System.out.println(answer.multiply(new BigInteger("2")));

    }

    private static BigInteger combination(int n, int r) {

        return (factorial(n).divide((factorial(n - r)).multiply(factorial(r))));

    }

    private static BigInteger factorial(int n) {
        if (n <= 1) {
            return new BigInteger("1");
        } else {
            BigInteger factorial = new BigInteger("1");
            for (int i = 1; i <= n; i++) {
                factorial = factorial.multiply(new BigInteger(i + ""));
            }
            return factorial;
        }
    }

}
