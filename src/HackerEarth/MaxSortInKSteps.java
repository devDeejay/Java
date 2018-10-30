package HackerEarth;

import sun.plugin2.message.JavaScriptCallMessage;

import java.util.Scanner;

public class MaxSortInKSteps {
    static Scanner input;
    static int array[];

    public static void main(String[] args) {
        input = new Scanner(System.in);
        int T = input.nextInt();

        for (int testCase = 0; testCase < T; testCase++) {
            runTheProgram();
        }

    }

    private static void runTheProgram() {
        int N = input.nextInt();
        int K = input.nextInt();

        array = new int[N];

        for (int i = 0; i < N - 2; i++) {
            if (array[i + 1] > array[i]) {
                swapElements(i);
            }
        }

        for (int a : array) {
            System.out.print(a + " ");
        }

    }

    private static void swapElements(int i) {
        if (i < array.length - 2) {
            int temp = array[i];
            array[i] = array[i + 1];
            array[i + 1] = temp;
        }
    }
}
