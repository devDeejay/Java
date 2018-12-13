package My_Java_Tutorials.Java_Parallel_Programming.ForkJoinTask_LargeArrayCreation;

import java.util.Arrays;

public class LargeArrayCreator {
    public static void main(String[] args) {
        Creator creator = new Creator(0,10);
        creator.compute();
        System.out.println(Arrays.toString(creator.getCreatedArray()));
    }
}