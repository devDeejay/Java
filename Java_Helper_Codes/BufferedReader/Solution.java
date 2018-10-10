package Java_Practice.BufferedReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bufferedReader.readLine());

        printIfPrime(num);

    }

    private static int printIfPrime(int a) {
        if (a % 2 != 0) {

            for (int i = 3; i <= Math.sqrt(a); i += 2) {
                if (a % i == 0) {
                    return 0;
                }
                else continue;
            }
            System.out.println(a);
            return 0;

        }
        else {
            return 0;
        }
    }

}
