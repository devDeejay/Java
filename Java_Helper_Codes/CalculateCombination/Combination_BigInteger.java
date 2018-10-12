package Java_Helper_Codes.CalculateCombination;

import java.math.BigInteger;
import java.util.Scanner;

public class Combination_BigInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        BigInteger a = new BigInteger(input.next());
        BigInteger b = new BigInteger(input.next());

        long start = System.currentTimeMillis();
        System.out.println(combination(a, b));
        long end = System.currentTimeMillis();

        System.out.println("Time Taken : " + (end - start) / 1000 + " seconds");
    }

    private static BigInteger combination(BigInteger n, BigInteger r) {

        BigInteger temp = n.subtract(r);
        int a = temp.compareTo(r);
        BigInteger bigger, denominator;

        if (a >= 0) {
            //n-r is greater
            bigger = temp;
            denominator = factorial(r);
        } else {
            bigger = r;
            denominator = factorial(temp);
        }

        BigInteger numerator = calculateNumerator(n, bigger);

        return numerator.divide(denominator);

    }

    private static BigInteger calculateNumerator(BigInteger n, BigInteger max) {
        BigInteger ans = new BigInteger("1");

        while (true) {
            ans = ans.multiply(n);
            n = n.subtract(new BigInteger("1"));
            if (n.compareTo(max) == 0) {
                break;
            }

        }

        return ans;
    }

    private static BigInteger factorial(BigInteger n) {
        BigInteger one = new BigInteger("1");
        if (n.compareTo(one) == 0 || n.compareTo(one) < 0) {
            return one;
        } else {
            BigInteger factorial = one;
            while (n.compareTo(one) != 0) {
                factorial = factorial.multiply(n);
                n = n.subtract(one);
            }
            return factorial;
        }
    }
}
