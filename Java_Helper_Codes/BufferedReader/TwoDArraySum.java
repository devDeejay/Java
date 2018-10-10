package Java_Practice.BufferedReader;

import java.io.IOException;
import java.util.Scanner;

public class TwoDArraySum {

    static int N, M;

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        N = input.nextInt();
        M = input.nextInt();

        int[][] array = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {

                array[i][j] = input.nextInt();

                calculateSumOfArray(array, i, j);
            }
        }
    }

    private static int calculateSumOfArray(int[][] array, int a, int b) {
        int sum = 0;
        int j = b;
        for (int i = a; i < N - a; i++) {
            sum += array[a][j];
        }

        return sum;
    }
}