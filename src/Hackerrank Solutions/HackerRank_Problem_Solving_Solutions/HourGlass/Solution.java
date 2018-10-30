package HourGlass;

import java.io.*;
import java.util.*;

public class Solution {

    // Complete the maxHourglassSum function below.
    static int maxHourglassSum(int[][] arr) {

        int max = -999999999;
        int i, j;
        for (i = 1; i <= arr.length - 2; i++) {
            for (j = 1; j <= arr.length - 2; j++) {

                int sum = findSum(arr, i, j);
                if (sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = maxHourglassSum(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }

    private static int findSum(int[][] arr, int i, int j) {
        return (arr[i - 1][j - 1] + arr[i - 1][j] + arr[i - 1][j + 1]
                + arr[i][j]
                + arr[i + 1][j - 1] + arr[i + 1][j] + arr[i + 1][j + 1]);
    }
}

