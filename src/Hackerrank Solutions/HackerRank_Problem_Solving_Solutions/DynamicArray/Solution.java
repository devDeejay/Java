package DynamicArray;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

    // Complete the dynamicArray function below.
    static List<Integer> dynamicArray(int N, List<List<Integer>> queries) {

        List<Integer> sequence0 = new ArrayList<>();
        List<Integer> sequence1 = new ArrayList<>();
        List<Integer> returningList = new ArrayList<>();

        int lastAnswer = 0;

        int a = 223246407;

        for (List<Integer> query : queries) {
            int queryType = query.get(0);
            int x = query.get(1);
            int y = query.get(2);

            int sequenceNumber = ((x ^ lastAnswer) % N);

            switch (queryType) {
                case 1:
                    if (sequenceNumber == 0) {
                        sequence0.add(y);
                    } else if (sequenceNumber == 1) {
                        sequence1.add(y);
                    }
                    break;

                case 2:
                    int newLastAns = 0;
                    int index = y % sequence0.size();
                    if (sequenceNumber == 0) {
                        newLastAns = sequence0.get(index);
                    } else if (sequenceNumber == 1) {
                        newLastAns = sequence1.get(index);
                    }
                    lastAnswer = newLastAns;
                    returningList.add(lastAnswer);
                    break;
            }
        }
        return returningList;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nq = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(nq[0]);

        int q = Integer.parseInt(nq[1]);

        List<List<Integer>> queries = new ArrayList<>();

        for (int i = 0; i < q; i++) {
            String[] queriesRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> queriesRowItems = new ArrayList<>();

            for (int j = 0; j < 3; j++) {
                int queriesItem = Integer.parseInt(queriesRowTempItems[j]);
                queriesRowItems.add(queriesItem);
            }

            queries.add(queriesRowItems);
        }

        List<Integer> result = dynamicArray(n, queries);

        for (int i = 0; i < result.size(); i++) {
            bufferedWriter.write(String.valueOf(result.get(i)));

            if (i != result.size() - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
