package My_Java_Tutorials.Java_Parallel_Programming.ForkJoinTask_LargeArrayCreation;

import java.util.Random;
import java.util.concurrent.RecursiveTask;

public class Creator extends RecursiveTask<Boolean> {

    private final int start;
    private final int end;
    private int size;
    private int[] array;

    Creator(int start, int end) {
        this.start = start;
        this.end = end;
        array = new int[end - start];
    }

    int[] getCreatedArray() {
        return array;
    }

    int[] createArray() {
        if (array == null) {
            array = new int[end - start];
            return array;
        }
        else {
            return array;
        }
    }

    @Override
    protected Boolean compute() {
        size = end - start;
        if (size <= 5) {
            Random random = new Random();
            for (int i = start; i < end; i++) {             // Filling up from start index to end index
                array[i] = random.nextInt(100);
            }
            return true;
        }
        else {                                                  // If array size > 10_000
            int halfIndex = ( size / 2  );
            Creator firstHalf = new Creator(start, halfIndex);
            firstHalf.fork();
            int secondIndex = halfIndex + 1;
            Creator secondHalf = new Creator(secondIndex, end - 1);
            secondHalf.fork();

            firstHalf.join();                                // Wait for first half to complete
            secondHalf.join();                               // Wait for second half to complete

            return true;
        }
    }
}
