package Vegetables;

import java.util.Scanner;

public class MinimumVegetables {

    static int numberOfShops, numberOfQueries;
    static int[] numberOfVegetables, queries, answers;

    public static void main(String[] args) {

        // Taking Inputs

        Scanner input = new Scanner(System.in);
        int numberOfShops = input.nextInt();
        int[] numberOfVegetables = new int[numberOfShops];

        for (int i = 0; i < numberOfShops; i++) {
            numberOfVegetables[i] = input.nextInt();
        }

        int numberOfQueries = input.nextInt();
        queries = new int[numberOfQueries];
        answers = new int[numberOfQueries];

        for (int i = 0; i < numberOfQueries; i++) {
            queries[i] = input.nextInt();
        }

        // Logic Begins

        for ( int q = 0; q < queries.length; q++) {
            int bought;
            int toBuy = 1;
            int goal = queries[q];
            do {
                bought = 0;
                bought = buyVegetables(toBuy, goal);
                toBuy++;
            } while (bought == -2);
            answers[q] = bought;
        }

        for (int a : answers) {
            System.out.println(a);
        }
    }

    private static int buyVegetables(int toBuy, int goal) {
        int bought = 0;
        for (int i = 0; i < numberOfShops; i++) {
            if (toBuy >= numberOfVegetables[i]) {
                bought += numberOfVegetables[i];
            } else if (toBuy < numberOfVegetables[i]) {
                bought += toBuy;
            }
        }

        if (bought == goal) {
            return toBuy;
        } else if (bought > goal) {
            return -1;
        } else if (bought < goal) {
            return -2;
        }
        return bought;
    }
}
